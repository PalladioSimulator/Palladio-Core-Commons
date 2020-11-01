package org.palladiosimulator.commons.stoex.ui.dialog;

import org.eclipse.swt.widgets.Shell;
import org.palladiosimulator.commons.stoex.ui.internal.CustomStoexActivator;

import de.uka.ipd.sdq.stoex.analyser.visitors.TypeEnum;

public interface StoExEditDialogFactory {

    StoExEditDialog create(Shell parentShell, TypeEnum expectedType);  
    
    public static StoExEditDialogFactory getInstance() {
        return ((CustomStoexActivator)CustomStoexActivator.getInstance()).getEditDialogFactory();
    }
}
