/**
 * Copyright 2007-2009, SDQ, IPD, U Karlsruhe
 *
 * $Id$
 */
package de.uka.ipd.sdq.probfunction.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.probfunction.GammaDistribution;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Gamma Distribution</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.probfunction.impl.GammaDistributionImpl#getAlpha <em>Alpha</em>}</li>
 * <li>{@link de.uka.ipd.sdq.probfunction.impl.GammaDistributionImpl#getTheta <em>Theta</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GammaDistributionImpl extends ContinuousPDFImpl implements GammaDistribution {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getAlpha()
     * @generated
     * @ordered
     */
    protected static final double ALPHA_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getAlpha()
     * @generated
     * @ordered
     */
    protected double alpha = ALPHA_EDEFAULT;

    /**
     * The default value of the '{@link #getTheta() <em>Theta</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getTheta()
     * @generated
     * @ordered
     */
    protected static final double THETA_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getTheta() <em>Theta</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getTheta()
     * @generated
     * @ordered
     */
    protected double theta = THETA_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected GammaDistributionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ProbfunctionPackage.Literals.GAMMA_DISTRIBUTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public double getAlpha() {
        return this.alpha;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setAlpha(final double newAlpha) {
        final double oldAlpha = this.alpha;
        this.alpha = newAlpha;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ProbfunctionPackage.GAMMA_DISTRIBUTION__ALPHA,
                    oldAlpha, this.alpha));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public double getTheta() {
        return this.theta;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setTheta(final double newTheta) {
        final double oldTheta = this.theta;
        this.theta = newTheta;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ProbfunctionPackage.GAMMA_DISTRIBUTION__THETA,
                    oldTheta, this.theta));
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
        case ProbfunctionPackage.GAMMA_DISTRIBUTION__ALPHA:
            return this.getAlpha();
        case ProbfunctionPackage.GAMMA_DISTRIBUTION__THETA:
            return this.getTheta();
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
        case ProbfunctionPackage.GAMMA_DISTRIBUTION__ALPHA:
            this.setAlpha((Double) newValue);
            return;
        case ProbfunctionPackage.GAMMA_DISTRIBUTION__THETA:
            this.setTheta((Double) newValue);
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
        case ProbfunctionPackage.GAMMA_DISTRIBUTION__ALPHA:
            this.setAlpha(ALPHA_EDEFAULT);
            return;
        case ProbfunctionPackage.GAMMA_DISTRIBUTION__THETA:
            this.setTheta(THETA_EDEFAULT);
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
        case ProbfunctionPackage.GAMMA_DISTRIBUTION__ALPHA:
            return this.alpha != ALPHA_EDEFAULT;
        case ProbfunctionPackage.GAMMA_DISTRIBUTION__THETA:
            return this.theta != THETA_EDEFAULT;
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
        result.append(" (alpha: ");
        result.append(this.alpha);
        result.append(", theta: ");
        result.append(this.theta);
        result.append(')');
        return result.toString();
    }

} // GammaDistributionImpl
