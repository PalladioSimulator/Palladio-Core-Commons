package org.palladiosimulator.commons.stoex.api;

import org.palladiosimulator.commons.stoex.api.impl.PlainStoExSerialiserImpl;
import org.palladiosimulator.commons.stoex.api.impl.generic.GenericStoExSerialiser;

import de.uka.ipd.sdq.stoex.Expression;

/**
 * Service interface for StoEx serialisers.
 * 
 * The serialiser transforms an {@link Expression} to human readable concrete syntax.
 */
public interface PlainStoExSerialiser extends GenericStoExSerialiser {

    /**
     * Creates an instance of the {@link PlainStoExSerialiser}.
     * 
     * @return Instance of {@link PlainStoExSerialiser}
     */
    static PlainStoExSerialiser createInstance() {
        return new PlainStoExSerialiserImpl();
    }
}
