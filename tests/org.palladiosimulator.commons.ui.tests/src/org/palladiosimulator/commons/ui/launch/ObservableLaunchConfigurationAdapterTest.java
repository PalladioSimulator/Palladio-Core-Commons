package org.palladiosimulator.commons.ui.launch;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tools.mdsd.junit5utils.annotations.PluginTestOnly;

@PluginTestOnly
class ObservableLaunchConfigurationAdapterTest {
    public static final String TEST_CONFIGURATION_TYPE = "org.palladiosimulator.commons.ui.tests.observableLaunchType";
    public static final String ATTRIBUTE_1= "attribute1";
    public static final String ATTRIBUTE_2= "attribute2";
    public static final String ATTRIBUTE_3= "attribute3";
    public static final String ATTRIBUTE_4= "attribute4";
    
    ObservableLaunchConfigurationAdapter adapter;
    ILaunchManager manager;
    ILaunchConfigurationType launchType;

    @BeforeEach
    void initAdapter() {
        manager = DebugPlugin.getDefault().getLaunchManager();
        launchType = manager.getLaunchConfigurationType(TEST_CONFIGURATION_TYPE);
        
        this.adapter = new ObservableLaunchConfigurationAdapter();
    }

    @Test
    void testDefaultInitializeWrite() throws CoreException {
        var launch = launchType.newInstance(null, "test1");
        assertThat(launch, is(not(nullValue())));
        
        launch.setAttribute(ATTRIBUTE_1, "value1");
        launch.setAttribute(ATTRIBUTE_2, 5);
        launch.setAttribute(ATTRIBUTE_3, true);
        
        var observableAttribute1 = adapter.createStringAttribute(ATTRIBUTE_1, "default");
        var observableAttribute2 = adapter.createIntegerAttribute(ATTRIBUTE_2, 10);
        var observableAttribute3 = adapter.createBooleanAttribute(ATTRIBUTE_3, false);
        
        // Test defaults
        assertThat(observableAttribute1.getValue(), is(equalTo("default")));
        assertThat(observableAttribute2.getValue(), is(equalTo(10)));
        assertThat(observableAttribute3.getValue(), is(equalTo(false)));
        
        adapter.initializeFrom(launch);
        
        // Test initialize
        assertThat(observableAttribute1.getValue(), is(equalTo("value1")));
        assertThat(observableAttribute2.getValue(), is(equalTo(5)));
        assertThat(observableAttribute3.getValue(), is(equalTo(true)));
        
        // Test write
        observableAttribute1.setValue("value2");
        adapter.performApply(launch);
        assertThat(launch.getAttribute(ATTRIBUTE_1, ""), is(equalTo("value2")));
    }

}
