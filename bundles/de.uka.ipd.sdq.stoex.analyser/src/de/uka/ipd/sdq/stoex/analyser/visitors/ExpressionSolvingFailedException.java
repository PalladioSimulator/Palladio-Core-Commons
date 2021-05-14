package de.uka.ipd.sdq.stoex.analyser.visitors;

import de.uka.ipd.sdq.stoex.Expression;

class ExpressionSolvingFailedException extends RuntimeException {

    private static final long serialVersionUID = 7389557819248772502L;

    public ExpressionSolvingFailedException(String message, Expression expr, StoexSerialiser stoexSerialiser) {
        super("Solving expression " + stoexSerialiser.serialiseSilent(expr)
            .orElse("<invalid expression>") + "failed: " + message);
    }

    public ExpressionSolvingFailedException(Expression expr, Exception e, StoexSerialiser stoexSerialiser) {
        super("Solving expression " + stoexSerialiser.serialiseSilent(expr)
            .orElse("<invalid expression>") + "failed.", e);
    }

}
