package org.palladiosimulator.commons.stoex.ui.dialog.impl;

import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;

@SuppressWarnings("restriction")
public class StoexEditedResourceProvider implements IEditedResourceProvider {
    
    @Override
    public XtextResource createResource() {
        final var rs = new XtextResourceSet();
        final var tmpURI = URI.createURI("virtual:/" + UUID.randomUUID().toString() + ".stoex");
        return (XtextResource) rs.createResource(tmpURI);
    }

}