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

import de.uka.ipd.sdq.stoex.BooleanExpression;
import de.uka.ipd.sdq.stoex.IfElseExpression;
import de.uka.ipd.sdq.stoex.StoexPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>If Else Expression</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.IfElseExpressionImpl#getIfExpression <em>If Expression</em>}
 * </li>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.IfElseExpressionImpl#getElseExpression <em>Else Expression
 * </em>}</li>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.IfElseExpressionImpl#getConditionExpression <em>Condition
 * Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfElseExpressionImpl extends IfElseImpl implements IfElseExpression {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * The cached value of the '{@link #getIfExpression() <em>If Expression</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getIfExpression()
     * @generated
     * @ordered
     */
    protected BooleanExpression ifExpression;

    /**
     * The cached value of the '{@link #getElseExpression() <em>Else Expression</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getElseExpression()
     * @generated
     * @ordered
     */
    protected BooleanExpression elseExpression;

    /**
     * The cached value of the '{@link #getConditionExpression() <em>Condition Expression</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getConditionExpression()
     * @generated
     * @ordered
     */
    protected BooleanExpression conditionExpression;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected IfElseExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StoexPackage.Literals.IF_ELSE_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BooleanExpression getIfExpression() {
        return this.ifExpression;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetIfExpression(final BooleanExpression newIfExpression, NotificationChain msgs) {
        final BooleanExpression oldIfExpression = this.ifExpression;
        this.ifExpression = newIfExpression;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StoexPackage.IF_ELSE_EXPRESSION__IF_EXPRESSION, oldIfExpression, newIfExpression);
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
    public void setIfExpression(final BooleanExpression newIfExpression) {
        if (newIfExpression != this.ifExpression) {
            NotificationChain msgs = null;
            if (this.ifExpression != null) {
                msgs = ((InternalEObject) this.ifExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.IF_ELSE_EXPRESSION__IF_EXPRESSION, null, msgs);
            }
            if (newIfExpression != null) {
                msgs = ((InternalEObject) newIfExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.IF_ELSE_EXPRESSION__IF_EXPRESSION, null, msgs);
            }
            msgs = this.basicSetIfExpression(newIfExpression, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, StoexPackage.IF_ELSE_EXPRESSION__IF_EXPRESSION,
                    newIfExpression, newIfExpression));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BooleanExpression getElseExpression() {
        return this.elseExpression;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetElseExpression(final BooleanExpression newElseExpression, NotificationChain msgs) {
        final BooleanExpression oldElseExpression = this.elseExpression;
        this.elseExpression = newElseExpression;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StoexPackage.IF_ELSE_EXPRESSION__ELSE_EXPRESSION, oldElseExpression, newElseExpression);
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
    public void setElseExpression(final BooleanExpression newElseExpression) {
        if (newElseExpression != this.elseExpression) {
            NotificationChain msgs = null;
            if (this.elseExpression != null) {
                msgs = ((InternalEObject) this.elseExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.IF_ELSE_EXPRESSION__ELSE_EXPRESSION, null, msgs);
            }
            if (newElseExpression != null) {
                msgs = ((InternalEObject) newElseExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.IF_ELSE_EXPRESSION__ELSE_EXPRESSION, null, msgs);
            }
            msgs = this.basicSetElseExpression(newElseExpression, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    StoexPackage.IF_ELSE_EXPRESSION__ELSE_EXPRESSION, newElseExpression, newElseExpression));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BooleanExpression getConditionExpression() {
        return this.conditionExpression;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetConditionExpression(final BooleanExpression newConditionExpression,
            NotificationChain msgs) {
        final BooleanExpression oldConditionExpression = this.conditionExpression;
        this.conditionExpression = newConditionExpression;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StoexPackage.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION, oldConditionExpression,
                    newConditionExpression);
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
    public void setConditionExpression(final BooleanExpression newConditionExpression) {
        if (newConditionExpression != this.conditionExpression) {
            NotificationChain msgs = null;
            if (this.conditionExpression != null) {
                msgs = ((InternalEObject) this.conditionExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION, null, msgs);
            }
            if (newConditionExpression != null) {
                msgs = ((InternalEObject) newConditionExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION, null, msgs);
            }
            msgs = this.basicSetConditionExpression(newConditionExpression, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    StoexPackage.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION, newConditionExpression,
                    newConditionExpression));
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
        case StoexPackage.IF_ELSE_EXPRESSION__IF_EXPRESSION:
            return this.basicSetIfExpression(null, msgs);
        case StoexPackage.IF_ELSE_EXPRESSION__ELSE_EXPRESSION:
            return this.basicSetElseExpression(null, msgs);
        case StoexPackage.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION:
            return this.basicSetConditionExpression(null, msgs);
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
        case StoexPackage.IF_ELSE_EXPRESSION__IF_EXPRESSION:
            return this.getIfExpression();
        case StoexPackage.IF_ELSE_EXPRESSION__ELSE_EXPRESSION:
            return this.getElseExpression();
        case StoexPackage.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION:
            return this.getConditionExpression();
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
        case StoexPackage.IF_ELSE_EXPRESSION__IF_EXPRESSION:
            this.setIfExpression((BooleanExpression) newValue);
            return;
        case StoexPackage.IF_ELSE_EXPRESSION__ELSE_EXPRESSION:
            this.setElseExpression((BooleanExpression) newValue);
            return;
        case StoexPackage.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION:
            this.setConditionExpression((BooleanExpression) newValue);
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
        case StoexPackage.IF_ELSE_EXPRESSION__IF_EXPRESSION:
            this.setIfExpression((BooleanExpression) null);
            return;
        case StoexPackage.IF_ELSE_EXPRESSION__ELSE_EXPRESSION:
            this.setElseExpression((BooleanExpression) null);
            return;
        case StoexPackage.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION:
            this.setConditionExpression((BooleanExpression) null);
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
        case StoexPackage.IF_ELSE_EXPRESSION__IF_EXPRESSION:
            return this.ifExpression != null;
        case StoexPackage.IF_ELSE_EXPRESSION__ELSE_EXPRESSION:
            return this.elseExpression != null;
        case StoexPackage.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION:
            return this.conditionExpression != null;
        }
        return super.eIsSet(featureID);
    }

} // IfElseExpressionImpl
