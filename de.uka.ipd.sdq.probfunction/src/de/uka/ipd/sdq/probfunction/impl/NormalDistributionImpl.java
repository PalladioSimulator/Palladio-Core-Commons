/**
 * Copyright 2007-2009, SDQ, IPD, U Karlsruhe
 *
 * $Id$
 */
package de.uka.ipd.sdq.probfunction.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.probfunction.NormalDistribution;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.probfunction.impl.NormalDistributionImpl#getMu <em>Mu</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.probfunction.impl.NormalDistributionImpl#getSigma <em>Sigma</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NormalDistributionImpl extends ContinuousPDFImpl implements NormalDistribution {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

	/**
	 * The default value of the '{@link #getMu() <em>Mu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu()
	 * @generated
	 * @ordered
	 */
	protected static final double MU_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMu() <em>Mu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu()
	 * @generated
	 * @ordered
	 */
	protected double mu = MU_EDEFAULT;

	/**
	 * The default value of the '{@link #getSigma() <em>Sigma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigma()
	 * @generated
	 * @ordered
	 */
	protected static final double SIGMA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSigma() <em>Sigma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigma()
	 * @generated
	 * @ordered
	 */
	protected double sigma = SIGMA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProbfunctionPackage.Literals.NORMAL_DISTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMu() {
		return mu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMu(double newMu) {
		double oldMu = mu;
		mu = newMu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProbfunctionPackage.NORMAL_DISTRIBUTION__MU, oldMu, mu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSigma() {
		return sigma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSigma(double newSigma) {
		double oldSigma = sigma;
		sigma = newSigma;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProbfunctionPackage.NORMAL_DISTRIBUTION__SIGMA, oldSigma, sigma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProbfunctionPackage.NORMAL_DISTRIBUTION__MU:
				return getMu();
			case ProbfunctionPackage.NORMAL_DISTRIBUTION__SIGMA:
				return getSigma();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProbfunctionPackage.NORMAL_DISTRIBUTION__MU:
				setMu((Double)newValue);
				return;
			case ProbfunctionPackage.NORMAL_DISTRIBUTION__SIGMA:
				setSigma((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProbfunctionPackage.NORMAL_DISTRIBUTION__MU:
				setMu(MU_EDEFAULT);
				return;
			case ProbfunctionPackage.NORMAL_DISTRIBUTION__SIGMA:
				setSigma(SIGMA_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProbfunctionPackage.NORMAL_DISTRIBUTION__MU:
				return mu != MU_EDEFAULT;
			case ProbfunctionPackage.NORMAL_DISTRIBUTION__SIGMA:
				return sigma != SIGMA_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mu: ");
		result.append(mu);
		result.append(", sigma: ");
		result.append(sigma);
		result.append(')');
		return result.toString();
	}

} //NormalDistributionImpl
