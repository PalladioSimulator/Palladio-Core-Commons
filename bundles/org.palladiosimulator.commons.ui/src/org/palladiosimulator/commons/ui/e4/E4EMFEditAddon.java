package org.palladiosimulator.commons.ui.e4;

import jakarta.annotation.PostConstruct;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

/**
 * This E4 Add-On registers a central ComposedAdapterFactory with the eclipse context of the
 * application. It provides the capabilities to inject such a factory into objects using E4
 * mechanisms.
 * 
 * There is nothing to do, except for including the containing bundle in the execution platform.
 * 
 * @author Sebastian Krach
 *
 */
public class E4EMFEditAddon {

    @PostConstruct
    public void init(IEclipseContext context) {
        context.set(ComposedAdapterFactory.class,
                new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE));
    }

}
