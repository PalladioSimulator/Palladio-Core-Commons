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

import de.uka.ipd.sdq.stoex.Product;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.stoex.Term;
import de.uka.ipd.sdq.stoex.TermExpression;
import de.uka.ipd.sdq.stoex.TermOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Term Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.TermExpressionImpl#getLeft <em>Left</em>}</li>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.TermExpressionImpl#getRight <em>Right</em>}</li>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.TermExpressionImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermExpressionImpl extends TermImpl implements TermExpression {

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
    protected Product right;

    /**
     * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getOperation()
     * @generated
     * @ordered
     */
    protected static final TermOperations OPERATION_EDEFAULT = TermOperations.ADD;

    /**
     * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getOperation()
     * @generated
     * @ordered
     */
    protected TermOperations operation = OPERATION_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected TermExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StoexPackage.Literals.TERM_EXPRESSION;
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
                    StoexPackage.TERM_EXPRESSION__LEFT, oldLeft, newLeft);
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
                        - StoexPackage.TERM_EXPRESSION__LEFT, null, msgs);
            }
            if (newLeft != null) {
                msgs = ((InternalEObject) newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.TERM_EXPRESSION__LEFT, null, msgs);
            }
            msgs = this.basicSetLeft(newLeft, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, StoexPackage.TERM_EXPRESSION__LEFT, newLeft,
                    newLeft));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Product getRight() {
        return this.right;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetRight(final Product newRight, NotificationChain msgs) {
        final Product oldRight = this.right;
        this.right = newRight;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StoexPackage.TERM_EXPRESSION__RIGHT, oldRight, newRight);
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
    public void setRight(final Product newRight) {
        if (newRight != this.right) {
            NotificationChain msgs = null;
            if (this.right != null) {
                msgs = ((InternalEObject) this.right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.TERM_EXPRESSION__RIGHT, null, msgs);
            }
            if (newRight != null) {
                msgs = ((InternalEObject) newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - StoexPackage.TERM_EXPRESSION__RIGHT, null, msgs);
            }
            msgs = this.basicSetRight(newRight, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, StoexPackage.TERM_EXPRESSION__RIGHT, newRight,
                    newRight));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TermOperations getOperation() {
        return this.operation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setOperation(final TermOperations newOperation) {
        final TermOperations oldOperation = this.operation;
        this.operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, StoexPackage.TERM_EXPRESSION__OPERATION,
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
        case StoexPackage.TERM_EXPRESSION__LEFT:
            return this.basicSetLeft(null, msgs);
        case StoexPackage.TERM_EXPRESSION__RIGHT:
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
        case StoexPackage.TERM_EXPRESSION__LEFT:
            return this.getLeft();
        case StoexPackage.TERM_EXPRESSION__RIGHT:
            return this.getRight();
        case StoexPackage.TERM_EXPRESSION__OPERATION:
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
        case StoexPackage.TERM_EXPRESSION__LEFT:
            this.setLeft((Term) newValue);
            return;
        case StoexPackage.TERM_EXPRESSION__RIGHT:
            this.setRight((Product) newValue);
            return;
        case StoexPackage.TERM_EXPRESSION__OPERATION:
            this.setOperation((TermOperations) newValue);
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
        case StoexPackage.TERM_EXPRESSION__LEFT:
            this.setLeft((Term) null);
            return;
        case StoexPackage.TERM_EXPRESSION__RIGHT:
            this.setRight((Product) null);
            return;
        case StoexPackage.TERM_EXPRESSION__OPERATION:
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
        case StoexPackage.TERM_EXPRESSION__LEFT:
            return this.left != null;
        case StoexPackage.TERM_EXPRESSION__RIGHT:
            return this.right != null;
        case StoexPackage.TERM_EXPRESSION__OPERATION:
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

} // TermExpressionImpl
