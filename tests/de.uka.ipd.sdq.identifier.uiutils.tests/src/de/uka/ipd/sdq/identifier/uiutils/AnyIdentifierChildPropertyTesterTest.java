package de.uka.ipd.sdq.identifier.uiutils;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.core.expressions.IPropertyTester;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import identifiertesting.IdentifiertestingFactory;
import tools.mdsd.library.standalone.initialization.StandaloneInitializationException;
import tools.mdsd.library.standalone.initialization.StandaloneInitializerBuilder;

public class AnyIdentifierChildPropertyTesterTest {

    protected static final IdentifiertestingFactory F = IdentifiertestingFactory.eINSTANCE;
    protected IPropertyTester subject;

    @BeforeAll
    public static void init() throws StandaloneInitializationException {
        StandaloneInitializerBuilder.builder()
            .build()
            .init();
    }

    @BeforeEach
    public void setup() {
        this.subject = new AnyIdentifierChildPropertyTester();
    }
    
    @Test
    public void testInvalidProperty() {
        assertFalse(subject.test(null, "invalid", null, null));
    }
    
    @Test
    public void testChildNoEObject() {
        assertFalse(subject.test(new Object(), "child", null, null));
    }
    
    @Test
    public void testChildDirectIdentifier() {
        var element = F.createIdentified();
        assertTrue(subject.test(element, "child", null, null));
    }
    
    @Test
    public void testChildDirectNoIdentifier() {
        var element = F.createNonIdentified();
        assertFalse(subject.test(element, "child", null, null));
    }
    
    @Test
    public void testChildIndirectIdentifier() {
        var element_0 = F.createNonIdentified();
        var element_0_0 = F.createIdentified();
        element_0.getComposedElements().add(element_0_0);
        
        assertTrue(subject.test(element_0, "child", null, null));
    }

}
