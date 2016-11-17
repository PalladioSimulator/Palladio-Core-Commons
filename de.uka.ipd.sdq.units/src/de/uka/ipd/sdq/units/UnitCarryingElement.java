/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.units;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Unit Carrying
 * Element</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.uka.ipd.sdq.units.UnitCarryingElement#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.units.UnitsPackage#getUnitCarryingElement()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface UnitCarryingElement extends CDOObject {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String copyright = "Copyright 2007-2017, Palladiosimulator.org";

    /**
     * Returns the value of the '<em><b>Unit</b></em>' containment reference. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Unit</em>' reference isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Unit</em>' containment reference.
     * @see #isSetUnit()
     * @see #unsetUnit()
     * @see de.uka.ipd.sdq.units.UnitsPackage#getUnitCarryingElement_Unit()
     * @model containment="true" unsettable="true" ordered="false" suppressedSetVisibility="true"
     *        extendedMetaData="name='' namespace=''"
     * @generated
     */
    Unit getUnit();

    /**
     * Unsets the value of the '{@link de.uka.ipd.sdq.units.UnitCarryingElement#getUnit
     * <em>Unit</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isSetUnit()
     * @see #getUnit()
     * @generated
     */
    void unsetUnit();

    /**
     * Returns whether the value of the '{@link de.uka.ipd.sdq.units.UnitCarryingElement#getUnit
     * <em>Unit</em>}' containment reference is set. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return whether the value of the '<em>Unit</em>' containment reference is set.
     * @see #unsetUnit()
     * @see #getUnit()
     * @generated
     */
    boolean isSetUnit();

} // UnitCarryingElement
