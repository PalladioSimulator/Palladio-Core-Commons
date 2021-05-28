package org.palladiosimulator.commons.ui.launch;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

import org.eclipse.core.databinding.observable.sideeffect.ISideEffect;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;

/**
 * This class serves as generic bridge between Eclipse Launch Configurations and the Eclipse databinding framework.
 * 
 * For details on its usage, please see {@link ObservableLaunchConfigurationAttributeFactory}.
 * 
 * @author Sebastian Krach
 *
 */
public class ObservableLaunchConfigurationAdapter implements ObservableLaunchConfigurationAttributeFactory {
    protected final Map<String, Consumer<ILaunchConfigurationWorkingCopy>> lcUpdates = new HashMap<>();
    protected final Map<String, Consumer<ILaunchConfiguration>> mUpdates = new HashMap<>();
    protected final Map<String, Consumer<ILaunchConfigurationWorkingCopy>> defaults = new HashMap<>();
    protected final Map<String, IObservableValue<?>> observables = new HashMap<>();
    private ISideEffect dirtyNotificationEffect;
    private Runnable dirtyNotification;
    private volatile boolean isInitialization = false;

    public void notifyWhenDirty(Runnable dirtyNotification) {
        this.dirtyNotification = dirtyNotification;
    }

    /**
     * Initialize values from {@link ILaunchConfiguration}.
     * 
     * @see AbstractLaunchConfigurationTab#initializeFrom(ILaunchConfiguration)
     */
    public void initializeFrom(final ILaunchConfiguration configuration) {
        if (dirtyNotificationEffect != null) {
            dirtyNotificationEffect.dispose();
        }
        mUpdates.values()
            .forEach(c -> c.accept(configuration));
        isInitialization = true;
        dirtyNotificationEffect = ISideEffect.create(() -> {
            observables.values()
                .forEach(IObservableValue::getValue);
            if (dirtyNotification != null && !isInitialization) {
                dirtyNotification.run();
            }
        });
        isInitialization = false;
    }

    /**
     * Apply changes to {@link ILaunchConfigurationWorkingCopy}
     * 
     * @see AbstractLaunchConfigurationTab#performApply(ILaunchConfigurationWorkingCopy)
     * 
     */
    public void performApply(ILaunchConfigurationWorkingCopy workingCopy) {
        lcUpdates.values()
            .forEach(c -> c.accept(workingCopy));
    }

    /**
     * Initialize launch configuration with defaults.
     * 
     * @see AbstractLaunchConfigurationTab#setDefaults(ILaunchConfigurationWorkingCopy)
     */
    public void setDefaults(final ILaunchConfigurationWorkingCopy configuration) {
        defaults.values()
            .forEach(c -> c.accept(configuration));
    }

    @Override
    public IObservableValue<String> createStringAttribute(String id, String defaultValue) {
        // We do have to duplicate code here, to guarantee statical correctness (get/setAttribute is
        // references in the string version)
        return createObservableAttribute(id, defaultValue, ILaunchConfigurationWorkingCopy::setAttribute,
                ILaunchConfiguration::getAttribute);
    }

    @Override
    public IObservableValue<Integer> createIntegerAttribute(String id, int defaultValue) {
        // We do have to duplicate code here, to guarantee statical correctness (get/setAttribute is
        // references in the int version)
        return createObservableAttribute(id, defaultValue, ILaunchConfigurationWorkingCopy::setAttribute,
                ILaunchConfiguration::getAttribute);
    }

    @Override
    public IObservableValue<Boolean> createBooleanAttribute(String id, boolean defaultValue) {
        // We do have to duplicate code here, to guarantee statical correctness (get/setAttribute is
        // references in the boolean version)
        return createObservableAttribute(id, defaultValue, ILaunchConfigurationWorkingCopy::setAttribute,
                ILaunchConfiguration::getAttribute);
    }

    @Override
    public <T> IObservableValue<T> createFromStringAttribute(String id, T defaultValue,
            Function<String, T> fromLCConverter, Function<T, String> toLCConverter) {
        AttributeSetter<T> setter = (lc, i, val) -> lc.setAttribute(i, toLCConverter.apply(val));
        AttributeExtractor<T> getter = (lc, i, val) -> fromLCConverter
            .apply(lc.getAttribute(i, toLCConverter.apply(val)));
        return createObservableAttribute(id, defaultValue, setter, getter);
    }

    @Override
    public <T> IObservableValue<T> createObservableAttribute(String id, T defaultValue, AttributeSetter<T> setter,
            AttributeExtractor<T> getter) {
        var result = new WritableValue<T>(defaultValue, null);
        result.addChangeListener((ev) -> {
            lcUpdates.put(id, wc -> setter.apply(wc, id, result.getValue()));
        });
        mUpdates.put(id, lc -> {
            T value = defaultValue;
            try {
                value = getter.apply(lc, id, defaultValue);
            } catch (CoreException e) {
            }
            result.setValue(value);
        });
        defaults.put(id, lc -> {
            setter.apply(lc, id, defaultValue);
        });
        observables.put(id, result);
        result.addDisposeListener(ev -> {
            lcUpdates.remove(id);
            mUpdates.remove(id);
            defaults.remove(id);
            observables.remove(id);
        });
        return result;
    }

}
