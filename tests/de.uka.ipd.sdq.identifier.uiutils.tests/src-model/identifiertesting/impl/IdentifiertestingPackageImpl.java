/**
 */
package identifiertesting.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import identifiertesting.Composable;
import identifiertesting.Identified;
import identifiertesting.IdentifiertestingFactory;
import identifiertesting.IdentifiertestingPackage;
import identifiertesting.NonIdentified;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdentifiertestingPackageImpl extends EPackageImpl implements IdentifiertestingPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass composableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identifiedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nonIdentifiedEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see identifiertesting.IdentifiertestingPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private IdentifiertestingPackageImpl() {
        super(eNS_URI, IdentifiertestingFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link IdentifiertestingPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static IdentifiertestingPackage init() {
        if (isInited) return (IdentifiertestingPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifiertestingPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredIdentifiertestingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        IdentifiertestingPackageImpl theIdentifiertestingPackage = registeredIdentifiertestingPackage instanceof IdentifiertestingPackageImpl ? (IdentifiertestingPackageImpl)registeredIdentifiertestingPackage : new IdentifiertestingPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        IdentifierPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theIdentifiertestingPackage.createPackageContents();

        // Initialize created meta-data
        theIdentifiertestingPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theIdentifiertestingPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(IdentifiertestingPackage.eNS_URI, theIdentifiertestingPackage);
        return theIdentifiertestingPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getComposable() {
        return composableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComposable_ComposedElements() {
        return (EReference)composableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentified() {
        return identifiedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNonIdentified() {
        return nonIdentifiedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentifiertestingFactory getIdentifiertestingFactory() {
        return (IdentifiertestingFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        composableEClass = createEClass(COMPOSABLE);
        createEReference(composableEClass, COMPOSABLE__COMPOSED_ELEMENTS);

        identifiedEClass = createEClass(IDENTIFIED);

        nonIdentifiedEClass = createEClass(NON_IDENTIFIED);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        identifiedEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        identifiedEClass.getESuperTypes().add(this.getComposable());
        nonIdentifiedEClass.getESuperTypes().add(this.getComposable());

        // Initialize classes and features; add operations and parameters
        initEClass(composableEClass, Composable.class, "Composable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getComposable_ComposedElements(), this.getComposable(), null, "composedElements", null, 0, -1, Composable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(identifiedEClass, Identified.class, "Identified", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(nonIdentifiedEClass, NonIdentified.class, "NonIdentified", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //IdentifiertestingPackageImpl
