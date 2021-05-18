package org.palladiosimulator.commons.ui.launch;

import java.util.function.Function;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;

/**
 * This factory interface provides the required capabilities to define mappings between launch configuration attributes and observable variables.
 * 
 * It simplifies creating launch configuration dialogs, as it enables you to use eclipse databindings in your editor logic. 
 * 
 * @author Sebastian Krach
 *
 */
public interface ObservableLaunchConfigurationAttributeFactory {
    @FunctionalInterface
    public static interface AttributeExtractor<T> {
        T apply(ILaunchConfiguration launchConfig, String attributeName, T defaultValue) throws CoreException;
    }

    @FunctionalInterface
    public static interface AttributeSetter<T> {
        void apply(ILaunchConfigurationWorkingCopy launchConfig, String attributeName, T value);
    }

    /**
     * Creates a new generic observable launch configuration attribute
     * 
     * @param <T>
     *            the type of the observable value
     * @param id
     *            the id of the launch configuration attribute
     * @param defaultValue
     *            the default value, if the attribute is not set
     * @param setter
     *            the function to store an instance of the observable value in the launch
     *            configuration object
     * @param getter
     *            the function to get an instance of the observable value from the launch
     *            configuration object
     * @return an observable value.
     */
    <T> IObservableValue<T> createObservableAttribute(String id, T defaultValue, AttributeSetter<T> setter,
            AttributeExtractor<T> getter);

    /**
     * Creates new observable string attribute.
     * 
     * @param id
     *            the id of the string attribute
     * @param defaultValue
     *            the default value
     * @return an observable string value
     */
    IObservableValue<String> createStringAttribute(String id, String defaultValue);
    
    /**
     * Creates new observable integer attribute.
     * 
     * @param id
     *            the id of the integer attribute
     * @param defaultValue
     *            the default value
     * @return an observable integer value
     */
    IObservableValue<Integer> createIntegerAttribute(String id, int defaultValue);
    
    /**
     * Creates new observable boolean attribute.
     * 
     * @param id
     *            the id of the boolean attribute
     * @param defaultValue
     *            the default value
     * @return an observable boolean value
     */
    IObservableValue<Boolean> createBooleanAttribute(String id, boolean defaultValue);

    /**
     * Creates a new observable based on a string launch configuration attribute
     * @param <T> the type of the observable object
     * @param id the id of the string attribute
     * @param defaultValue the default value
     * @param fromLCConverter the converter function from string to the observable object type
     * @param toLCConverter the converter function from the object type to string
     * @return an observable value of the specified type
     */
    <T> IObservableValue<T> createFromStringAttribute(String id, T defaultValue, Function<String, T> fromLCConverter,
            Function<T, String> toLCConverter);

}
