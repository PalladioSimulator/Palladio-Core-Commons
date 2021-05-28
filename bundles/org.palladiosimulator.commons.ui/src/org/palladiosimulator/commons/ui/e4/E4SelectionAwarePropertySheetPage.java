package org.palladiosimulator.commons.ui.e4;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.PropertySheetPage;

public class E4SelectionAwarePropertySheetPage extends PropertySheetPage implements E4SelectionAwarePropertySheetPageMixin {
    
    @Inject
    @Named(E4SelectionAwarePropertySheetPageMixin.ADAPTED_PART)
    IWorkbenchPart viewPart;
    
    @Override
    public IWorkbenchPart getAdaptedWorkbenchPart() {
        return viewPart;
    }
    
}
