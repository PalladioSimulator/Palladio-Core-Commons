/**
 */
package identifiertesting;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link identifiertesting.Composable#getComposedElements <em>Composed Elements</em>}</li>
 * </ul>
 *
 * @see identifiertesting.IdentifiertestingPackage#getComposable()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Composable extends CDOObject {
    /**
     * Returns the value of the '<em><b>Composed Elements</b></em>' containment reference list.
     * The list contents are of type {@link identifiertesting.Composable}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Composed Elements</em>' containment reference list.
     * @see identifiertesting.IdentifiertestingPackage#getComposable_ComposedElements()
     * @model containment="true"
     * @generated
     */
    EList<Composable> getComposedElements();

} // Composable
