package org.palladiosimulator.commons.stoex.api.impl.generic;

import com.google.inject.Provider;

import org.eclipse.xtext.ISetup;

import com.google.inject.Injector;

/**
 * Provider to get an {@link Injector} for the StoEx language.
 * 
 * The class is meant to be used in standalone environments. It should never be necessary to get an
 * {@link Injector} in OSGi environments.
 */
public abstract class GenericXtextStoExStandaloneInjectorProvider implements Provider<Injector> {

    private volatile Injector stoExInjector;

    /**
     * Constructor not meant to be called by users.
     */
    protected GenericXtextStoExStandaloneInjectorProvider() {
        // intentionally left blank
    }

    @Override
    public Injector get() {
        if (stoExInjector == null) {
            synchronized (this) {
                if (stoExInjector == null) {
                    stoExInjector = getStoexSetup().createInjectorAndDoEMFRegistration();
                }
            }
        }
        return stoExInjector;
    }

    /**
     * Finds an {@link ISetup} implementation to get an {@link Injector} instance from.
     * 
     * The implementation usually uses the generated standalone setup class.
     * 
     * @return The {@link ISetup} instance.
     */
    protected abstract ISetup getStoexSetup();
}
