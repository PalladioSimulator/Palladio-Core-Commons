package org.palladiosimulator.commons.stoex.api.impl;

import org.eclipse.xtext.serializer.ISerializer;

/**
 * Provider for {@link ISerializer} instances.
 * 
 * @see XtextToolProviderImpl
 */
public class XtextStoExSerialiserProvider extends XtextToolProviderImpl<ISerializer> {

    private static final String EP_ID_SERIALISER = "org.palladiosimulator.commons.stoex.api.extensions.serialiserprovider";
    private static final String EP_ID_ATTR = "class";

    /**
     * Constructs the provider.
     */
    public XtextStoExSerialiserProvider() {
        super(ISerializer.class, EP_ID_SERIALISER, EP_ID_ATTR);
    }

}
