package de.uka.ipd.sdq.stoex.test;

import org.junit.jupiter.api.Test;

import de.uka.ipd.sdq.stoex.StoexFactory;
import de.uka.ipd.sdq.stoex.test.impl.ConstraintTestBase;

public class StoExValidationTest extends ConstraintTestBase {

    @Test
    public void testNoViolationForNoDotInNamespaceReference() {
        var namespaceReference = StoexFactory.eINSTANCE.createNamespaceReference();
        var variableReference = StoexFactory.eINSTANCE.createVariableReference();
        namespaceReference.setInnerReference_NamespaceReference(variableReference);
        namespaceReference.setReferenceName("foo");
        variableReference.setReferenceName("bar");
        assertNoViolation(namespaceReference, "referenceSegmentMustNeverContainADot");
    }

    @Test
    public void testNoViolationForNoDotInVariableReference() {
        var variableReference = StoexFactory.eINSTANCE.createVariableReference();
        variableReference.setReferenceName("foo_bar");
        assertNoViolation(variableReference, "referenceSegmentMustNeverContainADot");
    }

    @Test
    public void testViolationForDotInVariableReference() {
        var variableReference = StoexFactory.eINSTANCE.createVariableReference();
        variableReference.setReferenceName("foo.bar");
        assertViolation(variableReference, "referenceSegmentMustNeverContainADot");
    }

    @Test
    public void testViolationForDotInNamespaceReference() {
        var namespaceReference = StoexFactory.eINSTANCE.createNamespaceReference();
        var variableReference = StoexFactory.eINSTANCE.createVariableReference();
        namespaceReference.setInnerReference_NamespaceReference(variableReference);
        namespaceReference.setReferenceName("foo.bar");
        variableReference.setReferenceName("bar");
        assertViolation(namespaceReference, "referenceSegmentMustNeverContainADot");
    }

}
