package org.palladiosimulator.commons.ui.e4;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class E4SelectionAwareTabbedPropertySheetPage extends TabbedPropertySheetPage implements E4SelectionAwarePropertySheetPageMixin {

    @Inject
    public E4SelectionAwareTabbedPropertySheetPage(ITabbedPropertySheetPageContributor contributor) {
        super(contributor);
    }

    @Inject
    @Named(E4SelectionAwarePropertySheetPageMixin.ADAPTED_PART)
    IWorkbenchPart viewPart;
    
    @Override
    public IWorkbenchPart getAdaptedWorkbenchPart() {
        return viewPart;
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
