/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.probfunction.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.probfunction.Sample;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Sample</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.probfunction.impl.SampleImpl#getProbability <em>Probability</em>}</li>
 * <li>{@link de.uka.ipd.sdq.probfunction.impl.SampleImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SampleImpl<T> extends EObjectImpl implements Sample<T> {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getProbability()
     * @generated
     * @ordered
     */
    protected static final double PROBABILITY_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getProbability()
     * @generated
     * @ordered
     */
    protected double probability = PROBABILITY_EDEFAULT;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected T value;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SampleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ProbfunctionPackage.Literals.SAMPLE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated not
     */
    @Override
    @SuppressWarnings("unchecked")
    public T getValue() {
        /* In Samples the value is always a simple type and not an EObject, hence the cast fails! */
        if (this.value != null && this.value instanceof EObject && ((EObject) this.value).eIsProxy()) {
            final InternalEObject oldValue = (InternalEObject) this.value;
            this.value = (T) this.eResolveProxy(oldValue);
            if (this.value != oldValue) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProbfunctionPackage.SAMPLE__VALUE,
                            oldValue, this.value));
                }
            }
        }
        return this.value;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setValue(final T newValue) {
        final T oldValue = this.value;
        this.value = newValue;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ProbfunctionPackage.SAMPLE__VALUE, oldValue,
                    this.value));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getProbability() {
        return this.probability;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setProbability(final double newProbability) {
        final double oldProbability = this.probability;
        this.probability = newProbability;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ProbfunctionPackage.SAMPLE__PROBABILITY,
                    oldProbability, this.probability));
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
        case ProbfunctionPackage.SAMPLE__PROBABILITY:
            return this.getProbability();
        case ProbfunctionPackage.SAMPLE__VALUE:
            return this.getValue();
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
        case ProbfunctionPackage.SAMPLE__PROBABILITY:
            this.setProbability((Double) newValue);
            return;
        case ProbfunctionPackage.SAMPLE__VALUE:
            this.setValue((T) newValue);
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
        case ProbfunctionPackage.SAMPLE__PROBABILITY:
            this.setProbability(PROBABILITY_EDEFAULT);
            return;
        case ProbfunctionPackage.SAMPLE__VALUE:
            this.setValue((T) null);
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
        case ProbfunctionPackage.SAMPLE__PROBABILITY:
            return this.probability != PROBABILITY_EDEFAULT;
        case ProbfunctionPackage.SAMPLE__VALUE:
            return this.value != null;
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
        result.append(" (probability: ");
        result.append(this.probability);
        result.append(", value: ");
        result.append(this.value);
        result.append(')');
        return result.toString();
    }

} // SampleImpl
