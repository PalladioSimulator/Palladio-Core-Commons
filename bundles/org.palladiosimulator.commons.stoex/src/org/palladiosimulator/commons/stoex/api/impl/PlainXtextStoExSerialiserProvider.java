package org.palladiosimulator.commons.stoex.api.impl;

import org.eclipse.xtext.serializer.ISerializer;
import org.palladiosimulator.commons.stoex.api.impl.generic.GenericXtextToolProviderImpl;

/**
 * Provider for {@link ISerializer} instances.
 * 
 * @see GenericXtextToolProviderImpl
 */
public class PlainXtextStoExSerialiserProvider extends GenericXtextToolProviderImpl<ISerializer> {

    private static final String EP_ID_SERIALISER = "org.palladiosimulator.commons.stoex.stoex_serialiser_provider";
    private static final String EP_ID_ATTR = "class";

    /**
     * Constructs the provider.
     */
    public PlainXtextStoExSerialiserProvider() {
        super(PlainXtextStoExInjectorProvider.getInstance(), ISerializer.class, EP_ID_SERIALISER, EP_ID_ATTR);
    }

}
