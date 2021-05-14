package org.palladiosimulator.commons.stoex.api;

import org.palladiosimulator.commons.stoex.api.impl.PlainStoExParserImpl;
import org.palladiosimulator.commons.stoex.api.impl.generic.GenericStoExParser;

import de.uka.ipd.sdq.stoex.Expression;

/**
 * Service interface for StoEx parsers.
 * 
 * The parser translates a serialized StoEx into an {@link Expression}.
 */
public interface PlainStoExParser extends GenericStoExParser {

    /**
     * Creates an instance of the {@link PlainStoExParser}.
     * 
     * @return Instance of {@link PlainStoExParser}
     */
    static PlainStoExParser createInstance() {
        return new PlainStoExParserImpl();
    }

}
