/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.stoex.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.uka.ipd.sdq.stoex.AbstractNamedReference;
import de.uka.ipd.sdq.stoex.StoexPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Abstract Named Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.stoex.impl.AbstractNamedReferenceImpl#getReferenceName <em>Reference
 * Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractNamedReferenceImpl extends MinimalEObjectImpl.Container implements AbstractNamedReference {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * The default value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getReferenceName()
     * @generated
     * @ordered
     */
    protected static final String REFERENCE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getReferenceName()
     * @generated
     * @ordered
     */
    protected String referenceName = REFERENCE_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected AbstractNamedReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StoexPackage.Literals.ABSTRACT_NAMED_REFERENCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getReferenceName() {
        return this.referenceName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setReferenceName(final String newReferenceName) {
        final String oldReferenceName = this.referenceName;
        this.referenceName = newReferenceName;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    StoexPackage.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME, oldReferenceName, this.referenceName));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case StoexPackage.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME:
            return this.getReferenceName();
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
        case StoexPackage.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME:
            this.setReferenceName((String) newValue);
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
        case StoexPackage.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME:
            this.setReferenceName(REFERENCE_NAME_EDEFAULT);
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
        case StoexPackage.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME:
            return REFERENCE_NAME_EDEFAULT == null ? this.referenceName != null : !REFERENCE_NAME_EDEFAULT
                    .equals(this.referenceName);
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
        result.append(" (referenceName: ");
        result.append(this.referenceName);
        result.append(')');
        return result.toString();
    }

} // AbstractNamedReferenceImpl
