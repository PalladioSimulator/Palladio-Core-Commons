/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.units.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.units.Unit;
import de.uka.ipd.sdq.units.UnitPower;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Unit Power</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.units.impl.UnitPowerImpl#getUnit <em>Unit</em>}</li>
 * <li>{@link de.uka.ipd.sdq.units.impl.UnitPowerImpl#getExponent <em>Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitPowerImpl extends UnitImpl implements UnitPower {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUnit()
     * @generated
     * @ordered
     */
    protected Unit unit;

    /**
     * The default value of the '{@link #getExponent() <em>Exponent</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getExponent()
     * @generated
     * @ordered
     */
    protected static final int EXPONENT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getExponent() <em>Exponent</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getExponent()
     * @generated
     * @ordered
     */
    protected int exponent = EXPONENT_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected UnitPowerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UnitsPackage.Literals.UNIT_POWER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Unit getUnit() {
        return this.unit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetUnit(final Unit newUnit, NotificationChain msgs) {
        final Unit oldUnit = this.unit;
        this.unit = newUnit;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    UnitsPackage.UNIT_POWER__UNIT, oldUnit, newUnit);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUnit(final Unit newUnit) {
        if (newUnit != this.unit) {
            NotificationChain msgs = null;
            if (this.unit != null) {
                msgs = ((InternalEObject) this.unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - UnitsPackage.UNIT_POWER__UNIT, null, msgs);
            }
            if (newUnit != null) {
                msgs = ((InternalEObject) newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - UnitsPackage.UNIT_POWER__UNIT, null, msgs);
            }
            msgs = this.basicSetUnit(newUnit, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, UnitsPackage.UNIT_POWER__UNIT, newUnit, newUnit));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getExponent() {
        return this.exponent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setExponent(final int newExponent) {
        final int oldExponent = this.exponent;
        this.exponent = newExponent;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, UnitsPackage.UNIT_POWER__EXPONENT, oldExponent,
                    this.exponent));
        }
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
        case UnitsPackage.UNIT_POWER__UNIT:
            return this.basicSetUnit(null, msgs);
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
        case UnitsPackage.UNIT_POWER__UNIT:
            return this.getUnit();
        case UnitsPackage.UNIT_POWER__EXPONENT:
            return this.getExponent();
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
        case UnitsPackage.UNIT_POWER__UNIT:
            this.setUnit((Unit) newValue);
            return;
        case UnitsPackage.UNIT_POWER__EXPONENT:
            this.setExponent((Integer) newValue);
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
        case UnitsPackage.UNIT_POWER__UNIT:
            this.setUnit((Unit) null);
            return;
        case UnitsPackage.UNIT_POWER__EXPONENT:
            this.setExponent(EXPONENT_EDEFAULT);
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
        case UnitsPackage.UNIT_POWER__UNIT:
            return this.unit != null;
        case UnitsPackage.UNIT_POWER__EXPONENT:
            return this.exponent != EXPONENT_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }

        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (exponent: ");
        result.append(this.exponent);
        result.append(')');
        return result.toString();
    }

} // UnitPowerImpl
