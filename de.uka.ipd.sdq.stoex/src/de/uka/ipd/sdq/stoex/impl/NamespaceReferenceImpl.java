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

import de.uka.ipd.sdq.stoex.AbstractNamedReference;
import de.uka.ipd.sdq.stoex.NamespaceReference;
import de.uka.ipd.sdq.stoex.StoexPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Namespace Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.NamespaceReferenceImpl#getInnerReference_NamespaceReference
 * <em>Inner Reference Namespace Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamespaceReferenceImpl extends AbstractNamedReferenceImpl implements NamespaceReference {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";
    /**
     * The cached value of the '{@link #getInnerReference_NamespaceReference()
     * <em>Inner Reference Namespace Reference</em>}' containment reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getInnerReference_NamespaceReference()
     * @generated
     * @ordered
     */
    protected AbstractNamedReference innerReference_NamespaceReference;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected NamespaceReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StoexPackage.Literals.NAMESPACE_REFERENCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AbstractNamedReference getInnerReference_NamespaceReference() {
        return this.innerReference_NamespaceReference;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetInnerReference_NamespaceReference(
            final AbstractNamedReference newInnerReference_NamespaceReference, NotificationChain msgs) {
        final AbstractNamedReference oldInnerReference_NamespaceReference = this.innerReference_NamespaceReference;
        this.innerReference_NamespaceReference = newInnerReference_NamespaceReference;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StoexPackage.NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE,
                    oldInnerReference_NamespaceReference, newInnerReference_NamespaceReference);
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
    public void setInnerReference_NamespaceReference(final AbstractNamedReference newInnerReference_NamespaceReference) {
        if (newInnerReference_NamespaceReference != this.innerReference_NamespaceReference) {
            NotificationChain msgs = null;
            if (this.innerReference_NamespaceReference != null) {
                msgs = ((InternalEObject) this.innerReference_NamespaceReference).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - StoexPackage.NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE,
                        null, msgs);
            }
            if (newInnerReference_NamespaceReference != null) {
                msgs = ((InternalEObject) newInnerReference_NamespaceReference).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - StoexPackage.NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE,
                        null, msgs);
            }
            msgs = this.basicSetInnerReference_NamespaceReference(newInnerReference_NamespaceReference, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    StoexPackage.NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE,
                    newInnerReference_NamespaceReference, newInnerReference_NamespaceReference));
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
        case StoexPackage.NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE:
            return this.basicSetInnerReference_NamespaceReference(null, msgs);
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
        case StoexPackage.NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE:
            return this.getInnerReference_NamespaceReference();
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
        case StoexPackage.NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE:
            this.setInnerReference_NamespaceReference((AbstractNamedReference) newValue);
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
        case StoexPackage.NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE:
            this.setInnerReference_NamespaceReference((AbstractNamedReference) null);
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
        case StoexPackage.NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE:
            return this.innerReference_NamespaceReference != null;
        }
        return super.eIsSet(featureID);
    }

} // NamespaceReferenceImpl
