package org.palladiosimulator.commons.stoex.api.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.IParseResult;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.palladiosimulator.commons.stoex.api.StoExParser;
import org.palladiosimulator.commons.stoex.parser.antlr.StoexParser;

import de.uka.ipd.sdq.stoex.Expression;

/**
 * Wrapper for the Xtext StoEx parser.
 */
@Component
public class StoExParserImpl implements StoExParser {

    private StoexParser parser;

    /**
     * Initializes the instance by the tool provider.
     * 
     * After a call to this method, the implementation is assumed to be fully initialized.
     * 
     * @param toolProvider
     *            The tool provider.
     */
    @Reference
    public void init(StoExToolProvider toolProvider) {
        this.parser = toolProvider.getParser();
    }

    @Override
    public Expression parse(String serializedStoEx) throws SyntaxErrorException {
        IParseResult result = parser.doParse(serializedStoEx);
        assertNoSyntaxErrorException(result);
        return (Expression) result.getRootASTElement();
    }

    /**
     * Ensures that there are no syntax errors contained in the result.
     * 
     * @param result
     *            the result of the Xtext parsing process
     * @throws SyntaxErrorException
     *             throw if the result is invalid or contains syntax errors. Contains a textual
     *             description of the syntax error.
     */
    private void assertNoSyntaxErrorException(IParseResult result) throws SyntaxErrorException {
        if (result == null) {
            throw new SyntaxErrorException("Unspecified syntax error");
        }
        if (!result.hasSyntaxErrors()) {
            return;
        }
        List<String> errorMessages = new ArrayList<>();
        for (INode error : result.getSyntaxErrors()) {
            Optional.ofNullable(error)
                .map(INode::getSyntaxErrorMessage)
                .map(SyntaxErrorMessage::getMessage)
                .ifPresent(errorMessages::add);
        }
        String errorMessage = String.join(System.lineSeparator(), errorMessages);
        throw new SyntaxErrorException(errorMessage);
    }

}
