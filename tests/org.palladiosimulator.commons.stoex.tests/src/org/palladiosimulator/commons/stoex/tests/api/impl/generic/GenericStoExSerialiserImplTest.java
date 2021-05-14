package org.palladiosimulator.commons.stoex.tests.api.impl.generic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.NotSerializableException;

import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.eclipse.xtext.serializer.ISerializer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.commons.stoex.StoexStandaloneSetup;
import org.palladiosimulator.commons.stoex.api.impl.generic.GenericStoExSerialiserImpl;

import de.uka.ipd.sdq.stoex.AbstractNamedReference;
import de.uka.ipd.sdq.stoex.Expression;
import de.uka.ipd.sdq.stoex.IntLiteral;
import de.uka.ipd.sdq.stoex.StoexFactory;
import de.uka.ipd.sdq.stoex.VariableReference;
import tools.mdsd.library.standalone.initialization.StandaloneInitializationException;
import tools.mdsd.library.standalone.initialization.StandaloneInitializerBuilder;

public class GenericStoExSerialiserImplTest {

    @FunctionalInterface
    private static interface SerialiseAbstractNamedReferenceFunction {
        String serialise(AbstractNamedReference reference) throws NotSerializableException;
    }

    private MutableObject<SerialiseAbstractNamedReferenceFunction> serialiseFunction;
    private ISerializer serialiserMock;
    private GenericStoExSerialiserImpl subject;

    @BeforeAll
    public static void init() throws StandaloneInitializationException {
        StandaloneInitializerBuilder.builder()
            .addCustomTask(StoexStandaloneSetup::doSetup)
            .build()
            .init();
    }

    @BeforeEach
    public void setup() {
        serialiseFunction = new MutableObject<SerialiseAbstractNamedReferenceFunction>();
        serialiserMock = mock(ISerializer.class);
        subject = new GenericStoExSerialiserImpl(() -> serialiserMock) {
            @Override
            public String serialise(AbstractNamedReference reference) throws NotSerializableException {
                return serialiseFunction.getValue()
                    .serialise(reference);
            }
        };
    }

    @Test
    public void testSuccessfullSerialisation() throws NotSerializableException {
        IntLiteral input = StoexFactory.eINSTANCE.createIntLiteral();
        input.setValue(42);
        String expectedOutput = "foo";
        Mutable<Expression> internalInput = new MutableObject<>();
        when(serialiserMock.serialize(any(Expression.class))).thenAnswer(e -> {
            internalInput.setValue(e.getArgument(0));
            return expectedOutput;
        });

        String actualOutput = subject.serialise(input);

        assertEquals(expectedOutput, actualOutput);
        assertTrue(internalInput.getValue() instanceof IntLiteral);
        assertEquals(42, ((IntLiteral)internalInput.getValue()).getValue());
    }
    
    @Test
    public void testSuccessfullDelegation() throws NotSerializableException {
        VariableReference input = StoexFactory.eINSTANCE.createVariableReference();
        input.setReferenceName("bar");
        Mutable<AbstractNamedReference> internalInput = new MutableObject<>();
        serialiseFunction.setValue(reference -> {
            internalInput.setValue(reference);
            return "foo";
        });
        
        String actualOutput = subject.serialise(input);
        
        assertEquals(input, internalInput.getValue());
        assertEquals("foo", actualOutput);
    }

    @Test
    public void testFailedSerialisation() {
        IntLiteral input = StoexFactory.eINSTANCE.createIntLiteral();
        when(serialiserMock.serialize(any(Expression.class))).thenThrow(new RuntimeException("foo"));
        
        try {
            subject.serialise(input);
            fail("Expected exception.");
        } catch (NotSerializableException e) {
            assertEquals("foo", e.getMessage());
        }
    }
    
}
