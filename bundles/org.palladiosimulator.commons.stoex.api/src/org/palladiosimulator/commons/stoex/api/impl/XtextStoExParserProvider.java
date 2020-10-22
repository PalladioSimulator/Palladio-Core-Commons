package org.palladiosimulator.commons.stoex.api.impl;

import org.eclipse.xtext.parser.IParser;
import org.palladiosimulator.commons.stoex.parser.antlr.StoexParser;

/**
 * Provider for {@link StoexParser} instances.
 * 
 * @see XtextToolProviderImpl
 */
public class XtextStoExParserProvider extends XtextToolProviderImpl<IParser> {

    private static final String EP_ID_PARSER = "org.palladiosimulator.commons.stoex.api.extensions.parserprovider";
    private static final String EP_ID_ATTR = "class";

    /**
     * Constructs the provider.
     */
    public XtextStoExParserProvider() {
        super(IParser.class, EP_ID_PARSER, EP_ID_ATTR);
    }

}
