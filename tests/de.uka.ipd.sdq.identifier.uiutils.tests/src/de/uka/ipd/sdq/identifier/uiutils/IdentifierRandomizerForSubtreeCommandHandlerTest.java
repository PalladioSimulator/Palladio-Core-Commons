package de.uka.ipd.sdq.identifier.uiutils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.Test;

public class IdentifierRandomizerForSubtreeCommandHandlerTest extends AbstractIdentifierRandomizerCommandHandlerTest {

    public IdentifierRandomizerForSubtreeCommandHandlerTest() {
        super(IdentifierRandomizerForSubtreeCommandHandler::new);
    }

    @Test
    public void testSubtreeSelection() throws ExecutionException {
        var element_0 = F.createNonIdentified();
        var element_0_0 = F.createNonIdentified();
        element_0.getComposedElements()
            .add(element_0_0);
        var element_0_1 = F.createIdentified();
        element_0.getComposedElements()
            .add(element_0_1);
        var element_0_1_0 = F.createNonIdentified();
        element_0_1.getComposedElements()
            .add(element_0_1_0);
        var element_0_1_1 = F.createIdentified();
        element_0_1.getComposedElements()
            .add(element_0_1_1);

        executeForSelection(Arrays.asList(element_0), Arrays.asList(element_0_1));
    }

    @Test
    public void testSubtreeSelectionWithoutChangesOutsideOfTree() throws ExecutionException {
        var element_0 = F.createIdentified();
        var element_0_0 = F.createIdentified();
        element_0.getComposedElements()
            .add(element_0_0);
        var element_0_1 = F.createIdentified();
        element_0.getComposedElements()
            .add(element_0_1);
        var element_0_1_0 = F.createIdentified();
        element_0_1.getComposedElements()
            .add(element_0_1_0);
        var element_0_1_1 = F.createIdentified();
        element_0_1.getComposedElements()
            .add(element_0_1_1);

        executeForSelection(Arrays.asList(element_0), Arrays.asList(element_0_1));
    }

    @Override
    protected void assertIdentifierChange(Collection<EObject> selectedElements, EObject eobject, String identifier,
            String oldIdentifier) {
        if (EcoreUtil.isAncestor(selectedElements, eobject)) {
            assertNotEquals(oldIdentifier, identifier);
        } else {
            assertEquals(oldIdentifier, identifier);
        }
    }

}
