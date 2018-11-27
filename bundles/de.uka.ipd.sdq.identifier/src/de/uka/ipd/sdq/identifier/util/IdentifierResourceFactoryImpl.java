/**
 */
package de.uka.ipd.sdq.identifier.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc --> The <b>Resource Factory</b> associated with the package. <!--
 * end-user-doc -->
 * @see de.uka.ipd.sdq.identifier.util.IdentifierResourceImpl
 * @generated
 */
public class IdentifierResourceFactoryImpl extends ResourceFactoryImpl {
    /**
     * Creates an instance of the resource factory.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public IdentifierResourceFactoryImpl() {
        super();
    }

    /**
     * Creates an instance of the resource.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Resource createResource(URI uri) {
        Resource result = new IdentifierResourceImpl(uri);
        return result;
    }

} // IdentifierResourceFactoryImpl
