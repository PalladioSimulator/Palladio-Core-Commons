package org.palladiosimulator.commons.stoex.api.impl;

import org.palladiosimulator.commons.stoex.api.PlainStoExParser;
import org.palladiosimulator.commons.stoex.api.impl.generic.GenericStoExParserImpl;

/**
 * Wrapper for the Xtext StoEx parser.
 */
public class PlainStoExParserImpl extends GenericStoExParserImpl implements PlainStoExParser {

    /**
     * Constructs new parser instance.
     */
    public PlainStoExParserImpl() {
        super(new PlainXtextStoExParserProvider());
    }

}
