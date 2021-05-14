package org.palladiosimulator.commons.stoex.api.impl;

import java.io.NotSerializableException;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.commons.stoex.api.PlainStoExSerialiser;
import org.palladiosimulator.commons.stoex.api.impl.generic.GenericStoExSerialiserImpl;

import de.uka.ipd.sdq.stoex.AbstractNamedReference;
import de.uka.ipd.sdq.stoex.StoexFactory;
import de.uka.ipd.sdq.stoex.Variable;

/**
 * Wrapper for an serialize for StoEx expressions.
 */
public class PlainStoExSerialiserImpl extends GenericStoExSerialiserImpl implements PlainStoExSerialiser {

    /**
     * Constructs new serialiser instance.
     */
    public PlainStoExSerialiserImpl() {
        super(new PlainXtextStoExSerialiserProvider());
    }

    @Override
    public String serialise(AbstractNamedReference reference) throws NotSerializableException {
        Variable wrapper = StoexFactory.eINSTANCE.createVariable();
        AbstractNamedReference referenceCopy = EcoreUtil.copy(reference);
        wrapper.setId_Variable(referenceCopy);
        return serialiseWithoutTypeCheck(wrapper);
    }

}
