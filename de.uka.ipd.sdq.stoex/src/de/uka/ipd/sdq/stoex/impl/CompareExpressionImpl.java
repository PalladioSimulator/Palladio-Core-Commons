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

import de.uka.ipd.sdq.stoex.CompareExpression;
import de.uka.ipd.sdq.stoex.CompareOperations;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.stoex.Term;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Compare Expression</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.CompareExpressionImpl#getLeft <em>Left</em>}</li>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.CompareExpressionImpl#getRight <em>Right</em>}</li>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.CompareExpressionImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompareExpressionImpl extends ComparisonImpl implements CompareExpression {

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
    protected Term left;

    /**
     * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRight()
     * @generated
     * @ordered
     */
    protected Term right;

    /**
     * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getOperation()
     * @generated
     * @ordered
     */
    protected static final CompareOperations OPERATION_EDEFAULT = CompareOperations.GREATER;

    /**
     * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getOperation()
     * @generated
     * @ordered
     */
    protected CompareOperations operation = OPERATION_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CompareExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StoexPackage.Literals.COMPARE_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Term getLeft() {
        return this.left;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetLeft(final Term newLeft, NotificationChain msgs) {
        final Term oldLeft = this.left;
        this.left = newLeft;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StoexPackage.COMPARE_EXPRESSION__LEFT, oldLeft, newLeft);
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
    public void setLeft(final Term newLeft) {
        if (newLeft != this.left) {
            NotificationChain msgs = null;
            if (this.left != null) {
                msgs = ((InternalEObject) this.left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.COMPARE_EXPRESSION__LEFT, null, msgs);
            }
            if (newLeft != null) {
                msgs = ((InternalEObject) newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.COMPARE_EXPRESSION__LEFT, null, msgs);
            }
            msgs = this.basicSetLeft(newLeft, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, StoexPackage.COMPARE_EXPRESSION__LEFT, newLeft,
                    newLeft));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Term getRight() {
        return this.right;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetRight(final Term newRight, NotificationChain msgs) {
        final Term oldRight = this.right;
        this.right = newRight;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StoexPackage.COMPARE_EXPRESSION__RIGHT, oldRight, newRight);
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
    public void setRight(final Term newRight) {
        if (newRight != this.right) {
            NotificationChain msgs = null;
            if (this.right != null) {
                msgs = ((InternalEObject) this.right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.COMPARE_EXPRESSION__RIGHT, null, msgs);
            }
            if (newRight != null) {
                msgs = ((InternalEObject) newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.COMPARE_EXPRESSION__RIGHT, null, msgs);
            }
            msgs = this.basicSetRight(newRight, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, StoexPackage.COMPARE_EXPRESSION__RIGHT,
                    newRight, newRight));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public CompareOperations getOperation() {
        return this.operation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setOperation(final CompareOperations newOperation) {
        final CompareOperations oldOperation = this.operation;
        this.operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, StoexPackage.COMPARE_EXPRESSION__OPERATION,
                    oldOperation, this.operation));
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
        case StoexPackage.COMPARE_EXPRESSION__LEFT:
            return this.basicSetLeft(null, msgs);
        case StoexPackage.COMPARE_EXPRESSION__RIGHT:
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
        case StoexPackage.COMPARE_EXPRESSION__LEFT:
            return this.getLeft();
        case StoexPackage.COMPARE_EXPRESSION__RIGHT:
            return this.getRight();
        case StoexPackage.COMPARE_EXPRESSION__OPERATION:
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
        case StoexPackage.COMPARE_EXPRESSION__LEFT:
            this.setLeft((Term) newValue);
            return;
        case StoexPackage.COMPARE_EXPRESSION__RIGHT:
            this.setRight((Term) newValue);
            return;
        case StoexPackage.COMPARE_EXPRESSION__OPERATION:
            this.setOperation((CompareOperations) newValue);
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
        case StoexPackage.COMPARE_EXPRESSION__LEFT:
            this.setLeft((Term) null);
            return;
        case StoexPackage.COMPARE_EXPRESSION__RIGHT:
            this.setRight((Term) null);
            return;
        case StoexPackage.COMPARE_EXPRESSION__OPERATION:
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
        case StoexPackage.COMPARE_EXPRESSION__LEFT:
            return this.left != null;
        case StoexPackage.COMPARE_EXPRESSION__RIGHT:
            return this.right != null;
        case StoexPackage.COMPARE_EXPRESSION__OPERATION:
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

} // CompareExpressionImpl
