package org.palladiosimulator.commons.ui.launch;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractDataBindingLaunchConfigurationTab extends AbstractLaunchConfigurationTab {

    private ObservableLaunchConfigurationAdapter launchConfigAdapter;
    
    abstract protected void registerDataBindings(ObservableLaunchConfigurationAttributeFactory attributeFactory);
    
    @Override
    public void createControl(Composite parent) {
        getLaunchConfigAdapter();
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
            registerDataBindings(launchConfigAdapter);
            launchConfigAdapter.notifyWhenDirty(() -> {
                setDirty(true);
                updateLaunchConfigurationDialog();
            });
        }
        return launchConfigAdapter;
    }
    
}
