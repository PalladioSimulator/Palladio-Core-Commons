/**
 */
package identifiertesting;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see identifiertesting.IdentifiertestingPackage
 * @generated
 */
public interface IdentifiertestingFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    IdentifiertestingFactory eINSTANCE = identifiertesting.impl.IdentifiertestingFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Identified</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Identified</em>'.
     * @generated
     */
    Identified createIdentified();

    /**
     * Returns a new object of class '<em>Non Identified</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Non Identified</em>'.
     * @generated
     */
    NonIdentified createNonIdentified();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    IdentifiertestingPackage getIdentifiertestingPackage();

} //IdentifiertestingFactory
