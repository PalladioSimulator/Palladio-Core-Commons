package org.palladiosimulator.commons.ui.e4;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.eef.properties.ui.api.IEEFTabbedPropertySheetPageContributor;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

public class E4TabbedPropertySheetPageContributor
        implements IEEFTabbedPropertySheetPageContributor, ITabbedPropertySheetPageContributor {
    
    public static final String CONTRIBUTOR_ID = "E4TabbedPropertySheetPageContributor.CONTRIBUTOR_ID";
    
    @Inject
    ComposedAdapterFactory adapterFactory;
    
    @Inject
    @Named(CONTRIBUTOR_ID)
    String contributorId;

    @Override
    public String getContributorId() {
        return contributorId;
    }

    @Override
    public void updateFormTitle(Form form, ISelection selection) {
        if (!selection.isEmpty() && selection instanceof IStructuredSelection) {
            var selected = ((IStructuredSelection) selection).getFirstElement();
            var labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
            
            if (labelProvider != null) {
                form.setText(labelProvider.getText(selected));
                form.setImage(labelProvider.getImage(selected));
            }
        }
    }

}
