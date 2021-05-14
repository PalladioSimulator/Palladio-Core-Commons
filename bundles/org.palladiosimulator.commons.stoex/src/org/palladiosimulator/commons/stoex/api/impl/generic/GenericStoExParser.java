package org.palladiosimulator.commons.stoex.api.impl.generic;

import java.text.ParseException;

import de.uka.ipd.sdq.stoex.Expression;

/**
 * Service interface for StoEx parsers.
 * 
 * The parser translates a serialized StoEx into an {@link Expression}. You can acquire an instance
 * of the parser via OSGi declarative services or use the {@link #createInstance()} method.
 *
 */
public interface GenericStoExParser {

    /**
     * Parse a serialized StoEx into an {@link Expression}.
     * 
     * @param serializedStoEx
     *            The serialized StoEx.
     * @return The parsed {@link Expression} instance.
     * @throws ParseException
     *             thrown in case of a syntax error.
     */
    Expression parse(String serializedStoEx) throws ParseException;

}
