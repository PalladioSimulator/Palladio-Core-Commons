package org.palladiosimulator.commons.stoex.api.impl;

import org.eclipse.xtext.parser.IParser;
import org.palladiosimulator.commons.stoex.api.impl.generic.GenericXtextToolProviderImpl;
import org.palladiosimulator.commons.stoex.parser.antlr.StoexParser;

/**
 * Provider for {@link StoexParser} instances.
 * 
 * @see GenericXtextToolProviderImpl
 */
public class PlainXtextStoExParserProvider extends GenericXtextToolProviderImpl<IParser> {

    private static final String EP_ID_PARSER = "org.palladiosimulator.commons.stoex.stoex_parser_provider";
    private static final String EP_ID_ATTR = "class";

    /**
     * Constructs the provider.
     */
    public PlainXtextStoExParserProvider() {
        super(PlainXtextStoExInjectorProvider.getInstance(), IParser.class, EP_ID_PARSER, EP_ID_ATTR);
    }

}
