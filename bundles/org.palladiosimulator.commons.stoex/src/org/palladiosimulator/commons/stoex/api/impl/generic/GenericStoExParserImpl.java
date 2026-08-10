package org.palladiosimulator.commons.stoex.api.impl.generic;

import java.io.StringReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import jakarta.inject.Provider;

import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;

import de.uka.ipd.sdq.stoex.Expression;

/**
 * Wrapper for the Xtext StoEx parser.
 */
public abstract class GenericStoExParserImpl implements GenericStoExParser {

    private final IParser parser;

    /**
     * Constructs new parser instance.
     */
    public GenericStoExParserImpl(Provider<IParser> parserProvider) {
        this.parser = parserProvider.get();
    }

    @Override
    public Expression parse(String serializedStoEx) throws ParseException {
        if (serializedStoEx == null || serializedStoEx.isBlank()) {
            throw new ParseException("The given stoex is empty. Therefore it is no valid stoex.", 0);
        }
        try (var sr = new StringReader(serializedStoEx)) {
            IParseResult result = parser.parse(sr);
            assertNoSyntaxErrorException(result);
            return (Expression) result.getRootASTElement();
        }
    }

    /**
     * Ensures that there are no syntax errors contained in the result.
     * 
     * @param result
     *            the result of the Xtext parsing process
     * @throws SyntaxErrorException
     *             throw if the result is invalid or contains syntax errors. Contains a textual
     *             description of the syntax error.
     */
    private void assertNoSyntaxErrorException(IParseResult result) throws ParseException {
        if (result == null) {
            throw new ParseException("Unspecified syntax error", 0);
        }
        if (!result.hasSyntaxErrors()) {
            return;
        }
        List<String> errorMessages = new ArrayList<>();
        for (INode error : result.getSyntaxErrors()) {
            Optional.ofNullable(error)
                .map(INode::getSyntaxErrorMessage)
                .map(SyntaxErrorMessage::getMessage)
                .ifPresent(errorMessages::add);
        }
        String errorMessage = String.join(System.lineSeparator(), errorMessages);
        throw new ParseException(errorMessage, 0);
    }

}
