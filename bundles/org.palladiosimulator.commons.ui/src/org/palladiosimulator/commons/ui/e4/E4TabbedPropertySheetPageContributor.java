package org.palladiosimulator.commons.ui.e4;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import org.eclipse.eef.properties.ui.api.IEEFTabbedPropertySheetPageContributor;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

/**
 * This class allows to easily implement a tabbed property sheet page contributor.
 * 
 * Simply set it to the IEclipseContext as either {@link IEEFTabbedPropertySheetPageContributor} or
 * {@link ITabbedPropertySheetPageContributor} before creating the adapter.
 * 
 * Furthermore, set the parameter identified by
 * {@link E4TabbedPropertySheetPageContributor#CONTRIBUTOR_ID} to the contributor id of your
 * extension.
 * 
 * @author Sebastian Krach
 *
 */
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
