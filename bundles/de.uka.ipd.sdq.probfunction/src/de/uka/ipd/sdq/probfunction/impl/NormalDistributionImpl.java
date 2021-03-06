/**
 * Copyright 2007-2009, SDQ, IPD, U Karlsruhe
 *
 * $Id$
 */
package de.uka.ipd.sdq.probfunction.impl;

import org.eclipse.emf.ecore.EClass;

import de.uka.ipd.sdq.probfunction.NormalDistribution;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Normal
 * Distribution</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.uka.ipd.sdq.probfunction.impl.NormalDistributionImpl#getMu <em>Mu</em>}</li>
 * <li>{@link de.uka.ipd.sdq.probfunction.impl.NormalDistributionImpl#getSigma <em>Sigma</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalDistributionImpl extends ContinuousPDFImpl implements NormalDistribution {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2017, Palladiosimulator.org";

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
     * The default value of the '{@link #getSigma() <em>Sigma</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getSigma()
     * @generated
     * @ordered
     */
    protected static final double SIGMA_EDEFAULT = 0.0;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected NormalDistributionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ProbfunctionPackage.Literals.NORMAL_DISTRIBUTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public double getMu() {
        return (Double) this.eDynamicGet(ProbfunctionPackage.NORMAL_DISTRIBUTION__MU,
                ProbfunctionPackage.Literals.NORMAL_DISTRIBUTION__MU, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setMu(final double newMu) {
        this.eDynamicSet(ProbfunctionPackage.NORMAL_DISTRIBUTION__MU,
                ProbfunctionPackage.Literals.NORMAL_DISTRIBUTION__MU,
                newMu);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public double getSigma() {
        return (Double) this.eDynamicGet(ProbfunctionPackage.NORMAL_DISTRIBUTION__SIGMA,
                ProbfunctionPackage.Literals.NORMAL_DISTRIBUTION__SIGMA, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setSigma(final double newSigma) {
        this.eDynamicSet(ProbfunctionPackage.NORMAL_DISTRIBUTION__SIGMA,
                ProbfunctionPackage.Literals.NORMAL_DISTRIBUTION__SIGMA, newSigma);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ProbfunctionPackage.NORMAL_DISTRIBUTION__MU:
            return this.getMu();
        case ProbfunctionPackage.NORMAL_DISTRIBUTION__SIGMA:
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
        case ProbfunctionPackage.NORMAL_DISTRIBUTION__MU:
            this.setMu((Double) newValue);
            return;
        case ProbfunctionPackage.NORMAL_DISTRIBUTION__SIGMA:
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
        case ProbfunctionPackage.NORMAL_DISTRIBUTION__MU:
            this.setMu(MU_EDEFAULT);
            return;
        case ProbfunctionPackage.NORMAL_DISTRIBUTION__SIGMA:
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
        case ProbfunctionPackage.NORMAL_DISTRIBUTION__MU:
            return this.getMu() != MU_EDEFAULT;
        case ProbfunctionPackage.NORMAL_DISTRIBUTION__SIGMA:
            return this.getSigma() != SIGMA_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // NormalDistributionImpl
