/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.units.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import de.uka.ipd.sdq.units.util.UnitsAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The
 * adapters generated by this factory convert EMF adapter notifications into calls to
 * {@link #fireNotifyChanged fireNotifyChanged}. The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 *
 * @generated
 */
public class UnitsItemProviderAdapterFactory extends UnitsAdapterFactory implements ComposeableAdapterFactory,
        IChangeNotifier, IDisposable {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2007-2017, Palladiosimulator.org";

    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType
     * isFactoryForType}. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public UnitsItemProviderAdapterFactory() {
        this.supportedTypes.add(IEditingDomainItemProvider.class);
        this.supportedTypes.add(IStructuredItemContentProvider.class);
        this.supportedTypes.add(ITreeItemContentProvider.class);
        this.supportedTypes.add(IItemLabelProvider.class);
        this.supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.units.BaseUnit}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected BaseUnitItemProvider baseUnitItemProvider;

    /**
     * This creates an adapter for a {@link de.uka.ipd.sdq.units.BaseUnit}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createBaseUnitAdapter() {
        if (this.baseUnitItemProvider == null) {
            this.baseUnitItemProvider = new BaseUnitItemProvider(this);
        }

        return this.baseUnitItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.units.UnitRepository}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected UnitRepositoryItemProvider unitRepositoryItemProvider;

    /**
     * This creates an adapter for a {@link de.uka.ipd.sdq.units.UnitRepository}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createUnitRepositoryAdapter() {
        if (this.unitRepositoryItemProvider == null) {
            this.unitRepositoryItemProvider = new UnitRepositoryItemProvider(this);
        }

        return this.unitRepositoryItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.uka.ipd.sdq.units.UnitMultiplication} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected UnitMultiplicationItemProvider unitMultiplicationItemProvider;

    /**
     * This creates an adapter for a {@link de.uka.ipd.sdq.units.UnitMultiplication}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createUnitMultiplicationAdapter() {
        if (this.unitMultiplicationItemProvider == null) {
            this.unitMultiplicationItemProvider = new UnitMultiplicationItemProvider(this);
        }

        return this.unitMultiplicationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.units.UnitPower}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected UnitPowerItemProvider unitPowerItemProvider;

    /**
     * This creates an adapter for a {@link de.uka.ipd.sdq.units.UnitPower}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createUnitPowerAdapter() {
        if (this.unitPowerItemProvider == null) {
            this.unitPowerItemProvider = new UnitPowerItemProvider(this);
        }

        return this.unitPowerItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.units.UnitDivision}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected UnitDivisionItemProvider unitDivisionItemProvider;

    /**
     * This creates an adapter for a {@link de.uka.ipd.sdq.units.UnitDivision}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createUnitDivisionAdapter() {
        if (this.unitDivisionItemProvider == null) {
            this.unitDivisionItemProvider = new UnitDivisionItemProvider(this);
        }

        return this.unitDivisionItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return this.parentAdapterFactory == null ? this : this.parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setParentAdapterFactory(final ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object type) {
        return this.supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter adapt(final Notifier notifier, final Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object adapt(final Object object, final Object type) {
        if (this.isFactoryForType(type)) {
            final Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void addListener(final INotifyChangedListener notifyChangedListener) {
        this.changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void removeListener(final INotifyChangedListener notifyChangedListener) {
        this.changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void fireNotifyChanged(final Notification notification) {
        this.changeNotifier.fireNotifyChanged(notification);

        if (this.parentAdapterFactory != null) {
            this.parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public void dispose() {
        if (this.baseUnitItemProvider != null) {
            this.baseUnitItemProvider.dispose();
        }
        if (this.unitRepositoryItemProvider != null) {
            this.unitRepositoryItemProvider.dispose();
        }
        if (this.unitMultiplicationItemProvider != null) {
            this.unitMultiplicationItemProvider.dispose();
        }
        if (this.unitPowerItemProvider != null) {
            this.unitPowerItemProvider.dispose();
        }
        if (this.unitDivisionItemProvider != null) {
            this.unitDivisionItemProvider.dispose();
        }
    }

}
