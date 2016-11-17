/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.units.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import de.uka.ipd.sdq.units.Unit;
import de.uka.ipd.sdq.units.UnitCarryingElement;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Unit Carrying
 * Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.uka.ipd.sdq.units.impl.UnitCarryingElementImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UnitCarryingElementImpl extends CDOObjectImpl implements UnitCarryingElement {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2017, Palladiosimulator.org";

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected UnitCarryingElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UnitsPackage.Literals.UNIT_CARRYING_ELEMENT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Unit getUnit() {
        return (Unit) this.eDynamicGet(UnitsPackage.UNIT_CARRYING_ELEMENT__UNIT,
                UnitsPackage.Literals.UNIT_CARRYING_ELEMENT__UNIT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetUnit(final Unit newUnit, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newUnit, UnitsPackage.UNIT_CARRYING_ELEMENT__UNIT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setUnit(final Unit newUnit) {
        this.eDynamicSet(UnitsPackage.UNIT_CARRYING_ELEMENT__UNIT, UnitsPackage.Literals.UNIT_CARRYING_ELEMENT__UNIT,
                newUnit);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicUnsetUnit(final NotificationChain msgs) {
        return this.eDynamicInverseRemove((InternalEObject) this.getUnit(), UnitsPackage.UNIT_CARRYING_ELEMENT__UNIT,
                msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void unsetUnit() {
        this.eDynamicUnset(UnitsPackage.UNIT_CARRYING_ELEMENT__UNIT, UnitsPackage.Literals.UNIT_CARRYING_ELEMENT__UNIT);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean isSetUnit() {
        return this.eDynamicIsSet(UnitsPackage.UNIT_CARRYING_ELEMENT__UNIT,
                UnitsPackage.Literals.UNIT_CARRYING_ELEMENT__UNIT);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case UnitsPackage.UNIT_CARRYING_ELEMENT__UNIT:
            return this.basicUnsetUnit(msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case UnitsPackage.UNIT_CARRYING_ELEMENT__UNIT:
            return this.getUnit();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case UnitsPackage.UNIT_CARRYING_ELEMENT__UNIT:
            this.setUnit((Unit) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case UnitsPackage.UNIT_CARRYING_ELEMENT__UNIT:
            this.unsetUnit();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case UnitsPackage.UNIT_CARRYING_ELEMENT__UNIT:
            return this.isSetUnit();
        }
        return super.eIsSet(featureID);
    }

} // UnitCarryingElementImpl
