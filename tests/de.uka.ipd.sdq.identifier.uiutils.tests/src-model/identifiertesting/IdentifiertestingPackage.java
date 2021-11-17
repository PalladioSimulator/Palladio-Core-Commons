/**
 */
package identifiertesting;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see identifiertesting.IdentifiertestingFactory
 * @model kind="package"
 * @generated
 */
public interface IdentifiertestingPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "identifiertesting";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://sdq.ipd.uka.de/Identifier/2.1/testing";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "identifiertesting";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    IdentifiertestingPackage eINSTANCE = identifiertesting.impl.IdentifiertestingPackageImpl.init();

    /**
     * The meta object id for the '{@link identifiertesting.impl.ComposableImpl <em>Composable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identifiertesting.impl.ComposableImpl
     * @see identifiertesting.impl.IdentifiertestingPackageImpl#getComposable()
     * @generated
     */
    int COMPOSABLE = 0;

    /**
     * The feature id for the '<em><b>Composed Elements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSABLE__COMPOSED_ELEMENTS = 0;

    /**
     * The number of structural features of the '<em>Composable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSABLE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link identifiertesting.impl.IdentifiedImpl <em>Identified</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identifiertesting.impl.IdentifiedImpl
     * @see identifiertesting.impl.IdentifiertestingPackageImpl#getIdentified()
     * @generated
     */
    int IDENTIFIED = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIED__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
     * The feature id for the '<em><b>Composed Elements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIED__COMPOSED_ELEMENTS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Identified</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIED_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link identifiertesting.impl.NonIdentifiedImpl <em>Non Identified</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identifiertesting.impl.NonIdentifiedImpl
     * @see identifiertesting.impl.IdentifiertestingPackageImpl#getNonIdentified()
     * @generated
     */
    int NON_IDENTIFIED = 2;

    /**
     * The feature id for the '<em><b>Composed Elements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_IDENTIFIED__COMPOSED_ELEMENTS = COMPOSABLE__COMPOSED_ELEMENTS;

    /**
     * The number of structural features of the '<em>Non Identified</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_IDENTIFIED_FEATURE_COUNT = COMPOSABLE_FEATURE_COUNT + 0;


    /**
     * Returns the meta object for class '{@link identifiertesting.Composable <em>Composable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Composable</em>'.
     * @see identifiertesting.Composable
     * @generated
     */
    EClass getComposable();

    /**
     * Returns the meta object for the containment reference list '{@link identifiertesting.Composable#getComposedElements <em>Composed Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Composed Elements</em>'.
     * @see identifiertesting.Composable#getComposedElements()
     * @see #getComposable()
     * @generated
     */
    EReference getComposable_ComposedElements();

    /**
     * Returns the meta object for class '{@link identifiertesting.Identified <em>Identified</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identified</em>'.
     * @see identifiertesting.Identified
     * @generated
     */
    EClass getIdentified();

    /**
     * Returns the meta object for class '{@link identifiertesting.NonIdentified <em>Non Identified</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Non Identified</em>'.
     * @see identifiertesting.NonIdentified
     * @generated
     */
    EClass getNonIdentified();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    IdentifiertestingFactory getIdentifiertestingFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link identifiertesting.impl.ComposableImpl <em>Composable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identifiertesting.impl.ComposableImpl
         * @see identifiertesting.impl.IdentifiertestingPackageImpl#getComposable()
         * @generated
         */
        EClass COMPOSABLE = eINSTANCE.getComposable();

        /**
         * The meta object literal for the '<em><b>Composed Elements</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPOSABLE__COMPOSED_ELEMENTS = eINSTANCE.getComposable_ComposedElements();

        /**
         * The meta object literal for the '{@link identifiertesting.impl.IdentifiedImpl <em>Identified</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identifiertesting.impl.IdentifiedImpl
         * @see identifiertesting.impl.IdentifiertestingPackageImpl#getIdentified()
         * @generated
         */
        EClass IDENTIFIED = eINSTANCE.getIdentified();

        /**
         * The meta object literal for the '{@link identifiertesting.impl.NonIdentifiedImpl <em>Non Identified</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identifiertesting.impl.NonIdentifiedImpl
         * @see identifiertesting.impl.IdentifiertestingPackageImpl#getNonIdentified()
         * @generated
         */
        EClass NON_IDENTIFIED = eINSTANCE.getNonIdentified();

    }

} //IdentifiertestingPackage
