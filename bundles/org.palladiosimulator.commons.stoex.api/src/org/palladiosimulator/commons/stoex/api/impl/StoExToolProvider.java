package org.palladiosimulator.commons.stoex.api.impl;

import org.palladiosimulator.commons.stoex.parser.antlr.StoexParser;

/**
 * Service interface for acquiring StoEx tools provided by the Xtext framework.
 * 
 * You can acquire an instance of this service via OSGi declaratie services.
 *
 */
public interface StoExToolProvider {
    
    /**
     * Acquire an instance of a StoEx parser.
     * @return The parser instance.
     * @see StoexParser 
     */
    StoexParser getParser();
}
