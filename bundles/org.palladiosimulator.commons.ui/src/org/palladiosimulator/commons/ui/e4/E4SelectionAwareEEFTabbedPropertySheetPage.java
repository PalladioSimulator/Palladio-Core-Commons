package org.palladiosimulator.commons.ui.e4;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.eef.properties.ui.api.IEEFTabbedPropertySheetPageContributor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;

/**
 * This class implements an E4-aware EEF tabbed property sheet page. It should not be used directly.
 * 
 * @see E4PartWrappingAdapterDelegator
 * 
 */
public class E4SelectionAwareEEFTabbedPropertySheetPage extends EEFTabbedPropertySheetPage implements E4SelectionAwarePropertySheetPageMixin {

    @Inject
    public E4SelectionAwareEEFTabbedPropertySheetPage(IEEFTabbedPropertySheetPageContributor contributor) {
        super(contributor);
    }

    @Inject
    @Named(E4SelectionAwarePropertySheetPageMixin.ADAPTED_PART)
    IWorkbenchPart viewPart;
    
    @Override
    public IWorkbenchPart getAdaptedWorkbenchPart() {
        return viewPart;
    }
    
    @Inject
    public void setSelection(
            @Optional @Named(IServiceConstants.ACTIVE_PART) MPart activePart,
            @Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selection) {
        E4SelectionAwarePropertySheetPageMixin.super.setSelection(activePart, selection);
    }
    
    boolean initialized = false;
    
    @Override
    public boolean isInitialized() {
        return initialized;
    }
    
    @Override
    public void createControl(Composite parent) {
        super.createControl(parent);
        initialized = true;
    }

}
