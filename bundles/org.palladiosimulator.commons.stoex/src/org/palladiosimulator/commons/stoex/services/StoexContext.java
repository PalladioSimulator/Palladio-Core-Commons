package org.palladiosimulator.commons.stoex.services;

import java.util.Optional;

import de.uka.ipd.sdq.stoex.RandomVariable;
import de.uka.ipd.sdq.stoex.analyser.visitors.TypeEnum;

public interface StoexContext {

    Optional<RandomVariable> getContainer();
    
    Optional<TypeEnum> getExpectedType();

}
