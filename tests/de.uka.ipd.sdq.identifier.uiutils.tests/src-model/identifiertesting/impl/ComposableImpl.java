/**
 */
package identifiertesting.impl;

import identifiertesting.Composable;
import identifiertesting.IdentifiertestingPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link identifiertesting.impl.ComposableImpl#getComposedElements <em>Composed Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComposableImpl extends CDOObjectImpl implements Composable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IdentifiertestingPackage.Literals.COMPOSABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
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

} //ComposableImpl
