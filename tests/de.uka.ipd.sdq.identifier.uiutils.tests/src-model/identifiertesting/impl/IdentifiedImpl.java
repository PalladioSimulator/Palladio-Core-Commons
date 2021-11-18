/**
 */
package identifiertesting.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import identifiertesting.Composable;
import identifiertesting.Identified;
import identifiertesting.IdentifiertestingPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identified</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link identifiertesting.impl.IdentifiedImpl#getComposedElements <em>Composed Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentifiedImpl extends IdentifierImpl implements Identified {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IdentifiedImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IdentifiertestingPackage.Literals.IDENTIFIED;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Composable> getComposedElements() {
        return (EList<Composable>)eGet(IdentifiertestingPackage.Literals.COMPOSABLE__COMPOSED_ELEMENTS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == Composable.class) {
            switch (derivedFeatureID) {
                case IdentifiertestingPackage.IDENTIFIED__COMPOSED_ELEMENTS: return IdentifiertestingPackage.COMPOSABLE__COMPOSED_ELEMENTS;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == Composable.class) {
            switch (baseFeatureID) {
                case IdentifiertestingPackage.COMPOSABLE__COMPOSED_ELEMENTS: return IdentifiertestingPackage.IDENTIFIED__COMPOSED_ELEMENTS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //IdentifiedImpl
