/**
 * Copyright 2007-2009, SDQ, IPD, U Karlsruhe
 *
 * $Id$
 */
package de.uka.ipd.sdq.probfunction.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import de.uka.ipd.sdq.probfunction.Complex;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Complex</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.probfunction.impl.ComplexImpl#getReal <em>Real</em>}</li>
 * <li>{@link de.uka.ipd.sdq.probfunction.impl.ComplexImpl#getImaginary <em>Imaginary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexImpl extends CDOObjectImpl implements Complex {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * The default value of the '{@link #getReal() <em>Real</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getReal()
     * @generated
     * @ordered
     */
    protected static final double REAL_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getReal() <em>Real</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getReal()
     * @generated
     * @ordered
     */
    protected double real = REAL_EDEFAULT;

    /**
     * The default value of the '{@link #getImaginary() <em>Imaginary</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getImaginary()
     * @generated
     * @ordered
     */
    protected static final double IMAGINARY_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getImaginary() <em>Imaginary</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getImaginary()
     * @generated
     * @ordered
     */
    protected double imaginary = IMAGINARY_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ComplexImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ProbfunctionPackage.Literals.COMPLEX;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public double getReal() {
        return this.real;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setReal(final double newReal) {
        final double oldReal = this.real;
        this.real = newReal;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ProbfunctionPackage.COMPLEX__REAL, oldReal,
                    this.real));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public double getImaginary() {
        return this.imaginary;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setImaginary(final double newImaginary) {
        final double oldImaginary = this.imaginary;
        this.imaginary = newImaginary;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ProbfunctionPackage.COMPLEX__IMAGINARY,
                    oldImaginary, this.imaginary));
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
        case ProbfunctionPackage.COMPLEX__REAL:
            return this.getReal();
        case ProbfunctionPackage.COMPLEX__IMAGINARY:
            return this.getImaginary();
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
        case ProbfunctionPackage.COMPLEX__REAL:
            this.setReal((Double) newValue);
            return;
        case ProbfunctionPackage.COMPLEX__IMAGINARY:
            this.setImaginary((Double) newValue);
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
        case ProbfunctionPackage.COMPLEX__REAL:
            this.setReal(REAL_EDEFAULT);
            return;
        case ProbfunctionPackage.COMPLEX__IMAGINARY:
            this.setImaginary(IMAGINARY_EDEFAULT);
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
        case ProbfunctionPackage.COMPLEX__REAL:
            return this.real != REAL_EDEFAULT;
        case ProbfunctionPackage.COMPLEX__IMAGINARY:
            return this.imaginary != IMAGINARY_EDEFAULT;
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
        result.append(" (real: ");
        result.append(this.real);
        result.append(", imaginary: ");
        result.append(this.imaginary);
        result.append(')');
        return result.toString();
    }

} // ComplexImpl
