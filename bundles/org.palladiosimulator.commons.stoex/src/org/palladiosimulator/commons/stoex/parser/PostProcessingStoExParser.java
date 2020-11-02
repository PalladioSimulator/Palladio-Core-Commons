package org.palladiosimulator.commons.stoex.parser;

import java.io.Reader;
import java.util.ArrayList;
import java.util.ServiceLoader;

import org.antlr.runtime.CharStream;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.parser.IParseResult;
import org.palladiosimulator.commons.eclipseutils.ExtensionHelper;
import org.palladiosimulator.commons.stoex.parser.antlr.StoexParser;

/**
 * Customized version of {@link StoexParser} that allows post processing parsing results.
 * 
 * Post processors have to be registered via the extension point {@link #EP_ID} and via a
 * {@link ServiceLoader} definition to ensure that they can be discovered inside the Eclipse OSGi
 * environment and in standalone mode.
 * 
 * @see ParseResultPostProcessor
 */
public class PostProcessingStoExParser extends StoexParser {

    private static final String EP_ID = "org.palladiosimulator.commons.stoex.parseresultpostprocessor";
    private static final String EP_ATTR_ID = "class";
    private final Iterable<ParseResultPostProcessor> postProcessors;

    /**
     * Constructs the parser.
     */
    public PostProcessingStoExParser() {
        super();
        postProcessors = findPostProcessors();
    }

    /**
     * Finds all {@link ParseResultPostProcessor} instances via extension point in Eclipse OSGi
     * environments and via {@link ServiceLoader} in standalone environments.
     * 
     * @return The identified processors.
     */
    protected Iterable<ParseResultPostProcessor> findPostProcessors() {
        if (Platform.isRunning()) {
            return ExtensionHelper.getExecutableExtensions(EP_ID, EP_ATTR_ID);
        }
        var result = new ArrayList<ParseResultPostProcessor>();
        var processors = ServiceLoader.load(ParseResultPostProcessor.class);
        for (var processor : processors) {
            result.add(processor);
        }
        return result;
    }

    /**
     * Post processes the given parse result. The yielded result can be another instance than the
     * initial result.
     * 
     * @param result
     *            The result to process.
     * @return The processed result.
     */
    protected IParseResult postProcess(IParseResult result) {
        var lastResult = result;
        for (var postProcessor : postProcessors) {
            lastResult = postProcessor.postProcess(lastResult);
        }
        return lastResult;
    }

    @Override
    public IParseResult doParse(Reader reader) {
        return postProcess(super.doParse(reader));
    }

    @Override
    public IParseResult doParse(CharSequence sequence) {
        return postProcess(super.doParse(sequence));
    }

    @Override
    protected IParseResult parse(String ruleName, CharStream in) {
        return postProcess(super.parse(ruleName, in));
    }

    @Override
    public IParseResult parse(ParserRule rule, Reader reader) {
        return postProcess(super.parse(rule, reader));
    }

    @Override
    public IParseResult parse(RuleCall ruleCall, Reader reader, int initialLookAhead) {
        return postProcess(super.parse(ruleCall, reader, initialLookAhead));
    }

}
