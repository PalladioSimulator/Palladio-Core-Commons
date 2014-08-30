/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.units.impl;

import de.uka.ipd.sdq.units.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uka.ipd.sdq.units.BaseUnit;
import de.uka.ipd.sdq.units.UnitDivision;
import de.uka.ipd.sdq.units.UnitMultiplication;
import de.uka.ipd.sdq.units.UnitNames;
import de.uka.ipd.sdq.units.UnitPower;
import de.uka.ipd.sdq.units.UnitRepository;
import de.uka.ipd.sdq.units.UnitsFactory;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class UnitsFactoryImpl extends EFactoryImpl implements UnitsFactory {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2007-2009, SDQ, IPD, U Karlsruhe";

    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static UnitsFactory init() {
        try {
            UnitsFactory theUnitsFactory = (UnitsFactory) EPackage.Registry.INSTANCE.getEFactory(UnitsPackage.eNS_URI);
            if (theUnitsFactory != null) {
                return theUnitsFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new UnitsFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public UnitsFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case UnitsPackage.BASE_UNIT:
            return (EObject) createBaseUnit();
        case UnitsPackage.UNIT_REPOSITORY:
            return (EObject) createUnitRepository();
        case UnitsPackage.UNIT_MULTIPLICATION:
            return (EObject) createUnitMultiplication();
        case UnitsPackage.UNIT_POWER:
            return (EObject) createUnitPower();
        case UnitsPackage.UNIT_DIVISION:
            return (EObject) createUnitDivision();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case UnitsPackage.UNIT_NAMES:
            return createUnitNamesFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case UnitsPackage.UNIT_NAMES:
            return convertUnitNamesToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public BaseUnit createBaseUnit() {
        BaseUnitImpl baseUnit = new BaseUnitImpl();
        return baseUnit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public UnitRepository createUnitRepository() {
        UnitRepositoryImpl unitRepository = new UnitRepositoryImpl();
        return unitRepository;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public UnitMultiplication createUnitMultiplication() {
        UnitMultiplicationImpl unitMultiplication = new UnitMultiplicationImpl();
        return unitMultiplication;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public UnitPower createUnitPower() {
        UnitPowerImpl unitPower = new UnitPowerImpl();
        return unitPower;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public UnitDivision createUnitDivision() {
        UnitDivisionImpl unitDivision = new UnitDivisionImpl();
        return unitDivision;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public UnitNames createUnitNamesFromString(EDataType eDataType, String initialValue) {
        UnitNames result = UnitNames.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertUnitNamesToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public UnitsPackage getUnitsPackage() {
        return (UnitsPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @deprecated
     * @generated
     */
    @Deprecated
    public static UnitsPackage getPackage() {
        return UnitsPackage.eINSTANCE;
    }

} // UnitsFactoryImpl
