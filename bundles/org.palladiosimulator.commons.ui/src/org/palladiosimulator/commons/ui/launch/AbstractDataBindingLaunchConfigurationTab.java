package org.palladiosimulator.commons.ui.launch;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.widgets.Composite;

/**
 * This abstract super class integrates the observable launch configuration adapter with the launch
 * configuration tab hierarchy.
 * 
 * It simplifies creating launch configuration dialogs, as it relieves you from implementing the
 * same validation logic multiple times.
 * 
 * Instead of implementing
 * {@code AbstractLaunchConfigurationTab#initializeFrom(ILaunchConfiguration)},
 * {@code AbstractLaunchConfigurationTab#performApply(ILaunchConfigurationWorkingCopy)} and
 * {@code AbstractLaunchConfigurationTab#setDefaults(ILaunchConfigurationWorkingCopy)}, registry the
 * required bindings, already providing sensible defaults through
 * {@link #registerDataBindings(ObservableLaunchConfigurationAttributeFactory)}.
 * 
 * Please note, that due to the way, the launch configurations work, the data bindings need to be
 * registered before the controls are created. To bind your UI elements to launch configuration
 * properties, please store the observable value references as class attributes.
 * 
 * @author Sebastian Krach
 *
 */
public abstract class AbstractDataBindingLaunchConfigurationTab extends AbstractLaunchConfigurationTab {

    private ObservableLaunchConfigurationAdapter launchConfigAdapter;
    private DataBindingContext dbc;

    abstract protected void registerDataBindings(ObservableLaunchConfigurationAttributeFactory attributeFactory, DataBindingContext bindingContext);

    abstract protected void createControlInternal(Composite parent, DataBindingContext bindingContext);

    @Override
    public final void createControl(Composite parent) {
        setDirty(false);
        getLaunchConfigAdapter();
        
        assert dbc != null;
        createControlInternal(parent, dbc);
    }

    @Override
    public void initializeFrom(final ILaunchConfiguration configuration) {
        getLaunchConfigAdapter().initializeFrom(configuration);
    }

    @Override
    public void performApply(final ILaunchConfigurationWorkingCopy configuration) {
        getLaunchConfigAdapter().performApply(configuration);
    }

    @Override
    public void setDefaults(final ILaunchConfigurationWorkingCopy configuration) {
        getLaunchConfigAdapter().setDefaults(configuration);
    }

    @Override
    public void activated(final ILaunchConfigurationWorkingCopy workingCopy) {
    }

    @Override
    public void deactivated(final ILaunchConfigurationWorkingCopy workingCopy) {
    }

    private ObservableLaunchConfigurationAdapter getLaunchConfigAdapter() {
        if (launchConfigAdapter == null) {
            launchConfigAdapter = new ObservableLaunchConfigurationAdapter();
            dbc = new DataBindingContext();
            registerDataBindings(launchConfigAdapter, dbc);
            launchConfigAdapter.notifyWhenDirty(() -> {
                setDirty(true);
                updateLaunchConfigurationDialog();
            });
        }
        return launchConfigAdapter;
    }

}
