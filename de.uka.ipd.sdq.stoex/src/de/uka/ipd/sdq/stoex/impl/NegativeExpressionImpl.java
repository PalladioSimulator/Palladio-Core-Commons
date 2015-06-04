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

import de.uka.ipd.sdq.stoex.NegativeExpression;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.stoex.Unary;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Negative Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.NegativeExpressionImpl#getInner <em>Inner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NegativeExpressionImpl extends UnaryImpl implements NegativeExpression {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";
    /**
     * The cached value of the '{@link #getInner() <em>Inner</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getInner()
     * @generated
     * @ordered
     */
    protected Unary inner;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected NegativeExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StoexPackage.Literals.NEGATIVE_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Unary getInner() {
        return this.inner;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetInner(final Unary newInner, NotificationChain msgs) {
        final Unary oldInner = this.inner;
        this.inner = newInner;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StoexPackage.NEGATIVE_EXPRESSION__INNER, oldInner, newInner);
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
    public void setInner(final Unary newInner) {
        if (newInner != this.inner) {
            NotificationChain msgs = null;
            if (this.inner != null) {
                msgs = ((InternalEObject) this.inner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.NEGATIVE_EXPRESSION__INNER, null, msgs);
            }
            if (newInner != null) {
                msgs = ((InternalEObject) newInner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.NEGATIVE_EXPRESSION__INNER, null, msgs);
            }
            msgs = this.basicSetInner(newInner, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, StoexPackage.NEGATIVE_EXPRESSION__INNER,
                    newInner, newInner));
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
        case StoexPackage.NEGATIVE_EXPRESSION__INNER:
            return this.basicSetInner(null, msgs);
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
        case StoexPackage.NEGATIVE_EXPRESSION__INNER:
            return this.getInner();
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
        case StoexPackage.NEGATIVE_EXPRESSION__INNER:
            this.setInner((Unary) newValue);
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
        case StoexPackage.NEGATIVE_EXPRESSION__INNER:
            this.setInner((Unary) null);
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
        case StoexPackage.NEGATIVE_EXPRESSION__INNER:
            return this.inner != null;
        }
        return super.eIsSet(featureID);
    }

} // NegativeExpressionImpl
