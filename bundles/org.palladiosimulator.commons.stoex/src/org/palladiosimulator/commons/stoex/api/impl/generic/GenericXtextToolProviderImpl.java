package org.palladiosimulator.commons.stoex.api.impl.generic;

import java.util.Optional;

import javax.inject.Provider;

import org.eclipse.core.runtime.Platform;
import org.palladiosimulator.commons.eclipseutils.ExtensionHelper;

import com.google.inject.Injector;

/**
 * Abstract base class for {@link GenericXtextToolProvider} implementations.
 * 
 * The logic first tries to collect an implementation from an extension point and tries to create an
 * instance from a standalone initialised provider afterwards. The implementation guarantees to
 * return an implementation if the requested tool type can be provided by the Xtext framework.
 *
 * @param <T>
 *            The type of the requested tool.
 */
public abstract class GenericXtextToolProviderImpl<T> implements GenericXtextToolProvider<T> {

    private final Provider<Injector> standaloneInjectorProvider;
    private final String extensionPointId;
    private final Class<T> requestedType;
    private final String extensionPointAttr;

    /**
     * Initializes the base class with necessary information.
     * 
     * @param standaloneInjectorProvider
     *            Provider for a standalone instance of the language injector.
     * @param requestedType
     *            The type of the requested tool.
     * @param extensionPointId
     *            The extension point id that provides implementations for the requested tool.
     * @param extensionPointAttr
     *            The attribute that contains the tool object.
     */
    public GenericXtextToolProviderImpl(Provider<Injector> standaloneInjectorProvider, Class<T> requestedType,
            String extensionPointId, String extensionPointAttr) {
        this.standaloneInjectorProvider = standaloneInjectorProvider;
        this.requestedType = requestedType;
        this.extensionPointId = extensionPointId;
        this.extensionPointAttr = extensionPointAttr;
    }

    @Override
    public T get() {
        return getExtension().orElseGet(this::getStandalone);
    }

    /**
     * Gets the requested tool from the extension point given in the constructor.
     * 
     * If multiple extensions are provided, the implementation returns a random implementation.
     * 
     * @return The found extension or an empty {@link Optional} otherwise.
     */
    protected Optional<T> getExtension() {
        if (!Platform.isRunning()) {
            return Optional.empty();
        }
        final var foundExtensions = ExtensionHelper.<T> getExecutableExtensions(extensionPointId, extensionPointAttr);
        if (foundExtensions.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(foundExtensions.get(0));
    }

    /**
     * Gets the requested tool based on a standalone initialization.
     * 
     * @return The created tool.
     */
    protected T getStandalone() {
        return standaloneInjectorProvider.get()
            .getInstance(requestedType);
    }

}
