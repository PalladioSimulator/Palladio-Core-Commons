package de.uka.ipd.sdq.identifier.uiutils;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

public class IdentifierRandomizerForSingleElementCommandHandler extends AbstractIdentifierRandomizerCommandHandler {

    @Override
    protected void randomizeIDsForSelectedEObjects(Collection<EObject> selectedEObjects) {
        selectedEObjects.forEach(this::randomizeID);
    }

}
