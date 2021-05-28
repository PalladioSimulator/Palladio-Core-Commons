package org.palladiosimulator.commons.ui.e4;

import javax.annotation.PostConstruct;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

public class E4EMFEditAddon {
    
    @PostConstruct
    public void init(IEclipseContext context) {
        context.set(ComposedAdapterFactory.class, new ComposedAdapterFactory(
            ComposedAdapterFactory.Descriptor.Registry.INSTANCE));
    }

}
