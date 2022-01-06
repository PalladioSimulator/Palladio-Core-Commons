package de.uka.ipd.sdq.identifier.uiutils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uka.ipd.sdq.identifier.Identifier;

public abstract class AbstractIdentifierRandomizerCommandHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        List<EObject> selectedEObjects = getSelectedEObjects(event);

        Map<EditingDomain, List<EObject>> groupedEObjects = new HashMap<>();
        for (var eobject : selectedEObjects) {
            var editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(eobject);
            if (editingDomain == null) {
                throw new ExecutionException("Could not find an editing domain for every element.");
            }
            var eobjectGroup = groupedEObjects.computeIfAbsent(editingDomain, e -> new ArrayList<>());
            eobjectGroup.add(eobject);
        }

        for (var entry : groupedEObjects.entrySet()) {
            randomizeIDsForSelectionGroup(entry.getKey(), entry.getValue());
        }

        return null;
    }

    protected void randomizeIDsForSelectionGroup(EditingDomain editingDomain, Collection<EObject> selectedEObjects) {
        executeInTransaction(editingDomain, () -> {
            randomizeIDsForSelectedEObjects(selectedEObjects);
        });
    }

    protected abstract void randomizeIDsForSelectedEObjects(Collection<EObject> selectedEObjects);

    protected List<EObject> getSelectedEObjects(ExecutionEvent event) {
        IStructuredSelection selection = HandlerUtil.getCurrentStructuredSelection(event);
        List<EObject> selectedEObjects = new ArrayList<>();
        for (Object selectedElement : selection) {
            if (selectedElement instanceof EObject) {
                selectedEObjects.add((EObject) selectedElement);
            }
        }
        return selectedEObjects;
    }

    protected void executeInTransaction(EditingDomain editingDomain, Runnable runnable) {
        editingDomain.getCommandStack()
            .execute(new ChangeCommand(editingDomain.getResourceSet()) {
                @Override
                protected void doExecute() {
                    runnable.run();
                }
            });
    }

    protected void randomizeID(EObject eobject) {
        if (eobject instanceof Identifier) {
            ((Identifier) eobject).setId(EcoreUtil.generateUUID());
        }
    }
}
