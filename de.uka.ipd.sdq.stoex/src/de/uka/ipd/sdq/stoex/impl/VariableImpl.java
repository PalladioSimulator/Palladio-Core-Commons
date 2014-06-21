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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.stoex.AbstractNamedReference;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.stoex.Variable;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Variable</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.stoex.impl.VariableImpl#getId_Variable <em>Id Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends AtomImpl implements Variable {
    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";
    /**
     * The cached value of the '{@link #getId_Variable() <em>Id Variable</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getId_Variable()
     * @generated
     * @ordered
     */
    protected AbstractNamedReference id_Variable;

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected VariableImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return StoexPackage.Literals.VARIABLE;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public AbstractNamedReference getId_Variable() {
		return id_Variable;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetId_Variable(AbstractNamedReference newId_Variable, NotificationChain msgs) {
		AbstractNamedReference oldId_Variable = id_Variable;
		id_Variable = newId_Variable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StoexPackage.VARIABLE__ID_VARIABLE, oldId_Variable, newId_Variable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

				/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public void setId_Variable(AbstractNamedReference newId_Variable) {
		if (newId_Variable != id_Variable) {
			NotificationChain msgs = null;
			if (id_Variable != null)
				msgs = ((InternalEObject)id_Variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StoexPackage.VARIABLE__ID_VARIABLE, null, msgs);
			if (newId_Variable != null)
				msgs = ((InternalEObject)newId_Variable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StoexPackage.VARIABLE__ID_VARIABLE, null, msgs);
			msgs = basicSetId_Variable(newId_Variable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StoexPackage.VARIABLE__ID_VARIABLE, newId_Variable, newId_Variable));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StoexPackage.VARIABLE__ID_VARIABLE:
				return basicSetId_Variable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

				/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StoexPackage.VARIABLE__ID_VARIABLE:
				return getId_Variable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StoexPackage.VARIABLE__ID_VARIABLE:
				setId_Variable((AbstractNamedReference)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset(int featureID) {
		switch (featureID) {
			case StoexPackage.VARIABLE__ID_VARIABLE:
				setId_Variable((AbstractNamedReference)null);
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StoexPackage.VARIABLE__ID_VARIABLE:
				return id_Variable != null;
		}
		return super.eIsSet(featureID);
	}

} // VariableImpl
