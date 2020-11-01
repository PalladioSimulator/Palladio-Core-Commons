package org.palladiosimulator.commons.stoex.ui.internal;

import org.palladiosimulator.commons.stoex.ui.dialog.StoExEditDialogFactory;

public class CustomStoexActivator extends StoexActivator {

    private StoExEditDialogFactory editDialogFactory;
    
    public StoExEditDialogFactory getEditDialogFactory() {
        if (editDialogFactory == null) {
            final var injector = getInjector(ORG_PALLADIOSIMULATOR_COMMONS_STOEX_STOEX);
            editDialogFactory = injector.getInstance(StoExEditDialogFactory.class);
        }
        return editDialogFactory;
    }
    
}
