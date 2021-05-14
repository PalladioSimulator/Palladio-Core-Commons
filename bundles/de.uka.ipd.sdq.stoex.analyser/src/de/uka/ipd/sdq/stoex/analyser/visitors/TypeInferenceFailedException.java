package de.uka.ipd.sdq.stoex.analyser.visitors;

import de.uka.ipd.sdq.stoex.Expression;

class TypeInferenceFailedException extends RuntimeException {

    private static final long serialVersionUID = -3349723314768810885L;

    public TypeInferenceFailedException(Expression expr, String msg, StoexSerialiser stoexSerialiser) {
        super(stoexSerialiser.serialiseSilent(expr)
            .orElse("<invalid syntax>") + " - Inference of Type failed: " + msg);
    }

}
