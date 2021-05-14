package org.palladiosimulator.commons.stoex.tests.api.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.commons.stoex.api.impl.PlainStoExParserImpl;

import de.uka.ipd.sdq.stoex.Expression;
import de.uka.ipd.sdq.stoex.IntLiteral;

public class PlainStoExParserImplTest {

    private PlainStoExParserImpl subject;

    @BeforeEach
    public void setup() {
        subject = new PlainStoExParserImpl();
    }

    @Test
    public void testIntParsing() throws ParseException {
        Expression actual = subject.parse("1");
        assertTrue(actual instanceof IntLiteral);
        assertEquals(1, ((IntLiteral) actual).getValue());
    }

}
