package de.uka.ipd.sdq.stoex.impl;

import de.uka.ipd.sdq.stoex.Expression;
import de.uka.ipd.sdq.stoex.StoexPackage;

public class RandomVariableImpl extends RandomVariableImplGen {

    /**
     * {@inheritDoc}
     */
    @Override
    public Expression getExpression() {
        // FIXME: StB: I am not sure at all how this is supposed to work with dynamic feature.
        // The code below works but is far of the generated one....
        return (Expression) this.eGet(StoexPackage.RANDOM_VARIABLE__EXPRESSION, false, true);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Expression basicGetExpression() {
        // TODO: implement this method to return the 'Expression' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSetExpression() {
        return (this.getSpecification() != null);
    }
    
}
