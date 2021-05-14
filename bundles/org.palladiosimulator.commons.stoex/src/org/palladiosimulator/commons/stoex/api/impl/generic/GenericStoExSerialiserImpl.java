package org.palladiosimulator.commons.stoex.api.impl.generic;

import java.io.NotSerializableException;
import java.util.Optional;
import java.util.UUID;

import javax.inject.Provider;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.serializer.ISerializer;

import de.uka.ipd.sdq.stoex.Expression;

/**
 * Wrapper for an serialize for StoEx expressions.
 */
public abstract class GenericStoExSerialiserImpl implements GenericStoExSerialiser {

    private final ISerializer serialiser;

    /**
     * Constructs new serialiser instance.
     */
    public GenericStoExSerialiserImpl(Provider<ISerializer> serialiserProvider) {
        serialiser = serialiserProvider.get();
    }

    @Override
    public String serialise(Expression expression) throws NotSerializableException {
        return serialiseWithoutTypeCheck(expression);
    }

    /**
     * Serialises the given {@link EObject} assuming that the serialiser can handle that particular
     * type of element.
     * 
     * @param stoexElement
     *            The stoex element to seriale.
     * @return The serialised representation of the stoex element.
     * @throws NotSerializableException
     *             thrown if the serialisation fails.
     */
    protected String serialiseWithoutTypeCheck(EObject stoexElement) throws NotSerializableException {
        var tmpStoexElement = createStoexElementCopy(stoexElement);
        try {
            return serialiser.serialize(tmpStoexElement);
        } catch (RuntimeException e) {
            throw new NotSerializableException(e.getMessage());
        } finally {
            removeStoexElementCopy(tmpStoexElement);
        }
    }

    /**
     * Creates a copy of the given stoex element that will be contained in an {@link XtextResource}.
     * This is necessary because the serialiser demands the expression to be in such a resource.
     * 
     * Please note that this implementation changes the {@link ResourceSet} that transitively
     * contains the stoex element. Therefore, the effect has to be undone as soon as the copy is not
     * required anymore by calling {@link #removeStoexElementCopy(EObject)}.
     * 
     * @param eobject
     *            The stoex element to copy.
     * @return The copy of the stoex element.
     * @see #removeStoexElementCopy(EObject)
     */
    protected <T extends EObject> T createStoexElementCopy(T eobject) {
        var rs = Optional.ofNullable(eobject.eResource())
            .map(Resource::getResourceSet)
            .orElseGet(ResourceSetImpl::new);
        var uri = Optional.ofNullable(eobject.eResource())
            .map(Resource::getURI)
            .orElseGet(() -> URI.createPlatformResourceURI("/tmp/tmp.xmi", false))
            .trimSegments(1)
            .appendSegment(UUID.randomUUID()
                .toString() + ".stoex");
        var r = rs.createResource(uri);
        var copy = EcoreUtil.copy(eobject);
        r.getContents()
            .add(copy);
        return copy;
    }

    /**
     * Undoes the changes done by {@link #createStoexElementCopy(EObject)}.
     * 
     * @param copy
     *            The stoex element copy.
     */
    protected <T extends EObject> void removeStoexElementCopy(T copy) {
        var r = copy.eResource();
        r.unload();
        r.getResourceSet()
            .getResources()
            .remove(r);
    }

}
