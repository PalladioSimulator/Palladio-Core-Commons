package org.palladiosimulator.commons.stoex.api.impl;

import java.util.Optional;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;
import org.palladiosimulator.commons.stoex.StoexStandaloneSetup;
import org.palladiosimulator.commons.stoex.parser.antlr.StoexParser;

import com.google.inject.Injector;

/**
 * This implementation delivers StoEx tools provided by Xtext.
 * 
 * The implementation tries to use the runtime instances of the tools registered in Eclipse first.
 * If this fails, a standalone initialization takes place. The Eclipse platform versions are bound
 * via extension points that run through the executable provider factory of the UI bundle of the
 * StoEx Xtext implementation. We do not directly depend on the UI bundle to avoid an explicit UI
 * dependency. Even without the UI bundle, the implementation is capable of acquiering the required
 * Xtext services via a standalone initialization.
 *
 */
@Component(scope = ServiceScope.SINGLETON)
public class StoExToolProviderImpl implements StoExToolProvider {

    private static final String EP_ATTR_ID = "class";

    private static final String EP_ID_PARSER = "org.palladiosimulator.commons.stoex.api.extensions.parserprovider";

    private StoexParser parser;

    /**
     * only used in standalone scenarios, null otherwise
     */
    private Injector injector;

    /**
     * Get a StoEx parser.
     */
    public StoexParser getParser() {
        if (parser == null) {
            parser = getTool(EP_ID_PARSER, StoexParser.class);
        }
        return parser;
    }

    /**
     * Acquires a Xtext tool either via extension point of via standalone initialization as
     * fallback.
     * 
     * Callers are encouraged to cache the results to avoid triggering the costly resolution process
     * too often.
     * 
     * @param <T>
     *            The type of the required tool.
     * @param extensionPointId
     *            The ID of the extension point for providing the runtime instance of the tool.
     * @param extensionClass
     *            The type of the required tool in form of a class.
     * @return An instance of the required tool.
     */
    protected <T> T getTool(String extensionPointId, Class<T> extensionClass) {
        return getExtension(extensionPointId, extensionClass).orElseGet(() -> getStandaloneInstance(extensionClass));
    }

    /**
     * Get the first found extension matching the given ID.
     * 
     * The implementation assumes that the extension is given via the attribute named like
     * {@link #EP_ATTR_ID}.
     * 
     * @param <T>
     *            The type of the required tool.
     * @param extensionPointId
     *            The ID of the extension point for providing the runtime instance of the tool.
     * @param extensionClass
     *            The type of the required tool in form of a class.
     * @return An {@link Optional} containing an instance if one could be found. An empty
     *         {@link Optional} otherwise.
     */
    @SuppressWarnings("unchecked")
    protected <T> Optional<T> getExtension(String extensionPointId, Class<T> extensionClass) {
        IExtensionRegistry reg = Platform.getExtensionRegistry();
        IConfigurationElement[] elements = reg.getConfigurationElementsFor(extensionPointId);
        for (IConfigurationElement element : elements) {
            try {
                Object extension = element.createExecutableExtension(EP_ATTR_ID);
                if (extensionClass.isInstance(extension)) {
                    return Optional.of((T) extension);
                }
            } catch (CoreException e) {
                // error in instantiation
                // ignore for now and try next one
            }
        }
        return Optional.empty();
    }

    /**
     * Acquires a tool via standalone initialization.
     * 
     * @param <T>
     *            The type of the required tool.
     * @param type
     *            The type of the required tool in form of a class.
     * @return An instance of the required tool.
     */
    protected <T> T getStandaloneInstance(Class<T> type) {
        return getStandaloneInjector().getInstance(type);
    }

    /**
     * Resolves and caches a standalone injector to be used to create standalone instances of
     * required tools.
     * 
     * @return The standalone injector.
     */
    protected Injector getStandaloneInjector() {
        if (injector == null) {
            injector = new StoexStandaloneSetup().createInjectorAndDoEMFRegistration();
        }
        return injector;
    }

}
