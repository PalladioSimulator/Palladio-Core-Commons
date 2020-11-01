package org.palladiosimulator.commons.stoex.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.palladiosimulator.commons.stoex.ui.dialog.StoExEditDialogFactory;
import org.palladiosimulator.commons.stoex.ui.dialog.impl.StoExEditDialogFactoryImpl;
import org.palladiosimulator.commons.stoex.ui.dialog.impl.StoexEditedResourceProvider;

@SuppressWarnings("restriction")
public class StoexUiModule extends AbstractStoexUiModule {

    public StoexUiModule(final AbstractUIPlugin plugin) {
        super(plugin);
    }

    public Class<? extends StoExEditDialogFactory> bindStoExEditDialogFactory() {
        return StoExEditDialogFactoryImpl.class;
    }

    public Class<? extends IEditedResourceProvider> bindIEditedResourceProvider() {
        return StoexEditedResourceProvider.class;
    }

}