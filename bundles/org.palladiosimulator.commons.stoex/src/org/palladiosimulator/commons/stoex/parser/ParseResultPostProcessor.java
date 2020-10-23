package org.palladiosimulator.commons.stoex.parser;

import org.eclipse.xtext.parser.IParseResult;

/**
 * Service interface for all post processors of StoEx parse results. The processor can completely
 * replace the parse result.
 */
public interface ParseResultPostProcessor {

    /**
     * Post processes the given {@link IParseResult}.
     * 
     * Implementations are responsible for considering errors.
     * 
     * @param result
     *            The result to process.
     * @return The processed result.
     */
    IParseResult postProcess(IParseResult result);

}
