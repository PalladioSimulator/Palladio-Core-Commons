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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_DECINT", "RULE_ID", "RULE_BOOLEAN_KEYWORDS", "RULE_STRING", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AND'", "'BYTESIZE'", "'VALUE'", "'STRUCTURE'", "'TYPE'", "'NUMBER_OF_ELEMENTS'", "'OR'", "'XOR'", "'>'", "'<'", "'=='", "'<>'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'_'", "'unitless'", "'B'", "'s'", "'m'", "'?'", "':'", "'^'", "'NOT'", "'['", "']'", "'('", "')'", "','", "'.'", "'DoublePDF'", "'IntPMF'", "'DoublePMF'", "'EnumPMF'", "'BoolPMF'", "';'", "'ordered'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN_KEYWORDS=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=6;
    public static final int RULE_DIGIT=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=4;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_DECINT=5;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
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
    // InternalStoex.g:488:1: ruleAbstractNamedReference : ( ruleNamespaceReference ) ;
    public final void ruleAbstractNamedReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:492:2: ( ( ruleNamespaceReference ) )
            // InternalStoex.g:493:2: ( ruleNamespaceReference )
            {
            // InternalStoex.g:493:2: ( ruleNamespaceReference )
            // InternalStoex.g:494:3: ruleNamespaceReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractNamedReferenceAccess().getNamespaceReferenceParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNamespaceReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractNamedReferenceAccess().getNamespaceReferenceParserRuleCall()); 
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
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
            case 29:
                {
                alt1=1;
                }
                break;
            case 41:
                {
                alt1=2;
                }
                break;
            case RULE_DOUBLE:
            case RULE_DECINT:
            case RULE_ID:
            case RULE_BOOLEAN_KEYWORDS:
            case RULE_STRING:
            case 44:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
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


    // $ANTLR start "rule__VariableReference__ReferenceNameAlternatives_0"
    // InternalStoex.g:1224:1: rule__VariableReference__ReferenceNameAlternatives_0 : ( ( 'BYTESIZE' ) | ( 'VALUE' ) | ( 'STRUCTURE' ) | ( 'TYPE' ) | ( 'NUMBER_OF_ELEMENTS' ) );
    public final void rule__VariableReference__ReferenceNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1228:1: ( ( 'BYTESIZE' ) | ( 'VALUE' ) | ( 'STRUCTURE' ) | ( 'TYPE' ) | ( 'NUMBER_OF_ELEMENTS' ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 19:
                {
                alt3=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalStoex.g:1229:2: ( 'BYTESIZE' )
                    {
                    // InternalStoex.g:1229:2: ( 'BYTESIZE' )
                    // InternalStoex.g:1230:3: 'BYTESIZE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableReferenceAccess().getReferenceNameBYTESIZEKeyword_0_0()); 
                    }
                    match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableReferenceAccess().getReferenceNameBYTESIZEKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1235:2: ( 'VALUE' )
                    {
                    // InternalStoex.g:1235:2: ( 'VALUE' )
                    // InternalStoex.g:1236:3: 'VALUE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableReferenceAccess().getReferenceNameVALUEKeyword_0_1()); 
                    }
                    match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableReferenceAccess().getReferenceNameVALUEKeyword_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalStoex.g:1241:2: ( 'STRUCTURE' )
                    {
                    // InternalStoex.g:1241:2: ( 'STRUCTURE' )
                    // InternalStoex.g:1242:3: 'STRUCTURE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableReferenceAccess().getReferenceNameSTRUCTUREKeyword_0_2()); 
                    }
                    match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableReferenceAccess().getReferenceNameSTRUCTUREKeyword_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalStoex.g:1247:2: ( 'TYPE' )
                    {
                    // InternalStoex.g:1247:2: ( 'TYPE' )
                    // InternalStoex.g:1248:3: 'TYPE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableReferenceAccess().getReferenceNameTYPEKeyword_0_3()); 
                    }
                    match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableReferenceAccess().getReferenceNameTYPEKeyword_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalStoex.g:1253:2: ( 'NUMBER_OF_ELEMENTS' )
                    {
                    // InternalStoex.g:1253:2: ( 'NUMBER_OF_ELEMENTS' )
                    // InternalStoex.g:1254:3: 'NUMBER_OF_ELEMENTS'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableReferenceAccess().getReferenceNameNUMBER_OF_ELEMENTSKeyword_0_4()); 
                    }
                    match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableReferenceAccess().getReferenceNameNUMBER_OF_ELEMENTSKeyword_0_4()); 
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
    // $ANTLR end "rule__VariableReference__ReferenceNameAlternatives_0"


    // $ANTLR start "rule__NamespaceReference__Alternatives_2"
    // InternalStoex.g:1263:1: rule__NamespaceReference__Alternatives_2 : ( ( ( rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_0 ) ) | ( ( rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_1 ) ) );
    public final void rule__NamespaceReference__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1267:1: ( ( ( rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_0 ) ) | ( ( rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=15 && LA4_0<=19)) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalStoex.g:1268:2: ( ( rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_0 ) )
                    {
                    // InternalStoex.g:1268:2: ( ( rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_0 ) )
                    // InternalStoex.g:1269:3: ( rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNamespaceReferenceAccess().getInnerReference_NamespaceReferenceAssignment_2_0()); 
                    }
                    // InternalStoex.g:1270:3: ( rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_0 )
                    // InternalStoex.g:1270:4: rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNamespaceReferenceAccess().getInnerReference_NamespaceReferenceAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1274:2: ( ( rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_1 ) )
                    {
                    // InternalStoex.g:1274:2: ( ( rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_1 ) )
                    // InternalStoex.g:1275:3: ( rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNamespaceReferenceAccess().getInnerReference_NamespaceReferenceAssignment_2_1()); 
                    }
                    // InternalStoex.g:1276:3: ( rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_1 )
                    // InternalStoex.g:1276:4: rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNamespaceReferenceAccess().getInnerReference_NamespaceReferenceAssignment_2_1()); 
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
    // $ANTLR end "rule__NamespaceReference__Alternatives_2"


    // $ANTLR start "rule__Unit__Alternatives"
    // InternalStoex.g:1284:1: rule__Unit__Alternatives : ( ( ruleunitMulti ) | ( ruleunitDiv ) | ( ruleBaseUnit ) );
    public final void rule__Unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1288:1: ( ( ruleunitMulti ) | ( ruleunitDiv ) | ( ruleBaseUnit ) )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalStoex.g:1289:2: ( ruleunitMulti )
                    {
                    // InternalStoex.g:1289:2: ( ruleunitMulti )
                    // InternalStoex.g:1290:3: ruleunitMulti
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
                    // InternalStoex.g:1295:2: ( ruleunitDiv )
                    {
                    // InternalStoex.g:1295:2: ( ruleunitDiv )
                    // InternalStoex.g:1296:3: ruleunitDiv
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
                    // InternalStoex.g:1301:2: ( ruleBaseUnit )
                    {
                    // InternalStoex.g:1301:2: ( ruleBaseUnit )
                    // InternalStoex.g:1302:3: ruleBaseUnit
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
    // InternalStoex.g:1311:1: rule__UnitPow__Alternatives_0 : ( ( ruleBaseUnit ) | ( ( rule__UnitPow__Group_0_1__0 ) ) );
    public final void rule__UnitPow__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1315:1: ( ( ruleBaseUnit ) | ( ( rule__UnitPow__Group_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=33 && LA6_0<=37)) ) {
                alt6=1;
            }
            else if ( (LA6_0==44) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalStoex.g:1316:2: ( ruleBaseUnit )
                    {
                    // InternalStoex.g:1316:2: ( ruleBaseUnit )
                    // InternalStoex.g:1317:3: ruleBaseUnit
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
                    // InternalStoex.g:1322:2: ( ( rule__UnitPow__Group_0_1__0 ) )
                    {
                    // InternalStoex.g:1322:2: ( ( rule__UnitPow__Group_0_1__0 ) )
                    // InternalStoex.g:1323:3: ( rule__UnitPow__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnitPowAccess().getGroup_0_1()); 
                    }
                    // InternalStoex.g:1324:3: ( rule__UnitPow__Group_0_1__0 )
                    // InternalStoex.g:1324:4: rule__UnitPow__Group_0_1__0
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
    // InternalStoex.g:1332:1: rule__UnitPow__Alternatives_0_1_1 : ( ( ruleunitMulti ) | ( ruleunitDiv ) );
    public final void rule__UnitPow__Alternatives_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1336:1: ( ( ruleunitMulti ) | ( ruleunitDiv ) )
            int alt7=2;
            switch ( input.LA(1) ) {
            case 33:
                {
                int LA7_1 = input.LA(2);

                if ( (synpred18_InternalStoex()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                int LA7_2 = input.LA(2);

                if ( (synpred18_InternalStoex()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                int LA7_3 = input.LA(2);

                if ( (synpred18_InternalStoex()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                int LA7_4 = input.LA(2);

                if ( (synpred18_InternalStoex()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 4, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                int LA7_5 = input.LA(2);

                if ( (synpred18_InternalStoex()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 5, input);

                    throw nvae;
                }
                }
                break;
            case 44:
                {
                int LA7_6 = input.LA(2);

                if ( (synpred18_InternalStoex()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalStoex.g:1337:2: ( ruleunitMulti )
                    {
                    // InternalStoex.g:1337:2: ( ruleunitMulti )
                    // InternalStoex.g:1338:3: ruleunitMulti
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
                    // InternalStoex.g:1343:2: ( ruleunitDiv )
                    {
                    // InternalStoex.g:1343:2: ( ruleunitDiv )
                    // InternalStoex.g:1344:3: ruleunitDiv
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
    // InternalStoex.g:1353:1: rule__Definition__Alternatives : ( ( ruleProbabilityMassFunction ) | ( ruleProbabilityDensityFunction ) );
    public final void rule__Definition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1357:1: ( ( ruleProbabilityMassFunction ) | ( ruleProbabilityDensityFunction ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=49 && LA8_0<=52)) ) {
                alt8=1;
            }
            else if ( (LA8_0==48) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalStoex.g:1358:2: ( ruleProbabilityMassFunction )
                    {
                    // InternalStoex.g:1358:2: ( ruleProbabilityMassFunction )
                    // InternalStoex.g:1359:3: ruleProbabilityMassFunction
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
                    // InternalStoex.g:1364:2: ( ruleProbabilityDensityFunction )
                    {
                    // InternalStoex.g:1364:2: ( ruleProbabilityDensityFunction )
                    // InternalStoex.g:1365:3: ruleProbabilityDensityFunction
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
    // InternalStoex.g:1374:1: rule__ProbabilityMassFunction__Alternatives : ( ( ( rule__ProbabilityMassFunction__Group_0__0 ) ) | ( ( rule__ProbabilityMassFunction__Group_1__0 ) ) | ( ( rule__ProbabilityMassFunction__Group_2__0 ) ) | ( ( rule__ProbabilityMassFunction__Group_3__0 ) ) );
    public final void rule__ProbabilityMassFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1378:1: ( ( ( rule__ProbabilityMassFunction__Group_0__0 ) ) | ( ( rule__ProbabilityMassFunction__Group_1__0 ) ) | ( ( rule__ProbabilityMassFunction__Group_2__0 ) ) | ( ( rule__ProbabilityMassFunction__Group_3__0 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt9=1;
                }
                break;
            case 50:
                {
                alt9=2;
                }
                break;
            case 51:
                {
                alt9=3;
                }
                break;
            case 52:
                {
                alt9=4;
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
                    // InternalStoex.g:1379:2: ( ( rule__ProbabilityMassFunction__Group_0__0 ) )
                    {
                    // InternalStoex.g:1379:2: ( ( rule__ProbabilityMassFunction__Group_0__0 ) )
                    // InternalStoex.g:1380:3: ( rule__ProbabilityMassFunction__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProbabilityMassFunctionAccess().getGroup_0()); 
                    }
                    // InternalStoex.g:1381:3: ( rule__ProbabilityMassFunction__Group_0__0 )
                    // InternalStoex.g:1381:4: rule__ProbabilityMassFunction__Group_0__0
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
                    // InternalStoex.g:1385:2: ( ( rule__ProbabilityMassFunction__Group_1__0 ) )
                    {
                    // InternalStoex.g:1385:2: ( ( rule__ProbabilityMassFunction__Group_1__0 ) )
                    // InternalStoex.g:1386:3: ( rule__ProbabilityMassFunction__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProbabilityMassFunctionAccess().getGroup_1()); 
                    }
                    // InternalStoex.g:1387:3: ( rule__ProbabilityMassFunction__Group_1__0 )
                    // InternalStoex.g:1387:4: rule__ProbabilityMassFunction__Group_1__0
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
                    // InternalStoex.g:1391:2: ( ( rule__ProbabilityMassFunction__Group_2__0 ) )
                    {
                    // InternalStoex.g:1391:2: ( ( rule__ProbabilityMassFunction__Group_2__0 ) )
                    // InternalStoex.g:1392:3: ( rule__ProbabilityMassFunction__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProbabilityMassFunctionAccess().getGroup_2()); 
                    }
                    // InternalStoex.g:1393:3: ( rule__ProbabilityMassFunction__Group_2__0 )
                    // InternalStoex.g:1393:4: rule__ProbabilityMassFunction__Group_2__0
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
                    // InternalStoex.g:1397:2: ( ( rule__ProbabilityMassFunction__Group_3__0 ) )
                    {
                    // InternalStoex.g:1397:2: ( ( rule__ProbabilityMassFunction__Group_3__0 ) )
                    // InternalStoex.g:1398:3: ( rule__ProbabilityMassFunction__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProbabilityMassFunctionAccess().getGroup_3()); 
                    }
                    // InternalStoex.g:1399:3: ( rule__ProbabilityMassFunction__Group_3__0 )
                    // InternalStoex.g:1399:4: rule__ProbabilityMassFunction__Group_3__0
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
    // InternalStoex.g:1407:1: rule__BooleanOperations__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'XOR' ) ) );
    public final void rule__BooleanOperations__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1411:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'XOR' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt10=1;
                }
                break;
            case 20:
                {
                alt10=2;
                }
                break;
            case 21:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalStoex.g:1412:2: ( ( 'AND' ) )
                    {
                    // InternalStoex.g:1412:2: ( ( 'AND' ) )
                    // InternalStoex.g:1413:3: ( 'AND' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperationsAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalStoex.g:1414:3: ( 'AND' )
                    // InternalStoex.g:1414:4: 'AND'
                    {
                    match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperationsAccess().getANDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1418:2: ( ( 'OR' ) )
                    {
                    // InternalStoex.g:1418:2: ( ( 'OR' ) )
                    // InternalStoex.g:1419:3: ( 'OR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperationsAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // InternalStoex.g:1420:3: ( 'OR' )
                    // InternalStoex.g:1420:4: 'OR'
                    {
                    match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperationsAccess().getOREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalStoex.g:1424:2: ( ( 'XOR' ) )
                    {
                    // InternalStoex.g:1424:2: ( ( 'XOR' ) )
                    // InternalStoex.g:1425:3: ( 'XOR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperationsAccess().getXOREnumLiteralDeclaration_2()); 
                    }
                    // InternalStoex.g:1426:3: ( 'XOR' )
                    // InternalStoex.g:1426:4: 'XOR'
                    {
                    match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalStoex.g:1434:1: rule__Oroperations__Alternatives : ( ( ( 'OR' ) ) | ( ( 'XOR' ) ) );
    public final void rule__Oroperations__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1438:1: ( ( ( 'OR' ) ) | ( ( 'XOR' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            else if ( (LA11_0==21) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalStoex.g:1439:2: ( ( 'OR' ) )
                    {
                    // InternalStoex.g:1439:2: ( ( 'OR' ) )
                    // InternalStoex.g:1440:3: ( 'OR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOroperationsAccess().getOREnumLiteralDeclaration_0()); 
                    }
                    // InternalStoex.g:1441:3: ( 'OR' )
                    // InternalStoex.g:1441:4: 'OR'
                    {
                    match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOroperationsAccess().getOREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1445:2: ( ( 'XOR' ) )
                    {
                    // InternalStoex.g:1445:2: ( ( 'XOR' ) )
                    // InternalStoex.g:1446:3: ( 'XOR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOroperationsAccess().getXOREnumLiteralDeclaration_1()); 
                    }
                    // InternalStoex.g:1447:3: ( 'XOR' )
                    // InternalStoex.g:1447:4: 'XOR'
                    {
                    match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalStoex.g:1455:1: rule__CompareOperations__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '==' ) ) | ( ( '<>' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__CompareOperations__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1459:1: ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '==' ) ) | ( ( '<>' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt12=1;
                }
                break;
            case 23:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            case 25:
                {
                alt12=4;
                }
                break;
            case 26:
                {
                alt12=5;
                }
                break;
            case 27:
                {
                alt12=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalStoex.g:1460:2: ( ( '>' ) )
                    {
                    // InternalStoex.g:1460:2: ( ( '>' ) )
                    // InternalStoex.g:1461:3: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationsAccess().getGREATEREnumLiteralDeclaration_0()); 
                    }
                    // InternalStoex.g:1462:3: ( '>' )
                    // InternalStoex.g:1462:4: '>'
                    {
                    match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperationsAccess().getGREATEREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1466:2: ( ( '<' ) )
                    {
                    // InternalStoex.g:1466:2: ( ( '<' ) )
                    // InternalStoex.g:1467:3: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationsAccess().getLESSEnumLiteralDeclaration_1()); 
                    }
                    // InternalStoex.g:1468:3: ( '<' )
                    // InternalStoex.g:1468:4: '<'
                    {
                    match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperationsAccess().getLESSEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalStoex.g:1472:2: ( ( '==' ) )
                    {
                    // InternalStoex.g:1472:2: ( ( '==' ) )
                    // InternalStoex.g:1473:3: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationsAccess().getEQUALSEnumLiteralDeclaration_2()); 
                    }
                    // InternalStoex.g:1474:3: ( '==' )
                    // InternalStoex.g:1474:4: '=='
                    {
                    match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperationsAccess().getEQUALSEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalStoex.g:1478:2: ( ( '<>' ) )
                    {
                    // InternalStoex.g:1478:2: ( ( '<>' ) )
                    // InternalStoex.g:1479:3: ( '<>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationsAccess().getNOTEQUALEnumLiteralDeclaration_3()); 
                    }
                    // InternalStoex.g:1480:3: ( '<>' )
                    // InternalStoex.g:1480:4: '<>'
                    {
                    match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperationsAccess().getNOTEQUALEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalStoex.g:1484:2: ( ( '>=' ) )
                    {
                    // InternalStoex.g:1484:2: ( ( '>=' ) )
                    // InternalStoex.g:1485:3: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationsAccess().getGREATEREQUALEnumLiteralDeclaration_4()); 
                    }
                    // InternalStoex.g:1486:3: ( '>=' )
                    // InternalStoex.g:1486:4: '>='
                    {
                    match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperationsAccess().getGREATEREQUALEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalStoex.g:1490:2: ( ( '<=' ) )
                    {
                    // InternalStoex.g:1490:2: ( ( '<=' ) )
                    // InternalStoex.g:1491:3: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationsAccess().getLESSEQUALEnumLiteralDeclaration_5()); 
                    }
                    // InternalStoex.g:1492:3: ( '<=' )
                    // InternalStoex.g:1492:4: '<='
                    {
                    match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalStoex.g:1500:1: rule__TermOperations__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__TermOperations__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1504:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            else if ( (LA13_0==29) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalStoex.g:1505:2: ( ( '+' ) )
                    {
                    // InternalStoex.g:1505:2: ( ( '+' ) )
                    // InternalStoex.g:1506:3: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermOperationsAccess().getADDEnumLiteralDeclaration_0()); 
                    }
                    // InternalStoex.g:1507:3: ( '+' )
                    // InternalStoex.g:1507:4: '+'
                    {
                    match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermOperationsAccess().getADDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1511:2: ( ( '-' ) )
                    {
                    // InternalStoex.g:1511:2: ( ( '-' ) )
                    // InternalStoex.g:1512:3: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermOperationsAccess().getSUBEnumLiteralDeclaration_1()); 
                    }
                    // InternalStoex.g:1513:3: ( '-' )
                    // InternalStoex.g:1513:4: '-'
                    {
                    match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalStoex.g:1521:1: rule__ProductOperations__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) );
    public final void rule__ProductOperations__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1525:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt14=1;
                }
                break;
            case 31:
                {
                alt14=2;
                }
                break;
            case 32:
                {
                alt14=3;
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
                    // InternalStoex.g:1526:2: ( ( '*' ) )
                    {
                    // InternalStoex.g:1526:2: ( ( '*' ) )
                    // InternalStoex.g:1527:3: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProductOperationsAccess().getMULTEnumLiteralDeclaration_0()); 
                    }
                    // InternalStoex.g:1528:3: ( '*' )
                    // InternalStoex.g:1528:4: '*'
                    {
                    match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProductOperationsAccess().getMULTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1532:2: ( ( '/' ) )
                    {
                    // InternalStoex.g:1532:2: ( ( '/' ) )
                    // InternalStoex.g:1533:3: ( '/' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProductOperationsAccess().getDIVEnumLiteralDeclaration_1()); 
                    }
                    // InternalStoex.g:1534:3: ( '/' )
                    // InternalStoex.g:1534:4: '/'
                    {
                    match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProductOperationsAccess().getDIVEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalStoex.g:1538:2: ( ( '%' ) )
                    {
                    // InternalStoex.g:1538:2: ( ( '%' ) )
                    // InternalStoex.g:1539:3: ( '%' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProductOperationsAccess().getMODEnumLiteralDeclaration_2()); 
                    }
                    // InternalStoex.g:1540:3: ( '%' )
                    // InternalStoex.g:1540:4: '%'
                    {
                    match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalStoex.g:1548:1: rule__UnitNames__Alternatives : ( ( ( '_' ) ) | ( ( 'unitless' ) ) | ( ( 'B' ) ) | ( ( 's' ) ) | ( ( 'm' ) ) );
    public final void rule__UnitNames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1552:1: ( ( ( '_' ) ) | ( ( 'unitless' ) ) | ( ( 'B' ) ) | ( ( 's' ) ) | ( ( 'm' ) ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt15=1;
                }
                break;
            case 34:
                {
                alt15=2;
                }
                break;
            case 35:
                {
                alt15=3;
                }
                break;
            case 36:
                {
                alt15=4;
                }
                break;
            case 37:
                {
                alt15=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalStoex.g:1553:2: ( ( '_' ) )
                    {
                    // InternalStoex.g:1553:2: ( ( '_' ) )
                    // InternalStoex.g:1554:3: ( '_' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnitNamesAccess().getUNITLESSEnumLiteralDeclaration_0()); 
                    }
                    // InternalStoex.g:1555:3: ( '_' )
                    // InternalStoex.g:1555:4: '_'
                    {
                    match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnitNamesAccess().getUNITLESSEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStoex.g:1559:2: ( ( 'unitless' ) )
                    {
                    // InternalStoex.g:1559:2: ( ( 'unitless' ) )
                    // InternalStoex.g:1560:3: ( 'unitless' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnitNamesAccess().getUNITLESSEnumLiteralDeclaration_1()); 
                    }
                    // InternalStoex.g:1561:3: ( 'unitless' )
                    // InternalStoex.g:1561:4: 'unitless'
                    {
                    match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnitNamesAccess().getUNITLESSEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalStoex.g:1565:2: ( ( 'B' ) )
                    {
                    // InternalStoex.g:1565:2: ( ( 'B' ) )
                    // InternalStoex.g:1566:3: ( 'B' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnitNamesAccess().getBYTEEnumLiteralDeclaration_2()); 
                    }
                    // InternalStoex.g:1567:3: ( 'B' )
                    // InternalStoex.g:1567:4: 'B'
                    {
                    match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnitNamesAccess().getBYTEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalStoex.g:1571:2: ( ( 's' ) )
                    {
                    // InternalStoex.g:1571:2: ( ( 's' ) )
                    // InternalStoex.g:1572:3: ( 's' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnitNamesAccess().getSECONDEnumLiteralDeclaration_3()); 
                    }
                    // InternalStoex.g:1573:3: ( 's' )
                    // InternalStoex.g:1573:4: 's'
                    {
                    match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnitNamesAccess().getSECONDEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalStoex.g:1577:2: ( ( 'm' ) )
                    {
                    // InternalStoex.g:1577:2: ( ( 'm' ) )
                    // InternalStoex.g:1578:3: ( 'm' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnitNamesAccess().getMETEREnumLiteralDeclaration_4()); 
                    }
                    // InternalStoex.g:1579:3: ( 'm' )
                    // InternalStoex.g:1579:4: 'm'
                    {
                    match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalStoex.g:1587:1: rule__IfelseExpr__Group__0 : rule__IfelseExpr__Group__0__Impl rule__IfelseExpr__Group__1 ;
    public final void rule__IfelseExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1591:1: ( rule__IfelseExpr__Group__0__Impl rule__IfelseExpr__Group__1 )
            // InternalStoex.g:1592:2: rule__IfelseExpr__Group__0__Impl rule__IfelseExpr__Group__1
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
    // InternalStoex.g:1599:1: rule__IfelseExpr__Group__0__Impl : ( ruleboolAndExpr ) ;
    public final void rule__IfelseExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1603:1: ( ( ruleboolAndExpr ) )
            // InternalStoex.g:1604:1: ( ruleboolAndExpr )
            {
            // InternalStoex.g:1604:1: ( ruleboolAndExpr )
            // InternalStoex.g:1605:2: ruleboolAndExpr
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
    // InternalStoex.g:1614:1: rule__IfelseExpr__Group__1 : rule__IfelseExpr__Group__1__Impl ;
    public final void rule__IfelseExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1618:1: ( rule__IfelseExpr__Group__1__Impl )
            // InternalStoex.g:1619:2: rule__IfelseExpr__Group__1__Impl
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
    // InternalStoex.g:1625:1: rule__IfelseExpr__Group__1__Impl : ( ( rule__IfelseExpr__Group_1__0 )? ) ;
    public final void rule__IfelseExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1629:1: ( ( ( rule__IfelseExpr__Group_1__0 )? ) )
            // InternalStoex.g:1630:1: ( ( rule__IfelseExpr__Group_1__0 )? )
            {
            // InternalStoex.g:1630:1: ( ( rule__IfelseExpr__Group_1__0 )? )
            // InternalStoex.g:1631:2: ( rule__IfelseExpr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfelseExprAccess().getGroup_1()); 
            }
            // InternalStoex.g:1632:2: ( rule__IfelseExpr__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalStoex.g:1632:3: rule__IfelseExpr__Group_1__0
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
    // InternalStoex.g:1641:1: rule__IfelseExpr__Group_1__0 : rule__IfelseExpr__Group_1__0__Impl rule__IfelseExpr__Group_1__1 ;
    public final void rule__IfelseExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1645:1: ( rule__IfelseExpr__Group_1__0__Impl rule__IfelseExpr__Group_1__1 )
            // InternalStoex.g:1646:2: rule__IfelseExpr__Group_1__0__Impl rule__IfelseExpr__Group_1__1
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
    // InternalStoex.g:1653:1: rule__IfelseExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__IfelseExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1657:1: ( ( () ) )
            // InternalStoex.g:1658:1: ( () )
            {
            // InternalStoex.g:1658:1: ( () )
            // InternalStoex.g:1659:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfelseExprAccess().getIfElseExpressionConditionExpressionAction_1_0()); 
            }
            // InternalStoex.g:1660:2: ()
            // InternalStoex.g:1660:3: 
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
    // InternalStoex.g:1668:1: rule__IfelseExpr__Group_1__1 : rule__IfelseExpr__Group_1__1__Impl rule__IfelseExpr__Group_1__2 ;
    public final void rule__IfelseExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1672:1: ( rule__IfelseExpr__Group_1__1__Impl rule__IfelseExpr__Group_1__2 )
            // InternalStoex.g:1673:2: rule__IfelseExpr__Group_1__1__Impl rule__IfelseExpr__Group_1__2
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
    // InternalStoex.g:1680:1: rule__IfelseExpr__Group_1__1__Impl : ( '?' ) ;
    public final void rule__IfelseExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1684:1: ( ( '?' ) )
            // InternalStoex.g:1685:1: ( '?' )
            {
            // InternalStoex.g:1685:1: ( '?' )
            // InternalStoex.g:1686:2: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfelseExprAccess().getQuestionMarkKeyword_1_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfelseExprAccess().getQuestionMarkKeyword_1_1()); 
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
    // InternalStoex.g:1695:1: rule__IfelseExpr__Group_1__2 : rule__IfelseExpr__Group_1__2__Impl rule__IfelseExpr__Group_1__3 ;
    public final void rule__IfelseExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1699:1: ( rule__IfelseExpr__Group_1__2__Impl rule__IfelseExpr__Group_1__3 )
            // InternalStoex.g:1700:2: rule__IfelseExpr__Group_1__2__Impl rule__IfelseExpr__Group_1__3
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
    // InternalStoex.g:1707:1: rule__IfelseExpr__Group_1__2__Impl : ( ( rule__IfelseExpr__IfExpressionAssignment_1_2 ) ) ;
    public final void rule__IfelseExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1711:1: ( ( ( rule__IfelseExpr__IfExpressionAssignment_1_2 ) ) )
            // InternalStoex.g:1712:1: ( ( rule__IfelseExpr__IfExpressionAssignment_1_2 ) )
            {
            // InternalStoex.g:1712:1: ( ( rule__IfelseExpr__IfExpressionAssignment_1_2 ) )
            // InternalStoex.g:1713:2: ( rule__IfelseExpr__IfExpressionAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfelseExprAccess().getIfExpressionAssignment_1_2()); 
            }
            // InternalStoex.g:1714:2: ( rule__IfelseExpr__IfExpressionAssignment_1_2 )
            // InternalStoex.g:1714:3: rule__IfelseExpr__IfExpressionAssignment_1_2
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
    // InternalStoex.g:1722:1: rule__IfelseExpr__Group_1__3 : rule__IfelseExpr__Group_1__3__Impl rule__IfelseExpr__Group_1__4 ;
    public final void rule__IfelseExpr__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1726:1: ( rule__IfelseExpr__Group_1__3__Impl rule__IfelseExpr__Group_1__4 )
            // InternalStoex.g:1727:2: rule__IfelseExpr__Group_1__3__Impl rule__IfelseExpr__Group_1__4
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
    // InternalStoex.g:1734:1: rule__IfelseExpr__Group_1__3__Impl : ( ':' ) ;
    public final void rule__IfelseExpr__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1738:1: ( ( ':' ) )
            // InternalStoex.g:1739:1: ( ':' )
            {
            // InternalStoex.g:1739:1: ( ':' )
            // InternalStoex.g:1740:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfelseExprAccess().getColonKeyword_1_3()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfelseExprAccess().getColonKeyword_1_3()); 
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
    // InternalStoex.g:1749:1: rule__IfelseExpr__Group_1__4 : rule__IfelseExpr__Group_1__4__Impl ;
    public final void rule__IfelseExpr__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1753:1: ( rule__IfelseExpr__Group_1__4__Impl )
            // InternalStoex.g:1754:2: rule__IfelseExpr__Group_1__4__Impl
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
    // InternalStoex.g:1760:1: rule__IfelseExpr__Group_1__4__Impl : ( ( rule__IfelseExpr__ElseExpressionAssignment_1_4 ) ) ;
    public final void rule__IfelseExpr__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1764:1: ( ( ( rule__IfelseExpr__ElseExpressionAssignment_1_4 ) ) )
            // InternalStoex.g:1765:1: ( ( rule__IfelseExpr__ElseExpressionAssignment_1_4 ) )
            {
            // InternalStoex.g:1765:1: ( ( rule__IfelseExpr__ElseExpressionAssignment_1_4 ) )
            // InternalStoex.g:1766:2: ( rule__IfelseExpr__ElseExpressionAssignment_1_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfelseExprAccess().getElseExpressionAssignment_1_4()); 
            }
            // InternalStoex.g:1767:2: ( rule__IfelseExpr__ElseExpressionAssignment_1_4 )
            // InternalStoex.g:1767:3: rule__IfelseExpr__ElseExpressionAssignment_1_4
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
    // InternalStoex.g:1776:1: rule__BoolAndExpr__Group__0 : rule__BoolAndExpr__Group__0__Impl rule__BoolAndExpr__Group__1 ;
    public final void rule__BoolAndExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1780:1: ( rule__BoolAndExpr__Group__0__Impl rule__BoolAndExpr__Group__1 )
            // InternalStoex.g:1781:2: rule__BoolAndExpr__Group__0__Impl rule__BoolAndExpr__Group__1
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
    // InternalStoex.g:1788:1: rule__BoolAndExpr__Group__0__Impl : ( ruleboolOrExpr ) ;
    public final void rule__BoolAndExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1792:1: ( ( ruleboolOrExpr ) )
            // InternalStoex.g:1793:1: ( ruleboolOrExpr )
            {
            // InternalStoex.g:1793:1: ( ruleboolOrExpr )
            // InternalStoex.g:1794:2: ruleboolOrExpr
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
    // InternalStoex.g:1803:1: rule__BoolAndExpr__Group__1 : rule__BoolAndExpr__Group__1__Impl ;
    public final void rule__BoolAndExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1807:1: ( rule__BoolAndExpr__Group__1__Impl )
            // InternalStoex.g:1808:2: rule__BoolAndExpr__Group__1__Impl
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
    // InternalStoex.g:1814:1: rule__BoolAndExpr__Group__1__Impl : ( ( rule__BoolAndExpr__Group_1__0 )* ) ;
    public final void rule__BoolAndExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1818:1: ( ( ( rule__BoolAndExpr__Group_1__0 )* ) )
            // InternalStoex.g:1819:1: ( ( rule__BoolAndExpr__Group_1__0 )* )
            {
            // InternalStoex.g:1819:1: ( ( rule__BoolAndExpr__Group_1__0 )* )
            // InternalStoex.g:1820:2: ( rule__BoolAndExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAndExprAccess().getGroup_1()); 
            }
            // InternalStoex.g:1821:2: ( rule__BoolAndExpr__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==14) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalStoex.g:1821:3: rule__BoolAndExpr__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__BoolAndExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalStoex.g:1830:1: rule__BoolAndExpr__Group_1__0 : rule__BoolAndExpr__Group_1__0__Impl rule__BoolAndExpr__Group_1__1 ;
    public final void rule__BoolAndExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1834:1: ( rule__BoolAndExpr__Group_1__0__Impl rule__BoolAndExpr__Group_1__1 )
            // InternalStoex.g:1835:2: rule__BoolAndExpr__Group_1__0__Impl rule__BoolAndExpr__Group_1__1
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
    // InternalStoex.g:1842:1: rule__BoolAndExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__BoolAndExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1846:1: ( ( () ) )
            // InternalStoex.g:1847:1: ( () )
            {
            // InternalStoex.g:1847:1: ( () )
            // InternalStoex.g:1848:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAndExprAccess().getBooleanOperatorExpressionLeftAction_1_0()); 
            }
            // InternalStoex.g:1849:2: ()
            // InternalStoex.g:1849:3: 
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
    // InternalStoex.g:1857:1: rule__BoolAndExpr__Group_1__1 : rule__BoolAndExpr__Group_1__1__Impl rule__BoolAndExpr__Group_1__2 ;
    public final void rule__BoolAndExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1861:1: ( rule__BoolAndExpr__Group_1__1__Impl rule__BoolAndExpr__Group_1__2 )
            // InternalStoex.g:1862:2: rule__BoolAndExpr__Group_1__1__Impl rule__BoolAndExpr__Group_1__2
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
    // InternalStoex.g:1869:1: rule__BoolAndExpr__Group_1__1__Impl : ( ( rule__BoolAndExpr__OperationAssignment_1_1 ) ) ;
    public final void rule__BoolAndExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1873:1: ( ( ( rule__BoolAndExpr__OperationAssignment_1_1 ) ) )
            // InternalStoex.g:1874:1: ( ( rule__BoolAndExpr__OperationAssignment_1_1 ) )
            {
            // InternalStoex.g:1874:1: ( ( rule__BoolAndExpr__OperationAssignment_1_1 ) )
            // InternalStoex.g:1875:2: ( rule__BoolAndExpr__OperationAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAndExprAccess().getOperationAssignment_1_1()); 
            }
            // InternalStoex.g:1876:2: ( rule__BoolAndExpr__OperationAssignment_1_1 )
            // InternalStoex.g:1876:3: rule__BoolAndExpr__OperationAssignment_1_1
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
    // InternalStoex.g:1884:1: rule__BoolAndExpr__Group_1__2 : rule__BoolAndExpr__Group_1__2__Impl ;
    public final void rule__BoolAndExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1888:1: ( rule__BoolAndExpr__Group_1__2__Impl )
            // InternalStoex.g:1889:2: rule__BoolAndExpr__Group_1__2__Impl
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
    // InternalStoex.g:1895:1: rule__BoolAndExpr__Group_1__2__Impl : ( ( rule__BoolAndExpr__RightAssignment_1_2 ) ) ;
    public final void rule__BoolAndExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1899:1: ( ( ( rule__BoolAndExpr__RightAssignment_1_2 ) ) )
            // InternalStoex.g:1900:1: ( ( rule__BoolAndExpr__RightAssignment_1_2 ) )
            {
            // InternalStoex.g:1900:1: ( ( rule__BoolAndExpr__RightAssignment_1_2 ) )
            // InternalStoex.g:1901:2: ( rule__BoolAndExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAndExprAccess().getRightAssignment_1_2()); 
            }
            // InternalStoex.g:1902:2: ( rule__BoolAndExpr__RightAssignment_1_2 )
            // InternalStoex.g:1902:3: rule__BoolAndExpr__RightAssignment_1_2
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
    // InternalStoex.g:1911:1: rule__BoolOrExpr__Group__0 : rule__BoolOrExpr__Group__0__Impl rule__BoolOrExpr__Group__1 ;
    public final void rule__BoolOrExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1915:1: ( rule__BoolOrExpr__Group__0__Impl rule__BoolOrExpr__Group__1 )
            // InternalStoex.g:1916:2: rule__BoolOrExpr__Group__0__Impl rule__BoolOrExpr__Group__1
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
    // InternalStoex.g:1923:1: rule__BoolOrExpr__Group__0__Impl : ( rulecompareExpr ) ;
    public final void rule__BoolOrExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1927:1: ( ( rulecompareExpr ) )
            // InternalStoex.g:1928:1: ( rulecompareExpr )
            {
            // InternalStoex.g:1928:1: ( rulecompareExpr )
            // InternalStoex.g:1929:2: rulecompareExpr
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
    // InternalStoex.g:1938:1: rule__BoolOrExpr__Group__1 : rule__BoolOrExpr__Group__1__Impl ;
    public final void rule__BoolOrExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1942:1: ( rule__BoolOrExpr__Group__1__Impl )
            // InternalStoex.g:1943:2: rule__BoolOrExpr__Group__1__Impl
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
    // InternalStoex.g:1949:1: rule__BoolOrExpr__Group__1__Impl : ( ( rule__BoolOrExpr__Group_1__0 )* ) ;
    public final void rule__BoolOrExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1953:1: ( ( ( rule__BoolOrExpr__Group_1__0 )* ) )
            // InternalStoex.g:1954:1: ( ( rule__BoolOrExpr__Group_1__0 )* )
            {
            // InternalStoex.g:1954:1: ( ( rule__BoolOrExpr__Group_1__0 )* )
            // InternalStoex.g:1955:2: ( rule__BoolOrExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolOrExprAccess().getGroup_1()); 
            }
            // InternalStoex.g:1956:2: ( rule__BoolOrExpr__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=20 && LA18_0<=21)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalStoex.g:1956:3: rule__BoolOrExpr__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__BoolOrExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalStoex.g:1965:1: rule__BoolOrExpr__Group_1__0 : rule__BoolOrExpr__Group_1__0__Impl rule__BoolOrExpr__Group_1__1 ;
    public final void rule__BoolOrExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1969:1: ( rule__BoolOrExpr__Group_1__0__Impl rule__BoolOrExpr__Group_1__1 )
            // InternalStoex.g:1970:2: rule__BoolOrExpr__Group_1__0__Impl rule__BoolOrExpr__Group_1__1
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
    // InternalStoex.g:1977:1: rule__BoolOrExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__BoolOrExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1981:1: ( ( () ) )
            // InternalStoex.g:1982:1: ( () )
            {
            // InternalStoex.g:1982:1: ( () )
            // InternalStoex.g:1983:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolOrExprAccess().getBooleanOperatorExpressionLeftAction_1_0()); 
            }
            // InternalStoex.g:1984:2: ()
            // InternalStoex.g:1984:3: 
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
    // InternalStoex.g:1992:1: rule__BoolOrExpr__Group_1__1 : rule__BoolOrExpr__Group_1__1__Impl rule__BoolOrExpr__Group_1__2 ;
    public final void rule__BoolOrExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:1996:1: ( rule__BoolOrExpr__Group_1__1__Impl rule__BoolOrExpr__Group_1__2 )
            // InternalStoex.g:1997:2: rule__BoolOrExpr__Group_1__1__Impl rule__BoolOrExpr__Group_1__2
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
    // InternalStoex.g:2004:1: rule__BoolOrExpr__Group_1__1__Impl : ( ( rule__BoolOrExpr__OperationAssignment_1_1 ) ) ;
    public final void rule__BoolOrExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2008:1: ( ( ( rule__BoolOrExpr__OperationAssignment_1_1 ) ) )
            // InternalStoex.g:2009:1: ( ( rule__BoolOrExpr__OperationAssignment_1_1 ) )
            {
            // InternalStoex.g:2009:1: ( ( rule__BoolOrExpr__OperationAssignment_1_1 ) )
            // InternalStoex.g:2010:2: ( rule__BoolOrExpr__OperationAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolOrExprAccess().getOperationAssignment_1_1()); 
            }
            // InternalStoex.g:2011:2: ( rule__BoolOrExpr__OperationAssignment_1_1 )
            // InternalStoex.g:2011:3: rule__BoolOrExpr__OperationAssignment_1_1
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
    // InternalStoex.g:2019:1: rule__BoolOrExpr__Group_1__2 : rule__BoolOrExpr__Group_1__2__Impl ;
    public final void rule__BoolOrExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2023:1: ( rule__BoolOrExpr__Group_1__2__Impl )
            // InternalStoex.g:2024:2: rule__BoolOrExpr__Group_1__2__Impl
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
    // InternalStoex.g:2030:1: rule__BoolOrExpr__Group_1__2__Impl : ( ( rule__BoolOrExpr__RightAssignment_1_2 ) ) ;
    public final void rule__BoolOrExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2034:1: ( ( ( rule__BoolOrExpr__RightAssignment_1_2 ) ) )
            // InternalStoex.g:2035:1: ( ( rule__BoolOrExpr__RightAssignment_1_2 ) )
            {
            // InternalStoex.g:2035:1: ( ( rule__BoolOrExpr__RightAssignment_1_2 ) )
            // InternalStoex.g:2036:2: ( rule__BoolOrExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolOrExprAccess().getRightAssignment_1_2()); 
            }
            // InternalStoex.g:2037:2: ( rule__BoolOrExpr__RightAssignment_1_2 )
            // InternalStoex.g:2037:3: rule__BoolOrExpr__RightAssignment_1_2
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
    // InternalStoex.g:2046:1: rule__CompareExpr__Group__0 : rule__CompareExpr__Group__0__Impl rule__CompareExpr__Group__1 ;
    public final void rule__CompareExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2050:1: ( rule__CompareExpr__Group__0__Impl rule__CompareExpr__Group__1 )
            // InternalStoex.g:2051:2: rule__CompareExpr__Group__0__Impl rule__CompareExpr__Group__1
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
    // InternalStoex.g:2058:1: rule__CompareExpr__Group__0__Impl : ( rulesumExpr ) ;
    public final void rule__CompareExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2062:1: ( ( rulesumExpr ) )
            // InternalStoex.g:2063:1: ( rulesumExpr )
            {
            // InternalStoex.g:2063:1: ( rulesumExpr )
            // InternalStoex.g:2064:2: rulesumExpr
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
    // InternalStoex.g:2073:1: rule__CompareExpr__Group__1 : rule__CompareExpr__Group__1__Impl ;
    public final void rule__CompareExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2077:1: ( rule__CompareExpr__Group__1__Impl )
            // InternalStoex.g:2078:2: rule__CompareExpr__Group__1__Impl
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
    // InternalStoex.g:2084:1: rule__CompareExpr__Group__1__Impl : ( ( rule__CompareExpr__Group_1__0 )? ) ;
    public final void rule__CompareExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2088:1: ( ( ( rule__CompareExpr__Group_1__0 )? ) )
            // InternalStoex.g:2089:1: ( ( rule__CompareExpr__Group_1__0 )? )
            {
            // InternalStoex.g:2089:1: ( ( rule__CompareExpr__Group_1__0 )? )
            // InternalStoex.g:2090:2: ( rule__CompareExpr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExprAccess().getGroup_1()); 
            }
            // InternalStoex.g:2091:2: ( rule__CompareExpr__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=22 && LA19_0<=27)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalStoex.g:2091:3: rule__CompareExpr__Group_1__0
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
    // InternalStoex.g:2100:1: rule__CompareExpr__Group_1__0 : rule__CompareExpr__Group_1__0__Impl rule__CompareExpr__Group_1__1 ;
    public final void rule__CompareExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2104:1: ( rule__CompareExpr__Group_1__0__Impl rule__CompareExpr__Group_1__1 )
            // InternalStoex.g:2105:2: rule__CompareExpr__Group_1__0__Impl rule__CompareExpr__Group_1__1
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
    // InternalStoex.g:2112:1: rule__CompareExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__CompareExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2116:1: ( ( () ) )
            // InternalStoex.g:2117:1: ( () )
            {
            // InternalStoex.g:2117:1: ( () )
            // InternalStoex.g:2118:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExprAccess().getCompareExpressionLeftAction_1_0()); 
            }
            // InternalStoex.g:2119:2: ()
            // InternalStoex.g:2119:3: 
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
    // InternalStoex.g:2127:1: rule__CompareExpr__Group_1__1 : rule__CompareExpr__Group_1__1__Impl rule__CompareExpr__Group_1__2 ;
    public final void rule__CompareExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2131:1: ( rule__CompareExpr__Group_1__1__Impl rule__CompareExpr__Group_1__2 )
            // InternalStoex.g:2132:2: rule__CompareExpr__Group_1__1__Impl rule__CompareExpr__Group_1__2
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
    // InternalStoex.g:2139:1: rule__CompareExpr__Group_1__1__Impl : ( ( rule__CompareExpr__OperationAssignment_1_1 ) ) ;
    public final void rule__CompareExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2143:1: ( ( ( rule__CompareExpr__OperationAssignment_1_1 ) ) )
            // InternalStoex.g:2144:1: ( ( rule__CompareExpr__OperationAssignment_1_1 ) )
            {
            // InternalStoex.g:2144:1: ( ( rule__CompareExpr__OperationAssignment_1_1 ) )
            // InternalStoex.g:2145:2: ( rule__CompareExpr__OperationAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExprAccess().getOperationAssignment_1_1()); 
            }
            // InternalStoex.g:2146:2: ( rule__CompareExpr__OperationAssignment_1_1 )
            // InternalStoex.g:2146:3: rule__CompareExpr__OperationAssignment_1_1
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
    // InternalStoex.g:2154:1: rule__CompareExpr__Group_1__2 : rule__CompareExpr__Group_1__2__Impl ;
    public final void rule__CompareExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2158:1: ( rule__CompareExpr__Group_1__2__Impl )
            // InternalStoex.g:2159:2: rule__CompareExpr__Group_1__2__Impl
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
    // InternalStoex.g:2165:1: rule__CompareExpr__Group_1__2__Impl : ( ( rule__CompareExpr__RightAssignment_1_2 ) ) ;
    public final void rule__CompareExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2169:1: ( ( ( rule__CompareExpr__RightAssignment_1_2 ) ) )
            // InternalStoex.g:2170:1: ( ( rule__CompareExpr__RightAssignment_1_2 ) )
            {
            // InternalStoex.g:2170:1: ( ( rule__CompareExpr__RightAssignment_1_2 ) )
            // InternalStoex.g:2171:2: ( rule__CompareExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExprAccess().getRightAssignment_1_2()); 
            }
            // InternalStoex.g:2172:2: ( rule__CompareExpr__RightAssignment_1_2 )
            // InternalStoex.g:2172:3: rule__CompareExpr__RightAssignment_1_2
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
    // InternalStoex.g:2181:1: rule__SumExpr__Group__0 : rule__SumExpr__Group__0__Impl rule__SumExpr__Group__1 ;
    public final void rule__SumExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2185:1: ( rule__SumExpr__Group__0__Impl rule__SumExpr__Group__1 )
            // InternalStoex.g:2186:2: rule__SumExpr__Group__0__Impl rule__SumExpr__Group__1
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
    // InternalStoex.g:2193:1: rule__SumExpr__Group__0__Impl : ( ruleprodExpr ) ;
    public final void rule__SumExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2197:1: ( ( ruleprodExpr ) )
            // InternalStoex.g:2198:1: ( ruleprodExpr )
            {
            // InternalStoex.g:2198:1: ( ruleprodExpr )
            // InternalStoex.g:2199:2: ruleprodExpr
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
    // InternalStoex.g:2208:1: rule__SumExpr__Group__1 : rule__SumExpr__Group__1__Impl ;
    public final void rule__SumExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2212:1: ( rule__SumExpr__Group__1__Impl )
            // InternalStoex.g:2213:2: rule__SumExpr__Group__1__Impl
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
    // InternalStoex.g:2219:1: rule__SumExpr__Group__1__Impl : ( ( rule__SumExpr__Group_1__0 )* ) ;
    public final void rule__SumExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2223:1: ( ( ( rule__SumExpr__Group_1__0 )* ) )
            // InternalStoex.g:2224:1: ( ( rule__SumExpr__Group_1__0 )* )
            {
            // InternalStoex.g:2224:1: ( ( rule__SumExpr__Group_1__0 )* )
            // InternalStoex.g:2225:2: ( rule__SumExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumExprAccess().getGroup_1()); 
            }
            // InternalStoex.g:2226:2: ( rule__SumExpr__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=28 && LA20_0<=29)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalStoex.g:2226:3: rule__SumExpr__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    rule__SumExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalStoex.g:2235:1: rule__SumExpr__Group_1__0 : rule__SumExpr__Group_1__0__Impl rule__SumExpr__Group_1__1 ;
    public final void rule__SumExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2239:1: ( rule__SumExpr__Group_1__0__Impl rule__SumExpr__Group_1__1 )
            // InternalStoex.g:2240:2: rule__SumExpr__Group_1__0__Impl rule__SumExpr__Group_1__1
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
    // InternalStoex.g:2247:1: rule__SumExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__SumExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2251:1: ( ( () ) )
            // InternalStoex.g:2252:1: ( () )
            {
            // InternalStoex.g:2252:1: ( () )
            // InternalStoex.g:2253:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumExprAccess().getTermExpressionLeftAction_1_0()); 
            }
            // InternalStoex.g:2254:2: ()
            // InternalStoex.g:2254:3: 
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
    // InternalStoex.g:2262:1: rule__SumExpr__Group_1__1 : rule__SumExpr__Group_1__1__Impl rule__SumExpr__Group_1__2 ;
    public final void rule__SumExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2266:1: ( rule__SumExpr__Group_1__1__Impl rule__SumExpr__Group_1__2 )
            // InternalStoex.g:2267:2: rule__SumExpr__Group_1__1__Impl rule__SumExpr__Group_1__2
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
    // InternalStoex.g:2274:1: rule__SumExpr__Group_1__1__Impl : ( ( rule__SumExpr__OperationAssignment_1_1 ) ) ;
    public final void rule__SumExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2278:1: ( ( ( rule__SumExpr__OperationAssignment_1_1 ) ) )
            // InternalStoex.g:2279:1: ( ( rule__SumExpr__OperationAssignment_1_1 ) )
            {
            // InternalStoex.g:2279:1: ( ( rule__SumExpr__OperationAssignment_1_1 ) )
            // InternalStoex.g:2280:2: ( rule__SumExpr__OperationAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumExprAccess().getOperationAssignment_1_1()); 
            }
            // InternalStoex.g:2281:2: ( rule__SumExpr__OperationAssignment_1_1 )
            // InternalStoex.g:2281:3: rule__SumExpr__OperationAssignment_1_1
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
    // InternalStoex.g:2289:1: rule__SumExpr__Group_1__2 : rule__SumExpr__Group_1__2__Impl ;
    public final void rule__SumExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2293:1: ( rule__SumExpr__Group_1__2__Impl )
            // InternalStoex.g:2294:2: rule__SumExpr__Group_1__2__Impl
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
    // InternalStoex.g:2300:1: rule__SumExpr__Group_1__2__Impl : ( ( rule__SumExpr__RightAssignment_1_2 ) ) ;
    public final void rule__SumExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2304:1: ( ( ( rule__SumExpr__RightAssignment_1_2 ) ) )
            // InternalStoex.g:2305:1: ( ( rule__SumExpr__RightAssignment_1_2 ) )
            {
            // InternalStoex.g:2305:1: ( ( rule__SumExpr__RightAssignment_1_2 ) )
            // InternalStoex.g:2306:2: ( rule__SumExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumExprAccess().getRightAssignment_1_2()); 
            }
            // InternalStoex.g:2307:2: ( rule__SumExpr__RightAssignment_1_2 )
            // InternalStoex.g:2307:3: rule__SumExpr__RightAssignment_1_2
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
    // InternalStoex.g:2316:1: rule__ProdExpr__Group__0 : rule__ProdExpr__Group__0__Impl rule__ProdExpr__Group__1 ;
    public final void rule__ProdExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2320:1: ( rule__ProdExpr__Group__0__Impl rule__ProdExpr__Group__1 )
            // InternalStoex.g:2321:2: rule__ProdExpr__Group__0__Impl rule__ProdExpr__Group__1
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
    // InternalStoex.g:2328:1: rule__ProdExpr__Group__0__Impl : ( rulepowExpr ) ;
    public final void rule__ProdExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2332:1: ( ( rulepowExpr ) )
            // InternalStoex.g:2333:1: ( rulepowExpr )
            {
            // InternalStoex.g:2333:1: ( rulepowExpr )
            // InternalStoex.g:2334:2: rulepowExpr
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
    // InternalStoex.g:2343:1: rule__ProdExpr__Group__1 : rule__ProdExpr__Group__1__Impl ;
    public final void rule__ProdExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2347:1: ( rule__ProdExpr__Group__1__Impl )
            // InternalStoex.g:2348:2: rule__ProdExpr__Group__1__Impl
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
    // InternalStoex.g:2354:1: rule__ProdExpr__Group__1__Impl : ( ( rule__ProdExpr__Group_1__0 )* ) ;
    public final void rule__ProdExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2358:1: ( ( ( rule__ProdExpr__Group_1__0 )* ) )
            // InternalStoex.g:2359:1: ( ( rule__ProdExpr__Group_1__0 )* )
            {
            // InternalStoex.g:2359:1: ( ( rule__ProdExpr__Group_1__0 )* )
            // InternalStoex.g:2360:2: ( rule__ProdExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProdExprAccess().getGroup_1()); 
            }
            // InternalStoex.g:2361:2: ( rule__ProdExpr__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=30 && LA21_0<=32)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalStoex.g:2361:3: rule__ProdExpr__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    rule__ProdExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalStoex.g:2370:1: rule__ProdExpr__Group_1__0 : rule__ProdExpr__Group_1__0__Impl rule__ProdExpr__Group_1__1 ;
    public final void rule__ProdExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2374:1: ( rule__ProdExpr__Group_1__0__Impl rule__ProdExpr__Group_1__1 )
            // InternalStoex.g:2375:2: rule__ProdExpr__Group_1__0__Impl rule__ProdExpr__Group_1__1
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
    // InternalStoex.g:2382:1: rule__ProdExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__ProdExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2386:1: ( ( () ) )
            // InternalStoex.g:2387:1: ( () )
            {
            // InternalStoex.g:2387:1: ( () )
            // InternalStoex.g:2388:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProdExprAccess().getProductExpressionLeftAction_1_0()); 
            }
            // InternalStoex.g:2389:2: ()
            // InternalStoex.g:2389:3: 
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
    // InternalStoex.g:2397:1: rule__ProdExpr__Group_1__1 : rule__ProdExpr__Group_1__1__Impl rule__ProdExpr__Group_1__2 ;
    public final void rule__ProdExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2401:1: ( rule__ProdExpr__Group_1__1__Impl rule__ProdExpr__Group_1__2 )
            // InternalStoex.g:2402:2: rule__ProdExpr__Group_1__1__Impl rule__ProdExpr__Group_1__2
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
    // InternalStoex.g:2409:1: rule__ProdExpr__Group_1__1__Impl : ( ( rule__ProdExpr__OperationAssignment_1_1 ) ) ;
    public final void rule__ProdExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2413:1: ( ( ( rule__ProdExpr__OperationAssignment_1_1 ) ) )
            // InternalStoex.g:2414:1: ( ( rule__ProdExpr__OperationAssignment_1_1 ) )
            {
            // InternalStoex.g:2414:1: ( ( rule__ProdExpr__OperationAssignment_1_1 ) )
            // InternalStoex.g:2415:2: ( rule__ProdExpr__OperationAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProdExprAccess().getOperationAssignment_1_1()); 
            }
            // InternalStoex.g:2416:2: ( rule__ProdExpr__OperationAssignment_1_1 )
            // InternalStoex.g:2416:3: rule__ProdExpr__OperationAssignment_1_1
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
    // InternalStoex.g:2424:1: rule__ProdExpr__Group_1__2 : rule__ProdExpr__Group_1__2__Impl ;
    public final void rule__ProdExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2428:1: ( rule__ProdExpr__Group_1__2__Impl )
            // InternalStoex.g:2429:2: rule__ProdExpr__Group_1__2__Impl
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
    // InternalStoex.g:2435:1: rule__ProdExpr__Group_1__2__Impl : ( ( rule__ProdExpr__RightAssignment_1_2 ) ) ;
    public final void rule__ProdExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2439:1: ( ( ( rule__ProdExpr__RightAssignment_1_2 ) ) )
            // InternalStoex.g:2440:1: ( ( rule__ProdExpr__RightAssignment_1_2 ) )
            {
            // InternalStoex.g:2440:1: ( ( rule__ProdExpr__RightAssignment_1_2 ) )
            // InternalStoex.g:2441:2: ( rule__ProdExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProdExprAccess().getRightAssignment_1_2()); 
            }
            // InternalStoex.g:2442:2: ( rule__ProdExpr__RightAssignment_1_2 )
            // InternalStoex.g:2442:3: rule__ProdExpr__RightAssignment_1_2
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
    // InternalStoex.g:2451:1: rule__PowExpr__Group__0 : rule__PowExpr__Group__0__Impl rule__PowExpr__Group__1 ;
    public final void rule__PowExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2455:1: ( rule__PowExpr__Group__0__Impl rule__PowExpr__Group__1 )
            // InternalStoex.g:2456:2: rule__PowExpr__Group__0__Impl rule__PowExpr__Group__1
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
    // InternalStoex.g:2463:1: rule__PowExpr__Group__0__Impl : ( ruleunaryExpr ) ;
    public final void rule__PowExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2467:1: ( ( ruleunaryExpr ) )
            // InternalStoex.g:2468:1: ( ruleunaryExpr )
            {
            // InternalStoex.g:2468:1: ( ruleunaryExpr )
            // InternalStoex.g:2469:2: ruleunaryExpr
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
    // InternalStoex.g:2478:1: rule__PowExpr__Group__1 : rule__PowExpr__Group__1__Impl ;
    public final void rule__PowExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2482:1: ( rule__PowExpr__Group__1__Impl )
            // InternalStoex.g:2483:2: rule__PowExpr__Group__1__Impl
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
    // InternalStoex.g:2489:1: rule__PowExpr__Group__1__Impl : ( ( rule__PowExpr__Group_1__0 )? ) ;
    public final void rule__PowExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2493:1: ( ( ( rule__PowExpr__Group_1__0 )? ) )
            // InternalStoex.g:2494:1: ( ( rule__PowExpr__Group_1__0 )? )
            {
            // InternalStoex.g:2494:1: ( ( rule__PowExpr__Group_1__0 )? )
            // InternalStoex.g:2495:2: ( rule__PowExpr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExprAccess().getGroup_1()); 
            }
            // InternalStoex.g:2496:2: ( rule__PowExpr__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalStoex.g:2496:3: rule__PowExpr__Group_1__0
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
    // InternalStoex.g:2505:1: rule__PowExpr__Group_1__0 : rule__PowExpr__Group_1__0__Impl rule__PowExpr__Group_1__1 ;
    public final void rule__PowExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2509:1: ( rule__PowExpr__Group_1__0__Impl rule__PowExpr__Group_1__1 )
            // InternalStoex.g:2510:2: rule__PowExpr__Group_1__0__Impl rule__PowExpr__Group_1__1
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
    // InternalStoex.g:2517:1: rule__PowExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__PowExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2521:1: ( ( () ) )
            // InternalStoex.g:2522:1: ( () )
            {
            // InternalStoex.g:2522:1: ( () )
            // InternalStoex.g:2523:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExprAccess().getPowerExpressionBaseAction_1_0()); 
            }
            // InternalStoex.g:2524:2: ()
            // InternalStoex.g:2524:3: 
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
    // InternalStoex.g:2532:1: rule__PowExpr__Group_1__1 : rule__PowExpr__Group_1__1__Impl rule__PowExpr__Group_1__2 ;
    public final void rule__PowExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2536:1: ( rule__PowExpr__Group_1__1__Impl rule__PowExpr__Group_1__2 )
            // InternalStoex.g:2537:2: rule__PowExpr__Group_1__1__Impl rule__PowExpr__Group_1__2
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
    // InternalStoex.g:2544:1: rule__PowExpr__Group_1__1__Impl : ( '^' ) ;
    public final void rule__PowExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2548:1: ( ( '^' ) )
            // InternalStoex.g:2549:1: ( '^' )
            {
            // InternalStoex.g:2549:1: ( '^' )
            // InternalStoex.g:2550:2: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExprAccess().getCircumflexAccentKeyword_1_1()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowExprAccess().getCircumflexAccentKeyword_1_1()); 
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
    // InternalStoex.g:2559:1: rule__PowExpr__Group_1__2 : rule__PowExpr__Group_1__2__Impl ;
    public final void rule__PowExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2563:1: ( rule__PowExpr__Group_1__2__Impl )
            // InternalStoex.g:2564:2: rule__PowExpr__Group_1__2__Impl
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
    // InternalStoex.g:2570:1: rule__PowExpr__Group_1__2__Impl : ( ( rule__PowExpr__ExponentAssignment_1_2 ) ) ;
    public final void rule__PowExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2574:1: ( ( ( rule__PowExpr__ExponentAssignment_1_2 ) ) )
            // InternalStoex.g:2575:1: ( ( rule__PowExpr__ExponentAssignment_1_2 ) )
            {
            // InternalStoex.g:2575:1: ( ( rule__PowExpr__ExponentAssignment_1_2 ) )
            // InternalStoex.g:2576:2: ( rule__PowExpr__ExponentAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExprAccess().getExponentAssignment_1_2()); 
            }
            // InternalStoex.g:2577:2: ( rule__PowExpr__ExponentAssignment_1_2 )
            // InternalStoex.g:2577:3: rule__PowExpr__ExponentAssignment_1_2
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
    // InternalStoex.g:2586:1: rule__NotExpression__Group__0 : rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1 ;
    public final void rule__NotExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2590:1: ( rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1 )
            // InternalStoex.g:2591:2: rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1
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
    // InternalStoex.g:2598:1: rule__NotExpression__Group__0__Impl : ( 'NOT' ) ;
    public final void rule__NotExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2602:1: ( ( 'NOT' ) )
            // InternalStoex.g:2603:1: ( 'NOT' )
            {
            // InternalStoex.g:2603:1: ( 'NOT' )
            // InternalStoex.g:2604:2: 'NOT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getNOTKeyword_0()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getNOTKeyword_0()); 
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
    // InternalStoex.g:2613:1: rule__NotExpression__Group__1 : rule__NotExpression__Group__1__Impl ;
    public final void rule__NotExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2617:1: ( rule__NotExpression__Group__1__Impl )
            // InternalStoex.g:2618:2: rule__NotExpression__Group__1__Impl
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
    // InternalStoex.g:2624:1: rule__NotExpression__Group__1__Impl : ( ( rule__NotExpression__InnerAssignment_1 ) ) ;
    public final void rule__NotExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2628:1: ( ( ( rule__NotExpression__InnerAssignment_1 ) ) )
            // InternalStoex.g:2629:1: ( ( rule__NotExpression__InnerAssignment_1 ) )
            {
            // InternalStoex.g:2629:1: ( ( rule__NotExpression__InnerAssignment_1 ) )
            // InternalStoex.g:2630:2: ( rule__NotExpression__InnerAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getInnerAssignment_1()); 
            }
            // InternalStoex.g:2631:2: ( rule__NotExpression__InnerAssignment_1 )
            // InternalStoex.g:2631:3: rule__NotExpression__InnerAssignment_1
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
    // InternalStoex.g:2640:1: rule__NegativeExpression__Group__0 : rule__NegativeExpression__Group__0__Impl rule__NegativeExpression__Group__1 ;
    public final void rule__NegativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2644:1: ( rule__NegativeExpression__Group__0__Impl rule__NegativeExpression__Group__1 )
            // InternalStoex.g:2645:2: rule__NegativeExpression__Group__0__Impl rule__NegativeExpression__Group__1
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
    // InternalStoex.g:2652:1: rule__NegativeExpression__Group__0__Impl : ( '-' ) ;
    public final void rule__NegativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2656:1: ( ( '-' ) )
            // InternalStoex.g:2657:1: ( '-' )
            {
            // InternalStoex.g:2657:1: ( '-' )
            // InternalStoex.g:2658:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeExpressionAccess().getHyphenMinusKeyword_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalStoex.g:2667:1: rule__NegativeExpression__Group__1 : rule__NegativeExpression__Group__1__Impl ;
    public final void rule__NegativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2671:1: ( rule__NegativeExpression__Group__1__Impl )
            // InternalStoex.g:2672:2: rule__NegativeExpression__Group__1__Impl
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
    // InternalStoex.g:2678:1: rule__NegativeExpression__Group__1__Impl : ( ( rule__NegativeExpression__InnerAssignment_1 ) ) ;
    public final void rule__NegativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2682:1: ( ( ( rule__NegativeExpression__InnerAssignment_1 ) ) )
            // InternalStoex.g:2683:1: ( ( rule__NegativeExpression__InnerAssignment_1 ) )
            {
            // InternalStoex.g:2683:1: ( ( rule__NegativeExpression__InnerAssignment_1 ) )
            // InternalStoex.g:2684:2: ( rule__NegativeExpression__InnerAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeExpressionAccess().getInnerAssignment_1()); 
            }
            // InternalStoex.g:2685:2: ( rule__NegativeExpression__InnerAssignment_1 )
            // InternalStoex.g:2685:3: rule__NegativeExpression__InnerAssignment_1
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
    // InternalStoex.g:2694:1: rule__DoubleLiteral__Group__0 : rule__DoubleLiteral__Group__0__Impl rule__DoubleLiteral__Group__1 ;
    public final void rule__DoubleLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2698:1: ( rule__DoubleLiteral__Group__0__Impl rule__DoubleLiteral__Group__1 )
            // InternalStoex.g:2699:2: rule__DoubleLiteral__Group__0__Impl rule__DoubleLiteral__Group__1
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
    // InternalStoex.g:2706:1: rule__DoubleLiteral__Group__0__Impl : ( ( rule__DoubleLiteral__ValueAssignment_0 ) ) ;
    public final void rule__DoubleLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2710:1: ( ( ( rule__DoubleLiteral__ValueAssignment_0 ) ) )
            // InternalStoex.g:2711:1: ( ( rule__DoubleLiteral__ValueAssignment_0 ) )
            {
            // InternalStoex.g:2711:1: ( ( rule__DoubleLiteral__ValueAssignment_0 ) )
            // InternalStoex.g:2712:2: ( rule__DoubleLiteral__ValueAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLiteralAccess().getValueAssignment_0()); 
            }
            // InternalStoex.g:2713:2: ( rule__DoubleLiteral__ValueAssignment_0 )
            // InternalStoex.g:2713:3: rule__DoubleLiteral__ValueAssignment_0
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
    // InternalStoex.g:2721:1: rule__DoubleLiteral__Group__1 : rule__DoubleLiteral__Group__1__Impl ;
    public final void rule__DoubleLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2725:1: ( rule__DoubleLiteral__Group__1__Impl )
            // InternalStoex.g:2726:2: rule__DoubleLiteral__Group__1__Impl
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
    // InternalStoex.g:2732:1: rule__DoubleLiteral__Group__1__Impl : ( ( rule__DoubleLiteral__Group_1__0 )? ) ;
    public final void rule__DoubleLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2736:1: ( ( ( rule__DoubleLiteral__Group_1__0 )? ) )
            // InternalStoex.g:2737:1: ( ( rule__DoubleLiteral__Group_1__0 )? )
            {
            // InternalStoex.g:2737:1: ( ( rule__DoubleLiteral__Group_1__0 )? )
            // InternalStoex.g:2738:2: ( rule__DoubleLiteral__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLiteralAccess().getGroup_1()); 
            }
            // InternalStoex.g:2739:2: ( rule__DoubleLiteral__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalStoex.g:2739:3: rule__DoubleLiteral__Group_1__0
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
    // InternalStoex.g:2748:1: rule__DoubleLiteral__Group_1__0 : rule__DoubleLiteral__Group_1__0__Impl rule__DoubleLiteral__Group_1__1 ;
    public final void rule__DoubleLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2752:1: ( rule__DoubleLiteral__Group_1__0__Impl rule__DoubleLiteral__Group_1__1 )
            // InternalStoex.g:2753:2: rule__DoubleLiteral__Group_1__0__Impl rule__DoubleLiteral__Group_1__1
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
    // InternalStoex.g:2760:1: rule__DoubleLiteral__Group_1__0__Impl : ( '[' ) ;
    public final void rule__DoubleLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2764:1: ( ( '[' ) )
            // InternalStoex.g:2765:1: ( '[' )
            {
            // InternalStoex.g:2765:1: ( '[' )
            // InternalStoex.g:2766:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLiteralAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleLiteralAccess().getLeftSquareBracketKeyword_1_0()); 
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
    // InternalStoex.g:2775:1: rule__DoubleLiteral__Group_1__1 : rule__DoubleLiteral__Group_1__1__Impl rule__DoubleLiteral__Group_1__2 ;
    public final void rule__DoubleLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2779:1: ( rule__DoubleLiteral__Group_1__1__Impl rule__DoubleLiteral__Group_1__2 )
            // InternalStoex.g:2780:2: rule__DoubleLiteral__Group_1__1__Impl rule__DoubleLiteral__Group_1__2
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
    // InternalStoex.g:2787:1: rule__DoubleLiteral__Group_1__1__Impl : ( ( rule__DoubleLiteral__UnitAssignment_1_1 ) ) ;
    public final void rule__DoubleLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2791:1: ( ( ( rule__DoubleLiteral__UnitAssignment_1_1 ) ) )
            // InternalStoex.g:2792:1: ( ( rule__DoubleLiteral__UnitAssignment_1_1 ) )
            {
            // InternalStoex.g:2792:1: ( ( rule__DoubleLiteral__UnitAssignment_1_1 ) )
            // InternalStoex.g:2793:2: ( rule__DoubleLiteral__UnitAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLiteralAccess().getUnitAssignment_1_1()); 
            }
            // InternalStoex.g:2794:2: ( rule__DoubleLiteral__UnitAssignment_1_1 )
            // InternalStoex.g:2794:3: rule__DoubleLiteral__UnitAssignment_1_1
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
    // InternalStoex.g:2802:1: rule__DoubleLiteral__Group_1__2 : rule__DoubleLiteral__Group_1__2__Impl ;
    public final void rule__DoubleLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2806:1: ( rule__DoubleLiteral__Group_1__2__Impl )
            // InternalStoex.g:2807:2: rule__DoubleLiteral__Group_1__2__Impl
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
    // InternalStoex.g:2813:1: rule__DoubleLiteral__Group_1__2__Impl : ( ']' ) ;
    public final void rule__DoubleLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2817:1: ( ( ']' ) )
            // InternalStoex.g:2818:1: ( ']' )
            {
            // InternalStoex.g:2818:1: ( ']' )
            // InternalStoex.g:2819:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleLiteralAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleLiteralAccess().getRightSquareBracketKeyword_1_2()); 
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
    // InternalStoex.g:2829:1: rule__Parenthesis__Group__0 : rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 ;
    public final void rule__Parenthesis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2833:1: ( rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 )
            // InternalStoex.g:2834:2: rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1
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
    // InternalStoex.g:2841:1: rule__Parenthesis__Group__0__Impl : ( '(' ) ;
    public final void rule__Parenthesis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2845:1: ( ( '(' ) )
            // InternalStoex.g:2846:1: ( '(' )
            {
            // InternalStoex.g:2846:1: ( '(' )
            // InternalStoex.g:2847:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 
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
    // InternalStoex.g:2856:1: rule__Parenthesis__Group__1 : rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 ;
    public final void rule__Parenthesis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2860:1: ( rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 )
            // InternalStoex.g:2861:2: rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2
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
    // InternalStoex.g:2868:1: rule__Parenthesis__Group__1__Impl : ( ( rule__Parenthesis__InnerExpressionAssignment_1 ) ) ;
    public final void rule__Parenthesis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2872:1: ( ( ( rule__Parenthesis__InnerExpressionAssignment_1 ) ) )
            // InternalStoex.g:2873:1: ( ( rule__Parenthesis__InnerExpressionAssignment_1 ) )
            {
            // InternalStoex.g:2873:1: ( ( rule__Parenthesis__InnerExpressionAssignment_1 ) )
            // InternalStoex.g:2874:2: ( rule__Parenthesis__InnerExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisAccess().getInnerExpressionAssignment_1()); 
            }
            // InternalStoex.g:2875:2: ( rule__Parenthesis__InnerExpressionAssignment_1 )
            // InternalStoex.g:2875:3: rule__Parenthesis__InnerExpressionAssignment_1
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
    // InternalStoex.g:2883:1: rule__Parenthesis__Group__2 : rule__Parenthesis__Group__2__Impl ;
    public final void rule__Parenthesis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2887:1: ( rule__Parenthesis__Group__2__Impl )
            // InternalStoex.g:2888:2: rule__Parenthesis__Group__2__Impl
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
    // InternalStoex.g:2894:1: rule__Parenthesis__Group__2__Impl : ( ')' ) ;
    public final void rule__Parenthesis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2898:1: ( ( ')' ) )
            // InternalStoex.g:2899:1: ( ')' )
            {
            // InternalStoex.g:2899:1: ( ')' )
            // InternalStoex.g:2900:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 
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
    // InternalStoex.g:2910:1: rule__FunctionLiteral__Group__0 : rule__FunctionLiteral__Group__0__Impl rule__FunctionLiteral__Group__1 ;
    public final void rule__FunctionLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2914:1: ( rule__FunctionLiteral__Group__0__Impl rule__FunctionLiteral__Group__1 )
            // InternalStoex.g:2915:2: rule__FunctionLiteral__Group__0__Impl rule__FunctionLiteral__Group__1
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
    // InternalStoex.g:2922:1: rule__FunctionLiteral__Group__0__Impl : ( ( rule__FunctionLiteral__IdAssignment_0 ) ) ;
    public final void rule__FunctionLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2926:1: ( ( ( rule__FunctionLiteral__IdAssignment_0 ) ) )
            // InternalStoex.g:2927:1: ( ( rule__FunctionLiteral__IdAssignment_0 ) )
            {
            // InternalStoex.g:2927:1: ( ( rule__FunctionLiteral__IdAssignment_0 ) )
            // InternalStoex.g:2928:2: ( rule__FunctionLiteral__IdAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionLiteralAccess().getIdAssignment_0()); 
            }
            // InternalStoex.g:2929:2: ( rule__FunctionLiteral__IdAssignment_0 )
            // InternalStoex.g:2929:3: rule__FunctionLiteral__IdAssignment_0
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
    // InternalStoex.g:2937:1: rule__FunctionLiteral__Group__1 : rule__FunctionLiteral__Group__1__Impl rule__FunctionLiteral__Group__2 ;
    public final void rule__FunctionLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2941:1: ( rule__FunctionLiteral__Group__1__Impl rule__FunctionLiteral__Group__2 )
            // InternalStoex.g:2942:2: rule__FunctionLiteral__Group__1__Impl rule__FunctionLiteral__Group__2
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
    // InternalStoex.g:2949:1: rule__FunctionLiteral__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2953:1: ( ( '(' ) )
            // InternalStoex.g:2954:1: ( '(' )
            {
            // InternalStoex.g:2954:1: ( '(' )
            // InternalStoex.g:2955:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionLiteralAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionLiteralAccess().getLeftParenthesisKeyword_1()); 
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
    // InternalStoex.g:2964:1: rule__FunctionLiteral__Group__2 : rule__FunctionLiteral__Group__2__Impl rule__FunctionLiteral__Group__3 ;
    public final void rule__FunctionLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2968:1: ( rule__FunctionLiteral__Group__2__Impl rule__FunctionLiteral__Group__3 )
            // InternalStoex.g:2969:2: rule__FunctionLiteral__Group__2__Impl rule__FunctionLiteral__Group__3
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
    // InternalStoex.g:2976:1: rule__FunctionLiteral__Group__2__Impl : ( ( rule__FunctionLiteral__Group_2__0 )? ) ;
    public final void rule__FunctionLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2980:1: ( ( ( rule__FunctionLiteral__Group_2__0 )? ) )
            // InternalStoex.g:2981:1: ( ( rule__FunctionLiteral__Group_2__0 )? )
            {
            // InternalStoex.g:2981:1: ( ( rule__FunctionLiteral__Group_2__0 )? )
            // InternalStoex.g:2982:2: ( rule__FunctionLiteral__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionLiteralAccess().getGroup_2()); 
            }
            // InternalStoex.g:2983:2: ( rule__FunctionLiteral__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_DOUBLE && LA24_0<=RULE_STRING)||LA24_0==29||LA24_0==41||LA24_0==44||(LA24_0>=48 && LA24_0<=52)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalStoex.g:2983:3: rule__FunctionLiteral__Group_2__0
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
    // InternalStoex.g:2991:1: rule__FunctionLiteral__Group__3 : rule__FunctionLiteral__Group__3__Impl ;
    public final void rule__FunctionLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:2995:1: ( rule__FunctionLiteral__Group__3__Impl )
            // InternalStoex.g:2996:2: rule__FunctionLiteral__Group__3__Impl
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
    // InternalStoex.g:3002:1: rule__FunctionLiteral__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3006:1: ( ( ')' ) )
            // InternalStoex.g:3007:1: ( ')' )
            {
            // InternalStoex.g:3007:1: ( ')' )
            // InternalStoex.g:3008:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionLiteralAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionLiteralAccess().getRightParenthesisKeyword_3()); 
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
    // InternalStoex.g:3018:1: rule__FunctionLiteral__Group_2__0 : rule__FunctionLiteral__Group_2__0__Impl rule__FunctionLiteral__Group_2__1 ;
    public final void rule__FunctionLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3022:1: ( rule__FunctionLiteral__Group_2__0__Impl rule__FunctionLiteral__Group_2__1 )
            // InternalStoex.g:3023:2: rule__FunctionLiteral__Group_2__0__Impl rule__FunctionLiteral__Group_2__1
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
    // InternalStoex.g:3030:1: rule__FunctionLiteral__Group_2__0__Impl : ( ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_0 ) ) ;
    public final void rule__FunctionLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3034:1: ( ( ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_0 ) ) )
            // InternalStoex.g:3035:1: ( ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_0 ) )
            {
            // InternalStoex.g:3035:1: ( ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_0 ) )
            // InternalStoex.g:3036:2: ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionLiteralAccess().getParameters_FunctionLiteralAssignment_2_0()); 
            }
            // InternalStoex.g:3037:2: ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_0 )
            // InternalStoex.g:3037:3: rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_0
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
    // InternalStoex.g:3045:1: rule__FunctionLiteral__Group_2__1 : rule__FunctionLiteral__Group_2__1__Impl ;
    public final void rule__FunctionLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3049:1: ( rule__FunctionLiteral__Group_2__1__Impl )
            // InternalStoex.g:3050:2: rule__FunctionLiteral__Group_2__1__Impl
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
    // InternalStoex.g:3056:1: rule__FunctionLiteral__Group_2__1__Impl : ( ( rule__FunctionLiteral__Group_2_1__0 )* ) ;
    public final void rule__FunctionLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3060:1: ( ( ( rule__FunctionLiteral__Group_2_1__0 )* ) )
            // InternalStoex.g:3061:1: ( ( rule__FunctionLiteral__Group_2_1__0 )* )
            {
            // InternalStoex.g:3061:1: ( ( rule__FunctionLiteral__Group_2_1__0 )* )
            // InternalStoex.g:3062:2: ( rule__FunctionLiteral__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionLiteralAccess().getGroup_2_1()); 
            }
            // InternalStoex.g:3063:2: ( rule__FunctionLiteral__Group_2_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==46) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalStoex.g:3063:3: rule__FunctionLiteral__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    rule__FunctionLiteral__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalStoex.g:3072:1: rule__FunctionLiteral__Group_2_1__0 : rule__FunctionLiteral__Group_2_1__0__Impl rule__FunctionLiteral__Group_2_1__1 ;
    public final void rule__FunctionLiteral__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3076:1: ( rule__FunctionLiteral__Group_2_1__0__Impl rule__FunctionLiteral__Group_2_1__1 )
            // InternalStoex.g:3077:2: rule__FunctionLiteral__Group_2_1__0__Impl rule__FunctionLiteral__Group_2_1__1
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
    // InternalStoex.g:3084:1: rule__FunctionLiteral__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionLiteral__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3088:1: ( ( ',' ) )
            // InternalStoex.g:3089:1: ( ',' )
            {
            // InternalStoex.g:3089:1: ( ',' )
            // InternalStoex.g:3090:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionLiteralAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionLiteralAccess().getCommaKeyword_2_1_0()); 
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
    // InternalStoex.g:3099:1: rule__FunctionLiteral__Group_2_1__1 : rule__FunctionLiteral__Group_2_1__1__Impl ;
    public final void rule__FunctionLiteral__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3103:1: ( rule__FunctionLiteral__Group_2_1__1__Impl )
            // InternalStoex.g:3104:2: rule__FunctionLiteral__Group_2_1__1__Impl
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
    // InternalStoex.g:3110:1: rule__FunctionLiteral__Group_2_1__1__Impl : ( ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_1_1 ) ) ;
    public final void rule__FunctionLiteral__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3114:1: ( ( ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_1_1 ) ) )
            // InternalStoex.g:3115:1: ( ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_1_1 ) )
            {
            // InternalStoex.g:3115:1: ( ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_1_1 ) )
            // InternalStoex.g:3116:2: ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionLiteralAccess().getParameters_FunctionLiteralAssignment_2_1_1()); 
            }
            // InternalStoex.g:3117:2: ( rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_1_1 )
            // InternalStoex.g:3117:3: rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_1_1
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
    // InternalStoex.g:3126:1: rule__NamespaceReference__Group__0 : rule__NamespaceReference__Group__0__Impl rule__NamespaceReference__Group__1 ;
    public final void rule__NamespaceReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3130:1: ( rule__NamespaceReference__Group__0__Impl rule__NamespaceReference__Group__1 )
            // InternalStoex.g:3131:2: rule__NamespaceReference__Group__0__Impl rule__NamespaceReference__Group__1
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
    // InternalStoex.g:3138:1: rule__NamespaceReference__Group__0__Impl : ( ( rule__NamespaceReference__ReferenceNameAssignment_0 ) ) ;
    public final void rule__NamespaceReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3142:1: ( ( ( rule__NamespaceReference__ReferenceNameAssignment_0 ) ) )
            // InternalStoex.g:3143:1: ( ( rule__NamespaceReference__ReferenceNameAssignment_0 ) )
            {
            // InternalStoex.g:3143:1: ( ( rule__NamespaceReference__ReferenceNameAssignment_0 ) )
            // InternalStoex.g:3144:2: ( rule__NamespaceReference__ReferenceNameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceReferenceAccess().getReferenceNameAssignment_0()); 
            }
            // InternalStoex.g:3145:2: ( rule__NamespaceReference__ReferenceNameAssignment_0 )
            // InternalStoex.g:3145:3: rule__NamespaceReference__ReferenceNameAssignment_0
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
    // InternalStoex.g:3153:1: rule__NamespaceReference__Group__1 : rule__NamespaceReference__Group__1__Impl rule__NamespaceReference__Group__2 ;
    public final void rule__NamespaceReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3157:1: ( rule__NamespaceReference__Group__1__Impl rule__NamespaceReference__Group__2 )
            // InternalStoex.g:3158:2: rule__NamespaceReference__Group__1__Impl rule__NamespaceReference__Group__2
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
    // InternalStoex.g:3165:1: rule__NamespaceReference__Group__1__Impl : ( '.' ) ;
    public final void rule__NamespaceReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3169:1: ( ( '.' ) )
            // InternalStoex.g:3170:1: ( '.' )
            {
            // InternalStoex.g:3170:1: ( '.' )
            // InternalStoex.g:3171:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceReferenceAccess().getFullStopKeyword_1()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceReferenceAccess().getFullStopKeyword_1()); 
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
    // InternalStoex.g:3180:1: rule__NamespaceReference__Group__2 : rule__NamespaceReference__Group__2__Impl ;
    public final void rule__NamespaceReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3184:1: ( rule__NamespaceReference__Group__2__Impl )
            // InternalStoex.g:3185:2: rule__NamespaceReference__Group__2__Impl
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
    // InternalStoex.g:3191:1: rule__NamespaceReference__Group__2__Impl : ( ( rule__NamespaceReference__Alternatives_2 ) ) ;
    public final void rule__NamespaceReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3195:1: ( ( ( rule__NamespaceReference__Alternatives_2 ) ) )
            // InternalStoex.g:3196:1: ( ( rule__NamespaceReference__Alternatives_2 ) )
            {
            // InternalStoex.g:3196:1: ( ( rule__NamespaceReference__Alternatives_2 ) )
            // InternalStoex.g:3197:2: ( rule__NamespaceReference__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceReferenceAccess().getAlternatives_2()); 
            }
            // InternalStoex.g:3198:2: ( rule__NamespaceReference__Alternatives_2 )
            // InternalStoex.g:3198:3: rule__NamespaceReference__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamespaceReference__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceReferenceAccess().getAlternatives_2()); 
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
    // InternalStoex.g:3207:1: rule__IntLiteral__Group__0 : rule__IntLiteral__Group__0__Impl rule__IntLiteral__Group__1 ;
    public final void rule__IntLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3211:1: ( rule__IntLiteral__Group__0__Impl rule__IntLiteral__Group__1 )
            // InternalStoex.g:3212:2: rule__IntLiteral__Group__0__Impl rule__IntLiteral__Group__1
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
    // InternalStoex.g:3219:1: rule__IntLiteral__Group__0__Impl : ( ( rule__IntLiteral__ValueAssignment_0 ) ) ;
    public final void rule__IntLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3223:1: ( ( ( rule__IntLiteral__ValueAssignment_0 ) ) )
            // InternalStoex.g:3224:1: ( ( rule__IntLiteral__ValueAssignment_0 ) )
            {
            // InternalStoex.g:3224:1: ( ( rule__IntLiteral__ValueAssignment_0 ) )
            // InternalStoex.g:3225:2: ( rule__IntLiteral__ValueAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueAssignment_0()); 
            }
            // InternalStoex.g:3226:2: ( rule__IntLiteral__ValueAssignment_0 )
            // InternalStoex.g:3226:3: rule__IntLiteral__ValueAssignment_0
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
    // InternalStoex.g:3234:1: rule__IntLiteral__Group__1 : rule__IntLiteral__Group__1__Impl ;
    public final void rule__IntLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3238:1: ( rule__IntLiteral__Group__1__Impl )
            // InternalStoex.g:3239:2: rule__IntLiteral__Group__1__Impl
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
    // InternalStoex.g:3245:1: rule__IntLiteral__Group__1__Impl : ( ( rule__IntLiteral__Group_1__0 )? ) ;
    public final void rule__IntLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3249:1: ( ( ( rule__IntLiteral__Group_1__0 )? ) )
            // InternalStoex.g:3250:1: ( ( rule__IntLiteral__Group_1__0 )? )
            {
            // InternalStoex.g:3250:1: ( ( rule__IntLiteral__Group_1__0 )? )
            // InternalStoex.g:3251:2: ( rule__IntLiteral__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getGroup_1()); 
            }
            // InternalStoex.g:3252:2: ( rule__IntLiteral__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalStoex.g:3252:3: rule__IntLiteral__Group_1__0
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
    // InternalStoex.g:3261:1: rule__IntLiteral__Group_1__0 : rule__IntLiteral__Group_1__0__Impl rule__IntLiteral__Group_1__1 ;
    public final void rule__IntLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3265:1: ( rule__IntLiteral__Group_1__0__Impl rule__IntLiteral__Group_1__1 )
            // InternalStoex.g:3266:2: rule__IntLiteral__Group_1__0__Impl rule__IntLiteral__Group_1__1
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
    // InternalStoex.g:3273:1: rule__IntLiteral__Group_1__0__Impl : ( '[' ) ;
    public final void rule__IntLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3277:1: ( ( '[' ) )
            // InternalStoex.g:3278:1: ( '[' )
            {
            // InternalStoex.g:3278:1: ( '[' )
            // InternalStoex.g:3279:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralAccess().getLeftSquareBracketKeyword_1_0()); 
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
    // InternalStoex.g:3288:1: rule__IntLiteral__Group_1__1 : rule__IntLiteral__Group_1__1__Impl rule__IntLiteral__Group_1__2 ;
    public final void rule__IntLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3292:1: ( rule__IntLiteral__Group_1__1__Impl rule__IntLiteral__Group_1__2 )
            // InternalStoex.g:3293:2: rule__IntLiteral__Group_1__1__Impl rule__IntLiteral__Group_1__2
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
    // InternalStoex.g:3300:1: rule__IntLiteral__Group_1__1__Impl : ( ( rule__IntLiteral__UnitAssignment_1_1 ) ) ;
    public final void rule__IntLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3304:1: ( ( ( rule__IntLiteral__UnitAssignment_1_1 ) ) )
            // InternalStoex.g:3305:1: ( ( rule__IntLiteral__UnitAssignment_1_1 ) )
            {
            // InternalStoex.g:3305:1: ( ( rule__IntLiteral__UnitAssignment_1_1 ) )
            // InternalStoex.g:3306:2: ( rule__IntLiteral__UnitAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getUnitAssignment_1_1()); 
            }
            // InternalStoex.g:3307:2: ( rule__IntLiteral__UnitAssignment_1_1 )
            // InternalStoex.g:3307:3: rule__IntLiteral__UnitAssignment_1_1
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
    // InternalStoex.g:3315:1: rule__IntLiteral__Group_1__2 : rule__IntLiteral__Group_1__2__Impl ;
    public final void rule__IntLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3319:1: ( rule__IntLiteral__Group_1__2__Impl )
            // InternalStoex.g:3320:2: rule__IntLiteral__Group_1__2__Impl
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
    // InternalStoex.g:3326:1: rule__IntLiteral__Group_1__2__Impl : ( ']' ) ;
    public final void rule__IntLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3330:1: ( ( ']' ) )
            // InternalStoex.g:3331:1: ( ']' )
            {
            // InternalStoex.g:3331:1: ( ']' )
            // InternalStoex.g:3332:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralAccess().getRightSquareBracketKeyword_1_2()); 
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
    // InternalStoex.g:3342:1: rule__UnitDiv__Group__0 : rule__UnitDiv__Group__0__Impl rule__UnitDiv__Group__1 ;
    public final void rule__UnitDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3346:1: ( rule__UnitDiv__Group__0__Impl rule__UnitDiv__Group__1 )
            // InternalStoex.g:3347:2: rule__UnitDiv__Group__0__Impl rule__UnitDiv__Group__1
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
    // InternalStoex.g:3354:1: rule__UnitDiv__Group__0__Impl : ( ruleunitPow ) ;
    public final void rule__UnitDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3358:1: ( ( ruleunitPow ) )
            // InternalStoex.g:3359:1: ( ruleunitPow )
            {
            // InternalStoex.g:3359:1: ( ruleunitPow )
            // InternalStoex.g:3360:2: ruleunitPow
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
    // InternalStoex.g:3369:1: rule__UnitDiv__Group__1 : rule__UnitDiv__Group__1__Impl ;
    public final void rule__UnitDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3373:1: ( rule__UnitDiv__Group__1__Impl )
            // InternalStoex.g:3374:2: rule__UnitDiv__Group__1__Impl
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
    // InternalStoex.g:3380:1: rule__UnitDiv__Group__1__Impl : ( ( rule__UnitDiv__Group_1__0 )? ) ;
    public final void rule__UnitDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3384:1: ( ( ( rule__UnitDiv__Group_1__0 )? ) )
            // InternalStoex.g:3385:1: ( ( rule__UnitDiv__Group_1__0 )? )
            {
            // InternalStoex.g:3385:1: ( ( rule__UnitDiv__Group_1__0 )? )
            // InternalStoex.g:3386:2: ( rule__UnitDiv__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitDivAccess().getGroup_1()); 
            }
            // InternalStoex.g:3387:2: ( rule__UnitDiv__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalStoex.g:3387:3: rule__UnitDiv__Group_1__0
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
    // InternalStoex.g:3396:1: rule__UnitDiv__Group_1__0 : rule__UnitDiv__Group_1__0__Impl rule__UnitDiv__Group_1__1 ;
    public final void rule__UnitDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3400:1: ( rule__UnitDiv__Group_1__0__Impl rule__UnitDiv__Group_1__1 )
            // InternalStoex.g:3401:2: rule__UnitDiv__Group_1__0__Impl rule__UnitDiv__Group_1__1
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
    // InternalStoex.g:3408:1: rule__UnitDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__UnitDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3412:1: ( ( () ) )
            // InternalStoex.g:3413:1: ( () )
            {
            // InternalStoex.g:3413:1: ( () )
            // InternalStoex.g:3414:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitDivAccess().getUnitDivisionDividendAction_1_0()); 
            }
            // InternalStoex.g:3415:2: ()
            // InternalStoex.g:3415:3: 
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
    // InternalStoex.g:3423:1: rule__UnitDiv__Group_1__1 : rule__UnitDiv__Group_1__1__Impl rule__UnitDiv__Group_1__2 ;
    public final void rule__UnitDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3427:1: ( rule__UnitDiv__Group_1__1__Impl rule__UnitDiv__Group_1__2 )
            // InternalStoex.g:3428:2: rule__UnitDiv__Group_1__1__Impl rule__UnitDiv__Group_1__2
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
    // InternalStoex.g:3435:1: rule__UnitDiv__Group_1__1__Impl : ( '/' ) ;
    public final void rule__UnitDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3439:1: ( ( '/' ) )
            // InternalStoex.g:3440:1: ( '/' )
            {
            // InternalStoex.g:3440:1: ( '/' )
            // InternalStoex.g:3441:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitDivAccess().getSolidusKeyword_1_1()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalStoex.g:3450:1: rule__UnitDiv__Group_1__2 : rule__UnitDiv__Group_1__2__Impl ;
    public final void rule__UnitDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3454:1: ( rule__UnitDiv__Group_1__2__Impl )
            // InternalStoex.g:3455:2: rule__UnitDiv__Group_1__2__Impl
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
    // InternalStoex.g:3461:1: rule__UnitDiv__Group_1__2__Impl : ( ( rule__UnitDiv__DivisorAssignment_1_2 ) ) ;
    public final void rule__UnitDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3465:1: ( ( ( rule__UnitDiv__DivisorAssignment_1_2 ) ) )
            // InternalStoex.g:3466:1: ( ( rule__UnitDiv__DivisorAssignment_1_2 ) )
            {
            // InternalStoex.g:3466:1: ( ( rule__UnitDiv__DivisorAssignment_1_2 ) )
            // InternalStoex.g:3467:2: ( rule__UnitDiv__DivisorAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitDivAccess().getDivisorAssignment_1_2()); 
            }
            // InternalStoex.g:3468:2: ( rule__UnitDiv__DivisorAssignment_1_2 )
            // InternalStoex.g:3468:3: rule__UnitDiv__DivisorAssignment_1_2
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
    // InternalStoex.g:3477:1: rule__UnitMulti__Group__0 : rule__UnitMulti__Group__0__Impl rule__UnitMulti__Group__1 ;
    public final void rule__UnitMulti__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3481:1: ( rule__UnitMulti__Group__0__Impl rule__UnitMulti__Group__1 )
            // InternalStoex.g:3482:2: rule__UnitMulti__Group__0__Impl rule__UnitMulti__Group__1
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
    // InternalStoex.g:3489:1: rule__UnitMulti__Group__0__Impl : ( ruleunitPow ) ;
    public final void rule__UnitMulti__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3493:1: ( ( ruleunitPow ) )
            // InternalStoex.g:3494:1: ( ruleunitPow )
            {
            // InternalStoex.g:3494:1: ( ruleunitPow )
            // InternalStoex.g:3495:2: ruleunitPow
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
    // InternalStoex.g:3504:1: rule__UnitMulti__Group__1 : rule__UnitMulti__Group__1__Impl ;
    public final void rule__UnitMulti__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3508:1: ( rule__UnitMulti__Group__1__Impl )
            // InternalStoex.g:3509:2: rule__UnitMulti__Group__1__Impl
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
    // InternalStoex.g:3515:1: rule__UnitMulti__Group__1__Impl : ( ( rule__UnitMulti__Group_1__0 )* ) ;
    public final void rule__UnitMulti__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3519:1: ( ( ( rule__UnitMulti__Group_1__0 )* ) )
            // InternalStoex.g:3520:1: ( ( rule__UnitMulti__Group_1__0 )* )
            {
            // InternalStoex.g:3520:1: ( ( rule__UnitMulti__Group_1__0 )* )
            // InternalStoex.g:3521:2: ( rule__UnitMulti__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitMultiAccess().getGroup_1()); 
            }
            // InternalStoex.g:3522:2: ( rule__UnitMulti__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==30) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred50_InternalStoex()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalStoex.g:3522:3: rule__UnitMulti__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__UnitMulti__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalStoex.g:3531:1: rule__UnitMulti__Group_1__0 : rule__UnitMulti__Group_1__0__Impl rule__UnitMulti__Group_1__1 ;
    public final void rule__UnitMulti__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3535:1: ( rule__UnitMulti__Group_1__0__Impl rule__UnitMulti__Group_1__1 )
            // InternalStoex.g:3536:2: rule__UnitMulti__Group_1__0__Impl rule__UnitMulti__Group_1__1
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
    // InternalStoex.g:3543:1: rule__UnitMulti__Group_1__0__Impl : ( () ) ;
    public final void rule__UnitMulti__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3547:1: ( ( () ) )
            // InternalStoex.g:3548:1: ( () )
            {
            // InternalStoex.g:3548:1: ( () )
            // InternalStoex.g:3549:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitMultiAccess().getUnitMultiplicationUnitsAction_1_0()); 
            }
            // InternalStoex.g:3550:2: ()
            // InternalStoex.g:3550:3: 
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
    // InternalStoex.g:3558:1: rule__UnitMulti__Group_1__1 : rule__UnitMulti__Group_1__1__Impl rule__UnitMulti__Group_1__2 ;
    public final void rule__UnitMulti__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3562:1: ( rule__UnitMulti__Group_1__1__Impl rule__UnitMulti__Group_1__2 )
            // InternalStoex.g:3563:2: rule__UnitMulti__Group_1__1__Impl rule__UnitMulti__Group_1__2
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
    // InternalStoex.g:3570:1: rule__UnitMulti__Group_1__1__Impl : ( '*' ) ;
    public final void rule__UnitMulti__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3574:1: ( ( '*' ) )
            // InternalStoex.g:3575:1: ( '*' )
            {
            // InternalStoex.g:3575:1: ( '*' )
            // InternalStoex.g:3576:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitMultiAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalStoex.g:3585:1: rule__UnitMulti__Group_1__2 : rule__UnitMulti__Group_1__2__Impl ;
    public final void rule__UnitMulti__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3589:1: ( rule__UnitMulti__Group_1__2__Impl )
            // InternalStoex.g:3590:2: rule__UnitMulti__Group_1__2__Impl
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
    // InternalStoex.g:3596:1: rule__UnitMulti__Group_1__2__Impl : ( ( rule__UnitMulti__UnitsAssignment_1_2 ) ) ;
    public final void rule__UnitMulti__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3600:1: ( ( ( rule__UnitMulti__UnitsAssignment_1_2 ) ) )
            // InternalStoex.g:3601:1: ( ( rule__UnitMulti__UnitsAssignment_1_2 ) )
            {
            // InternalStoex.g:3601:1: ( ( rule__UnitMulti__UnitsAssignment_1_2 ) )
            // InternalStoex.g:3602:2: ( rule__UnitMulti__UnitsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitMultiAccess().getUnitsAssignment_1_2()); 
            }
            // InternalStoex.g:3603:2: ( rule__UnitMulti__UnitsAssignment_1_2 )
            // InternalStoex.g:3603:3: rule__UnitMulti__UnitsAssignment_1_2
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
    // InternalStoex.g:3612:1: rule__UnitPow__Group__0 : rule__UnitPow__Group__0__Impl rule__UnitPow__Group__1 ;
    public final void rule__UnitPow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3616:1: ( rule__UnitPow__Group__0__Impl rule__UnitPow__Group__1 )
            // InternalStoex.g:3617:2: rule__UnitPow__Group__0__Impl rule__UnitPow__Group__1
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
    // InternalStoex.g:3624:1: rule__UnitPow__Group__0__Impl : ( ( rule__UnitPow__Alternatives_0 ) ) ;
    public final void rule__UnitPow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3628:1: ( ( ( rule__UnitPow__Alternatives_0 ) ) )
            // InternalStoex.g:3629:1: ( ( rule__UnitPow__Alternatives_0 ) )
            {
            // InternalStoex.g:3629:1: ( ( rule__UnitPow__Alternatives_0 ) )
            // InternalStoex.g:3630:2: ( rule__UnitPow__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitPowAccess().getAlternatives_0()); 
            }
            // InternalStoex.g:3631:2: ( rule__UnitPow__Alternatives_0 )
            // InternalStoex.g:3631:3: rule__UnitPow__Alternatives_0
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
    // InternalStoex.g:3639:1: rule__UnitPow__Group__1 : rule__UnitPow__Group__1__Impl ;
    public final void rule__UnitPow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3643:1: ( rule__UnitPow__Group__1__Impl )
            // InternalStoex.g:3644:2: rule__UnitPow__Group__1__Impl
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
    // InternalStoex.g:3650:1: rule__UnitPow__Group__1__Impl : ( ( rule__UnitPow__Group_1__0 )* ) ;
    public final void rule__UnitPow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3654:1: ( ( ( rule__UnitPow__Group_1__0 )* ) )
            // InternalStoex.g:3655:1: ( ( rule__UnitPow__Group_1__0 )* )
            {
            // InternalStoex.g:3655:1: ( ( rule__UnitPow__Group_1__0 )* )
            // InternalStoex.g:3656:2: ( rule__UnitPow__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitPowAccess().getGroup_1()); 
            }
            // InternalStoex.g:3657:2: ( rule__UnitPow__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==40) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalStoex.g:3657:3: rule__UnitPow__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    rule__UnitPow__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalStoex.g:3666:1: rule__UnitPow__Group_0_1__0 : rule__UnitPow__Group_0_1__0__Impl rule__UnitPow__Group_0_1__1 ;
    public final void rule__UnitPow__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3670:1: ( rule__UnitPow__Group_0_1__0__Impl rule__UnitPow__Group_0_1__1 )
            // InternalStoex.g:3671:2: rule__UnitPow__Group_0_1__0__Impl rule__UnitPow__Group_0_1__1
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
    // InternalStoex.g:3678:1: rule__UnitPow__Group_0_1__0__Impl : ( '(' ) ;
    public final void rule__UnitPow__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3682:1: ( ( '(' ) )
            // InternalStoex.g:3683:1: ( '(' )
            {
            // InternalStoex.g:3683:1: ( '(' )
            // InternalStoex.g:3684:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitPowAccess().getLeftParenthesisKeyword_0_1_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitPowAccess().getLeftParenthesisKeyword_0_1_0()); 
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
    // InternalStoex.g:3693:1: rule__UnitPow__Group_0_1__1 : rule__UnitPow__Group_0_1__1__Impl rule__UnitPow__Group_0_1__2 ;
    public final void rule__UnitPow__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3697:1: ( rule__UnitPow__Group_0_1__1__Impl rule__UnitPow__Group_0_1__2 )
            // InternalStoex.g:3698:2: rule__UnitPow__Group_0_1__1__Impl rule__UnitPow__Group_0_1__2
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
    // InternalStoex.g:3705:1: rule__UnitPow__Group_0_1__1__Impl : ( ( rule__UnitPow__Alternatives_0_1_1 ) ) ;
    public final void rule__UnitPow__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3709:1: ( ( ( rule__UnitPow__Alternatives_0_1_1 ) ) )
            // InternalStoex.g:3710:1: ( ( rule__UnitPow__Alternatives_0_1_1 ) )
            {
            // InternalStoex.g:3710:1: ( ( rule__UnitPow__Alternatives_0_1_1 ) )
            // InternalStoex.g:3711:2: ( rule__UnitPow__Alternatives_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitPowAccess().getAlternatives_0_1_1()); 
            }
            // InternalStoex.g:3712:2: ( rule__UnitPow__Alternatives_0_1_1 )
            // InternalStoex.g:3712:3: rule__UnitPow__Alternatives_0_1_1
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
    // InternalStoex.g:3720:1: rule__UnitPow__Group_0_1__2 : rule__UnitPow__Group_0_1__2__Impl ;
    public final void rule__UnitPow__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3724:1: ( rule__UnitPow__Group_0_1__2__Impl )
            // InternalStoex.g:3725:2: rule__UnitPow__Group_0_1__2__Impl
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
    // InternalStoex.g:3731:1: rule__UnitPow__Group_0_1__2__Impl : ( ')' ) ;
    public final void rule__UnitPow__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3735:1: ( ( ')' ) )
            // InternalStoex.g:3736:1: ( ')' )
            {
            // InternalStoex.g:3736:1: ( ')' )
            // InternalStoex.g:3737:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitPowAccess().getRightParenthesisKeyword_0_1_2()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitPowAccess().getRightParenthesisKeyword_0_1_2()); 
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
    // InternalStoex.g:3747:1: rule__UnitPow__Group_1__0 : rule__UnitPow__Group_1__0__Impl rule__UnitPow__Group_1__1 ;
    public final void rule__UnitPow__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3751:1: ( rule__UnitPow__Group_1__0__Impl rule__UnitPow__Group_1__1 )
            // InternalStoex.g:3752:2: rule__UnitPow__Group_1__0__Impl rule__UnitPow__Group_1__1
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
    // InternalStoex.g:3759:1: rule__UnitPow__Group_1__0__Impl : ( () ) ;
    public final void rule__UnitPow__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3763:1: ( ( () ) )
            // InternalStoex.g:3764:1: ( () )
            {
            // InternalStoex.g:3764:1: ( () )
            // InternalStoex.g:3765:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitPowAccess().getUnitPowerUnitAction_1_0()); 
            }
            // InternalStoex.g:3766:2: ()
            // InternalStoex.g:3766:3: 
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
    // InternalStoex.g:3774:1: rule__UnitPow__Group_1__1 : rule__UnitPow__Group_1__1__Impl rule__UnitPow__Group_1__2 ;
    public final void rule__UnitPow__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3778:1: ( rule__UnitPow__Group_1__1__Impl rule__UnitPow__Group_1__2 )
            // InternalStoex.g:3779:2: rule__UnitPow__Group_1__1__Impl rule__UnitPow__Group_1__2
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
    // InternalStoex.g:3786:1: rule__UnitPow__Group_1__1__Impl : ( '^' ) ;
    public final void rule__UnitPow__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3790:1: ( ( '^' ) )
            // InternalStoex.g:3791:1: ( '^' )
            {
            // InternalStoex.g:3791:1: ( '^' )
            // InternalStoex.g:3792:2: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitPowAccess().getCircumflexAccentKeyword_1_1()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitPowAccess().getCircumflexAccentKeyword_1_1()); 
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
    // InternalStoex.g:3801:1: rule__UnitPow__Group_1__2 : rule__UnitPow__Group_1__2__Impl ;
    public final void rule__UnitPow__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3805:1: ( rule__UnitPow__Group_1__2__Impl )
            // InternalStoex.g:3806:2: rule__UnitPow__Group_1__2__Impl
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
    // InternalStoex.g:3812:1: rule__UnitPow__Group_1__2__Impl : ( ( rule__UnitPow__ExponentAssignment_1_2 ) ) ;
    public final void rule__UnitPow__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3816:1: ( ( ( rule__UnitPow__ExponentAssignment_1_2 ) ) )
            // InternalStoex.g:3817:1: ( ( rule__UnitPow__ExponentAssignment_1_2 ) )
            {
            // InternalStoex.g:3817:1: ( ( rule__UnitPow__ExponentAssignment_1_2 ) )
            // InternalStoex.g:3818:2: ( rule__UnitPow__ExponentAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitPowAccess().getExponentAssignment_1_2()); 
            }
            // InternalStoex.g:3819:2: ( rule__UnitPow__ExponentAssignment_1_2 )
            // InternalStoex.g:3819:3: rule__UnitPow__ExponentAssignment_1_2
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
    // InternalStoex.g:3828:1: rule__BoxedPDF__Group__0 : rule__BoxedPDF__Group__0__Impl rule__BoxedPDF__Group__1 ;
    public final void rule__BoxedPDF__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3832:1: ( rule__BoxedPDF__Group__0__Impl rule__BoxedPDF__Group__1 )
            // InternalStoex.g:3833:2: rule__BoxedPDF__Group__0__Impl rule__BoxedPDF__Group__1
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
    // InternalStoex.g:3840:1: rule__BoxedPDF__Group__0__Impl : ( 'DoublePDF' ) ;
    public final void rule__BoxedPDF__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3844:1: ( ( 'DoublePDF' ) )
            // InternalStoex.g:3845:1: ( 'DoublePDF' )
            {
            // InternalStoex.g:3845:1: ( 'DoublePDF' )
            // InternalStoex.g:3846:2: 'DoublePDF'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoxedPDFAccess().getDoublePDFKeyword_0()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoxedPDFAccess().getDoublePDFKeyword_0()); 
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
    // InternalStoex.g:3855:1: rule__BoxedPDF__Group__1 : rule__BoxedPDF__Group__1__Impl rule__BoxedPDF__Group__2 ;
    public final void rule__BoxedPDF__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3859:1: ( rule__BoxedPDF__Group__1__Impl rule__BoxedPDF__Group__2 )
            // InternalStoex.g:3860:2: rule__BoxedPDF__Group__1__Impl rule__BoxedPDF__Group__2
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
    // InternalStoex.g:3867:1: rule__BoxedPDF__Group__1__Impl : ( '[' ) ;
    public final void rule__BoxedPDF__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3871:1: ( ( '[' ) )
            // InternalStoex.g:3872:1: ( '[' )
            {
            // InternalStoex.g:3872:1: ( '[' )
            // InternalStoex.g:3873:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoxedPDFAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoxedPDFAccess().getLeftSquareBracketKeyword_1()); 
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
    // InternalStoex.g:3882:1: rule__BoxedPDF__Group__2 : rule__BoxedPDF__Group__2__Impl rule__BoxedPDF__Group__3 ;
    public final void rule__BoxedPDF__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3886:1: ( rule__BoxedPDF__Group__2__Impl rule__BoxedPDF__Group__3 )
            // InternalStoex.g:3887:2: rule__BoxedPDF__Group__2__Impl rule__BoxedPDF__Group__3
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
    // InternalStoex.g:3894:1: rule__BoxedPDF__Group__2__Impl : ( ( ( rule__BoxedPDF__SamplesAssignment_2 ) ) ( ( rule__BoxedPDF__SamplesAssignment_2 )* ) ) ;
    public final void rule__BoxedPDF__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3898:1: ( ( ( ( rule__BoxedPDF__SamplesAssignment_2 ) ) ( ( rule__BoxedPDF__SamplesAssignment_2 )* ) ) )
            // InternalStoex.g:3899:1: ( ( ( rule__BoxedPDF__SamplesAssignment_2 ) ) ( ( rule__BoxedPDF__SamplesAssignment_2 )* ) )
            {
            // InternalStoex.g:3899:1: ( ( ( rule__BoxedPDF__SamplesAssignment_2 ) ) ( ( rule__BoxedPDF__SamplesAssignment_2 )* ) )
            // InternalStoex.g:3900:2: ( ( rule__BoxedPDF__SamplesAssignment_2 ) ) ( ( rule__BoxedPDF__SamplesAssignment_2 )* )
            {
            // InternalStoex.g:3900:2: ( ( rule__BoxedPDF__SamplesAssignment_2 ) )
            // InternalStoex.g:3901:3: ( rule__BoxedPDF__SamplesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoxedPDFAccess().getSamplesAssignment_2()); 
            }
            // InternalStoex.g:3902:3: ( rule__BoxedPDF__SamplesAssignment_2 )
            // InternalStoex.g:3902:4: rule__BoxedPDF__SamplesAssignment_2
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

            // InternalStoex.g:3905:2: ( ( rule__BoxedPDF__SamplesAssignment_2 )* )
            // InternalStoex.g:3906:3: ( rule__BoxedPDF__SamplesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoxedPDFAccess().getSamplesAssignment_2()); 
            }
            // InternalStoex.g:3907:3: ( rule__BoxedPDF__SamplesAssignment_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==44) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalStoex.g:3907:4: rule__BoxedPDF__SamplesAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_31);
            	    rule__BoxedPDF__SamplesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalStoex.g:3916:1: rule__BoxedPDF__Group__3 : rule__BoxedPDF__Group__3__Impl rule__BoxedPDF__Group__4 ;
    public final void rule__BoxedPDF__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3920:1: ( rule__BoxedPDF__Group__3__Impl rule__BoxedPDF__Group__4 )
            // InternalStoex.g:3921:2: rule__BoxedPDF__Group__3__Impl rule__BoxedPDF__Group__4
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
    // InternalStoex.g:3928:1: rule__BoxedPDF__Group__3__Impl : ( ']' ) ;
    public final void rule__BoxedPDF__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3932:1: ( ( ']' ) )
            // InternalStoex.g:3933:1: ( ']' )
            {
            // InternalStoex.g:3933:1: ( ']' )
            // InternalStoex.g:3934:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoxedPDFAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoxedPDFAccess().getRightSquareBracketKeyword_3()); 
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
    // InternalStoex.g:3943:1: rule__BoxedPDF__Group__4 : rule__BoxedPDF__Group__4__Impl ;
    public final void rule__BoxedPDF__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3947:1: ( rule__BoxedPDF__Group__4__Impl )
            // InternalStoex.g:3948:2: rule__BoxedPDF__Group__4__Impl
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
    // InternalStoex.g:3954:1: rule__BoxedPDF__Group__4__Impl : ( ( rule__BoxedPDF__Group_4__0 )? ) ;
    public final void rule__BoxedPDF__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3958:1: ( ( ( rule__BoxedPDF__Group_4__0 )? ) )
            // InternalStoex.g:3959:1: ( ( rule__BoxedPDF__Group_4__0 )? )
            {
            // InternalStoex.g:3959:1: ( ( rule__BoxedPDF__Group_4__0 )? )
            // InternalStoex.g:3960:2: ( rule__BoxedPDF__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoxedPDFAccess().getGroup_4()); 
            }
            // InternalStoex.g:3961:2: ( rule__BoxedPDF__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalStoex.g:3961:3: rule__BoxedPDF__Group_4__0
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
    // InternalStoex.g:3970:1: rule__BoxedPDF__Group_4__0 : rule__BoxedPDF__Group_4__0__Impl rule__BoxedPDF__Group_4__1 ;
    public final void rule__BoxedPDF__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3974:1: ( rule__BoxedPDF__Group_4__0__Impl rule__BoxedPDF__Group_4__1 )
            // InternalStoex.g:3975:2: rule__BoxedPDF__Group_4__0__Impl rule__BoxedPDF__Group_4__1
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
    // InternalStoex.g:3982:1: rule__BoxedPDF__Group_4__0__Impl : ( '[' ) ;
    public final void rule__BoxedPDF__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:3986:1: ( ( '[' ) )
            // InternalStoex.g:3987:1: ( '[' )
            {
            // InternalStoex.g:3987:1: ( '[' )
            // InternalStoex.g:3988:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoxedPDFAccess().getLeftSquareBracketKeyword_4_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoxedPDFAccess().getLeftSquareBracketKeyword_4_0()); 
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
    // InternalStoex.g:3997:1: rule__BoxedPDF__Group_4__1 : rule__BoxedPDF__Group_4__1__Impl rule__BoxedPDF__Group_4__2 ;
    public final void rule__BoxedPDF__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4001:1: ( rule__BoxedPDF__Group_4__1__Impl rule__BoxedPDF__Group_4__2 )
            // InternalStoex.g:4002:2: rule__BoxedPDF__Group_4__1__Impl rule__BoxedPDF__Group_4__2
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
    // InternalStoex.g:4009:1: rule__BoxedPDF__Group_4__1__Impl : ( ( rule__BoxedPDF__UnitAssignment_4_1 ) ) ;
    public final void rule__BoxedPDF__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4013:1: ( ( ( rule__BoxedPDF__UnitAssignment_4_1 ) ) )
            // InternalStoex.g:4014:1: ( ( rule__BoxedPDF__UnitAssignment_4_1 ) )
            {
            // InternalStoex.g:4014:1: ( ( rule__BoxedPDF__UnitAssignment_4_1 ) )
            // InternalStoex.g:4015:2: ( rule__BoxedPDF__UnitAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoxedPDFAccess().getUnitAssignment_4_1()); 
            }
            // InternalStoex.g:4016:2: ( rule__BoxedPDF__UnitAssignment_4_1 )
            // InternalStoex.g:4016:3: rule__BoxedPDF__UnitAssignment_4_1
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
    // InternalStoex.g:4024:1: rule__BoxedPDF__Group_4__2 : rule__BoxedPDF__Group_4__2__Impl ;
    public final void rule__BoxedPDF__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4028:1: ( rule__BoxedPDF__Group_4__2__Impl )
            // InternalStoex.g:4029:2: rule__BoxedPDF__Group_4__2__Impl
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
    // InternalStoex.g:4035:1: rule__BoxedPDF__Group_4__2__Impl : ( ']' ) ;
    public final void rule__BoxedPDF__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4039:1: ( ( ']' ) )
            // InternalStoex.g:4040:1: ( ']' )
            {
            // InternalStoex.g:4040:1: ( ']' )
            // InternalStoex.g:4041:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoxedPDFAccess().getRightSquareBracketKeyword_4_2()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoxedPDFAccess().getRightSquareBracketKeyword_4_2()); 
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
    // InternalStoex.g:4051:1: rule__ProbabilityMassFunction__Group_0__0 : rule__ProbabilityMassFunction__Group_0__0__Impl rule__ProbabilityMassFunction__Group_0__1 ;
    public final void rule__ProbabilityMassFunction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4055:1: ( rule__ProbabilityMassFunction__Group_0__0__Impl rule__ProbabilityMassFunction__Group_0__1 )
            // InternalStoex.g:4056:2: rule__ProbabilityMassFunction__Group_0__0__Impl rule__ProbabilityMassFunction__Group_0__1
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
    // InternalStoex.g:4063:1: rule__ProbabilityMassFunction__Group_0__0__Impl : ( 'IntPMF' ) ;
    public final void rule__ProbabilityMassFunction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4067:1: ( ( 'IntPMF' ) )
            // InternalStoex.g:4068:1: ( 'IntPMF' )
            {
            // InternalStoex.g:4068:1: ( 'IntPMF' )
            // InternalStoex.g:4069:2: 'IntPMF'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getIntPMFKeyword_0_0()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getIntPMFKeyword_0_0()); 
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
    // InternalStoex.g:4078:1: rule__ProbabilityMassFunction__Group_0__1 : rule__ProbabilityMassFunction__Group_0__1__Impl rule__ProbabilityMassFunction__Group_0__2 ;
    public final void rule__ProbabilityMassFunction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4082:1: ( rule__ProbabilityMassFunction__Group_0__1__Impl rule__ProbabilityMassFunction__Group_0__2 )
            // InternalStoex.g:4083:2: rule__ProbabilityMassFunction__Group_0__1__Impl rule__ProbabilityMassFunction__Group_0__2
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
    // InternalStoex.g:4090:1: rule__ProbabilityMassFunction__Group_0__1__Impl : ( '[' ) ;
    public final void rule__ProbabilityMassFunction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4094:1: ( ( '[' ) )
            // InternalStoex.g:4095:1: ( '[' )
            {
            // InternalStoex.g:4095:1: ( '[' )
            // InternalStoex.g:4096:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getLeftSquareBracketKeyword_0_1()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getLeftSquareBracketKeyword_0_1()); 
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
    // InternalStoex.g:4105:1: rule__ProbabilityMassFunction__Group_0__2 : rule__ProbabilityMassFunction__Group_0__2__Impl rule__ProbabilityMassFunction__Group_0__3 ;
    public final void rule__ProbabilityMassFunction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4109:1: ( rule__ProbabilityMassFunction__Group_0__2__Impl rule__ProbabilityMassFunction__Group_0__3 )
            // InternalStoex.g:4110:2: rule__ProbabilityMassFunction__Group_0__2__Impl rule__ProbabilityMassFunction__Group_0__3
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
    // InternalStoex.g:4117:1: rule__ProbabilityMassFunction__Group_0__2__Impl : ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 )* ) ) ;
    public final void rule__ProbabilityMassFunction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4121:1: ( ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 )* ) ) )
            // InternalStoex.g:4122:1: ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 )* ) )
            {
            // InternalStoex.g:4122:1: ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 )* ) )
            // InternalStoex.g:4123:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 )* )
            {
            // InternalStoex.g:4123:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 ) )
            // InternalStoex.g:4124:3: ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_0_2()); 
            }
            // InternalStoex.g:4125:3: ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 )
            // InternalStoex.g:4125:4: rule__ProbabilityMassFunction__SamplesAssignment_0_2
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

            // InternalStoex.g:4128:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 )* )
            // InternalStoex.g:4129:3: ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_0_2()); 
            }
            // InternalStoex.g:4130:3: ( rule__ProbabilityMassFunction__SamplesAssignment_0_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==44) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalStoex.g:4130:4: rule__ProbabilityMassFunction__SamplesAssignment_0_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_31);
            	    rule__ProbabilityMassFunction__SamplesAssignment_0_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalStoex.g:4139:1: rule__ProbabilityMassFunction__Group_0__3 : rule__ProbabilityMassFunction__Group_0__3__Impl rule__ProbabilityMassFunction__Group_0__4 ;
    public final void rule__ProbabilityMassFunction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4143:1: ( rule__ProbabilityMassFunction__Group_0__3__Impl rule__ProbabilityMassFunction__Group_0__4 )
            // InternalStoex.g:4144:2: rule__ProbabilityMassFunction__Group_0__3__Impl rule__ProbabilityMassFunction__Group_0__4
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
    // InternalStoex.g:4151:1: rule__ProbabilityMassFunction__Group_0__3__Impl : ( ']' ) ;
    public final void rule__ProbabilityMassFunction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4155:1: ( ( ']' ) )
            // InternalStoex.g:4156:1: ( ']' )
            {
            // InternalStoex.g:4156:1: ( ']' )
            // InternalStoex.g:4157:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getRightSquareBracketKeyword_0_3()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getRightSquareBracketKeyword_0_3()); 
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
    // InternalStoex.g:4166:1: rule__ProbabilityMassFunction__Group_0__4 : rule__ProbabilityMassFunction__Group_0__4__Impl ;
    public final void rule__ProbabilityMassFunction__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4170:1: ( rule__ProbabilityMassFunction__Group_0__4__Impl )
            // InternalStoex.g:4171:2: rule__ProbabilityMassFunction__Group_0__4__Impl
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
    // InternalStoex.g:4177:1: rule__ProbabilityMassFunction__Group_0__4__Impl : ( ( rule__ProbabilityMassFunction__Group_0_4__0 )? ) ;
    public final void rule__ProbabilityMassFunction__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4181:1: ( ( ( rule__ProbabilityMassFunction__Group_0_4__0 )? ) )
            // InternalStoex.g:4182:1: ( ( rule__ProbabilityMassFunction__Group_0_4__0 )? )
            {
            // InternalStoex.g:4182:1: ( ( rule__ProbabilityMassFunction__Group_0_4__0 )? )
            // InternalStoex.g:4183:2: ( rule__ProbabilityMassFunction__Group_0_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getGroup_0_4()); 
            }
            // InternalStoex.g:4184:2: ( rule__ProbabilityMassFunction__Group_0_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==42) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalStoex.g:4184:3: rule__ProbabilityMassFunction__Group_0_4__0
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
    // InternalStoex.g:4193:1: rule__ProbabilityMassFunction__Group_0_4__0 : rule__ProbabilityMassFunction__Group_0_4__0__Impl rule__ProbabilityMassFunction__Group_0_4__1 ;
    public final void rule__ProbabilityMassFunction__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4197:1: ( rule__ProbabilityMassFunction__Group_0_4__0__Impl rule__ProbabilityMassFunction__Group_0_4__1 )
            // InternalStoex.g:4198:2: rule__ProbabilityMassFunction__Group_0_4__0__Impl rule__ProbabilityMassFunction__Group_0_4__1
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
    // InternalStoex.g:4205:1: rule__ProbabilityMassFunction__Group_0_4__0__Impl : ( '[' ) ;
    public final void rule__ProbabilityMassFunction__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4209:1: ( ( '[' ) )
            // InternalStoex.g:4210:1: ( '[' )
            {
            // InternalStoex.g:4210:1: ( '[' )
            // InternalStoex.g:4211:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getLeftSquareBracketKeyword_0_4_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getLeftSquareBracketKeyword_0_4_0()); 
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
    // InternalStoex.g:4220:1: rule__ProbabilityMassFunction__Group_0_4__1 : rule__ProbabilityMassFunction__Group_0_4__1__Impl rule__ProbabilityMassFunction__Group_0_4__2 ;
    public final void rule__ProbabilityMassFunction__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4224:1: ( rule__ProbabilityMassFunction__Group_0_4__1__Impl rule__ProbabilityMassFunction__Group_0_4__2 )
            // InternalStoex.g:4225:2: rule__ProbabilityMassFunction__Group_0_4__1__Impl rule__ProbabilityMassFunction__Group_0_4__2
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
    // InternalStoex.g:4232:1: rule__ProbabilityMassFunction__Group_0_4__1__Impl : ( ( rule__ProbabilityMassFunction__UnitAssignment_0_4_1 ) ) ;
    public final void rule__ProbabilityMassFunction__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4236:1: ( ( ( rule__ProbabilityMassFunction__UnitAssignment_0_4_1 ) ) )
            // InternalStoex.g:4237:1: ( ( rule__ProbabilityMassFunction__UnitAssignment_0_4_1 ) )
            {
            // InternalStoex.g:4237:1: ( ( rule__ProbabilityMassFunction__UnitAssignment_0_4_1 ) )
            // InternalStoex.g:4238:2: ( rule__ProbabilityMassFunction__UnitAssignment_0_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getUnitAssignment_0_4_1()); 
            }
            // InternalStoex.g:4239:2: ( rule__ProbabilityMassFunction__UnitAssignment_0_4_1 )
            // InternalStoex.g:4239:3: rule__ProbabilityMassFunction__UnitAssignment_0_4_1
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
    // InternalStoex.g:4247:1: rule__ProbabilityMassFunction__Group_0_4__2 : rule__ProbabilityMassFunction__Group_0_4__2__Impl ;
    public final void rule__ProbabilityMassFunction__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4251:1: ( rule__ProbabilityMassFunction__Group_0_4__2__Impl )
            // InternalStoex.g:4252:2: rule__ProbabilityMassFunction__Group_0_4__2__Impl
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
    // InternalStoex.g:4258:1: rule__ProbabilityMassFunction__Group_0_4__2__Impl : ( ']' ) ;
    public final void rule__ProbabilityMassFunction__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4262:1: ( ( ']' ) )
            // InternalStoex.g:4263:1: ( ']' )
            {
            // InternalStoex.g:4263:1: ( ']' )
            // InternalStoex.g:4264:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getRightSquareBracketKeyword_0_4_2()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getRightSquareBracketKeyword_0_4_2()); 
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
    // InternalStoex.g:4274:1: rule__ProbabilityMassFunction__Group_1__0 : rule__ProbabilityMassFunction__Group_1__0__Impl rule__ProbabilityMassFunction__Group_1__1 ;
    public final void rule__ProbabilityMassFunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4278:1: ( rule__ProbabilityMassFunction__Group_1__0__Impl rule__ProbabilityMassFunction__Group_1__1 )
            // InternalStoex.g:4279:2: rule__ProbabilityMassFunction__Group_1__0__Impl rule__ProbabilityMassFunction__Group_1__1
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
    // InternalStoex.g:4286:1: rule__ProbabilityMassFunction__Group_1__0__Impl : ( 'DoublePMF' ) ;
    public final void rule__ProbabilityMassFunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4290:1: ( ( 'DoublePMF' ) )
            // InternalStoex.g:4291:1: ( 'DoublePMF' )
            {
            // InternalStoex.g:4291:1: ( 'DoublePMF' )
            // InternalStoex.g:4292:2: 'DoublePMF'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getDoublePMFKeyword_1_0()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getDoublePMFKeyword_1_0()); 
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
    // InternalStoex.g:4301:1: rule__ProbabilityMassFunction__Group_1__1 : rule__ProbabilityMassFunction__Group_1__1__Impl rule__ProbabilityMassFunction__Group_1__2 ;
    public final void rule__ProbabilityMassFunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4305:1: ( rule__ProbabilityMassFunction__Group_1__1__Impl rule__ProbabilityMassFunction__Group_1__2 )
            // InternalStoex.g:4306:2: rule__ProbabilityMassFunction__Group_1__1__Impl rule__ProbabilityMassFunction__Group_1__2
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
    // InternalStoex.g:4313:1: rule__ProbabilityMassFunction__Group_1__1__Impl : ( '[' ) ;
    public final void rule__ProbabilityMassFunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4317:1: ( ( '[' ) )
            // InternalStoex.g:4318:1: ( '[' )
            {
            // InternalStoex.g:4318:1: ( '[' )
            // InternalStoex.g:4319:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getLeftSquareBracketKeyword_1_1()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getLeftSquareBracketKeyword_1_1()); 
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
    // InternalStoex.g:4328:1: rule__ProbabilityMassFunction__Group_1__2 : rule__ProbabilityMassFunction__Group_1__2__Impl rule__ProbabilityMassFunction__Group_1__3 ;
    public final void rule__ProbabilityMassFunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4332:1: ( rule__ProbabilityMassFunction__Group_1__2__Impl rule__ProbabilityMassFunction__Group_1__3 )
            // InternalStoex.g:4333:2: rule__ProbabilityMassFunction__Group_1__2__Impl rule__ProbabilityMassFunction__Group_1__3
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
    // InternalStoex.g:4340:1: rule__ProbabilityMassFunction__Group_1__2__Impl : ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 )* ) ) ;
    public final void rule__ProbabilityMassFunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4344:1: ( ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 )* ) ) )
            // InternalStoex.g:4345:1: ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 )* ) )
            {
            // InternalStoex.g:4345:1: ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 )* ) )
            // InternalStoex.g:4346:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 )* )
            {
            // InternalStoex.g:4346:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 ) )
            // InternalStoex.g:4347:3: ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_1_2()); 
            }
            // InternalStoex.g:4348:3: ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 )
            // InternalStoex.g:4348:4: rule__ProbabilityMassFunction__SamplesAssignment_1_2
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

            // InternalStoex.g:4351:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 )* )
            // InternalStoex.g:4352:3: ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_1_2()); 
            }
            // InternalStoex.g:4353:3: ( rule__ProbabilityMassFunction__SamplesAssignment_1_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==44) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalStoex.g:4353:4: rule__ProbabilityMassFunction__SamplesAssignment_1_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_31);
            	    rule__ProbabilityMassFunction__SamplesAssignment_1_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalStoex.g:4362:1: rule__ProbabilityMassFunction__Group_1__3 : rule__ProbabilityMassFunction__Group_1__3__Impl rule__ProbabilityMassFunction__Group_1__4 ;
    public final void rule__ProbabilityMassFunction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4366:1: ( rule__ProbabilityMassFunction__Group_1__3__Impl rule__ProbabilityMassFunction__Group_1__4 )
            // InternalStoex.g:4367:2: rule__ProbabilityMassFunction__Group_1__3__Impl rule__ProbabilityMassFunction__Group_1__4
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
    // InternalStoex.g:4374:1: rule__ProbabilityMassFunction__Group_1__3__Impl : ( ']' ) ;
    public final void rule__ProbabilityMassFunction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4378:1: ( ( ']' ) )
            // InternalStoex.g:4379:1: ( ']' )
            {
            // InternalStoex.g:4379:1: ( ']' )
            // InternalStoex.g:4380:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getRightSquareBracketKeyword_1_3()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getRightSquareBracketKeyword_1_3()); 
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
    // InternalStoex.g:4389:1: rule__ProbabilityMassFunction__Group_1__4 : rule__ProbabilityMassFunction__Group_1__4__Impl ;
    public final void rule__ProbabilityMassFunction__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4393:1: ( rule__ProbabilityMassFunction__Group_1__4__Impl )
            // InternalStoex.g:4394:2: rule__ProbabilityMassFunction__Group_1__4__Impl
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
    // InternalStoex.g:4400:1: rule__ProbabilityMassFunction__Group_1__4__Impl : ( ( rule__ProbabilityMassFunction__Group_1_4__0 )? ) ;
    public final void rule__ProbabilityMassFunction__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4404:1: ( ( ( rule__ProbabilityMassFunction__Group_1_4__0 )? ) )
            // InternalStoex.g:4405:1: ( ( rule__ProbabilityMassFunction__Group_1_4__0 )? )
            {
            // InternalStoex.g:4405:1: ( ( rule__ProbabilityMassFunction__Group_1_4__0 )? )
            // InternalStoex.g:4406:2: ( rule__ProbabilityMassFunction__Group_1_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getGroup_1_4()); 
            }
            // InternalStoex.g:4407:2: ( rule__ProbabilityMassFunction__Group_1_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==42) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalStoex.g:4407:3: rule__ProbabilityMassFunction__Group_1_4__0
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
    // InternalStoex.g:4416:1: rule__ProbabilityMassFunction__Group_1_4__0 : rule__ProbabilityMassFunction__Group_1_4__0__Impl rule__ProbabilityMassFunction__Group_1_4__1 ;
    public final void rule__ProbabilityMassFunction__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4420:1: ( rule__ProbabilityMassFunction__Group_1_4__0__Impl rule__ProbabilityMassFunction__Group_1_4__1 )
            // InternalStoex.g:4421:2: rule__ProbabilityMassFunction__Group_1_4__0__Impl rule__ProbabilityMassFunction__Group_1_4__1
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
    // InternalStoex.g:4428:1: rule__ProbabilityMassFunction__Group_1_4__0__Impl : ( '[' ) ;
    public final void rule__ProbabilityMassFunction__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4432:1: ( ( '[' ) )
            // InternalStoex.g:4433:1: ( '[' )
            {
            // InternalStoex.g:4433:1: ( '[' )
            // InternalStoex.g:4434:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getLeftSquareBracketKeyword_1_4_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getLeftSquareBracketKeyword_1_4_0()); 
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
    // InternalStoex.g:4443:1: rule__ProbabilityMassFunction__Group_1_4__1 : rule__ProbabilityMassFunction__Group_1_4__1__Impl rule__ProbabilityMassFunction__Group_1_4__2 ;
    public final void rule__ProbabilityMassFunction__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4447:1: ( rule__ProbabilityMassFunction__Group_1_4__1__Impl rule__ProbabilityMassFunction__Group_1_4__2 )
            // InternalStoex.g:4448:2: rule__ProbabilityMassFunction__Group_1_4__1__Impl rule__ProbabilityMassFunction__Group_1_4__2
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
    // InternalStoex.g:4455:1: rule__ProbabilityMassFunction__Group_1_4__1__Impl : ( ( rule__ProbabilityMassFunction__UnitAssignment_1_4_1 ) ) ;
    public final void rule__ProbabilityMassFunction__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4459:1: ( ( ( rule__ProbabilityMassFunction__UnitAssignment_1_4_1 ) ) )
            // InternalStoex.g:4460:1: ( ( rule__ProbabilityMassFunction__UnitAssignment_1_4_1 ) )
            {
            // InternalStoex.g:4460:1: ( ( rule__ProbabilityMassFunction__UnitAssignment_1_4_1 ) )
            // InternalStoex.g:4461:2: ( rule__ProbabilityMassFunction__UnitAssignment_1_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getUnitAssignment_1_4_1()); 
            }
            // InternalStoex.g:4462:2: ( rule__ProbabilityMassFunction__UnitAssignment_1_4_1 )
            // InternalStoex.g:4462:3: rule__ProbabilityMassFunction__UnitAssignment_1_4_1
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
    // InternalStoex.g:4470:1: rule__ProbabilityMassFunction__Group_1_4__2 : rule__ProbabilityMassFunction__Group_1_4__2__Impl ;
    public final void rule__ProbabilityMassFunction__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4474:1: ( rule__ProbabilityMassFunction__Group_1_4__2__Impl )
            // InternalStoex.g:4475:2: rule__ProbabilityMassFunction__Group_1_4__2__Impl
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
    // InternalStoex.g:4481:1: rule__ProbabilityMassFunction__Group_1_4__2__Impl : ( ']' ) ;
    public final void rule__ProbabilityMassFunction__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4485:1: ( ( ']' ) )
            // InternalStoex.g:4486:1: ( ']' )
            {
            // InternalStoex.g:4486:1: ( ']' )
            // InternalStoex.g:4487:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getRightSquareBracketKeyword_1_4_2()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getRightSquareBracketKeyword_1_4_2()); 
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
    // InternalStoex.g:4497:1: rule__ProbabilityMassFunction__Group_2__0 : rule__ProbabilityMassFunction__Group_2__0__Impl rule__ProbabilityMassFunction__Group_2__1 ;
    public final void rule__ProbabilityMassFunction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4501:1: ( rule__ProbabilityMassFunction__Group_2__0__Impl rule__ProbabilityMassFunction__Group_2__1 )
            // InternalStoex.g:4502:2: rule__ProbabilityMassFunction__Group_2__0__Impl rule__ProbabilityMassFunction__Group_2__1
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
    // InternalStoex.g:4509:1: rule__ProbabilityMassFunction__Group_2__0__Impl : ( 'EnumPMF' ) ;
    public final void rule__ProbabilityMassFunction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4513:1: ( ( 'EnumPMF' ) )
            // InternalStoex.g:4514:1: ( 'EnumPMF' )
            {
            // InternalStoex.g:4514:1: ( 'EnumPMF' )
            // InternalStoex.g:4515:2: 'EnumPMF'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getEnumPMFKeyword_2_0()); 
            }
            match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getEnumPMFKeyword_2_0()); 
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
    // InternalStoex.g:4524:1: rule__ProbabilityMassFunction__Group_2__1 : rule__ProbabilityMassFunction__Group_2__1__Impl rule__ProbabilityMassFunction__Group_2__2 ;
    public final void rule__ProbabilityMassFunction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4528:1: ( rule__ProbabilityMassFunction__Group_2__1__Impl rule__ProbabilityMassFunction__Group_2__2 )
            // InternalStoex.g:4529:2: rule__ProbabilityMassFunction__Group_2__1__Impl rule__ProbabilityMassFunction__Group_2__2
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
    // InternalStoex.g:4536:1: rule__ProbabilityMassFunction__Group_2__1__Impl : ( ( rule__ProbabilityMassFunction__Group_2_1__0 )? ) ;
    public final void rule__ProbabilityMassFunction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4540:1: ( ( ( rule__ProbabilityMassFunction__Group_2_1__0 )? ) )
            // InternalStoex.g:4541:1: ( ( rule__ProbabilityMassFunction__Group_2_1__0 )? )
            {
            // InternalStoex.g:4541:1: ( ( rule__ProbabilityMassFunction__Group_2_1__0 )? )
            // InternalStoex.g:4542:2: ( rule__ProbabilityMassFunction__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getGroup_2_1()); 
            }
            // InternalStoex.g:4543:2: ( rule__ProbabilityMassFunction__Group_2_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==44) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalStoex.g:4543:3: rule__ProbabilityMassFunction__Group_2_1__0
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
    // InternalStoex.g:4551:1: rule__ProbabilityMassFunction__Group_2__2 : rule__ProbabilityMassFunction__Group_2__2__Impl rule__ProbabilityMassFunction__Group_2__3 ;
    public final void rule__ProbabilityMassFunction__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4555:1: ( rule__ProbabilityMassFunction__Group_2__2__Impl rule__ProbabilityMassFunction__Group_2__3 )
            // InternalStoex.g:4556:2: rule__ProbabilityMassFunction__Group_2__2__Impl rule__ProbabilityMassFunction__Group_2__3
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
    // InternalStoex.g:4563:1: rule__ProbabilityMassFunction__Group_2__2__Impl : ( '[' ) ;
    public final void rule__ProbabilityMassFunction__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4567:1: ( ( '[' ) )
            // InternalStoex.g:4568:1: ( '[' )
            {
            // InternalStoex.g:4568:1: ( '[' )
            // InternalStoex.g:4569:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getLeftSquareBracketKeyword_2_2()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getLeftSquareBracketKeyword_2_2()); 
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
    // InternalStoex.g:4578:1: rule__ProbabilityMassFunction__Group_2__3 : rule__ProbabilityMassFunction__Group_2__3__Impl rule__ProbabilityMassFunction__Group_2__4 ;
    public final void rule__ProbabilityMassFunction__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4582:1: ( rule__ProbabilityMassFunction__Group_2__3__Impl rule__ProbabilityMassFunction__Group_2__4 )
            // InternalStoex.g:4583:2: rule__ProbabilityMassFunction__Group_2__3__Impl rule__ProbabilityMassFunction__Group_2__4
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
    // InternalStoex.g:4590:1: rule__ProbabilityMassFunction__Group_2__3__Impl : ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 )* ) ) ;
    public final void rule__ProbabilityMassFunction__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4594:1: ( ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 )* ) ) )
            // InternalStoex.g:4595:1: ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 )* ) )
            {
            // InternalStoex.g:4595:1: ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 )* ) )
            // InternalStoex.g:4596:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 )* )
            {
            // InternalStoex.g:4596:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 ) )
            // InternalStoex.g:4597:3: ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_2_3()); 
            }
            // InternalStoex.g:4598:3: ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 )
            // InternalStoex.g:4598:4: rule__ProbabilityMassFunction__SamplesAssignment_2_3
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

            // InternalStoex.g:4601:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 )* )
            // InternalStoex.g:4602:3: ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_2_3()); 
            }
            // InternalStoex.g:4603:3: ( rule__ProbabilityMassFunction__SamplesAssignment_2_3 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==44) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalStoex.g:4603:4: rule__ProbabilityMassFunction__SamplesAssignment_2_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_31);
            	    rule__ProbabilityMassFunction__SamplesAssignment_2_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalStoex.g:4612:1: rule__ProbabilityMassFunction__Group_2__4 : rule__ProbabilityMassFunction__Group_2__4__Impl ;
    public final void rule__ProbabilityMassFunction__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4616:1: ( rule__ProbabilityMassFunction__Group_2__4__Impl )
            // InternalStoex.g:4617:2: rule__ProbabilityMassFunction__Group_2__4__Impl
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
    // InternalStoex.g:4623:1: rule__ProbabilityMassFunction__Group_2__4__Impl : ( ']' ) ;
    public final void rule__ProbabilityMassFunction__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4627:1: ( ( ']' ) )
            // InternalStoex.g:4628:1: ( ']' )
            {
            // InternalStoex.g:4628:1: ( ']' )
            // InternalStoex.g:4629:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getRightSquareBracketKeyword_2_4()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getRightSquareBracketKeyword_2_4()); 
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
    // InternalStoex.g:4639:1: rule__ProbabilityMassFunction__Group_2_1__0 : rule__ProbabilityMassFunction__Group_2_1__0__Impl rule__ProbabilityMassFunction__Group_2_1__1 ;
    public final void rule__ProbabilityMassFunction__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4643:1: ( rule__ProbabilityMassFunction__Group_2_1__0__Impl rule__ProbabilityMassFunction__Group_2_1__1 )
            // InternalStoex.g:4644:2: rule__ProbabilityMassFunction__Group_2_1__0__Impl rule__ProbabilityMassFunction__Group_2_1__1
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
    // InternalStoex.g:4651:1: rule__ProbabilityMassFunction__Group_2_1__0__Impl : ( '(' ) ;
    public final void rule__ProbabilityMassFunction__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4655:1: ( ( '(' ) )
            // InternalStoex.g:4656:1: ( '(' )
            {
            // InternalStoex.g:4656:1: ( '(' )
            // InternalStoex.g:4657:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getLeftParenthesisKeyword_2_1_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getLeftParenthesisKeyword_2_1_0()); 
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
    // InternalStoex.g:4666:1: rule__ProbabilityMassFunction__Group_2_1__1 : rule__ProbabilityMassFunction__Group_2_1__1__Impl rule__ProbabilityMassFunction__Group_2_1__2 ;
    public final void rule__ProbabilityMassFunction__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4670:1: ( rule__ProbabilityMassFunction__Group_2_1__1__Impl rule__ProbabilityMassFunction__Group_2_1__2 )
            // InternalStoex.g:4671:2: rule__ProbabilityMassFunction__Group_2_1__1__Impl rule__ProbabilityMassFunction__Group_2_1__2
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
    // InternalStoex.g:4678:1: rule__ProbabilityMassFunction__Group_2_1__1__Impl : ( ( rule__ProbabilityMassFunction__OrderedDomainAssignment_2_1_1 ) ) ;
    public final void rule__ProbabilityMassFunction__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4682:1: ( ( ( rule__ProbabilityMassFunction__OrderedDomainAssignment_2_1_1 ) ) )
            // InternalStoex.g:4683:1: ( ( rule__ProbabilityMassFunction__OrderedDomainAssignment_2_1_1 ) )
            {
            // InternalStoex.g:4683:1: ( ( rule__ProbabilityMassFunction__OrderedDomainAssignment_2_1_1 ) )
            // InternalStoex.g:4684:2: ( rule__ProbabilityMassFunction__OrderedDomainAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getOrderedDomainAssignment_2_1_1()); 
            }
            // InternalStoex.g:4685:2: ( rule__ProbabilityMassFunction__OrderedDomainAssignment_2_1_1 )
            // InternalStoex.g:4685:3: rule__ProbabilityMassFunction__OrderedDomainAssignment_2_1_1
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
    // InternalStoex.g:4693:1: rule__ProbabilityMassFunction__Group_2_1__2 : rule__ProbabilityMassFunction__Group_2_1__2__Impl ;
    public final void rule__ProbabilityMassFunction__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4697:1: ( rule__ProbabilityMassFunction__Group_2_1__2__Impl )
            // InternalStoex.g:4698:2: rule__ProbabilityMassFunction__Group_2_1__2__Impl
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
    // InternalStoex.g:4704:1: rule__ProbabilityMassFunction__Group_2_1__2__Impl : ( ')' ) ;
    public final void rule__ProbabilityMassFunction__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4708:1: ( ( ')' ) )
            // InternalStoex.g:4709:1: ( ')' )
            {
            // InternalStoex.g:4709:1: ( ')' )
            // InternalStoex.g:4710:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getRightParenthesisKeyword_2_1_2()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getRightParenthesisKeyword_2_1_2()); 
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
    // InternalStoex.g:4720:1: rule__ProbabilityMassFunction__Group_3__0 : rule__ProbabilityMassFunction__Group_3__0__Impl rule__ProbabilityMassFunction__Group_3__1 ;
    public final void rule__ProbabilityMassFunction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4724:1: ( rule__ProbabilityMassFunction__Group_3__0__Impl rule__ProbabilityMassFunction__Group_3__1 )
            // InternalStoex.g:4725:2: rule__ProbabilityMassFunction__Group_3__0__Impl rule__ProbabilityMassFunction__Group_3__1
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
    // InternalStoex.g:4732:1: rule__ProbabilityMassFunction__Group_3__0__Impl : ( 'BoolPMF' ) ;
    public final void rule__ProbabilityMassFunction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4736:1: ( ( 'BoolPMF' ) )
            // InternalStoex.g:4737:1: ( 'BoolPMF' )
            {
            // InternalStoex.g:4737:1: ( 'BoolPMF' )
            // InternalStoex.g:4738:2: 'BoolPMF'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getBoolPMFKeyword_3_0()); 
            }
            match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getBoolPMFKeyword_3_0()); 
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
    // InternalStoex.g:4747:1: rule__ProbabilityMassFunction__Group_3__1 : rule__ProbabilityMassFunction__Group_3__1__Impl rule__ProbabilityMassFunction__Group_3__2 ;
    public final void rule__ProbabilityMassFunction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4751:1: ( rule__ProbabilityMassFunction__Group_3__1__Impl rule__ProbabilityMassFunction__Group_3__2 )
            // InternalStoex.g:4752:2: rule__ProbabilityMassFunction__Group_3__1__Impl rule__ProbabilityMassFunction__Group_3__2
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
    // InternalStoex.g:4759:1: rule__ProbabilityMassFunction__Group_3__1__Impl : ( ( rule__ProbabilityMassFunction__Group_3_1__0 )? ) ;
    public final void rule__ProbabilityMassFunction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4763:1: ( ( ( rule__ProbabilityMassFunction__Group_3_1__0 )? ) )
            // InternalStoex.g:4764:1: ( ( rule__ProbabilityMassFunction__Group_3_1__0 )? )
            {
            // InternalStoex.g:4764:1: ( ( rule__ProbabilityMassFunction__Group_3_1__0 )? )
            // InternalStoex.g:4765:2: ( rule__ProbabilityMassFunction__Group_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getGroup_3_1()); 
            }
            // InternalStoex.g:4766:2: ( rule__ProbabilityMassFunction__Group_3_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalStoex.g:4766:3: rule__ProbabilityMassFunction__Group_3_1__0
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
    // InternalStoex.g:4774:1: rule__ProbabilityMassFunction__Group_3__2 : rule__ProbabilityMassFunction__Group_3__2__Impl rule__ProbabilityMassFunction__Group_3__3 ;
    public final void rule__ProbabilityMassFunction__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4778:1: ( rule__ProbabilityMassFunction__Group_3__2__Impl rule__ProbabilityMassFunction__Group_3__3 )
            // InternalStoex.g:4779:2: rule__ProbabilityMassFunction__Group_3__2__Impl rule__ProbabilityMassFunction__Group_3__3
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
    // InternalStoex.g:4786:1: rule__ProbabilityMassFunction__Group_3__2__Impl : ( '[' ) ;
    public final void rule__ProbabilityMassFunction__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4790:1: ( ( '[' ) )
            // InternalStoex.g:4791:1: ( '[' )
            {
            // InternalStoex.g:4791:1: ( '[' )
            // InternalStoex.g:4792:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getLeftSquareBracketKeyword_3_2()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getLeftSquareBracketKeyword_3_2()); 
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
    // InternalStoex.g:4801:1: rule__ProbabilityMassFunction__Group_3__3 : rule__ProbabilityMassFunction__Group_3__3__Impl rule__ProbabilityMassFunction__Group_3__4 ;
    public final void rule__ProbabilityMassFunction__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4805:1: ( rule__ProbabilityMassFunction__Group_3__3__Impl rule__ProbabilityMassFunction__Group_3__4 )
            // InternalStoex.g:4806:2: rule__ProbabilityMassFunction__Group_3__3__Impl rule__ProbabilityMassFunction__Group_3__4
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
    // InternalStoex.g:4813:1: rule__ProbabilityMassFunction__Group_3__3__Impl : ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 )* ) ) ;
    public final void rule__ProbabilityMassFunction__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4817:1: ( ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 )* ) ) )
            // InternalStoex.g:4818:1: ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 )* ) )
            {
            // InternalStoex.g:4818:1: ( ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 )* ) )
            // InternalStoex.g:4819:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 ) ) ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 )* )
            {
            // InternalStoex.g:4819:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 ) )
            // InternalStoex.g:4820:3: ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_3_3()); 
            }
            // InternalStoex.g:4821:3: ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 )
            // InternalStoex.g:4821:4: rule__ProbabilityMassFunction__SamplesAssignment_3_3
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

            // InternalStoex.g:4824:2: ( ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 )* )
            // InternalStoex.g:4825:3: ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getSamplesAssignment_3_3()); 
            }
            // InternalStoex.g:4826:3: ( rule__ProbabilityMassFunction__SamplesAssignment_3_3 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==44) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalStoex.g:4826:4: rule__ProbabilityMassFunction__SamplesAssignment_3_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_31);
            	    rule__ProbabilityMassFunction__SamplesAssignment_3_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalStoex.g:4835:1: rule__ProbabilityMassFunction__Group_3__4 : rule__ProbabilityMassFunction__Group_3__4__Impl ;
    public final void rule__ProbabilityMassFunction__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4839:1: ( rule__ProbabilityMassFunction__Group_3__4__Impl )
            // InternalStoex.g:4840:2: rule__ProbabilityMassFunction__Group_3__4__Impl
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
    // InternalStoex.g:4846:1: rule__ProbabilityMassFunction__Group_3__4__Impl : ( ']' ) ;
    public final void rule__ProbabilityMassFunction__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4850:1: ( ( ']' ) )
            // InternalStoex.g:4851:1: ( ']' )
            {
            // InternalStoex.g:4851:1: ( ']' )
            // InternalStoex.g:4852:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getRightSquareBracketKeyword_3_4()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getRightSquareBracketKeyword_3_4()); 
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
    // InternalStoex.g:4862:1: rule__ProbabilityMassFunction__Group_3_1__0 : rule__ProbabilityMassFunction__Group_3_1__0__Impl rule__ProbabilityMassFunction__Group_3_1__1 ;
    public final void rule__ProbabilityMassFunction__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4866:1: ( rule__ProbabilityMassFunction__Group_3_1__0__Impl rule__ProbabilityMassFunction__Group_3_1__1 )
            // InternalStoex.g:4867:2: rule__ProbabilityMassFunction__Group_3_1__0__Impl rule__ProbabilityMassFunction__Group_3_1__1
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
    // InternalStoex.g:4874:1: rule__ProbabilityMassFunction__Group_3_1__0__Impl : ( '(' ) ;
    public final void rule__ProbabilityMassFunction__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4878:1: ( ( '(' ) )
            // InternalStoex.g:4879:1: ( '(' )
            {
            // InternalStoex.g:4879:1: ( '(' )
            // InternalStoex.g:4880:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getLeftParenthesisKeyword_3_1_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getLeftParenthesisKeyword_3_1_0()); 
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
    // InternalStoex.g:4889:1: rule__ProbabilityMassFunction__Group_3_1__1 : rule__ProbabilityMassFunction__Group_3_1__1__Impl rule__ProbabilityMassFunction__Group_3_1__2 ;
    public final void rule__ProbabilityMassFunction__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4893:1: ( rule__ProbabilityMassFunction__Group_3_1__1__Impl rule__ProbabilityMassFunction__Group_3_1__2 )
            // InternalStoex.g:4894:2: rule__ProbabilityMassFunction__Group_3_1__1__Impl rule__ProbabilityMassFunction__Group_3_1__2
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
    // InternalStoex.g:4901:1: rule__ProbabilityMassFunction__Group_3_1__1__Impl : ( ( rule__ProbabilityMassFunction__OrderedDomainAssignment_3_1_1 ) ) ;
    public final void rule__ProbabilityMassFunction__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4905:1: ( ( ( rule__ProbabilityMassFunction__OrderedDomainAssignment_3_1_1 ) ) )
            // InternalStoex.g:4906:1: ( ( rule__ProbabilityMassFunction__OrderedDomainAssignment_3_1_1 ) )
            {
            // InternalStoex.g:4906:1: ( ( rule__ProbabilityMassFunction__OrderedDomainAssignment_3_1_1 ) )
            // InternalStoex.g:4907:2: ( rule__ProbabilityMassFunction__OrderedDomainAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getOrderedDomainAssignment_3_1_1()); 
            }
            // InternalStoex.g:4908:2: ( rule__ProbabilityMassFunction__OrderedDomainAssignment_3_1_1 )
            // InternalStoex.g:4908:3: rule__ProbabilityMassFunction__OrderedDomainAssignment_3_1_1
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
    // InternalStoex.g:4916:1: rule__ProbabilityMassFunction__Group_3_1__2 : rule__ProbabilityMassFunction__Group_3_1__2__Impl ;
    public final void rule__ProbabilityMassFunction__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4920:1: ( rule__ProbabilityMassFunction__Group_3_1__2__Impl )
            // InternalStoex.g:4921:2: rule__ProbabilityMassFunction__Group_3_1__2__Impl
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
    // InternalStoex.g:4927:1: rule__ProbabilityMassFunction__Group_3_1__2__Impl : ( ')' ) ;
    public final void rule__ProbabilityMassFunction__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4931:1: ( ( ')' ) )
            // InternalStoex.g:4932:1: ( ')' )
            {
            // InternalStoex.g:4932:1: ( ')' )
            // InternalStoex.g:4933:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getRightParenthesisKeyword_3_1_2()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getRightParenthesisKeyword_3_1_2()); 
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
    // InternalStoex.g:4943:1: rule__Numeric_int_sample__Group__0 : rule__Numeric_int_sample__Group__0__Impl rule__Numeric_int_sample__Group__1 ;
    public final void rule__Numeric_int_sample__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4947:1: ( rule__Numeric_int_sample__Group__0__Impl rule__Numeric_int_sample__Group__1 )
            // InternalStoex.g:4948:2: rule__Numeric_int_sample__Group__0__Impl rule__Numeric_int_sample__Group__1
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
    // InternalStoex.g:4955:1: rule__Numeric_int_sample__Group__0__Impl : ( '(' ) ;
    public final void rule__Numeric_int_sample__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4959:1: ( ( '(' ) )
            // InternalStoex.g:4960:1: ( '(' )
            {
            // InternalStoex.g:4960:1: ( '(' )
            // InternalStoex.g:4961:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_int_sampleAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_int_sampleAccess().getLeftParenthesisKeyword_0()); 
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
    // InternalStoex.g:4970:1: rule__Numeric_int_sample__Group__1 : rule__Numeric_int_sample__Group__1__Impl rule__Numeric_int_sample__Group__2 ;
    public final void rule__Numeric_int_sample__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4974:1: ( rule__Numeric_int_sample__Group__1__Impl rule__Numeric_int_sample__Group__2 )
            // InternalStoex.g:4975:2: rule__Numeric_int_sample__Group__1__Impl rule__Numeric_int_sample__Group__2
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
    // InternalStoex.g:4982:1: rule__Numeric_int_sample__Group__1__Impl : ( ( rule__Numeric_int_sample__ValueAssignment_1 ) ) ;
    public final void rule__Numeric_int_sample__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:4986:1: ( ( ( rule__Numeric_int_sample__ValueAssignment_1 ) ) )
            // InternalStoex.g:4987:1: ( ( rule__Numeric_int_sample__ValueAssignment_1 ) )
            {
            // InternalStoex.g:4987:1: ( ( rule__Numeric_int_sample__ValueAssignment_1 ) )
            // InternalStoex.g:4988:2: ( rule__Numeric_int_sample__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_int_sampleAccess().getValueAssignment_1()); 
            }
            // InternalStoex.g:4989:2: ( rule__Numeric_int_sample__ValueAssignment_1 )
            // InternalStoex.g:4989:3: rule__Numeric_int_sample__ValueAssignment_1
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
    // InternalStoex.g:4997:1: rule__Numeric_int_sample__Group__2 : rule__Numeric_int_sample__Group__2__Impl rule__Numeric_int_sample__Group__3 ;
    public final void rule__Numeric_int_sample__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5001:1: ( rule__Numeric_int_sample__Group__2__Impl rule__Numeric_int_sample__Group__3 )
            // InternalStoex.g:5002:2: rule__Numeric_int_sample__Group__2__Impl rule__Numeric_int_sample__Group__3
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
    // InternalStoex.g:5009:1: rule__Numeric_int_sample__Group__2__Impl : ( ';' ) ;
    public final void rule__Numeric_int_sample__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5013:1: ( ( ';' ) )
            // InternalStoex.g:5014:1: ( ';' )
            {
            // InternalStoex.g:5014:1: ( ';' )
            // InternalStoex.g:5015:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_int_sampleAccess().getSemicolonKeyword_2()); 
            }
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_int_sampleAccess().getSemicolonKeyword_2()); 
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
    // InternalStoex.g:5024:1: rule__Numeric_int_sample__Group__3 : rule__Numeric_int_sample__Group__3__Impl rule__Numeric_int_sample__Group__4 ;
    public final void rule__Numeric_int_sample__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5028:1: ( rule__Numeric_int_sample__Group__3__Impl rule__Numeric_int_sample__Group__4 )
            // InternalStoex.g:5029:2: rule__Numeric_int_sample__Group__3__Impl rule__Numeric_int_sample__Group__4
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
    // InternalStoex.g:5036:1: rule__Numeric_int_sample__Group__3__Impl : ( ( rule__Numeric_int_sample__ProbabilityAssignment_3 ) ) ;
    public final void rule__Numeric_int_sample__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5040:1: ( ( ( rule__Numeric_int_sample__ProbabilityAssignment_3 ) ) )
            // InternalStoex.g:5041:1: ( ( rule__Numeric_int_sample__ProbabilityAssignment_3 ) )
            {
            // InternalStoex.g:5041:1: ( ( rule__Numeric_int_sample__ProbabilityAssignment_3 ) )
            // InternalStoex.g:5042:2: ( rule__Numeric_int_sample__ProbabilityAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_int_sampleAccess().getProbabilityAssignment_3()); 
            }
            // InternalStoex.g:5043:2: ( rule__Numeric_int_sample__ProbabilityAssignment_3 )
            // InternalStoex.g:5043:3: rule__Numeric_int_sample__ProbabilityAssignment_3
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
    // InternalStoex.g:5051:1: rule__Numeric_int_sample__Group__4 : rule__Numeric_int_sample__Group__4__Impl ;
    public final void rule__Numeric_int_sample__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5055:1: ( rule__Numeric_int_sample__Group__4__Impl )
            // InternalStoex.g:5056:2: rule__Numeric_int_sample__Group__4__Impl
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
    // InternalStoex.g:5062:1: rule__Numeric_int_sample__Group__4__Impl : ( ')' ) ;
    public final void rule__Numeric_int_sample__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5066:1: ( ( ')' ) )
            // InternalStoex.g:5067:1: ( ')' )
            {
            // InternalStoex.g:5067:1: ( ')' )
            // InternalStoex.g:5068:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_int_sampleAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_int_sampleAccess().getRightParenthesisKeyword_4()); 
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
    // InternalStoex.g:5078:1: rule__Numeric_real_sample__Group__0 : rule__Numeric_real_sample__Group__0__Impl rule__Numeric_real_sample__Group__1 ;
    public final void rule__Numeric_real_sample__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5082:1: ( rule__Numeric_real_sample__Group__0__Impl rule__Numeric_real_sample__Group__1 )
            // InternalStoex.g:5083:2: rule__Numeric_real_sample__Group__0__Impl rule__Numeric_real_sample__Group__1
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
    // InternalStoex.g:5090:1: rule__Numeric_real_sample__Group__0__Impl : ( '(' ) ;
    public final void rule__Numeric_real_sample__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5094:1: ( ( '(' ) )
            // InternalStoex.g:5095:1: ( '(' )
            {
            // InternalStoex.g:5095:1: ( '(' )
            // InternalStoex.g:5096:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_real_sampleAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_real_sampleAccess().getLeftParenthesisKeyword_0()); 
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
    // InternalStoex.g:5105:1: rule__Numeric_real_sample__Group__1 : rule__Numeric_real_sample__Group__1__Impl rule__Numeric_real_sample__Group__2 ;
    public final void rule__Numeric_real_sample__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5109:1: ( rule__Numeric_real_sample__Group__1__Impl rule__Numeric_real_sample__Group__2 )
            // InternalStoex.g:5110:2: rule__Numeric_real_sample__Group__1__Impl rule__Numeric_real_sample__Group__2
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
    // InternalStoex.g:5117:1: rule__Numeric_real_sample__Group__1__Impl : ( ( rule__Numeric_real_sample__ValueAssignment_1 ) ) ;
    public final void rule__Numeric_real_sample__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5121:1: ( ( ( rule__Numeric_real_sample__ValueAssignment_1 ) ) )
            // InternalStoex.g:5122:1: ( ( rule__Numeric_real_sample__ValueAssignment_1 ) )
            {
            // InternalStoex.g:5122:1: ( ( rule__Numeric_real_sample__ValueAssignment_1 ) )
            // InternalStoex.g:5123:2: ( rule__Numeric_real_sample__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_real_sampleAccess().getValueAssignment_1()); 
            }
            // InternalStoex.g:5124:2: ( rule__Numeric_real_sample__ValueAssignment_1 )
            // InternalStoex.g:5124:3: rule__Numeric_real_sample__ValueAssignment_1
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
    // InternalStoex.g:5132:1: rule__Numeric_real_sample__Group__2 : rule__Numeric_real_sample__Group__2__Impl rule__Numeric_real_sample__Group__3 ;
    public final void rule__Numeric_real_sample__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5136:1: ( rule__Numeric_real_sample__Group__2__Impl rule__Numeric_real_sample__Group__3 )
            // InternalStoex.g:5137:2: rule__Numeric_real_sample__Group__2__Impl rule__Numeric_real_sample__Group__3
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
    // InternalStoex.g:5144:1: rule__Numeric_real_sample__Group__2__Impl : ( ';' ) ;
    public final void rule__Numeric_real_sample__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5148:1: ( ( ';' ) )
            // InternalStoex.g:5149:1: ( ';' )
            {
            // InternalStoex.g:5149:1: ( ';' )
            // InternalStoex.g:5150:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_real_sampleAccess().getSemicolonKeyword_2()); 
            }
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_real_sampleAccess().getSemicolonKeyword_2()); 
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
    // InternalStoex.g:5159:1: rule__Numeric_real_sample__Group__3 : rule__Numeric_real_sample__Group__3__Impl rule__Numeric_real_sample__Group__4 ;
    public final void rule__Numeric_real_sample__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5163:1: ( rule__Numeric_real_sample__Group__3__Impl rule__Numeric_real_sample__Group__4 )
            // InternalStoex.g:5164:2: rule__Numeric_real_sample__Group__3__Impl rule__Numeric_real_sample__Group__4
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
    // InternalStoex.g:5171:1: rule__Numeric_real_sample__Group__3__Impl : ( ( rule__Numeric_real_sample__ProbabilityAssignment_3 ) ) ;
    public final void rule__Numeric_real_sample__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5175:1: ( ( ( rule__Numeric_real_sample__ProbabilityAssignment_3 ) ) )
            // InternalStoex.g:5176:1: ( ( rule__Numeric_real_sample__ProbabilityAssignment_3 ) )
            {
            // InternalStoex.g:5176:1: ( ( rule__Numeric_real_sample__ProbabilityAssignment_3 ) )
            // InternalStoex.g:5177:2: ( rule__Numeric_real_sample__ProbabilityAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_real_sampleAccess().getProbabilityAssignment_3()); 
            }
            // InternalStoex.g:5178:2: ( rule__Numeric_real_sample__ProbabilityAssignment_3 )
            // InternalStoex.g:5178:3: rule__Numeric_real_sample__ProbabilityAssignment_3
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
    // InternalStoex.g:5186:1: rule__Numeric_real_sample__Group__4 : rule__Numeric_real_sample__Group__4__Impl ;
    public final void rule__Numeric_real_sample__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5190:1: ( rule__Numeric_real_sample__Group__4__Impl )
            // InternalStoex.g:5191:2: rule__Numeric_real_sample__Group__4__Impl
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
    // InternalStoex.g:5197:1: rule__Numeric_real_sample__Group__4__Impl : ( ')' ) ;
    public final void rule__Numeric_real_sample__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5201:1: ( ( ')' ) )
            // InternalStoex.g:5202:1: ( ')' )
            {
            // InternalStoex.g:5202:1: ( ')' )
            // InternalStoex.g:5203:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeric_real_sampleAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeric_real_sampleAccess().getRightParenthesisKeyword_4()); 
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
    // InternalStoex.g:5213:1: rule__Real_pdf_sample__Group__0 : rule__Real_pdf_sample__Group__0__Impl rule__Real_pdf_sample__Group__1 ;
    public final void rule__Real_pdf_sample__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5217:1: ( rule__Real_pdf_sample__Group__0__Impl rule__Real_pdf_sample__Group__1 )
            // InternalStoex.g:5218:2: rule__Real_pdf_sample__Group__0__Impl rule__Real_pdf_sample__Group__1
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
    // InternalStoex.g:5225:1: rule__Real_pdf_sample__Group__0__Impl : ( '(' ) ;
    public final void rule__Real_pdf_sample__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5229:1: ( ( '(' ) )
            // InternalStoex.g:5230:1: ( '(' )
            {
            // InternalStoex.g:5230:1: ( '(' )
            // InternalStoex.g:5231:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReal_pdf_sampleAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReal_pdf_sampleAccess().getLeftParenthesisKeyword_0()); 
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
    // InternalStoex.g:5240:1: rule__Real_pdf_sample__Group__1 : rule__Real_pdf_sample__Group__1__Impl rule__Real_pdf_sample__Group__2 ;
    public final void rule__Real_pdf_sample__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5244:1: ( rule__Real_pdf_sample__Group__1__Impl rule__Real_pdf_sample__Group__2 )
            // InternalStoex.g:5245:2: rule__Real_pdf_sample__Group__1__Impl rule__Real_pdf_sample__Group__2
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
    // InternalStoex.g:5252:1: rule__Real_pdf_sample__Group__1__Impl : ( ( rule__Real_pdf_sample__ValueAssignment_1 ) ) ;
    public final void rule__Real_pdf_sample__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5256:1: ( ( ( rule__Real_pdf_sample__ValueAssignment_1 ) ) )
            // InternalStoex.g:5257:1: ( ( rule__Real_pdf_sample__ValueAssignment_1 ) )
            {
            // InternalStoex.g:5257:1: ( ( rule__Real_pdf_sample__ValueAssignment_1 ) )
            // InternalStoex.g:5258:2: ( rule__Real_pdf_sample__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReal_pdf_sampleAccess().getValueAssignment_1()); 
            }
            // InternalStoex.g:5259:2: ( rule__Real_pdf_sample__ValueAssignment_1 )
            // InternalStoex.g:5259:3: rule__Real_pdf_sample__ValueAssignment_1
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
    // InternalStoex.g:5267:1: rule__Real_pdf_sample__Group__2 : rule__Real_pdf_sample__Group__2__Impl rule__Real_pdf_sample__Group__3 ;
    public final void rule__Real_pdf_sample__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5271:1: ( rule__Real_pdf_sample__Group__2__Impl rule__Real_pdf_sample__Group__3 )
            // InternalStoex.g:5272:2: rule__Real_pdf_sample__Group__2__Impl rule__Real_pdf_sample__Group__3
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
    // InternalStoex.g:5279:1: rule__Real_pdf_sample__Group__2__Impl : ( ';' ) ;
    public final void rule__Real_pdf_sample__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5283:1: ( ( ';' ) )
            // InternalStoex.g:5284:1: ( ';' )
            {
            // InternalStoex.g:5284:1: ( ';' )
            // InternalStoex.g:5285:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReal_pdf_sampleAccess().getSemicolonKeyword_2()); 
            }
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReal_pdf_sampleAccess().getSemicolonKeyword_2()); 
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
    // InternalStoex.g:5294:1: rule__Real_pdf_sample__Group__3 : rule__Real_pdf_sample__Group__3__Impl rule__Real_pdf_sample__Group__4 ;
    public final void rule__Real_pdf_sample__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5298:1: ( rule__Real_pdf_sample__Group__3__Impl rule__Real_pdf_sample__Group__4 )
            // InternalStoex.g:5299:2: rule__Real_pdf_sample__Group__3__Impl rule__Real_pdf_sample__Group__4
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
    // InternalStoex.g:5306:1: rule__Real_pdf_sample__Group__3__Impl : ( ( rule__Real_pdf_sample__ProbabilityAssignment_3 ) ) ;
    public final void rule__Real_pdf_sample__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5310:1: ( ( ( rule__Real_pdf_sample__ProbabilityAssignment_3 ) ) )
            // InternalStoex.g:5311:1: ( ( rule__Real_pdf_sample__ProbabilityAssignment_3 ) )
            {
            // InternalStoex.g:5311:1: ( ( rule__Real_pdf_sample__ProbabilityAssignment_3 ) )
            // InternalStoex.g:5312:2: ( rule__Real_pdf_sample__ProbabilityAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReal_pdf_sampleAccess().getProbabilityAssignment_3()); 
            }
            // InternalStoex.g:5313:2: ( rule__Real_pdf_sample__ProbabilityAssignment_3 )
            // InternalStoex.g:5313:3: rule__Real_pdf_sample__ProbabilityAssignment_3
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
    // InternalStoex.g:5321:1: rule__Real_pdf_sample__Group__4 : rule__Real_pdf_sample__Group__4__Impl ;
    public final void rule__Real_pdf_sample__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5325:1: ( rule__Real_pdf_sample__Group__4__Impl )
            // InternalStoex.g:5326:2: rule__Real_pdf_sample__Group__4__Impl
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
    // InternalStoex.g:5332:1: rule__Real_pdf_sample__Group__4__Impl : ( ')' ) ;
    public final void rule__Real_pdf_sample__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5336:1: ( ( ')' ) )
            // InternalStoex.g:5337:1: ( ')' )
            {
            // InternalStoex.g:5337:1: ( ')' )
            // InternalStoex.g:5338:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReal_pdf_sampleAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReal_pdf_sampleAccess().getRightParenthesisKeyword_4()); 
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
    // InternalStoex.g:5348:1: rule__Stringsample__Group__0 : rule__Stringsample__Group__0__Impl rule__Stringsample__Group__1 ;
    public final void rule__Stringsample__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5352:1: ( rule__Stringsample__Group__0__Impl rule__Stringsample__Group__1 )
            // InternalStoex.g:5353:2: rule__Stringsample__Group__0__Impl rule__Stringsample__Group__1
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
    // InternalStoex.g:5360:1: rule__Stringsample__Group__0__Impl : ( '(' ) ;
    public final void rule__Stringsample__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5364:1: ( ( '(' ) )
            // InternalStoex.g:5365:1: ( '(' )
            {
            // InternalStoex.g:5365:1: ( '(' )
            // InternalStoex.g:5366:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringsampleAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringsampleAccess().getLeftParenthesisKeyword_0()); 
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
    // InternalStoex.g:5375:1: rule__Stringsample__Group__1 : rule__Stringsample__Group__1__Impl rule__Stringsample__Group__2 ;
    public final void rule__Stringsample__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5379:1: ( rule__Stringsample__Group__1__Impl rule__Stringsample__Group__2 )
            // InternalStoex.g:5380:2: rule__Stringsample__Group__1__Impl rule__Stringsample__Group__2
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
    // InternalStoex.g:5387:1: rule__Stringsample__Group__1__Impl : ( ( rule__Stringsample__ValueAssignment_1 ) ) ;
    public final void rule__Stringsample__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5391:1: ( ( ( rule__Stringsample__ValueAssignment_1 ) ) )
            // InternalStoex.g:5392:1: ( ( rule__Stringsample__ValueAssignment_1 ) )
            {
            // InternalStoex.g:5392:1: ( ( rule__Stringsample__ValueAssignment_1 ) )
            // InternalStoex.g:5393:2: ( rule__Stringsample__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringsampleAccess().getValueAssignment_1()); 
            }
            // InternalStoex.g:5394:2: ( rule__Stringsample__ValueAssignment_1 )
            // InternalStoex.g:5394:3: rule__Stringsample__ValueAssignment_1
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
    // InternalStoex.g:5402:1: rule__Stringsample__Group__2 : rule__Stringsample__Group__2__Impl rule__Stringsample__Group__3 ;
    public final void rule__Stringsample__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5406:1: ( rule__Stringsample__Group__2__Impl rule__Stringsample__Group__3 )
            // InternalStoex.g:5407:2: rule__Stringsample__Group__2__Impl rule__Stringsample__Group__3
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
    // InternalStoex.g:5414:1: rule__Stringsample__Group__2__Impl : ( ';' ) ;
    public final void rule__Stringsample__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5418:1: ( ( ';' ) )
            // InternalStoex.g:5419:1: ( ';' )
            {
            // InternalStoex.g:5419:1: ( ';' )
            // InternalStoex.g:5420:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringsampleAccess().getSemicolonKeyword_2()); 
            }
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringsampleAccess().getSemicolonKeyword_2()); 
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
    // InternalStoex.g:5429:1: rule__Stringsample__Group__3 : rule__Stringsample__Group__3__Impl rule__Stringsample__Group__4 ;
    public final void rule__Stringsample__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5433:1: ( rule__Stringsample__Group__3__Impl rule__Stringsample__Group__4 )
            // InternalStoex.g:5434:2: rule__Stringsample__Group__3__Impl rule__Stringsample__Group__4
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
    // InternalStoex.g:5441:1: rule__Stringsample__Group__3__Impl : ( ( rule__Stringsample__ProbabilityAssignment_3 ) ) ;
    public final void rule__Stringsample__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5445:1: ( ( ( rule__Stringsample__ProbabilityAssignment_3 ) ) )
            // InternalStoex.g:5446:1: ( ( rule__Stringsample__ProbabilityAssignment_3 ) )
            {
            // InternalStoex.g:5446:1: ( ( rule__Stringsample__ProbabilityAssignment_3 ) )
            // InternalStoex.g:5447:2: ( rule__Stringsample__ProbabilityAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringsampleAccess().getProbabilityAssignment_3()); 
            }
            // InternalStoex.g:5448:2: ( rule__Stringsample__ProbabilityAssignment_3 )
            // InternalStoex.g:5448:3: rule__Stringsample__ProbabilityAssignment_3
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
    // InternalStoex.g:5456:1: rule__Stringsample__Group__4 : rule__Stringsample__Group__4__Impl ;
    public final void rule__Stringsample__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5460:1: ( rule__Stringsample__Group__4__Impl )
            // InternalStoex.g:5461:2: rule__Stringsample__Group__4__Impl
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
    // InternalStoex.g:5467:1: rule__Stringsample__Group__4__Impl : ( ')' ) ;
    public final void rule__Stringsample__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5471:1: ( ( ')' ) )
            // InternalStoex.g:5472:1: ( ')' )
            {
            // InternalStoex.g:5472:1: ( ')' )
            // InternalStoex.g:5473:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringsampleAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringsampleAccess().getRightParenthesisKeyword_4()); 
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
    // InternalStoex.g:5483:1: rule__Boolsample__Group__0 : rule__Boolsample__Group__0__Impl rule__Boolsample__Group__1 ;
    public final void rule__Boolsample__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5487:1: ( rule__Boolsample__Group__0__Impl rule__Boolsample__Group__1 )
            // InternalStoex.g:5488:2: rule__Boolsample__Group__0__Impl rule__Boolsample__Group__1
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
    // InternalStoex.g:5495:1: rule__Boolsample__Group__0__Impl : ( '(' ) ;
    public final void rule__Boolsample__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5499:1: ( ( '(' ) )
            // InternalStoex.g:5500:1: ( '(' )
            {
            // InternalStoex.g:5500:1: ( '(' )
            // InternalStoex.g:5501:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolsampleAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolsampleAccess().getLeftParenthesisKeyword_0()); 
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
    // InternalStoex.g:5510:1: rule__Boolsample__Group__1 : rule__Boolsample__Group__1__Impl rule__Boolsample__Group__2 ;
    public final void rule__Boolsample__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5514:1: ( rule__Boolsample__Group__1__Impl rule__Boolsample__Group__2 )
            // InternalStoex.g:5515:2: rule__Boolsample__Group__1__Impl rule__Boolsample__Group__2
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
    // InternalStoex.g:5522:1: rule__Boolsample__Group__1__Impl : ( ( rule__Boolsample__ValueAssignment_1 ) ) ;
    public final void rule__Boolsample__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5526:1: ( ( ( rule__Boolsample__ValueAssignment_1 ) ) )
            // InternalStoex.g:5527:1: ( ( rule__Boolsample__ValueAssignment_1 ) )
            {
            // InternalStoex.g:5527:1: ( ( rule__Boolsample__ValueAssignment_1 ) )
            // InternalStoex.g:5528:2: ( rule__Boolsample__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolsampleAccess().getValueAssignment_1()); 
            }
            // InternalStoex.g:5529:2: ( rule__Boolsample__ValueAssignment_1 )
            // InternalStoex.g:5529:3: rule__Boolsample__ValueAssignment_1
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
    // InternalStoex.g:5537:1: rule__Boolsample__Group__2 : rule__Boolsample__Group__2__Impl rule__Boolsample__Group__3 ;
    public final void rule__Boolsample__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5541:1: ( rule__Boolsample__Group__2__Impl rule__Boolsample__Group__3 )
            // InternalStoex.g:5542:2: rule__Boolsample__Group__2__Impl rule__Boolsample__Group__3
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
    // InternalStoex.g:5549:1: rule__Boolsample__Group__2__Impl : ( ';' ) ;
    public final void rule__Boolsample__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5553:1: ( ( ';' ) )
            // InternalStoex.g:5554:1: ( ';' )
            {
            // InternalStoex.g:5554:1: ( ';' )
            // InternalStoex.g:5555:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolsampleAccess().getSemicolonKeyword_2()); 
            }
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolsampleAccess().getSemicolonKeyword_2()); 
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
    // InternalStoex.g:5564:1: rule__Boolsample__Group__3 : rule__Boolsample__Group__3__Impl rule__Boolsample__Group__4 ;
    public final void rule__Boolsample__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5568:1: ( rule__Boolsample__Group__3__Impl rule__Boolsample__Group__4 )
            // InternalStoex.g:5569:2: rule__Boolsample__Group__3__Impl rule__Boolsample__Group__4
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
    // InternalStoex.g:5576:1: rule__Boolsample__Group__3__Impl : ( ( rule__Boolsample__ProbabilityAssignment_3 ) ) ;
    public final void rule__Boolsample__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5580:1: ( ( ( rule__Boolsample__ProbabilityAssignment_3 ) ) )
            // InternalStoex.g:5581:1: ( ( rule__Boolsample__ProbabilityAssignment_3 ) )
            {
            // InternalStoex.g:5581:1: ( ( rule__Boolsample__ProbabilityAssignment_3 ) )
            // InternalStoex.g:5582:2: ( rule__Boolsample__ProbabilityAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolsampleAccess().getProbabilityAssignment_3()); 
            }
            // InternalStoex.g:5583:2: ( rule__Boolsample__ProbabilityAssignment_3 )
            // InternalStoex.g:5583:3: rule__Boolsample__ProbabilityAssignment_3
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
    // InternalStoex.g:5591:1: rule__Boolsample__Group__4 : rule__Boolsample__Group__4__Impl ;
    public final void rule__Boolsample__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5595:1: ( rule__Boolsample__Group__4__Impl )
            // InternalStoex.g:5596:2: rule__Boolsample__Group__4__Impl
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
    // InternalStoex.g:5602:1: rule__Boolsample__Group__4__Impl : ( ')' ) ;
    public final void rule__Boolsample__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5606:1: ( ( ')' ) )
            // InternalStoex.g:5607:1: ( ')' )
            {
            // InternalStoex.g:5607:1: ( ')' )
            // InternalStoex.g:5608:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolsampleAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolsampleAccess().getRightParenthesisKeyword_4()); 
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
    // InternalStoex.g:5618:1: rule__SIGNED_NUMBER__Group__0 : rule__SIGNED_NUMBER__Group__0__Impl rule__SIGNED_NUMBER__Group__1 ;
    public final void rule__SIGNED_NUMBER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5622:1: ( rule__SIGNED_NUMBER__Group__0__Impl rule__SIGNED_NUMBER__Group__1 )
            // InternalStoex.g:5623:2: rule__SIGNED_NUMBER__Group__0__Impl rule__SIGNED_NUMBER__Group__1
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
    // InternalStoex.g:5630:1: rule__SIGNED_NUMBER__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SIGNED_NUMBER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5634:1: ( ( ( '-' )? ) )
            // InternalStoex.g:5635:1: ( ( '-' )? )
            {
            // InternalStoex.g:5635:1: ( ( '-' )? )
            // InternalStoex.g:5636:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSIGNED_NUMBERAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalStoex.g:5637:2: ( '-' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==29) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalStoex.g:5637:3: '-'
                    {
                    match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalStoex.g:5645:1: rule__SIGNED_NUMBER__Group__1 : rule__SIGNED_NUMBER__Group__1__Impl ;
    public final void rule__SIGNED_NUMBER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5649:1: ( rule__SIGNED_NUMBER__Group__1__Impl )
            // InternalStoex.g:5650:2: rule__SIGNED_NUMBER__Group__1__Impl
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
    // InternalStoex.g:5656:1: rule__SIGNED_NUMBER__Group__1__Impl : ( RULE_DOUBLE ) ;
    public final void rule__SIGNED_NUMBER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5660:1: ( ( RULE_DOUBLE ) )
            // InternalStoex.g:5661:1: ( RULE_DOUBLE )
            {
            // InternalStoex.g:5661:1: ( RULE_DOUBLE )
            // InternalStoex.g:5662:2: RULE_DOUBLE
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
    // InternalStoex.g:5672:1: rule__SIGNED_INT__Group__0 : rule__SIGNED_INT__Group__0__Impl rule__SIGNED_INT__Group__1 ;
    public final void rule__SIGNED_INT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5676:1: ( rule__SIGNED_INT__Group__0__Impl rule__SIGNED_INT__Group__1 )
            // InternalStoex.g:5677:2: rule__SIGNED_INT__Group__0__Impl rule__SIGNED_INT__Group__1
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
    // InternalStoex.g:5684:1: rule__SIGNED_INT__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SIGNED_INT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5688:1: ( ( ( '-' )? ) )
            // InternalStoex.g:5689:1: ( ( '-' )? )
            {
            // InternalStoex.g:5689:1: ( ( '-' )? )
            // InternalStoex.g:5690:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSIGNED_INTAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalStoex.g:5691:2: ( '-' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==29) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalStoex.g:5691:3: '-'
                    {
                    match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalStoex.g:5699:1: rule__SIGNED_INT__Group__1 : rule__SIGNED_INT__Group__1__Impl ;
    public final void rule__SIGNED_INT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5703:1: ( rule__SIGNED_INT__Group__1__Impl )
            // InternalStoex.g:5704:2: rule__SIGNED_INT__Group__1__Impl
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
    // InternalStoex.g:5710:1: rule__SIGNED_INT__Group__1__Impl : ( RULE_DECINT ) ;
    public final void rule__SIGNED_INT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5714:1: ( ( RULE_DECINT ) )
            // InternalStoex.g:5715:1: ( RULE_DECINT )
            {
            // InternalStoex.g:5715:1: ( RULE_DECINT )
            // InternalStoex.g:5716:2: RULE_DECINT
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
    // InternalStoex.g:5726:1: rule__IfelseExpr__IfExpressionAssignment_1_2 : ( ruleboolAndExpr ) ;
    public final void rule__IfelseExpr__IfExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5730:1: ( ( ruleboolAndExpr ) )
            // InternalStoex.g:5731:2: ( ruleboolAndExpr )
            {
            // InternalStoex.g:5731:2: ( ruleboolAndExpr )
            // InternalStoex.g:5732:3: ruleboolAndExpr
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
    // InternalStoex.g:5741:1: rule__IfelseExpr__ElseExpressionAssignment_1_4 : ( ruleboolAndExpr ) ;
    public final void rule__IfelseExpr__ElseExpressionAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5745:1: ( ( ruleboolAndExpr ) )
            // InternalStoex.g:5746:2: ( ruleboolAndExpr )
            {
            // InternalStoex.g:5746:2: ( ruleboolAndExpr )
            // InternalStoex.g:5747:3: ruleboolAndExpr
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
    // InternalStoex.g:5756:1: rule__BoolAndExpr__OperationAssignment_1_1 : ( ruleandoperation ) ;
    public final void rule__BoolAndExpr__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5760:1: ( ( ruleandoperation ) )
            // InternalStoex.g:5761:2: ( ruleandoperation )
            {
            // InternalStoex.g:5761:2: ( ruleandoperation )
            // InternalStoex.g:5762:3: ruleandoperation
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
    // InternalStoex.g:5771:1: rule__BoolAndExpr__RightAssignment_1_2 : ( ruleboolOrExpr ) ;
    public final void rule__BoolAndExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5775:1: ( ( ruleboolOrExpr ) )
            // InternalStoex.g:5776:2: ( ruleboolOrExpr )
            {
            // InternalStoex.g:5776:2: ( ruleboolOrExpr )
            // InternalStoex.g:5777:3: ruleboolOrExpr
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
    // InternalStoex.g:5786:1: rule__BoolOrExpr__OperationAssignment_1_1 : ( ruleoroperations ) ;
    public final void rule__BoolOrExpr__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5790:1: ( ( ruleoroperations ) )
            // InternalStoex.g:5791:2: ( ruleoroperations )
            {
            // InternalStoex.g:5791:2: ( ruleoroperations )
            // InternalStoex.g:5792:3: ruleoroperations
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
    // InternalStoex.g:5801:1: rule__BoolOrExpr__RightAssignment_1_2 : ( rulecompareExpr ) ;
    public final void rule__BoolOrExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5805:1: ( ( rulecompareExpr ) )
            // InternalStoex.g:5806:2: ( rulecompareExpr )
            {
            // InternalStoex.g:5806:2: ( rulecompareExpr )
            // InternalStoex.g:5807:3: rulecompareExpr
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
    // InternalStoex.g:5816:1: rule__CompareExpr__OperationAssignment_1_1 : ( ruleCompareOperations ) ;
    public final void rule__CompareExpr__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5820:1: ( ( ruleCompareOperations ) )
            // InternalStoex.g:5821:2: ( ruleCompareOperations )
            {
            // InternalStoex.g:5821:2: ( ruleCompareOperations )
            // InternalStoex.g:5822:3: ruleCompareOperations
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
    // InternalStoex.g:5831:1: rule__CompareExpr__RightAssignment_1_2 : ( rulesumExpr ) ;
    public final void rule__CompareExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5835:1: ( ( rulesumExpr ) )
            // InternalStoex.g:5836:2: ( rulesumExpr )
            {
            // InternalStoex.g:5836:2: ( rulesumExpr )
            // InternalStoex.g:5837:3: rulesumExpr
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
    // InternalStoex.g:5846:1: rule__SumExpr__OperationAssignment_1_1 : ( ruleTermOperations ) ;
    public final void rule__SumExpr__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5850:1: ( ( ruleTermOperations ) )
            // InternalStoex.g:5851:2: ( ruleTermOperations )
            {
            // InternalStoex.g:5851:2: ( ruleTermOperations )
            // InternalStoex.g:5852:3: ruleTermOperations
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
    // InternalStoex.g:5861:1: rule__SumExpr__RightAssignment_1_2 : ( ruleprodExpr ) ;
    public final void rule__SumExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5865:1: ( ( ruleprodExpr ) )
            // InternalStoex.g:5866:2: ( ruleprodExpr )
            {
            // InternalStoex.g:5866:2: ( ruleprodExpr )
            // InternalStoex.g:5867:3: ruleprodExpr
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
    // InternalStoex.g:5876:1: rule__ProdExpr__OperationAssignment_1_1 : ( ruleProductOperations ) ;
    public final void rule__ProdExpr__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5880:1: ( ( ruleProductOperations ) )
            // InternalStoex.g:5881:2: ( ruleProductOperations )
            {
            // InternalStoex.g:5881:2: ( ruleProductOperations )
            // InternalStoex.g:5882:3: ruleProductOperations
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
    // InternalStoex.g:5891:1: rule__ProdExpr__RightAssignment_1_2 : ( rulepowExpr ) ;
    public final void rule__ProdExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5895:1: ( ( rulepowExpr ) )
            // InternalStoex.g:5896:2: ( rulepowExpr )
            {
            // InternalStoex.g:5896:2: ( rulepowExpr )
            // InternalStoex.g:5897:3: rulepowExpr
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
    // InternalStoex.g:5906:1: rule__PowExpr__ExponentAssignment_1_2 : ( ruleunaryExpr ) ;
    public final void rule__PowExpr__ExponentAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5910:1: ( ( ruleunaryExpr ) )
            // InternalStoex.g:5911:2: ( ruleunaryExpr )
            {
            // InternalStoex.g:5911:2: ( ruleunaryExpr )
            // InternalStoex.g:5912:3: ruleunaryExpr
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
    // InternalStoex.g:5921:1: rule__NotExpression__InnerAssignment_1 : ( ruleunaryExpr ) ;
    public final void rule__NotExpression__InnerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5925:1: ( ( ruleunaryExpr ) )
            // InternalStoex.g:5926:2: ( ruleunaryExpr )
            {
            // InternalStoex.g:5926:2: ( ruleunaryExpr )
            // InternalStoex.g:5927:3: ruleunaryExpr
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
    // InternalStoex.g:5936:1: rule__NegativeExpression__InnerAssignment_1 : ( ruleunaryExpr ) ;
    public final void rule__NegativeExpression__InnerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5940:1: ( ( ruleunaryExpr ) )
            // InternalStoex.g:5941:2: ( ruleunaryExpr )
            {
            // InternalStoex.g:5941:2: ( ruleunaryExpr )
            // InternalStoex.g:5942:3: ruleunaryExpr
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
    // InternalStoex.g:5951:1: rule__DoubleLiteral__ValueAssignment_0 : ( RULE_DOUBLE ) ;
    public final void rule__DoubleLiteral__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5955:1: ( ( RULE_DOUBLE ) )
            // InternalStoex.g:5956:2: ( RULE_DOUBLE )
            {
            // InternalStoex.g:5956:2: ( RULE_DOUBLE )
            // InternalStoex.g:5957:3: RULE_DOUBLE
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
    // InternalStoex.g:5966:1: rule__DoubleLiteral__UnitAssignment_1_1 : ( ruleUnit ) ;
    public final void rule__DoubleLiteral__UnitAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5970:1: ( ( ruleUnit ) )
            // InternalStoex.g:5971:2: ( ruleUnit )
            {
            // InternalStoex.g:5971:2: ( ruleUnit )
            // InternalStoex.g:5972:3: ruleUnit
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
    // InternalStoex.g:5981:1: rule__ProbabilityFunctionLiteral__Function_ProbabilityFunctionLiteralAssignment : ( ruledefinition ) ;
    public final void rule__ProbabilityFunctionLiteral__Function_ProbabilityFunctionLiteralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:5985:1: ( ( ruledefinition ) )
            // InternalStoex.g:5986:2: ( ruledefinition )
            {
            // InternalStoex.g:5986:2: ( ruledefinition )
            // InternalStoex.g:5987:3: ruledefinition
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
    // InternalStoex.g:5996:1: rule__Parenthesis__InnerExpressionAssignment_1 : ( ruleifelseExpr ) ;
    public final void rule__Parenthesis__InnerExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6000:1: ( ( ruleifelseExpr ) )
            // InternalStoex.g:6001:2: ( ruleifelseExpr )
            {
            // InternalStoex.g:6001:2: ( ruleifelseExpr )
            // InternalStoex.g:6002:3: ruleifelseExpr
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
    // InternalStoex.g:6011:1: rule__FunctionLiteral__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionLiteral__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6015:1: ( ( RULE_ID ) )
            // InternalStoex.g:6016:2: ( RULE_ID )
            {
            // InternalStoex.g:6016:2: ( RULE_ID )
            // InternalStoex.g:6017:3: RULE_ID
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
    // InternalStoex.g:6026:1: rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_0 : ( ruleboolAndExpr ) ;
    public final void rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6030:1: ( ( ruleboolAndExpr ) )
            // InternalStoex.g:6031:2: ( ruleboolAndExpr )
            {
            // InternalStoex.g:6031:2: ( ruleboolAndExpr )
            // InternalStoex.g:6032:3: ruleboolAndExpr
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
    // InternalStoex.g:6041:1: rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_1_1 : ( ruleboolAndExpr ) ;
    public final void rule__FunctionLiteral__Parameters_FunctionLiteralAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6045:1: ( ( ruleboolAndExpr ) )
            // InternalStoex.g:6046:2: ( ruleboolAndExpr )
            {
            // InternalStoex.g:6046:2: ( ruleboolAndExpr )
            // InternalStoex.g:6047:3: ruleboolAndExpr
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
    // InternalStoex.g:6056:1: rule__Variable__Id_VariableAssignment : ( ruleAbstractNamedReference ) ;
    public final void rule__Variable__Id_VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6060:1: ( ( ruleAbstractNamedReference ) )
            // InternalStoex.g:6061:2: ( ruleAbstractNamedReference )
            {
            // InternalStoex.g:6061:2: ( ruleAbstractNamedReference )
            // InternalStoex.g:6062:3: ruleAbstractNamedReference
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
    // InternalStoex.g:6071:1: rule__VariableReference__ReferenceNameAssignment : ( ( rule__VariableReference__ReferenceNameAlternatives_0 ) ) ;
    public final void rule__VariableReference__ReferenceNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6075:1: ( ( ( rule__VariableReference__ReferenceNameAlternatives_0 ) ) )
            // InternalStoex.g:6076:2: ( ( rule__VariableReference__ReferenceNameAlternatives_0 ) )
            {
            // InternalStoex.g:6076:2: ( ( rule__VariableReference__ReferenceNameAlternatives_0 ) )
            // InternalStoex.g:6077:3: ( rule__VariableReference__ReferenceNameAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getReferenceNameAlternatives_0()); 
            }
            // InternalStoex.g:6078:3: ( rule__VariableReference__ReferenceNameAlternatives_0 )
            // InternalStoex.g:6078:4: rule__VariableReference__ReferenceNameAlternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableReference__ReferenceNameAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getReferenceNameAlternatives_0()); 
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
    // InternalStoex.g:6086:1: rule__NamespaceReference__ReferenceNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NamespaceReference__ReferenceNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6090:1: ( ( RULE_ID ) )
            // InternalStoex.g:6091:2: ( RULE_ID )
            {
            // InternalStoex.g:6091:2: ( RULE_ID )
            // InternalStoex.g:6092:3: RULE_ID
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


    // $ANTLR start "rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_0"
    // InternalStoex.g:6101:1: rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_0 : ( ruleAbstractNamedReference ) ;
    public final void rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6105:1: ( ( ruleAbstractNamedReference ) )
            // InternalStoex.g:6106:2: ( ruleAbstractNamedReference )
            {
            // InternalStoex.g:6106:2: ( ruleAbstractNamedReference )
            // InternalStoex.g:6107:3: ruleAbstractNamedReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceReferenceAccess().getInnerReference_NamespaceReferenceAbstractNamedReferenceParserRuleCall_2_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAbstractNamedReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceReferenceAccess().getInnerReference_NamespaceReferenceAbstractNamedReferenceParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_0"


    // $ANTLR start "rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_1"
    // InternalStoex.g:6116:1: rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_1 : ( ruleVariableReference ) ;
    public final void rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6120:1: ( ( ruleVariableReference ) )
            // InternalStoex.g:6121:2: ( ruleVariableReference )
            {
            // InternalStoex.g:6121:2: ( ruleVariableReference )
            // InternalStoex.g:6122:3: ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceReferenceAccess().getInnerReference_NamespaceReferenceVariableReferenceParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVariableReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceReferenceAccess().getInnerReference_NamespaceReferenceVariableReferenceParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__NamespaceReference__InnerReference_NamespaceReferenceAssignment_2_1"


    // $ANTLR start "rule__BoolLiteral__ValueAssignment"
    // InternalStoex.g:6131:1: rule__BoolLiteral__ValueAssignment : ( RULE_BOOLEAN_KEYWORDS ) ;
    public final void rule__BoolLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6135:1: ( ( RULE_BOOLEAN_KEYWORDS ) )
            // InternalStoex.g:6136:2: ( RULE_BOOLEAN_KEYWORDS )
            {
            // InternalStoex.g:6136:2: ( RULE_BOOLEAN_KEYWORDS )
            // InternalStoex.g:6137:3: RULE_BOOLEAN_KEYWORDS
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
    // InternalStoex.g:6146:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6150:1: ( ( RULE_STRING ) )
            // InternalStoex.g:6151:2: ( RULE_STRING )
            {
            // InternalStoex.g:6151:2: ( RULE_STRING )
            // InternalStoex.g:6152:3: RULE_STRING
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
    // InternalStoex.g:6161:1: rule__IntLiteral__ValueAssignment_0 : ( RULE_DECINT ) ;
    public final void rule__IntLiteral__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6165:1: ( ( RULE_DECINT ) )
            // InternalStoex.g:6166:2: ( RULE_DECINT )
            {
            // InternalStoex.g:6166:2: ( RULE_DECINT )
            // InternalStoex.g:6167:3: RULE_DECINT
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
    // InternalStoex.g:6176:1: rule__IntLiteral__UnitAssignment_1_1 : ( ruleUnit ) ;
    public final void rule__IntLiteral__UnitAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6180:1: ( ( ruleUnit ) )
            // InternalStoex.g:6181:2: ( ruleUnit )
            {
            // InternalStoex.g:6181:2: ( ruleUnit )
            // InternalStoex.g:6182:3: ruleUnit
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
    // InternalStoex.g:6191:1: rule__UnitDiv__DivisorAssignment_1_2 : ( ruleUnit ) ;
    public final void rule__UnitDiv__DivisorAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6195:1: ( ( ruleUnit ) )
            // InternalStoex.g:6196:2: ( ruleUnit )
            {
            // InternalStoex.g:6196:2: ( ruleUnit )
            // InternalStoex.g:6197:3: ruleUnit
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
    // InternalStoex.g:6206:1: rule__UnitMulti__UnitsAssignment_1_2 : ( ruleUnit ) ;
    public final void rule__UnitMulti__UnitsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6210:1: ( ( ruleUnit ) )
            // InternalStoex.g:6211:2: ( ruleUnit )
            {
            // InternalStoex.g:6211:2: ( ruleUnit )
            // InternalStoex.g:6212:3: ruleUnit
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
    // InternalStoex.g:6221:1: rule__UnitPow__ExponentAssignment_1_2 : ( ruleSIGNED_INT ) ;
    public final void rule__UnitPow__ExponentAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6225:1: ( ( ruleSIGNED_INT ) )
            // InternalStoex.g:6226:2: ( ruleSIGNED_INT )
            {
            // InternalStoex.g:6226:2: ( ruleSIGNED_INT )
            // InternalStoex.g:6227:3: ruleSIGNED_INT
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
    // InternalStoex.g:6236:1: rule__BaseUnit__NameAssignment : ( ruleUnitNames ) ;
    public final void rule__BaseUnit__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6240:1: ( ( ruleUnitNames ) )
            // InternalStoex.g:6241:2: ( ruleUnitNames )
            {
            // InternalStoex.g:6241:2: ( ruleUnitNames )
            // InternalStoex.g:6242:3: ruleUnitNames
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
    // InternalStoex.g:6251:1: rule__BoxedPDF__SamplesAssignment_2 : ( rulereal_pdf_sample ) ;
    public final void rule__BoxedPDF__SamplesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6255:1: ( ( rulereal_pdf_sample ) )
            // InternalStoex.g:6256:2: ( rulereal_pdf_sample )
            {
            // InternalStoex.g:6256:2: ( rulereal_pdf_sample )
            // InternalStoex.g:6257:3: rulereal_pdf_sample
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
    // InternalStoex.g:6266:1: rule__BoxedPDF__UnitAssignment_4_1 : ( ruleUnit ) ;
    public final void rule__BoxedPDF__UnitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6270:1: ( ( ruleUnit ) )
            // InternalStoex.g:6271:2: ( ruleUnit )
            {
            // InternalStoex.g:6271:2: ( ruleUnit )
            // InternalStoex.g:6272:3: ruleUnit
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
    // InternalStoex.g:6281:1: rule__ProbabilityMassFunction__SamplesAssignment_0_2 : ( rulenumeric_int_sample ) ;
    public final void rule__ProbabilityMassFunction__SamplesAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6285:1: ( ( rulenumeric_int_sample ) )
            // InternalStoex.g:6286:2: ( rulenumeric_int_sample )
            {
            // InternalStoex.g:6286:2: ( rulenumeric_int_sample )
            // InternalStoex.g:6287:3: rulenumeric_int_sample
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
    // InternalStoex.g:6296:1: rule__ProbabilityMassFunction__UnitAssignment_0_4_1 : ( ruleUnit ) ;
    public final void rule__ProbabilityMassFunction__UnitAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6300:1: ( ( ruleUnit ) )
            // InternalStoex.g:6301:2: ( ruleUnit )
            {
            // InternalStoex.g:6301:2: ( ruleUnit )
            // InternalStoex.g:6302:3: ruleUnit
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
    // InternalStoex.g:6311:1: rule__ProbabilityMassFunction__SamplesAssignment_1_2 : ( rulenumeric_real_sample ) ;
    public final void rule__ProbabilityMassFunction__SamplesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6315:1: ( ( rulenumeric_real_sample ) )
            // InternalStoex.g:6316:2: ( rulenumeric_real_sample )
            {
            // InternalStoex.g:6316:2: ( rulenumeric_real_sample )
            // InternalStoex.g:6317:3: rulenumeric_real_sample
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
    // InternalStoex.g:6326:1: rule__ProbabilityMassFunction__UnitAssignment_1_4_1 : ( ruleUnit ) ;
    public final void rule__ProbabilityMassFunction__UnitAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6330:1: ( ( ruleUnit ) )
            // InternalStoex.g:6331:2: ( ruleUnit )
            {
            // InternalStoex.g:6331:2: ( ruleUnit )
            // InternalStoex.g:6332:3: ruleUnit
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
    // InternalStoex.g:6341:1: rule__ProbabilityMassFunction__OrderedDomainAssignment_2_1_1 : ( ( 'ordered' ) ) ;
    public final void rule__ProbabilityMassFunction__OrderedDomainAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6345:1: ( ( ( 'ordered' ) ) )
            // InternalStoex.g:6346:2: ( ( 'ordered' ) )
            {
            // InternalStoex.g:6346:2: ( ( 'ordered' ) )
            // InternalStoex.g:6347:3: ( 'ordered' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getOrderedDomainOrderedKeyword_2_1_1_0()); 
            }
            // InternalStoex.g:6348:3: ( 'ordered' )
            // InternalStoex.g:6349:4: 'ordered'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getOrderedDomainOrderedKeyword_2_1_1_0()); 
            }
            match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getOrderedDomainOrderedKeyword_2_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getOrderedDomainOrderedKeyword_2_1_1_0()); 
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
    // InternalStoex.g:6360:1: rule__ProbabilityMassFunction__SamplesAssignment_2_3 : ( rulestringsample ) ;
    public final void rule__ProbabilityMassFunction__SamplesAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6364:1: ( ( rulestringsample ) )
            // InternalStoex.g:6365:2: ( rulestringsample )
            {
            // InternalStoex.g:6365:2: ( rulestringsample )
            // InternalStoex.g:6366:3: rulestringsample
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
    // InternalStoex.g:6375:1: rule__ProbabilityMassFunction__OrderedDomainAssignment_3_1_1 : ( ( 'ordered' ) ) ;
    public final void rule__ProbabilityMassFunction__OrderedDomainAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6379:1: ( ( ( 'ordered' ) ) )
            // InternalStoex.g:6380:2: ( ( 'ordered' ) )
            {
            // InternalStoex.g:6380:2: ( ( 'ordered' ) )
            // InternalStoex.g:6381:3: ( 'ordered' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getOrderedDomainOrderedKeyword_3_1_1_0()); 
            }
            // InternalStoex.g:6382:3: ( 'ordered' )
            // InternalStoex.g:6383:4: 'ordered'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbabilityMassFunctionAccess().getOrderedDomainOrderedKeyword_3_1_1_0()); 
            }
            match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getOrderedDomainOrderedKeyword_3_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbabilityMassFunctionAccess().getOrderedDomainOrderedKeyword_3_1_1_0()); 
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
    // InternalStoex.g:6394:1: rule__ProbabilityMassFunction__SamplesAssignment_3_3 : ( ruleboolsample ) ;
    public final void rule__ProbabilityMassFunction__SamplesAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6398:1: ( ( ruleboolsample ) )
            // InternalStoex.g:6399:2: ( ruleboolsample )
            {
            // InternalStoex.g:6399:2: ( ruleboolsample )
            // InternalStoex.g:6400:3: ruleboolsample
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
    // InternalStoex.g:6409:1: rule__Numeric_int_sample__ValueAssignment_1 : ( ruleSIGNED_INT ) ;
    public final void rule__Numeric_int_sample__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6413:1: ( ( ruleSIGNED_INT ) )
            // InternalStoex.g:6414:2: ( ruleSIGNED_INT )
            {
            // InternalStoex.g:6414:2: ( ruleSIGNED_INT )
            // InternalStoex.g:6415:3: ruleSIGNED_INT
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
    // InternalStoex.g:6424:1: rule__Numeric_int_sample__ProbabilityAssignment_3 : ( RULE_DOUBLE ) ;
    public final void rule__Numeric_int_sample__ProbabilityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6428:1: ( ( RULE_DOUBLE ) )
            // InternalStoex.g:6429:2: ( RULE_DOUBLE )
            {
            // InternalStoex.g:6429:2: ( RULE_DOUBLE )
            // InternalStoex.g:6430:3: RULE_DOUBLE
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
    // InternalStoex.g:6439:1: rule__Numeric_real_sample__ValueAssignment_1 : ( ruleSIGNED_NUMBER ) ;
    public final void rule__Numeric_real_sample__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6443:1: ( ( ruleSIGNED_NUMBER ) )
            // InternalStoex.g:6444:2: ( ruleSIGNED_NUMBER )
            {
            // InternalStoex.g:6444:2: ( ruleSIGNED_NUMBER )
            // InternalStoex.g:6445:3: ruleSIGNED_NUMBER
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
    // InternalStoex.g:6454:1: rule__Numeric_real_sample__ProbabilityAssignment_3 : ( RULE_DOUBLE ) ;
    public final void rule__Numeric_real_sample__ProbabilityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6458:1: ( ( RULE_DOUBLE ) )
            // InternalStoex.g:6459:2: ( RULE_DOUBLE )
            {
            // InternalStoex.g:6459:2: ( RULE_DOUBLE )
            // InternalStoex.g:6460:3: RULE_DOUBLE
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
    // InternalStoex.g:6469:1: rule__Real_pdf_sample__ValueAssignment_1 : ( ruleSIGNED_NUMBER ) ;
    public final void rule__Real_pdf_sample__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6473:1: ( ( ruleSIGNED_NUMBER ) )
            // InternalStoex.g:6474:2: ( ruleSIGNED_NUMBER )
            {
            // InternalStoex.g:6474:2: ( ruleSIGNED_NUMBER )
            // InternalStoex.g:6475:3: ruleSIGNED_NUMBER
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
    // InternalStoex.g:6484:1: rule__Real_pdf_sample__ProbabilityAssignment_3 : ( RULE_DOUBLE ) ;
    public final void rule__Real_pdf_sample__ProbabilityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6488:1: ( ( RULE_DOUBLE ) )
            // InternalStoex.g:6489:2: ( RULE_DOUBLE )
            {
            // InternalStoex.g:6489:2: ( RULE_DOUBLE )
            // InternalStoex.g:6490:3: RULE_DOUBLE
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
    // InternalStoex.g:6499:1: rule__Stringsample__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Stringsample__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6503:1: ( ( RULE_STRING ) )
            // InternalStoex.g:6504:2: ( RULE_STRING )
            {
            // InternalStoex.g:6504:2: ( RULE_STRING )
            // InternalStoex.g:6505:3: RULE_STRING
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
    // InternalStoex.g:6514:1: rule__Stringsample__ProbabilityAssignment_3 : ( RULE_DOUBLE ) ;
    public final void rule__Stringsample__ProbabilityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6518:1: ( ( RULE_DOUBLE ) )
            // InternalStoex.g:6519:2: ( RULE_DOUBLE )
            {
            // InternalStoex.g:6519:2: ( RULE_DOUBLE )
            // InternalStoex.g:6520:3: RULE_DOUBLE
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
    // InternalStoex.g:6529:1: rule__Boolsample__ValueAssignment_1 : ( RULE_BOOLEAN_KEYWORDS ) ;
    public final void rule__Boolsample__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6533:1: ( ( RULE_BOOLEAN_KEYWORDS ) )
            // InternalStoex.g:6534:2: ( RULE_BOOLEAN_KEYWORDS )
            {
            // InternalStoex.g:6534:2: ( RULE_BOOLEAN_KEYWORDS )
            // InternalStoex.g:6535:3: RULE_BOOLEAN_KEYWORDS
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
    // InternalStoex.g:6544:1: rule__Boolsample__ProbabilityAssignment_3 : ( RULE_DOUBLE ) ;
    public final void rule__Boolsample__ProbabilityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStoex.g:6548:1: ( ( RULE_DOUBLE ) )
            // InternalStoex.g:6549:2: ( RULE_DOUBLE )
            {
            // InternalStoex.g:6549:2: ( RULE_DOUBLE )
            // InternalStoex.g:6550:3: RULE_DOUBLE
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

    // $ANTLR start synpred15_InternalStoex
    public final void synpred15_InternalStoex_fragment() throws RecognitionException {   
        // InternalStoex.g:1289:2: ( ( ruleunitMulti ) )
        // InternalStoex.g:1289:2: ( ruleunitMulti )
        {
        // InternalStoex.g:1289:2: ( ruleunitMulti )
        // InternalStoex.g:1290:3: ruleunitMulti
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
    // $ANTLR end synpred15_InternalStoex

    // $ANTLR start synpred16_InternalStoex
    public final void synpred16_InternalStoex_fragment() throws RecognitionException {   
        // InternalStoex.g:1295:2: ( ( ruleunitDiv ) )
        // InternalStoex.g:1295:2: ( ruleunitDiv )
        {
        // InternalStoex.g:1295:2: ( ruleunitDiv )
        // InternalStoex.g:1296:3: ruleunitDiv
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
    // $ANTLR end synpred16_InternalStoex

    // $ANTLR start synpred18_InternalStoex
    public final void synpred18_InternalStoex_fragment() throws RecognitionException {   
        // InternalStoex.g:1337:2: ( ( ruleunitMulti ) )
        // InternalStoex.g:1337:2: ( ruleunitMulti )
        {
        // InternalStoex.g:1337:2: ( ruleunitMulti )
        // InternalStoex.g:1338:3: ruleunitMulti
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
    // $ANTLR end synpred18_InternalStoex

    // $ANTLR start synpred50_InternalStoex
    public final void synpred50_InternalStoex_fragment() throws RecognitionException {   
        // InternalStoex.g:3522:3: ( rule__UnitMulti__Group_1__0 )
        // InternalStoex.g:3522:3: rule__UnitMulti__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__UnitMulti__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalStoex

    // Delegated rules

    public final boolean synpred50_InternalStoex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalStoex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalStoex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalStoex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalStoex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalStoex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalStoex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalStoex_fragment(); // can never throw exception
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
    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\4\uffff\1\54\4\uffff";
    static final String dfa_3s = "\1\64\4\uffff\1\57\4\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\1\5\1\6";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\1\1\5\1\4\1\3\43\uffff\1\6\3\uffff\5\7",
            "",
            "",
            "",
            "",
            "\1\10\2\uffff\1\11",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1167:1: rule__Atom__Alternatives : ( ( ruleIntLiteral ) | ( ruleDoubleLiteral ) | ( ruleStringLiteral ) | ( ruleBoolLiteral ) | ( ruleFunctionLiteral ) | ( ruleVariable ) | ( ruleParenthesis ) | ( ruleProbabilityFunctionLiteral ) );";
        }
    }
    static final String dfa_7s = "\1\41\6\0\3\uffff";
    static final String dfa_8s = "\1\54\6\0\3\uffff";
    static final String dfa_9s = "\7\uffff\1\1\1\2\1\3";
    static final String dfa_10s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\3\uffff}>";
    static final String[] dfa_11s = {
            "\1\1\1\2\1\3\1\4\1\5\6\uffff\1\6",
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
    static final char[] dfa_7 = DFA.unpackEncodedStringToUnsignedChars(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_7;
            this.max = dfa_8;
            this.accept = dfa_9;
            this.special = dfa_10;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "1284:1: rule__Unit__Alternatives : ( ( ruleunitMulti ) | ( ruleunitDiv ) | ( ruleBaseUnit ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_1 = input.LA(1);

                         
                        int index5_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalStoex()) ) {s = 7;}

                        else if ( (synpred16_InternalStoex()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index5_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_2 = input.LA(1);

                         
                        int index5_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalStoex()) ) {s = 7;}

                        else if ( (synpred16_InternalStoex()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index5_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_3 = input.LA(1);

                         
                        int index5_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalStoex()) ) {s = 7;}

                        else if ( (synpred16_InternalStoex()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index5_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_4 = input.LA(1);

                         
                        int index5_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalStoex()) ) {s = 7;}

                        else if ( (synpred16_InternalStoex()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index5_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA5_5 = input.LA(1);

                         
                        int index5_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalStoex()) ) {s = 7;}

                        else if ( (synpred16_InternalStoex()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index5_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA5_6 = input.LA(1);

                         
                        int index5_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalStoex()) ) {s = 7;}

                        else if ( (synpred16_InternalStoex()) ) {s = 8;}

                         
                        input.seek(index5_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x001F1200200001F0L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000FC00000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000030000002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000001C0000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000001C0000002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000103E00000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x001F3200200001F0L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000000F8040L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000140000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000020000010L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000080L});
    }


}