/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.probfunction.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uka.ipd.sdq.probfunction.Complex;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.probfunction.SamplePDF;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Sample PDF</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.probfunction.impl.SamplePDFImpl#getDistance <em>Distance</em>}</li>
 * <li>{@link de.uka.ipd.sdq.probfunction.impl.SamplePDFImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SamplePDFImpl extends ProbabilityDensityFunctionImpl implements SamplePDF {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDistance()
     * @generated
     * @ordered
     */
    protected static final double DISTANCE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDistance()
     * @generated
     * @ordered
     */
    protected double distance = DISTANCE_EDEFAULT;

    /**
     * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getValues()
     * @generated
     * @ordered
     */
    protected EList<Complex> values;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SamplePDFImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ProbfunctionPackage.Literals.SAMPLE_PDF;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getDistance() {
        return this.distance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDistance(final double newDistance) {
        final double oldDistance = this.distance;
        this.distance = newDistance;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ProbfunctionPackage.SAMPLE_PDF__DISTANCE,
                    oldDistance, this.distance));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Complex> getValues() {
        if (this.values == null) {
            this.values = new EObjectContainmentEList<Complex>(Complex.class, this,
                    ProbfunctionPackage.SAMPLE_PDF__VALUES);
        }
        return this.values;
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
        case ProbfunctionPackage.SAMPLE_PDF__VALUES:
            return ((InternalEList<?>) this.getValues()).basicRemove(otherEnd, msgs);
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
        case ProbfunctionPackage.SAMPLE_PDF__DISTANCE:
            return this.getDistance();
        case ProbfunctionPackage.SAMPLE_PDF__VALUES:
            return this.getValues();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case ProbfunctionPackage.SAMPLE_PDF__DISTANCE:
            this.setDistance((Double) newValue);
            return;
        case ProbfunctionPackage.SAMPLE_PDF__VALUES:
            this.getValues().clear();
            this.getValues().addAll((Collection<? extends Complex>) newValue);
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
        case ProbfunctionPackage.SAMPLE_PDF__DISTANCE:
            this.setDistance(DISTANCE_EDEFAULT);
            return;
        case ProbfunctionPackage.SAMPLE_PDF__VALUES:
            this.getValues().clear();
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
        case ProbfunctionPackage.SAMPLE_PDF__DISTANCE:
            return this.distance != DISTANCE_EDEFAULT;
        case ProbfunctionPackage.SAMPLE_PDF__VALUES:
            return this.values != null && !this.values.isEmpty();
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
        result.append(" (distance: ");
        result.append(this.distance);
        result.append(')');
        return result.toString();
    }

} // SamplePDFImpl
