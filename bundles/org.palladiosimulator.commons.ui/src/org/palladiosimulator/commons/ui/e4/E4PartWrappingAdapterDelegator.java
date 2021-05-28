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
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

/**
 * This class acts as intermediate adapter factory for Eclipse's E4PartWrapper. Unfortunately, large
 * parts of the IDE-code base relies on the legacy view framework, especially, the properties view.
 * While there are a couple of E3E4 compatibility mechanisms in place, AdapterFactories are only
 * queried based on the E4WrapperPart.
 *
 * This factory provides an adapter based on the wrapped view part. It looks up the according E4
 * view, and tries to retrieve the required adapter for it.
 * 
 * It is currently registered to provide adapters for
 * 
 * <ul>
 * <li>org.eclipse.ui.views.properties.IPropertySheetPage</li>
 * <li>org.eclipse.ui.views.properties.IPropertySourceProvider</li>
 * <li>org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor</li>
 * <li>org.eclipse.eef.properties.ui.api.IEEFTabbedPropertySheetPageContributor</li>
 * </ul>
 * 
 * It further provides E4 selection aware PropertySheetPage implementations, in case the view can be
 * adapted to either a (EEF)TabbedPropertySheetPageContributor or a PropertySource(Provider).
 * 
 * If you need the delegation for further adapter types, please register this delegator accordingly.
 * 
 * @author Sebastian Krach
 *
 */
@SuppressWarnings("restriction")
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
                    return adapterType.cast(ContextInjectionFactory
                        .make(E4SelectionAwareEEFTabbedPropertySheetPage.class, eclipseContext));
                }

                var tabbedContributor = Adapters.adapt(adaptableObject, ITabbedPropertySheetPageContributor.class);
                if (tabbedContributor != null) {
                    eclipseContext.set(ITabbedPropertySheetPageContributor.class, tabbedContributor);
                    return adapterType.cast(ContextInjectionFactory.make(E4SelectionAwareTabbedPropertySheetPage.class,
                            eclipseContext));
                }

                var isPropertySource = (Adapters.adapt(adaptableObject, IPropertySourceProvider.class) != null)
                        || (Adapters.adapt(adaptableObject, IPropertySource.class) != null);
                if (isPropertySource) {
                    return adapterType
                        .cast(ContextInjectionFactory.make(E4SelectionAwarePropertySheetPage.class, eclipseContext));
                }
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
