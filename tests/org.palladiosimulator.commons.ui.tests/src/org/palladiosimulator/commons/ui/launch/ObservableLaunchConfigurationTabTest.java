package org.palladiosimulator.commons.ui.launch;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.palladiosimulator.commons.ui.launch.ObservableLaunchConfigurationAdapterTest.ATTRIBUTE_1;
import static org.palladiosimulator.commons.ui.launch.ObservableLaunchConfigurationAdapterTest.ATTRIBUTE_2;
import static org.palladiosimulator.commons.ui.launch.ObservableLaunchConfigurationAdapterTest.ATTRIBUTE_3;
import static org.palladiosimulator.commons.ui.launch.ObservableLaunchConfigurationAdapterTest.ATTRIBUTE_4;
import static org.palladiosimulator.commons.ui.launch.ObservableLaunchConfigurationAdapterTest.TEST_CONFIGURATION_TYPE;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import tools.mdsd.junit5utils.annotations.PluginTestOnly;

@PluginTestOnly
@ExtendWith(DefaultRealmExtension.class)
class ObservableLaunchConfigurationTabTest extends AbstractDataBindingLaunchConfigurationTab {
    IObservableValue<String> stringAttribute;
    IObservableValue<Integer> intAttribute;
    IObservableValue<Boolean> boolAttribute;
    IObservableValue<URI> uriAttribute;
    
    ILaunchManager manager;
    ILaunchConfigurationType launchType;
    
    @BeforeEach
    void init() {
        this.createControl(null);
        
        manager = DebugPlugin.getDefault().getLaunchManager();
        launchType = manager.getLaunchConfigurationType(TEST_CONFIGURATION_TYPE);
    }

    @Test
    void testSetDirty() throws CoreException {
        var launch = launchType.newInstance(null, "testSetDirty");
        assertThat(launch, is(not(nullValue())));
        
        launch.setAttribute(ATTRIBUTE_1, "value1");
        
        this.initializeFrom(launch);
        assertThat(this.isDirty(), is(false));
        
        stringAttribute.setValue("value has changed");
        
        // The processing is usually done on the UI Thread of the Eclipse IDE
        while (Display.getCurrent().readAndDispatch());
        
        assertThat(this.isDirty(), is(true));
    }
    
    @Test
    void testSetValues() throws CoreException {
        var launch = launchType.newInstance(null, "testSetValues");
        assertThat(launch, is(not(nullValue())));
        
        launch.setAttribute(ATTRIBUTE_1, "value1");
        launch.setAttribute(ATTRIBUTE_2, 5);
        launch.setAttribute(ATTRIBUTE_3, true);
        
        this.initializeFrom(launch);
        
        stringAttribute.setValue("newValue");
        intAttribute.setValue(200);
        boolAttribute.setValue(true);
        uriAttribute.setValue(URI.createURI("file:///test.log"));
        
        this.performApply(launch);
        assertThat(launch.getAttribute(ATTRIBUTE_1, ""), is(equalTo("newValue")));
        assertThat(launch.getAttribute(ATTRIBUTE_2, 0), is(equalTo(200)));
        assertThat(launch.getAttribute(ATTRIBUTE_3, false), is(equalTo(true)));
        assertThat(launch.getAttribute(ATTRIBUTE_4, ""), is(equalTo("file:///test.log")));
    }

    @Override
    public String getName() {
        return "TestTab";
    }

    @Override
    protected void registerDataBindings(ObservableLaunchConfigurationAttributeFactory attributeFactory,
            DataBindingContext bindingContext) {
        stringAttribute = attributeFactory.createStringAttribute(ATTRIBUTE_1, "");
        intAttribute = attributeFactory.createIntegerAttribute(ATTRIBUTE_2, 2);
        boolAttribute = attributeFactory.createBooleanAttribute(ATTRIBUTE_3, false);
        uriAttribute = attributeFactory.createFromStringAttribute(ATTRIBUTE_4, 
                URI.createURI("http://www.palladio-simulator.com"), URI::createURI, URI::toString);
    }

    @Override
    protected void createControlInternal(Composite parent, DataBindingContext bindingContext) {
        // Nothing to do here, as this in not actually a dialog.
    }

}
