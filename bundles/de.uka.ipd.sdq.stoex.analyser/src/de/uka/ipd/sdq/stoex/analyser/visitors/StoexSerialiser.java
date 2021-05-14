package de.uka.ipd.sdq.stoex.analyser.visitors;

import java.io.NotSerializableException;
import java.util.Optional;

import de.uka.ipd.sdq.stoex.Expression;

public interface StoexSerialiser {

    String serialise(Expression expression) throws NotSerializableException; 
    
    default Optional<String> serialiseSilent(Expression expression) {
        try {
            return Optional.of(serialise(expression));
        } catch (NotSerializableException e) {
            return Optional.empty();
        }
    }
}
