/**
 * Copyright 2007-2009, SDQ, IPD, U Karlsruhe
 */
package de.uka.ipd.sdq.units.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.units.Unit;
import de.uka.ipd.sdq.units.UnitDivision;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Unit Division</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.units.impl.UnitDivisionImpl#getDividend <em>Dividend</em>}</li>
 * <li>{@link de.uka.ipd.sdq.units.impl.UnitDivisionImpl#getDivisor <em>Divisor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitDivisionImpl extends UnitImpl implements UnitDivision {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * The cached value of the '{@link #getDividend() <em>Dividend</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDividend()
     * @generated
     * @ordered
     */
    protected Unit dividend;

    /**
     * The cached value of the '{@link #getDivisor() <em>Divisor</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDivisor()
     * @generated
     * @ordered
     */
    protected Unit divisor;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected UnitDivisionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UnitsPackage.Literals.UNIT_DIVISION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Unit getDividend() {
        return dividend;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetDividend(Unit newDividend, NotificationChain msgs) {
        Unit oldDividend = dividend;
        dividend = newDividend;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    UnitsPackage.UNIT_DIVISION__DIVIDEND, oldDividend, newDividend);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setDividend(Unit newDividend) {
        if (newDividend != dividend) {
            NotificationChain msgs = null;
            if (dividend != null)
                msgs = ((InternalEObject) dividend).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - UnitsPackage.UNIT_DIVISION__DIVIDEND, null, msgs);
            if (newDividend != null)
                msgs = ((InternalEObject) newDividend).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - UnitsPackage.UNIT_DIVISION__DIVIDEND, null, msgs);
            msgs = basicSetDividend(newDividend, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UnitsPackage.UNIT_DIVISION__DIVIDEND, newDividend,
                    newDividend));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Unit getDivisor() {
        return divisor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetDivisor(Unit newDivisor, NotificationChain msgs) {
        Unit oldDivisor = divisor;
        divisor = newDivisor;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    UnitsPackage.UNIT_DIVISION__DIVISOR, oldDivisor, newDivisor);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setDivisor(Unit newDivisor) {
        if (newDivisor != divisor) {
            NotificationChain msgs = null;
            if (divisor != null)
                msgs = ((InternalEObject) divisor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - UnitsPackage.UNIT_DIVISION__DIVISOR, null, msgs);
            if (newDivisor != null)
                msgs = ((InternalEObject) newDivisor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - UnitsPackage.UNIT_DIVISION__DIVISOR, null, msgs);
            msgs = basicSetDivisor(newDivisor, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UnitsPackage.UNIT_DIVISION__DIVISOR, newDivisor,
                    newDivisor));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case UnitsPackage.UNIT_DIVISION__DIVIDEND:
            return basicSetDividend(null, msgs);
        case UnitsPackage.UNIT_DIVISION__DIVISOR:
            return basicSetDivisor(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case UnitsPackage.UNIT_DIVISION__DIVIDEND:
            return getDividend();
        case UnitsPackage.UNIT_DIVISION__DIVISOR:
            return getDivisor();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case UnitsPackage.UNIT_DIVISION__DIVIDEND:
            setDividend((Unit) newValue);
            return;
        case UnitsPackage.UNIT_DIVISION__DIVISOR:
            setDivisor((Unit) newValue);
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
    public void eUnset(int featureID) {
        switch (featureID) {
        case UnitsPackage.UNIT_DIVISION__DIVIDEND:
            setDividend((Unit) null);
            return;
        case UnitsPackage.UNIT_DIVISION__DIVISOR:
            setDivisor((Unit) null);
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
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case UnitsPackage.UNIT_DIVISION__DIVIDEND:
            return dividend != null;
        case UnitsPackage.UNIT_DIVISION__DIVISOR:
            return divisor != null;
        }
        return super.eIsSet(featureID);
    }

} // UnitDivisionImpl
