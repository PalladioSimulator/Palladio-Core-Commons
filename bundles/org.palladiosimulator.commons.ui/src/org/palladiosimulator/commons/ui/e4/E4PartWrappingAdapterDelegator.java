package org.palladiosimulator.commons.ui.e4;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.runtime.Adapters;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.eef.properties.ui.api.IEEFTabbedPropertySheetPageContributor;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.internal.E4PartWrapper;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

public class E4PartWrappingAdapterDelegator implements IAdapterFactory {
    public static final String ADAPTER_FACTORY_EXTENSION_POINT = "org.eclipse.core.runtime.adapters";
    public static final String ADAPTER_FACTORY_ADAPTED_OBJECT = "adaptableType";
    public static final String ADAPTER_FACTORY_ADAPTER = "adapter";
    public static final String ADAPTER_FACTORY_ADAPTER_TYPE = "type";

    @Override
    public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
        if (adaptableObject instanceof IViewPart) {
            var partService = ((IViewPart) adaptableObject).getSite()
                .getService(EPartService.class);
            var part = partService.findPart(((IViewPart) adaptableObject).getSite()
                .getId());
            var adapter = Adapters.adapt(part.getObject(), adapterType);
            if (adapterType == IPropertySheetPage.class && adapter == null) {
                var eclipseContext = ((IViewPart) adaptableObject).getSite()
                    .getService(IEclipseContext.class);
                eclipseContext.set(E4SelectionAwarePropertySheetPageMixin.ADAPTED_PART, adaptableObject);

                var contributor = Adapters.adapt(adaptableObject, IEEFTabbedPropertySheetPageContributor.class);
                if (contributor != null) {
                    eclipseContext.set(IEEFTabbedPropertySheetPageContributor.class, contributor);
                    return adapterType.cast(ContextInjectionFactory.make(E4SelectionAwareEEFTabbedPropertySheetPage.class,
                            eclipseContext));
                }
                var tabbedContributor = Adapters.adapt(adaptableObject, ITabbedPropertySheetPageContributor.class);
                if (tabbedContributor != null) {
                    eclipseContext.set(ITabbedPropertySheetPageContributor.class, tabbedContributor);
                    return adapterType.cast(ContextInjectionFactory.make(E4SelectionAwareTabbedPropertySheetPage.class,
                            eclipseContext));
                }
                return adapterType
                    .cast(ContextInjectionFactory.make(E4SelectionAwarePropertySheetPage.class, eclipseContext));
            }
            return adapterType.cast(adapter);
        }
        return null;
    }

    @Override
    public Class<?>[] getAdapterList() {
        return Arrays.stream(Platform.getExtensionRegistry()
            .getConfigurationElementsFor(ADAPTER_FACTORY_EXTENSION_POINT))
            .filter(elem -> E4PartWrapper.class.getName()
                .equals(elem.getAttribute(ADAPTER_FACTORY_ADAPTED_OBJECT)))
            .flatMap(elem -> Arrays.stream(elem.getChildren(ADAPTER_FACTORY_ADAPTER)))
            .map(elem -> elem.getAttribute(ADAPTER_FACTORY_ADAPTER_TYPE))
            .flatMap(name -> {
                try {
                    return Stream.of(Class.forName(name));
                } catch (ClassNotFoundException e) {
                    return Stream.empty();
                }
            })
            .collect(Collectors.toList())
            .toArray(new Class<?>[0]);
    }

}
