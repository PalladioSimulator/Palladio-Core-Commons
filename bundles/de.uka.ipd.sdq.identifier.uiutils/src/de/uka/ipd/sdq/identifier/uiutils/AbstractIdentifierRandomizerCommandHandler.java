package de.uka.ipd.sdq.identifier.uiutils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uka.ipd.sdq.identifier.Identifier;

public abstract class AbstractIdentifierRandomizerCommandHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        List<EObject> selectedEObjects = getSelectedEObjects(event);

        Map<ResourceSet, List<EObject>> groupedEObjects = selectedEObjects.stream()
            .collect(Collectors.groupingBy(eobject -> eobject.eResource()
                .getResourceSet()));
        for (var entry : groupedEObjects.entrySet()) {
            randomizeIDsForSelectionGroup(entry.getKey(), entry.getValue());
        }

        return null;
    }

    protected void randomizeIDsForSelectionGroup(ResourceSet resourceSet, Collection<EObject> selectedEObjects) {
        executeInTransaction(resourceSet, () -> {
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

    protected void executeInTransaction(ResourceSet rs, Runnable runnable) {
        TransactionalEditingDomain editingDomain = Optional.ofNullable(TransactionUtil.getEditingDomain(rs))
            .orElseGet(() -> TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(rs));
        editingDomain.getCommandStack()
            .execute(new RecordingCommand(editingDomain) {
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
