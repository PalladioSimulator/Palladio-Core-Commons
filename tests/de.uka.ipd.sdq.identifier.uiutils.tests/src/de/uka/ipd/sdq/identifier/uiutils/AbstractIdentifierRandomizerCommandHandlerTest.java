package de.uka.ipd.sdq.identifier.uiutils;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.UUID;
import java.util.function.Supplier;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.expressions.EvaluationContext;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.ISources;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.uka.ipd.sdq.identifier.Identifier;
import identifiertesting.IdentifiertestingFactory;
import tools.mdsd.library.standalone.initialization.StandaloneInitializationException;
import tools.mdsd.library.standalone.initialization.StandaloneInitializerBuilder;

public abstract class AbstractIdentifierRandomizerCommandHandlerTest {

    protected static final IdentifiertestingFactory F = IdentifiertestingFactory.eINSTANCE;
    private final Supplier<IHandler> subjectFactory;
    protected IHandler subject;

    protected AbstractIdentifierRandomizerCommandHandlerTest(Supplier<IHandler> subjectFactory) {
        this.subjectFactory = subjectFactory;
    }

    @BeforeAll
    public static void init() throws StandaloneInitializationException {
        StandaloneInitializerBuilder.builder()
            .build()
            .init();

    }

    @BeforeEach
    public void setup() {
        subject = subjectFactory.get();
    }

    @Test
    public void testEmptySelection() throws ExecutionException {
        executeForSelection(Collections.emptyList(), Collections.emptyList());
    }

    @Test
    public void testSingleNonIdentifierSelection() throws ExecutionException {
        var element = F.createNonIdentified();
        executeForSelection(Arrays.asList(element), Arrays.asList(element));
    }

    @Test
    public void testSingleIdentifierSelection() throws ExecutionException {
        var element = F.createIdentified();
        var oldId = element.getId();
        executeForSelection(Arrays.asList(element), Arrays.asList(element));
        var newId = element.getId();
        assertNotEquals(oldId, newId);
    }

    @Test
    public void testSelectionContainingNonModelObject() throws ExecutionException {
        var element = F.createIdentified();
        createResource().getContents().add(element);
        var oldIdentifier = element.getId();
        var dummy = new Object();
        var event = createEvent(Arrays.asList(element, dummy));
        subject.execute(event);
        assertNotEquals(oldIdentifier, element.getId());
    }

    protected void executeForSelection(Collection<EObject> rootElements, Collection<EObject> selectedElements)
            throws ExecutionException {
        // save old state
        var copier = new EcoreUtil.Copier();
        copier.copyAll(rootElements);
        copier.copyReferences();

        // execute randomizer
        for (var rootElement : rootElements) {
            var r = createResource();
            r.getContents()
                .add(rootElement);
        }
        @SuppressWarnings("unchecked")
        var event = createEvent((Collection<Object>) (Collection<?>) selectedElements);
        subject.execute(event);

        // assert changes
        assertChanges(selectedElements, copier);
    }

    protected void assertChanges(Collection<EObject> selectedElements, Copier copier) {
        for (var copyEntry : copier.entrySet()) {
            var eobject = copyEntry.getKey();
            var oldEObject = copyEntry.getValue();
            if (!(eobject instanceof Identifier)) {
                continue;
            }
            var identifier = ((Identifier) eobject).getId();
            var oldIdentifier = ((Identifier) oldEObject).getId();
            assertIdentifierChange(selectedElements, eobject, identifier, oldIdentifier);
        }
    }

    protected abstract void assertIdentifierChange(Collection<EObject> selectedElements, EObject eobject,
            String identifier, String oldIdentifier);

    protected ExecutionEvent createEvent(Collection<Object> selectedElements) {
        var selection = new StructuredSelection(selectedElements.toArray());
        var context = new EvaluationContext(null, selection);
        context.addVariable(ISources.ACTIVE_CURRENT_SELECTION_NAME, selection);
        var event = new ExecutionEvent(null, Collections.emptyMap(), null, context);
        return event;
    }
    
    protected static Resource createResource() {
        var rs = createResourceSet();
        var r = rs.createResource(URI.createURI("virtual:/" + UUID.randomUUID() + ".xmi"));
        return r;
    }
    
    protected static ResourceSet createResourceSet() {
        var composedAdapterFactory = new ComposedAdapterFactory(
                ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
        var editingDomain = new AdapterFactoryEditingDomain(composedAdapterFactory, new BasicCommandStack());
        return editingDomain.getResourceSet();
    }

}
