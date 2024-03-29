package org.palladiosimulator.commons.stoex.api.impl;

import javax.inject.Provider;

import org.eclipse.xtext.ISetup;
import org.palladiosimulator.commons.stoex.StoexStandaloneSetup;
import org.palladiosimulator.commons.stoex.api.impl.generic.GenericXtextStoExStandaloneInjectorProvider;

import com.google.inject.Injector;

/**
 * Provider to get an {@link Injector} for the StoEx language.
 * 
 * The class is meant to be used in standalone environments. It should never be necessary to get an
 * {@link Injector} in OSGi environments.
 */
public class PlainXtextStoExInjectorProvider extends GenericXtextStoExStandaloneInjectorProvider {

    private static final Provider<Injector> INSTANCE = new PlainXtextStoExInjectorProvider();

    private PlainXtextStoExInjectorProvider() {
        super();
    }

    /**
     * Get the instance of the provider.
     * 
     * @return The instance.
     */
    public static Provider<Injector> getInstance() {
        return INSTANCE;
    }

    @Override
    protected ISetup getStoexSetup() {
        return new StoexStandaloneSetup();
    }

}
