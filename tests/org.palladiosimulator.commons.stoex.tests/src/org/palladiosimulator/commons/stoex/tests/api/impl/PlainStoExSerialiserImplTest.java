package org.palladiosimulator.commons.stoex.tests.api.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.NotSerializableException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.commons.stoex.api.impl.PlainStoExSerialiserImpl;

import de.uka.ipd.sdq.stoex.StoexFactory;

public class PlainStoExSerialiserImplTest {

    private PlainStoExSerialiserImpl subject;

    @BeforeEach
    public void setup() {
        this.subject = new PlainStoExSerialiserImpl();
    }

    @Test
    public void testSerializeVariableReference() throws NotSerializableException {
        var ref = StoexFactory.eINSTANCE.createVariableReference();
        ref.setReferenceName("foo");

        String actual = subject.serialise(ref);

        assertEquals("foo", actual);
    }

    @Test
    public void testSerializeNamespaceReference() throws NotSerializableException {
        var ref = StoexFactory.eINSTANCE.createNamespaceReference();
        ref.setReferenceName("foo");
        var ref2 = StoexFactory.eINSTANCE.createVariableReference();
        ref2.setReferenceName("bar");
        ref.setInnerReference_NamespaceReference(ref2);

        String actual = subject.serialise(ref);

        assertEquals("foo.bar", actual);
    }

}
