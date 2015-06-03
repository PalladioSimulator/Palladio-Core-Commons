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
import de.uka.ipd.sdq.stoex.BooleanOperations;
import de.uka.ipd.sdq.stoex.BooleanOperatorExpression;
import de.uka.ipd.sdq.stoex.StoexPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Boolean Operator Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.BooleanOperatorExpressionImpl#getLeft <em>Left</em>}</li>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.BooleanOperatorExpressionImpl#getRight <em>Right</em>}</li>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.BooleanOperatorExpressionImpl#getOperation <em>Operation
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanOperatorExpressionImpl extends BooleanExpressionImpl implements BooleanOperatorExpression {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getLeft()
     * @generated
     * @ordered
     */
    protected BooleanExpression left;

    /**
     * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRight()
     * @generated
     * @ordered
     */
    protected BooleanExpression right;

    /**
     * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getOperation()
     * @generated
     * @ordered
     */
    protected static final BooleanOperations OPERATION_EDEFAULT = BooleanOperations.AND;

    /**
     * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getOperation()
     * @generated
     * @ordered
     */
    protected BooleanOperations operation = OPERATION_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected BooleanOperatorExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StoexPackage.Literals.BOOLEAN_OPERATOR_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BooleanExpression getLeft() {
        return this.left;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetLeft(final BooleanExpression newLeft, NotificationChain msgs) {
        final BooleanExpression oldLeft = this.left;
        this.left = newLeft;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__LEFT, oldLeft, newLeft);
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
    public void setLeft(final BooleanExpression newLeft) {
        if (newLeft != this.left) {
            NotificationChain msgs = null;
            if (this.left != null) {
                msgs = ((InternalEObject) this.left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__LEFT, null, msgs);
            }
            if (newLeft != null) {
                msgs = ((InternalEObject) newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__LEFT, null, msgs);
            }
            msgs = this.basicSetLeft(newLeft, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__LEFT,
                    newLeft, newLeft));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BooleanExpression getRight() {
        return this.right;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetRight(final BooleanExpression newRight, NotificationChain msgs) {
        final BooleanExpression oldRight = this.right;
        this.right = newRight;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__RIGHT, oldRight, newRight);
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
    public void setRight(final BooleanExpression newRight) {
        if (newRight != this.right) {
            NotificationChain msgs = null;
            if (this.right != null) {
                msgs = ((InternalEObject) this.right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__RIGHT, null, msgs);
            }
            if (newRight != null) {
                msgs = ((InternalEObject) newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__RIGHT, null, msgs);
            }
            msgs = this.basicSetRight(newRight, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__RIGHT,
                    newRight, newRight));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BooleanOperations getOperation() {
        return this.operation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setOperation(final BooleanOperations newOperation) {
        final BooleanOperations oldOperation = this.operation;
        this.operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__OPERATION, oldOperation, this.operation));
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
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__LEFT:
            return this.basicSetLeft(null, msgs);
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__RIGHT:
            return this.basicSetRight(null, msgs);
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
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__LEFT:
            return this.getLeft();
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__RIGHT:
            return this.getRight();
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__OPERATION:
            return this.getOperation();
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
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__LEFT:
            this.setLeft((BooleanExpression) newValue);
            return;
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__RIGHT:
            this.setRight((BooleanExpression) newValue);
            return;
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__OPERATION:
            this.setOperation((BooleanOperations) newValue);
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
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__LEFT:
            this.setLeft((BooleanExpression) null);
            return;
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__RIGHT:
            this.setRight((BooleanExpression) null);
            return;
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__OPERATION:
            this.setOperation(OPERATION_EDEFAULT);
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
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__LEFT:
            return this.left != null;
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__RIGHT:
            return this.right != null;
        case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION__OPERATION:
            return this.operation != OPERATION_EDEFAULT;
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
        result.append(" (operation: ");
        result.append(this.operation);
        result.append(')');
        return result.toString();
    }

} // BooleanOperatorExpressionImpl
