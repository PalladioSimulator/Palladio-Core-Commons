/**
 */
package identifiertesting.impl;

import identifiertesting.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdentifiertestingFactoryImpl extends EFactoryImpl implements IdentifiertestingFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static IdentifiertestingFactory init() {
        try {
            IdentifiertestingFactory theIdentifiertestingFactory = (IdentifiertestingFactory)EPackage.Registry.INSTANCE.getEFactory(IdentifiertestingPackage.eNS_URI);
            if (theIdentifiertestingFactory != null) {
                return theIdentifiertestingFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new IdentifiertestingFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentifiertestingFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case IdentifiertestingPackage.IDENTIFIED: return (EObject)createIdentified();
            case IdentifiertestingPackage.NON_IDENTIFIED: return (EObject)createNonIdentified();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Identified createIdentified() {
        IdentifiedImpl identified = new IdentifiedImpl();
        return identified;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NonIdentified createNonIdentified() {
        NonIdentifiedImpl nonIdentified = new NonIdentifiedImpl();
        return nonIdentified;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentifiertestingPackage getIdentifiertestingPackage() {
        return (IdentifiertestingPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static IdentifiertestingPackage getPackage() {
        return IdentifiertestingPackage.eINSTANCE;
    }

} //IdentifiertestingFactoryImpl
