package org.palladiosimulator.commons.ui.e4;

import jakarta.inject.Inject;
import jakarta.inject.Named;

import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.PropertySheetPage;

/**
 * This class implements an E4-aware plain old property sheet page. It should not be used directly.
 * 
 * @see E4PartWrappingAdapterDelegator
 * 
 * @author Sebastian Krach
 *
 */
public class E4SelectionAwarePropertySheetPage extends PropertySheetPage
        implements E4SelectionAwarePropertySheetPageMixin {

    @Inject
    @Named(E4SelectionAwarePropertySheetPageMixin.ADAPTED_PART)
    IWorkbenchPart viewPart;

    @Override
    public IWorkbenchPart getAdaptedWorkbenchPart() {
        return viewPart;
    }

}
