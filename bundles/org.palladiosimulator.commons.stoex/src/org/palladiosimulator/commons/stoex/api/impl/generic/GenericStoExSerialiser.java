package org.palladiosimulator.commons.stoex.api.impl.generic;

import java.io.NotSerializableException;

import de.uka.ipd.sdq.stoex.AbstractNamedReference;
import de.uka.ipd.sdq.stoex.Expression;

/**
 * Service interface for StoEx serialisers.
 * 
 * The serialiser transforms an {@link Expression} to human readable conrete syntax. You can acquire
 * an instance of the parser via OSGi declarative services or use the {@link #createInstance()}
 * method.
 */
public interface GenericStoExSerialiser {

    /**
     * Serialises an {@link Expression} to a human readable text.
     * 
     * @param expression
     *            The expression to serialise.
     * @return The concrete syntax representation of the given expression.
     * @throws NotSerializableException
     *             In case of an error during serialisation. This is usually caused by an invalid
     *             expression.
     */
    String serialise(Expression expression) throws NotSerializableException;

    /**
     * Serialises an {@link AbstractNamedReference} to a human readable text.
     * 
     * @param reference
     *            The reference to serialise.
     * @return The concrete syntax representation of the given reference.
     * @throws NotSerializableException
     *             In case of an error during serialisation. This is usually caused by an invalid
     *             reference.
     */
    String serialise(AbstractNamedReference reference) throws NotSerializableException;

}
