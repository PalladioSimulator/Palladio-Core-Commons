package org.palladiosimulator.commons.stoex.services;

import java.util.Optional;

import org.eclipse.emf.ecore.resource.Resource;

import de.uka.ipd.sdq.stoex.RandomVariable;
import de.uka.ipd.sdq.stoex.analyser.visitors.TypeEnum;

public class StoexContextProviderImpl implements StoexContextProvider {

    protected static final StoexContext DUMMY_CONTEXT = createDummyContext();

    @Override
    public StoexContext getContext(Resource resource) {
        if (resource == null) {
            throw new IllegalArgumentException("The given resource must not be null.");
        }
        return resource.eAdapters()
            .stream()
            .filter(a -> a.isAdapterForType(StoexContextProvider.class))
            .findFirst()
            .map(StoexContextProvider.class::cast)
            .map(provider -> provider.getContext(resource))
            .orElse(DUMMY_CONTEXT);
    }

    protected static StoexContext createDummyContext() {
        return new StoexContext() {
            @Override
            public Optional<RandomVariable> getContainer() {
                return Optional.empty();
            }

            @Override
            public Optional<TypeEnum> getExpectedType() {
                return Optional.empty();
            }
        };
    }

}
