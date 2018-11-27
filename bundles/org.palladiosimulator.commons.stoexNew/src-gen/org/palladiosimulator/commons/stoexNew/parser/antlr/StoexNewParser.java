/*
 * generated by Xtext 2.12.0
 */
package org.palladiosimulator.commons.stoexNew.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.palladiosimulator.commons.stoexNew.parser.antlr.internal.InternalStoexNewParser;
import org.palladiosimulator.commons.stoexNew.services.StoexNewGrammarAccess;

public class StoexNewParser extends AbstractAntlrParser {

	@Inject
	private StoexNewGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalStoexNewParser createParser(XtextTokenStream stream) {
		return new InternalStoexNewParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "expression";
	}

	public StoexNewGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(StoexNewGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}