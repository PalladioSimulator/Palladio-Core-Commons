package de.uka.ipd.sdq.identifier.uiutils;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

public class IdentifierRandomizerForSubtreeCommandHandler extends AbstractIdentifierRandomizerCommandHandler {

    @Override
    protected void randomizeIDsForSelectedEObjects(Collection<EObject> selectedEObjects) {
        selectedEObjects.forEach(this::randomizeIDsOfSubtree);
    }

    protected void randomizeIDsOfSubtree(EObject selectedElement) {
        randomizeID(selectedElement);
        selectedElement.eAllContents()
            .forEachRemaining(this::randomizeID);
    }

}
