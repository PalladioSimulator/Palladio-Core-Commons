/**
 * Copyright 2007-2009, SDQ, IPD, U Karlsruhe
 *
 * $Id$
 */
package de.uka.ipd.sdq.probfunction.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.probfunction.LognormalDistribution;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Lognormal Distribution</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.probfunction.impl.LognormalDistributionImpl#getMu <em>Mu</em>}</li>
 * <li>{@link de.uka.ipd.sdq.probfunction.impl.LognormalDistributionImpl#getSigma <em>Sigma</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LognormalDistributionImpl extends ContinuousPDFImpl implements LognormalDistribution {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * The default value of the '{@link #getMu() <em>Mu</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getMu()
     * @generated
     * @ordered
     */
    protected static final double MU_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getMu() <em>Mu</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getMu()
     * @generated
     * @ordered
     */
    protected double mu = MU_EDEFAULT;

    /**
     * The default value of the '{@link #getSigma() <em>Sigma</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getSigma()
     * @generated
     * @ordered
     */
    protected static final double SIGMA_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getSigma() <em>Sigma</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getSigma()
     * @generated
     * @ordered
     */
    protected double sigma = SIGMA_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected LognormalDistributionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ProbfunctionPackage.Literals.LOGNORMAL_DISTRIBUTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public double getMu() {
        return this.mu;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setMu(final double newMu) {
        final double oldMu = this.mu;
        this.mu = newMu;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ProbfunctionPackage.LOGNORMAL_DISTRIBUTION__MU,
                    oldMu, this.mu));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public double getSigma() {
        return this.sigma;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setSigma(final double newSigma) {
        final double oldSigma = this.sigma;
        this.sigma = newSigma;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ProbfunctionPackage.LOGNORMAL_DISTRIBUTION__SIGMA, oldSigma, this.sigma));
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
        case ProbfunctionPackage.LOGNORMAL_DISTRIBUTION__MU:
            return this.getMu();
        case ProbfunctionPackage.LOGNORMAL_DISTRIBUTION__SIGMA:
            return this.getSigma();
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
        case ProbfunctionPackage.LOGNORMAL_DISTRIBUTION__MU:
            this.setMu((Double) newValue);
            return;
        case ProbfunctionPackage.LOGNORMAL_DISTRIBUTION__SIGMA:
            this.setSigma((Double) newValue);
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
        case ProbfunctionPackage.LOGNORMAL_DISTRIBUTION__MU:
            this.setMu(MU_EDEFAULT);
            return;
        case ProbfunctionPackage.LOGNORMAL_DISTRIBUTION__SIGMA:
            this.setSigma(SIGMA_EDEFAULT);
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
        case ProbfunctionPackage.LOGNORMAL_DISTRIBUTION__MU:
            return this.mu != MU_EDEFAULT;
        case ProbfunctionPackage.LOGNORMAL_DISTRIBUTION__SIGMA:
            return this.sigma != SIGMA_EDEFAULT;
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
        result.append(" (mu: ");
        result.append(this.mu);
        result.append(", sigma: ");
        result.append(this.sigma);
        result.append(')');
        return result.toString();
    }

} // LognormalDistributionImpl
