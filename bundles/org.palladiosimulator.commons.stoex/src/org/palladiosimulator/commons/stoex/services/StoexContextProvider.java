package org.palladiosimulator.commons.stoex.services;

import org.eclipse.emf.ecore.resource.Resource;

public interface StoexContextProvider {
    
    StoexContext getContext(Resource resource);
    
}
