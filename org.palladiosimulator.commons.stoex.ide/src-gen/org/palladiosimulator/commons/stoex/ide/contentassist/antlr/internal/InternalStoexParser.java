package org.palladiosimulator.commons.stoex.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.palladiosimulator.commons.stoex.services.StoexGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalStoexParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CONDDELIMITER", "RULE_ELSEDELIMITER", "RULE_POW", "RULE_NOT", "RULE_SQUARE_PAREN_L", "RULE_SQUARE_PAREN_R", "RULE_LPAREN", "RULE_RPAREN", "RULE_COLON", "RULE_DOT", "RULE_DOUBLEPDF", "RULE_INTPMF", "RULE_DOUBLEPMF", "RULE_ENUMPMF", "RULE_BOOLPMF", "RULE_SEMI", "RULE_DOUBLE", "RULE_DECINT", "RULE_ID", "RULE_BOOLEAN_KEYWORDS", "RULE_STRING", "RULE_ORDERED_DEF", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AND'", "'OR'", "'XOR'", "'>'", "'<'", "'=='", "'<>'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'_'", "'unitless'", "'B'", "'s'", "'m'"
    };
    public static final int RULE_BOOLEAN_KEYWORDS=23;
    public static final int RULE_LPAREN=10;
    public static final int RULE_SQUARE_PAREN_L=8;
    public static final int RULE_ENUMPMF=17;
    public static final int RULE_SQUARE_PAREN_R=9;
    public static final int RULE_ID=22;
    public static final int RULE_DIGIT=26;
    public static final int RULE_COLON=12;
    public static final int RULE_BOOLPMF=18;
    public static final int RULE_ORDERED_DEF=25;
    public static final int RULE_ML_COMMENT=27;
    public static final int RULE_ELSEDELIMITER=5;
    public static final int RULE_INTPMF=15;
    public static final int RULE_STRING=24;
    public static final int RULE_NOT=7;
    public static final int RULE_DOUBLEPMF=16;
    public static final int RULE_POW=6;
    public static final int RULE_SL_COMMENT=28;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=20;
    public static final int T__38=38;
    public static final int RULE_CONDDELIMITER=4;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_DECINT=21;
    public static final int RULE_DOT=13;
    public static final int EOF=-1;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=29;
    public static final int RULE_DOUBLEPDF=14;
    public static final int RULE_ANY_OTHER=30;
    public static final int RULE_RPAREN=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SEMI=19;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalStoexParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStoexParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStoexParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStoex.g"; }


    	private StoexGrammarAccess grammarAccess;

    	public void setGrammarAccess(StoexGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleexpression"
    // InternalStoex.g:54:1: entryRuleexpression : ruleexpression EOF ;
    public final void entryRuleexpression() throws RecognitionException {
        try {
            // InternalStoex.g:55:1: ( ruleexpression EOF )
            // InternalStoex.g:56:1: ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalStoex.g:63:1: ruleexpression : ( ruleifelseExpr ) ;
    public final void ruleexpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:67:2: ( ( ruleifelseExpr ) )
            // InternalStoex.g:68:2: ( ruleifelseExpr )
            {
            // InternalStoex.g:68:2: ( ruleifelseExpr )
            // InternalStoex.g:69:3: ruleifelseExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getIfelseExprParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleifelseExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getIfelseExprParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRuleifelseExpr"
    // InternalStoex.g:79:1: entryRuleifelseExpr : ruleifelseExpr EOF ;
    public final void entryRuleifelseExpr() throws RecognitionException {
        try {
            // InternalStoex.g:80:1: ( ruleifelseExpr EOF )
            // InternalStoex.g:81:1: ruleifelseExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfelseExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleifelseExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfelseExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleifelseExpr"


    // $ANTLR start "ruleifelseExpr"
    // InternalStoex.g:88:1: ruleifelseExpr : ( ( rule__IfelseExpr__Group__0 ) ) ;
    public final void ruleifelseExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:92:2: ( ( ( rule__IfelseExpr__Group__0 ) ) )
            // InternalStoex.g:93:2: ( ( rule__IfelseExpr__Group__0 ) )
            {
            // InternalStoex.g:93:2: ( ( rule__IfelseExpr__Group__0 ) )
            // InternalStoex.g:94:3: ( rule__IfelseExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfelseExprAccess().getGroup()); 
            }
            // InternalStoex.g:95:3: ( rule__IfelseExpr__Group__0 )
            // InternalStoex.g:95:4: rule__IfelseExpr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfelseExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfelseExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleifelseExpr"


    // $ANTLR start "entryRuleboolAndExpr"
    // InternalStoex.g:104:1: entryRuleboolAndExpr : ruleboolAndExpr EOF ;
    public final void entryRuleboolAndExpr() throws RecognitionException {
        try {
            // InternalStoex.g:105:1: ( ruleboolAndExpr EOF )
            // InternalStoex.g:106:1: ruleboolAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAndExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleboolAndExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolAndExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleboolAndExpr"


    // $ANTLR start "ruleboolAndExpr"
    // InternalStoex.g:113:1: ruleboolAndExpr : ( ( rule__BoolAndExpr__Group__0 ) ) ;
    public final void ruleboolAndExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:117:2: ( ( ( rule__BoolAndExpr__Group__0 ) ) )
            // InternalStoex.g:118:2: ( ( rule__BoolAndExpr__Group__0 ) )
            {
            // InternalStoex.g:118:2: ( ( rule__BoolAndExpr__Group__0 ) )
            // InternalStoex.g:119:3: ( rule__BoolAndExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAndExprAccess().getGroup()); 
            }
            // InternalStoex.g:120:3: ( rule__BoolAndExpr__Group__0 )
            // InternalStoex.g:120:4: rule__BoolAndExpr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoolAndExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolAndExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleboolAndExpr"


    // $ANTLR start "entryRuleboolOrExpr"
    // InternalStoex.g:129:1: entryRuleboolOrExpr : ruleboolOrExpr EOF ;
    public final void entryRuleboolOrExpr() throws RecognitionException {
        try {
            // InternalStoex.g:130:1: ( ruleboolOrExpr EOF )
            // InternalStoex.g:131:1: ruleboolOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolOrExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleboolOrExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolOrExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleboolOrExpr"


    // $ANTLR start "ruleboolOrExpr"
    // InternalStoex.g:138:1: ruleboolOrExpr : ( ( rule__BoolOrExpr__Group__0 ) ) ;
    public final void ruleboolOrExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:142:2: ( ( ( rule__BoolOrExpr__Group__0 ) ) )
            // InternalStoex.g:143:2: ( ( rule__BoolOrExpr__Group__0 ) )
            {
            // InternalStoex.g:143:2: ( ( rule__BoolOrExpr__Group__0 ) )
            // InternalStoex.g:144:3: ( rule__BoolOrExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolOrExprAccess().getGroup()); 
            }
            // InternalStoex.g:145:3: ( rule__BoolOrExpr__Group__0 )
            // InternalStoex.g:145:4: rule__BoolOrExpr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoolOrExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolOrExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleboolOrExpr"


    // $ANTLR start "entryRulecompareExpr"
    // InternalStoex.g:154:1: entryRulecompareExpr : rulecompareExpr EOF ;
    public final void entryRulecompareExpr() throws RecognitionException {
        try {
            // InternalStoex.g:155:1: ( rulecompareExpr EOF )
            // InternalStoex.g:156:1: rulecompareExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulecompareExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecompareExpr"


    // $ANTLR start "rulecompareExpr"
    // InternalStoex.g:163:1: rulecompareExpr : ( ( rule__CompareExpr__Group__0 ) ) ;
    public final void rulecompareExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:167:2: ( ( ( rule__CompareExpr__Group__0 ) ) )
            // InternalStoex.g:168:2: ( ( rule__CompareExpr__Group__0 ) )
            {
            // InternalStoex.g:168:2: ( ( rule__CompareExpr__Group__0 ) )
            // InternalStoex.g:169:3: ( rule__CompareExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExprAccess().getGroup()); 
            }
            // InternalStoex.g:170:3: ( rule__CompareExpr__Group__0 )
            // InternalStoex.g:170:4: rule__CompareExpr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecompareExpr"


    // $ANTLR start "entryRulesumExpr"
    // InternalStoex.g:179:1: entryRulesumExpr : rulesumExpr EOF ;
    public final void entryRulesumExpr() throws RecognitionException {
        try {
            // InternalStoex.g:180:1: ( rulesumExpr EOF )
            // InternalStoex.g:181:1: rulesumExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulesumExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesumExpr"


    // $ANTLR start "rulesumExpr"
    // InternalStoex.g:188:1: rulesumExpr : ( ( rule__SumExpr__Group__0 ) ) ;
    public final void rulesumExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:192:2: ( ( ( rule__SumExpr__Group__0 ) ) )
            // InternalStoex.g:193:2: ( ( rule__SumExpr__Group__0 ) )
            {
            // InternalStoex.g:193:2: ( ( rule__SumExpr__Group__0 ) )
            // InternalStoex.g:194:3: ( rule__SumExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumExprAccess().getGroup()); 
            }
            // InternalStoex.g:195:3: ( rule__SumExpr__Group__0 )
            // InternalStoex.g:195:4: rule__SumExpr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SumExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesumExpr"


    // $ANTLR start "entryRuleprodExpr"
    // InternalStoex.g:204:1: entryRuleprodExpr : ruleprodExpr EOF ;
    public final void entryRuleprodExpr() throws RecognitionException {
        try {
            // InternalStoex.g:205:1: ( ruleprodExpr EOF )
            // InternalStoex.g:206:1: ruleprodExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProdExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleprodExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProdExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleprodExpr"


    // $ANTLR start "ruleprodExpr"
    // InternalStoex.g:213:1: ruleprodExpr : ( ( rule__ProdExpr__Group__0 ) ) ;
    public final void ruleprodExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:217:2: ( ( ( rule__ProdExpr__Group__0 ) ) )
            // InternalStoex.g:218:2: ( ( rule__ProdExpr__Group__0 ) )
            {
            // InternalStoex.g:218:2: ( ( rule__ProdExpr__Group__0 ) )
            // InternalStoex.g:219:3: ( rule__ProdExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProdExprAccess().getGroup()); 
            }
            // InternalStoex.g:220:3: ( rule__ProdExpr__Group__0 )
            // InternalStoex.g:220:4: rule__ProdExpr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProdExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProdExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprodExpr"


    // $ANTLR start "entryRulepowExpr"
    // InternalStoex.g:229:1: entryRulepowExpr : rulepowExpr EOF ;
    public final void entryRulepowExpr() throws RecognitionException {
        try {
            // InternalStoex.g:230:1: ( rulepowExpr EOF )
            // InternalStoex.g:231:1: rulepowExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulepowExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepowExpr"


    // $ANTLR start "rulepowExpr"
    // InternalStoex.g:238:1: rulepowExpr : ( ( rule__PowExpr__Group__0 ) ) ;
    public final void rulepowExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:242:2: ( ( ( rule__PowExpr__Group__0 ) ) )
            // InternalStoex.g:243:2: ( ( rule__PowExpr__Group__0 ) )
            {
            // InternalStoex.g:243:2: ( ( rule__PowExpr__Group__0 ) )
            // InternalStoex.g:244:3: ( rule__PowExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExprAccess().getGroup()); 
            }
            // InternalStoex.g:245:3: ( rule__PowExpr__Group__0 )
            // InternalStoex.g:245:4: rule__PowExpr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PowExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepowExpr"


    // $ANTLR start "entryRuleunaryExpr"
    // InternalStoex.g:254:1: entryRuleunaryExpr : ruleunaryExpr EOF ;
    public final void entryRuleunaryExpr() throws RecognitionException {
        try {
            // InternalStoex.g:255:1: ( ruleunaryExpr EOF )
            // InternalStoex.g:256:1: ruleunaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleunaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleunaryExpr"


    // $ANTLR start "ruleunaryExpr"
    // InternalStoex.g:263:1: ruleunaryExpr : ( ( rule__UnaryExpr__Alternatives ) ) ;
    public final void ruleunaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:267:2: ( ( ( rule__UnaryExpr__Alternatives ) ) )
            // InternalStoex.g:268:2: ( ( rule__UnaryExpr__Alternatives ) )
            {
            // InternalStoex.g:268:2: ( ( rule__UnaryExpr__Alternatives ) )
            // InternalStoex.g:269:3: ( rule__UnaryExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExprAccess().getAlternatives()); 
            }
            // InternalStoex.g:270:3: ( rule__UnaryExpr__Alternatives )
            // InternalStoex.g:270:4: rule__UnaryExpr__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryExpr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExprAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleunaryExpr"


    // $ANTLR start "entryRuleNotExpression"
    // InternalStoex.g:279:1: entryRuleNotExpression : ruleNotExpression EOF ;
    public final void entryRuleNotExpression() throws RecognitionException {
        try {
            // InternalStoex.g:280:1: ( ruleNotExpression EOF )
            // InternalStoex.g:281:1: ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNotExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalStoex.g:288:1: ruleNotExpression : ( ( rule__NotExpression__Group__0 ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:292:2: ( ( ( rule__NotExpression__Group__0 ) ) )
            // InternalStoex.g:293:2: ( ( rule__NotExpression__Group__0 ) )
            {
            // InternalStoex.g:293:2: ( ( rule__NotExpression__Group__0 ) )
            // InternalStoex.g:294:3: ( rule__NotExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getGroup()); 
            }
            // InternalStoex.g:295:3: ( rule__NotExpression__Group__0 )
            // InternalStoex.g:295:4: rule__NotExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NotExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleNegativeExpression"
    // InternalStoex.g:304:1: entryRuleNegativeExpression : ruleNegativeExpression EOF ;
    public final void entryRuleNegativeExpression() throws RecognitionException {
        try {
            // InternalStoex.g:305:1: ( ruleNegativeExpression EOF )
            // InternalStoex.g:306:1: ruleNegativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNegativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegativeExpression"


    // $ANTLR start "ruleNegativeExpression"
    // InternalStoex.g:313:1: ruleNegativeExpression : ( ( rule__NegativeExpression__Group__0 ) ) ;
    public final void ruleNegativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:317:2: ( ( ( rule__NegativeExpression__Group__0 ) ) )
            // InternalStoex.g:318:2: ( ( rule__NegativeExpression__Group__0 ) )
            {
            // InternalStoex.g:318:2: ( ( rule__NegativeExpression__Group__0 ) )
            // InternalStoex.g:319:3: ( rule__NegativeExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeExpressionAccess().getGroup()); 
            }
            // InternalStoex.g:320:3: ( rule__NegativeExpression__Group__0 )
            // InternalStoex.g:320:4: rule__NegativeExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NegativeExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegativeExpression"


    // $ANTLR start "entryRuleatom"
    // InternalStoex.g:329:1: entryRuleatom : ruleatom EOF ;
    public final void entryRuleatom() throws RecognitionException {
        try {
            // InternalStoex.g:330:1: ( ruleatom EOF )
            // InternalStoex.g:331:1: ruleatom EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleatom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleatom"


    // $ANTLR start "ruleatom"
    // InternalStoex.g:338:1: ruleatom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleatom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:342:2: ( ( ( rule__Atom__Alternatives ) ) )
            // InternalStoex.g:343:2: ( ( rule__Atom__Alternatives ) )
            {
            // InternalStoex.g:343:2: ( ( rule__Atom__Alternatives ) )
            // InternalStoex.g:344:3: ( rule__Atom__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getAlternatives()); 
            }
            // InternalStoex.g:345:3: ( rule__Atom__Alternatives )
            // InternalStoex.g:345:4: rule__Atom__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Atom__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleatom"


    // $ANTLR start "entryRuleDoubleLiteral"
    // InternalStoex.g:354:1: entryRuleDoubleLiteral : ruleDoubleLiteral EOF ;
    public final void entryRuleDoubleLiteral() throws RecognitionException {
        try {
            // InternalStoex.g:355:1: ( ruleDoubleLiteral EOF )
            // InternalStoex.g:356:1: ruleDoubleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDoubleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoubleLiteral"


    // $ANTLR start "ruleDoubleLiteral"
    // InternalStoex.g:363:1: ruleDoubleLiteral : ( ( rule__DoubleLiteral__Group__0 ) ) ;
    public final void ruleDoubleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:367:2: ( ( ( rule__DoubleLiteral__Group__0 ) ) )
            // InternalStoex.g:368:2: ( ( rule__DoubleLiteral__Group__0 ) )
            {
            // InternalStoex.g:368:2: ( ( rule__DoubleLiteral__Group__0 ) )
            // InternalStoex.g:369:3: ( rule__DoubleLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLiteralAccess().getGroup()); 
            }
            // InternalStoex.g:370:3: ( rule__DoubleLiteral__Group__0 )
            // InternalStoex.g:370:4: rule__DoubleLiteral__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoubleLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoubleLiteral"


    // $ANTLR start "entryRuleProbabilityFunctionLiteral"
    // InternalStoex.g:379:1: entryRuleProbabilityFunctionLiteral : ruleProbabilityFunctionLiteral EOF ;
    public final void entryRuleProbabilityFunctionLiteral() throws RecognitionException {
        try {
            // InternalStoex.g:380:1: ( ruleProbabilityFunctionLiteral EOF )
            // InternalStoex.g:381:1: ruleProbabilityFunctionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityFunctionLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleProbabilityFunctionLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityFunctionLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProbabilityFunctionLiteral"


    // $ANTLR start "ruleProbabilityFunctionLiteral"
    // InternalStoex.g:388:1: ruleProbabilityFunctionLiteral : ( ( rule__ProbabilityFunctionLiteral__Function_ProbabilityFunctionLiteralAssignment ) ) ;
    public final void ruleProbabilityFunctionLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:392:2: ( ( ( rule__ProbabilityFunctionLiteral__Function_ProbabilityFunctionLiteralAssignment ) ) )
            // InternalStoex.g:393:2: ( ( rule__ProbabilityFunctionLiteral__Function_ProbabilityFunctionLiteralAssignment ) )
            {
            // InternalStoex.g:393:2: ( ( rule__ProbabilityFunctionLiteral__Function_ProbabilityFunctionLiteralAssignment ) )
            // InternalStoex.g:394:3: ( rule__ProbabilityFunctionLiteral__Function_ProbabilityFunctionLiteralAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityFunctionLiteralAccess().getFunction_ProbabilityFunctionLiteralAssignment()); 
            }
            // InternalStoex.g:395:3: ( rule__ProbabilityFunctionLiteral__Function_ProbabilityFunctionLiteralAssignment )
            // InternalStoex.g:395:4: rule__ProbabilityFunctionLiteral__Function_ProbabilityFunctionLiteralAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityFunctionLiteral__Function_ProbabilityFunctionLiteralAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityFunctionLiteralAccess().getFunction_ProbabilityFunctionLiteralAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProbabilityFunctionLiteral"


    // $ANTLR start "entryRuleParenthesis"
    // InternalStoex.g:404:1: entryRuleParenthesis : ruleParenthesis EOF ;
    public final void entryRuleParenthesis() throws RecognitionException {
        try {
            // InternalStoex.g:405:1: ( ruleParenthesis EOF )
            // InternalStoex.g:406:1: ruleParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParenthesis();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalStoex.g:413:1: ruleParenthesis : ( ( rule__Parenthesis__Group__0 ) ) ;
    public final void ruleParenthesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:417:2: ( ( ( rule__Parenthesis__Group__0 ) ) )
            // InternalStoex.g:418:2: ( ( rule__Parenthesis__Group__0 ) )
            {
            // InternalStoex.g:418:2: ( ( rule__Parenthesis__Group__0 ) )
            // InternalStoex.g:419:3: ( rule__Parenthesis__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisAccess().getGroup()); 
            }
            // InternalStoex.g:420:3: ( rule__Parenthesis__Group__0 )
            // InternalStoex.g:420:4: rule__Parenthesis__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parenthesis__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleFunctionLiteral"
    // InternalStoex.g:429:1: entryRuleFunctionLiteral : ruleFunctionLiteral EOF ;
    public final void entryRuleFunctionLiteral() throws RecognitionException {
        try {
            // InternalStoex.g:430:1: ( ruleFunctionLiteral EOF )
            // InternalStoex.g:431:1: ruleFunctionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFunctionLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionLiteral"


    // $ANTLR start "ruleFunctionLiteral"
    // InternalStoex.g:438:1: ruleFunctionLiteral : ( ( rule__FunctionLiteral__Group__0 ) ) ;
    public final void ruleFunctionLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:442:2: ( ( ( rule__FunctionLiteral__Group__0 ) ) )
            // InternalStoex.g:443:2: ( ( rule__FunctionLiteral__Group__0 ) )
            {
            // InternalStoex.g:443:2: ( ( rule__FunctionLiteral__Group__0 ) )
            // InternalStoex.g:444:3: ( rule__FunctionLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionLiteralAccess().getGroup()); 
            }
            // InternalStoex.g:445:3: ( rule__FunctionLiteral__Group__0 )
            // InternalStoex.g:445:4: rule__FunctionLiteral__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionLiteral"


    // $ANTLR start "entryRuleVariable"
    // InternalStoex.g:454:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalStoex.g:455:1: ( ruleVariable EOF )
            // InternalStoex.g:456:1: ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalStoex.g:463:1: ruleVariable : ( ( rule__Variable__Id_VariableAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:467:2: ( ( ( rule__Variable__Id_VariableAssignment ) ) )
            // InternalStoex.g:468:2: ( ( rule__Variable__Id_VariableAssignment ) )
            {
            // InternalStoex.g:468:2: ( ( rule__Variable__Id_VariableAssignment ) )
            // InternalStoex.g:469:3: ( rule__Variable__Id_VariableAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getId_VariableAssignment()); 
            }
            // InternalStoex.g:470:3: ( rule__Variable__Id_VariableAssignment )
            // InternalStoex.g:470:4: rule__Variable__Id_VariableAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Id_VariableAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getId_VariableAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAbstractNamedReference"
    // InternalStoex.g:479:1: entryRuleAbstractNamedReference : ruleAbstractNamedReference EOF ;
    public final void entryRuleAbstractNamedReference() throws RecognitionException {
        try {
            // InternalStoex.g:480:1: ( ruleAbstractNamedReference EOF )
            // InternalStoex.g:481:1: ruleAbstractNamedReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractNamedReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractNamedReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractNamedReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractNamedReference"


    // $ANTLR start "ruleAbstractNamedReference"
    // InternalStoex.g:488:1: ruleAbstractNamedReference : ( ( rule__AbstractNamedReference__Alternatives ) ) ;
    public final void ruleAbstractNamedReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:492:2: ( ( ( rule__AbstractNamedReference__Alternatives ) ) )
            // InternalStoex.g:493:2: ( ( rule__AbstractNamedReference__Alternatives ) )
            {
            // InternalStoex.g:493:2: ( ( rule__AbstractNamedReference__Alternatives ) )
            // InternalStoex.g:494:3: ( rule__AbstractNamedReference__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractNamedReferenceAccess().getAlternatives()); 
            }
            // InternalStoex.g:495:3: ( rule__AbstractNamedReference__Alternatives )
            // InternalStoex.g:495:4: rule__AbstractNamedReference__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AbstractNamedReference__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractNamedReferenceAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractNamedReference"


    // $ANTLR start "entryRuleVariableReference"
    // InternalStoex.g:504:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // InternalStoex.g:505:1: ( ruleVariableReference EOF )
            // InternalStoex.g:506:1: ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVariableReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // InternalStoex.g:513:1: ruleVariableReference : ( ( rule__VariableReference__ReferenceNameAssignment ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:517:2: ( ( ( rule__VariableReference__ReferenceNameAssignment ) ) )
            // InternalStoex.g:518:2: ( ( rule__VariableReference__ReferenceNameAssignment ) )
            {
            // InternalStoex.g:518:2: ( ( rule__VariableReference__ReferenceNameAssignment ) )
            // InternalStoex.g:519:3: ( rule__VariableReference__ReferenceNameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getReferenceNameAssignment()); 
            }
            // InternalStoex.g:520:3: ( rule__VariableReference__ReferenceNameAssignment )
            // InternalStoex.g:520:4: rule__VariableReference__ReferenceNameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableReference__ReferenceNameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getReferenceNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleNamespaceReference"
    // InternalStoex.g:529:1: entryRuleNamespaceReference : ruleNamespaceReference EOF ;
    public final void entryRuleNamespaceReference() throws RecognitionException {
        try {
            // InternalStoex.g:530:1: ( ruleNamespaceReference EOF )
            // InternalStoex.g:531:1: ruleNamespaceReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNamespaceReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamespaceReference"


    // $ANTLR start "ruleNamespaceReference"
    // InternalStoex.g:538:1: ruleNamespaceReference : ( ( rule__NamespaceReference__Group__0 ) ) ;
    public final void ruleNamespaceReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:542:2: ( ( ( rule__NamespaceReference__Group__0 ) ) )
            // InternalStoex.g:543:2: ( ( rule__NamespaceReference__Group__0 ) )
            {
            // InternalStoex.g:543:2: ( ( rule__NamespaceReference__Group__0 ) )
            // InternalStoex.g:544:3: ( rule__NamespaceReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceReferenceAccess().getGroup()); 
            }
            // InternalStoex.g:545:3: ( rule__NamespaceReference__Group__0 )
            // InternalStoex.g:545:4: rule__NamespaceReference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamespaceReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceReferenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamespaceReference"


    // $ANTLR start "entryRuleBoolLiteral"
    // InternalStoex.g:554:1: entryRuleBoolLiteral : ruleBoolLiteral EOF ;
    public final void entryRuleBoolLiteral() throws RecognitionException {
        try {
            // InternalStoex.g:555:1: ( ruleBoolLiteral EOF )
            // InternalStoex.g:556:1: ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolLiteral"


    // $ANTLR start "ruleBoolLiteral"
    // InternalStoex.g:563:1: ruleBoolLiteral : ( ( rule__BoolLiteral__ValueAssignment ) ) ;
    public final void ruleBoolLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:567:2: ( ( ( rule__BoolLiteral__ValueAssignment ) ) )
            // InternalStoex.g:568:2: ( ( rule__BoolLiteral__ValueAssignment ) )
            {
            // InternalStoex.g:568:2: ( ( rule__BoolLiteral__ValueAssignment ) )
            // InternalStoex.g:569:3: ( rule__BoolLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolLiteralAccess().getValueAssignment()); 
            }
            // InternalStoex.g:570:3: ( rule__BoolLiteral__ValueAssignment )
            // InternalStoex.g:570:4: rule__BoolLiteral__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoolLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalStoex.g:579:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalStoex.g:580:1: ( ruleStringLiteral EOF )
            // InternalStoex.g:581:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalStoex.g:588:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:592:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalStoex.g:593:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalStoex.g:593:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalStoex.g:594:3: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // InternalStoex.g:595:3: ( rule__StringLiteral__ValueAssignment )
            // InternalStoex.g:595:4: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalStoex.g:604:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalStoex.g:605:1: ( ruleIntLiteral EOF )
            // InternalStoex.g:606:1: ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleIntLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalStoex.g:613:1: ruleIntLiteral : ( ( rule__IntLiteral__Group__0 ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:617:2: ( ( ( rule__IntLiteral__Group__0 ) ) )
            // InternalStoex.g:618:2: ( ( rule__IntLiteral__Group__0 ) )
            {
            // InternalStoex.g:618:2: ( ( rule__IntLiteral__Group__0 ) )
            // InternalStoex.g:619:3: ( rule__IntLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getGroup()); 
            }
            // InternalStoex.g:620:3: ( rule__IntLiteral__Group__0 )
            // InternalStoex.g:620:4: rule__IntLiteral__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleUnit"
    // InternalStoex.g:629:1: entryRuleUnit : ruleUnit EOF ;
    public final void entryRuleUnit() throws RecognitionException {
        try {
            // InternalStoex.g:630:1: ( ruleUnit EOF )
            // InternalStoex.g:631:1: ruleUnit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // InternalStoex.g:638:1: ruleUnit : ( ( rule__Unit__Alternatives ) ) ;
    public final void ruleUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:642:2: ( ( ( rule__Unit__Alternatives ) ) )
            // InternalStoex.g:643:2: ( ( rule__Unit__Alternatives ) )
            {
            // InternalStoex.g:643:2: ( ( rule__Unit__Alternatives ) )
            // InternalStoex.g:644:3: ( rule__Unit__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitAccess().getAlternatives()); 
            }
            // InternalStoex.g:645:3: ( rule__Unit__Alternatives )
            // InternalStoex.g:645:4: rule__Unit__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Unit__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnit"


    // $ANTLR start "entryRuleunitDiv"
    // InternalStoex.g:654:1: entryRuleunitDiv : ruleunitDiv EOF ;
    public final void entryRuleunitDiv() throws RecognitionException {
        try {
            // InternalStoex.g:655:1: ( ruleunitDiv EOF )
            // InternalStoex.g:656:1: ruleunitDiv EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitDivRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleunitDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitDivRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleunitDiv"


    // $ANTLR start "ruleunitDiv"
    // InternalStoex.g:663:1: ruleunitDiv : ( ( rule__UnitDiv__Group__0 ) ) ;
    public final void ruleunitDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:667:2: ( ( ( rule__UnitDiv__Group__0 ) ) )
            // InternalStoex.g:668:2: ( ( rule__UnitDiv__Group__0 ) )
            {
            // InternalStoex.g:668:2: ( ( rule__UnitDiv__Group__0 ) )
            // InternalStoex.g:669:3: ( rule__UnitDiv__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitDivAccess().getGroup()); 
            }
            // InternalStoex.g:670:3: ( rule__UnitDiv__Group__0 )
            // InternalStoex.g:670:4: rule__UnitDiv__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitDiv__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitDivAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleunitDiv"


    // $ANTLR start "entryRuleunitMulti"
    // InternalStoex.g:679:1: entryRuleunitMulti : ruleunitMulti EOF ;
    public final void entryRuleunitMulti() throws RecognitionException {
        try {
            // InternalStoex.g:680:1: ( ruleunitMulti EOF )
            // InternalStoex.g:681:1: ruleunitMulti EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitMultiRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleunitMulti();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitMultiRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleunitMulti"


    // $ANTLR start "ruleunitMulti"
    // InternalStoex.g:688:1: ruleunitMulti : ( ( rule__UnitMulti__Group__0 ) ) ;
    public final void ruleunitMulti() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:692:2: ( ( ( rule__UnitMulti__Group__0 ) ) )
            // InternalStoex.g:693:2: ( ( rule__UnitMulti__Group__0 ) )
            {
            // InternalStoex.g:693:2: ( ( rule__UnitMulti__Group__0 ) )
            // InternalStoex.g:694:3: ( rule__UnitMulti__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitMultiAccess().getGroup()); 
            }
            // InternalStoex.g:695:3: ( rule__UnitMulti__Group__0 )
            // InternalStoex.g:695:4: rule__UnitMulti__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitMulti__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitMultiAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleunitMulti"


    // $ANTLR start "entryRuleunitPow"
    // InternalStoex.g:704:1: entryRuleunitPow : ruleunitPow EOF ;
    public final void entryRuleunitPow() throws RecognitionException {
        try {
            // InternalStoex.g:705:1: ( ruleunitPow EOF )
            // InternalStoex.g:706:1: ruleunitPow EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitPowRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleunitPow();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitPowRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleunitPow"


    // $ANTLR start "ruleunitPow"
    // InternalStoex.g:713:1: ruleunitPow : ( ( rule__UnitPow__Group__0 ) ) ;
    public final void ruleunitPow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:717:2: ( ( ( rule__UnitPow__Group__0 ) ) )
            // InternalStoex.g:718:2: ( ( rule__UnitPow__Group__0 ) )
            {
            // InternalStoex.g:718:2: ( ( rule__UnitPow__Group__0 ) )
            // InternalStoex.g:719:3: ( rule__UnitPow__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitPowAccess().getGroup()); 
            }
            // InternalStoex.g:720:3: ( rule__UnitPow__Group__0 )
            // InternalStoex.g:720:4: rule__UnitPow__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitPow__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitPowAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleunitPow"


    // $ANTLR start "entryRuleBaseUnit"
    // InternalStoex.g:729:1: entryRuleBaseUnit : ruleBaseUnit EOF ;
    public final void entryRuleBaseUnit() throws RecognitionException {
        try {
            // InternalStoex.g:730:1: ( ruleBaseUnit EOF )
            // InternalStoex.g:731:1: ruleBaseUnit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseUnitRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBaseUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseUnitRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBaseUnit"


    // $ANTLR start "ruleBaseUnit"
    // InternalStoex.g:738:1: ruleBaseUnit : ( ( rule__BaseUnit__NameAssignment ) ) ;
    public final void ruleBaseUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:742:2: ( ( ( rule__BaseUnit__NameAssignment ) ) )
            // InternalStoex.g:743:2: ( ( rule__BaseUnit__NameAssignment ) )
            {
            // InternalStoex.g:743:2: ( ( rule__BaseUnit__NameAssignment ) )
            // InternalStoex.g:744:3: ( rule__BaseUnit__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseUnitAccess().getNameAssignment()); 
            }
            // InternalStoex.g:745:3: ( rule__BaseUnit__NameAssignment )
            // InternalStoex.g:745:4: rule__BaseUnit__NameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BaseUnit__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseUnitAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseUnit"


    // $ANTLR start "entryRuledefinition"
    // InternalStoex.g:754:1: entryRuledefinition : ruledefinition EOF ;
    public final void entryRuledefinition() throws RecognitionException {
        try {
            // InternalStoex.g:755:1: ( ruledefinition EOF )
            // InternalStoex.g:756:1: ruledefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruledefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuledefinition"


    // $ANTLR start "ruledefinition"
    // InternalStoex.g:763:1: ruledefinition : ( ( rule__Definition__Alternatives ) ) ;
    public final void ruledefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:767:2: ( ( ( rule__Definition__Alternatives ) ) )
            // InternalStoex.g:768:2: ( ( rule__Definition__Alternatives ) )
            {
            // InternalStoex.g:768:2: ( ( rule__Definition__Alternatives ) )
            // InternalStoex.g:769:3: ( rule__Definition__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getAlternatives()); 
            }
            // InternalStoex.g:770:3: ( rule__Definition__Alternatives )
            // InternalStoex.g:770:4: rule__Definition__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Definition__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruledefinition"


    // $ANTLR start "entryRuleProbabilityDensityFunction"
    // InternalStoex.g:779:1: entryRuleProbabilityDensityFunction : ruleProbabilityDensityFunction EOF ;
    public final void entryRuleProbabilityDensityFunction() throws RecognitionException {
        try {
            // InternalStoex.g:780:1: ( ruleProbabilityDensityFunction EOF )
            // InternalStoex.g:781:1: ruleProbabilityDensityFunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityDensityFunctionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleProbabilityDensityFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityDensityFunctionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProbabilityDensityFunction"


    // $ANTLR start "ruleProbabilityDensityFunction"
    // InternalStoex.g:788:1: ruleProbabilityDensityFunction : ( ruleBoxedPDF ) ;
    public final void ruleProbabilityDensityFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:792:2: ( ( ruleBoxedPDF ) )
            // InternalStoex.g:793:2: ( ruleBoxedPDF )
            {
            // InternalStoex.g:793:2: ( ruleBoxedPDF )
            // InternalStoex.g:794:3: ruleBoxedPDF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityDensityFunctionAccess().getBoxedPDFParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBoxedPDF();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityDensityFunctionAccess().getBoxedPDFParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProbabilityDensityFunction"


    // $ANTLR start "entryRuleBoxedPDF"
    // InternalStoex.g:804:1: entryRuleBoxedPDF : ruleBoxedPDF EOF ;
    public final void entryRuleBoxedPDF() throws RecognitionException {
        try {
            // InternalStoex.g:805:1: ( ruleBoxedPDF EOF )
            // InternalStoex.g:806:1: ruleBoxedPDF EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoxedPDFRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBoxedPDF();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoxedPDFRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoxedPDF"


    // $ANTLR start "ruleBoxedPDF"
    // InternalStoex.g:813:1: ruleBoxedPDF : ( ( rule__BoxedPDF__Group__0 ) ) ;
    public final void ruleBoxedPDF() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:817:2: ( ( ( rule__BoxedPDF__Group__0 ) ) )
            // InternalStoex.g:818:2: ( ( rule__BoxedPDF__Group__0 ) )
            {
            // InternalStoex.g:818:2: ( ( rule__BoxedPDF__Group__0 ) )
            // InternalStoex.g:819:3: ( rule__BoxedPDF__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoxedPDFAccess().getGroup()); 
            }
            // InternalStoex.g:820:3: ( rule__BoxedPDF__Group__0 )
            // InternalStoex.g:820:4: rule__BoxedPDF__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoxedPDF__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoxedPDFAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoxedPDF"


    // $ANTLR start "entryRuleProbabilityMassFunction"
    // InternalStoex.g:829:1: entryRuleProbabilityMassFunction : ruleProbabilityMassFunction EOF ;
    public final void entryRuleProbabilityMassFunction() throws RecognitionException {
        try {
            // InternalStoex.g:830:1: ( ruleProbabilityMassFunction EOF )
            // InternalStoex.g:831:1: ruleProbabilityMassFunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleProbabilityMassFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProbabilityMassFunction"


    // $ANTLR start "ruleProbabilityMassFunction"
    // InternalStoex.g:838:1: ruleProbabilityMassFunction : ( ( rule__ProbabilityMassFunction__Alternatives ) ) ;
    public final void ruleProbabilityMassFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:842:2: ( ( ( rule__ProbabilityMassFunction__Alternatives ) ) )
            // InternalStoex.g:843:2: ( ( rule__ProbabilityMassFunction__Alternatives ) )
            {
            // InternalStoex.g:843:2: ( ( rule__ProbabilityMassFunction__Alternatives ) )
            // InternalStoex.g:844:3: ( rule__ProbabilityMassFunction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getAlternatives()); 
            }
            // InternalStoex.g:845:3: ( rule__ProbabilityMassFunction__Alternatives )
            // InternalStoex.g:845:4: rule__ProbabilityMassFunction__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProbabilityMassFunction"


    // $ANTLR start "entryRulenumeric_int_sample"
    // InternalStoex.g:854:1: entryRulenumeric_int_sample : rulenumeric_int_sample EOF ;
    public final void entryRulenumeric_int_sample() throws RecognitionException {
        try {
            // InternalStoex.g:855:1: ( rulenumeric_int_sample EOF )
            // InternalStoex.g:856:1: rulenumeric_int_sample EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_int_sampleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulenumeric_int_sample();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_int_sampleRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulenumeric_int_sample"


    // $ANTLR start "rulenumeric_int_sample"
    // InternalStoex.g:863:1: rulenumeric_int_sample : ( ( rule__Numeric_int_sample__Group__0 ) ) ;
    public final void rulenumeric_int_sample() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:867:2: ( ( ( rule__Numeric_int_sample__Group__0 ) ) )
            // InternalStoex.g:868:2: ( ( rule__Numeric_int_sample__Group__0 ) )
            {
            // InternalStoex.g:868:2: ( ( rule__Numeric_int_sample__Group__0 ) )
            // InternalStoex.g:869:3: ( rule__Numeric_int_sample__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_int_sampleAccess().getGroup()); 
            }
            // InternalStoex.g:870:3: ( rule__Numeric_int_sample__Group__0 )
            // InternalStoex.g:870:4: rule__Numeric_int_sample__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Numeric_int_sample__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_int_sampleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulenumeric_int_sample"


    // $ANTLR start "entryRulenumeric_real_sample"
    // InternalStoex.g:879:1: entryRulenumeric_real_sample : rulenumeric_real_sample EOF ;
    public final void entryRulenumeric_real_sample() throws RecognitionException {
        try {
            // InternalStoex.g:880:1: ( rulenumeric_real_sample EOF )
            // InternalStoex.g:881:1: rulenumeric_real_sample EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_real_sampleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulenumeric_real_sample();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_real_sampleRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulenumeric_real_sample"


    // $ANTLR start "rulenumeric_real_sample"
    // InternalStoex.g:888:1: rulenumeric_real_sample : ( ( rule__Numeric_real_sample__Group__0 ) ) ;
    public final void rulenumeric_real_sample() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:892:2: ( ( ( rule__Numeric_real_sample__Group__0 ) ) )
            // InternalStoex.g:893:2: ( ( rule__Numeric_real_sample__Group__0 ) )
            {
            // InternalStoex.g:893:2: ( ( rule__Numeric_real_sample__Group__0 ) )
            // InternalStoex.g:894:3: ( rule__Numeric_real_sample__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_real_sampleAccess().getGroup()); 
            }
            // InternalStoex.g:895:3: ( rule__Numeric_real_sample__Group__0 )
            // InternalStoex.g:895:4: rule__Numeric_real_sample__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Numeric_real_sample__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_real_sampleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulenumeric_real_sample"


    // $ANTLR start "entryRulereal_pdf_sample"
    // InternalStoex.g:904:1: entryRulereal_pdf_sample : rulereal_pdf_sample EOF ;
    public final void entryRulereal_pdf_sample() throws RecognitionException {
        try {
            // InternalStoex.g:905:1: ( rulereal_pdf_sample EOF )
            // InternalStoex.g:906:1: rulereal_pdf_sample EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReal_pdf_sampleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulereal_pdf_sample();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReal_pdf_sampleRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulereal_pdf_sample"


    // $ANTLR start "rulereal_pdf_sample"
    // InternalStoex.g:913:1: rulereal_pdf_sample : ( ( rule__Real_pdf_sample__Group__0 ) ) ;
    public final void rulereal_pdf_sample() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:917:2: ( ( ( rule__Real_pdf_sample__Group__0 ) ) )
            // InternalStoex.g:918:2: ( ( rule__Real_pdf_sample__Group__0 ) )
            {
            // InternalStoex.g:918:2: ( ( rule__Real_pdf_sample__Group__0 ) )
            // InternalStoex.g:919:3: ( rule__Real_pdf_sample__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReal_pdf_sampleAccess().getGroup()); 
            }
            // InternalStoex.g:920:3: ( rule__Real_pdf_sample__Group__0 )
            // InternalStoex.g:920:4: rule__Real_pdf_sample__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Real_pdf_sample__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReal_pdf_sampleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulereal_pdf_sample"


    // $ANTLR start "entryRulestringsample"
    // InternalStoex.g:929:1: entryRulestringsample : rulestringsample EOF ;
    public final void entryRulestringsample() throws RecognitionException {
        try {
            // InternalStoex.g:930:1: ( rulestringsample EOF )
            // InternalStoex.g:931:1: rulestringsample EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringsampleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulestringsample();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringsampleRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestringsample"


    // $ANTLR start "rulestringsample"
    // InternalStoex.g:938:1: rulestringsample : ( ( rule__Stringsample__Group__0 ) ) ;
    public final void rulestringsample() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:942:2: ( ( ( rule__Stringsample__Group__0 ) ) )
            // InternalStoex.g:943:2: ( ( rule__Stringsample__Group__0 ) )
            {
            // InternalStoex.g:943:2: ( ( rule__Stringsample__Group__0 ) )
            // InternalStoex.g:944:3: ( rule__Stringsample__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringsampleAccess().getGroup()); 
            }
            // InternalStoex.g:945:3: ( rule__Stringsample__Group__0 )
            // InternalStoex.g:945:4: rule__Stringsample__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Stringsample__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringsampleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestringsample"


    // $ANTLR start "entryRuleboolsample"
    // InternalStoex.g:954:1: entryRuleboolsample : ruleboolsample EOF ;
    public final void entryRuleboolsample() throws RecognitionException {
        try {
            // InternalStoex.g:955:1: ( ruleboolsample EOF )
            // InternalStoex.g:956:1: ruleboolsample EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolsampleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleboolsample();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolsampleRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleboolsample"


    // $ANTLR start "ruleboolsample"
    // InternalStoex.g:963:1: ruleboolsample : ( ( rule__Boolsample__Group__0 ) ) ;
    public final void ruleboolsample() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:967:2: ( ( ( rule__Boolsample__Group__0 ) ) )
            // InternalStoex.g:968:2: ( ( rule__Boolsample__Group__0 ) )
            {
            // InternalStoex.g:968:2: ( ( rule__Boolsample__Group__0 ) )
            // InternalStoex.g:969:3: ( rule__Boolsample__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolsampleAccess().getGroup()); 
            }
            // InternalStoex.g:970:3: ( rule__Boolsample__Group__0 )
            // InternalStoex.g:970:4: rule__Boolsample__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Boolsample__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolsampleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleboolsample"


    // $ANTLR start "entryRuleSIGNED_NUMBER"
    // InternalStoex.g:979:1: entryRuleSIGNED_NUMBER : ruleSIGNED_NUMBER EOF ;
    public final void entryRuleSIGNED_NUMBER() throws RecognitionException {
        try {
            // InternalStoex.g:980:1: ( ruleSIGNED_NUMBER EOF )
            // InternalStoex.g:981:1: ruleSIGNED_NUMBER EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSIGNED_NUMBERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSIGNED_NUMBER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSIGNED_NUMBERRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSIGNED_NUMBER"


    // $ANTLR start "ruleSIGNED_NUMBER"
    // InternalStoex.g:988:1: ruleSIGNED_NUMBER : ( ( rule__SIGNED_NUMBER__Group__0 ) ) ;
    public final void ruleSIGNED_NUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:992:2: ( ( ( rule__SIGNED_NUMBER__Group__0 ) ) )
            // InternalStoex.g:993:2: ( ( rule__SIGNED_NUMBER__Group__0 ) )
            {
            // InternalStoex.g:993:2: ( ( rule__SIGNED_NUMBER__Group__0 ) )
            // InternalStoex.g:994:3: ( rule__SIGNED_NUMBER__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSIGNED_NUMBERAccess().getGroup()); 
            }
            // InternalStoex.g:995:3: ( rule__SIGNED_NUMBER__Group__0 )
            // InternalStoex.g:995:4: rule__SIGNED_NUMBER__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SIGNED_NUMBER__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSIGNED_NUMBERAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSIGNED_NUMBER"


    // $ANTLR start "entryRuleSIGNED_INT"
    // InternalStoex.g:1004:1: entryRuleSIGNED_INT : ruleSIGNED_INT EOF ;
    public final void entryRuleSIGNED_INT() throws RecognitionException {
        try {
            // InternalStoex.g:1005:1: ( ruleSIGNED_INT EOF )
            // InternalStoex.g:1006:1: ruleSIGNED_INT EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSIGNED_INTRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSIGNED_INT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSIGNED_INTRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSIGNED_INT"


    // $ANTLR start "ruleSIGNED_INT"
    // InternalStoex.g:1013:1: ruleSIGNED_INT : ( ( rule__SIGNED_INT__Group__0 ) ) ;
    public final void ruleSIGNED_INT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1017:2: ( ( ( rule__SIGNED_INT__Group__0 ) ) )
            // InternalStoex.g:1018:2: ( ( rule__SIGNED_INT__Group__0 ) )
            {
            // InternalStoex.g:1018:2: ( ( rule__SIGNED_INT__Group__0 ) )
            // InternalStoex.g:1019:3: ( rule__SIGNED_INT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSIGNED_INTAccess().getGroup()); 
            }
            // InternalStoex.g:1020:3: ( rule__SIGNED_INT__Group__0 )
            // InternalStoex.g:1020:4: rule__SIGNED_INT__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SIGNED_INT__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSIGNED_INTAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSIGNED_INT"


    // $ANTLR start "ruleBooleanOperations"
    // InternalStoex.g:1029:1: ruleBooleanOperations : ( ( rule__BooleanOperations__Alternatives ) ) ;
    public final void ruleBooleanOperations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1033:1: ( ( ( rule__BooleanOperations__Alternatives ) ) )
            // InternalStoex.g:1034:2: ( ( rule__BooleanOperations__Alternatives ) )
            {
            // InternalStoex.g:1034:2: ( ( rule__BooleanOperations__Alternatives ) )
            // InternalStoex.g:1035:3: ( rule__BooleanOperations__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationsAccess().getAlternatives()); 
            }
            // InternalStoex.g:1036:3: ( rule__BooleanOperations__Alternatives )
            // InternalStoex.g:1036:4: rule__BooleanOperations__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanOperations__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationsAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanOperations"


    // $ANTLR start "ruleandoperation"
    // InternalStoex.g:1045:1: ruleandoperation : ( ( 'AND' ) ) ;
    public final void ruleandoperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1049:1: ( ( ( 'AND' ) ) )
            // InternalStoex.g:1050:2: ( ( 'AND' ) )
            {
            // InternalStoex.g:1050:2: ( ( 'AND' ) )
            // InternalStoex.g:1051:3: ( 'AND' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndoperationAccess().getANDEnumLiteralDeclaration()); 
            }
            // InternalStoex.g:1052:3: ( 'AND' )
            // InternalStoex.g:1052:4: 'AND'
            {
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndoperationAccess().getANDEnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleandoperation"


    // $ANTLR start "ruleoroperations"
    // InternalStoex.g:1061:1: ruleoroperations : ( ( rule__Oroperations__Alternatives ) ) ;
    public final void ruleoroperations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1065:1: ( ( ( rule__Oroperations__Alternatives ) ) )
            // InternalStoex.g:1066:2: ( ( rule__Oroperations__Alternatives ) )
            {
            // InternalStoex.g:1066:2: ( ( rule__Oroperations__Alternatives ) )
            // InternalStoex.g:1067:3: ( rule__Oroperations__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOroperationsAccess().getAlternatives()); 
            }
            // InternalStoex.g:1068:3: ( rule__Oroperations__Alternatives )
            // InternalStoex.g:1068:4: rule__Oroperations__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Oroperations__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOroperationsAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleoroperations"


    // $ANTLR start "ruleCompareOperations"
    // InternalStoex.g:1077:1: ruleCompareOperations : ( ( rule__CompareOperations__Alternatives ) ) ;
    public final void ruleCompareOperations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1081:1: ( ( ( rule__CompareOperations__Alternatives ) ) )
            // InternalStoex.g:1082:2: ( ( rule__CompareOperations__Alternatives ) )
            {
            // InternalStoex.g:1082:2: ( ( rule__CompareOperations__Alternatives ) )
            // InternalStoex.g:1083:3: ( rule__CompareOperations__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationsAccess().getAlternatives()); 
            }
            // InternalStoex.g:1084:3: ( rule__CompareOperations__Alternatives )
            // InternalStoex.g:1084:4: rule__CompareOperations__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareOperations__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationsAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompareOperations"


    // $ANTLR start "ruleTermOperations"
    // InternalStoex.g:1093:1: ruleTermOperations : ( ( rule__TermOperations__Alternatives ) ) ;
    public final void ruleTermOperations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1097:1: ( ( ( rule__TermOperations__Alternatives ) ) )
            // InternalStoex.g:1098:2: ( ( rule__TermOperations__Alternatives ) )
            {
            // InternalStoex.g:1098:2: ( ( rule__TermOperations__Alternatives ) )
            // InternalStoex.g:1099:3: ( rule__TermOperations__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermOperationsAccess().getAlternatives()); 
            }
            // InternalStoex.g:1100:3: ( rule__TermOperations__Alternatives )
            // InternalStoex.g:1100:4: rule__TermOperations__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TermOperations__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermOperationsAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTermOperations"


    // $ANTLR start "ruleProductOperations"
    // InternalStoex.g:1109:1: ruleProductOperations : ( ( rule__ProductOperations__Alternatives ) ) ;
    public final void ruleProductOperations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1113:1: ( ( ( rule__ProductOperations__Alternatives ) ) )
            // InternalStoex.g:1114:2: ( ( rule__ProductOperations__Alternatives ) )
            {
            // InternalStoex.g:1114:2: ( ( rule__ProductOperations__Alternatives ) )
            // InternalStoex.g:1115:3: ( rule__ProductOperations__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductOperationsAccess().getAlternatives()); 
            }
            // InternalStoex.g:1116:3: ( rule__ProductOperations__Alternatives )
            // InternalStoex.g:1116:4: rule__ProductOperations__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProductOperations__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductOperationsAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProductOperations"


    // $ANTLR start "ruleUnitNames"
    // InternalStoex.g:1125:1: ruleUnitNames : ( ( rule__UnitNames__Alternatives ) ) ;
    public final void ruleUnitNames() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1129:1: ( ( ( rule__UnitNames__Alternatives ) ) )
            // InternalStoex.g:1130:2: ( ( rule__UnitNames__Alternatives ) )
            {
            // InternalStoex.g:1130:2: ( ( rule__UnitNames__Alternatives ) )
            // InternalStoex.g:1131:3: ( rule__UnitNames__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitNamesAccess().getAlternatives()); 
            }
            // InternalStoex.g:1132:3: ( rule__UnitNames__Alternatives )
            // InternalStoex.g:1132:4: rule__UnitNames__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitNames__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitNamesAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnitNames"


    // $ANTLR start "rule__UnaryExpr__Alternatives"
    // InternalStoex.g:1140:1: rule__UnaryExpr__Alternatives : ( ( ruleNegativeExpression ) | ( ruleNotExpression ) | ( ruleatom ) );
    public final void rule__UnaryExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1144:1: ( ( ruleNegativeExpression ) | ( ruleNotExpression ) | ( ruleatom ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt1=1;
                }
                break;
            case RULE_NOT:
                {
                alt1=2;
                }
                break;
            case RULE_LPAREN:
            case RULE_DOUBLEPDF:
            case RULE_INTPMF:
            case RULE_DOUBLEPMF:
            case RULE_ENUMPMF:
            case RULE_BOOLPMF:
            case RULE_DOUBLE:
            case RULE_DECINT:
            case RULE_ID:
            case RULE_BOOLEAN_KEYWORDS:
            case RULE_STRING:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalStoex.g:1145:2: ( ruleNegativeExpression )
                    {
                    // InternalStoex.g:1145:2: ( ruleNegativeExpression )
                    // InternalStoex.g:1146:3: ruleNegativeExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExprAccess().getNegativeExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNegativeExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExprAccess().getNegativeExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1151:2: ( ruleNotExpression )
                    {
                    // InternalStoex.g:1151:2: ( ruleNotExpression )
                    // InternalStoex.g:1152:3: ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExprAccess().getNotExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExprAccess().getNotExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalStoex.g:1157:2: ( ruleatom )
                    {
                    // InternalStoex.g:1157:2: ( ruleatom )
                    // InternalStoex.g:1158:3: ruleatom
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExprAccess().getAtomParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleatom();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExprAccess().getAtomParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Alternatives"


    // $ANTLR start "rule__Atom__Alternatives"
    // InternalStoex.g:1167:1: rule__Atom__Alternatives : ( ( ruleIntLiteral ) | ( ruleDoubleLiteral ) | ( ruleStringLiteral ) | ( ruleBoolLiteral ) | ( ruleFunctionLiteral ) | ( ruleVariable ) | ( ruleParenthesis ) | ( ruleProbabilityFunctionLiteral ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1171:1: ( ( ruleIntLiteral ) | ( ruleDoubleLiteral ) | ( ruleStringLiteral ) | ( ruleBoolLiteral ) | ( ruleFunctionLiteral ) | ( ruleVariable ) | ( ruleParenthesis ) | ( ruleProbabilityFunctionLiteral ) )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalStoex.g:1172:2: ( ruleIntLiteral )
                    {
                    // InternalStoex.g:1172:2: ( ruleIntLiteral )
                    // InternalStoex.g:1173:3: ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getIntLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getIntLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1178:2: ( ruleDoubleLiteral )
                    {
                    // InternalStoex.g:1178:2: ( ruleDoubleLiteral )
                    // InternalStoex.g:1179:3: ruleDoubleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getDoubleLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDoubleLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getDoubleLiteralParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalStoex.g:1184:2: ( ruleStringLiteral )
                    {
                    // InternalStoex.g:1184:2: ( ruleStringLiteral )
                    // InternalStoex.g:1185:3: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getStringLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getStringLiteralParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalStoex.g:1190:2: ( ruleBoolLiteral )
                    {
                    // InternalStoex.g:1190:2: ( ruleBoolLiteral )
                    // InternalStoex.g:1191:3: ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getBoolLiteralParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBoolLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getBoolLiteralParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalStoex.g:1196:2: ( ruleFunctionLiteral )
                    {
                    // InternalStoex.g:1196:2: ( ruleFunctionLiteral )
                    // InternalStoex.g:1197:3: ruleFunctionLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getFunctionLiteralParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleFunctionLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getFunctionLiteralParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalStoex.g:1202:2: ( ruleVariable )
                    {
                    // InternalStoex.g:1202:2: ( ruleVariable )
                    // InternalStoex.g:1203:3: ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getVariableParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getVariableParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalStoex.g:1208:2: ( ruleParenthesis )
                    {
                    // InternalStoex.g:1208:2: ( ruleParenthesis )
                    // InternalStoex.g:1209:3: ruleParenthesis
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getParenthesisParserRuleCall_6()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParenthesis();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getParenthesisParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalStoex.g:1214:2: ( ruleProbabilityFunctionLiteral )
                    {
                    // InternalStoex.g:1214:2: ( ruleProbabilityFunctionLiteral )
                    // InternalStoex.g:1215:3: ruleProbabilityFunctionLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getProbabilityFunctionLiteralParserRuleCall_7()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleProbabilityFunctionLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getProbabilityFunctionLiteralParserRuleCall_7()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Alternatives"


    // $ANTLR start "rule__AbstractNamedReference__Alternatives"
    // InternalStoex.g:1224:1: rule__AbstractNamedReference__Alternatives : ( ( ruleVariableReference ) | ( ruleNamespaceReference ) );
    public final void rule__AbstractNamedReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1228:1: ( ( ruleVariableReference ) | ( ruleNamespaceReference ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||(LA3_1>=RULE_CONDDELIMITER && LA3_1<=RULE_POW)||(LA3_1>=RULE_RPAREN && LA3_1<=RULE_COLON)||(LA3_1>=31 && LA3_1<=44)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==RULE_DOT) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalStoex.g:1229:2: ( ruleVariableReference )
                    {
                    // InternalStoex.g:1229:2: ( ruleVariableReference )
                    // InternalStoex.g:1230:3: ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractNamedReferenceAccess().getVariableReferenceParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleVariableReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractNamedReferenceAccess().getVariableReferenceParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1235:2: ( ruleNamespaceReference )
                    {
                    // InternalStoex.g:1235:2: ( ruleNamespaceReference )
                    // InternalStoex.g:1236:3: ruleNamespaceReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractNamedReferenceAccess().getNamespaceReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNamespaceReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractNamedReferenceAccess().getNamespaceReferenceParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractNamedReference__Alternatives"


    // $ANTLR start "rule__Unit__Alternatives"
    // InternalStoex.g:1245:1: rule__Unit__Alternatives : ( ( ruleunitMulti ) | ( ruleunitDiv ) | ( ruleBaseUnit ) );
    public final void rule__Unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1249:1: ( ( ruleunitMulti ) | ( ruleunitDiv ) | ( ruleBaseUnit ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalStoex.g:1250:2: ( ruleunitMulti )
                    {
                    // InternalStoex.g:1250:2: ( ruleunitMulti )
                    // InternalStoex.g:1251:3: ruleunitMulti
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnitAccess().getUnitMultiParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleunitMulti();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnitAccess().getUnitMultiParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1256:2: ( ruleunitDiv )
                    {
                    // InternalStoex.g:1256:2: ( ruleunitDiv )
                    // InternalStoex.g:1257:3: ruleunitDiv
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnitAccess().getUnitDivParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleunitDiv();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnitAccess().getUnitDivParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalStoex.g:1262:2: ( ruleBaseUnit )
                    {
                    // InternalStoex.g:1262:2: ( ruleBaseUnit )
                    // InternalStoex.g:1263:3: ruleBaseUnit
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnitAccess().getBaseUnitParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBaseUnit();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnitAccess().getBaseUnitParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Alternatives"


    // $ANTLR start "rule__UnitPow__Alternatives_0"
    // InternalStoex.g:1272:1: rule__UnitPow__Alternatives_0 : ( ( ruleBaseUnit ) | ( ( rule__UnitPow__Group_0_1__0 ) ) );
    public final void rule__UnitPow__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1276:1: ( ( ruleBaseUnit ) | ( ( rule__UnitPow__Group_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=45 && LA5_0<=49)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_LPAREN) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalStoex.g:1277:2: ( ruleBaseUnit )
                    {
                    // InternalStoex.g:1277:2: ( ruleBaseUnit )
                    // InternalStoex.g:1278:3: ruleBaseUnit
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnitPowAccess().getBaseUnitParserRuleCall_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBaseUnit();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnitPowAccess().getBaseUnitParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1283:2: ( ( rule__UnitPow__Group_0_1__0 ) )
                    {
                    // InternalStoex.g:1283:2: ( ( rule__UnitPow__Group_0_1__0 ) )
                    // InternalStoex.g:1284:3: ( rule__UnitPow__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnitPowAccess().getGroup_0_1()); 
                    }
                    // InternalStoex.g:1285:3: ( rule__UnitPow__Group_0_1__0 )
                    // InternalStoex.g:1285:4: rule__UnitPow__Group_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__UnitPow__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnitPowAccess().getGroup_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitPow__Alternatives_0"


    // $ANTLR start "rule__UnitPow__Alternatives_0_1_1"
    // InternalStoex.g:1293:1: rule__UnitPow__Alternatives_0_1_1 : ( ( ruleunitMulti ) | ( ruleunitDiv ) );
    public final void rule__UnitPow__Alternatives_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1297:1: ( ( ruleunitMulti ) | ( ruleunitDiv ) )
            int alt6=2;
            switch ( input.LA(1) ) {
            case 45:
                {
                int LA6_1 = input.LA(2);

                if ( (synpred14_InternalStoex()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                int LA6_2 = input.LA(2);

                if ( (synpred14_InternalStoex()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA6_3 = input.LA(2);

                if ( (synpred14_InternalStoex()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                int LA6_4 = input.LA(2);

                if ( (synpred14_InternalStoex()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            case 49:
                {
                int LA6_5 = input.LA(2);

                if ( (synpred14_InternalStoex()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_LPAREN:
                {
                int LA6_6 = input.LA(2);

                if ( (synpred14_InternalStoex()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalStoex.g:1298:2: ( ruleunitMulti )
                    {
                    // InternalStoex.g:1298:2: ( ruleunitMulti )
                    // InternalStoex.g:1299:3: ruleunitMulti
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnitPowAccess().getUnitMultiParserRuleCall_0_1_1_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleunitMulti();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnitPowAccess().getUnitMultiParserRuleCall_0_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1304:2: ( ruleunitDiv )
                    {
                    // InternalStoex.g:1304:2: ( ruleunitDiv )
                    // InternalStoex.g:1305:3: ruleunitDiv
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnitPowAccess().getUnitDivParserRuleCall_0_1_1_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleunitDiv();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnitPowAccess().getUnitDivParserRuleCall_0_1_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitPow__Alternatives_0_1_1"


    // $ANTLR start "rule__Definition__Alternatives"
    // InternalStoex.g:1314:1: rule__Definition__Alternatives : ( ( ruleProbabilityMassFunction ) | ( ruleProbabilityDensityFunction ) );
    public final void rule__Definition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1318:1: ( ( ruleProbabilityMassFunction ) | ( ruleProbabilityDensityFunction ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_INTPMF && LA7_0<=RULE_BOOLPMF)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_DOUBLEPDF) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalStoex.g:1319:2: ( ruleProbabilityMassFunction )
                    {
                    // InternalStoex.g:1319:2: ( ruleProbabilityMassFunction )
                    // InternalStoex.g:1320:3: ruleProbabilityMassFunction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDefinitionAccess().getProbabilityMassFunctionParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleProbabilityMassFunction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDefinitionAccess().getProbabilityMassFunctionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1325:2: ( ruleProbabilityDensityFunction )
                    {
                    // InternalStoex.g:1325:2: ( ruleProbabilityDensityFunction )
                    // InternalStoex.g:1326:3: ruleProbabilityDensityFunction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDefinitionAccess().getProbabilityDensityFunctionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleProbabilityDensityFunction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDefinitionAccess().getProbabilityDensityFunctionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Alternatives"


    // $ANTLR start "rule__ProbabilityMassFunction__Alternatives"
    // InternalStoex.g:1335:1: rule__ProbabilityMassFunction__Alternatives : ( ( ( rule__ProbabilityMassFunction__Group_0__0 ) ) | ( ( rule__ProbabilityMassFunction__Group_1__0 ) ) | ( ( rule__ProbabilityMassFunction__Group_2__0 ) ) | ( ( rule__ProbabilityMassFunction__Group_3__0 ) ) );
    public final void rule__ProbabilityMassFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1339:1: ( ( ( rule__ProbabilityMassFunction__Group_0__0 ) ) | ( ( rule__ProbabilityMassFunction__Group_1__0 ) ) | ( ( rule__ProbabilityMassFunction__Group_2__0 ) ) | ( ( rule__ProbabilityMassFunction__Group_3__0 ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_INTPMF:
                {
                alt8=1;
                }
                break;
            case RULE_DOUBLEPMF:
                {
                alt8=2;
                }
                break;
            case RULE_ENUMPMF:
                {
                alt8=3;
                }
                break;
            case RULE_BOOLPMF:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalStoex.g:1340:2: ( ( rule__ProbabilityMassFunction__Group_0__0 ) )
                    {
                    // InternalStoex.g:1340:2: ( ( rule__ProbabilityMassFunction__Group_0__0 ) )
                    // InternalStoex.g:1341:3: ( rule__ProbabilityMassFunction__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProbabilityMassFunctionAccess().getGroup_0()); 
                    }
                    // InternalStoex.g:1342:3: ( rule__ProbabilityMassFunction__Group_0__0 )
                    // InternalStoex.g:1342:4: rule__ProbabilityMassFunction__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ProbabilityMassFunction__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProbabilityMassFunctionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1346:2: ( ( rule__ProbabilityMassFunction__Group_1__0 ) )
                    {
                    // InternalStoex.g:1346:2: ( ( rule__ProbabilityMassFunction__Group_1__0 ) )
                    // InternalStoex.g:1347:3: ( rule__ProbabilityMassFunction__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProbabilityMassFunctionAccess().getGroup_1()); 
                    }
                    // InternalStoex.g:1348:3: ( rule__ProbabilityMassFunction__Group_1__0 )
                    // InternalStoex.g:1348:4: rule__ProbabilityMassFunction__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ProbabilityMassFunction__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProbabilityMassFunctionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalStoex.g:1352:2: ( ( rule__ProbabilityMassFunction__Group_2__0 ) )
                    {
                    // InternalStoex.g:1352:2: ( ( rule__ProbabilityMassFunction__Group_2__0 ) )
                    // InternalStoex.g:1353:3: ( rule__ProbabilityMassFunction__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProbabilityMassFunctionAccess().getGroup_2()); 
                    }
                    // InternalStoex.g:1354:3: ( rule__ProbabilityMassFunction__Group_2__0 )
                    // InternalStoex.g:1354:4: rule__ProbabilityMassFunction__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ProbabilityMassFunction__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProbabilityMassFunctionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalStoex.g:1358:2: ( ( rule__ProbabilityMassFunction__Group_3__0 ) )
                    {
                    // InternalStoex.g:1358:2: ( ( rule__ProbabilityMassFunction__Group_3__0 ) )
                    // InternalStoex.g:1359:3: ( rule__ProbabilityMassFunction__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProbabilityMassFunctionAccess().getGroup_3()); 
                    }
                    // InternalStoex.g:1360:3: ( rule__ProbabilityMassFunction__Group_3__0 )
                    // InternalStoex.g:1360:4: rule__ProbabilityMassFunction__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ProbabilityMassFunction__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProbabilityMassFunctionAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Alternatives"


    // $ANTLR start "rule__BooleanOperations__Alternatives"
    // InternalStoex.g:1368:1: rule__BooleanOperations__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'XOR' ) ) );
    public final void rule__BooleanOperations__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1372:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'XOR' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt9=1;
                }
                break;
            case 32:
                {
                alt9=2;
                }
                break;
            case 33:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalStoex.g:1373:2: ( ( 'AND' ) )
                    {
                    // InternalStoex.g:1373:2: ( ( 'AND' ) )
                    // InternalStoex.g:1374:3: ( 'AND' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperationsAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalStoex.g:1375:3: ( 'AND' )
                    // InternalStoex.g:1375:4: 'AND'
                    {
                    match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperationsAccess().getANDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1379:2: ( ( 'OR' ) )
                    {
                    // InternalStoex.g:1379:2: ( ( 'OR' ) )
                    // InternalStoex.g:1380:3: ( 'OR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperationsAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // InternalStoex.g:1381:3: ( 'OR' )
                    // InternalStoex.g:1381:4: 'OR'
                    {
                    match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperationsAccess().getOREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalStoex.g:1385:2: ( ( 'XOR' ) )
                    {
                    // InternalStoex.g:1385:2: ( ( 'XOR' ) )
                    // InternalStoex.g:1386:3: ( 'XOR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperationsAccess().getXOREnumLiteralDeclaration_2()); 
                    }
                    // InternalStoex.g:1387:3: ( 'XOR' )
                    // InternalStoex.g:1387:4: 'XOR'
                    {
                    match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperationsAccess().getXOREnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperations__Alternatives"


    // $ANTLR start "rule__Oroperations__Alternatives"
    // InternalStoex.g:1395:1: rule__Oroperations__Alternatives : ( ( ( 'OR' ) ) | ( ( 'XOR' ) ) );
    public final void rule__Oroperations__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1399:1: ( ( ( 'OR' ) ) | ( ( 'XOR' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            else if ( (LA10_0==33) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalStoex.g:1400:2: ( ( 'OR' ) )
                    {
                    // InternalStoex.g:1400:2: ( ( 'OR' ) )
                    // InternalStoex.g:1401:3: ( 'OR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOroperationsAccess().getOREnumLiteralDeclaration_0()); 
                    }
                    // InternalStoex.g:1402:3: ( 'OR' )
                    // InternalStoex.g:1402:4: 'OR'
                    {
                    match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOroperationsAccess().getOREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1406:2: ( ( 'XOR' ) )
                    {
                    // InternalStoex.g:1406:2: ( ( 'XOR' ) )
                    // InternalStoex.g:1407:3: ( 'XOR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOroperationsAccess().getXOREnumLiteralDeclaration_1()); 
                    }
                    // InternalStoex.g:1408:3: ( 'XOR' )
                    // InternalStoex.g:1408:4: 'XOR'
                    {
                    match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOroperationsAccess().getXOREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oroperations__Alternatives"


    // $ANTLR start "rule__CompareOperations__Alternatives"
    // InternalStoex.g:1416:1: rule__CompareOperations__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '==' ) ) | ( ( '<>' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__CompareOperations__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1420:1: ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '==' ) ) | ( ( '<>' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt11=1;
                }
                break;
            case 35:
                {
                alt11=2;
                }
                break;
            case 36:
                {
                alt11=3;
                }
                break;
            case 37:
                {
                alt11=4;
                }
                break;
            case 38:
                {
                alt11=5;
                }
                break;
            case 39:
                {
                alt11=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalStoex.g:1421:2: ( ( '>' ) )
                    {
                    // InternalStoex.g:1421:2: ( ( '>' ) )
                    // InternalStoex.g:1422:3: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationsAccess().getGREATEREnumLiteralDeclaration_0()); 
                    }
                    // InternalStoex.g:1423:3: ( '>' )
                    // InternalStoex.g:1423:4: '>'
                    {
                    match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperationsAccess().getGREATEREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1427:2: ( ( '<' ) )
                    {
                    // InternalStoex.g:1427:2: ( ( '<' ) )
                    // InternalStoex.g:1428:3: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationsAccess().getLESSEnumLiteralDeclaration_1()); 
                    }
                    // InternalStoex.g:1429:3: ( '<' )
                    // InternalStoex.g:1429:4: '<'
                    {
                    match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperationsAccess().getLESSEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalStoex.g:1433:2: ( ( '==' ) )
                    {
                    // InternalStoex.g:1433:2: ( ( '==' ) )
                    // InternalStoex.g:1434:3: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationsAccess().getEQUALSEnumLiteralDeclaration_2()); 
                    }
                    // InternalStoex.g:1435:3: ( '==' )
                    // InternalStoex.g:1435:4: '=='
                    {
                    match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperationsAccess().getEQUALSEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalStoex.g:1439:2: ( ( '<>' ) )
                    {
                    // InternalStoex.g:1439:2: ( ( '<>' ) )
                    // InternalStoex.g:1440:3: ( '<>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationsAccess().getNOTEQUALEnumLiteralDeclaration_3()); 
                    }
                    // InternalStoex.g:1441:3: ( '<>' )
                    // InternalStoex.g:1441:4: '<>'
                    {
                    match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperationsAccess().getNOTEQUALEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalStoex.g:1445:2: ( ( '>=' ) )
                    {
                    // InternalStoex.g:1445:2: ( ( '>=' ) )
                    // InternalStoex.g:1446:3: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationsAccess().getGREATEREQUALEnumLiteralDeclaration_4()); 
                    }
                    // InternalStoex.g:1447:3: ( '>=' )
                    // InternalStoex.g:1447:4: '>='
                    {
                    match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperationsAccess().getGREATEREQUALEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalStoex.g:1451:2: ( ( '<=' ) )
                    {
                    // InternalStoex.g:1451:2: ( ( '<=' ) )
                    // InternalStoex.g:1452:3: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationsAccess().getLESSEQUALEnumLiteralDeclaration_5()); 
                    }
                    // InternalStoex.g:1453:3: ( '<=' )
                    // InternalStoex.g:1453:4: '<='
                    {
                    match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperationsAccess().getLESSEQUALEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperations__Alternatives"


    // $ANTLR start "rule__TermOperations__Alternatives"
    // InternalStoex.g:1461:1: rule__TermOperations__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__TermOperations__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1465:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                alt12=1;
            }
            else if ( (LA12_0==41) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalStoex.g:1466:2: ( ( '+' ) )
                    {
                    // InternalStoex.g:1466:2: ( ( '+' ) )
                    // InternalStoex.g:1467:3: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermOperationsAccess().getADDEnumLiteralDeclaration_0()); 
                    }
                    // InternalStoex.g:1468:3: ( '+' )
                    // InternalStoex.g:1468:4: '+'
                    {
                    match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermOperationsAccess().getADDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1472:2: ( ( '-' ) )
                    {
                    // InternalStoex.g:1472:2: ( ( '-' ) )
                    // InternalStoex.g:1473:3: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermOperationsAccess().getSUBEnumLiteralDeclaration_1()); 
                    }
                    // InternalStoex.g:1474:3: ( '-' )
                    // InternalStoex.g:1474:4: '-'
                    {
                    match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermOperationsAccess().getSUBEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermOperations__Alternatives"


    // $ANTLR start "rule__ProductOperations__Alternatives"
    // InternalStoex.g:1482:1: rule__ProductOperations__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) );
    public final void rule__ProductOperations__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1486:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt13=1;
                }
                break;
            case 43:
                {
                alt13=2;
                }
                break;
            case 44:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalStoex.g:1487:2: ( ( '*' ) )
                    {
                    // InternalStoex.g:1487:2: ( ( '*' ) )
                    // InternalStoex.g:1488:3: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProductOperationsAccess().getMULTEnumLiteralDeclaration_0()); 
                    }
                    // InternalStoex.g:1489:3: ( '*' )
                    // InternalStoex.g:1489:4: '*'
                    {
                    match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProductOperationsAccess().getMULTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1493:2: ( ( '/' ) )
                    {
                    // InternalStoex.g:1493:2: ( ( '/' ) )
                    // InternalStoex.g:1494:3: ( '/' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProductOperationsAccess().getDIVEnumLiteralDeclaration_1()); 
                    }
                    // InternalStoex.g:1495:3: ( '/' )
                    // InternalStoex.g:1495:4: '/'
                    {
                    match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProductOperationsAccess().getDIVEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalStoex.g:1499:2: ( ( '%' ) )
                    {
                    // InternalStoex.g:1499:2: ( ( '%' ) )
                    // InternalStoex.g:1500:3: ( '%' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProductOperationsAccess().getMODEnumLiteralDeclaration_2()); 
                    }
                    // InternalStoex.g:1501:3: ( '%' )
                    // InternalStoex.g:1501:4: '%'
                    {
                    match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProductOperationsAccess().getMODEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductOperations__Alternatives"


    // $ANTLR start "rule__UnitNames__Alternatives"
    // InternalStoex.g:1509:1: rule__UnitNames__Alternatives : ( ( ( '_' ) ) | ( ( 'unitless' ) ) | ( ( 'B' ) ) | ( ( 's' ) ) | ( ( 'm' ) ) );
    public final void rule__UnitNames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1513:1: ( ( ( '_' ) ) | ( ( 'unitless' ) ) | ( ( 'B' ) ) | ( ( 's' ) ) | ( ( 'm' ) ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt14=1;
                }
                break;
            case 46:
                {
                alt14=2;
                }
                break;
            case 47:
                {
                alt14=3;
                }
                break;
            case 48:
                {
                alt14=4;
                }
                break;
            case 49:
                {
                alt14=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalStoex.g:1514:2: ( ( '_' ) )
                    {
                    // InternalStoex.g:1514:2: ( ( '_' ) )
                    // InternalStoex.g:1515:3: ( '_' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnitNamesAccess().getUNITLESSEnumLiteralDeclaration_0()); 
                    }
                    // InternalStoex.g:1516:3: ( '_' )
                    // InternalStoex.g:1516:4: '_'
                    {
                    match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnitNamesAccess().getUNITLESSEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1520:2: ( ( 'unitless' ) )
                    {
                    // InternalStoex.g:1520:2: ( ( 'unitless' ) )
                    // InternalStoex.g:1521:3: ( 'unitless' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnitNamesAccess().getUNITLESSEnumLiteralDeclaration_1()); 
                    }
                    // InternalStoex.g:1522:3: ( 'unitless' )
                    // InternalStoex.g:1522:4: 'unitless'
                    {
                    match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnitNamesAccess().getUNITLESSEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalStoex.g:1526:2: ( ( 'B' ) )
                    {
                    // InternalStoex.g:1526:2: ( ( 'B' ) )
                    // InternalStoex.g:1527:3: ( 'B' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnitNamesAccess().getBYTEEnumLiteralDeclaration_2()); 
                    }
                    // InternalStoex.g:1528:3: ( 'B' )
                    // InternalStoex.g:1528:4: 'B'
                    {
                    match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnitNamesAccess().getBYTEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalStoex.g:1532:2: ( ( 's' ) )
                    {
                    // InternalStoex.g:1532:2: ( ( 's' ) )
                    // InternalStoex.g:1533:3: ( 's' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnitNamesAccess().getSECONDEnumLiteralDeclaration_3()); 
                    }
                    // InternalStoex.g:1534:3: ( 's' )
                    // InternalStoex.g:1534:4: 's'
                    {
                    match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnitNamesAccess().getSECONDEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalStoex.g:1538:2: ( ( 'm' ) )
                    {
                    // InternalStoex.g:1538:2: ( ( 'm' ) )
                    // InternalStoex.g:1539:3: ( 'm' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnitNamesAccess().getMETEREnumLiteralDeclaration_4()); 
                    }
                    // InternalStoex.g:1540:3: ( 'm' )
                    // InternalStoex.g:1540:4: 'm'
                    {
                    match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnitNamesAccess().getMETEREnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitNames__Alternatives"


    // $ANTLR start "rule__IfelseExpr__Group__0"
    // InternalStoex.g:1548:1: rule__IfelseExpr__Group__0 : rule__IfelseExpr__Group__0__Impl rule__IfelseExpr__Group__1 ;
    public final void rule__IfelseExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1552:1: ( rule__IfelseExpr__Group__0__Impl rule__IfelseExpr__Group__1 )
            // InternalStoex.g:1553:2: rule__IfelseExpr__Group__0__Impl rule__IfelseExpr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__IfelseExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfelseExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfelseExpr__Group__0"


    // $ANTLR start "rule__IfelseExpr__Group__0__Impl"
    // InternalStoex.g:1560:1: rule__IfelseExpr__Group__0__Impl : ( ruleboolAndExpr ) ;
    public final void rule__IfelseExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1564:1: ( ( ruleboolAndExpr ) )
            // InternalStoex.g:1565:1: ( ruleboolAndExpr )
            {
            // InternalStoex.g:1565:1: ( ruleboolAndExpr )
            // InternalStoex.g:1566:2: ruleboolAndExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfelseExprAccess().getBoolAndExprParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleboolAndExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfelseExprAccess().getBoolAndExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfelseExpr__Group__0__Impl"


    // $ANTLR start "rule__IfelseExpr__Group__1"
    // InternalStoex.g:1575:1: rule__IfelseExpr__Group__1 : rule__IfelseExpr__Group__1__Impl ;
    public final void rule__IfelseExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1579:1: ( rule__IfelseExpr__Group__1__Impl )
            // InternalStoex.g:1580:2: rule__IfelseExpr__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfelseExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfelseExpr__Group__1"


    // $ANTLR start "rule__IfelseExpr__Group__1__Impl"
    // InternalStoex.g:1586:1: rule__IfelseExpr__Group__1__Impl : ( ( rule__IfelseExpr__Group_1__0 )? ) ;
    public final void rule__IfelseExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1590:1: ( ( ( rule__IfelseExpr__Group_1__0 )? ) )
            // InternalStoex.g:1591:1: ( ( rule__IfelseExpr__Group_1__0 )? )
            {
            // InternalStoex.g:1591:1: ( ( rule__IfelseExpr__Group_1__0 )? )
            // InternalStoex.g:1592:2: ( rule__IfelseExpr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfelseExprAccess().getGroup_1()); 
            }
            // InternalStoex.g:1593:2: ( rule__IfelseExpr__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_CONDDELIMITER) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalStoex.g:1593:3: rule__IfelseExpr__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__IfelseExpr__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfelseExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfelseExpr__Group__1__Impl"


    // $ANTLR start "rule__IfelseExpr__Group_1__0"
    // InternalStoex.g:1602:1: rule__IfelseExpr__Group_1__0 : rule__IfelseExpr__Group_1__0__Impl rule__IfelseExpr__Group_1__1 ;
    public final void rule__IfelseExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1606:1: ( rule__IfelseExpr__Group_1__0__Impl rule__IfelseExpr__Group_1__1 )
            // InternalStoex.g:1607:2: rule__IfelseExpr__Group_1__0__Impl rule__IfelseExpr__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__IfelseExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfelseExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfelseExpr__Group_1__0"


    // $ANTLR start "rule__IfelseExpr__Group_1__0__Impl"
    // InternalStoex.g:1614:1: rule__IfelseExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__IfelseExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1618:1: ( ( () ) )
            // InternalStoex.g:1619:1: ( () )
            {
            // InternalStoex.g:1619:1: ( () )
            // InternalStoex.g:1620:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfelseExprAccess().getIfElseExpressionConditionExpressionAction_1_0()); 
            }
            // InternalStoex.g:1621:2: ()
            // InternalStoex.g:1621:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfelseExprAccess().getIfElseExpressionConditionExpressionAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfelseExpr__Group_1__0__Impl"


    // $ANTLR start "rule__IfelseExpr__Group_1__1"
    // InternalStoex.g:1629:1: rule__IfelseExpr__Group_1__1 : rule__IfelseExpr__Group_1__1__Impl rule__IfelseExpr__Group_1__2 ;
    public final void rule__IfelseExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1633:1: ( rule__IfelseExpr__Group_1__1__Impl rule__IfelseExpr__Group_1__2 )
            // InternalStoex.g:1634:2: rule__IfelseExpr__Group_1__1__Impl rule__IfelseExpr__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__IfelseExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfelseExpr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfelseExpr__Group_1__1"


    // $ANTLR start "rule__IfelseExpr__Group_1__1__Impl"
    // InternalStoex.g:1641:1: rule__IfelseExpr__Group_1__1__Impl : ( RULE_CONDDELIMITER ) ;
    public final void rule__IfelseExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1645:1: ( ( RULE_CONDDELIMITER ) )
            // InternalStoex.g:1646:1: ( RULE_CONDDELIMITER )
            {
            // InternalStoex.g:1646:1: ( RULE_CONDDELIMITER )
            // InternalStoex.g:1647:2: RULE_CONDDELIMITER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfelseExprAccess().getCONDDELIMITERTerminalRuleCall_1_1()); 
            }
            match(input,RULE_CONDDELIMITER,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfelseExprAccess().getCONDDELIMITERTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfelseExpr__Group_1__1__Impl"


    // $ANTLR start "rule__IfelseExpr__Group_1__2"
    // InternalStoex.g:1656:1: rule__IfelseExpr__Group_1__2 : rule__IfelseExpr__Group_1__2__Impl rule__IfelseExpr__Group_1__3 ;
    public final void rule__IfelseExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1660:1: ( rule__IfelseExpr__Group_1__2__Impl rule__IfelseExpr__Group_1__3 )
            // InternalStoex.g:1661:2: rule__IfelseExpr__Group_1__2__Impl rule__IfelseExpr__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__IfelseExpr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfelseExpr__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfelseExpr__Group_1__2"


    // $ANTLR start "rule__IfelseExpr__Group_1__2__Impl"
    // InternalStoex.g:1668:1: rule__IfelseExpr__Group_1__2__Impl : ( ( rule__IfelseExpr__IfExpressionAssignment_1_2 ) ) ;
    public final void rule__IfelseExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1672:1: ( ( ( rule__IfelseExpr__IfExpressionAssignment_1_2 ) ) )
            // InternalStoex.g:1673:1: ( ( rule__IfelseExpr__IfExpressionAssignment_1_2 ) )
            {
            // InternalStoex.g:1673:1: ( ( rule__IfelseExpr__IfExpressionAssignment_1_2 ) )
            // InternalStoex.g:1674:2: ( rule__IfelseExpr__IfExpressionAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfelseExprAccess().getIfExpressionAssignment_1_2()); 
            }
            // InternalStoex.g:1675:2: ( rule__IfelseExpr__IfExpressionAssignment_1_2 )
            // InternalStoex.g:1675:3: rule__IfelseExpr__IfExpressionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfelseExpr__IfExpressionAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfelseExprAccess().getIfExpressionAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfelseExpr__Group_1__2__Impl"


    // $ANTLR start "rule__IfelseExpr__Group_1__3"
    // InternalStoex.g:1683:1: rule__IfelseExpr__Group_1__3 : rule__IfelseExpr__Group_1__3__Impl rule__IfelseExpr__Group_1__4 ;
    public final void rule__IfelseExpr__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1687:1: ( rule__IfelseExpr__Group_1__3__Impl rule__IfelseExpr__Group_1__4 )
            // InternalStoex.g:1688:2: rule__IfelseExpr__Group_1__3__Impl rule__IfelseExpr__Group_1__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__IfelseExpr__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfelseExpr__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfelseExpr__Group_1__3"


    // $ANTLR start "rule__IfelseExpr__Group_1__3__Impl"
    // InternalStoex.g:1695:1: rule__IfelseExpr__Group_1__3__Impl : ( RULE_ELSEDELIMITER ) ;
    public final void rule__IfelseExpr__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1699:1: ( ( RULE_ELSEDELIMITER ) )
            // InternalStoex.g:1700:1: ( RULE_ELSEDELIMITER )
            {
            // InternalStoex.g:1700:1: ( RULE_ELSEDELIMITER )
            // InternalStoex.g:1701:2: RULE_ELSEDELIMITER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfelseExprAccess().getELSEDELIMITERTerminalRuleCall_1_3()); 
            }
            match(input,RULE_ELSEDELIMITER,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfelseExprAccess().getELSEDELIMITERTerminalRuleCall_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfelseExpr__Group_1__3__Impl"


    // $ANTLR start "rule__IfelseExpr__Group_1__4"
    // InternalStoex.g:1710:1: rule__IfelseExpr__Group_1__4 : rule__IfelseExpr__Group_1__4__Impl ;
    public final void rule__IfelseExpr__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1714:1: ( rule__IfelseExpr__Group_1__4__Impl )
            // InternalStoex.g:1715:2: rule__IfelseExpr__Group_1__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfelseExpr__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfelseExpr__Group_1__4"


    // $ANTLR start "rule__IfelseExpr__Group_1__4__Impl"
    // InternalStoex.g:1721:1: rule__IfelseExpr__Group_1__4__Impl : ( ( rule__IfelseExpr__ElseExpressionAssignment_1_4 ) ) ;
    public final void rule__IfelseExpr__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1725:1: ( ( ( rule__IfelseExpr__ElseExpressionAssignment_1_4 ) ) )
            // InternalStoex.g:1726:1: ( ( rule__IfelseExpr__ElseExpressionAssignment_1_4 ) )
            {
            // InternalStoex.g:1726:1: ( ( rule__IfelseExpr__ElseExpressionAssignment_1_4 ) )
            // InternalStoex.g:1727:2: ( rule__IfelseExpr__ElseExpressionAssignment_1_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfelseExprAccess().getElseExpressionAssignment_1_4()); 
            }
            // InternalStoex.g:1728:2: ( rule__IfelseExpr__ElseExpressionAssignment_1_4 )
            // InternalStoex.g:1728:3: rule__IfelseExpr__ElseExpressionAssignment_1_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfelseExpr__ElseExpressionAssignment_1_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfelseExprAccess().getElseExpressionAssignment_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfelseExpr__Group_1__4__Impl"


    // $ANTLR start "rule__BoolAndExpr__Group__0"
    // InternalStoex.g:1737:1: rule__BoolAndExpr__Group__0 : rule__BoolAndExpr__Group__0__Impl rule__BoolAndExpr__Group__1 ;
    public final void rule__BoolAndExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1741:1: ( rule__BoolAndExpr__Group__0__Impl rule__BoolAndExpr__Group__1 )
            // InternalStoex.g:1742:2: rule__BoolAndExpr__Group__0__Impl rule__BoolAndExpr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__BoolAndExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoolAndExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolAndExpr__Group__0"


    // $ANTLR start "rule__BoolAndExpr__Group__0__Impl"
    // InternalStoex.g:1749:1: rule__BoolAndExpr__Group__0__Impl : ( ruleboolOrExpr ) ;
    public final void rule__BoolAndExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1753:1: ( ( ruleboolOrExpr ) )
            // InternalStoex.g:1754:1: ( ruleboolOrExpr )
            {
            // InternalStoex.g:1754:1: ( ruleboolOrExpr )
            // InternalStoex.g:1755:2: ruleboolOrExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAndExprAccess().getBoolOrExprParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleboolOrExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolAndExprAccess().getBoolOrExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolAndExpr__Group__0__Impl"


    // $ANTLR start "rule__BoolAndExpr__Group__1"
    // InternalStoex.g:1764:1: rule__BoolAndExpr__Group__1 : rule__BoolAndExpr__Group__1__Impl ;
    public final void rule__BoolAndExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1768:1: ( rule__BoolAndExpr__Group__1__Impl )
            // InternalStoex.g:1769:2: rule__BoolAndExpr__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoolAndExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolAndExpr__Group__1"


    // $ANTLR start "rule__BoolAndExpr__Group__1__Impl"
    // InternalStoex.g:1775:1: rule__BoolAndExpr__Group__1__Impl : ( ( rule__BoolAndExpr__Group_1__0 )* ) ;
    public final void rule__BoolAndExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1779:1: ( ( ( rule__BoolAndExpr__Group_1__0 )* ) )
            // InternalStoex.g:1780:1: ( ( rule__BoolAndExpr__Group_1__0 )* )
            {
            // InternalStoex.g:1780:1: ( ( rule__BoolAndExpr__Group_1__0 )* )
            // InternalStoex.g:1781:2: ( rule__BoolAndExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAndExprAccess().getGroup_1()); 
            }
            // InternalStoex.g:1782:2: ( rule__BoolAndExpr__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalStoex.g:1782:3: rule__BoolAndExpr__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__BoolAndExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolAndExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolAndExpr__Group__1__Impl"


    // $ANTLR start "rule__BoolAndExpr__Group_1__0"
    // InternalStoex.g:1791:1: rule__BoolAndExpr__Group_1__0 : rule__BoolAndExpr__Group_1__0__Impl rule__BoolAndExpr__Group_1__1 ;
    public final void rule__BoolAndExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1795:1: ( rule__BoolAndExpr__Group_1__0__Impl rule__BoolAndExpr__Group_1__1 )
            // InternalStoex.g:1796:2: rule__BoolAndExpr__Group_1__0__Impl rule__BoolAndExpr__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__BoolAndExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoolAndExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolAndExpr__Group_1__0"


    // $ANTLR start "rule__BoolAndExpr__Group_1__0__Impl"
    // InternalStoex.g:1803:1: rule__BoolAndExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__BoolAndExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1807:1: ( ( () ) )
            // InternalStoex.g:1808:1: ( () )
            {
            // InternalStoex.g:1808:1: ( () )
            // InternalStoex.g:1809:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAndExprAccess().getBooleanOperatorExpressionLeftAction_1_0()); 
            }
            // InternalStoex.g:1810:2: ()
            // InternalStoex.g:1810:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolAndExprAccess().getBooleanOperatorExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolAndExpr__Group_1__0__Impl"


    // $ANTLR start "rule__BoolAndExpr__Group_1__1"
    // InternalStoex.g:1818:1: rule__BoolAndExpr__Group_1__1 : rule__BoolAndExpr__Group_1__1__Impl rule__BoolAndExpr__Group_1__2 ;
    public final void rule__BoolAndExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1822:1: ( rule__BoolAndExpr__Group_1__1__Impl rule__BoolAndExpr__Group_1__2 )
            // InternalStoex.g:1823:2: rule__BoolAndExpr__Group_1__1__Impl rule__BoolAndExpr__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__BoolAndExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoolAndExpr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolAndExpr__Group_1__1"


    // $ANTLR start "rule__BoolAndExpr__Group_1__1__Impl"
    // InternalStoex.g:1830:1: rule__BoolAndExpr__Group_1__1__Impl : ( ( rule__BoolAndExpr__OperationAssignment_1_1 ) ) ;
    public final void rule__BoolAndExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1834:1: ( ( ( rule__BoolAndExpr__OperationAssignment_1_1 ) ) )
            // InternalStoex.g:1835:1: ( ( rule__BoolAndExpr__OperationAssignment_1_1 ) )
            {
            // InternalStoex.g:1835:1: ( ( rule__BoolAndExpr__OperationAssignment_1_1 ) )
            // InternalStoex.g:1836:2: ( rule__BoolAndExpr__OperationAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAndExprAccess().getOperationAssignment_1_1()); 
            }
            // InternalStoex.g:1837:2: ( rule__BoolAndExpr__OperationAssignment_1_1 )
            // InternalStoex.g:1837:3: rule__BoolAndExpr__OperationAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoolAndExpr__OperationAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolAndExprAccess().getOperationAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolAndExpr__Group_1__1__Impl"


    // $ANTLR start "rule__BoolAndExpr__Group_1__2"
    // InternalStoex.g:1845:1: rule__BoolAndExpr__Group_1__2 : rule__BoolAndExpr__Group_1__2__Impl ;
    public final void rule__BoolAndExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1849:1: ( rule__BoolAndExpr__Group_1__2__Impl )
            // InternalStoex.g:1850:2: rule__BoolAndExpr__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoolAndExpr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolAndExpr__Group_1__2"


    // $ANTLR start "rule__BoolAndExpr__Group_1__2__Impl"
    // InternalStoex.g:1856:1: rule__BoolAndExpr__Group_1__2__Impl : ( ( rule__BoolAndExpr__RightAssignment_1_2 ) ) ;
    public final void rule__BoolAndExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1860:1: ( ( ( rule__BoolAndExpr__RightAssignment_1_2 ) ) )
            // InternalStoex.g:1861:1: ( ( rule__BoolAndExpr__RightAssignment_1_2 ) )
            {
            // InternalStoex.g:1861:1: ( ( rule__BoolAndExpr__RightAssignment_1_2 ) )
            // InternalStoex.g:1862:2: ( rule__BoolAndExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAndExprAccess().getRightAssignment_1_2()); 
            }
            // InternalStoex.g:1863:2: ( rule__BoolAndExpr__RightAssignment_1_2 )
            // InternalStoex.g:1863:3: rule__BoolAndExpr__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoolAndExpr__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolAndExprAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolAndExpr__Group_1__2__Impl"


    // $ANTLR start "rule__BoolOrExpr__Group__0"
    // InternalStoex.g:1872:1: rule__BoolOrExpr__Group__0 : rule__BoolOrExpr__Group__0__Impl rule__BoolOrExpr__Group__1 ;
    public final void rule__BoolOrExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1876:1: ( rule__BoolOrExpr__Group__0__Impl rule__BoolOrExpr__Group__1 )
            // InternalStoex.g:1877:2: rule__BoolOrExpr__Group__0__Impl rule__BoolOrExpr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__BoolOrExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoolOrExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOrExpr__Group__0"


    // $ANTLR start "rule__BoolOrExpr__Group__0__Impl"
    // InternalStoex.g:1884:1: rule__BoolOrExpr__Group__0__Impl : ( rulecompareExpr ) ;
    public final void rule__BoolOrExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1888:1: ( ( rulecompareExpr ) )
            // InternalStoex.g:1889:1: ( rulecompareExpr )
            {
            // InternalStoex.g:1889:1: ( rulecompareExpr )
            // InternalStoex.g:1890:2: rulecompareExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolOrExprAccess().getCompareExprParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulecompareExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolOrExprAccess().getCompareExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOrExpr__Group__0__Impl"


    // $ANTLR start "rule__BoolOrExpr__Group__1"
    // InternalStoex.g:1899:1: rule__BoolOrExpr__Group__1 : rule__BoolOrExpr__Group__1__Impl ;
    public final void rule__BoolOrExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1903:1: ( rule__BoolOrExpr__Group__1__Impl )
            // InternalStoex.g:1904:2: rule__BoolOrExpr__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoolOrExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOrExpr__Group__1"


    // $ANTLR start "rule__BoolOrExpr__Group__1__Impl"
    // InternalStoex.g:1910:1: rule__BoolOrExpr__Group__1__Impl : ( ( rule__BoolOrExpr__Group_1__0 )* ) ;
    public final void rule__BoolOrExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1914:1: ( ( ( rule__BoolOrExpr__Group_1__0 )* ) )
            // InternalStoex.g:1915:1: ( ( rule__BoolOrExpr__Group_1__0 )* )
            {
            // InternalStoex.g:1915:1: ( ( rule__BoolOrExpr__Group_1__0 )* )
            // InternalStoex.g:1916:2: ( rule__BoolOrExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolOrExprAccess().getGroup_1()); 
            }
            // InternalStoex.g:1917:2: ( rule__BoolOrExpr__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=32 && LA17_0<=33)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalStoex.g:1917:3: rule__BoolOrExpr__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__BoolOrExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolOrExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOrExpr__Group__1__Impl"


    // $ANTLR start "rule__BoolOrExpr__Group_1__0"
    // InternalStoex.g:1926:1: rule__BoolOrExpr__Group_1__0 : rule__BoolOrExpr__Group_1__0__Impl rule__BoolOrExpr__Group_1__1 ;
    public final void rule__BoolOrExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1930:1: ( rule__BoolOrExpr__Group_1__0__Impl rule__BoolOrExpr__Group_1__1 )
            // InternalStoex.g:1931:2: rule__BoolOrExpr__Group_1__0__Impl rule__BoolOrExpr__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__BoolOrExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoolOrExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOrExpr__Group_1__0"


    // $ANTLR start "rule__BoolOrExpr__Group_1__0__Impl"
    // InternalStoex.g:1938:1: rule__BoolOrExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__BoolOrExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1942:1: ( ( () ) )
            // InternalStoex.g:1943:1: ( () )
            {
            // InternalStoex.g:1943:1: ( () )
            // InternalStoex.g:1944:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolOrExprAccess().getBooleanOperatorExpressionLeftAction_1_0()); 
            }
            // InternalStoex.g:1945:2: ()
            // InternalStoex.g:1945:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolOrExprAccess().getBooleanOperatorExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOrExpr__Group_1__0__Impl"


    // $ANTLR start "rule__BoolOrExpr__Group_1__1"
    // InternalStoex.g:1953:1: rule__BoolOrExpr__Group_1__1 : rule__BoolOrExpr__Group_1__1__Impl rule__BoolOrExpr__Group_1__2 ;
    public final void rule__BoolOrExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1957:1: ( rule__BoolOrExpr__Group_1__1__Impl rule__BoolOrExpr__Group_1__2 )
            // InternalStoex.g:1958:2: rule__BoolOrExpr__Group_1__1__Impl rule__BoolOrExpr__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__BoolOrExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoolOrExpr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOrExpr__Group_1__1"


    // $ANTLR start "rule__BoolOrExpr__Group_1__1__Impl"
    // InternalStoex.g:1965:1: rule__BoolOrExpr__Group_1__1__Impl : ( ( rule__BoolOrExpr__OperationAssignment_1_1 ) ) ;
    public final void rule__BoolOrExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1969:1: ( ( ( rule__BoolOrExpr__OperationAssignment_1_1 ) ) )
            // InternalStoex.g:1970:1: ( ( rule__BoolOrExpr__OperationAssignment_1_1 ) )
            {
            // InternalStoex.g:1970:1: ( ( rule__BoolOrExpr__OperationAssignment_1_1 ) )
            // InternalStoex.g:1971:2: ( rule__BoolOrExpr__OperationAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolOrExprAccess().getOperationAssignment_1_1()); 
            }
            // InternalStoex.g:1972:2: ( rule__BoolOrExpr__OperationAssignment_1_1 )
            // InternalStoex.g:1972:3: rule__BoolOrExpr__OperationAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoolOrExpr__OperationAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolOrExprAccess().getOperationAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOrExpr__Group_1__1__Impl"


    // $ANTLR start "rule__BoolOrExpr__Group_1__2"
    // InternalStoex.g:1980:1: rule__BoolOrExpr__Group_1__2 : rule__BoolOrExpr__Group_1__2__Impl ;
    public final void rule__BoolOrExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1984:1: ( rule__BoolOrExpr__Group_1__2__Impl )
            // InternalStoex.g:1985:2: rule__BoolOrExpr__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoolOrExpr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOrExpr__Group_1__2"


    // $ANTLR start "rule__BoolOrExpr__Group_1__2__Impl"
    // InternalStoex.g:1991:1: rule__BoolOrExpr__Group_1__2__Impl : ( ( rule__BoolOrExpr__RightAssignment_1_2 ) ) ;
    public final void rule__BoolOrExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1995:1: ( ( ( rule__BoolOrExpr__RightAssignment_1_2 ) ) )
            // InternalStoex.g:1996:1: ( ( rule__BoolOrExpr__RightAssignment_1_2 ) )
            {
            // InternalStoex.g:1996:1: ( ( rule__BoolOrExpr__RightAssignment_1_2 ) )
            // InternalStoex.g:1997:2: ( rule__BoolOrExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolOrExprAccess().getRightAssignment_1_2()); 
            }
            // InternalStoex.g:1998:2: ( rule__BoolOrExpr__RightAssignment_1_2 )
            // InternalStoex.g:1998:3: rule__BoolOrExpr__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoolOrExpr__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolOrExprAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOrExpr__Group_1__2__Impl"


    // $ANTLR start "rule__CompareExpr__Group__0"
    // InternalStoex.g:2007:1: rule__CompareExpr__Group__0 : rule__CompareExpr__Group__0__Impl rule__CompareExpr__Group__1 ;
    public final void rule__CompareExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2011:1: ( rule__CompareExpr__Group__0__Impl rule__CompareExpr__Group__1 )
            // InternalStoex.g:2012:2: rule__CompareExpr__Group__0__Impl rule__CompareExpr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__CompareExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpr__Group__0"


    // $ANTLR start "rule__CompareExpr__Group__0__Impl"
    // InternalStoex.g:2019:1: rule__CompareExpr__Group__0__Impl : ( rulesumExpr ) ;
    public final void rule__CompareExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2023:1: ( ( rulesumExpr ) )
            // InternalStoex.g:2024:1: ( rulesumExpr )
            {
            // InternalStoex.g:2024:1: ( rulesumExpr )
            // InternalStoex.g:2025:2: rulesumExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExprAccess().getSumExprParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulesumExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExprAccess().getSumExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpr__Group__0__Impl"


    // $ANTLR start "rule__CompareExpr__Group__1"
    // InternalStoex.g:2034:1: rule__CompareExpr__Group__1 : rule__CompareExpr__Group__1__Impl ;
    public final void rule__CompareExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2038:1: ( rule__CompareExpr__Group__1__Impl )
            // InternalStoex.g:2039:2: rule__CompareExpr__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpr__Group__1"


    // $ANTLR start "rule__CompareExpr__Group__1__Impl"
    // InternalStoex.g:2045:1: rule__CompareExpr__Group__1__Impl : ( ( rule__CompareExpr__Group_1__0 )? ) ;
    public final void rule__CompareExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2049:1: ( ( ( rule__CompareExpr__Group_1__0 )? ) )
            // InternalStoex.g:2050:1: ( ( rule__CompareExpr__Group_1__0 )? )
            {
            // InternalStoex.g:2050:1: ( ( rule__CompareExpr__Group_1__0 )? )
            // InternalStoex.g:2051:2: ( rule__CompareExpr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExprAccess().getGroup_1()); 
            }
            // InternalStoex.g:2052:2: ( rule__CompareExpr__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=34 && LA18_0<=39)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalStoex.g:2052:3: rule__CompareExpr__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__CompareExpr__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpr__Group__1__Impl"


    // $ANTLR start "rule__CompareExpr__Group_1__0"
    // InternalStoex.g:2061:1: rule__CompareExpr__Group_1__0 : rule__CompareExpr__Group_1__0__Impl rule__CompareExpr__Group_1__1 ;
    public final void rule__CompareExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2065:1: ( rule__CompareExpr__Group_1__0__Impl rule__CompareExpr__Group_1__1 )
            // InternalStoex.g:2066:2: rule__CompareExpr__Group_1__0__Impl rule__CompareExpr__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__CompareExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpr__Group_1__0"


    // $ANTLR start "rule__CompareExpr__Group_1__0__Impl"
    // InternalStoex.g:2073:1: rule__CompareExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__CompareExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2077:1: ( ( () ) )
            // InternalStoex.g:2078:1: ( () )
            {
            // InternalStoex.g:2078:1: ( () )
            // InternalStoex.g:2079:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExprAccess().getCompareExpressionLeftAction_1_0()); 
            }
            // InternalStoex.g:2080:2: ()
            // InternalStoex.g:2080:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExprAccess().getCompareExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpr__Group_1__0__Impl"


    // $ANTLR start "rule__CompareExpr__Group_1__1"
    // InternalStoex.g:2088:1: rule__CompareExpr__Group_1__1 : rule__CompareExpr__Group_1__1__Impl rule__CompareExpr__Group_1__2 ;
    public final void rule__CompareExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2092:1: ( rule__CompareExpr__Group_1__1__Impl rule__CompareExpr__Group_1__2 )
            // InternalStoex.g:2093:2: rule__CompareExpr__Group_1__1__Impl rule__CompareExpr__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__CompareExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareExpr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpr__Group_1__1"


    // $ANTLR start "rule__CompareExpr__Group_1__1__Impl"
    // InternalStoex.g:2100:1: rule__CompareExpr__Group_1__1__Impl : ( ( rule__CompareExpr__OperationAssignment_1_1 ) ) ;
    public final void rule__CompareExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2104:1: ( ( ( rule__CompareExpr__OperationAssignment_1_1 ) ) )
            // InternalStoex.g:2105:1: ( ( rule__CompareExpr__OperationAssignment_1_1 ) )
            {
            // InternalStoex.g:2105:1: ( ( rule__CompareExpr__OperationAssignment_1_1 ) )
            // InternalStoex.g:2106:2: ( rule__CompareExpr__OperationAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExprAccess().getOperationAssignment_1_1()); 
            }
            // InternalStoex.g:2107:2: ( rule__CompareExpr__OperationAssignment_1_1 )
            // InternalStoex.g:2107:3: rule__CompareExpr__OperationAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareExpr__OperationAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExprAccess().getOperationAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpr__Group_1__1__Impl"


    // $ANTLR start "rule__CompareExpr__Group_1__2"
    // InternalStoex.g:2115:1: rule__CompareExpr__Group_1__2 : rule__CompareExpr__Group_1__2__Impl ;
    public final void rule__CompareExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2119:1: ( rule__CompareExpr__Group_1__2__Impl )
            // InternalStoex.g:2120:2: rule__CompareExpr__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareExpr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpr__Group_1__2"


    // $ANTLR start "rule__CompareExpr__Group_1__2__Impl"
    // InternalStoex.g:2126:1: rule__CompareExpr__Group_1__2__Impl : ( ( rule__CompareExpr__RightAssignment_1_2 ) ) ;
    public final void rule__CompareExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2130:1: ( ( ( rule__CompareExpr__RightAssignment_1_2 ) ) )
            // InternalStoex.g:2131:1: ( ( rule__CompareExpr__RightAssignment_1_2 ) )
            {
            // InternalStoex.g:2131:1: ( ( rule__CompareExpr__RightAssignment_1_2 ) )
            // InternalStoex.g:2132:2: ( rule__CompareExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExprAccess().getRightAssignment_1_2()); 
            }
            // InternalStoex.g:2133:2: ( rule__CompareExpr__RightAssignment_1_2 )
            // InternalStoex.g:2133:3: rule__CompareExpr__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareExpr__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExprAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpr__Group_1__2__Impl"


    // $ANTLR start "rule__SumExpr__Group__0"
    // InternalStoex.g:2142:1: rule__SumExpr__Group__0 : rule__SumExpr__Group__0__Impl rule__SumExpr__Group__1 ;
    public final void rule__SumExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2146:1: ( rule__SumExpr__Group__0__Impl rule__SumExpr__Group__1 )
            // InternalStoex.g:2147:2: rule__SumExpr__Group__0__Impl rule__SumExpr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__SumExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SumExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumExpr__Group__0"


    // $ANTLR start "rule__SumExpr__Group__0__Impl"
    // InternalStoex.g:2154:1: rule__SumExpr__Group__0__Impl : ( ruleprodExpr ) ;
    public final void rule__SumExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2158:1: ( ( ruleprodExpr ) )
            // InternalStoex.g:2159:1: ( ruleprodExpr )
            {
            // InternalStoex.g:2159:1: ( ruleprodExpr )
            // InternalStoex.g:2160:2: ruleprodExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumExprAccess().getProdExprParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleprodExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumExprAccess().getProdExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumExpr__Group__0__Impl"


    // $ANTLR start "rule__SumExpr__Group__1"
    // InternalStoex.g:2169:1: rule__SumExpr__Group__1 : rule__SumExpr__Group__1__Impl ;
    public final void rule__SumExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2173:1: ( rule__SumExpr__Group__1__Impl )
            // InternalStoex.g:2174:2: rule__SumExpr__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SumExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumExpr__Group__1"


    // $ANTLR start "rule__SumExpr__Group__1__Impl"
    // InternalStoex.g:2180:1: rule__SumExpr__Group__1__Impl : ( ( rule__SumExpr__Group_1__0 )* ) ;
    public final void rule__SumExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2184:1: ( ( ( rule__SumExpr__Group_1__0 )* ) )
            // InternalStoex.g:2185:1: ( ( rule__SumExpr__Group_1__0 )* )
            {
            // InternalStoex.g:2185:1: ( ( rule__SumExpr__Group_1__0 )* )
            // InternalStoex.g:2186:2: ( rule__SumExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumExprAccess().getGroup_1()); 
            }
            // InternalStoex.g:2187:2: ( rule__SumExpr__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=40 && LA19_0<=41)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalStoex.g:2187:3: rule__SumExpr__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    rule__SumExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumExpr__Group__1__Impl"


    // $ANTLR start "rule__SumExpr__Group_1__0"
    // InternalStoex.g:2196:1: rule__SumExpr__Group_1__0 : rule__SumExpr__Group_1__0__Impl rule__SumExpr__Group_1__1 ;
    public final void rule__SumExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2200:1: ( rule__SumExpr__Group_1__0__Impl rule__SumExpr__Group_1__1 )
            // InternalStoex.g:2201:2: rule__SumExpr__Group_1__0__Impl rule__SumExpr__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__SumExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SumExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumExpr__Group_1__0"


    // $ANTLR start "rule__SumExpr__Group_1__0__Impl"
    // InternalStoex.g:2208:1: rule__SumExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__SumExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2212:1: ( ( () ) )
            // InternalStoex.g:2213:1: ( () )
            {
            // InternalStoex.g:2213:1: ( () )
            // InternalStoex.g:2214:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumExprAccess().getTermExpressionLeftAction_1_0()); 
            }
            // InternalStoex.g:2215:2: ()
            // InternalStoex.g:2215:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumExprAccess().getTermExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumExpr__Group_1__0__Impl"


    // $ANTLR start "rule__SumExpr__Group_1__1"
    // InternalStoex.g:2223:1: rule__SumExpr__Group_1__1 : rule__SumExpr__Group_1__1__Impl rule__SumExpr__Group_1__2 ;
    public final void rule__SumExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2227:1: ( rule__SumExpr__Group_1__1__Impl rule__SumExpr__Group_1__2 )
            // InternalStoex.g:2228:2: rule__SumExpr__Group_1__1__Impl rule__SumExpr__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__SumExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SumExpr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumExpr__Group_1__1"


    // $ANTLR start "rule__SumExpr__Group_1__1__Impl"
    // InternalStoex.g:2235:1: rule__SumExpr__Group_1__1__Impl : ( ( rule__SumExpr__OperationAssignment_1_1 ) ) ;
    public final void rule__SumExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2239:1: ( ( ( rule__SumExpr__OperationAssignment_1_1 ) ) )
            // InternalStoex.g:2240:1: ( ( rule__SumExpr__OperationAssignment_1_1 ) )
            {
            // InternalStoex.g:2240:1: ( ( rule__SumExpr__OperationAssignment_1_1 ) )
            // InternalStoex.g:2241:2: ( rule__SumExpr__OperationAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumExprAccess().getOperationAssignment_1_1()); 
            }
            // InternalStoex.g:2242:2: ( rule__SumExpr__OperationAssignment_1_1 )
            // InternalStoex.g:2242:3: rule__SumExpr__OperationAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SumExpr__OperationAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumExprAccess().getOperationAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumExpr__Group_1__1__Impl"


    // $ANTLR start "rule__SumExpr__Group_1__2"
    // InternalStoex.g:2250:1: rule__SumExpr__Group_1__2 : rule__SumExpr__Group_1__2__Impl ;
    public final void rule__SumExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2254:1: ( rule__SumExpr__Group_1__2__Impl )
            // InternalStoex.g:2255:2: rule__SumExpr__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SumExpr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumExpr__Group_1__2"


    // $ANTLR start "rule__SumExpr__Group_1__2__Impl"
    // InternalStoex.g:2261:1: rule__SumExpr__Group_1__2__Impl : ( ( rule__SumExpr__RightAssignment_1_2 ) ) ;
    public final void rule__SumExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2265:1: ( ( ( rule__SumExpr__RightAssignment_1_2 ) ) )
            // InternalStoex.g:2266:1: ( ( rule__SumExpr__RightAssignment_1_2 ) )
            {
            // InternalStoex.g:2266:1: ( ( rule__SumExpr__RightAssignment_1_2 ) )
            // InternalStoex.g:2267:2: ( rule__SumExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumExprAccess().getRightAssignment_1_2()); 
            }
            // InternalStoex.g:2268:2: ( rule__SumExpr__RightAssignment_1_2 )
            // InternalStoex.g:2268:3: rule__SumExpr__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SumExpr__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumExprAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumExpr__Group_1__2__Impl"


    // $ANTLR start "rule__ProdExpr__Group__0"
    // InternalStoex.g:2277:1: rule__ProdExpr__Group__0 : rule__ProdExpr__Group__0__Impl rule__ProdExpr__Group__1 ;
    public final void rule__ProdExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2281:1: ( rule__ProdExpr__Group__0__Impl rule__ProdExpr__Group__1 )
            // InternalStoex.g:2282:2: rule__ProdExpr__Group__0__Impl rule__ProdExpr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__ProdExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProdExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdExpr__Group__0"


    // $ANTLR start "rule__ProdExpr__Group__0__Impl"
    // InternalStoex.g:2289:1: rule__ProdExpr__Group__0__Impl : ( rulepowExpr ) ;
    public final void rule__ProdExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2293:1: ( ( rulepowExpr ) )
            // InternalStoex.g:2294:1: ( rulepowExpr )
            {
            // InternalStoex.g:2294:1: ( rulepowExpr )
            // InternalStoex.g:2295:2: rulepowExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProdExprAccess().getPowExprParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulepowExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProdExprAccess().getPowExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdExpr__Group__0__Impl"


    // $ANTLR start "rule__ProdExpr__Group__1"
    // InternalStoex.g:2304:1: rule__ProdExpr__Group__1 : rule__ProdExpr__Group__1__Impl ;
    public final void rule__ProdExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2308:1: ( rule__ProdExpr__Group__1__Impl )
            // InternalStoex.g:2309:2: rule__ProdExpr__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProdExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdExpr__Group__1"


    // $ANTLR start "rule__ProdExpr__Group__1__Impl"
    // InternalStoex.g:2315:1: rule__ProdExpr__Group__1__Impl : ( ( rule__ProdExpr__Group_1__0 )* ) ;
    public final void rule__ProdExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2319:1: ( ( ( rule__ProdExpr__Group_1__0 )* ) )
            // InternalStoex.g:2320:1: ( ( rule__ProdExpr__Group_1__0 )* )
            {
            // InternalStoex.g:2320:1: ( ( rule__ProdExpr__Group_1__0 )* )
            // InternalStoex.g:2321:2: ( rule__ProdExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProdExprAccess().getGroup_1()); 
            }
            // InternalStoex.g:2322:2: ( rule__ProdExpr__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=42 && LA20_0<=44)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalStoex.g:2322:3: rule__ProdExpr__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    rule__ProdExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProdExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdExpr__Group__1__Impl"


    // $ANTLR start "rule__ProdExpr__Group_1__0"
    // InternalStoex.g:2331:1: rule__ProdExpr__Group_1__0 : rule__ProdExpr__Group_1__0__Impl rule__ProdExpr__Group_1__1 ;
    public final void rule__ProdExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2335:1: ( rule__ProdExpr__Group_1__0__Impl rule__ProdExpr__Group_1__1 )
            // InternalStoex.g:2336:2: rule__ProdExpr__Group_1__0__Impl rule__ProdExpr__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__ProdExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProdExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdExpr__Group_1__0"


    // $ANTLR start "rule__ProdExpr__Group_1__0__Impl"
    // InternalStoex.g:2343:1: rule__ProdExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__ProdExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2347:1: ( ( () ) )
            // InternalStoex.g:2348:1: ( () )
            {
            // InternalStoex.g:2348:1: ( () )
            // InternalStoex.g:2349:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProdExprAccess().getProductExpressionLeftAction_1_0()); 
            }
            // InternalStoex.g:2350:2: ()
            // InternalStoex.g:2350:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProdExprAccess().getProductExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdExpr__Group_1__0__Impl"


    // $ANTLR start "rule__ProdExpr__Group_1__1"
    // InternalStoex.g:2358:1: rule__ProdExpr__Group_1__1 : rule__ProdExpr__Group_1__1__Impl rule__ProdExpr__Group_1__2 ;
    public final void rule__ProdExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2362:1: ( rule__ProdExpr__Group_1__1__Impl rule__ProdExpr__Group_1__2 )
            // InternalStoex.g:2363:2: rule__ProdExpr__Group_1__1__Impl rule__ProdExpr__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__ProdExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProdExpr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdExpr__Group_1__1"


    // $ANTLR start "rule__ProdExpr__Group_1__1__Impl"
    // InternalStoex.g:2370:1: rule__ProdExpr__Group_1__1__Impl : ( ( rule__ProdExpr__OperationAssignment_1_1 ) ) ;
    public final void rule__ProdExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2374:1: ( ( ( rule__ProdExpr__OperationAssignment_1_1 ) ) )
            // InternalStoex.g:2375:1: ( ( rule__ProdExpr__OperationAssignment_1_1 ) )
            {
            // InternalStoex.g:2375:1: ( ( rule__ProdExpr__OperationAssignment_1_1 ) )
            // InternalStoex.g:2376:2: ( rule__ProdExpr__OperationAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProdExprAccess().getOperationAssignment_1_1()); 
            }
            // InternalStoex.g:2377:2: ( rule__ProdExpr__OperationAssignment_1_1 )
            // InternalStoex.g:2377:3: rule__ProdExpr__OperationAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProdExpr__OperationAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProdExprAccess().getOperationAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdExpr__Group_1__1__Impl"


    // $ANTLR start "rule__ProdExpr__Group_1__2"
    // InternalStoex.g:2385:1: rule__ProdExpr__Group_1__2 : rule__ProdExpr__Group_1__2__Impl ;
    public final void rule__ProdExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2389:1: ( rule__ProdExpr__Group_1__2__Impl )
            // InternalStoex.g:2390:2: rule__ProdExpr__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProdExpr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdExpr__Group_1__2"


    // $ANTLR start "rule__ProdExpr__Group_1__2__Impl"
    // InternalStoex.g:2396:1: rule__ProdExpr__Group_1__2__Impl : ( ( rule__ProdExpr__RightAssignment_1_2 ) ) ;
    public final void rule__ProdExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2400:1: ( ( ( rule__ProdExpr__RightAssignment_1_2 ) ) )
            // InternalStoex.g:2401:1: ( ( rule__ProdExpr__RightAssignment_1_2 ) )
            {
            // InternalStoex.g:2401:1: ( ( rule__ProdExpr__RightAssignment_1_2 ) )
            // InternalStoex.g:2402:2: ( rule__ProdExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProdExprAccess().getRightAssignment_1_2()); 
            }
            // InternalStoex.g:2403:2: ( rule__ProdExpr__RightAssignment_1_2 )
            // InternalStoex.g:2403:3: rule__ProdExpr__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProdExpr__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProdExprAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdExpr__Group_1__2__Impl"


    // $ANTLR start "rule__PowExpr__Group__0"
    // InternalStoex.g:2412:1: rule__PowExpr__Group__0 : rule__PowExpr__Group__0__Impl rule__PowExpr__Group__1 ;
    public final void rule__PowExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2416:1: ( rule__PowExpr__Group__0__Impl rule__PowExpr__Group__1 )
            // InternalStoex.g:2417:2: rule__PowExpr__Group__0__Impl rule__PowExpr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__PowExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PowExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpr__Group__0"


    // $ANTLR start "rule__PowExpr__Group__0__Impl"
    // InternalStoex.g:2424:1: rule__PowExpr__Group__0__Impl : ( ruleunaryExpr ) ;
    public final void rule__PowExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2428:1: ( ( ruleunaryExpr ) )
            // InternalStoex.g:2429:1: ( ruleunaryExpr )
            {
            // InternalStoex.g:2429:1: ( ruleunaryExpr )
            // InternalStoex.g:2430:2: ruleunaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExprAccess().getUnaryExprParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleunaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowExprAccess().getUnaryExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpr__Group__0__Impl"


    // $ANTLR start "rule__PowExpr__Group__1"
    // InternalStoex.g:2439:1: rule__PowExpr__Group__1 : rule__PowExpr__Group__1__Impl ;
    public final void rule__PowExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2443:1: ( rule__PowExpr__Group__1__Impl )
            // InternalStoex.g:2444:2: rule__PowExpr__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PowExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpr__Group__1"


    // $ANTLR start "rule__PowExpr__Group__1__Impl"
    // InternalStoex.g:2450:1: rule__PowExpr__Group__1__Impl : ( ( rule__PowExpr__Group_1__0 )? ) ;
    public final void rule__PowExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2454:1: ( ( ( rule__PowExpr__Group_1__0 )? ) )
            // InternalStoex.g:2455:1: ( ( rule__PowExpr__Group_1__0 )? )
            {
            // InternalStoex.g:2455:1: ( ( rule__PowExpr__Group_1__0 )? )
            // InternalStoex.g:2456:2: ( rule__PowExpr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExprAccess().getGroup_1()); 
            }
            // InternalStoex.g:2457:2: ( rule__PowExpr__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_POW) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalStoex.g:2457:3: rule__PowExpr__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PowExpr__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpr__Group__1__Impl"


    // $ANTLR start "rule__PowExpr__Group_1__0"
    // InternalStoex.g:2466:1: rule__PowExpr__Group_1__0 : rule__PowExpr__Group_1__0__Impl rule__PowExpr__Group_1__1 ;
    public final void rule__PowExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2470:1: ( rule__PowExpr__Group_1__0__Impl rule__PowExpr__Group_1__1 )
            // InternalStoex.g:2471:2: rule__PowExpr__Group_1__0__Impl rule__PowExpr__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__PowExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PowExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpr__Group_1__0"


    // $ANTLR start "rule__PowExpr__Group_1__0__Impl"
    // InternalStoex.g:2478:1: rule__PowExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__PowExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2482:1: ( ( () ) )
            // InternalStoex.g:2483:1: ( () )
            {
            // InternalStoex.g:2483:1: ( () )
            // InternalStoex.g:2484:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExprAccess().getPowerExpressionBaseAction_1_0()); 
            }
            // InternalStoex.g:2485:2: ()
            // InternalStoex.g:2485:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowExprAccess().getPowerExpressionBaseAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpr__Group_1__0__Impl"


    // $ANTLR start "rule__PowExpr__Group_1__1"
    // InternalStoex.g:2493:1: rule__PowExpr__Group_1__1 : rule__PowExpr__Group_1__1__Impl rule__PowExpr__Group_1__2 ;
    public final void rule__PowExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2497:1: ( rule__PowExpr__Group_1__1__Impl rule__PowExpr__Group_1__2 )
            // InternalStoex.g:2498:2: rule__PowExpr__Group_1__1__Impl rule__PowExpr__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__PowExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PowExpr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpr__Group_1__1"


    // $ANTLR start "rule__PowExpr__Group_1__1__Impl"
    // InternalStoex.g:2505:1: rule__PowExpr__Group_1__1__Impl : ( RULE_POW ) ;
    public final void rule__PowExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2509:1: ( ( RULE_POW ) )
            // InternalStoex.g:2510:1: ( RULE_POW )
            {
            // InternalStoex.g:2510:1: ( RULE_POW )
            // InternalStoex.g:2511:2: RULE_POW
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExprAccess().getPOWTerminalRuleCall_1_1()); 
            }
            match(input,RULE_POW,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowExprAccess().getPOWTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpr__Group_1__1__Impl"


    // $ANTLR start "rule__PowExpr__Group_1__2"
    // InternalStoex.g:2520:1: rule__PowExpr__Group_1__2 : rule__PowExpr__Group_1__2__Impl ;
    public final void rule__PowExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2524:1: ( rule__PowExpr__Group_1__2__Impl )
            // InternalStoex.g:2525:2: rule__PowExpr__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PowExpr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpr__Group_1__2"


    // $ANTLR start "rule__PowExpr__Group_1__2__Impl"
    // InternalStoex.g:2531:1: rule__PowExpr__Group_1__2__Impl : ( ( rule__PowExpr__ExponentAssignment_1_2 ) ) ;
    public final void rule__PowExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2535:1: ( ( ( rule__PowExpr__ExponentAssignment_1_2 ) ) )
            // InternalStoex.g:2536:1: ( ( rule__PowExpr__ExponentAssignment_1_2 ) )
            {
            // InternalStoex.g:2536:1: ( ( rule__PowExpr__ExponentAssignment_1_2 ) )
            // InternalStoex.g:2537:2: ( rule__PowExpr__ExponentAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExprAccess().getExponentAssignment_1_2()); 
            }
            // InternalStoex.g:2538:2: ( rule__PowExpr__ExponentAssignment_1_2 )
            // InternalStoex.g:2538:3: rule__PowExpr__ExponentAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PowExpr__ExponentAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowExprAccess().getExponentAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpr__Group_1__2__Impl"


    // $ANTLR start "rule__NotExpression__Group__0"
    // InternalStoex.g:2547:1: rule__NotExpression__Group__0 : rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1 ;
    public final void rule__NotExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2551:1: ( rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1 )
            // InternalStoex.g:2552:2: rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__NotExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NotExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group__0"


    // $ANTLR start "rule__NotExpression__Group__0__Impl"
    // InternalStoex.g:2559:1: rule__NotExpression__Group__0__Impl : ( RULE_NOT ) ;
    public final void rule__NotExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2563:1: ( ( RULE_NOT ) )
            // InternalStoex.g:2564:1: ( RULE_NOT )
            {
            // InternalStoex.g:2564:1: ( RULE_NOT )
            // InternalStoex.g:2565:2: RULE_NOT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getNOTTerminalRuleCall_0()); 
            }
            match(input,RULE_NOT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getNOTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group__0__Impl"


    // $ANTLR start "rule__NotExpression__Group__1"
    // InternalStoex.g:2574:1: rule__NotExpression__Group__1 : rule__NotExpression__Group__1__Impl ;
    public final void rule__NotExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2578:1: ( rule__NotExpression__Group__1__Impl )
            // InternalStoex.g:2579:2: rule__NotExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NotExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group__1"


    // $ANTLR start "rule__NotExpression__Group__1__Impl"
    // InternalStoex.g:2585:1: rule__NotExpression__Group__1__Impl : ( ( rule__NotExpression__InnerAssignment_1 ) ) ;
    public final void rule__NotExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2589:1: ( ( ( rule__NotExpression__InnerAssignment_1 ) ) )
            // InternalStoex.g:2590:1: ( ( rule__NotExpression__InnerAssignment_1 ) )
            {
            // InternalStoex.g:2590:1: ( ( rule__NotExpression__InnerAssignment_1 ) )
            // InternalStoex.g:2591:2: ( rule__NotExpression__InnerAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getInnerAssignment_1()); 
            }
            // InternalStoex.g:2592:2: ( rule__NotExpression__InnerAssignment_1 )
            // InternalStoex.g:2592:3: rule__NotExpression__InnerAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NotExpression__InnerAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getInnerAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group__1__Impl"


    // $ANTLR start "rule__NegativeExpression__Group__0"
    // InternalStoex.g:2601:1: rule__NegativeExpression__Group__0 : rule__NegativeExpression__Group__0__Impl rule__NegativeExpression__Group__1 ;
    public final void rule__NegativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2605:1: ( rule__NegativeExpression__Group__0__Impl rule__NegativeExpression__Group__1 )
            // InternalStoex.g:2606:2: rule__NegativeExpression__Group__0__Impl rule__NegativeExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__NegativeExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NegativeExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeExpression__Group__0"


    // $ANTLR start "rule__NegativeExpression__Group__0__Impl"
    // InternalStoex.g:2613:1: rule__NegativeExpression__Group__0__Impl : ( '-' ) ;
    public final void rule__NegativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2617:1: ( ( '-' ) )
            // InternalStoex.g:2618:1: ( '-' )
            {
            // InternalStoex.g:2618:1: ( '-' )
            // InternalStoex.g:2619:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeExpressionAccess().getHyphenMinusKeyword_0()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeExpressionAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeExpression__Group__0__Impl"


    // $ANTLR start "rule__NegativeExpression__Group__1"
    // InternalStoex.g:2628:1: rule__NegativeExpression__Group__1 : rule__NegativeExpression__Group__1__Impl ;
    public final void rule__NegativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2632:1: ( rule__NegativeExpression__Group__1__Impl )
            // InternalStoex.g:2633:2: rule__NegativeExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NegativeExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeExpression__Group__1"


    // $ANTLR start "rule__NegativeExpression__Group__1__Impl"
    // InternalStoex.g:2639:1: rule__NegativeExpression__Group__1__Impl : ( ( rule__NegativeExpression__InnerAssignment_1 ) ) ;
    public final void rule__NegativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2643:1: ( ( ( rule__NegativeExpression__InnerAssignment_1 ) ) )
            // InternalStoex.g:2644:1: ( ( rule__NegativeExpression__InnerAssignment_1 ) )
            {
            // InternalStoex.g:2644:1: ( ( rule__NegativeExpression__InnerAssignment_1 ) )
            // InternalStoex.g:2645:2: ( rule__NegativeExpression__InnerAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeExpressionAccess().getInnerAssignment_1()); 
            }
            // InternalStoex.g:2646:2: ( rule__NegativeExpression__InnerAssignment_1 )
            // InternalStoex.g:2646:3: rule__NegativeExpression__InnerAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NegativeExpression__InnerAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeExpressionAccess().getInnerAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeExpression__Group__1__Impl"


    // $ANTLR start "rule__DoubleLiteral__Group__0"
    // InternalStoex.g:2655:1: rule__DoubleLiteral__Group__0 : rule__DoubleLiteral__Group__0__Impl rule__DoubleLiteral__Group__1 ;
    public final void rule__DoubleLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2659:1: ( rule__DoubleLiteral__Group__0__Impl rule__DoubleLiteral__Group__1 )
            // InternalStoex.g:2660:2: rule__DoubleLiteral__Group__0__Impl rule__DoubleLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__DoubleLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoubleLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__Group__0"


    // $ANTLR start "rule__DoubleLiteral__Group__0__Impl"
    // InternalStoex.g:2667:1: rule__DoubleLiteral__Group__0__Impl : ( ( rule__DoubleLiteral__ValueAssignment_0 ) ) ;
    public final void rule__DoubleLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2671:1: ( ( ( rule__DoubleLiteral__ValueAssignment_0 ) ) )
            // InternalStoex.g:2672:1: ( ( rule__DoubleLiteral__ValueAssignment_0 ) )
            {
            // InternalStoex.g:2672:1: ( ( rule__DoubleLiteral__ValueAssignment_0 ) )
            // InternalStoex.g:2673:2: ( rule__DoubleLiteral__ValueAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLiteralAccess().getValueAssignment_0()); 
            }
            // InternalStoex.g:2674:2: ( rule__DoubleLiteral__ValueAssignment_0 )
            // InternalStoex.g:2674:3: rule__DoubleLiteral__ValueAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoubleLiteral__ValueAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleLiteralAccess().getValueAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__Group__0__Impl"


    // $ANTLR start "rule__DoubleLiteral__Group__1"
    // InternalStoex.g:2682:1: rule__DoubleLiteral__Group__1 : rule__DoubleLiteral__Group__1__Impl ;
    public final void rule__DoubleLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2686:1: ( rule__DoubleLiteral__Group__1__Impl )
            // InternalStoex.g:2687:2: rule__DoubleLiteral__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoubleLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__Group__1"


    // $ANTLR start "rule__DoubleLiteral__Group__1__Impl"
    // InternalStoex.g:2693:1: rule__DoubleLiteral__Group__1__Impl : ( ( rule__DoubleLiteral__Group_1__0 )? ) ;
    public final void rule__DoubleLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2697:1: ( ( ( rule__DoubleLiteral__Group_1__0 )? ) )
            // InternalStoex.g:2698:1: ( ( rule__DoubleLiteral__Group_1__0 )? )
            {
            // InternalStoex.g:2698:1: ( ( rule__DoubleLiteral__Group_1__0 )? )
            // InternalStoex.g:2699:2: ( rule__DoubleLiteral__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLiteralAccess().getGroup_1()); 
            }
            // InternalStoex.g:2700:2: ( rule__DoubleLiteral__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_SQUARE_PAREN_L) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalStoex.g:2700:3: rule__DoubleLiteral__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DoubleLiteral__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleLiteralAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__Group__1__Impl"


    // $ANTLR start "rule__DoubleLiteral__Group_1__0"
    // InternalStoex.g:2709:1: rule__DoubleLiteral__Group_1__0 : rule__DoubleLiteral__Group_1__0__Impl rule__DoubleLiteral__Group_1__1 ;
    public final void rule__DoubleLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2713:1: ( rule__DoubleLiteral__Group_1__0__Impl rule__DoubleLiteral__Group_1__1 )
            // InternalStoex.g:2714:2: rule__DoubleLiteral__Group_1__0__Impl rule__DoubleLiteral__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__DoubleLiteral__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoubleLiteral__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__Group_1__0"


    // $ANTLR start "rule__DoubleLiteral__Group_1__0__Impl"
    // InternalStoex.g:2721:1: rule__DoubleLiteral__Group_1__0__Impl : ( RULE_SQUARE_PAREN_L ) ;
    public final void rule__DoubleLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2725:1: ( ( RULE_SQUARE_PAREN_L ) )
            // InternalStoex.g:2726:1: ( RULE_SQUARE_PAREN_L )
            {
            // InternalStoex.g:2726:1: ( RULE_SQUARE_PAREN_L )
            // InternalStoex.g:2727:2: RULE_SQUARE_PAREN_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLiteralAccess().getSQUARE_PAREN_LTerminalRuleCall_1_0()); 
            }
            match(input,RULE_SQUARE_PAREN_L,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleLiteralAccess().getSQUARE_PAREN_LTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__DoubleLiteral__Group_1__1"
    // InternalStoex.g:2736:1: rule__DoubleLiteral__Group_1__1 : rule__DoubleLiteral__Group_1__1__Impl rule__DoubleLiteral__Group_1__2 ;
    public final void rule__DoubleLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2740:1: ( rule__DoubleLiteral__Group_1__1__Impl rule__DoubleLiteral__Group_1__2 )
            // InternalStoex.g:2741:2: rule__DoubleLiteral__Group_1__1__Impl rule__DoubleLiteral__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__DoubleLiteral__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoubleLiteral__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__Group_1__1"


    // $ANTLR start "rule__DoubleLiteral__Group_1__1__Impl"
    // InternalStoex.g:2748:1: rule__DoubleLiteral__Group_1__1__Impl : ( ( rule__DoubleLiteral__UnitAssignment_1_1 ) ) ;
    public final void rule__DoubleLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2752:1: ( ( ( rule__DoubleLiteral__UnitAssignment_1_1 ) ) )
            // InternalStoex.g:2753:1: ( ( rule__DoubleLiteral__UnitAssignment_1_1 ) )
            {
            // InternalStoex.g:2753:1: ( ( rule__DoubleLiteral__UnitAssignment_1_1 ) )
            // InternalStoex.g:2754:2: ( rule__DoubleLiteral__UnitAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLiteralAccess().getUnitAssignment_1_1()); 
            }
            // InternalStoex.g:2755:2: ( rule__DoubleLiteral__UnitAssignment_1_1 )
            // InternalStoex.g:2755:3: rule__DoubleLiteral__UnitAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoubleLiteral__UnitAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleLiteralAccess().getUnitAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__DoubleLiteral__Group_1__2"
    // InternalStoex.g:2763:1: rule__DoubleLiteral__Group_1__2 : rule__DoubleLiteral__Group_1__2__Impl ;
    public final void rule__DoubleLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2767:1: ( rule__DoubleLiteral__Group_1__2__Impl )
            // InternalStoex.g:2768:2: rule__DoubleLiteral__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoubleLiteral__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__Group_1__2"


    // $ANTLR start "rule__DoubleLiteral__Group_1__2__Impl"
    // InternalStoex.g:2774:1: rule__DoubleLiteral__Group_1__2__Impl : ( RULE_SQUARE_PAREN_R ) ;
    public final void rule__DoubleLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2778:1: ( ( RULE_SQUARE_PAREN_R ) )
            // InternalStoex.g:2779:1: ( RULE_SQUARE_PAREN_R )
            {
            // InternalStoex.g:2779:1: ( RULE_SQUARE_PAREN_R )
            // InternalStoex.g:2780:2: RULE_SQUARE_PAREN_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLiteralAccess().getSQUARE_PAREN_RTerminalRuleCall_1_2()); 
            }
            match(input,RULE_SQUARE_PAREN_R,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleLiteralAccess().getSQUARE_PAREN_RTerminalRuleCall_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__Group_1__2__Impl"


    // $ANTLR start "rule__Parenthesis__Group__0"
    // InternalStoex.g:2790:1: rule__Parenthesis__Group__0 : rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 ;
    public final void rule__Parenthesis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2794:1: ( rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 )
            // InternalStoex.g:2795:2: rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Parenthesis__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parenthesis__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__0"


    // $ANTLR start "rule__Parenthesis__Group__0__Impl"
    // InternalStoex.g:2802:1: rule__Parenthesis__Group__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__Parenthesis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2806:1: ( ( RULE_LPAREN ) )
            // InternalStoex.g:2807:1: ( RULE_LPAREN )
            {
            // InternalStoex.g:2807:1: ( RULE_LPAREN )
            // InternalStoex.g:2808:2: RULE_LPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisAccess().getLPARENTerminalRuleCall_0()); 
            }
            match(input,RULE_LPAREN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisAccess().getLPARENTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__0__Impl"


    // $ANTLR start "rule__Parenthesis__Group__1"
    // InternalStoex.g:2817:1: rule__Parenthesis__Group__1 : rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 ;
    public final void rule__Parenthesis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2821:1: ( rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 )
            // InternalStoex.g:2822:2: rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__Parenthesis__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parenthesis__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__1"


    // $ANTLR start "rule__Parenthesis__Group__1__Impl"
    // InternalStoex.g:2829:1: rule__Parenthesis__Group__1__Impl : ( ( rule__Parenthesis__InnerExpressionAssignment_1 ) ) ;
    public final void rule__Parenthesis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2833:1: ( ( ( rule__Parenthesis__InnerExpressionAssignment_1 ) ) )
            // InternalStoex.g:2834:1: ( ( rule__Parenthesis__InnerExpressionAssignment_1 ) )
            {
            // InternalStoex.g:2834:1: ( ( rule__Parenthesis__InnerExpressionAssignment_1 ) )
            // InternalStoex.g:2835:2: ( rule__Parenthesis__InnerExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisAccess().getInnerExpressionAssignment_1()); 
            }
            // InternalStoex.g:2836:2: ( rule__Parenthesis__InnerExpressionAssignment_1 )
            // InternalStoex.g:2836:3: rule__Parenthesis__InnerExpressionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parenthesis__InnerExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisAccess().getInnerExpressionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__2"
    // InternalStoex.g:2844:1: rule__Parenthesis__Group__2 : rule__Parenthesis__Group__2__Impl ;
    public final void rule__Parenthesis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2848:1: ( rule__Parenthesis__Group__2__Impl )
            // InternalStoex.g:2849:2: rule__Parenthesis__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parenthesis__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__2"


    // $ANTLR start "rule__Parenthesis__Group__2__Impl"
    // InternalStoex.g:2855:1: rule__Parenthesis__Group__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__Parenthesis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2859:1: ( ( RULE_RPAREN ) )
            // InternalStoex.g:2860:1: ( RULE_RPAREN )
            {
            // InternalStoex.g:2860:1: ( RULE_RPAREN )
            // InternalStoex.g:2861:2: RULE_RPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisAccess().getRPARENTerminalRuleCall_2()); 
            }
            match(input,RULE_RPAREN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisAccess().getRPARENTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__2__Impl"


    // $ANTLR start "rule__FunctionLiteral__Group__0"
    // InternalStoex.g:2871:1: rule__FunctionLiteral__Group__0 : rule__FunctionLiteral__Group__0__Impl rule__FunctionLiteral__Group__1 ;
    public final void rule__FunctionLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2875:1: ( rule__FunctionLiteral__Group__0__Impl rule__FunctionLiteral__Group__1 )
            // InternalStoex.g:2876:2: rule__FunctionLiteral__Group__0__Impl rule__FunctionLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__FunctionLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionLiteral__Group__0"


    // $ANTLR start "rule__FunctionLiteral__Group__0__Impl"
    // InternalStoex.g:2883:1: rule__FunctionLiteral__Group__0__Impl : ( ( rule__FunctionLiteral__IdAssignment_0 ) ) ;
    public final void rule__FunctionLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2887:1: ( ( ( rule__FunctionLiteral__IdAssignment_0 ) ) )
            // InternalStoex.g:2888:1: ( ( rule__FunctionLiteral__IdAssignment_0 ) )
            {
            // InternalStoex.g:2888:1: ( ( rule__FunctionLiteral__IdAssignment_0 ) )
            // InternalStoex.g:2889:2: ( rule__FunctionLiteral__IdAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionLiteralAccess().getIdAssignment_0()); 
            }
            // InternalStoex.g:2890:2: ( rule__FunctionLiteral__IdAssignment_0 )
            // InternalStoex.g:2890:3: rule__FunctionLiteral__IdAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionLiteral__IdAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionLiteralAccess().getIdAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionLiteral__Group__0__Impl"


    // $ANTLR start "rule__FunctionLiteral__Group__1"
    // InternalStoex.g:2898:1: rule__FunctionLiteral__Group__1 : rule__FunctionLiteral__Group__1__Impl rule__FunctionLiteral__Group__2 ;
    public final void rule__FunctionLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2902:1: ( rule__FunctionLiteral__Group__1__Impl rule__FunctionLiteral__Group__2 )
            // InternalStoex.g:2903:2: rule__FunctionLiteral__Group__1__Impl rule__FunctionLiteral__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__FunctionLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionLiteral__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionLiteral__Group__1"


    // $ANTLR start "rule__FunctionLiteral__Group__1__Impl"
    // InternalStoex.g:2910:1: rule__FunctionLiteral__Group__1__Impl : ( RULE_LPAREN ) ;
    public final void rule__FunctionLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2914:1: ( ( RULE_LPAREN ) )
            // InternalStoex.g:2915:1: ( RULE_LPAREN )
            {
            // InternalStoex.g:2915:1: ( RULE_LPAREN )
            // InternalStoex.g:2916:2: RULE_LPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionLiteralAccess().getLPARENTerminalRuleCall_1()); 
            }
            match(input,RULE_LPAREN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionLiteralAccess().getLPARENTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionLiteral__Group__1__Impl"


    // $ANTLR start "rule__FunctionLiteral__Group__2"
    // InternalStoex.g:2925:1: rule__FunctionLiteral__Group__2 : rule__FunctionLiteral__Group__2__Impl rule__FunctionLiteral__Group__3 ;
    public final void rule__FunctionLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2929:1: ( rule__FunctionLiteral__Group__2__Impl rule__FunctionLiteral__Group__3 )
            // InternalStoex.g:2930:2: rule__FunctionLiteral__Group__2__Impl rule__FunctionLiteral__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__FunctionLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionLiteral__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionLiteral__Group__2"


    // $ANTLR start "rule__FunctionLiteral__Group__2__Impl"
    // InternalStoex.g:2937:1: rule__FunctionLiteral__Group__2__Impl : ( ( rule__FunctionLiteral__Group_2__0 )? ) ;
    public final void rule__FunctionLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2941:1: ( ( ( rule__FunctionLiteral__Group_2__0 )? ) )
            // InternalStoex.g:2942:1: ( ( rule__FunctionLiteral__Group_2__0 )? )
            {
            // InternalStoex.g:2942:1: ( ( rule__FunctionLiteral__Group_2__0 )? )
            // InternalStoex.g:2943:2: ( rule__FunctionLiteral__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionLiteralAccess().getGroup_2()); 
            }
            // InternalStoex.g:2944:2: ( rule__FunctionLiteral__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_NOT||LA23_0==RULE_LPAREN||(LA23_0>=RULE_DOUBLEPDF && LA23_0<=RULE_BOOLPMF)||(LA23_0>=RULE_DOUBLE && LA23_0<=RULE_STRING)||LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalStoex.g:2944:3: rule__FunctionLiteral__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__FunctionLiteral__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionLiteralAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionLiteral__Group__2__Impl"


    // $ANTLR start "rule__FunctionLiteral__Group__3"
    // InternalStoex.g:2952:1: rule__FunctionLiteral__Group__3 : rule__FunctionLiteral__Group__3__Impl ;
    public final void rule__FunctionLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2956:1: ( rule__FunctionLiteral__Group__3__Impl )
            // InternalStoex.g:2957:2: rule__FunctionLiteral__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionLiteral__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionLiteral__Group__3"


    // $ANTLR start "rule__FunctionLiteral__Group__3__Impl"
    // InternalStoex.g:2963:1: rule__FunctionLiteral__Group__3__Impl : ( RULE_RPAREN ) ;
    public final void rule__FunctionLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2967:1: ( ( RULE_RPAREN ) )
            // InternalStoex.g:2968:1: ( RULE_RPAREN )
            {
            // InternalStoex.g:2968:1: ( RULE_RPAREN )
            // InternalStoex.g:2969:2: RULE_RPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionLiteralAccess().getRPARENTerminalRuleCall_3()); 
            }
            match(input,RULE_RPAREN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionLiteralAccess().getRPARENTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionLiteral__Group__3__Impl"


    // $ANTLR start "rule__FunctionLiteral__Group_2__0"
    // InternalStoex.g:2979:1: rule__FunctionLiteral__Group_2__0 : rule__FunctionLiteral__Group_2__0__Impl rule__FunctionLiteral__Group_2__1 ;
    public final void rule__FunctionLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2983:1: ( rule__FunctionLiteral__Group_2__0__Impl rule__FunctionLiteral__Group_2__1 )
            // InternalStoex.g:2984:2: rule__FunctionLiteral__Group_2__0__Impl rule__FunctionLiteral__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__FunctionLiteral__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionLiteral__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionLiteral__Group_2__0"


    // $ANTLR start "rule__FunctionLiteral__Group_2__0__Impl"
    // InternalStoex.g:2991:1: rule__FunctionLiteral__Group_2__0__Impl : ( ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_0 ) ) ;
    public final void rule__FunctionLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2995:1: ( ( ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_0 ) ) )
            // InternalStoex.g:2996:1: ( ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_0 ) )
            {
            // InternalStoex.g:2996:1: ( ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_0 ) )
            // InternalStoex.g:2997:2: ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionLiteralAccess().getParameters_FunctionLiteralAssignment_2_0()); 
            }
            // InternalStoex.g:2998:2: ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_0 )
            // InternalStoex.g:2998:3: rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionLiteralAccess().getParameters_FunctionLiteralAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionLiteral__Group_2__0__Impl"


    // $ANTLR start "rule__FunctionLiteral__Group_2__1"
    // InternalStoex.g:3006:1: rule__FunctionLiteral__Group_2__1 : rule__FunctionLiteral__Group_2__1__Impl ;
    public final void rule__FunctionLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3010:1: ( rule__FunctionLiteral__Group_2__1__Impl )
            // InternalStoex.g:3011:2: rule__FunctionLiteral__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionLiteral__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionLiteral__Group_2__1"


    // $ANTLR start "rule__FunctionLiteral__Group_2__1__Impl"
    // InternalStoex.g:3017:1: rule__FunctionLiteral__Group_2__1__Impl : ( ( rule__FunctionLiteral__Group_2_1__0 )* ) ;
    public final void rule__FunctionLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3021:1: ( ( ( rule__FunctionLiteral__Group_2_1__0 )* ) )
            // InternalStoex.g:3022:1: ( ( rule__FunctionLiteral__Group_2_1__0 )* )
            {
            // InternalStoex.g:3022:1: ( ( rule__FunctionLiteral__Group_2_1__0 )* )
            // InternalStoex.g:3023:2: ( rule__FunctionLiteral__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionLiteralAccess().getGroup_2_1()); 
            }
            // InternalStoex.g:3024:2: ( rule__FunctionLiteral__Group_2_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_COLON) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalStoex.g:3024:3: rule__FunctionLiteral__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    rule__FunctionLiteral__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionLiteralAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionLiteral__Group_2__1__Impl"


    // $ANTLR start "rule__FunctionLiteral__Group_2_1__0"
    // InternalStoex.g:3033:1: rule__FunctionLiteral__Group_2_1__0 : rule__FunctionLiteral__Group_2_1__0__Impl rule__FunctionLiteral__Group_2_1__1 ;
    public final void rule__FunctionLiteral__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3037:1: ( rule__FunctionLiteral__Group_2_1__0__Impl rule__FunctionLiteral__Group_2_1__1 )
            // InternalStoex.g:3038:2: rule__FunctionLiteral__Group_2_1__0__Impl rule__FunctionLiteral__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__FunctionLiteral__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionLiteral__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionLiteral__Group_2_1__0"


    // $ANTLR start "rule__FunctionLiteral__Group_2_1__0__Impl"
    // InternalStoex.g:3045:1: rule__FunctionLiteral__Group_2_1__0__Impl : ( RULE_COLON ) ;
    public final void rule__FunctionLiteral__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3049:1: ( ( RULE_COLON ) )
            // InternalStoex.g:3050:1: ( RULE_COLON )
            {
            // InternalStoex.g:3050:1: ( RULE_COLON )
            // InternalStoex.g:3051:2: RULE_COLON
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionLiteralAccess().getCOLONTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_COLON,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionLiteralAccess().getCOLONTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionLiteral__Group_2_1__0__Impl"


    // $ANTLR start "rule__FunctionLiteral__Group_2_1__1"
    // InternalStoex.g:3060:1: rule__FunctionLiteral__Group_2_1__1 : rule__FunctionLiteral__Group_2_1__1__Impl ;
    public final void rule__FunctionLiteral__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3064:1: ( rule__FunctionLiteral__Group_2_1__1__Impl )
            // InternalStoex.g:3065:2: rule__FunctionLiteral__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionLiteral__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionLiteral__Group_2_1__1"


    // $ANTLR start "rule__FunctionLiteral__Group_2_1__1__Impl"
    // InternalStoex.g:3071:1: rule__FunctionLiteral__Group_2_1__1__Impl : ( ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_1_1 ) ) ;
    public final void rule__FunctionLiteral__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3075:1: ( ( ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_1_1 ) ) )
            // InternalStoex.g:3076:1: ( ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_1_1 ) )
            {
            // InternalStoex.g:3076:1: ( ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_1_1 ) )
            // InternalStoex.g:3077:2: ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionLiteralAccess().getParameters_FunctionLiteralAssignment_2_1_1()); 
            }
            // InternalStoex.g:3078:2: ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_1_1 )
            // InternalStoex.g:3078:3: rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionLiteralAccess().getParameters_FunctionLiteralAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionLiteral__Group_2_1__1__Impl"


    // $ANTLR start "rule__NamespaceReference__Group__0"
    // InternalStoex.g:3087:1: rule__NamespaceReference__Group__0 : rule__NamespaceReference__Group__0__Impl rule__NamespaceReference__Group__1 ;
    public final void rule__NamespaceReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3091:1: ( rule__NamespaceReference__Group__0__Impl rule__NamespaceReference__Group__1 )
            // InternalStoex.g:3092:2: rule__NamespaceReference__Group__0__Impl rule__NamespaceReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__NamespaceReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamespaceReference__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceReference__Group__0"


    // $ANTLR start "rule__NamespaceReference__Group__0__Impl"
    // InternalStoex.g:3099:1: rule__NamespaceReference__Group__0__Impl : ( ( rule__NamespaceReference__ReferenceNameAssignment_0 ) ) ;
    public final void rule__NamespaceReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3103:1: ( ( ( rule__NamespaceReference__ReferenceNameAssignment_0 ) ) )
            // InternalStoex.g:3104:1: ( ( rule__NamespaceReference__ReferenceNameAssignment_0 ) )
            {
            // InternalStoex.g:3104:1: ( ( rule__NamespaceReference__ReferenceNameAssignment_0 ) )
            // InternalStoex.g:3105:2: ( rule__NamespaceReference__ReferenceNameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceReferenceAccess().getReferenceNameAssignment_0()); 
            }
            // InternalStoex.g:3106:2: ( rule__NamespaceReference__ReferenceNameAssignment_0 )
            // InternalStoex.g:3106:3: rule__NamespaceReference__ReferenceNameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamespaceReference__ReferenceNameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceReferenceAccess().getReferenceNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceReference__Group__0__Impl"


    // $ANTLR start "rule__NamespaceReference__Group__1"
    // InternalStoex.g:3114:1: rule__NamespaceReference__Group__1 : rule__NamespaceReference__Group__1__Impl rule__NamespaceReference__Group__2 ;
    public final void rule__NamespaceReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3118:1: ( rule__NamespaceReference__Group__1__Impl rule__NamespaceReference__Group__2 )
            // InternalStoex.g:3119:2: rule__NamespaceReference__Group__1__Impl rule__NamespaceReference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__NamespaceReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamespaceReference__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceReference__Group__1"


    // $ANTLR start "rule__NamespaceReference__Group__1__Impl"
    // InternalStoex.g:3126:1: rule__NamespaceReference__Group__1__Impl : ( RULE_DOT ) ;
    public final void rule__NamespaceReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3130:1: ( ( RULE_DOT ) )
            // InternalStoex.g:3131:1: ( RULE_DOT )
            {
            // InternalStoex.g:3131:1: ( RULE_DOT )
            // InternalStoex.g:3132:2: RULE_DOT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceReferenceAccess().getDOTTerminalRuleCall_1()); 
            }
            match(input,RULE_DOT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceReferenceAccess().getDOTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceReference__Group__1__Impl"


    // $ANTLR start "rule__NamespaceReference__Group__2"
    // InternalStoex.g:3141:1: rule__NamespaceReference__Group__2 : rule__NamespaceReference__Group__2__Impl ;
    public final void rule__NamespaceReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3145:1: ( rule__NamespaceReference__Group__2__Impl )
            // InternalStoex.g:3146:2: rule__NamespaceReference__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamespaceReference__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceReference__Group__2"


    // $ANTLR start "rule__NamespaceReference__Group__2__Impl"
    // InternalStoex.g:3152:1: rule__NamespaceReference__Group__2__Impl : ( ( rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2 ) ) ;
    public final void rule__NamespaceReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3156:1: ( ( ( rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2 ) ) )
            // InternalStoex.g:3157:1: ( ( rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2 ) )
            {
            // InternalStoex.g:3157:1: ( ( rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2 ) )
            // InternalStoex.g:3158:2: ( rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceReferenceAccess().getInnerReference_NamespaceReferenceAssignment_2()); 
            }
            // InternalStoex.g:3159:2: ( rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2 )
            // InternalStoex.g:3159:3: rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceReferenceAccess().getInnerReference_NamespaceReferenceAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceReference__Group__2__Impl"


    // $ANTLR start "rule__IntLiteral__Group__0"
    // InternalStoex.g:3168:1: rule__IntLiteral__Group__0 : rule__IntLiteral__Group__0__Impl rule__IntLiteral__Group__1 ;
    public final void rule__IntLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3172:1: ( rule__IntLiteral__Group__0__Impl rule__IntLiteral__Group__1 )
            // InternalStoex.g:3173:2: rule__IntLiteral__Group__0__Impl rule__IntLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__IntLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__Group__0"


    // $ANTLR start "rule__IntLiteral__Group__0__Impl"
    // InternalStoex.g:3180:1: rule__IntLiteral__Group__0__Impl : ( ( rule__IntLiteral__ValueAssignment_0 ) ) ;
    public final void rule__IntLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3184:1: ( ( ( rule__IntLiteral__ValueAssignment_0 ) ) )
            // InternalStoex.g:3185:1: ( ( rule__IntLiteral__ValueAssignment_0 ) )
            {
            // InternalStoex.g:3185:1: ( ( rule__IntLiteral__ValueAssignment_0 ) )
            // InternalStoex.g:3186:2: ( rule__IntLiteral__ValueAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueAssignment_0()); 
            }
            // InternalStoex.g:3187:2: ( rule__IntLiteral__ValueAssignment_0 )
            // InternalStoex.g:3187:3: rule__IntLiteral__ValueAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntLiteral__ValueAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralAccess().getValueAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__Group__0__Impl"


    // $ANTLR start "rule__IntLiteral__Group__1"
    // InternalStoex.g:3195:1: rule__IntLiteral__Group__1 : rule__IntLiteral__Group__1__Impl ;
    public final void rule__IntLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3199:1: ( rule__IntLiteral__Group__1__Impl )
            // InternalStoex.g:3200:2: rule__IntLiteral__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__Group__1"


    // $ANTLR start "rule__IntLiteral__Group__1__Impl"
    // InternalStoex.g:3206:1: rule__IntLiteral__Group__1__Impl : ( ( rule__IntLiteral__Group_1__0 )? ) ;
    public final void rule__IntLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3210:1: ( ( ( rule__IntLiteral__Group_1__0 )? ) )
            // InternalStoex.g:3211:1: ( ( rule__IntLiteral__Group_1__0 )? )
            {
            // InternalStoex.g:3211:1: ( ( rule__IntLiteral__Group_1__0 )? )
            // InternalStoex.g:3212:2: ( rule__IntLiteral__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getGroup_1()); 
            }
            // InternalStoex.g:3213:2: ( rule__IntLiteral__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_SQUARE_PAREN_L) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalStoex.g:3213:3: rule__IntLiteral__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__IntLiteral__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__Group__1__Impl"


    // $ANTLR start "rule__IntLiteral__Group_1__0"
    // InternalStoex.g:3222:1: rule__IntLiteral__Group_1__0 : rule__IntLiteral__Group_1__0__Impl rule__IntLiteral__Group_1__1 ;
    public final void rule__IntLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3226:1: ( rule__IntLiteral__Group_1__0__Impl rule__IntLiteral__Group_1__1 )
            // InternalStoex.g:3227:2: rule__IntLiteral__Group_1__0__Impl rule__IntLiteral__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__IntLiteral__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntLiteral__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__Group_1__0"


    // $ANTLR start "rule__IntLiteral__Group_1__0__Impl"
    // InternalStoex.g:3234:1: rule__IntLiteral__Group_1__0__Impl : ( RULE_SQUARE_PAREN_L ) ;
    public final void rule__IntLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3238:1: ( ( RULE_SQUARE_PAREN_L ) )
            // InternalStoex.g:3239:1: ( RULE_SQUARE_PAREN_L )
            {
            // InternalStoex.g:3239:1: ( RULE_SQUARE_PAREN_L )
            // InternalStoex.g:3240:2: RULE_SQUARE_PAREN_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getSQUARE_PAREN_LTerminalRuleCall_1_0()); 
            }
            match(input,RULE_SQUARE_PAREN_L,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralAccess().getSQUARE_PAREN_LTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__IntLiteral__Group_1__1"
    // InternalStoex.g:3249:1: rule__IntLiteral__Group_1__1 : rule__IntLiteral__Group_1__1__Impl rule__IntLiteral__Group_1__2 ;
    public final void rule__IntLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3253:1: ( rule__IntLiteral__Group_1__1__Impl rule__IntLiteral__Group_1__2 )
            // InternalStoex.g:3254:2: rule__IntLiteral__Group_1__1__Impl rule__IntLiteral__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__IntLiteral__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntLiteral__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__Group_1__1"


    // $ANTLR start "rule__IntLiteral__Group_1__1__Impl"
    // InternalStoex.g:3261:1: rule__IntLiteral__Group_1__1__Impl : ( ( rule__IntLiteral__UnitAssignment_1_1 ) ) ;
    public final void rule__IntLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3265:1: ( ( ( rule__IntLiteral__UnitAssignment_1_1 ) ) )
            // InternalStoex.g:3266:1: ( ( rule__IntLiteral__UnitAssignment_1_1 ) )
            {
            // InternalStoex.g:3266:1: ( ( rule__IntLiteral__UnitAssignment_1_1 ) )
            // InternalStoex.g:3267:2: ( rule__IntLiteral__UnitAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getUnitAssignment_1_1()); 
            }
            // InternalStoex.g:3268:2: ( rule__IntLiteral__UnitAssignment_1_1 )
            // InternalStoex.g:3268:3: rule__IntLiteral__UnitAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntLiteral__UnitAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralAccess().getUnitAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__IntLiteral__Group_1__2"
    // InternalStoex.g:3276:1: rule__IntLiteral__Group_1__2 : rule__IntLiteral__Group_1__2__Impl ;
    public final void rule__IntLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3280:1: ( rule__IntLiteral__Group_1__2__Impl )
            // InternalStoex.g:3281:2: rule__IntLiteral__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntLiteral__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__Group_1__2"


    // $ANTLR start "rule__IntLiteral__Group_1__2__Impl"
    // InternalStoex.g:3287:1: rule__IntLiteral__Group_1__2__Impl : ( RULE_SQUARE_PAREN_R ) ;
    public final void rule__IntLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3291:1: ( ( RULE_SQUARE_PAREN_R ) )
            // InternalStoex.g:3292:1: ( RULE_SQUARE_PAREN_R )
            {
            // InternalStoex.g:3292:1: ( RULE_SQUARE_PAREN_R )
            // InternalStoex.g:3293:2: RULE_SQUARE_PAREN_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getSQUARE_PAREN_RTerminalRuleCall_1_2()); 
            }
            match(input,RULE_SQUARE_PAREN_R,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralAccess().getSQUARE_PAREN_RTerminalRuleCall_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__Group_1__2__Impl"


    // $ANTLR start "rule__UnitDiv__Group__0"
    // InternalStoex.g:3303:1: rule__UnitDiv__Group__0 : rule__UnitDiv__Group__0__Impl rule__UnitDiv__Group__1 ;
    public final void rule__UnitDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3307:1: ( rule__UnitDiv__Group__0__Impl rule__UnitDiv__Group__1 )
            // InternalStoex.g:3308:2: rule__UnitDiv__Group__0__Impl rule__UnitDiv__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__UnitDiv__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitDiv__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitDiv__Group__0"


    // $ANTLR start "rule__UnitDiv__Group__0__Impl"
    // InternalStoex.g:3315:1: rule__UnitDiv__Group__0__Impl : ( ruleunitPow ) ;
    public final void rule__UnitDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3319:1: ( ( ruleunitPow ) )
            // InternalStoex.g:3320:1: ( ruleunitPow )
            {
            // InternalStoex.g:3320:1: ( ruleunitPow )
            // InternalStoex.g:3321:2: ruleunitPow
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitDivAccess().getUnitPowParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleunitPow();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitDivAccess().getUnitPowParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitDiv__Group__0__Impl"


    // $ANTLR start "rule__UnitDiv__Group__1"
    // InternalStoex.g:3330:1: rule__UnitDiv__Group__1 : rule__UnitDiv__Group__1__Impl ;
    public final void rule__UnitDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3334:1: ( rule__UnitDiv__Group__1__Impl )
            // InternalStoex.g:3335:2: rule__UnitDiv__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitDiv__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitDiv__Group__1"


    // $ANTLR start "rule__UnitDiv__Group__1__Impl"
    // InternalStoex.g:3341:1: rule__UnitDiv__Group__1__Impl : ( ( rule__UnitDiv__Group_1__0 )? ) ;
    public final void rule__UnitDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3345:1: ( ( ( rule__UnitDiv__Group_1__0 )? ) )
            // InternalStoex.g:3346:1: ( ( rule__UnitDiv__Group_1__0 )? )
            {
            // InternalStoex.g:3346:1: ( ( rule__UnitDiv__Group_1__0 )? )
            // InternalStoex.g:3347:2: ( rule__UnitDiv__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitDivAccess().getGroup_1()); 
            }
            // InternalStoex.g:3348:2: ( rule__UnitDiv__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalStoex.g:3348:3: rule__UnitDiv__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__UnitDiv__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitDivAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitDiv__Group__1__Impl"


    // $ANTLR start "rule__UnitDiv__Group_1__0"
    // InternalStoex.g:3357:1: rule__UnitDiv__Group_1__0 : rule__UnitDiv__Group_1__0__Impl rule__UnitDiv__Group_1__1 ;
    public final void rule__UnitDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3361:1: ( rule__UnitDiv__Group_1__0__Impl rule__UnitDiv__Group_1__1 )
            // InternalStoex.g:3362:2: rule__UnitDiv__Group_1__0__Impl rule__UnitDiv__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__UnitDiv__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitDiv__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitDiv__Group_1__0"


    // $ANTLR start "rule__UnitDiv__Group_1__0__Impl"
    // InternalStoex.g:3369:1: rule__UnitDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__UnitDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3373:1: ( ( () ) )
            // InternalStoex.g:3374:1: ( () )
            {
            // InternalStoex.g:3374:1: ( () )
            // InternalStoex.g:3375:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitDivAccess().getUnitDivisionDividendAction_1_0()); 
            }
            // InternalStoex.g:3376:2: ()
            // InternalStoex.g:3376:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitDivAccess().getUnitDivisionDividendAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitDiv__Group_1__0__Impl"


    // $ANTLR start "rule__UnitDiv__Group_1__1"
    // InternalStoex.g:3384:1: rule__UnitDiv__Group_1__1 : rule__UnitDiv__Group_1__1__Impl rule__UnitDiv__Group_1__2 ;
    public final void rule__UnitDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3388:1: ( rule__UnitDiv__Group_1__1__Impl rule__UnitDiv__Group_1__2 )
            // InternalStoex.g:3389:2: rule__UnitDiv__Group_1__1__Impl rule__UnitDiv__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__UnitDiv__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitDiv__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitDiv__Group_1__1"


    // $ANTLR start "rule__UnitDiv__Group_1__1__Impl"
    // InternalStoex.g:3396:1: rule__UnitDiv__Group_1__1__Impl : ( '/' ) ;
    public final void rule__UnitDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3400:1: ( ( '/' ) )
            // InternalStoex.g:3401:1: ( '/' )
            {
            // InternalStoex.g:3401:1: ( '/' )
            // InternalStoex.g:3402:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitDivAccess().getSolidusKeyword_1_1()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitDivAccess().getSolidusKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitDiv__Group_1__1__Impl"


    // $ANTLR start "rule__UnitDiv__Group_1__2"
    // InternalStoex.g:3411:1: rule__UnitDiv__Group_1__2 : rule__UnitDiv__Group_1__2__Impl ;
    public final void rule__UnitDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3415:1: ( rule__UnitDiv__Group_1__2__Impl )
            // InternalStoex.g:3416:2: rule__UnitDiv__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitDiv__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitDiv__Group_1__2"


    // $ANTLR start "rule__UnitDiv__Group_1__2__Impl"
    // InternalStoex.g:3422:1: rule__UnitDiv__Group_1__2__Impl : ( ( rule__UnitDiv__DivisorAssignment_1_2 ) ) ;
    public final void rule__UnitDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3426:1: ( ( ( rule__UnitDiv__DivisorAssignment_1_2 ) ) )
            // InternalStoex.g:3427:1: ( ( rule__UnitDiv__DivisorAssignment_1_2 ) )
            {
            // InternalStoex.g:3427:1: ( ( rule__UnitDiv__DivisorAssignment_1_2 ) )
            // InternalStoex.g:3428:2: ( rule__UnitDiv__DivisorAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitDivAccess().getDivisorAssignment_1_2()); 
            }
            // InternalStoex.g:3429:2: ( rule__UnitDiv__DivisorAssignment_1_2 )
            // InternalStoex.g:3429:3: rule__UnitDiv__DivisorAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitDiv__DivisorAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitDivAccess().getDivisorAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitDiv__Group_1__2__Impl"


    // $ANTLR start "rule__UnitMulti__Group__0"
    // InternalStoex.g:3438:1: rule__UnitMulti__Group__0 : rule__UnitMulti__Group__0__Impl rule__UnitMulti__Group__1 ;
    public final void rule__UnitMulti__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3442:1: ( rule__UnitMulti__Group__0__Impl rule__UnitMulti__Group__1 )
            // InternalStoex.g:3443:2: rule__UnitMulti__Group__0__Impl rule__UnitMulti__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__UnitMulti__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitMulti__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitMulti__Group__0"


    // $ANTLR start "rule__UnitMulti__Group__0__Impl"
    // InternalStoex.g:3450:1: rule__UnitMulti__Group__0__Impl : ( ruleunitPow ) ;
    public final void rule__UnitMulti__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3454:1: ( ( ruleunitPow ) )
            // InternalStoex.g:3455:1: ( ruleunitPow )
            {
            // InternalStoex.g:3455:1: ( ruleunitPow )
            // InternalStoex.g:3456:2: ruleunitPow
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitMultiAccess().getUnitPowParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleunitPow();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitMultiAccess().getUnitPowParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitMulti__Group__0__Impl"


    // $ANTLR start "rule__UnitMulti__Group__1"
    // InternalStoex.g:3465:1: rule__UnitMulti__Group__1 : rule__UnitMulti__Group__1__Impl ;
    public final void rule__UnitMulti__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3469:1: ( rule__UnitMulti__Group__1__Impl )
            // InternalStoex.g:3470:2: rule__UnitMulti__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitMulti__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitMulti__Group__1"


    // $ANTLR start "rule__UnitMulti__Group__1__Impl"
    // InternalStoex.g:3476:1: rule__UnitMulti__Group__1__Impl : ( ( rule__UnitMulti__Group_1__0 )* ) ;
    public final void rule__UnitMulti__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3480:1: ( ( ( rule__UnitMulti__Group_1__0 )* ) )
            // InternalStoex.g:3481:1: ( ( rule__UnitMulti__Group_1__0 )* )
            {
            // InternalStoex.g:3481:1: ( ( rule__UnitMulti__Group_1__0 )* )
            // InternalStoex.g:3482:2: ( rule__UnitMulti__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitMultiAccess().getGroup_1()); 
            }
            // InternalStoex.g:3483:2: ( rule__UnitMulti__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==42) ) {
                    int LA27_2 = input.LA(2);

                    if ( (synpred46_InternalStoex()) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalStoex.g:3483:3: rule__UnitMulti__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__UnitMulti__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitMultiAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitMulti__Group__1__Impl"


    // $ANTLR start "rule__UnitMulti__Group_1__0"
    // InternalStoex.g:3492:1: rule__UnitMulti__Group_1__0 : rule__UnitMulti__Group_1__0__Impl rule__UnitMulti__Group_1__1 ;
    public final void rule__UnitMulti__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3496:1: ( rule__UnitMulti__Group_1__0__Impl rule__UnitMulti__Group_1__1 )
            // InternalStoex.g:3497:2: rule__UnitMulti__Group_1__0__Impl rule__UnitMulti__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__UnitMulti__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitMulti__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitMulti__Group_1__0"


    // $ANTLR start "rule__UnitMulti__Group_1__0__Impl"
    // InternalStoex.g:3504:1: rule__UnitMulti__Group_1__0__Impl : ( () ) ;
    public final void rule__UnitMulti__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3508:1: ( ( () ) )
            // InternalStoex.g:3509:1: ( () )
            {
            // InternalStoex.g:3509:1: ( () )
            // InternalStoex.g:3510:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitMultiAccess().getUnitMultiplicationUnitsAction_1_0()); 
            }
            // InternalStoex.g:3511:2: ()
            // InternalStoex.g:3511:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitMultiAccess().getUnitMultiplicationUnitsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitMulti__Group_1__0__Impl"


    // $ANTLR start "rule__UnitMulti__Group_1__1"
    // InternalStoex.g:3519:1: rule__UnitMulti__Group_1__1 : rule__UnitMulti__Group_1__1__Impl rule__UnitMulti__Group_1__2 ;
    public final void rule__UnitMulti__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3523:1: ( rule__UnitMulti__Group_1__1__Impl rule__UnitMulti__Group_1__2 )
            // InternalStoex.g:3524:2: rule__UnitMulti__Group_1__1__Impl rule__UnitMulti__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__UnitMulti__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitMulti__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitMulti__Group_1__1"


    // $ANTLR start "rule__UnitMulti__Group_1__1__Impl"
    // InternalStoex.g:3531:1: rule__UnitMulti__Group_1__1__Impl : ( '*' ) ;
    public final void rule__UnitMulti__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3535:1: ( ( '*' ) )
            // InternalStoex.g:3536:1: ( '*' )
            {
            // InternalStoex.g:3536:1: ( '*' )
            // InternalStoex.g:3537:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitMultiAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitMultiAccess().getAsteriskKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitMulti__Group_1__1__Impl"


    // $ANTLR start "rule__UnitMulti__Group_1__2"
    // InternalStoex.g:3546:1: rule__UnitMulti__Group_1__2 : rule__UnitMulti__Group_1__2__Impl ;
    public final void rule__UnitMulti__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3550:1: ( rule__UnitMulti__Group_1__2__Impl )
            // InternalStoex.g:3551:2: rule__UnitMulti__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitMulti__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitMulti__Group_1__2"


    // $ANTLR start "rule__UnitMulti__Group_1__2__Impl"
    // InternalStoex.g:3557:1: rule__UnitMulti__Group_1__2__Impl : ( ( rule__UnitMulti__UnitsAssignment_1_2 ) ) ;
    public final void rule__UnitMulti__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3561:1: ( ( ( rule__UnitMulti__UnitsAssignment_1_2 ) ) )
            // InternalStoex.g:3562:1: ( ( rule__UnitMulti__UnitsAssignment_1_2 ) )
            {
            // InternalStoex.g:3562:1: ( ( rule__UnitMulti__UnitsAssignment_1_2 ) )
            // InternalStoex.g:3563:2: ( rule__UnitMulti__UnitsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitMultiAccess().getUnitsAssignment_1_2()); 
            }
            // InternalStoex.g:3564:2: ( rule__UnitMulti__UnitsAssignment_1_2 )
            // InternalStoex.g:3564:3: rule__UnitMulti__UnitsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitMulti__UnitsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitMultiAccess().getUnitsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitMulti__Group_1__2__Impl"


    // $ANTLR start "rule__UnitPow__Group__0"
    // InternalStoex.g:3573:1: rule__UnitPow__Group__0 : rule__UnitPow__Group__0__Impl rule__UnitPow__Group__1 ;
    public final void rule__UnitPow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3577:1: ( rule__UnitPow__Group__0__Impl rule__UnitPow__Group__1 )
            // InternalStoex.g:3578:2: rule__UnitPow__Group__0__Impl rule__UnitPow__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__UnitPow__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitPow__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitPow__Group__0"


    // $ANTLR start "rule__UnitPow__Group__0__Impl"
    // InternalStoex.g:3585:1: rule__UnitPow__Group__0__Impl : ( ( rule__UnitPow__Alternatives_0 ) ) ;
    public final void rule__UnitPow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3589:1: ( ( ( rule__UnitPow__Alternatives_0 ) ) )
            // InternalStoex.g:3590:1: ( ( rule__UnitPow__Alternatives_0 ) )
            {
            // InternalStoex.g:3590:1: ( ( rule__UnitPow__Alternatives_0 ) )
            // InternalStoex.g:3591:2: ( rule__UnitPow__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitPowAccess().getAlternatives_0()); 
            }
            // InternalStoex.g:3592:2: ( rule__UnitPow__Alternatives_0 )
            // InternalStoex.g:3592:3: rule__UnitPow__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitPow__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitPowAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitPow__Group__0__Impl"


    // $ANTLR start "rule__UnitPow__Group__1"
    // InternalStoex.g:3600:1: rule__UnitPow__Group__1 : rule__UnitPow__Group__1__Impl ;
    public final void rule__UnitPow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3604:1: ( rule__UnitPow__Group__1__Impl )
            // InternalStoex.g:3605:2: rule__UnitPow__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitPow__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitPow__Group__1"


    // $ANTLR start "rule__UnitPow__Group__1__Impl"
    // InternalStoex.g:3611:1: rule__UnitPow__Group__1__Impl : ( ( rule__UnitPow__Group_1__0 )* ) ;
    public final void rule__UnitPow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3615:1: ( ( ( rule__UnitPow__Group_1__0 )* ) )
            // InternalStoex.g:3616:1: ( ( rule__UnitPow__Group_1__0 )* )
            {
            // InternalStoex.g:3616:1: ( ( rule__UnitPow__Group_1__0 )* )
            // InternalStoex.g:3617:2: ( rule__UnitPow__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitPowAccess().getGroup_1()); 
            }
            // InternalStoex.g:3618:2: ( rule__UnitPow__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_POW) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalStoex.g:3618:3: rule__UnitPow__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    rule__UnitPow__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitPowAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitPow__Group__1__Impl"


    // $ANTLR start "rule__UnitPow__Group_0_1__0"
    // InternalStoex.g:3627:1: rule__UnitPow__Group_0_1__0 : rule__UnitPow__Group_0_1__0__Impl rule__UnitPow__Group_0_1__1 ;
    public final void rule__UnitPow__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3631:1: ( rule__UnitPow__Group_0_1__0__Impl rule__UnitPow__Group_0_1__1 )
            // InternalStoex.g:3632:2: rule__UnitPow__Group_0_1__0__Impl rule__UnitPow__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__UnitPow__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitPow__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitPow__Group_0_1__0"


    // $ANTLR start "rule__UnitPow__Group_0_1__0__Impl"
    // InternalStoex.g:3639:1: rule__UnitPow__Group_0_1__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__UnitPow__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3643:1: ( ( RULE_LPAREN ) )
            // InternalStoex.g:3644:1: ( RULE_LPAREN )
            {
            // InternalStoex.g:3644:1: ( RULE_LPAREN )
            // InternalStoex.g:3645:2: RULE_LPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitPowAccess().getLPARENTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_LPAREN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitPowAccess().getLPARENTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitPow__Group_0_1__0__Impl"


    // $ANTLR start "rule__UnitPow__Group_0_1__1"
    // InternalStoex.g:3654:1: rule__UnitPow__Group_0_1__1 : rule__UnitPow__Group_0_1__1__Impl rule__UnitPow__Group_0_1__2 ;
    public final void rule__UnitPow__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3658:1: ( rule__UnitPow__Group_0_1__1__Impl rule__UnitPow__Group_0_1__2 )
            // InternalStoex.g:3659:2: rule__UnitPow__Group_0_1__1__Impl rule__UnitPow__Group_0_1__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__UnitPow__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitPow__Group_0_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitPow__Group_0_1__1"


    // $ANTLR start "rule__UnitPow__Group_0_1__1__Impl"
    // InternalStoex.g:3666:1: rule__UnitPow__Group_0_1__1__Impl : ( ( rule__UnitPow__Alternatives_0_1_1 ) ) ;
    public final void rule__UnitPow__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3670:1: ( ( ( rule__UnitPow__Alternatives_0_1_1 ) ) )
            // InternalStoex.g:3671:1: ( ( rule__UnitPow__Alternatives_0_1_1 ) )
            {
            // InternalStoex.g:3671:1: ( ( rule__UnitPow__Alternatives_0_1_1 ) )
            // InternalStoex.g:3672:2: ( rule__UnitPow__Alternatives_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitPowAccess().getAlternatives_0_1_1()); 
            }
            // InternalStoex.g:3673:2: ( rule__UnitPow__Alternatives_0_1_1 )
            // InternalStoex.g:3673:3: rule__UnitPow__Alternatives_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitPow__Alternatives_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitPowAccess().getAlternatives_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitPow__Group_0_1__1__Impl"


    // $ANTLR start "rule__UnitPow__Group_0_1__2"
    // InternalStoex.g:3681:1: rule__UnitPow__Group_0_1__2 : rule__UnitPow__Group_0_1__2__Impl ;
    public final void rule__UnitPow__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3685:1: ( rule__UnitPow__Group_0_1__2__Impl )
            // InternalStoex.g:3686:2: rule__UnitPow__Group_0_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitPow__Group_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitPow__Group_0_1__2"


    // $ANTLR start "rule__UnitPow__Group_0_1__2__Impl"
    // InternalStoex.g:3692:1: rule__UnitPow__Group_0_1__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__UnitPow__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3696:1: ( ( RULE_RPAREN ) )
            // InternalStoex.g:3697:1: ( RULE_RPAREN )
            {
            // InternalStoex.g:3697:1: ( RULE_RPAREN )
            // InternalStoex.g:3698:2: RULE_RPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitPowAccess().getRPARENTerminalRuleCall_0_1_2()); 
            }
            match(input,RULE_RPAREN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitPowAccess().getRPARENTerminalRuleCall_0_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitPow__Group_0_1__2__Impl"


    // $ANTLR start "rule__UnitPow__Group_1__0"
    // InternalStoex.g:3708:1: rule__UnitPow__Group_1__0 : rule__UnitPow__Group_1__0__Impl rule__UnitPow__Group_1__1 ;
    public final void rule__UnitPow__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3712:1: ( rule__UnitPow__Group_1__0__Impl rule__UnitPow__Group_1__1 )
            // InternalStoex.g:3713:2: rule__UnitPow__Group_1__0__Impl rule__UnitPow__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__UnitPow__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitPow__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitPow__Group_1__0"


    // $ANTLR start "rule__UnitPow__Group_1__0__Impl"
    // InternalStoex.g:3720:1: rule__UnitPow__Group_1__0__Impl : ( () ) ;
    public final void rule__UnitPow__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3724:1: ( ( () ) )
            // InternalStoex.g:3725:1: ( () )
            {
            // InternalStoex.g:3725:1: ( () )
            // InternalStoex.g:3726:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitPowAccess().getUnitPowerUnitAction_1_0()); 
            }
            // InternalStoex.g:3727:2: ()
            // InternalStoex.g:3727:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitPowAccess().getUnitPowerUnitAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitPow__Group_1__0__Impl"


    // $ANTLR start "rule__UnitPow__Group_1__1"
    // InternalStoex.g:3735:1: rule__UnitPow__Group_1__1 : rule__UnitPow__Group_1__1__Impl rule__UnitPow__Group_1__2 ;
    public final void rule__UnitPow__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3739:1: ( rule__UnitPow__Group_1__1__Impl rule__UnitPow__Group_1__2 )
            // InternalStoex.g:3740:2: rule__UnitPow__Group_1__1__Impl rule__UnitPow__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__UnitPow__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitPow__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitPow__Group_1__1"


    // $ANTLR start "rule__UnitPow__Group_1__1__Impl"
    // InternalStoex.g:3747:1: rule__UnitPow__Group_1__1__Impl : ( RULE_POW ) ;
    public final void rule__UnitPow__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3751:1: ( ( RULE_POW ) )
            // InternalStoex.g:3752:1: ( RULE_POW )
            {
            // InternalStoex.g:3752:1: ( RULE_POW )
            // InternalStoex.g:3753:2: RULE_POW
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitPowAccess().getPOWTerminalRuleCall_1_1()); 
            }
            match(input,RULE_POW,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitPowAccess().getPOWTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitPow__Group_1__1__Impl"


    // $ANTLR start "rule__UnitPow__Group_1__2"
    // InternalStoex.g:3762:1: rule__UnitPow__Group_1__2 : rule__UnitPow__Group_1__2__Impl ;
    public final void rule__UnitPow__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3766:1: ( rule__UnitPow__Group_1__2__Impl )
            // InternalStoex.g:3767:2: rule__UnitPow__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitPow__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitPow__Group_1__2"


    // $ANTLR start "rule__UnitPow__Group_1__2__Impl"
    // InternalStoex.g:3773:1: rule__UnitPow__Group_1__2__Impl : ( ( rule__UnitPow__ExponentAssignment_1_2 ) ) ;
    public final void rule__UnitPow__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3777:1: ( ( ( rule__UnitPow__ExponentAssignment_1_2 ) ) )
            // InternalStoex.g:3778:1: ( ( rule__UnitPow__ExponentAssignment_1_2 ) )
            {
            // InternalStoex.g:3778:1: ( ( rule__UnitPow__ExponentAssignment_1_2 ) )
            // InternalStoex.g:3779:2: ( rule__UnitPow__ExponentAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitPowAccess().getExponentAssignment_1_2()); 
            }
            // InternalStoex.g:3780:2: ( rule__UnitPow__ExponentAssignment_1_2 )
            // InternalStoex.g:3780:3: rule__UnitPow__ExponentAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnitPow__ExponentAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitPowAccess().getExponentAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitPow__Group_1__2__Impl"


    // $ANTLR start "rule__BoxedPDF__Group__0"
    // InternalStoex.g:3789:1: rule__BoxedPDF__Group__0 : rule__BoxedPDF__Group__0__Impl rule__BoxedPDF__Group__1 ;
    public final void rule__BoxedPDF__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3793:1: ( rule__BoxedPDF__Group__0__Impl rule__BoxedPDF__Group__1 )
            // InternalStoex.g:3794:2: rule__BoxedPDF__Group__0__Impl rule__BoxedPDF__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__BoxedPDF__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoxedPDF__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedPDF__Group__0"


    // $ANTLR start "rule__BoxedPDF__Group__0__Impl"
    // InternalStoex.g:3801:1: rule__BoxedPDF__Group__0__Impl : ( RULE_DOUBLEPDF ) ;
    public final void rule__BoxedPDF__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3805:1: ( ( RULE_DOUBLEPDF ) )
            // InternalStoex.g:3806:1: ( RULE_DOUBLEPDF )
            {
            // InternalStoex.g:3806:1: ( RULE_DOUBLEPDF )
            // InternalStoex.g:3807:2: RULE_DOUBLEPDF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoxedPDFAccess().getDOUBLEPDFTerminalRuleCall_0()); 
            }
            match(input,RULE_DOUBLEPDF,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoxedPDFAccess().getDOUBLEPDFTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedPDF__Group__0__Impl"


    // $ANTLR start "rule__BoxedPDF__Group__1"
    // InternalStoex.g:3816:1: rule__BoxedPDF__Group__1 : rule__BoxedPDF__Group__1__Impl rule__BoxedPDF__Group__2 ;
    public final void rule__BoxedPDF__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3820:1: ( rule__BoxedPDF__Group__1__Impl rule__BoxedPDF__Group__2 )
            // InternalStoex.g:3821:2: rule__BoxedPDF__Group__1__Impl rule__BoxedPDF__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__BoxedPDF__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoxedPDF__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedPDF__Group__1"


    // $ANTLR start "rule__BoxedPDF__Group__1__Impl"
    // InternalStoex.g:3828:1: rule__BoxedPDF__Group__1__Impl : ( RULE_SQUARE_PAREN_L ) ;
    public final void rule__BoxedPDF__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3832:1: ( ( RULE_SQUARE_PAREN_L ) )
            // InternalStoex.g:3833:1: ( RULE_SQUARE_PAREN_L )
            {
            // InternalStoex.g:3833:1: ( RULE_SQUARE_PAREN_L )
            // InternalStoex.g:3834:2: RULE_SQUARE_PAREN_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoxedPDFAccess().getSQUARE_PAREN_LTerminalRuleCall_1()); 
            }
            match(input,RULE_SQUARE_PAREN_L,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoxedPDFAccess().getSQUARE_PAREN_LTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedPDF__Group__1__Impl"


    // $ANTLR start "rule__BoxedPDF__Group__2"
    // InternalStoex.g:3843:1: rule__BoxedPDF__Group__2 : rule__BoxedPDF__Group__2__Impl rule__BoxedPDF__Group__3 ;
    public final void rule__BoxedPDF__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3847:1: ( rule__BoxedPDF__Group__2__Impl rule__BoxedPDF__Group__3 )
            // InternalStoex.g:3848:2: rule__BoxedPDF__Group__2__Impl rule__BoxedPDF__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__BoxedPDF__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoxedPDF__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedPDF__Group__2"


    // $ANTLR start "rule__BoxedPDF__Group__2__Impl"
    // InternalStoex.g:3855:1: rule__BoxedPDF__Group__2__Impl : ( ( ( rule__BoxedPDF__SamplesAssignment_2 ) ) ( ( rule__BoxedPDF__SamplesAssignment_2 )* ) ) ;
    public final void rule__BoxedPDF__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3859:1: ( ( ( ( rule__BoxedPDF__SamplesAssignment_2 ) ) ( ( rule__BoxedPDF__SamplesAssignment_2 )* ) ) )
            // InternalStoex.g:3860:1: ( ( ( rule__BoxedPDF__SamplesAssignment_2 ) ) ( ( rule__BoxedPDF__SamplesAssignment_2 )* ) )
            {
            // InternalStoex.g:3860:1: ( ( ( rule__BoxedPDF__SamplesAssignment_2 ) ) ( ( rule__BoxedPDF__SamplesAssignment_2 )* ) )
            // InternalStoex.g:3861:2: ( ( rule__BoxedPDF__SamplesAssignment_2 ) ) ( ( rule__BoxedPDF__SamplesAssignment_2 )* )
            {
            // InternalStoex.g:3861:2: ( ( rule__BoxedPDF__SamplesAssignment_2 ) )
            // InternalStoex.g:3862:3: ( rule__BoxedPDF__SamplesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoxedPDFAccess().getSamplesAssignment_2()); 
            }
            // InternalStoex.g:3863:3: ( rule__BoxedPDF__SamplesAssignment_2 )
            // InternalStoex.g:3863:4: rule__BoxedPDF__SamplesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__BoxedPDF__SamplesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoxedPDFAccess().getSamplesAssignment_2()); 
            }

            }

            // InternalStoex.g:3866:2: ( ( rule__BoxedPDF__SamplesAssignment_2 )* )
            // InternalStoex.g:3867:3: ( rule__BoxedPDF__SamplesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoxedPDFAccess().getSamplesAssignment_2()); 
            }
            // InternalStoex.g:3868:3: ( rule__BoxedPDF__SamplesAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_LPAREN) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalStoex.g:3868:4: rule__BoxedPDF__SamplesAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_31);
            	    rule__BoxedPDF__SamplesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoxedPDFAccess().getSamplesAssignment_2()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedPDF__Group__2__Impl"


    // $ANTLR start "rule__BoxedPDF__Group__3"
    // InternalStoex.g:3877:1: rule__BoxedPDF__Group__3 : rule__BoxedPDF__Group__3__Impl rule__BoxedPDF__Group__4 ;
    public final void rule__BoxedPDF__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3881:1: ( rule__BoxedPDF__Group__3__Impl rule__BoxedPDF__Group__4 )
            // InternalStoex.g:3882:2: rule__BoxedPDF__Group__3__Impl rule__BoxedPDF__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__BoxedPDF__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoxedPDF__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedPDF__Group__3"


    // $ANTLR start "rule__BoxedPDF__Group__3__Impl"
    // InternalStoex.g:3889:1: rule__BoxedPDF__Group__3__Impl : ( RULE_SQUARE_PAREN_R ) ;
    public final void rule__BoxedPDF__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3893:1: ( ( RULE_SQUARE_PAREN_R ) )
            // InternalStoex.g:3894:1: ( RULE_SQUARE_PAREN_R )
            {
            // InternalStoex.g:3894:1: ( RULE_SQUARE_PAREN_R )
            // InternalStoex.g:3895:2: RULE_SQUARE_PAREN_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoxedPDFAccess().getSQUARE_PAREN_RTerminalRuleCall_3()); 
            }
            match(input,RULE_SQUARE_PAREN_R,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoxedPDFAccess().getSQUARE_PAREN_RTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedPDF__Group__3__Impl"


    // $ANTLR start "rule__BoxedPDF__Group__4"
    // InternalStoex.g:3904:1: rule__BoxedPDF__Group__4 : rule__BoxedPDF__Group__4__Impl ;
    public final void rule__BoxedPDF__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3908:1: ( rule__BoxedPDF__Group__4__Impl )
            // InternalStoex.g:3909:2: rule__BoxedPDF__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoxedPDF__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedPDF__Group__4"


    // $ANTLR start "rule__BoxedPDF__Group__4__Impl"
    // InternalStoex.g:3915:1: rule__BoxedPDF__Group__4__Impl : ( ( rule__BoxedPDF__Group_4__0 )? ) ;
    public final void rule__BoxedPDF__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3919:1: ( ( ( rule__BoxedPDF__Group_4__0 )? ) )
            // InternalStoex.g:3920:1: ( ( rule__BoxedPDF__Group_4__0 )? )
            {
            // InternalStoex.g:3920:1: ( ( rule__BoxedPDF__Group_4__0 )? )
            // InternalStoex.g:3921:2: ( rule__BoxedPDF__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoxedPDFAccess().getGroup_4()); 
            }
            // InternalStoex.g:3922:2: ( rule__BoxedPDF__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_SQUARE_PAREN_L) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalStoex.g:3922:3: rule__BoxedPDF__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__BoxedPDF__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoxedPDFAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedPDF__Group__4__Impl"


    // $ANTLR start "rule__BoxedPDF__Group_4__0"
    // InternalStoex.g:3931:1: rule__BoxedPDF__Group_4__0 : rule__BoxedPDF__Group_4__0__Impl rule__BoxedPDF__Group_4__1 ;
    public final void rule__BoxedPDF__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3935:1: ( rule__BoxedPDF__Group_4__0__Impl rule__BoxedPDF__Group_4__1 )
            // InternalStoex.g:3936:2: rule__BoxedPDF__Group_4__0__Impl rule__BoxedPDF__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__BoxedPDF__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoxedPDF__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedPDF__Group_4__0"


    // $ANTLR start "rule__BoxedPDF__Group_4__0__Impl"
    // InternalStoex.g:3943:1: rule__BoxedPDF__Group_4__0__Impl : ( RULE_SQUARE_PAREN_L ) ;
    public final void rule__BoxedPDF__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3947:1: ( ( RULE_SQUARE_PAREN_L ) )
            // InternalStoex.g:3948:1: ( RULE_SQUARE_PAREN_L )
            {
            // InternalStoex.g:3948:1: ( RULE_SQUARE_PAREN_L )
            // InternalStoex.g:3949:2: RULE_SQUARE_PAREN_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoxedPDFAccess().getSQUARE_PAREN_LTerminalRuleCall_4_0()); 
            }
            match(input,RULE_SQUARE_PAREN_L,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoxedPDFAccess().getSQUARE_PAREN_LTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedPDF__Group_4__0__Impl"


    // $ANTLR start "rule__BoxedPDF__Group_4__1"
    // InternalStoex.g:3958:1: rule__BoxedPDF__Group_4__1 : rule__BoxedPDF__Group_4__1__Impl rule__BoxedPDF__Group_4__2 ;
    public final void rule__BoxedPDF__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3962:1: ( rule__BoxedPDF__Group_4__1__Impl rule__BoxedPDF__Group_4__2 )
            // InternalStoex.g:3963:2: rule__BoxedPDF__Group_4__1__Impl rule__BoxedPDF__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__BoxedPDF__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoxedPDF__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedPDF__Group_4__1"


    // $ANTLR start "rule__BoxedPDF__Group_4__1__Impl"
    // InternalStoex.g:3970:1: rule__BoxedPDF__Group_4__1__Impl : ( ( rule__BoxedPDF__UnitAssignment_4_1 ) ) ;
    public final void rule__BoxedPDF__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3974:1: ( ( ( rule__BoxedPDF__UnitAssignment_4_1 ) ) )
            // InternalStoex.g:3975:1: ( ( rule__BoxedPDF__UnitAssignment_4_1 ) )
            {
            // InternalStoex.g:3975:1: ( ( rule__BoxedPDF__UnitAssignment_4_1 ) )
            // InternalStoex.g:3976:2: ( rule__BoxedPDF__UnitAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoxedPDFAccess().getUnitAssignment_4_1()); 
            }
            // InternalStoex.g:3977:2: ( rule__BoxedPDF__UnitAssignment_4_1 )
            // InternalStoex.g:3977:3: rule__BoxedPDF__UnitAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoxedPDF__UnitAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoxedPDFAccess().getUnitAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedPDF__Group_4__1__Impl"


    // $ANTLR start "rule__BoxedPDF__Group_4__2"
    // InternalStoex.g:3985:1: rule__BoxedPDF__Group_4__2 : rule__BoxedPDF__Group_4__2__Impl ;
    public final void rule__BoxedPDF__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3989:1: ( rule__BoxedPDF__Group_4__2__Impl )
            // InternalStoex.g:3990:2: rule__BoxedPDF__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoxedPDF__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedPDF__Group_4__2"


    // $ANTLR start "rule__BoxedPDF__Group_4__2__Impl"
    // InternalStoex.g:3996:1: rule__BoxedPDF__Group_4__2__Impl : ( RULE_SQUARE_PAREN_R ) ;
    public final void rule__BoxedPDF__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4000:1: ( ( RULE_SQUARE_PAREN_R ) )
            // InternalStoex.g:4001:1: ( RULE_SQUARE_PAREN_R )
            {
            // InternalStoex.g:4001:1: ( RULE_SQUARE_PAREN_R )
            // InternalStoex.g:4002:2: RULE_SQUARE_PAREN_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoxedPDFAccess().getSQUARE_PAREN_RTerminalRuleCall_4_2()); 
            }
            match(input,RULE_SQUARE_PAREN_R,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoxedPDFAccess().getSQUARE_PAREN_RTerminalRuleCall_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedPDF__Group_4__2__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_0__0"
    // InternalStoex.g:4012:1: rule__ProbabilityMassFunction__Group_0__0 : rule__ProbabilityMassFunction__Group_0__0__Impl rule__ProbabilityMassFunction__Group_0__1 ;
    public final void rule__ProbabilityMassFunction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4016:1: ( rule__ProbabilityMassFunction__Group_0__0__Impl rule__ProbabilityMassFunction__Group_0__1 )
            // InternalStoex.g:4017:2: rule__ProbabilityMassFunction__Group_0__0__Impl rule__ProbabilityMassFunction__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__ProbabilityMassFunction__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_0__0"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_0__0__Impl"
    // InternalStoex.g:4024:1: rule__ProbabilityMassFunction__Group_0__0__Impl : ( RULE_INTPMF ) ;
    public final void rule__ProbabilityMassFunction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4028:1: ( ( RULE_INTPMF ) )
            // InternalStoex.g:4029:1: ( RULE_INTPMF )
            {
            // InternalStoex.g:4029:1: ( RULE_INTPMF )
            // InternalStoex.g:4030:2: RULE_INTPMF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getINTPMFTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INTPMF,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getINTPMFTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_0__0__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_0__1"
    // InternalStoex.g:4039:1: rule__ProbabilityMassFunction__Group_0__1 : rule__ProbabilityMassFunction__Group_0__1__Impl rule__ProbabilityMassFunction__Group_0__2 ;
    public final void rule__ProbabilityMassFunction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4043:1: ( rule__ProbabilityMassFunction__Group_0__1__Impl rule__ProbabilityMassFunction__Group_0__2 )
            // InternalStoex.g:4044:2: rule__ProbabilityMassFunction__Group_0__1__Impl rule__ProbabilityMassFunction__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__ProbabilityMassFunction__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_0__1"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_0__1__Impl"
    // InternalStoex.g:4051:1: rule__ProbabilityMassFunction__Group_0__1__Impl : ( RULE_SQUARE_PAREN_L ) ;
    public final void rule__ProbabilityMassFunction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4055:1: ( ( RULE_SQUARE_PAREN_L ) )
            // InternalStoex.g:4056:1: ( RULE_SQUARE_PAREN_L )
            {
            // InternalStoex.g:4056:1: ( RULE_SQUARE_PAREN_L )
            // InternalStoex.g:4057:2: RULE_SQUARE_PAREN_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_LTerminalRuleCall_0_1()); 
            }
            match(input,RULE_SQUARE_PAREN_L,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_LTerminalRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_0__1__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_0__2"
    // InternalStoex.g:4066:1: rule__ProbabilityMassFunction__Group_0__2 : rule__ProbabilityMassFunction__Group_0__2__Impl rule__ProbabilityMassFunction__Group_0__3 ;
    public final void rule__ProbabilityMassFunction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4070:1: ( rule__ProbabilityMassFunction__Group_0__2__Impl rule__ProbabilityMassFunction__Group_0__3 )
            // InternalStoex.g:4071:2: rule__ProbabilityMassFunction__Group_0__2__Impl rule__ProbabilityMassFunction__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__ProbabilityMassFunction__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_0__2"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_0__2__Impl"
    // InternalStoex.g:4078:1: rule__ProbabilityMassFunction__Group_0__2__Impl : ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 )* ) ) ;
    public final void rule__ProbabilityMassFunction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4082:1: ( ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 )* ) ) )
            // InternalStoex.g:4083:1: ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 )* ) )
            {
            // InternalStoex.g:4083:1: ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 )* ) )
            // InternalStoex.g:4084:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 )* )
            {
            // InternalStoex.g:4084:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 ) )
            // InternalStoex.g:4085:3: ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_0_2()); 
            }
            // InternalStoex.g:4086:3: ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 )
            // InternalStoex.g:4086:4: rule__ProbabilityMassFunction__SamplesAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__ProbabilityMassFunction__SamplesAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_0_2()); 
            }

            }

            // InternalStoex.g:4089:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 )* )
            // InternalStoex.g:4090:3: ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_0_2()); 
            }
            // InternalStoex.g:4091:3: ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_LPAREN) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalStoex.g:4091:4: rule__ProbabilityMassFunction__SamplesAssignment_0_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_31);
            	    rule__ProbabilityMassFunction__SamplesAssignment_0_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_0_2()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_0__2__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_0__3"
    // InternalStoex.g:4100:1: rule__ProbabilityMassFunction__Group_0__3 : rule__ProbabilityMassFunction__Group_0__3__Impl rule__ProbabilityMassFunction__Group_0__4 ;
    public final void rule__ProbabilityMassFunction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4104:1: ( rule__ProbabilityMassFunction__Group_0__3__Impl rule__ProbabilityMassFunction__Group_0__4 )
            // InternalStoex.g:4105:2: rule__ProbabilityMassFunction__Group_0__3__Impl rule__ProbabilityMassFunction__Group_0__4
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__ProbabilityMassFunction__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_0__3"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_0__3__Impl"
    // InternalStoex.g:4112:1: rule__ProbabilityMassFunction__Group_0__3__Impl : ( RULE_SQUARE_PAREN_R ) ;
    public final void rule__ProbabilityMassFunction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4116:1: ( ( RULE_SQUARE_PAREN_R ) )
            // InternalStoex.g:4117:1: ( RULE_SQUARE_PAREN_R )
            {
            // InternalStoex.g:4117:1: ( RULE_SQUARE_PAREN_R )
            // InternalStoex.g:4118:2: RULE_SQUARE_PAREN_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_RTerminalRuleCall_0_3()); 
            }
            match(input,RULE_SQUARE_PAREN_R,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_RTerminalRuleCall_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_0__3__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_0__4"
    // InternalStoex.g:4127:1: rule__ProbabilityMassFunction__Group_0__4 : rule__ProbabilityMassFunction__Group_0__4__Impl ;
    public final void rule__ProbabilityMassFunction__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4131:1: ( rule__ProbabilityMassFunction__Group_0__4__Impl )
            // InternalStoex.g:4132:2: rule__ProbabilityMassFunction__Group_0__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_0__4"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_0__4__Impl"
    // InternalStoex.g:4138:1: rule__ProbabilityMassFunction__Group_0__4__Impl : ( ( rule__ProbabilityMassFunction__Group_0_4__0 )? ) ;
    public final void rule__ProbabilityMassFunction__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4142:1: ( ( ( rule__ProbabilityMassFunction__Group_0_4__0 )? ) )
            // InternalStoex.g:4143:1: ( ( rule__ProbabilityMassFunction__Group_0_4__0 )? )
            {
            // InternalStoex.g:4143:1: ( ( rule__ProbabilityMassFunction__Group_0_4__0 )? )
            // InternalStoex.g:4144:2: ( rule__ProbabilityMassFunction__Group_0_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getGroup_0_4()); 
            }
            // InternalStoex.g:4145:2: ( rule__ProbabilityMassFunction__Group_0_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_SQUARE_PAREN_L) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalStoex.g:4145:3: rule__ProbabilityMassFunction__Group_0_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ProbabilityMassFunction__Group_0_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getGroup_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_0__4__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_0_4__0"
    // InternalStoex.g:4154:1: rule__ProbabilityMassFunction__Group_0_4__0 : rule__ProbabilityMassFunction__Group_0_4__0__Impl rule__ProbabilityMassFunction__Group_0_4__1 ;
    public final void rule__ProbabilityMassFunction__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4158:1: ( rule__ProbabilityMassFunction__Group_0_4__0__Impl rule__ProbabilityMassFunction__Group_0_4__1 )
            // InternalStoex.g:4159:2: rule__ProbabilityMassFunction__Group_0_4__0__Impl rule__ProbabilityMassFunction__Group_0_4__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__ProbabilityMassFunction__Group_0_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_0_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_0_4__0"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_0_4__0__Impl"
    // InternalStoex.g:4166:1: rule__ProbabilityMassFunction__Group_0_4__0__Impl : ( RULE_SQUARE_PAREN_L ) ;
    public final void rule__ProbabilityMassFunction__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4170:1: ( ( RULE_SQUARE_PAREN_L ) )
            // InternalStoex.g:4171:1: ( RULE_SQUARE_PAREN_L )
            {
            // InternalStoex.g:4171:1: ( RULE_SQUARE_PAREN_L )
            // InternalStoex.g:4172:2: RULE_SQUARE_PAREN_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_LTerminalRuleCall_0_4_0()); 
            }
            match(input,RULE_SQUARE_PAREN_L,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_LTerminalRuleCall_0_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_0_4__0__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_0_4__1"
    // InternalStoex.g:4181:1: rule__ProbabilityMassFunction__Group_0_4__1 : rule__ProbabilityMassFunction__Group_0_4__1__Impl rule__ProbabilityMassFunction__Group_0_4__2 ;
    public final void rule__ProbabilityMassFunction__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4185:1: ( rule__ProbabilityMassFunction__Group_0_4__1__Impl rule__ProbabilityMassFunction__Group_0_4__2 )
            // InternalStoex.g:4186:2: rule__ProbabilityMassFunction__Group_0_4__1__Impl rule__ProbabilityMassFunction__Group_0_4__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__ProbabilityMassFunction__Group_0_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_0_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_0_4__1"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_0_4__1__Impl"
    // InternalStoex.g:4193:1: rule__ProbabilityMassFunction__Group_0_4__1__Impl : ( ( rule__ProbabilityMassFunction__UnitAssignment_0_4_1 ) ) ;
    public final void rule__ProbabilityMassFunction__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4197:1: ( ( ( rule__ProbabilityMassFunction__UnitAssignment_0_4_1 ) ) )
            // InternalStoex.g:4198:1: ( ( rule__ProbabilityMassFunction__UnitAssignment_0_4_1 ) )
            {
            // InternalStoex.g:4198:1: ( ( rule__ProbabilityMassFunction__UnitAssignment_0_4_1 ) )
            // InternalStoex.g:4199:2: ( rule__ProbabilityMassFunction__UnitAssignment_0_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getUnitAssignment_0_4_1()); 
            }
            // InternalStoex.g:4200:2: ( rule__ProbabilityMassFunction__UnitAssignment_0_4_1 )
            // InternalStoex.g:4200:3: rule__ProbabilityMassFunction__UnitAssignment_0_4_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__UnitAssignment_0_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getUnitAssignment_0_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_0_4__1__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_0_4__2"
    // InternalStoex.g:4208:1: rule__ProbabilityMassFunction__Group_0_4__2 : rule__ProbabilityMassFunction__Group_0_4__2__Impl ;
    public final void rule__ProbabilityMassFunction__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4212:1: ( rule__ProbabilityMassFunction__Group_0_4__2__Impl )
            // InternalStoex.g:4213:2: rule__ProbabilityMassFunction__Group_0_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_0_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_0_4__2"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_0_4__2__Impl"
    // InternalStoex.g:4219:1: rule__ProbabilityMassFunction__Group_0_4__2__Impl : ( RULE_SQUARE_PAREN_R ) ;
    public final void rule__ProbabilityMassFunction__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4223:1: ( ( RULE_SQUARE_PAREN_R ) )
            // InternalStoex.g:4224:1: ( RULE_SQUARE_PAREN_R )
            {
            // InternalStoex.g:4224:1: ( RULE_SQUARE_PAREN_R )
            // InternalStoex.g:4225:2: RULE_SQUARE_PAREN_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_RTerminalRuleCall_0_4_2()); 
            }
            match(input,RULE_SQUARE_PAREN_R,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_RTerminalRuleCall_0_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_0_4__2__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_1__0"
    // InternalStoex.g:4235:1: rule__ProbabilityMassFunction__Group_1__0 : rule__ProbabilityMassFunction__Group_1__0__Impl rule__ProbabilityMassFunction__Group_1__1 ;
    public final void rule__ProbabilityMassFunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4239:1: ( rule__ProbabilityMassFunction__Group_1__0__Impl rule__ProbabilityMassFunction__Group_1__1 )
            // InternalStoex.g:4240:2: rule__ProbabilityMassFunction__Group_1__0__Impl rule__ProbabilityMassFunction__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__ProbabilityMassFunction__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_1__0"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_1__0__Impl"
    // InternalStoex.g:4247:1: rule__ProbabilityMassFunction__Group_1__0__Impl : ( RULE_DOUBLEPMF ) ;
    public final void rule__ProbabilityMassFunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4251:1: ( ( RULE_DOUBLEPMF ) )
            // InternalStoex.g:4252:1: ( RULE_DOUBLEPMF )
            {
            // InternalStoex.g:4252:1: ( RULE_DOUBLEPMF )
            // InternalStoex.g:4253:2: RULE_DOUBLEPMF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getDOUBLEPMFTerminalRuleCall_1_0()); 
            }
            match(input,RULE_DOUBLEPMF,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getDOUBLEPMFTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_1__0__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_1__1"
    // InternalStoex.g:4262:1: rule__ProbabilityMassFunction__Group_1__1 : rule__ProbabilityMassFunction__Group_1__1__Impl rule__ProbabilityMassFunction__Group_1__2 ;
    public final void rule__ProbabilityMassFunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4266:1: ( rule__ProbabilityMassFunction__Group_1__1__Impl rule__ProbabilityMassFunction__Group_1__2 )
            // InternalStoex.g:4267:2: rule__ProbabilityMassFunction__Group_1__1__Impl rule__ProbabilityMassFunction__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__ProbabilityMassFunction__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_1__1"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_1__1__Impl"
    // InternalStoex.g:4274:1: rule__ProbabilityMassFunction__Group_1__1__Impl : ( RULE_SQUARE_PAREN_L ) ;
    public final void rule__ProbabilityMassFunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4278:1: ( ( RULE_SQUARE_PAREN_L ) )
            // InternalStoex.g:4279:1: ( RULE_SQUARE_PAREN_L )
            {
            // InternalStoex.g:4279:1: ( RULE_SQUARE_PAREN_L )
            // InternalStoex.g:4280:2: RULE_SQUARE_PAREN_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_LTerminalRuleCall_1_1()); 
            }
            match(input,RULE_SQUARE_PAREN_L,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_LTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_1__1__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_1__2"
    // InternalStoex.g:4289:1: rule__ProbabilityMassFunction__Group_1__2 : rule__ProbabilityMassFunction__Group_1__2__Impl rule__ProbabilityMassFunction__Group_1__3 ;
    public final void rule__ProbabilityMassFunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4293:1: ( rule__ProbabilityMassFunction__Group_1__2__Impl rule__ProbabilityMassFunction__Group_1__3 )
            // InternalStoex.g:4294:2: rule__ProbabilityMassFunction__Group_1__2__Impl rule__ProbabilityMassFunction__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__ProbabilityMassFunction__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_1__2"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_1__2__Impl"
    // InternalStoex.g:4301:1: rule__ProbabilityMassFunction__Group_1__2__Impl : ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 )* ) ) ;
    public final void rule__ProbabilityMassFunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4305:1: ( ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 )* ) ) )
            // InternalStoex.g:4306:1: ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 )* ) )
            {
            // InternalStoex.g:4306:1: ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 )* ) )
            // InternalStoex.g:4307:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 )* )
            {
            // InternalStoex.g:4307:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 ) )
            // InternalStoex.g:4308:3: ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_1_2()); 
            }
            // InternalStoex.g:4309:3: ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 )
            // InternalStoex.g:4309:4: rule__ProbabilityMassFunction__SamplesAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__ProbabilityMassFunction__SamplesAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_1_2()); 
            }

            }

            // InternalStoex.g:4312:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 )* )
            // InternalStoex.g:4313:3: ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_1_2()); 
            }
            // InternalStoex.g:4314:3: ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_LPAREN) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalStoex.g:4314:4: rule__ProbabilityMassFunction__SamplesAssignment_1_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_31);
            	    rule__ProbabilityMassFunction__SamplesAssignment_1_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_1_2()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_1__2__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_1__3"
    // InternalStoex.g:4323:1: rule__ProbabilityMassFunction__Group_1__3 : rule__ProbabilityMassFunction__Group_1__3__Impl rule__ProbabilityMassFunction__Group_1__4 ;
    public final void rule__ProbabilityMassFunction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4327:1: ( rule__ProbabilityMassFunction__Group_1__3__Impl rule__ProbabilityMassFunction__Group_1__4 )
            // InternalStoex.g:4328:2: rule__ProbabilityMassFunction__Group_1__3__Impl rule__ProbabilityMassFunction__Group_1__4
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__ProbabilityMassFunction__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_1__3"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_1__3__Impl"
    // InternalStoex.g:4335:1: rule__ProbabilityMassFunction__Group_1__3__Impl : ( RULE_SQUARE_PAREN_R ) ;
    public final void rule__ProbabilityMassFunction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4339:1: ( ( RULE_SQUARE_PAREN_R ) )
            // InternalStoex.g:4340:1: ( RULE_SQUARE_PAREN_R )
            {
            // InternalStoex.g:4340:1: ( RULE_SQUARE_PAREN_R )
            // InternalStoex.g:4341:2: RULE_SQUARE_PAREN_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_RTerminalRuleCall_1_3()); 
            }
            match(input,RULE_SQUARE_PAREN_R,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_RTerminalRuleCall_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_1__3__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_1__4"
    // InternalStoex.g:4350:1: rule__ProbabilityMassFunction__Group_1__4 : rule__ProbabilityMassFunction__Group_1__4__Impl ;
    public final void rule__ProbabilityMassFunction__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4354:1: ( rule__ProbabilityMassFunction__Group_1__4__Impl )
            // InternalStoex.g:4355:2: rule__ProbabilityMassFunction__Group_1__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_1__4"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_1__4__Impl"
    // InternalStoex.g:4361:1: rule__ProbabilityMassFunction__Group_1__4__Impl : ( ( rule__ProbabilityMassFunction__Group_1_4__0 )? ) ;
    public final void rule__ProbabilityMassFunction__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4365:1: ( ( ( rule__ProbabilityMassFunction__Group_1_4__0 )? ) )
            // InternalStoex.g:4366:1: ( ( rule__ProbabilityMassFunction__Group_1_4__0 )? )
            {
            // InternalStoex.g:4366:1: ( ( rule__ProbabilityMassFunction__Group_1_4__0 )? )
            // InternalStoex.g:4367:2: ( rule__ProbabilityMassFunction__Group_1_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getGroup_1_4()); 
            }
            // InternalStoex.g:4368:2: ( rule__ProbabilityMassFunction__Group_1_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_SQUARE_PAREN_L) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalStoex.g:4368:3: rule__ProbabilityMassFunction__Group_1_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ProbabilityMassFunction__Group_1_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getGroup_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_1__4__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_1_4__0"
    // InternalStoex.g:4377:1: rule__ProbabilityMassFunction__Group_1_4__0 : rule__ProbabilityMassFunction__Group_1_4__0__Impl rule__ProbabilityMassFunction__Group_1_4__1 ;
    public final void rule__ProbabilityMassFunction__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4381:1: ( rule__ProbabilityMassFunction__Group_1_4__0__Impl rule__ProbabilityMassFunction__Group_1_4__1 )
            // InternalStoex.g:4382:2: rule__ProbabilityMassFunction__Group_1_4__0__Impl rule__ProbabilityMassFunction__Group_1_4__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__ProbabilityMassFunction__Group_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_1_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_1_4__0"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_1_4__0__Impl"
    // InternalStoex.g:4389:1: rule__ProbabilityMassFunction__Group_1_4__0__Impl : ( RULE_SQUARE_PAREN_L ) ;
    public final void rule__ProbabilityMassFunction__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4393:1: ( ( RULE_SQUARE_PAREN_L ) )
            // InternalStoex.g:4394:1: ( RULE_SQUARE_PAREN_L )
            {
            // InternalStoex.g:4394:1: ( RULE_SQUARE_PAREN_L )
            // InternalStoex.g:4395:2: RULE_SQUARE_PAREN_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_LTerminalRuleCall_1_4_0()); 
            }
            match(input,RULE_SQUARE_PAREN_L,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_LTerminalRuleCall_1_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_1_4__0__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_1_4__1"
    // InternalStoex.g:4404:1: rule__ProbabilityMassFunction__Group_1_4__1 : rule__ProbabilityMassFunction__Group_1_4__1__Impl rule__ProbabilityMassFunction__Group_1_4__2 ;
    public final void rule__ProbabilityMassFunction__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4408:1: ( rule__ProbabilityMassFunction__Group_1_4__1__Impl rule__ProbabilityMassFunction__Group_1_4__2 )
            // InternalStoex.g:4409:2: rule__ProbabilityMassFunction__Group_1_4__1__Impl rule__ProbabilityMassFunction__Group_1_4__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__ProbabilityMassFunction__Group_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_1_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_1_4__1"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_1_4__1__Impl"
    // InternalStoex.g:4416:1: rule__ProbabilityMassFunction__Group_1_4__1__Impl : ( ( rule__ProbabilityMassFunction__UnitAssignment_1_4_1 ) ) ;
    public final void rule__ProbabilityMassFunction__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4420:1: ( ( ( rule__ProbabilityMassFunction__UnitAssignment_1_4_1 ) ) )
            // InternalStoex.g:4421:1: ( ( rule__ProbabilityMassFunction__UnitAssignment_1_4_1 ) )
            {
            // InternalStoex.g:4421:1: ( ( rule__ProbabilityMassFunction__UnitAssignment_1_4_1 ) )
            // InternalStoex.g:4422:2: ( rule__ProbabilityMassFunction__UnitAssignment_1_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getUnitAssignment_1_4_1()); 
            }
            // InternalStoex.g:4423:2: ( rule__ProbabilityMassFunction__UnitAssignment_1_4_1 )
            // InternalStoex.g:4423:3: rule__ProbabilityMassFunction__UnitAssignment_1_4_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__UnitAssignment_1_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getUnitAssignment_1_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_1_4__1__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_1_4__2"
    // InternalStoex.g:4431:1: rule__ProbabilityMassFunction__Group_1_4__2 : rule__ProbabilityMassFunction__Group_1_4__2__Impl ;
    public final void rule__ProbabilityMassFunction__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4435:1: ( rule__ProbabilityMassFunction__Group_1_4__2__Impl )
            // InternalStoex.g:4436:2: rule__ProbabilityMassFunction__Group_1_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_1_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_1_4__2"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_1_4__2__Impl"
    // InternalStoex.g:4442:1: rule__ProbabilityMassFunction__Group_1_4__2__Impl : ( RULE_SQUARE_PAREN_R ) ;
    public final void rule__ProbabilityMassFunction__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4446:1: ( ( RULE_SQUARE_PAREN_R ) )
            // InternalStoex.g:4447:1: ( RULE_SQUARE_PAREN_R )
            {
            // InternalStoex.g:4447:1: ( RULE_SQUARE_PAREN_R )
            // InternalStoex.g:4448:2: RULE_SQUARE_PAREN_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_RTerminalRuleCall_1_4_2()); 
            }
            match(input,RULE_SQUARE_PAREN_R,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_RTerminalRuleCall_1_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_1_4__2__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_2__0"
    // InternalStoex.g:4458:1: rule__ProbabilityMassFunction__Group_2__0 : rule__ProbabilityMassFunction__Group_2__0__Impl rule__ProbabilityMassFunction__Group_2__1 ;
    public final void rule__ProbabilityMassFunction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4462:1: ( rule__ProbabilityMassFunction__Group_2__0__Impl rule__ProbabilityMassFunction__Group_2__1 )
            // InternalStoex.g:4463:2: rule__ProbabilityMassFunction__Group_2__0__Impl rule__ProbabilityMassFunction__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__ProbabilityMassFunction__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_2__0"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_2__0__Impl"
    // InternalStoex.g:4470:1: rule__ProbabilityMassFunction__Group_2__0__Impl : ( RULE_ENUMPMF ) ;
    public final void rule__ProbabilityMassFunction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4474:1: ( ( RULE_ENUMPMF ) )
            // InternalStoex.g:4475:1: ( RULE_ENUMPMF )
            {
            // InternalStoex.g:4475:1: ( RULE_ENUMPMF )
            // InternalStoex.g:4476:2: RULE_ENUMPMF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getENUMPMFTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ENUMPMF,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getENUMPMFTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_2__0__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_2__1"
    // InternalStoex.g:4485:1: rule__ProbabilityMassFunction__Group_2__1 : rule__ProbabilityMassFunction__Group_2__1__Impl rule__ProbabilityMassFunction__Group_2__2 ;
    public final void rule__ProbabilityMassFunction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4489:1: ( rule__ProbabilityMassFunction__Group_2__1__Impl rule__ProbabilityMassFunction__Group_2__2 )
            // InternalStoex.g:4490:2: rule__ProbabilityMassFunction__Group_2__1__Impl rule__ProbabilityMassFunction__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__ProbabilityMassFunction__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_2__1"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_2__1__Impl"
    // InternalStoex.g:4497:1: rule__ProbabilityMassFunction__Group_2__1__Impl : ( ( rule__ProbabilityMassFunction__Group_2_1__0 )? ) ;
    public final void rule__ProbabilityMassFunction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4501:1: ( ( ( rule__ProbabilityMassFunction__Group_2_1__0 )? ) )
            // InternalStoex.g:4502:1: ( ( rule__ProbabilityMassFunction__Group_2_1__0 )? )
            {
            // InternalStoex.g:4502:1: ( ( rule__ProbabilityMassFunction__Group_2_1__0 )? )
            // InternalStoex.g:4503:2: ( rule__ProbabilityMassFunction__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getGroup_2_1()); 
            }
            // InternalStoex.g:4504:2: ( rule__ProbabilityMassFunction__Group_2_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_LPAREN) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalStoex.g:4504:3: rule__ProbabilityMassFunction__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ProbabilityMassFunction__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_2__1__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_2__2"
    // InternalStoex.g:4512:1: rule__ProbabilityMassFunction__Group_2__2 : rule__ProbabilityMassFunction__Group_2__2__Impl rule__ProbabilityMassFunction__Group_2__3 ;
    public final void rule__ProbabilityMassFunction__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4516:1: ( rule__ProbabilityMassFunction__Group_2__2__Impl rule__ProbabilityMassFunction__Group_2__3 )
            // InternalStoex.g:4517:2: rule__ProbabilityMassFunction__Group_2__2__Impl rule__ProbabilityMassFunction__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__ProbabilityMassFunction__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_2__2"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_2__2__Impl"
    // InternalStoex.g:4524:1: rule__ProbabilityMassFunction__Group_2__2__Impl : ( RULE_SQUARE_PAREN_L ) ;
    public final void rule__ProbabilityMassFunction__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4528:1: ( ( RULE_SQUARE_PAREN_L ) )
            // InternalStoex.g:4529:1: ( RULE_SQUARE_PAREN_L )
            {
            // InternalStoex.g:4529:1: ( RULE_SQUARE_PAREN_L )
            // InternalStoex.g:4530:2: RULE_SQUARE_PAREN_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_LTerminalRuleCall_2_2()); 
            }
            match(input,RULE_SQUARE_PAREN_L,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_LTerminalRuleCall_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_2__2__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_2__3"
    // InternalStoex.g:4539:1: rule__ProbabilityMassFunction__Group_2__3 : rule__ProbabilityMassFunction__Group_2__3__Impl rule__ProbabilityMassFunction__Group_2__4 ;
    public final void rule__ProbabilityMassFunction__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4543:1: ( rule__ProbabilityMassFunction__Group_2__3__Impl rule__ProbabilityMassFunction__Group_2__4 )
            // InternalStoex.g:4544:2: rule__ProbabilityMassFunction__Group_2__3__Impl rule__ProbabilityMassFunction__Group_2__4
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__ProbabilityMassFunction__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_2__3"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_2__3__Impl"
    // InternalStoex.g:4551:1: rule__ProbabilityMassFunction__Group_2__3__Impl : ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 )* ) ) ;
    public final void rule__ProbabilityMassFunction__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4555:1: ( ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 )* ) ) )
            // InternalStoex.g:4556:1: ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 )* ) )
            {
            // InternalStoex.g:4556:1: ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 )* ) )
            // InternalStoex.g:4557:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 )* )
            {
            // InternalStoex.g:4557:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 ) )
            // InternalStoex.g:4558:3: ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_2_3()); 
            }
            // InternalStoex.g:4559:3: ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 )
            // InternalStoex.g:4559:4: rule__ProbabilityMassFunction__SamplesAssignment_2_3
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__ProbabilityMassFunction__SamplesAssignment_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_2_3()); 
            }

            }

            // InternalStoex.g:4562:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 )* )
            // InternalStoex.g:4563:3: ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_2_3()); 
            }
            // InternalStoex.g:4564:3: ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_LPAREN) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalStoex.g:4564:4: rule__ProbabilityMassFunction__SamplesAssignment_2_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_31);
            	    rule__ProbabilityMassFunction__SamplesAssignment_2_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_2_3()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_2__3__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_2__4"
    // InternalStoex.g:4573:1: rule__ProbabilityMassFunction__Group_2__4 : rule__ProbabilityMassFunction__Group_2__4__Impl ;
    public final void rule__ProbabilityMassFunction__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4577:1: ( rule__ProbabilityMassFunction__Group_2__4__Impl )
            // InternalStoex.g:4578:2: rule__ProbabilityMassFunction__Group_2__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_2__4"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_2__4__Impl"
    // InternalStoex.g:4584:1: rule__ProbabilityMassFunction__Group_2__4__Impl : ( RULE_SQUARE_PAREN_R ) ;
    public final void rule__ProbabilityMassFunction__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4588:1: ( ( RULE_SQUARE_PAREN_R ) )
            // InternalStoex.g:4589:1: ( RULE_SQUARE_PAREN_R )
            {
            // InternalStoex.g:4589:1: ( RULE_SQUARE_PAREN_R )
            // InternalStoex.g:4590:2: RULE_SQUARE_PAREN_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_RTerminalRuleCall_2_4()); 
            }
            match(input,RULE_SQUARE_PAREN_R,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_RTerminalRuleCall_2_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_2__4__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_2_1__0"
    // InternalStoex.g:4600:1: rule__ProbabilityMassFunction__Group_2_1__0 : rule__ProbabilityMassFunction__Group_2_1__0__Impl rule__ProbabilityMassFunction__Group_2_1__1 ;
    public final void rule__ProbabilityMassFunction__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4604:1: ( rule__ProbabilityMassFunction__Group_2_1__0__Impl rule__ProbabilityMassFunction__Group_2_1__1 )
            // InternalStoex.g:4605:2: rule__ProbabilityMassFunction__Group_2_1__0__Impl rule__ProbabilityMassFunction__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__ProbabilityMassFunction__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_2_1__0"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_2_1__0__Impl"
    // InternalStoex.g:4612:1: rule__ProbabilityMassFunction__Group_2_1__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__ProbabilityMassFunction__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4616:1: ( ( RULE_LPAREN ) )
            // InternalStoex.g:4617:1: ( RULE_LPAREN )
            {
            // InternalStoex.g:4617:1: ( RULE_LPAREN )
            // InternalStoex.g:4618:2: RULE_LPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getLPARENTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_LPAREN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getLPARENTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_2_1__0__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_2_1__1"
    // InternalStoex.g:4627:1: rule__ProbabilityMassFunction__Group_2_1__1 : rule__ProbabilityMassFunction__Group_2_1__1__Impl rule__ProbabilityMassFunction__Group_2_1__2 ;
    public final void rule__ProbabilityMassFunction__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4631:1: ( rule__ProbabilityMassFunction__Group_2_1__1__Impl rule__ProbabilityMassFunction__Group_2_1__2 )
            // InternalStoex.g:4632:2: rule__ProbabilityMassFunction__Group_2_1__1__Impl rule__ProbabilityMassFunction__Group_2_1__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__ProbabilityMassFunction__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_2_1__1"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_2_1__1__Impl"
    // InternalStoex.g:4639:1: rule__ProbabilityMassFunction__Group_2_1__1__Impl : ( ( rule__ProbabilityMassFunction__OrderedDomainAssignment_2_1_1 ) ) ;
    public final void rule__ProbabilityMassFunction__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4643:1: ( ( ( rule__ProbabilityMassFunction__OrderedDomainAssignment_2_1_1 ) ) )
            // InternalStoex.g:4644:1: ( ( rule__ProbabilityMassFunction__OrderedDomainAssignment_2_1_1 ) )
            {
            // InternalStoex.g:4644:1: ( ( rule__ProbabilityMassFunction__OrderedDomainAssignment_2_1_1 ) )
            // InternalStoex.g:4645:2: ( rule__ProbabilityMassFunction__OrderedDomainAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getOrderedDomainAssignment_2_1_1()); 
            }
            // InternalStoex.g:4646:2: ( rule__ProbabilityMassFunction__OrderedDomainAssignment_2_1_1 )
            // InternalStoex.g:4646:3: rule__ProbabilityMassFunction__OrderedDomainAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__OrderedDomainAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getOrderedDomainAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_2_1__1__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_2_1__2"
    // InternalStoex.g:4654:1: rule__ProbabilityMassFunction__Group_2_1__2 : rule__ProbabilityMassFunction__Group_2_1__2__Impl ;
    public final void rule__ProbabilityMassFunction__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4658:1: ( rule__ProbabilityMassFunction__Group_2_1__2__Impl )
            // InternalStoex.g:4659:2: rule__ProbabilityMassFunction__Group_2_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_2_1__2"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_2_1__2__Impl"
    // InternalStoex.g:4665:1: rule__ProbabilityMassFunction__Group_2_1__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__ProbabilityMassFunction__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4669:1: ( ( RULE_RPAREN ) )
            // InternalStoex.g:4670:1: ( RULE_RPAREN )
            {
            // InternalStoex.g:4670:1: ( RULE_RPAREN )
            // InternalStoex.g:4671:2: RULE_RPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getRPARENTerminalRuleCall_2_1_2()); 
            }
            match(input,RULE_RPAREN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getRPARENTerminalRuleCall_2_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_2_1__2__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_3__0"
    // InternalStoex.g:4681:1: rule__ProbabilityMassFunction__Group_3__0 : rule__ProbabilityMassFunction__Group_3__0__Impl rule__ProbabilityMassFunction__Group_3__1 ;
    public final void rule__ProbabilityMassFunction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4685:1: ( rule__ProbabilityMassFunction__Group_3__0__Impl rule__ProbabilityMassFunction__Group_3__1 )
            // InternalStoex.g:4686:2: rule__ProbabilityMassFunction__Group_3__0__Impl rule__ProbabilityMassFunction__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__ProbabilityMassFunction__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_3__0"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_3__0__Impl"
    // InternalStoex.g:4693:1: rule__ProbabilityMassFunction__Group_3__0__Impl : ( RULE_BOOLPMF ) ;
    public final void rule__ProbabilityMassFunction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4697:1: ( ( RULE_BOOLPMF ) )
            // InternalStoex.g:4698:1: ( RULE_BOOLPMF )
            {
            // InternalStoex.g:4698:1: ( RULE_BOOLPMF )
            // InternalStoex.g:4699:2: RULE_BOOLPMF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getBOOLPMFTerminalRuleCall_3_0()); 
            }
            match(input,RULE_BOOLPMF,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getBOOLPMFTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_3__0__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_3__1"
    // InternalStoex.g:4708:1: rule__ProbabilityMassFunction__Group_3__1 : rule__ProbabilityMassFunction__Group_3__1__Impl rule__ProbabilityMassFunction__Group_3__2 ;
    public final void rule__ProbabilityMassFunction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4712:1: ( rule__ProbabilityMassFunction__Group_3__1__Impl rule__ProbabilityMassFunction__Group_3__2 )
            // InternalStoex.g:4713:2: rule__ProbabilityMassFunction__Group_3__1__Impl rule__ProbabilityMassFunction__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__ProbabilityMassFunction__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_3__1"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_3__1__Impl"
    // InternalStoex.g:4720:1: rule__ProbabilityMassFunction__Group_3__1__Impl : ( ( rule__ProbabilityMassFunction__Group_3_1__0 )? ) ;
    public final void rule__ProbabilityMassFunction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4724:1: ( ( ( rule__ProbabilityMassFunction__Group_3_1__0 )? ) )
            // InternalStoex.g:4725:1: ( ( rule__ProbabilityMassFunction__Group_3_1__0 )? )
            {
            // InternalStoex.g:4725:1: ( ( rule__ProbabilityMassFunction__Group_3_1__0 )? )
            // InternalStoex.g:4726:2: ( rule__ProbabilityMassFunction__Group_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getGroup_3_1()); 
            }
            // InternalStoex.g:4727:2: ( rule__ProbabilityMassFunction__Group_3_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_LPAREN) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalStoex.g:4727:3: rule__ProbabilityMassFunction__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ProbabilityMassFunction__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_3__1__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_3__2"
    // InternalStoex.g:4735:1: rule__ProbabilityMassFunction__Group_3__2 : rule__ProbabilityMassFunction__Group_3__2__Impl rule__ProbabilityMassFunction__Group_3__3 ;
    public final void rule__ProbabilityMassFunction__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4739:1: ( rule__ProbabilityMassFunction__Group_3__2__Impl rule__ProbabilityMassFunction__Group_3__3 )
            // InternalStoex.g:4740:2: rule__ProbabilityMassFunction__Group_3__2__Impl rule__ProbabilityMassFunction__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__ProbabilityMassFunction__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_3__2"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_3__2__Impl"
    // InternalStoex.g:4747:1: rule__ProbabilityMassFunction__Group_3__2__Impl : ( RULE_SQUARE_PAREN_L ) ;
    public final void rule__ProbabilityMassFunction__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4751:1: ( ( RULE_SQUARE_PAREN_L ) )
            // InternalStoex.g:4752:1: ( RULE_SQUARE_PAREN_L )
            {
            // InternalStoex.g:4752:1: ( RULE_SQUARE_PAREN_L )
            // InternalStoex.g:4753:2: RULE_SQUARE_PAREN_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_LTerminalRuleCall_3_2()); 
            }
            match(input,RULE_SQUARE_PAREN_L,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_LTerminalRuleCall_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_3__2__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_3__3"
    // InternalStoex.g:4762:1: rule__ProbabilityMassFunction__Group_3__3 : rule__ProbabilityMassFunction__Group_3__3__Impl rule__ProbabilityMassFunction__Group_3__4 ;
    public final void rule__ProbabilityMassFunction__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4766:1: ( rule__ProbabilityMassFunction__Group_3__3__Impl rule__ProbabilityMassFunction__Group_3__4 )
            // InternalStoex.g:4767:2: rule__ProbabilityMassFunction__Group_3__3__Impl rule__ProbabilityMassFunction__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__ProbabilityMassFunction__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_3__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_3__3"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_3__3__Impl"
    // InternalStoex.g:4774:1: rule__ProbabilityMassFunction__Group_3__3__Impl : ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 )* ) ) ;
    public final void rule__ProbabilityMassFunction__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4778:1: ( ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 )* ) ) )
            // InternalStoex.g:4779:1: ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 )* ) )
            {
            // InternalStoex.g:4779:1: ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 )* ) )
            // InternalStoex.g:4780:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 )* )
            {
            // InternalStoex.g:4780:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 ) )
            // InternalStoex.g:4781:3: ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_3_3()); 
            }
            // InternalStoex.g:4782:3: ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 )
            // InternalStoex.g:4782:4: rule__ProbabilityMassFunction__SamplesAssignment_3_3
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__ProbabilityMassFunction__SamplesAssignment_3_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_3_3()); 
            }

            }

            // InternalStoex.g:4785:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 )* )
            // InternalStoex.g:4786:3: ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_3_3()); 
            }
            // InternalStoex.g:4787:3: ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_LPAREN) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalStoex.g:4787:4: rule__ProbabilityMassFunction__SamplesAssignment_3_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_31);
            	    rule__ProbabilityMassFunction__SamplesAssignment_3_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_3_3()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_3__3__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_3__4"
    // InternalStoex.g:4796:1: rule__ProbabilityMassFunction__Group_3__4 : rule__ProbabilityMassFunction__Group_3__4__Impl ;
    public final void rule__ProbabilityMassFunction__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4800:1: ( rule__ProbabilityMassFunction__Group_3__4__Impl )
            // InternalStoex.g:4801:2: rule__ProbabilityMassFunction__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_3__4"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_3__4__Impl"
    // InternalStoex.g:4807:1: rule__ProbabilityMassFunction__Group_3__4__Impl : ( RULE_SQUARE_PAREN_R ) ;
    public final void rule__ProbabilityMassFunction__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4811:1: ( ( RULE_SQUARE_PAREN_R ) )
            // InternalStoex.g:4812:1: ( RULE_SQUARE_PAREN_R )
            {
            // InternalStoex.g:4812:1: ( RULE_SQUARE_PAREN_R )
            // InternalStoex.g:4813:2: RULE_SQUARE_PAREN_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_RTerminalRuleCall_3_4()); 
            }
            match(input,RULE_SQUARE_PAREN_R,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_RTerminalRuleCall_3_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_3__4__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_3_1__0"
    // InternalStoex.g:4823:1: rule__ProbabilityMassFunction__Group_3_1__0 : rule__ProbabilityMassFunction__Group_3_1__0__Impl rule__ProbabilityMassFunction__Group_3_1__1 ;
    public final void rule__ProbabilityMassFunction__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4827:1: ( rule__ProbabilityMassFunction__Group_3_1__0__Impl rule__ProbabilityMassFunction__Group_3_1__1 )
            // InternalStoex.g:4828:2: rule__ProbabilityMassFunction__Group_3_1__0__Impl rule__ProbabilityMassFunction__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__ProbabilityMassFunction__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_3_1__0"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_3_1__0__Impl"
    // InternalStoex.g:4835:1: rule__ProbabilityMassFunction__Group_3_1__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__ProbabilityMassFunction__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4839:1: ( ( RULE_LPAREN ) )
            // InternalStoex.g:4840:1: ( RULE_LPAREN )
            {
            // InternalStoex.g:4840:1: ( RULE_LPAREN )
            // InternalStoex.g:4841:2: RULE_LPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getLPARENTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_LPAREN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getLPARENTerminalRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_3_1__0__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_3_1__1"
    // InternalStoex.g:4850:1: rule__ProbabilityMassFunction__Group_3_1__1 : rule__ProbabilityMassFunction__Group_3_1__1__Impl rule__ProbabilityMassFunction__Group_3_1__2 ;
    public final void rule__ProbabilityMassFunction__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4854:1: ( rule__ProbabilityMassFunction__Group_3_1__1__Impl rule__ProbabilityMassFunction__Group_3_1__2 )
            // InternalStoex.g:4855:2: rule__ProbabilityMassFunction__Group_3_1__1__Impl rule__ProbabilityMassFunction__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__ProbabilityMassFunction__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_3_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_3_1__1"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_3_1__1__Impl"
    // InternalStoex.g:4862:1: rule__ProbabilityMassFunction__Group_3_1__1__Impl : ( ( rule__ProbabilityMassFunction__OrderedDomainAssignment_3_1_1 ) ) ;
    public final void rule__ProbabilityMassFunction__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4866:1: ( ( ( rule__ProbabilityMassFunction__OrderedDomainAssignment_3_1_1 ) ) )
            // InternalStoex.g:4867:1: ( ( rule__ProbabilityMassFunction__OrderedDomainAssignment_3_1_1 ) )
            {
            // InternalStoex.g:4867:1: ( ( rule__ProbabilityMassFunction__OrderedDomainAssignment_3_1_1 ) )
            // InternalStoex.g:4868:2: ( rule__ProbabilityMassFunction__OrderedDomainAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getOrderedDomainAssignment_3_1_1()); 
            }
            // InternalStoex.g:4869:2: ( rule__ProbabilityMassFunction__OrderedDomainAssignment_3_1_1 )
            // InternalStoex.g:4869:3: rule__ProbabilityMassFunction__OrderedDomainAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__OrderedDomainAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getOrderedDomainAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_3_1__1__Impl"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_3_1__2"
    // InternalStoex.g:4877:1: rule__ProbabilityMassFunction__Group_3_1__2 : rule__ProbabilityMassFunction__Group_3_1__2__Impl ;
    public final void rule__ProbabilityMassFunction__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4881:1: ( rule__ProbabilityMassFunction__Group_3_1__2__Impl )
            // InternalStoex.g:4882:2: rule__ProbabilityMassFunction__Group_3_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProbabilityMassFunction__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_3_1__2"


    // $ANTLR start "rule__ProbabilityMassFunction__Group_3_1__2__Impl"
    // InternalStoex.g:4888:1: rule__ProbabilityMassFunction__Group_3_1__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__ProbabilityMassFunction__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4892:1: ( ( RULE_RPAREN ) )
            // InternalStoex.g:4893:1: ( RULE_RPAREN )
            {
            // InternalStoex.g:4893:1: ( RULE_RPAREN )
            // InternalStoex.g:4894:2: RULE_RPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getRPARENTerminalRuleCall_3_1_2()); 
            }
            match(input,RULE_RPAREN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getRPARENTerminalRuleCall_3_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__Group_3_1__2__Impl"


    // $ANTLR start "rule__Numeric_int_sample__Group__0"
    // InternalStoex.g:4904:1: rule__Numeric_int_sample__Group__0 : rule__Numeric_int_sample__Group__0__Impl rule__Numeric_int_sample__Group__1 ;
    public final void rule__Numeric_int_sample__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4908:1: ( rule__Numeric_int_sample__Group__0__Impl rule__Numeric_int_sample__Group__1 )
            // InternalStoex.g:4909:2: rule__Numeric_int_sample__Group__0__Impl rule__Numeric_int_sample__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__Numeric_int_sample__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Numeric_int_sample__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_int_sample__Group__0"


    // $ANTLR start "rule__Numeric_int_sample__Group__0__Impl"
    // InternalStoex.g:4916:1: rule__Numeric_int_sample__Group__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__Numeric_int_sample__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4920:1: ( ( RULE_LPAREN ) )
            // InternalStoex.g:4921:1: ( RULE_LPAREN )
            {
            // InternalStoex.g:4921:1: ( RULE_LPAREN )
            // InternalStoex.g:4922:2: RULE_LPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_int_sampleAccess().getLPARENTerminalRuleCall_0()); 
            }
            match(input,RULE_LPAREN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_int_sampleAccess().getLPARENTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_int_sample__Group__0__Impl"


    // $ANTLR start "rule__Numeric_int_sample__Group__1"
    // InternalStoex.g:4931:1: rule__Numeric_int_sample__Group__1 : rule__Numeric_int_sample__Group__1__Impl rule__Numeric_int_sample__Group__2 ;
    public final void rule__Numeric_int_sample__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4935:1: ( rule__Numeric_int_sample__Group__1__Impl rule__Numeric_int_sample__Group__2 )
            // InternalStoex.g:4936:2: rule__Numeric_int_sample__Group__1__Impl rule__Numeric_int_sample__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__Numeric_int_sample__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Numeric_int_sample__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_int_sample__Group__1"


    // $ANTLR start "rule__Numeric_int_sample__Group__1__Impl"
    // InternalStoex.g:4943:1: rule__Numeric_int_sample__Group__1__Impl : ( ( rule__Numeric_int_sample__ValueAssignment_1 ) ) ;
    public final void rule__Numeric_int_sample__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4947:1: ( ( ( rule__Numeric_int_sample__ValueAssignment_1 ) ) )
            // InternalStoex.g:4948:1: ( ( rule__Numeric_int_sample__ValueAssignment_1 ) )
            {
            // InternalStoex.g:4948:1: ( ( rule__Numeric_int_sample__ValueAssignment_1 ) )
            // InternalStoex.g:4949:2: ( rule__Numeric_int_sample__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_int_sampleAccess().getValueAssignment_1()); 
            }
            // InternalStoex.g:4950:2: ( rule__Numeric_int_sample__ValueAssignment_1 )
            // InternalStoex.g:4950:3: rule__Numeric_int_sample__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Numeric_int_sample__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_int_sampleAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_int_sample__Group__1__Impl"


    // $ANTLR start "rule__Numeric_int_sample__Group__2"
    // InternalStoex.g:4958:1: rule__Numeric_int_sample__Group__2 : rule__Numeric_int_sample__Group__2__Impl rule__Numeric_int_sample__Group__3 ;
    public final void rule__Numeric_int_sample__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4962:1: ( rule__Numeric_int_sample__Group__2__Impl rule__Numeric_int_sample__Group__3 )
            // InternalStoex.g:4963:2: rule__Numeric_int_sample__Group__2__Impl rule__Numeric_int_sample__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__Numeric_int_sample__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Numeric_int_sample__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_int_sample__Group__2"


    // $ANTLR start "rule__Numeric_int_sample__Group__2__Impl"
    // InternalStoex.g:4970:1: rule__Numeric_int_sample__Group__2__Impl : ( RULE_SEMI ) ;
    public final void rule__Numeric_int_sample__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4974:1: ( ( RULE_SEMI ) )
            // InternalStoex.g:4975:1: ( RULE_SEMI )
            {
            // InternalStoex.g:4975:1: ( RULE_SEMI )
            // InternalStoex.g:4976:2: RULE_SEMI
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_int_sampleAccess().getSEMITerminalRuleCall_2()); 
            }
            match(input,RULE_SEMI,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_int_sampleAccess().getSEMITerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_int_sample__Group__2__Impl"


    // $ANTLR start "rule__Numeric_int_sample__Group__3"
    // InternalStoex.g:4985:1: rule__Numeric_int_sample__Group__3 : rule__Numeric_int_sample__Group__3__Impl rule__Numeric_int_sample__Group__4 ;
    public final void rule__Numeric_int_sample__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4989:1: ( rule__Numeric_int_sample__Group__3__Impl rule__Numeric_int_sample__Group__4 )
            // InternalStoex.g:4990:2: rule__Numeric_int_sample__Group__3__Impl rule__Numeric_int_sample__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__Numeric_int_sample__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Numeric_int_sample__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_int_sample__Group__3"


    // $ANTLR start "rule__Numeric_int_sample__Group__3__Impl"
    // InternalStoex.g:4997:1: rule__Numeric_int_sample__Group__3__Impl : ( ( rule__Numeric_int_sample__ProbabilityAssignment_3 ) ) ;
    public final void rule__Numeric_int_sample__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5001:1: ( ( ( rule__Numeric_int_sample__ProbabilityAssignment_3 ) ) )
            // InternalStoex.g:5002:1: ( ( rule__Numeric_int_sample__ProbabilityAssignment_3 ) )
            {
            // InternalStoex.g:5002:1: ( ( rule__Numeric_int_sample__ProbabilityAssignment_3 ) )
            // InternalStoex.g:5003:2: ( rule__Numeric_int_sample__ProbabilityAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_int_sampleAccess().getProbabilityAssignment_3()); 
            }
            // InternalStoex.g:5004:2: ( rule__Numeric_int_sample__ProbabilityAssignment_3 )
            // InternalStoex.g:5004:3: rule__Numeric_int_sample__ProbabilityAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Numeric_int_sample__ProbabilityAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_int_sampleAccess().getProbabilityAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_int_sample__Group__3__Impl"


    // $ANTLR start "rule__Numeric_int_sample__Group__4"
    // InternalStoex.g:5012:1: rule__Numeric_int_sample__Group__4 : rule__Numeric_int_sample__Group__4__Impl ;
    public final void rule__Numeric_int_sample__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5016:1: ( rule__Numeric_int_sample__Group__4__Impl )
            // InternalStoex.g:5017:2: rule__Numeric_int_sample__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Numeric_int_sample__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_int_sample__Group__4"


    // $ANTLR start "rule__Numeric_int_sample__Group__4__Impl"
    // InternalStoex.g:5023:1: rule__Numeric_int_sample__Group__4__Impl : ( RULE_RPAREN ) ;
    public final void rule__Numeric_int_sample__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5027:1: ( ( RULE_RPAREN ) )
            // InternalStoex.g:5028:1: ( RULE_RPAREN )
            {
            // InternalStoex.g:5028:1: ( RULE_RPAREN )
            // InternalStoex.g:5029:2: RULE_RPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_int_sampleAccess().getRPARENTerminalRuleCall_4()); 
            }
            match(input,RULE_RPAREN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_int_sampleAccess().getRPARENTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_int_sample__Group__4__Impl"


    // $ANTLR start "rule__Numeric_real_sample__Group__0"
    // InternalStoex.g:5039:1: rule__Numeric_real_sample__Group__0 : rule__Numeric_real_sample__Group__0__Impl rule__Numeric_real_sample__Group__1 ;
    public final void rule__Numeric_real_sample__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5043:1: ( rule__Numeric_real_sample__Group__0__Impl rule__Numeric_real_sample__Group__1 )
            // InternalStoex.g:5044:2: rule__Numeric_real_sample__Group__0__Impl rule__Numeric_real_sample__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__Numeric_real_sample__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Numeric_real_sample__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_real_sample__Group__0"


    // $ANTLR start "rule__Numeric_real_sample__Group__0__Impl"
    // InternalStoex.g:5051:1: rule__Numeric_real_sample__Group__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__Numeric_real_sample__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5055:1: ( ( RULE_LPAREN ) )
            // InternalStoex.g:5056:1: ( RULE_LPAREN )
            {
            // InternalStoex.g:5056:1: ( RULE_LPAREN )
            // InternalStoex.g:5057:2: RULE_LPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_real_sampleAccess().getLPARENTerminalRuleCall_0()); 
            }
            match(input,RULE_LPAREN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_real_sampleAccess().getLPARENTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_real_sample__Group__0__Impl"


    // $ANTLR start "rule__Numeric_real_sample__Group__1"
    // InternalStoex.g:5066:1: rule__Numeric_real_sample__Group__1 : rule__Numeric_real_sample__Group__1__Impl rule__Numeric_real_sample__Group__2 ;
    public final void rule__Numeric_real_sample__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5070:1: ( rule__Numeric_real_sample__Group__1__Impl rule__Numeric_real_sample__Group__2 )
            // InternalStoex.g:5071:2: rule__Numeric_real_sample__Group__1__Impl rule__Numeric_real_sample__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__Numeric_real_sample__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Numeric_real_sample__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_real_sample__Group__1"


    // $ANTLR start "rule__Numeric_real_sample__Group__1__Impl"
    // InternalStoex.g:5078:1: rule__Numeric_real_sample__Group__1__Impl : ( ( rule__Numeric_real_sample__ValueAssignment_1 ) ) ;
    public final void rule__Numeric_real_sample__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5082:1: ( ( ( rule__Numeric_real_sample__ValueAssignment_1 ) ) )
            // InternalStoex.g:5083:1: ( ( rule__Numeric_real_sample__ValueAssignment_1 ) )
            {
            // InternalStoex.g:5083:1: ( ( rule__Numeric_real_sample__ValueAssignment_1 ) )
            // InternalStoex.g:5084:2: ( rule__Numeric_real_sample__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_real_sampleAccess().getValueAssignment_1()); 
            }
            // InternalStoex.g:5085:2: ( rule__Numeric_real_sample__ValueAssignment_1 )
            // InternalStoex.g:5085:3: rule__Numeric_real_sample__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Numeric_real_sample__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_real_sampleAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_real_sample__Group__1__Impl"


    // $ANTLR start "rule__Numeric_real_sample__Group__2"
    // InternalStoex.g:5093:1: rule__Numeric_real_sample__Group__2 : rule__Numeric_real_sample__Group__2__Impl rule__Numeric_real_sample__Group__3 ;
    public final void rule__Numeric_real_sample__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5097:1: ( rule__Numeric_real_sample__Group__2__Impl rule__Numeric_real_sample__Group__3 )
            // InternalStoex.g:5098:2: rule__Numeric_real_sample__Group__2__Impl rule__Numeric_real_sample__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__Numeric_real_sample__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Numeric_real_sample__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_real_sample__Group__2"


    // $ANTLR start "rule__Numeric_real_sample__Group__2__Impl"
    // InternalStoex.g:5105:1: rule__Numeric_real_sample__Group__2__Impl : ( RULE_SEMI ) ;
    public final void rule__Numeric_real_sample__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5109:1: ( ( RULE_SEMI ) )
            // InternalStoex.g:5110:1: ( RULE_SEMI )
            {
            // InternalStoex.g:5110:1: ( RULE_SEMI )
            // InternalStoex.g:5111:2: RULE_SEMI
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_real_sampleAccess().getSEMITerminalRuleCall_2()); 
            }
            match(input,RULE_SEMI,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_real_sampleAccess().getSEMITerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_real_sample__Group__2__Impl"


    // $ANTLR start "rule__Numeric_real_sample__Group__3"
    // InternalStoex.g:5120:1: rule__Numeric_real_sample__Group__3 : rule__Numeric_real_sample__Group__3__Impl rule__Numeric_real_sample__Group__4 ;
    public final void rule__Numeric_real_sample__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5124:1: ( rule__Numeric_real_sample__Group__3__Impl rule__Numeric_real_sample__Group__4 )
            // InternalStoex.g:5125:2: rule__Numeric_real_sample__Group__3__Impl rule__Numeric_real_sample__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__Numeric_real_sample__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Numeric_real_sample__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_real_sample__Group__3"


    // $ANTLR start "rule__Numeric_real_sample__Group__3__Impl"
    // InternalStoex.g:5132:1: rule__Numeric_real_sample__Group__3__Impl : ( ( rule__Numeric_real_sample__ProbabilityAssignment_3 ) ) ;
    public final void rule__Numeric_real_sample__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5136:1: ( ( ( rule__Numeric_real_sample__ProbabilityAssignment_3 ) ) )
            // InternalStoex.g:5137:1: ( ( rule__Numeric_real_sample__ProbabilityAssignment_3 ) )
            {
            // InternalStoex.g:5137:1: ( ( rule__Numeric_real_sample__ProbabilityAssignment_3 ) )
            // InternalStoex.g:5138:2: ( rule__Numeric_real_sample__ProbabilityAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_real_sampleAccess().getProbabilityAssignment_3()); 
            }
            // InternalStoex.g:5139:2: ( rule__Numeric_real_sample__ProbabilityAssignment_3 )
            // InternalStoex.g:5139:3: rule__Numeric_real_sample__ProbabilityAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Numeric_real_sample__ProbabilityAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_real_sampleAccess().getProbabilityAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_real_sample__Group__3__Impl"


    // $ANTLR start "rule__Numeric_real_sample__Group__4"
    // InternalStoex.g:5147:1: rule__Numeric_real_sample__Group__4 : rule__Numeric_real_sample__Group__4__Impl ;
    public final void rule__Numeric_real_sample__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5151:1: ( rule__Numeric_real_sample__Group__4__Impl )
            // InternalStoex.g:5152:2: rule__Numeric_real_sample__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Numeric_real_sample__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_real_sample__Group__4"


    // $ANTLR start "rule__Numeric_real_sample__Group__4__Impl"
    // InternalStoex.g:5158:1: rule__Numeric_real_sample__Group__4__Impl : ( RULE_RPAREN ) ;
    public final void rule__Numeric_real_sample__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5162:1: ( ( RULE_RPAREN ) )
            // InternalStoex.g:5163:1: ( RULE_RPAREN )
            {
            // InternalStoex.g:5163:1: ( RULE_RPAREN )
            // InternalStoex.g:5164:2: RULE_RPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_real_sampleAccess().getRPARENTerminalRuleCall_4()); 
            }
            match(input,RULE_RPAREN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_real_sampleAccess().getRPARENTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_real_sample__Group__4__Impl"


    // $ANTLR start "rule__Real_pdf_sample__Group__0"
    // InternalStoex.g:5174:1: rule__Real_pdf_sample__Group__0 : rule__Real_pdf_sample__Group__0__Impl rule__Real_pdf_sample__Group__1 ;
    public final void rule__Real_pdf_sample__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5178:1: ( rule__Real_pdf_sample__Group__0__Impl rule__Real_pdf_sample__Group__1 )
            // InternalStoex.g:5179:2: rule__Real_pdf_sample__Group__0__Impl rule__Real_pdf_sample__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__Real_pdf_sample__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Real_pdf_sample__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_pdf_sample__Group__0"


    // $ANTLR start "rule__Real_pdf_sample__Group__0__Impl"
    // InternalStoex.g:5186:1: rule__Real_pdf_sample__Group__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__Real_pdf_sample__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5190:1: ( ( RULE_LPAREN ) )
            // InternalStoex.g:5191:1: ( RULE_LPAREN )
            {
            // InternalStoex.g:5191:1: ( RULE_LPAREN )
            // InternalStoex.g:5192:2: RULE_LPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReal_pdf_sampleAccess().getLPARENTerminalRuleCall_0()); 
            }
            match(input,RULE_LPAREN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReal_pdf_sampleAccess().getLPARENTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_pdf_sample__Group__0__Impl"


    // $ANTLR start "rule__Real_pdf_sample__Group__1"
    // InternalStoex.g:5201:1: rule__Real_pdf_sample__Group__1 : rule__Real_pdf_sample__Group__1__Impl rule__Real_pdf_sample__Group__2 ;
    public final void rule__Real_pdf_sample__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5205:1: ( rule__Real_pdf_sample__Group__1__Impl rule__Real_pdf_sample__Group__2 )
            // InternalStoex.g:5206:2: rule__Real_pdf_sample__Group__1__Impl rule__Real_pdf_sample__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__Real_pdf_sample__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Real_pdf_sample__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_pdf_sample__Group__1"


    // $ANTLR start "rule__Real_pdf_sample__Group__1__Impl"
    // InternalStoex.g:5213:1: rule__Real_pdf_sample__Group__1__Impl : ( ( rule__Real_pdf_sample__ValueAssignment_1 ) ) ;
    public final void rule__Real_pdf_sample__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5217:1: ( ( ( rule__Real_pdf_sample__ValueAssignment_1 ) ) )
            // InternalStoex.g:5218:1: ( ( rule__Real_pdf_sample__ValueAssignment_1 ) )
            {
            // InternalStoex.g:5218:1: ( ( rule__Real_pdf_sample__ValueAssignment_1 ) )
            // InternalStoex.g:5219:2: ( rule__Real_pdf_sample__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReal_pdf_sampleAccess().getValueAssignment_1()); 
            }
            // InternalStoex.g:5220:2: ( rule__Real_pdf_sample__ValueAssignment_1 )
            // InternalStoex.g:5220:3: rule__Real_pdf_sample__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Real_pdf_sample__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReal_pdf_sampleAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_pdf_sample__Group__1__Impl"


    // $ANTLR start "rule__Real_pdf_sample__Group__2"
    // InternalStoex.g:5228:1: rule__Real_pdf_sample__Group__2 : rule__Real_pdf_sample__Group__2__Impl rule__Real_pdf_sample__Group__3 ;
    public final void rule__Real_pdf_sample__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5232:1: ( rule__Real_pdf_sample__Group__2__Impl rule__Real_pdf_sample__Group__3 )
            // InternalStoex.g:5233:2: rule__Real_pdf_sample__Group__2__Impl rule__Real_pdf_sample__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__Real_pdf_sample__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Real_pdf_sample__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_pdf_sample__Group__2"


    // $ANTLR start "rule__Real_pdf_sample__Group__2__Impl"
    // InternalStoex.g:5240:1: rule__Real_pdf_sample__Group__2__Impl : ( RULE_SEMI ) ;
    public final void rule__Real_pdf_sample__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5244:1: ( ( RULE_SEMI ) )
            // InternalStoex.g:5245:1: ( RULE_SEMI )
            {
            // InternalStoex.g:5245:1: ( RULE_SEMI )
            // InternalStoex.g:5246:2: RULE_SEMI
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReal_pdf_sampleAccess().getSEMITerminalRuleCall_2()); 
            }
            match(input,RULE_SEMI,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReal_pdf_sampleAccess().getSEMITerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_pdf_sample__Group__2__Impl"


    // $ANTLR start "rule__Real_pdf_sample__Group__3"
    // InternalStoex.g:5255:1: rule__Real_pdf_sample__Group__3 : rule__Real_pdf_sample__Group__3__Impl rule__Real_pdf_sample__Group__4 ;
    public final void rule__Real_pdf_sample__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5259:1: ( rule__Real_pdf_sample__Group__3__Impl rule__Real_pdf_sample__Group__4 )
            // InternalStoex.g:5260:2: rule__Real_pdf_sample__Group__3__Impl rule__Real_pdf_sample__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__Real_pdf_sample__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Real_pdf_sample__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_pdf_sample__Group__3"


    // $ANTLR start "rule__Real_pdf_sample__Group__3__Impl"
    // InternalStoex.g:5267:1: rule__Real_pdf_sample__Group__3__Impl : ( ( rule__Real_pdf_sample__ProbabilityAssignment_3 ) ) ;
    public final void rule__Real_pdf_sample__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5271:1: ( ( ( rule__Real_pdf_sample__ProbabilityAssignment_3 ) ) )
            // InternalStoex.g:5272:1: ( ( rule__Real_pdf_sample__ProbabilityAssignment_3 ) )
            {
            // InternalStoex.g:5272:1: ( ( rule__Real_pdf_sample__ProbabilityAssignment_3 ) )
            // InternalStoex.g:5273:2: ( rule__Real_pdf_sample__ProbabilityAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReal_pdf_sampleAccess().getProbabilityAssignment_3()); 
            }
            // InternalStoex.g:5274:2: ( rule__Real_pdf_sample__ProbabilityAssignment_3 )
            // InternalStoex.g:5274:3: rule__Real_pdf_sample__ProbabilityAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Real_pdf_sample__ProbabilityAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReal_pdf_sampleAccess().getProbabilityAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_pdf_sample__Group__3__Impl"


    // $ANTLR start "rule__Real_pdf_sample__Group__4"
    // InternalStoex.g:5282:1: rule__Real_pdf_sample__Group__4 : rule__Real_pdf_sample__Group__4__Impl ;
    public final void rule__Real_pdf_sample__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5286:1: ( rule__Real_pdf_sample__Group__4__Impl )
            // InternalStoex.g:5287:2: rule__Real_pdf_sample__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Real_pdf_sample__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_pdf_sample__Group__4"


    // $ANTLR start "rule__Real_pdf_sample__Group__4__Impl"
    // InternalStoex.g:5293:1: rule__Real_pdf_sample__Group__4__Impl : ( RULE_RPAREN ) ;
    public final void rule__Real_pdf_sample__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5297:1: ( ( RULE_RPAREN ) )
            // InternalStoex.g:5298:1: ( RULE_RPAREN )
            {
            // InternalStoex.g:5298:1: ( RULE_RPAREN )
            // InternalStoex.g:5299:2: RULE_RPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReal_pdf_sampleAccess().getRPARENTerminalRuleCall_4()); 
            }
            match(input,RULE_RPAREN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReal_pdf_sampleAccess().getRPARENTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_pdf_sample__Group__4__Impl"


    // $ANTLR start "rule__Stringsample__Group__0"
    // InternalStoex.g:5309:1: rule__Stringsample__Group__0 : rule__Stringsample__Group__0__Impl rule__Stringsample__Group__1 ;
    public final void rule__Stringsample__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5313:1: ( rule__Stringsample__Group__0__Impl rule__Stringsample__Group__1 )
            // InternalStoex.g:5314:2: rule__Stringsample__Group__0__Impl rule__Stringsample__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__Stringsample__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Stringsample__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stringsample__Group__0"


    // $ANTLR start "rule__Stringsample__Group__0__Impl"
    // InternalStoex.g:5321:1: rule__Stringsample__Group__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__Stringsample__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5325:1: ( ( RULE_LPAREN ) )
            // InternalStoex.g:5326:1: ( RULE_LPAREN )
            {
            // InternalStoex.g:5326:1: ( RULE_LPAREN )
            // InternalStoex.g:5327:2: RULE_LPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringsampleAccess().getLPARENTerminalRuleCall_0()); 
            }
            match(input,RULE_LPAREN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringsampleAccess().getLPARENTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stringsample__Group__0__Impl"


    // $ANTLR start "rule__Stringsample__Group__1"
    // InternalStoex.g:5336:1: rule__Stringsample__Group__1 : rule__Stringsample__Group__1__Impl rule__Stringsample__Group__2 ;
    public final void rule__Stringsample__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5340:1: ( rule__Stringsample__Group__1__Impl rule__Stringsample__Group__2 )
            // InternalStoex.g:5341:2: rule__Stringsample__Group__1__Impl rule__Stringsample__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__Stringsample__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Stringsample__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stringsample__Group__1"


    // $ANTLR start "rule__Stringsample__Group__1__Impl"
    // InternalStoex.g:5348:1: rule__Stringsample__Group__1__Impl : ( ( rule__Stringsample__ValueAssignment_1 ) ) ;
    public final void rule__Stringsample__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5352:1: ( ( ( rule__Stringsample__ValueAssignment_1 ) ) )
            // InternalStoex.g:5353:1: ( ( rule__Stringsample__ValueAssignment_1 ) )
            {
            // InternalStoex.g:5353:1: ( ( rule__Stringsample__ValueAssignment_1 ) )
            // InternalStoex.g:5354:2: ( rule__Stringsample__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringsampleAccess().getValueAssignment_1()); 
            }
            // InternalStoex.g:5355:2: ( rule__Stringsample__ValueAssignment_1 )
            // InternalStoex.g:5355:3: rule__Stringsample__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Stringsample__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringsampleAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stringsample__Group__1__Impl"


    // $ANTLR start "rule__Stringsample__Group__2"
    // InternalStoex.g:5363:1: rule__Stringsample__Group__2 : rule__Stringsample__Group__2__Impl rule__Stringsample__Group__3 ;
    public final void rule__Stringsample__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5367:1: ( rule__Stringsample__Group__2__Impl rule__Stringsample__Group__3 )
            // InternalStoex.g:5368:2: rule__Stringsample__Group__2__Impl rule__Stringsample__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__Stringsample__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Stringsample__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stringsample__Group__2"


    // $ANTLR start "rule__Stringsample__Group__2__Impl"
    // InternalStoex.g:5375:1: rule__Stringsample__Group__2__Impl : ( RULE_SEMI ) ;
    public final void rule__Stringsample__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5379:1: ( ( RULE_SEMI ) )
            // InternalStoex.g:5380:1: ( RULE_SEMI )
            {
            // InternalStoex.g:5380:1: ( RULE_SEMI )
            // InternalStoex.g:5381:2: RULE_SEMI
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringsampleAccess().getSEMITerminalRuleCall_2()); 
            }
            match(input,RULE_SEMI,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringsampleAccess().getSEMITerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stringsample__Group__2__Impl"


    // $ANTLR start "rule__Stringsample__Group__3"
    // InternalStoex.g:5390:1: rule__Stringsample__Group__3 : rule__Stringsample__Group__3__Impl rule__Stringsample__Group__4 ;
    public final void rule__Stringsample__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5394:1: ( rule__Stringsample__Group__3__Impl rule__Stringsample__Group__4 )
            // InternalStoex.g:5395:2: rule__Stringsample__Group__3__Impl rule__Stringsample__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__Stringsample__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Stringsample__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stringsample__Group__3"


    // $ANTLR start "rule__Stringsample__Group__3__Impl"
    // InternalStoex.g:5402:1: rule__Stringsample__Group__3__Impl : ( ( rule__Stringsample__ProbabilityAssignment_3 ) ) ;
    public final void rule__Stringsample__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5406:1: ( ( ( rule__Stringsample__ProbabilityAssignment_3 ) ) )
            // InternalStoex.g:5407:1: ( ( rule__Stringsample__ProbabilityAssignment_3 ) )
            {
            // InternalStoex.g:5407:1: ( ( rule__Stringsample__ProbabilityAssignment_3 ) )
            // InternalStoex.g:5408:2: ( rule__Stringsample__ProbabilityAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringsampleAccess().getProbabilityAssignment_3()); 
            }
            // InternalStoex.g:5409:2: ( rule__Stringsample__ProbabilityAssignment_3 )
            // InternalStoex.g:5409:3: rule__Stringsample__ProbabilityAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Stringsample__ProbabilityAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringsampleAccess().getProbabilityAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stringsample__Group__3__Impl"


    // $ANTLR start "rule__Stringsample__Group__4"
    // InternalStoex.g:5417:1: rule__Stringsample__Group__4 : rule__Stringsample__Group__4__Impl ;
    public final void rule__Stringsample__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5421:1: ( rule__Stringsample__Group__4__Impl )
            // InternalStoex.g:5422:2: rule__Stringsample__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Stringsample__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stringsample__Group__4"


    // $ANTLR start "rule__Stringsample__Group__4__Impl"
    // InternalStoex.g:5428:1: rule__Stringsample__Group__4__Impl : ( RULE_RPAREN ) ;
    public final void rule__Stringsample__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5432:1: ( ( RULE_RPAREN ) )
            // InternalStoex.g:5433:1: ( RULE_RPAREN )
            {
            // InternalStoex.g:5433:1: ( RULE_RPAREN )
            // InternalStoex.g:5434:2: RULE_RPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringsampleAccess().getRPARENTerminalRuleCall_4()); 
            }
            match(input,RULE_RPAREN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringsampleAccess().getRPARENTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stringsample__Group__4__Impl"


    // $ANTLR start "rule__Boolsample__Group__0"
    // InternalStoex.g:5444:1: rule__Boolsample__Group__0 : rule__Boolsample__Group__0__Impl rule__Boolsample__Group__1 ;
    public final void rule__Boolsample__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5448:1: ( rule__Boolsample__Group__0__Impl rule__Boolsample__Group__1 )
            // InternalStoex.g:5449:2: rule__Boolsample__Group__0__Impl rule__Boolsample__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__Boolsample__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Boolsample__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolsample__Group__0"


    // $ANTLR start "rule__Boolsample__Group__0__Impl"
    // InternalStoex.g:5456:1: rule__Boolsample__Group__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__Boolsample__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5460:1: ( ( RULE_LPAREN ) )
            // InternalStoex.g:5461:1: ( RULE_LPAREN )
            {
            // InternalStoex.g:5461:1: ( RULE_LPAREN )
            // InternalStoex.g:5462:2: RULE_LPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolsampleAccess().getLPARENTerminalRuleCall_0()); 
            }
            match(input,RULE_LPAREN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolsampleAccess().getLPARENTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolsample__Group__0__Impl"


    // $ANTLR start "rule__Boolsample__Group__1"
    // InternalStoex.g:5471:1: rule__Boolsample__Group__1 : rule__Boolsample__Group__1__Impl rule__Boolsample__Group__2 ;
    public final void rule__Boolsample__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5475:1: ( rule__Boolsample__Group__1__Impl rule__Boolsample__Group__2 )
            // InternalStoex.g:5476:2: rule__Boolsample__Group__1__Impl rule__Boolsample__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__Boolsample__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Boolsample__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolsample__Group__1"


    // $ANTLR start "rule__Boolsample__Group__1__Impl"
    // InternalStoex.g:5483:1: rule__Boolsample__Group__1__Impl : ( ( rule__Boolsample__ValueAssignment_1 ) ) ;
    public final void rule__Boolsample__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5487:1: ( ( ( rule__Boolsample__ValueAssignment_1 ) ) )
            // InternalStoex.g:5488:1: ( ( rule__Boolsample__ValueAssignment_1 ) )
            {
            // InternalStoex.g:5488:1: ( ( rule__Boolsample__ValueAssignment_1 ) )
            // InternalStoex.g:5489:2: ( rule__Boolsample__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolsampleAccess().getValueAssignment_1()); 
            }
            // InternalStoex.g:5490:2: ( rule__Boolsample__ValueAssignment_1 )
            // InternalStoex.g:5490:3: rule__Boolsample__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Boolsample__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolsampleAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolsample__Group__1__Impl"


    // $ANTLR start "rule__Boolsample__Group__2"
    // InternalStoex.g:5498:1: rule__Boolsample__Group__2 : rule__Boolsample__Group__2__Impl rule__Boolsample__Group__3 ;
    public final void rule__Boolsample__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5502:1: ( rule__Boolsample__Group__2__Impl rule__Boolsample__Group__3 )
            // InternalStoex.g:5503:2: rule__Boolsample__Group__2__Impl rule__Boolsample__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__Boolsample__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Boolsample__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolsample__Group__2"


    // $ANTLR start "rule__Boolsample__Group__2__Impl"
    // InternalStoex.g:5510:1: rule__Boolsample__Group__2__Impl : ( RULE_SEMI ) ;
    public final void rule__Boolsample__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5514:1: ( ( RULE_SEMI ) )
            // InternalStoex.g:5515:1: ( RULE_SEMI )
            {
            // InternalStoex.g:5515:1: ( RULE_SEMI )
            // InternalStoex.g:5516:2: RULE_SEMI
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolsampleAccess().getSEMITerminalRuleCall_2()); 
            }
            match(input,RULE_SEMI,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolsampleAccess().getSEMITerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolsample__Group__2__Impl"


    // $ANTLR start "rule__Boolsample__Group__3"
    // InternalStoex.g:5525:1: rule__Boolsample__Group__3 : rule__Boolsample__Group__3__Impl rule__Boolsample__Group__4 ;
    public final void rule__Boolsample__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5529:1: ( rule__Boolsample__Group__3__Impl rule__Boolsample__Group__4 )
            // InternalStoex.g:5530:2: rule__Boolsample__Group__3__Impl rule__Boolsample__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__Boolsample__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Boolsample__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolsample__Group__3"


    // $ANTLR start "rule__Boolsample__Group__3__Impl"
    // InternalStoex.g:5537:1: rule__Boolsample__Group__3__Impl : ( ( rule__Boolsample__ProbabilityAssignment_3 ) ) ;
    public final void rule__Boolsample__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5541:1: ( ( ( rule__Boolsample__ProbabilityAssignment_3 ) ) )
            // InternalStoex.g:5542:1: ( ( rule__Boolsample__ProbabilityAssignment_3 ) )
            {
            // InternalStoex.g:5542:1: ( ( rule__Boolsample__ProbabilityAssignment_3 ) )
            // InternalStoex.g:5543:2: ( rule__Boolsample__ProbabilityAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolsampleAccess().getProbabilityAssignment_3()); 
            }
            // InternalStoex.g:5544:2: ( rule__Boolsample__ProbabilityAssignment_3 )
            // InternalStoex.g:5544:3: rule__Boolsample__ProbabilityAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Boolsample__ProbabilityAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolsampleAccess().getProbabilityAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolsample__Group__3__Impl"


    // $ANTLR start "rule__Boolsample__Group__4"
    // InternalStoex.g:5552:1: rule__Boolsample__Group__4 : rule__Boolsample__Group__4__Impl ;
    public final void rule__Boolsample__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5556:1: ( rule__Boolsample__Group__4__Impl )
            // InternalStoex.g:5557:2: rule__Boolsample__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Boolsample__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolsample__Group__4"


    // $ANTLR start "rule__Boolsample__Group__4__Impl"
    // InternalStoex.g:5563:1: rule__Boolsample__Group__4__Impl : ( RULE_RPAREN ) ;
    public final void rule__Boolsample__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5567:1: ( ( RULE_RPAREN ) )
            // InternalStoex.g:5568:1: ( RULE_RPAREN )
            {
            // InternalStoex.g:5568:1: ( RULE_RPAREN )
            // InternalStoex.g:5569:2: RULE_RPAREN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolsampleAccess().getRPARENTerminalRuleCall_4()); 
            }
            match(input,RULE_RPAREN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolsampleAccess().getRPARENTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolsample__Group__4__Impl"


    // $ANTLR start "rule__SIGNED_NUMBER__Group__0"
    // InternalStoex.g:5579:1: rule__SIGNED_NUMBER__Group__0 : rule__SIGNED_NUMBER__Group__0__Impl rule__SIGNED_NUMBER__Group__1 ;
    public final void rule__SIGNED_NUMBER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5583:1: ( rule__SIGNED_NUMBER__Group__0__Impl rule__SIGNED_NUMBER__Group__1 )
            // InternalStoex.g:5584:2: rule__SIGNED_NUMBER__Group__0__Impl rule__SIGNED_NUMBER__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__SIGNED_NUMBER__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SIGNED_NUMBER__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SIGNED_NUMBER__Group__0"


    // $ANTLR start "rule__SIGNED_NUMBER__Group__0__Impl"
    // InternalStoex.g:5591:1: rule__SIGNED_NUMBER__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SIGNED_NUMBER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5595:1: ( ( ( '-' )? ) )
            // InternalStoex.g:5596:1: ( ( '-' )? )
            {
            // InternalStoex.g:5596:1: ( ( '-' )? )
            // InternalStoex.g:5597:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSIGNED_NUMBERAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalStoex.g:5598:2: ( '-' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==41) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalStoex.g:5598:3: '-'
                    {
                    match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSIGNED_NUMBERAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SIGNED_NUMBER__Group__0__Impl"


    // $ANTLR start "rule__SIGNED_NUMBER__Group__1"
    // InternalStoex.g:5606:1: rule__SIGNED_NUMBER__Group__1 : rule__SIGNED_NUMBER__Group__1__Impl ;
    public final void rule__SIGNED_NUMBER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5610:1: ( rule__SIGNED_NUMBER__Group__1__Impl )
            // InternalStoex.g:5611:2: rule__SIGNED_NUMBER__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SIGNED_NUMBER__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SIGNED_NUMBER__Group__1"


    // $ANTLR start "rule__SIGNED_NUMBER__Group__1__Impl"
    // InternalStoex.g:5617:1: rule__SIGNED_NUMBER__Group__1__Impl : ( RULE_DOUBLE ) ;
    public final void rule__SIGNED_NUMBER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5621:1: ( ( RULE_DOUBLE ) )
            // InternalStoex.g:5622:1: ( RULE_DOUBLE )
            {
            // InternalStoex.g:5622:1: ( RULE_DOUBLE )
            // InternalStoex.g:5623:2: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSIGNED_NUMBERAccess().getDOUBLETerminalRuleCall_1()); 
            }
            match(input,RULE_DOUBLE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSIGNED_NUMBERAccess().getDOUBLETerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SIGNED_NUMBER__Group__1__Impl"


    // $ANTLR start "rule__SIGNED_INT__Group__0"
    // InternalStoex.g:5633:1: rule__SIGNED_INT__Group__0 : rule__SIGNED_INT__Group__0__Impl rule__SIGNED_INT__Group__1 ;
    public final void rule__SIGNED_INT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5637:1: ( rule__SIGNED_INT__Group__0__Impl rule__SIGNED_INT__Group__1 )
            // InternalStoex.g:5638:2: rule__SIGNED_INT__Group__0__Impl rule__SIGNED_INT__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__SIGNED_INT__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SIGNED_INT__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SIGNED_INT__Group__0"


    // $ANTLR start "rule__SIGNED_INT__Group__0__Impl"
    // InternalStoex.g:5645:1: rule__SIGNED_INT__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SIGNED_INT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5649:1: ( ( ( '-' )? ) )
            // InternalStoex.g:5650:1: ( ( '-' )? )
            {
            // InternalStoex.g:5650:1: ( ( '-' )? )
            // InternalStoex.g:5651:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSIGNED_INTAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalStoex.g:5652:2: ( '-' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==41) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalStoex.g:5652:3: '-'
                    {
                    match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSIGNED_INTAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SIGNED_INT__Group__0__Impl"


    // $ANTLR start "rule__SIGNED_INT__Group__1"
    // InternalStoex.g:5660:1: rule__SIGNED_INT__Group__1 : rule__SIGNED_INT__Group__1__Impl ;
    public final void rule__SIGNED_INT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5664:1: ( rule__SIGNED_INT__Group__1__Impl )
            // InternalStoex.g:5665:2: rule__SIGNED_INT__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SIGNED_INT__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SIGNED_INT__Group__1"


    // $ANTLR start "rule__SIGNED_INT__Group__1__Impl"
    // InternalStoex.g:5671:1: rule__SIGNED_INT__Group__1__Impl : ( RULE_DECINT ) ;
    public final void rule__SIGNED_INT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5675:1: ( ( RULE_DECINT ) )
            // InternalStoex.g:5676:1: ( RULE_DECINT )
            {
            // InternalStoex.g:5676:1: ( RULE_DECINT )
            // InternalStoex.g:5677:2: RULE_DECINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSIGNED_INTAccess().getDECINTTerminalRuleCall_1()); 
            }
            match(input,RULE_DECINT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSIGNED_INTAccess().getDECINTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SIGNED_INT__Group__1__Impl"


    // $ANTLR start "rule__IfelseExpr__IfExpressionAssignment_1_2"
    // InternalStoex.g:5687:1: rule__IfelseExpr__IfExpressionAssignment_1_2 : ( ruleboolAndExpr ) ;
    public final void rule__IfelseExpr__IfExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5691:1: ( ( ruleboolAndExpr ) )
            // InternalStoex.g:5692:2: ( ruleboolAndExpr )
            {
            // InternalStoex.g:5692:2: ( ruleboolAndExpr )
            // InternalStoex.g:5693:3: ruleboolAndExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfelseExprAccess().getIfExpressionBoolAndExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleboolAndExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfelseExprAccess().getIfExpressionBoolAndExprParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfelseExpr__IfExpressionAssignment_1_2"


    // $ANTLR start "rule__IfelseExpr__ElseExpressionAssignment_1_4"
    // InternalStoex.g:5702:1: rule__IfelseExpr__ElseExpressionAssignment_1_4 : ( ruleboolAndExpr ) ;
    public final void rule__IfelseExpr__ElseExpressionAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5706:1: ( ( ruleboolAndExpr ) )
            // InternalStoex.g:5707:2: ( ruleboolAndExpr )
            {
            // InternalStoex.g:5707:2: ( ruleboolAndExpr )
            // InternalStoex.g:5708:3: ruleboolAndExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfelseExprAccess().getElseExpressionBoolAndExprParserRuleCall_1_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleboolAndExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfelseExprAccess().getElseExpressionBoolAndExprParserRuleCall_1_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfelseExpr__ElseExpressionAssignment_1_4"


    // $ANTLR start "rule__BoolAndExpr__OperationAssignment_1_1"
    // InternalStoex.g:5717:1: rule__BoolAndExpr__OperationAssignment_1_1 : ( ruleandoperation ) ;
    public final void rule__BoolAndExpr__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5721:1: ( ( ruleandoperation ) )
            // InternalStoex.g:5722:2: ( ruleandoperation )
            {
            // InternalStoex.g:5722:2: ( ruleandoperation )
            // InternalStoex.g:5723:3: ruleandoperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAndExprAccess().getOperationAndoperationEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleandoperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolAndExprAccess().getOperationAndoperationEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolAndExpr__OperationAssignment_1_1"


    // $ANTLR start "rule__BoolAndExpr__RightAssignment_1_2"
    // InternalStoex.g:5732:1: rule__BoolAndExpr__RightAssignment_1_2 : ( ruleboolOrExpr ) ;
    public final void rule__BoolAndExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5736:1: ( ( ruleboolOrExpr ) )
            // InternalStoex.g:5737:2: ( ruleboolOrExpr )
            {
            // InternalStoex.g:5737:2: ( ruleboolOrExpr )
            // InternalStoex.g:5738:3: ruleboolOrExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAndExprAccess().getRightBoolOrExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleboolOrExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolAndExprAccess().getRightBoolOrExprParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolAndExpr__RightAssignment_1_2"


    // $ANTLR start "rule__BoolOrExpr__OperationAssignment_1_1"
    // InternalStoex.g:5747:1: rule__BoolOrExpr__OperationAssignment_1_1 : ( ruleoroperations ) ;
    public final void rule__BoolOrExpr__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5751:1: ( ( ruleoroperations ) )
            // InternalStoex.g:5752:2: ( ruleoroperations )
            {
            // InternalStoex.g:5752:2: ( ruleoroperations )
            // InternalStoex.g:5753:3: ruleoroperations
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolOrExprAccess().getOperationOroperationsEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleoroperations();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolOrExprAccess().getOperationOroperationsEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOrExpr__OperationAssignment_1_1"


    // $ANTLR start "rule__BoolOrExpr__RightAssignment_1_2"
    // InternalStoex.g:5762:1: rule__BoolOrExpr__RightAssignment_1_2 : ( rulecompareExpr ) ;
    public final void rule__BoolOrExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5766:1: ( ( rulecompareExpr ) )
            // InternalStoex.g:5767:2: ( rulecompareExpr )
            {
            // InternalStoex.g:5767:2: ( rulecompareExpr )
            // InternalStoex.g:5768:3: rulecompareExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolOrExprAccess().getRightCompareExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulecompareExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolOrExprAccess().getRightCompareExprParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOrExpr__RightAssignment_1_2"


    // $ANTLR start "rule__CompareExpr__OperationAssignment_1_1"
    // InternalStoex.g:5777:1: rule__CompareExpr__OperationAssignment_1_1 : ( ruleCompareOperations ) ;
    public final void rule__CompareExpr__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5781:1: ( ( ruleCompareOperations ) )
            // InternalStoex.g:5782:2: ( ruleCompareOperations )
            {
            // InternalStoex.g:5782:2: ( ruleCompareOperations )
            // InternalStoex.g:5783:3: ruleCompareOperations
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExprAccess().getOperationCompareOperationsEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCompareOperations();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExprAccess().getOperationCompareOperationsEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpr__OperationAssignment_1_1"


    // $ANTLR start "rule__CompareExpr__RightAssignment_1_2"
    // InternalStoex.g:5792:1: rule__CompareExpr__RightAssignment_1_2 : ( rulesumExpr ) ;
    public final void rule__CompareExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5796:1: ( ( rulesumExpr ) )
            // InternalStoex.g:5797:2: ( rulesumExpr )
            {
            // InternalStoex.g:5797:2: ( rulesumExpr )
            // InternalStoex.g:5798:3: rulesumExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExprAccess().getRightSumExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulesumExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExprAccess().getRightSumExprParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpr__RightAssignment_1_2"


    // $ANTLR start "rule__SumExpr__OperationAssignment_1_1"
    // InternalStoex.g:5807:1: rule__SumExpr__OperationAssignment_1_1 : ( ruleTermOperations ) ;
    public final void rule__SumExpr__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5811:1: ( ( ruleTermOperations ) )
            // InternalStoex.g:5812:2: ( ruleTermOperations )
            {
            // InternalStoex.g:5812:2: ( ruleTermOperations )
            // InternalStoex.g:5813:3: ruleTermOperations
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumExprAccess().getOperationTermOperationsEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTermOperations();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumExprAccess().getOperationTermOperationsEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumExpr__OperationAssignment_1_1"


    // $ANTLR start "rule__SumExpr__RightAssignment_1_2"
    // InternalStoex.g:5822:1: rule__SumExpr__RightAssignment_1_2 : ( ruleprodExpr ) ;
    public final void rule__SumExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5826:1: ( ( ruleprodExpr ) )
            // InternalStoex.g:5827:2: ( ruleprodExpr )
            {
            // InternalStoex.g:5827:2: ( ruleprodExpr )
            // InternalStoex.g:5828:3: ruleprodExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumExprAccess().getRightProdExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleprodExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumExprAccess().getRightProdExprParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumExpr__RightAssignment_1_2"


    // $ANTLR start "rule__ProdExpr__OperationAssignment_1_1"
    // InternalStoex.g:5837:1: rule__ProdExpr__OperationAssignment_1_1 : ( ruleProductOperations ) ;
    public final void rule__ProdExpr__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5841:1: ( ( ruleProductOperations ) )
            // InternalStoex.g:5842:2: ( ruleProductOperations )
            {
            // InternalStoex.g:5842:2: ( ruleProductOperations )
            // InternalStoex.g:5843:3: ruleProductOperations
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProdExprAccess().getOperationProductOperationsEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleProductOperations();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProdExprAccess().getOperationProductOperationsEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdExpr__OperationAssignment_1_1"


    // $ANTLR start "rule__ProdExpr__RightAssignment_1_2"
    // InternalStoex.g:5852:1: rule__ProdExpr__RightAssignment_1_2 : ( rulepowExpr ) ;
    public final void rule__ProdExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5856:1: ( ( rulepowExpr ) )
            // InternalStoex.g:5857:2: ( rulepowExpr )
            {
            // InternalStoex.g:5857:2: ( rulepowExpr )
            // InternalStoex.g:5858:3: rulepowExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProdExprAccess().getRightPowExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulepowExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProdExprAccess().getRightPowExprParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdExpr__RightAssignment_1_2"


    // $ANTLR start "rule__PowExpr__ExponentAssignment_1_2"
    // InternalStoex.g:5867:1: rule__PowExpr__ExponentAssignment_1_2 : ( ruleunaryExpr ) ;
    public final void rule__PowExpr__ExponentAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5871:1: ( ( ruleunaryExpr ) )
            // InternalStoex.g:5872:2: ( ruleunaryExpr )
            {
            // InternalStoex.g:5872:2: ( ruleunaryExpr )
            // InternalStoex.g:5873:3: ruleunaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExprAccess().getExponentUnaryExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleunaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowExprAccess().getExponentUnaryExprParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpr__ExponentAssignment_1_2"


    // $ANTLR start "rule__NotExpression__InnerAssignment_1"
    // InternalStoex.g:5882:1: rule__NotExpression__InnerAssignment_1 : ( ruleunaryExpr ) ;
    public final void rule__NotExpression__InnerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5886:1: ( ( ruleunaryExpr ) )
            // InternalStoex.g:5887:2: ( ruleunaryExpr )
            {
            // InternalStoex.g:5887:2: ( ruleunaryExpr )
            // InternalStoex.g:5888:3: ruleunaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getInnerUnaryExprParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleunaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getInnerUnaryExprParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__InnerAssignment_1"


    // $ANTLR start "rule__NegativeExpression__InnerAssignment_1"
    // InternalStoex.g:5897:1: rule__NegativeExpression__InnerAssignment_1 : ( ruleunaryExpr ) ;
    public final void rule__NegativeExpression__InnerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5901:1: ( ( ruleunaryExpr ) )
            // InternalStoex.g:5902:2: ( ruleunaryExpr )
            {
            // InternalStoex.g:5902:2: ( ruleunaryExpr )
            // InternalStoex.g:5903:3: ruleunaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeExpressionAccess().getInnerUnaryExprParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleunaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeExpressionAccess().getInnerUnaryExprParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeExpression__InnerAssignment_1"


    // $ANTLR start "rule__DoubleLiteral__ValueAssignment_0"
    // InternalStoex.g:5912:1: rule__DoubleLiteral__ValueAssignment_0 : ( RULE_DOUBLE ) ;
    public final void rule__DoubleLiteral__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5916:1: ( ( RULE_DOUBLE ) )
            // InternalStoex.g:5917:2: ( RULE_DOUBLE )
            {
            // InternalStoex.g:5917:2: ( RULE_DOUBLE )
            // InternalStoex.g:5918:3: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLiteralAccess().getValueDOUBLETerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOUBLE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleLiteralAccess().getValueDOUBLETerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__ValueAssignment_0"


    // $ANTLR start "rule__DoubleLiteral__UnitAssignment_1_1"
    // InternalStoex.g:5927:1: rule__DoubleLiteral__UnitAssignment_1_1 : ( ruleUnit ) ;
    public final void rule__DoubleLiteral__UnitAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5931:1: ( ( ruleUnit ) )
            // InternalStoex.g:5932:2: ( ruleUnit )
            {
            // InternalStoex.g:5932:2: ( ruleUnit )
            // InternalStoex.g:5933:3: ruleUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLiteralAccess().getUnitUnitParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleLiteralAccess().getUnitUnitParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__UnitAssignment_1_1"


    // $ANTLR start "rule__ProbabilityFunctionLiteral__Function_ProbabilityFunctionLiteralAssignment"
    // InternalStoex.g:5942:1: rule__ProbabilityFunctionLiteral__Function_ProbabilityFunctionLiteralAssignment : ( ruledefinition ) ;
    public final void rule__ProbabilityFunctionLiteral__Function_ProbabilityFunctionLiteralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5946:1: ( ( ruledefinition ) )
            // InternalStoex.g:5947:2: ( ruledefinition )
            {
            // InternalStoex.g:5947:2: ( ruledefinition )
            // InternalStoex.g:5948:3: ruledefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityFunctionLiteralAccess().getFunction_ProbabilityFunctionLiteralDefinitionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruledefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityFunctionLiteralAccess().getFunction_ProbabilityFunctionLiteralDefinitionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityFunctionLiteral__Function_ProbabilityFunctionLiteralAssignment"


    // $ANTLR start "rule__Parenthesis__InnerExpressionAssignment_1"
    // InternalStoex.g:5957:1: rule__Parenthesis__InnerExpressionAssignment_1 : ( ruleifelseExpr ) ;
    public final void rule__Parenthesis__InnerExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5961:1: ( ( ruleifelseExpr ) )
            // InternalStoex.g:5962:2: ( ruleifelseExpr )
            {
            // InternalStoex.g:5962:2: ( ruleifelseExpr )
            // InternalStoex.g:5963:3: ruleifelseExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisAccess().getInnerExpressionIfelseExprParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleifelseExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisAccess().getInnerExpressionIfelseExprParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__InnerExpressionAssignment_1"


    // $ANTLR start "rule__FunctionLiteral__IdAssignment_0"
    // InternalStoex.g:5972:1: rule__FunctionLiteral__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionLiteral__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5976:1: ( ( RULE_ID ) )
            // InternalStoex.g:5977:2: ( RULE_ID )
            {
            // InternalStoex.g:5977:2: ( RULE_ID )
            // InternalStoex.g:5978:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionLiteralAccess().getIdIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionLiteralAccess().getIdIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionLiteral__IdAssignment_0"


    // $ANTLR start "rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_0"
    // InternalStoex.g:5987:1: rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_0 : ( ruleboolAndExpr ) ;
    public final void rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5991:1: ( ( ruleboolAndExpr ) )
            // InternalStoex.g:5992:2: ( ruleboolAndExpr )
            {
            // InternalStoex.g:5992:2: ( ruleboolAndExpr )
            // InternalStoex.g:5993:3: ruleboolAndExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionLiteralAccess().getParameters_FunctionLiteralBoolAndExprParserRuleCall_2_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleboolAndExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionLiteralAccess().getParameters_FunctionLiteralBoolAndExprParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_0"


    // $ANTLR start "rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_1_1"
    // InternalStoex.g:6002:1: rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_1_1 : ( ruleboolAndExpr ) ;
    public final void rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6006:1: ( ( ruleboolAndExpr ) )
            // InternalStoex.g:6007:2: ( ruleboolAndExpr )
            {
            // InternalStoex.g:6007:2: ( ruleboolAndExpr )
            // InternalStoex.g:6008:3: ruleboolAndExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionLiteralAccess().getParameters_FunctionLiteralBoolAndExprParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleboolAndExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionLiteralAccess().getParameters_FunctionLiteralBoolAndExprParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_1_1"


    // $ANTLR start "rule__Variable__Id_VariableAssignment"
    // InternalStoex.g:6017:1: rule__Variable__Id_VariableAssignment : ( ruleAbstractNamedReference ) ;
    public final void rule__Variable__Id_VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6021:1: ( ( ruleAbstractNamedReference ) )
            // InternalStoex.g:6022:2: ( ruleAbstractNamedReference )
            {
            // InternalStoex.g:6022:2: ( ruleAbstractNamedReference )
            // InternalStoex.g:6023:3: ruleAbstractNamedReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getId_VariableAbstractNamedReferenceParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAbstractNamedReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getId_VariableAbstractNamedReferenceParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Id_VariableAssignment"


    // $ANTLR start "rule__VariableReference__ReferenceNameAssignment"
    // InternalStoex.g:6032:1: rule__VariableReference__ReferenceNameAssignment : ( RULE_ID ) ;
    public final void rule__VariableReference__ReferenceNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6036:1: ( ( RULE_ID ) )
            // InternalStoex.g:6037:2: ( RULE_ID )
            {
            // InternalStoex.g:6037:2: ( RULE_ID )
            // InternalStoex.g:6038:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getReferenceNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getReferenceNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__ReferenceNameAssignment"


    // $ANTLR start "rule__NamespaceReference__ReferenceNameAssignment_0"
    // InternalStoex.g:6047:1: rule__NamespaceReference__ReferenceNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NamespaceReference__ReferenceNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6051:1: ( ( RULE_ID ) )
            // InternalStoex.g:6052:2: ( RULE_ID )
            {
            // InternalStoex.g:6052:2: ( RULE_ID )
            // InternalStoex.g:6053:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceReferenceAccess().getReferenceNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceReferenceAccess().getReferenceNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceReference__ReferenceNameAssignment_0"


    // $ANTLR start "rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2"
    // InternalStoex.g:6062:1: rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2 : ( ruleAbstractNamedReference ) ;
    public final void rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6066:1: ( ( ruleAbstractNamedReference ) )
            // InternalStoex.g:6067:2: ( ruleAbstractNamedReference )
            {
            // InternalStoex.g:6067:2: ( ruleAbstractNamedReference )
            // InternalStoex.g:6068:3: ruleAbstractNamedReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceReferenceAccess().getInnerReference_NamespaceReferenceAbstractNamedReferenceParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAbstractNamedReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceReferenceAccess().getInnerReference_NamespaceReferenceAbstractNamedReferenceParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2"


    // $ANTLR start "rule__BoolLiteral__ValueAssignment"
    // InternalStoex.g:6077:1: rule__BoolLiteral__ValueAssignment : ( RULE_BOOLEAN_KEYWORDS ) ;
    public final void rule__BoolLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6081:1: ( ( RULE_BOOLEAN_KEYWORDS ) )
            // InternalStoex.g:6082:2: ( RULE_BOOLEAN_KEYWORDS )
            {
            // InternalStoex.g:6082:2: ( RULE_BOOLEAN_KEYWORDS )
            // InternalStoex.g:6083:3: RULE_BOOLEAN_KEYWORDS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolLiteralAccess().getValueBOOLEAN_KEYWORDSTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN_KEYWORDS,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolLiteralAccess().getValueBOOLEAN_KEYWORDSTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolLiteral__ValueAssignment"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // InternalStoex.g:6092:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6096:1: ( ( RULE_STRING ) )
            // InternalStoex.g:6097:2: ( RULE_STRING )
            {
            // InternalStoex.g:6097:2: ( RULE_STRING )
            // InternalStoex.g:6098:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__IntLiteral__ValueAssignment_0"
    // InternalStoex.g:6107:1: rule__IntLiteral__ValueAssignment_0 : ( RULE_DECINT ) ;
    public final void rule__IntLiteral__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6111:1: ( ( RULE_DECINT ) )
            // InternalStoex.g:6112:2: ( RULE_DECINT )
            {
            // InternalStoex.g:6112:2: ( RULE_DECINT )
            // InternalStoex.g:6113:3: RULE_DECINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueDECINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DECINT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralAccess().getValueDECINTTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__ValueAssignment_0"


    // $ANTLR start "rule__IntLiteral__UnitAssignment_1_1"
    // InternalStoex.g:6122:1: rule__IntLiteral__UnitAssignment_1_1 : ( ruleUnit ) ;
    public final void rule__IntLiteral__UnitAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6126:1: ( ( ruleUnit ) )
            // InternalStoex.g:6127:2: ( ruleUnit )
            {
            // InternalStoex.g:6127:2: ( ruleUnit )
            // InternalStoex.g:6128:3: ruleUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getUnitUnitParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralAccess().getUnitUnitParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__UnitAssignment_1_1"


    // $ANTLR start "rule__UnitDiv__DivisorAssignment_1_2"
    // InternalStoex.g:6137:1: rule__UnitDiv__DivisorAssignment_1_2 : ( ruleUnit ) ;
    public final void rule__UnitDiv__DivisorAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6141:1: ( ( ruleUnit ) )
            // InternalStoex.g:6142:2: ( ruleUnit )
            {
            // InternalStoex.g:6142:2: ( ruleUnit )
            // InternalStoex.g:6143:3: ruleUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitDivAccess().getDivisorUnitParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitDivAccess().getDivisorUnitParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitDiv__DivisorAssignment_1_2"


    // $ANTLR start "rule__UnitMulti__UnitsAssignment_1_2"
    // InternalStoex.g:6152:1: rule__UnitMulti__UnitsAssignment_1_2 : ( ruleUnit ) ;
    public final void rule__UnitMulti__UnitsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6156:1: ( ( ruleUnit ) )
            // InternalStoex.g:6157:2: ( ruleUnit )
            {
            // InternalStoex.g:6157:2: ( ruleUnit )
            // InternalStoex.g:6158:3: ruleUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitMultiAccess().getUnitsUnitParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitMultiAccess().getUnitsUnitParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitMulti__UnitsAssignment_1_2"


    // $ANTLR start "rule__UnitPow__ExponentAssignment_1_2"
    // InternalStoex.g:6167:1: rule__UnitPow__ExponentAssignment_1_2 : ( ruleSIGNED_INT ) ;
    public final void rule__UnitPow__ExponentAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6171:1: ( ( ruleSIGNED_INT ) )
            // InternalStoex.g:6172:2: ( ruleSIGNED_INT )
            {
            // InternalStoex.g:6172:2: ( ruleSIGNED_INT )
            // InternalStoex.g:6173:3: ruleSIGNED_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitPowAccess().getExponentSIGNED_INTParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSIGNED_INT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitPowAccess().getExponentSIGNED_INTParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitPow__ExponentAssignment_1_2"


    // $ANTLR start "rule__BaseUnit__NameAssignment"
    // InternalStoex.g:6182:1: rule__BaseUnit__NameAssignment : ( ruleUnitNames ) ;
    public final void rule__BaseUnit__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6186:1: ( ( ruleUnitNames ) )
            // InternalStoex.g:6187:2: ( ruleUnitNames )
            {
            // InternalStoex.g:6187:2: ( ruleUnitNames )
            // InternalStoex.g:6188:3: ruleUnitNames
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseUnitAccess().getNameUnitNamesEnumRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnitNames();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseUnitAccess().getNameUnitNamesEnumRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseUnit__NameAssignment"


    // $ANTLR start "rule__BoxedPDF__SamplesAssignment_2"
    // InternalStoex.g:6197:1: rule__BoxedPDF__SamplesAssignment_2 : ( rulereal_pdf_sample ) ;
    public final void rule__BoxedPDF__SamplesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6201:1: ( ( rulereal_pdf_sample ) )
            // InternalStoex.g:6202:2: ( rulereal_pdf_sample )
            {
            // InternalStoex.g:6202:2: ( rulereal_pdf_sample )
            // InternalStoex.g:6203:3: rulereal_pdf_sample
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoxedPDFAccess().getSamplesReal_pdf_sampleParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulereal_pdf_sample();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoxedPDFAccess().getSamplesReal_pdf_sampleParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedPDF__SamplesAssignment_2"


    // $ANTLR start "rule__BoxedPDF__UnitAssignment_4_1"
    // InternalStoex.g:6212:1: rule__BoxedPDF__UnitAssignment_4_1 : ( ruleUnit ) ;
    public final void rule__BoxedPDF__UnitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6216:1: ( ( ruleUnit ) )
            // InternalStoex.g:6217:2: ( ruleUnit )
            {
            // InternalStoex.g:6217:2: ( ruleUnit )
            // InternalStoex.g:6218:3: ruleUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoxedPDFAccess().getUnitUnitParserRuleCall_4_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoxedPDFAccess().getUnitUnitParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxedPDF__UnitAssignment_4_1"


    // $ANTLR start "rule__ProbabilityMassFunction__SamplesAssignment_0_2"
    // InternalStoex.g:6227:1: rule__ProbabilityMassFunction__SamplesAssignment_0_2 : ( rulenumeric_int_sample ) ;
    public final void rule__ProbabilityMassFunction__SamplesAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6231:1: ( ( rulenumeric_int_sample ) )
            // InternalStoex.g:6232:2: ( rulenumeric_int_sample )
            {
            // InternalStoex.g:6232:2: ( rulenumeric_int_sample )
            // InternalStoex.g:6233:3: rulenumeric_int_sample
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSamplesNumeric_int_sampleParserRuleCall_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulenumeric_int_sample();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSamplesNumeric_int_sampleParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__SamplesAssignment_0_2"


    // $ANTLR start "rule__ProbabilityMassFunction__UnitAssignment_0_4_1"
    // InternalStoex.g:6242:1: rule__ProbabilityMassFunction__UnitAssignment_0_4_1 : ( ruleUnit ) ;
    public final void rule__ProbabilityMassFunction__UnitAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6246:1: ( ( ruleUnit ) )
            // InternalStoex.g:6247:2: ( ruleUnit )
            {
            // InternalStoex.g:6247:2: ( ruleUnit )
            // InternalStoex.g:6248:3: ruleUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getUnitUnitParserRuleCall_0_4_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getUnitUnitParserRuleCall_0_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__UnitAssignment_0_4_1"


    // $ANTLR start "rule__ProbabilityMassFunction__SamplesAssignment_1_2"
    // InternalStoex.g:6257:1: rule__ProbabilityMassFunction__SamplesAssignment_1_2 : ( rulenumeric_real_sample ) ;
    public final void rule__ProbabilityMassFunction__SamplesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6261:1: ( ( rulenumeric_real_sample ) )
            // InternalStoex.g:6262:2: ( rulenumeric_real_sample )
            {
            // InternalStoex.g:6262:2: ( rulenumeric_real_sample )
            // InternalStoex.g:6263:3: rulenumeric_real_sample
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSamplesNumeric_real_sampleParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulenumeric_real_sample();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSamplesNumeric_real_sampleParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__SamplesAssignment_1_2"


    // $ANTLR start "rule__ProbabilityMassFunction__UnitAssignment_1_4_1"
    // InternalStoex.g:6272:1: rule__ProbabilityMassFunction__UnitAssignment_1_4_1 : ( ruleUnit ) ;
    public final void rule__ProbabilityMassFunction__UnitAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6276:1: ( ( ruleUnit ) )
            // InternalStoex.g:6277:2: ( ruleUnit )
            {
            // InternalStoex.g:6277:2: ( ruleUnit )
            // InternalStoex.g:6278:3: ruleUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getUnitUnitParserRuleCall_1_4_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getUnitUnitParserRuleCall_1_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__UnitAssignment_1_4_1"


    // $ANTLR start "rule__ProbabilityMassFunction__OrderedDomainAssignment_2_1_1"
    // InternalStoex.g:6287:1: rule__ProbabilityMassFunction__OrderedDomainAssignment_2_1_1 : ( RULE_ORDERED_DEF ) ;
    public final void rule__ProbabilityMassFunction__OrderedDomainAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6291:1: ( ( RULE_ORDERED_DEF ) )
            // InternalStoex.g:6292:2: ( RULE_ORDERED_DEF )
            {
            // InternalStoex.g:6292:2: ( RULE_ORDERED_DEF )
            // InternalStoex.g:6293:3: RULE_ORDERED_DEF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getOrderedDomainORDERED_DEFTerminalRuleCall_2_1_1_0()); 
            }
            match(input,RULE_ORDERED_DEF,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getOrderedDomainORDERED_DEFTerminalRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__OrderedDomainAssignment_2_1_1"


    // $ANTLR start "rule__ProbabilityMassFunction__SamplesAssignment_2_3"
    // InternalStoex.g:6302:1: rule__ProbabilityMassFunction__SamplesAssignment_2_3 : ( rulestringsample ) ;
    public final void rule__ProbabilityMassFunction__SamplesAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6306:1: ( ( rulestringsample ) )
            // InternalStoex.g:6307:2: ( rulestringsample )
            {
            // InternalStoex.g:6307:2: ( rulestringsample )
            // InternalStoex.g:6308:3: rulestringsample
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSamplesStringsampleParserRuleCall_2_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulestringsample();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSamplesStringsampleParserRuleCall_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__SamplesAssignment_2_3"


    // $ANTLR start "rule__ProbabilityMassFunction__OrderedDomainAssignment_3_1_1"
    // InternalStoex.g:6317:1: rule__ProbabilityMassFunction__OrderedDomainAssignment_3_1_1 : ( RULE_ORDERED_DEF ) ;
    public final void rule__ProbabilityMassFunction__OrderedDomainAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6321:1: ( ( RULE_ORDERED_DEF ) )
            // InternalStoex.g:6322:2: ( RULE_ORDERED_DEF )
            {
            // InternalStoex.g:6322:2: ( RULE_ORDERED_DEF )
            // InternalStoex.g:6323:3: RULE_ORDERED_DEF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getOrderedDomainORDERED_DEFTerminalRuleCall_3_1_1_0()); 
            }
            match(input,RULE_ORDERED_DEF,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getOrderedDomainORDERED_DEFTerminalRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__OrderedDomainAssignment_3_1_1"


    // $ANTLR start "rule__ProbabilityMassFunction__SamplesAssignment_3_3"
    // InternalStoex.g:6332:1: rule__ProbabilityMassFunction__SamplesAssignment_3_3 : ( ruleboolsample ) ;
    public final void rule__ProbabilityMassFunction__SamplesAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6336:1: ( ( ruleboolsample ) )
            // InternalStoex.g:6337:2: ( ruleboolsample )
            {
            // InternalStoex.g:6337:2: ( ruleboolsample )
            // InternalStoex.g:6338:3: ruleboolsample
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSamplesBoolsampleParserRuleCall_3_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleboolsample();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getSamplesBoolsampleParserRuleCall_3_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityMassFunction__SamplesAssignment_3_3"


    // $ANTLR start "rule__Numeric_int_sample__ValueAssignment_1"
    // InternalStoex.g:6347:1: rule__Numeric_int_sample__ValueAssignment_1 : ( ruleSIGNED_INT ) ;
    public final void rule__Numeric_int_sample__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6351:1: ( ( ruleSIGNED_INT ) )
            // InternalStoex.g:6352:2: ( ruleSIGNED_INT )
            {
            // InternalStoex.g:6352:2: ( ruleSIGNED_INT )
            // InternalStoex.g:6353:3: ruleSIGNED_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_int_sampleAccess().getValueSIGNED_INTParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSIGNED_INT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_int_sampleAccess().getValueSIGNED_INTParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_int_sample__ValueAssignment_1"


    // $ANTLR start "rule__Numeric_int_sample__ProbabilityAssignment_3"
    // InternalStoex.g:6362:1: rule__Numeric_int_sample__ProbabilityAssignment_3 : ( RULE_DOUBLE ) ;
    public final void rule__Numeric_int_sample__ProbabilityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6366:1: ( ( RULE_DOUBLE ) )
            // InternalStoex.g:6367:2: ( RULE_DOUBLE )
            {
            // InternalStoex.g:6367:2: ( RULE_DOUBLE )
            // InternalStoex.g:6368:3: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_int_sampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0()); 
            }
            match(input,RULE_DOUBLE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_int_sampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_int_sample__ProbabilityAssignment_3"


    // $ANTLR start "rule__Numeric_real_sample__ValueAssignment_1"
    // InternalStoex.g:6377:1: rule__Numeric_real_sample__ValueAssignment_1 : ( ruleSIGNED_NUMBER ) ;
    public final void rule__Numeric_real_sample__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6381:1: ( ( ruleSIGNED_NUMBER ) )
            // InternalStoex.g:6382:2: ( ruleSIGNED_NUMBER )
            {
            // InternalStoex.g:6382:2: ( ruleSIGNED_NUMBER )
            // InternalStoex.g:6383:3: ruleSIGNED_NUMBER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_real_sampleAccess().getValueSIGNED_NUMBERParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSIGNED_NUMBER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_real_sampleAccess().getValueSIGNED_NUMBERParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_real_sample__ValueAssignment_1"


    // $ANTLR start "rule__Numeric_real_sample__ProbabilityAssignment_3"
    // InternalStoex.g:6392:1: rule__Numeric_real_sample__ProbabilityAssignment_3 : ( RULE_DOUBLE ) ;
    public final void rule__Numeric_real_sample__ProbabilityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6396:1: ( ( RULE_DOUBLE ) )
            // InternalStoex.g:6397:2: ( RULE_DOUBLE )
            {
            // InternalStoex.g:6397:2: ( RULE_DOUBLE )
            // InternalStoex.g:6398:3: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_real_sampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0()); 
            }
            match(input,RULE_DOUBLE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_real_sampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeric_real_sample__ProbabilityAssignment_3"


    // $ANTLR start "rule__Real_pdf_sample__ValueAssignment_1"
    // InternalStoex.g:6407:1: rule__Real_pdf_sample__ValueAssignment_1 : ( ruleSIGNED_NUMBER ) ;
    public final void rule__Real_pdf_sample__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6411:1: ( ( ruleSIGNED_NUMBER ) )
            // InternalStoex.g:6412:2: ( ruleSIGNED_NUMBER )
            {
            // InternalStoex.g:6412:2: ( ruleSIGNED_NUMBER )
            // InternalStoex.g:6413:3: ruleSIGNED_NUMBER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReal_pdf_sampleAccess().getValueSIGNED_NUMBERParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSIGNED_NUMBER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReal_pdf_sampleAccess().getValueSIGNED_NUMBERParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_pdf_sample__ValueAssignment_1"


    // $ANTLR start "rule__Real_pdf_sample__ProbabilityAssignment_3"
    // InternalStoex.g:6422:1: rule__Real_pdf_sample__ProbabilityAssignment_3 : ( RULE_DOUBLE ) ;
    public final void rule__Real_pdf_sample__ProbabilityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6426:1: ( ( RULE_DOUBLE ) )
            // InternalStoex.g:6427:2: ( RULE_DOUBLE )
            {
            // InternalStoex.g:6427:2: ( RULE_DOUBLE )
            // InternalStoex.g:6428:3: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReal_pdf_sampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0()); 
            }
            match(input,RULE_DOUBLE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReal_pdf_sampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real_pdf_sample__ProbabilityAssignment_3"


    // $ANTLR start "rule__Stringsample__ValueAssignment_1"
    // InternalStoex.g:6437:1: rule__Stringsample__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Stringsample__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6441:1: ( ( RULE_STRING ) )
            // InternalStoex.g:6442:2: ( RULE_STRING )
            {
            // InternalStoex.g:6442:2: ( RULE_STRING )
            // InternalStoex.g:6443:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringsampleAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringsampleAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stringsample__ValueAssignment_1"


    // $ANTLR start "rule__Stringsample__ProbabilityAssignment_3"
    // InternalStoex.g:6452:1: rule__Stringsample__ProbabilityAssignment_3 : ( RULE_DOUBLE ) ;
    public final void rule__Stringsample__ProbabilityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6456:1: ( ( RULE_DOUBLE ) )
            // InternalStoex.g:6457:2: ( RULE_DOUBLE )
            {
            // InternalStoex.g:6457:2: ( RULE_DOUBLE )
            // InternalStoex.g:6458:3: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringsampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0()); 
            }
            match(input,RULE_DOUBLE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringsampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stringsample__ProbabilityAssignment_3"


    // $ANTLR start "rule__Boolsample__ValueAssignment_1"
    // InternalStoex.g:6467:1: rule__Boolsample__ValueAssignment_1 : ( RULE_BOOLEAN_KEYWORDS ) ;
    public final void rule__Boolsample__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6471:1: ( ( RULE_BOOLEAN_KEYWORDS ) )
            // InternalStoex.g:6472:2: ( RULE_BOOLEAN_KEYWORDS )
            {
            // InternalStoex.g:6472:2: ( RULE_BOOLEAN_KEYWORDS )
            // InternalStoex.g:6473:3: RULE_BOOLEAN_KEYWORDS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolsampleAccess().getValueBOOLEAN_KEYWORDSTerminalRuleCall_1_0()); 
            }
            match(input,RULE_BOOLEAN_KEYWORDS,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolsampleAccess().getValueBOOLEAN_KEYWORDSTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolsample__ValueAssignment_1"


    // $ANTLR start "rule__Boolsample__ProbabilityAssignment_3"
    // InternalStoex.g:6482:1: rule__Boolsample__ProbabilityAssignment_3 : ( RULE_DOUBLE ) ;
    public final void rule__Boolsample__ProbabilityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6486:1: ( ( RULE_DOUBLE ) )
            // InternalStoex.g:6487:2: ( RULE_DOUBLE )
            {
            // InternalStoex.g:6487:2: ( RULE_DOUBLE )
            // InternalStoex.g:6488:3: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolsampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0()); 
            }
            match(input,RULE_DOUBLE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolsampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolsample__ProbabilityAssignment_3"

    // $ANTLR start synpred11_InternalStoex
    public final void synpred11_InternalStoex_fragment() throws RecognitionException {   
        // InternalStoex.g:1250:2: ( ( ruleunitMulti ) )
        // InternalStoex.g:1250:2: ( ruleunitMulti )
        {
        // InternalStoex.g:1250:2: ( ruleunitMulti )
        // InternalStoex.g:1251:3: ruleunitMulti
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getUnitAccess().getUnitMultiParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleunitMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalStoex

    // $ANTLR start synpred12_InternalStoex
    public final void synpred12_InternalStoex_fragment() throws RecognitionException {   
        // InternalStoex.g:1256:2: ( ( ruleunitDiv ) )
        // InternalStoex.g:1256:2: ( ruleunitDiv )
        {
        // InternalStoex.g:1256:2: ( ruleunitDiv )
        // InternalStoex.g:1257:3: ruleunitDiv
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getUnitAccess().getUnitDivParserRuleCall_1()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleunitDiv();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalStoex

    // $ANTLR start synpred14_InternalStoex
    public final void synpred14_InternalStoex_fragment() throws RecognitionException {   
        // InternalStoex.g:1298:2: ( ( ruleunitMulti ) )
        // InternalStoex.g:1298:2: ( ruleunitMulti )
        {
        // InternalStoex.g:1298:2: ( ruleunitMulti )
        // InternalStoex.g:1299:3: ruleunitMulti
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getUnitPowAccess().getUnitMultiParserRuleCall_0_1_1_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleunitMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalStoex

    // $ANTLR start synpred46_InternalStoex
    public final void synpred46_InternalStoex_fragment() throws RecognitionException {   
        // InternalStoex.g:3483:3: ( rule__UnitMulti__Group_1__0 )
        // InternalStoex.g:3483:3: rule__UnitMulti__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__UnitMulti__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalStoex

    // Delegated rules

    public final boolean synpred11_InternalStoex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalStoex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalStoex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalStoex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalStoex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalStoex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalStoex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalStoex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\5\uffff\1\10\4\uffff";
    static final String dfa_3s = "\1\12\4\uffff\1\4\4\uffff";
    static final String dfa_4s = "\1\30\4\uffff\1\54\4\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\1\6\1\5";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\6\3\uffff\5\7\1\uffff\1\2\1\1\1\5\1\4\1\3",
            "",
            "",
            "",
            "",
            "\3\10\3\uffff\1\11\3\10\21\uffff\16\10",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1167:1: rule__Atom__Alternatives : ( ( ruleIntLiteral ) | ( ruleDoubleLiteral ) | ( ruleStringLiteral ) | ( ruleBoolLiteral ) | ( ruleFunctionLiteral ) | ( ruleVariable ) | ( ruleParenthesis ) | ( ruleProbabilityFunctionLiteral ) );";
        }
    }
    static final String dfa_8s = "\1\12\6\0\3\uffff";
    static final String dfa_9s = "\1\61\6\0\3\uffff";
    static final String dfa_10s = "\7\uffff\1\1\1\2\1\3";
    static final String dfa_11s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\3\uffff}>";
    static final String[] dfa_12s = {
            "\1\6\42\uffff\1\1\1\2\1\3\1\4\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1245:1: rule__Unit__Alternatives : ( ( ruleunitMulti ) | ( ruleunitDiv ) | ( ruleBaseUnit ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_1 = input.LA(1);

                         
                        int index4_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalStoex()) ) {s = 7;}

                        else if ( (synpred12_InternalStoex()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_2 = input.LA(1);

                         
                        int index4_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalStoex()) ) {s = 7;}

                        else if ( (synpred12_InternalStoex()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_3 = input.LA(1);

                         
                        int index4_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalStoex()) ) {s = 7;}

                        else if ( (synpred12_InternalStoex()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_4 = input.LA(1);

                         
                        int index4_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalStoex()) ) {s = 7;}

                        else if ( (synpred12_InternalStoex()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_5 = input.LA(1);

                         
                        int index4_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalStoex()) ) {s = 7;}

                        else if ( (synpred12_InternalStoex()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_6 = input.LA(1);

                         
                        int index4_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalStoex()) ) {s = 7;}

                        else if ( (synpred12_InternalStoex()) ) {s = 8;}

                         
                        input.seek(index4_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000020001F7C480L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000300000002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000FC00000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000030000000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000030000000002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00001C0000000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00001C0000000002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0003E00000000400L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020001F7CC80L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000200000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000402L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000500L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000100000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000800000L});
    }


}