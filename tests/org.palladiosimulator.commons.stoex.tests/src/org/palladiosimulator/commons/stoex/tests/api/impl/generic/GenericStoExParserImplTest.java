package org.palladiosimulator.commons.stoex.tests.api.impl.generic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.commons.stoex.api.impl.generic.GenericStoExParserImpl;

import de.uka.ipd.sdq.stoex.Expression;
import de.uka.ipd.sdq.stoex.StoexFactory;

public class GenericStoExParserImplTest {

    private GenericStoExParserImpl subject;
    private IParser parserMock;

    @BeforeEach
    public void setup() {
        parserMock = mock(IParser.class);
        subject = new GenericStoExParserImpl(() -> parserMock) {
        };
    }

    @Test
    public void testSuccessfullParsing() throws ParseException, IOException {
        // setup
        String expectedParseInput = "foo";
        EObject expectedResultObject = StoexFactory.eINSTANCE.createIntLiteral();
        IParseResult parseResultMock = mock(IParseResult.class);
        Mutable<String> actualParseInput = mockParseResultOfParser(parseResultMock);
        when(parseResultMock.hasSyntaxErrors()).thenReturn(false);
        when(parseResultMock.getRootASTElement()).thenReturn(expectedResultObject);

        // execution
        Expression actualResultObject = subject.parse(expectedParseInput);

        // verification
        assertEquals(expectedParseInput, actualParseInput.getValue());
        assertEquals(expectedResultObject, actualResultObject);
    }

    @Test
    public void testFailedParsingWithErrors() throws ParseException {
        // setup
        String expectedParseInput = "foo";
        IParseResult parseResultMock = mock(IParseResult.class);
        Mutable<String> actualParseInput = mockParseResultOfParser(parseResultMock);
        when(parseResultMock.hasSyntaxErrors()).thenReturn(true);
        Collection<INode> syntaxErrors = new ArrayList<>();
        when(parseResultMock.getSyntaxErrors()).thenReturn(syntaxErrors);
        syntaxErrors.add(mockSyntaxErrorNode("foo"));
        syntaxErrors.add(mockSyntaxErrorNode("bar"));

        // execution
        ParseException actualException = null;
        try {
            subject.parse(expectedParseInput);
        } catch (ParseException e) {
            actualException = e;
        }

        // verification
        assertNotNull(actualException);
        assertEquals(expectedParseInput, actualParseInput.getValue());
        assertEquals("foo" + System.lineSeparator() + "bar", actualException.getMessage());
    }

    @Test
    public void testFailedParsingWithoutResult() throws ParseException {
        // setup
        String expectedParseInput = "foo";
        when(parserMock.parse(any(Reader.class))).thenReturn(null);

        // execution
        assertThrows(ParseException.class, () -> subject.parse(expectedParseInput));
    }
    
    @Test
    public void testParseExceptionOnNull() {
        assertThrows(ParseException.class, () -> subject.parse(null));
    }
    
    @Test
    public void testParseExceptionOnBlank() {
        assertThrows(ParseException.class, () -> subject.parse(" \t "));
    }

    protected INode mockSyntaxErrorNode(String errorMessage) {
        INode node = mock(INode.class);
        when(node.getSyntaxErrorMessage()).thenReturn(new SyntaxErrorMessage(errorMessage, null));
        return node;
    }

    protected Mutable<String> mockParseResultOfParser(IParseResult parseResultMock) {
        Mutable<String> actualParseInput = new MutableObject<>();
        when(parserMock.parse(any(Reader.class))).thenAnswer((e) -> {
            try (var br = new BufferedReader((Reader) e.getArgument(0))) {
                actualParseInput.setValue(br.lines()
                    .collect(Collectors.joining()));
            }
            return parseResultMock;
        });
        return actualParseInput;
    }

}
