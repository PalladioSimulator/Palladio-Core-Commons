/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.stoex.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.stoex.Power;
import de.uka.ipd.sdq.stoex.PowerExpression;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.stoex.Unary;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Power Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.PowerExpressionImpl#getBase <em>Base</em>}</li>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.PowerExpressionImpl#getExponent <em>Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PowerExpressionImpl extends PowerImpl implements PowerExpression {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getBase()
     * @generated
     * @ordered
     */
    protected Power base;

    /**
     * The cached value of the '{@link #getExponent() <em>Exponent</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getExponent()
     * @generated
     * @ordered
     */
    protected Unary exponent;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected PowerExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StoexPackage.Literals.POWER_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Power getBase() {
        return this.base;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetBase(final Power newBase, NotificationChain msgs) {
        final Power oldBase = this.base;
        this.base = newBase;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StoexPackage.POWER_EXPRESSION__BASE, oldBase, newBase);
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
    public void setBase(final Power newBase) {
        if (newBase != this.base) {
            NotificationChain msgs = null;
            if (this.base != null) {
                msgs = ((InternalEObject) this.base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.POWER_EXPRESSION__BASE, null, msgs);
            }
            if (newBase != null) {
                msgs = ((InternalEObject) newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.POWER_EXPRESSION__BASE, null, msgs);
            }
            msgs = this.basicSetBase(newBase, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, StoexPackage.POWER_EXPRESSION__BASE, newBase,
                    newBase));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Unary getExponent() {
        return this.exponent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetExponent(final Unary newExponent, NotificationChain msgs) {
        final Unary oldExponent = this.exponent;
        this.exponent = newExponent;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StoexPackage.POWER_EXPRESSION__EXPONENT, oldExponent, newExponent);
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
    public void setExponent(final Unary newExponent) {
        if (newExponent != this.exponent) {
            NotificationChain msgs = null;
            if (this.exponent != null) {
                msgs = ((InternalEObject) this.exponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.POWER_EXPRESSION__EXPONENT, null, msgs);
            }
            if (newExponent != null) {
                msgs = ((InternalEObject) newExponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.POWER_EXPRESSION__EXPONENT, null, msgs);
            }
            msgs = this.basicSetExponent(newExponent, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, StoexPackage.POWER_EXPRESSION__EXPONENT,
                    newExponent, newExponent));
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
        case StoexPackage.POWER_EXPRESSION__BASE:
            return this.basicSetBase(null, msgs);
        case StoexPackage.POWER_EXPRESSION__EXPONENT:
            return this.basicSetExponent(null, msgs);
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
        case StoexPackage.POWER_EXPRESSION__BASE:
            return this.getBase();
        case StoexPackage.POWER_EXPRESSION__EXPONENT:
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
        case StoexPackage.POWER_EXPRESSION__BASE:
            this.setBase((Power) newValue);
            return;
        case StoexPackage.POWER_EXPRESSION__EXPONENT:
            this.setExponent((Unary) newValue);
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
        case StoexPackage.POWER_EXPRESSION__BASE:
            this.setBase((Power) null);
            return;
        case StoexPackage.POWER_EXPRESSION__EXPONENT:
            this.setExponent((Unary) null);
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
        case StoexPackage.POWER_EXPRESSION__BASE:
            return this.base != null;
        case StoexPackage.POWER_EXPRESSION__EXPONENT:
            return this.exponent != null;
        }
        return super.eIsSet(featureID);
    }

} // PowerExpressionImpl
