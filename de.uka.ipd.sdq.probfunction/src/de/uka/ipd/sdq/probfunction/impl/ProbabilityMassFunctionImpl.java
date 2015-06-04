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

import de.uka.ipd.sdq.probfunction.ProbabilityMassFunction;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.probfunction.Sample;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Probability Mass Function</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.probfunction.impl.ProbabilityMassFunctionImpl#getSamples <em>Samples
 * </em>}</li>
 * <li>{@link de.uka.ipd.sdq.probfunction.impl.ProbabilityMassFunctionImpl#isOrderedDomain <em>
 * Ordered Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProbabilityMassFunctionImpl extends ProbabilityFunctionImpl implements ProbabilityMassFunction {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * The cached value of the '{@link #getSamples() <em>Samples</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSamples()
     * @generated
     * @ordered
     */
    protected EList<Sample> samples;

    /**
     * The default value of the '{@link #isOrderedDomain() <em>Ordered Domain</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isOrderedDomain()
     * @generated
     * @ordered
     */
    protected static final boolean ORDERED_DOMAIN_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isOrderedDomain() <em>Ordered Domain</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isOrderedDomain()
     * @generated
     * @ordered
     */
    protected boolean orderedDomain = ORDERED_DOMAIN_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ProbabilityMassFunctionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ProbfunctionPackage.Literals.PROBABILITY_MASS_FUNCTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Sample> getSamples() {
        if (this.samples == null) {
            this.samples = new EObjectContainmentEList<Sample>(Sample.class, this,
                    ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__SAMPLES);
        }
        return this.samples;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isOrderedDomain() {
        return this.orderedDomain;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setOrderedDomain(final boolean newOrderedDomain) {
        final boolean oldOrderedDomain = this.orderedDomain;
        this.orderedDomain = newOrderedDomain;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN, oldOrderedDomain, this.orderedDomain));
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
        case ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__SAMPLES:
            return ((InternalEList<?>) this.getSamples()).basicRemove(otherEnd, msgs);
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
        case ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__SAMPLES:
            return this.getSamples();
        case ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN:
            return this.isOrderedDomain();
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
        case ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__SAMPLES:
            this.getSamples().clear();
            this.getSamples().addAll((Collection<? extends Sample>) newValue);
            return;
        case ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN:
            this.setOrderedDomain((Boolean) newValue);
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
        case ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__SAMPLES:
            this.getSamples().clear();
            return;
        case ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN:
            this.setOrderedDomain(ORDERED_DOMAIN_EDEFAULT);
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
        case ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__SAMPLES:
            return this.samples != null && !this.samples.isEmpty();
        case ProbfunctionPackage.PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN:
            return this.orderedDomain != ORDERED_DOMAIN_EDEFAULT;
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
        result.append(" (orderedDomain: ");
        result.append(this.orderedDomain);
        result.append(')');
        return result.toString();
    }

} // ProbabilityMassFunctionImpl
