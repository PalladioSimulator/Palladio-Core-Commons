package org.palladiosimulator.commons.stoex.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.uka.ipd.sdq.probfunction.BoolSample;
import de.uka.ipd.sdq.probfunction.BoxedPDF;
import de.uka.ipd.sdq.probfunction.ContinuousSample;
import de.uka.ipd.sdq.probfunction.DoubleSample;
import de.uka.ipd.sdq.probfunction.IntSample;
import de.uka.ipd.sdq.probfunction.ProbabilityMassFunction;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.probfunction.StringSample;
import de.uka.ipd.sdq.stoex.BoolLiteral;
import de.uka.ipd.sdq.stoex.BooleanOperatorExpression;
import de.uka.ipd.sdq.stoex.CompareExpression;
import de.uka.ipd.sdq.stoex.DoubleLiteral;
import de.uka.ipd.sdq.stoex.FunctionLiteral;
import de.uka.ipd.sdq.stoex.IfElseExpression;
import de.uka.ipd.sdq.stoex.IntLiteral;
import de.uka.ipd.sdq.stoex.NamespaceReference;
import de.uka.ipd.sdq.stoex.NegativeExpression;
import de.uka.ipd.sdq.stoex.NotExpression;
import de.uka.ipd.sdq.stoex.Parenthesis;
import de.uka.ipd.sdq.stoex.PowerExpression;
import de.uka.ipd.sdq.stoex.ProbabilityFunctionLiteral;
import de.uka.ipd.sdq.stoex.ProductExpression;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.stoex.StringLiteral;
import de.uka.ipd.sdq.stoex.TermExpression;
import de.uka.ipd.sdq.stoex.Variable;
import de.uka.ipd.sdq.stoex.VariableReference;
import de.uka.ipd.sdq.units.BaseUnit;
import de.uka.ipd.sdq.units.UnitDivision;
import de.uka.ipd.sdq.units.UnitMultiplication;
import de.uka.ipd.sdq.units.UnitPower;
import de.uka.ipd.sdq.units.UnitsPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.palladiosimulator.commons.stoex.services.StoExGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractStoExSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private StoExGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ProbfunctionPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ProbfunctionPackage.BOOL_SAMPLE:
				if(context == grammarAccess.getBoolsampleRule()) {
					sequence_boolsample(context, (BoolSample) semanticObject); 
					return; 
				}
				else break;
			case ProbfunctionPackage.BOXED_PDF:
				if(context == grammarAccess.getBoxedPDFRule() ||
				   context == grammarAccess.getProbabilityDensityFunctionRule() ||
				   context == grammarAccess.getDefinitionRule()) {
					sequence_BoxedPDF(context, (BoxedPDF) semanticObject); 
					return; 
				}
				else break;
			case ProbfunctionPackage.CONTINUOUS_SAMPLE:
				if(context == grammarAccess.getReal_pdf_sampleRule()) {
					sequence_real_pdf_sample(context, (ContinuousSample) semanticObject); 
					return; 
				}
				else break;
			case ProbfunctionPackage.DOUBLE_SAMPLE:
				if(context == grammarAccess.getNumeric_real_sampleRule()) {
					sequence_numeric_real_sample(context, (DoubleSample) semanticObject); 
					return; 
				}
				else break;
			case ProbfunctionPackage.INT_SAMPLE:
				if(context == grammarAccess.getNumeric_int_sampleRule()) {
					sequence_numeric_int_sample(context, (IntSample) semanticObject); 
					return; 
				}
				else break;
			case ProbfunctionPackage.PROBABILITY_MASS_FUNCTION:
				if(context == grammarAccess.getProbabilityMassFunctionRule() ||
				   context == grammarAccess.getDefinitionRule()) {
					sequence_ProbabilityMassFunction(context, (ProbabilityMassFunction) semanticObject); 
					return; 
				}
				else break;
			case ProbfunctionPackage.STRING_SAMPLE:
				if(context == grammarAccess.getStringsampleRule()) {
					sequence_stringsample(context, (StringSample) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == StoexPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case StoexPackage.BOOL_LITERAL:
				if(context == grammarAccess.getBoolLiteralRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAtomRule() ||
				   context == grammarAccess.getBoolAndExprRule() ||
				   context == grammarAccess.getBoolAndExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getBoolOrExprRule() ||
				   context == grammarAccess.getBoolOrExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCompareExprRule() ||
				   context == grammarAccess.getCompareExprAccess().getCompareExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfelseExprRule() ||
				   context == grammarAccess.getIfelseExprAccess().getIfElseExpressionConditionExpressionAction_1_0() ||
				   context == grammarAccess.getPowExprRule() ||
				   context == grammarAccess.getPowExprAccess().getPowerExpressionBaseAction_1_0() ||
				   context == grammarAccess.getProdExprRule() ||
				   context == grammarAccess.getProdExprAccess().getProductExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSumExprRule() ||
				   context == grammarAccess.getSumExprAccess().getTermExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExprRule()) {
					sequence_BoolLiteral(context, (BoolLiteral) semanticObject); 
					return; 
				}
				else break;
			case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION:
				if(context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getBooleanOperatorExpressionLeftAction_1_0()) {
					sequence_BooleanExpression_boolOrExpr(context, (BooleanOperatorExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBoolAndExprRule() ||
				   context == grammarAccess.getBoolAndExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfelseExprRule() ||
				   context == grammarAccess.getIfelseExprAccess().getIfElseExpressionConditionExpressionAction_1_0()) {
					sequence_boolAndExpr_boolOrExpr(context, (BooleanOperatorExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBoolOrExprRule() ||
				   context == grammarAccess.getBoolOrExprAccess().getBooleanOperatorExpressionLeftAction_1_0()) {
					sequence_boolOrExpr(context, (BooleanOperatorExpression) semanticObject); 
					return; 
				}
				else break;
			case StoexPackage.COMPARE_EXPRESSION:
				if(context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getBoolAndExprRule() ||
				   context == grammarAccess.getBoolAndExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getBoolOrExprRule() ||
				   context == grammarAccess.getBoolOrExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCompareExprRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfelseExprRule() ||
				   context == grammarAccess.getIfelseExprAccess().getIfElseExpressionConditionExpressionAction_1_0()) {
					sequence_compareExpr(context, (CompareExpression) semanticObject); 
					return; 
				}
				else break;
			case StoexPackage.DOUBLE_LITERAL:
				if(context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDoubleLiteralRule() ||
				   context == grammarAccess.getAtomRule() ||
				   context == grammarAccess.getBoolAndExprRule() ||
				   context == grammarAccess.getBoolAndExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getBoolOrExprRule() ||
				   context == grammarAccess.getBoolOrExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCompareExprRule() ||
				   context == grammarAccess.getCompareExprAccess().getCompareExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfelseExprRule() ||
				   context == grammarAccess.getIfelseExprAccess().getIfElseExpressionConditionExpressionAction_1_0() ||
				   context == grammarAccess.getPowExprRule() ||
				   context == grammarAccess.getPowExprAccess().getPowerExpressionBaseAction_1_0() ||
				   context == grammarAccess.getProdExprRule() ||
				   context == grammarAccess.getProdExprAccess().getProductExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSumExprRule() ||
				   context == grammarAccess.getSumExprAccess().getTermExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExprRule()) {
					sequence_DoubleLiteral(context, (DoubleLiteral) semanticObject); 
					return; 
				}
				else break;
			case StoexPackage.FUNCTION_LITERAL:
				if(context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFunctionLiteralRule() ||
				   context == grammarAccess.getAtomRule() ||
				   context == grammarAccess.getBoolAndExprRule() ||
				   context == grammarAccess.getBoolAndExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getBoolOrExprRule() ||
				   context == grammarAccess.getBoolOrExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCompareExprRule() ||
				   context == grammarAccess.getCompareExprAccess().getCompareExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfelseExprRule() ||
				   context == grammarAccess.getIfelseExprAccess().getIfElseExpressionConditionExpressionAction_1_0() ||
				   context == grammarAccess.getPowExprRule() ||
				   context == grammarAccess.getPowExprAccess().getPowerExpressionBaseAction_1_0() ||
				   context == grammarAccess.getProdExprRule() ||
				   context == grammarAccess.getProdExprAccess().getProductExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSumExprRule() ||
				   context == grammarAccess.getSumExprAccess().getTermExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExprRule()) {
					sequence_FunctionLiteral(context, (FunctionLiteral) semanticObject); 
					return; 
				}
				else break;
			case StoexPackage.IF_ELSE_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfelseExprRule()) {
					sequence_ifelseExpr(context, (IfElseExpression) semanticObject); 
					return; 
				}
				else break;
			case StoexPackage.INT_LITERAL:
				if(context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getIntLiteralRule() ||
				   context == grammarAccess.getAtomRule() ||
				   context == grammarAccess.getBoolAndExprRule() ||
				   context == grammarAccess.getBoolAndExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getBoolOrExprRule() ||
				   context == grammarAccess.getBoolOrExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCompareExprRule() ||
				   context == grammarAccess.getCompareExprAccess().getCompareExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfelseExprRule() ||
				   context == grammarAccess.getIfelseExprAccess().getIfElseExpressionConditionExpressionAction_1_0() ||
				   context == grammarAccess.getPowExprRule() ||
				   context == grammarAccess.getPowExprAccess().getPowerExpressionBaseAction_1_0() ||
				   context == grammarAccess.getProdExprRule() ||
				   context == grammarAccess.getProdExprAccess().getProductExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSumExprRule() ||
				   context == grammarAccess.getSumExprAccess().getTermExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExprRule()) {
					sequence_IntLiteral(context, (IntLiteral) semanticObject); 
					return; 
				}
				else break;
			case StoexPackage.NAMESPACE_REFERENCE:
				if(context == grammarAccess.getAbstractNamedReferenceRule() ||
				   context == grammarAccess.getNamespaceReferenceRule()) {
					sequence_NamespaceReference(context, (NamespaceReference) semanticObject); 
					return; 
				}
				else break;
			case StoexPackage.NEGATIVE_EXPRESSION:
				if(context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getNegativeExpressionRule() ||
				   context == grammarAccess.getBoolAndExprRule() ||
				   context == grammarAccess.getBoolAndExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getBoolOrExprRule() ||
				   context == grammarAccess.getBoolOrExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCompareExprRule() ||
				   context == grammarAccess.getCompareExprAccess().getCompareExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfelseExprRule() ||
				   context == grammarAccess.getIfelseExprAccess().getIfElseExpressionConditionExpressionAction_1_0() ||
				   context == grammarAccess.getPowExprRule() ||
				   context == grammarAccess.getPowExprAccess().getPowerExpressionBaseAction_1_0() ||
				   context == grammarAccess.getProdExprRule() ||
				   context == grammarAccess.getProdExprAccess().getProductExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSumExprRule() ||
				   context == grammarAccess.getSumExprAccess().getTermExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExprRule()) {
					sequence_NegativeExpression(context, (NegativeExpression) semanticObject); 
					return; 
				}
				else break;
			case StoexPackage.NOT_EXPRESSION:
				if(context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getBoolAndExprRule() ||
				   context == grammarAccess.getBoolAndExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getBoolOrExprRule() ||
				   context == grammarAccess.getBoolOrExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCompareExprRule() ||
				   context == grammarAccess.getCompareExprAccess().getCompareExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfelseExprRule() ||
				   context == grammarAccess.getIfelseExprAccess().getIfElseExpressionConditionExpressionAction_1_0() ||
				   context == grammarAccess.getPowExprRule() ||
				   context == grammarAccess.getPowExprAccess().getPowerExpressionBaseAction_1_0() ||
				   context == grammarAccess.getProdExprRule() ||
				   context == grammarAccess.getProdExprAccess().getProductExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSumExprRule() ||
				   context == grammarAccess.getSumExprAccess().getTermExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExprRule()) {
					sequence_NotExpression(context, (NotExpression) semanticObject); 
					return; 
				}
				else break;
			case StoexPackage.PARENTHESIS:
				if(context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getParenthesisRule() ||
				   context == grammarAccess.getAtomRule() ||
				   context == grammarAccess.getBoolAndExprRule() ||
				   context == grammarAccess.getBoolAndExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getBoolOrExprRule() ||
				   context == grammarAccess.getBoolOrExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCompareExprRule() ||
				   context == grammarAccess.getCompareExprAccess().getCompareExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfelseExprRule() ||
				   context == grammarAccess.getIfelseExprAccess().getIfElseExpressionConditionExpressionAction_1_0() ||
				   context == grammarAccess.getPowExprRule() ||
				   context == grammarAccess.getPowExprAccess().getPowerExpressionBaseAction_1_0() ||
				   context == grammarAccess.getProdExprRule() ||
				   context == grammarAccess.getProdExprAccess().getProductExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSumExprRule() ||
				   context == grammarAccess.getSumExprAccess().getTermExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExprRule()) {
					sequence_Parenthesis(context, (Parenthesis) semanticObject); 
					return; 
				}
				else break;
			case StoexPackage.POWER_EXPRESSION:
				if(context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getBoolAndExprRule() ||
				   context == grammarAccess.getBoolAndExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getBoolOrExprRule() ||
				   context == grammarAccess.getBoolOrExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCompareExprRule() ||
				   context == grammarAccess.getCompareExprAccess().getCompareExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfelseExprRule() ||
				   context == grammarAccess.getIfelseExprAccess().getIfElseExpressionConditionExpressionAction_1_0() ||
				   context == grammarAccess.getPowExprRule() ||
				   context == grammarAccess.getProdExprRule() ||
				   context == grammarAccess.getProdExprAccess().getProductExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSumExprRule() ||
				   context == grammarAccess.getSumExprAccess().getTermExpressionLeftAction_1_0()) {
					sequence_powExpr(context, (PowerExpression) semanticObject); 
					return; 
				}
				else break;
			case StoexPackage.PROBABILITY_FUNCTION_LITERAL:
				if(context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getProbabilityFunctionLiteralRule() ||
				   context == grammarAccess.getAtomRule() ||
				   context == grammarAccess.getBoolAndExprRule() ||
				   context == grammarAccess.getBoolAndExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getBoolOrExprRule() ||
				   context == grammarAccess.getBoolOrExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCompareExprRule() ||
				   context == grammarAccess.getCompareExprAccess().getCompareExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfelseExprRule() ||
				   context == grammarAccess.getIfelseExprAccess().getIfElseExpressionConditionExpressionAction_1_0() ||
				   context == grammarAccess.getPowExprRule() ||
				   context == grammarAccess.getPowExprAccess().getPowerExpressionBaseAction_1_0() ||
				   context == grammarAccess.getProdExprRule() ||
				   context == grammarAccess.getProdExprAccess().getProductExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSumExprRule() ||
				   context == grammarAccess.getSumExprAccess().getTermExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExprRule()) {
					sequence_ProbabilityFunctionLiteral(context, (ProbabilityFunctionLiteral) semanticObject); 
					return; 
				}
				else break;
			case StoexPackage.PRODUCT_EXPRESSION:
				if(context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getBoolAndExprRule() ||
				   context == grammarAccess.getBoolAndExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getBoolOrExprRule() ||
				   context == grammarAccess.getBoolOrExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCompareExprRule() ||
				   context == grammarAccess.getCompareExprAccess().getCompareExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfelseExprRule() ||
				   context == grammarAccess.getIfelseExprAccess().getIfElseExpressionConditionExpressionAction_1_0() ||
				   context == grammarAccess.getProdExprRule() ||
				   context == grammarAccess.getProdExprAccess().getProductExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSumExprRule() ||
				   context == grammarAccess.getSumExprAccess().getTermExpressionLeftAction_1_0()) {
					sequence_prodExpr(context, (ProductExpression) semanticObject); 
					return; 
				}
				else break;
			case StoexPackage.STRING_LITERAL:
				if(context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getStringLiteralRule() ||
				   context == grammarAccess.getAtomRule() ||
				   context == grammarAccess.getBoolAndExprRule() ||
				   context == grammarAccess.getBoolAndExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getBoolOrExprRule() ||
				   context == grammarAccess.getBoolOrExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCompareExprRule() ||
				   context == grammarAccess.getCompareExprAccess().getCompareExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfelseExprRule() ||
				   context == grammarAccess.getIfelseExprAccess().getIfElseExpressionConditionExpressionAction_1_0() ||
				   context == grammarAccess.getPowExprRule() ||
				   context == grammarAccess.getPowExprAccess().getPowerExpressionBaseAction_1_0() ||
				   context == grammarAccess.getProdExprRule() ||
				   context == grammarAccess.getProdExprAccess().getProductExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSumExprRule() ||
				   context == grammarAccess.getSumExprAccess().getTermExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExprRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case StoexPackage.TERM_EXPRESSION:
				if(context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getBoolAndExprRule() ||
				   context == grammarAccess.getBoolAndExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getBoolOrExprRule() ||
				   context == grammarAccess.getBoolOrExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCompareExprRule() ||
				   context == grammarAccess.getCompareExprAccess().getCompareExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfelseExprRule() ||
				   context == grammarAccess.getIfelseExprAccess().getIfElseExpressionConditionExpressionAction_1_0() ||
				   context == grammarAccess.getSumExprRule() ||
				   context == grammarAccess.getSumExprAccess().getTermExpressionLeftAction_1_0()) {
					sequence_sumExpr(context, (TermExpression) semanticObject); 
					return; 
				}
				else break;
			case StoexPackage.VARIABLE:
				if(context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getVariableRule() ||
				   context == grammarAccess.getAtomRule() ||
				   context == grammarAccess.getBoolAndExprRule() ||
				   context == grammarAccess.getBoolAndExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getBoolOrExprRule() ||
				   context == grammarAccess.getBoolOrExprAccess().getBooleanOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getCompareExprRule() ||
				   context == grammarAccess.getCompareExprAccess().getCompareExpressionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfelseExprRule() ||
				   context == grammarAccess.getIfelseExprAccess().getIfElseExpressionConditionExpressionAction_1_0() ||
				   context == grammarAccess.getPowExprRule() ||
				   context == grammarAccess.getPowExprAccess().getPowerExpressionBaseAction_1_0() ||
				   context == grammarAccess.getProdExprRule() ||
				   context == grammarAccess.getProdExprAccess().getProductExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSumExprRule() ||
				   context == grammarAccess.getSumExprAccess().getTermExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExprRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case StoexPackage.VARIABLE_REFERENCE:
				if(context == grammarAccess.getAbstractNamedReferenceRule() ||
				   context == grammarAccess.getVariableReferenceRule()) {
					sequence_VariableReference(context, (VariableReference) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == UnitsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case UnitsPackage.BASE_UNIT:
				if(context == grammarAccess.getBaseUnitRule() ||
				   context == grammarAccess.getUnitRule() ||
				   context == grammarAccess.getUnitDivRule() ||
				   context == grammarAccess.getUnitDivAccess().getUnitDivisionDividendAction_1_0() ||
				   context == grammarAccess.getUnitMultiRule() ||
				   context == grammarAccess.getUnitMultiAccess().getUnitMultiplicationUnitsAction_1_0() ||
				   context == grammarAccess.getUnitPowRule() ||
				   context == grammarAccess.getUnitPowAccess().getUnitPowerUnitAction_1_0()) {
					sequence_BaseUnit(context, (BaseUnit) semanticObject); 
					return; 
				}
				else break;
			case UnitsPackage.UNIT_DIVISION:
				if(context == grammarAccess.getUnitRule() ||
				   context == grammarAccess.getUnitDivRule() ||
				   context == grammarAccess.getUnitDivAccess().getUnitDivisionDividendAction_1_0() ||
				   context == grammarAccess.getUnitMultiRule() ||
				   context == grammarAccess.getUnitMultiAccess().getUnitMultiplicationUnitsAction_1_0() ||
				   context == grammarAccess.getUnitPowRule() ||
				   context == grammarAccess.getUnitPowAccess().getUnitPowerUnitAction_1_0()) {
					sequence_unitDiv(context, (UnitDivision) semanticObject); 
					return; 
				}
				else break;
			case UnitsPackage.UNIT_MULTIPLICATION:
				if(context == grammarAccess.getUnitRule() ||
				   context == grammarAccess.getUnitDivRule() ||
				   context == grammarAccess.getUnitDivAccess().getUnitDivisionDividendAction_1_0() ||
				   context == grammarAccess.getUnitMultiRule() ||
				   context == grammarAccess.getUnitMultiAccess().getUnitMultiplicationUnitsAction_1_0() ||
				   context == grammarAccess.getUnitPowRule() ||
				   context == grammarAccess.getUnitPowAccess().getUnitPowerUnitAction_1_0()) {
					sequence_unitMulti(context, (UnitMultiplication) semanticObject); 
					return; 
				}
				else break;
			case UnitsPackage.UNIT_POWER:
				if(context == grammarAccess.getUnitRule() ||
				   context == grammarAccess.getUnitDivRule() ||
				   context == grammarAccess.getUnitDivAccess().getUnitDivisionDividendAction_1_0() ||
				   context == grammarAccess.getUnitMultiRule() ||
				   context == grammarAccess.getUnitMultiAccess().getUnitMultiplicationUnitsAction_1_0() ||
				   context == grammarAccess.getUnitPowRule() ||
				   context == grammarAccess.getUnitPowAccess().getUnitPowerUnitAction_1_0()) {
					sequence_unitPow(context, (UnitPower) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=UnitNames
	 */
	protected void sequence_BaseUnit(EObject context, BaseUnit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, UnitsPackage.Literals.BASE_UNIT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, UnitsPackage.Literals.BASE_UNIT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getBaseUnitAccess().getNameUnitNamesEnumRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOLEAN_KEYWORDS
	 */
	protected void sequence_BoolLiteral(EObject context, BoolLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.BOOL_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.BOOL_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getBoolLiteralAccess().getValueBOOLEAN_KEYWORDSTerminalRuleCall_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (left=BooleanExpression_BooleanOperatorExpression_1_0 operation=BooleanOperations right=boolOrExpr) | 
	 *         (left=boolOrExpr_BooleanOperatorExpression_1_0 operation=oroperations right=compareExpr)
	 *     )
	 */
	protected void sequence_BooleanExpression_boolOrExpr(EObject context, BooleanOperatorExpression semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (samples+=real_pdf_sample+ unit=Unit?)
	 */
	protected void sequence_BoxedPDF(EObject context, BoxedPDF semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=DOUBLE unit=Unit?)
	 */
	protected void sequence_DoubleLiteral(EObject context, DoubleLiteral semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID (parameters_FunctionLiteral+=boolAndExpr parameters_FunctionLiteral+=boolAndExpr*)?)
	 */
	protected void sequence_FunctionLiteral(EObject context, FunctionLiteral semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=DECINT unit=Unit?)
	 */
	protected void sequence_IntLiteral(EObject context, IntLiteral semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (referenceName=ID innerReference_NamespaceReference=AbstractNamedReference)
	 */
	protected void sequence_NamespaceReference(EObject context, NamespaceReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME));
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.NAMESPACE_REFERENCE__INNER_REFERENCE_NAMESPACE_REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getNamespaceReferenceAccess().getReferenceNameIDTerminalRuleCall_0_0(), semanticObject.getReferenceName());
		feeder.accept(grammarAccess.getNamespaceReferenceAccess().getInnerReference_NamespaceReferenceAbstractNamedReferenceParserRuleCall_2_0(), semanticObject.getInnerReference_NamespaceReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     inner=unaryExpr
	 */
	protected void sequence_NegativeExpression(EObject context, NegativeExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.NEGATIVE_EXPRESSION__INNER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.NEGATIVE_EXPRESSION__INNER));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getNegativeExpressionAccess().getInnerUnaryExprParserRuleCall_1_0(), semanticObject.getInner());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     inner=unaryExpr
	 */
	protected void sequence_NotExpression(EObject context, NotExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.NOT_EXPRESSION__INNER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.NOT_EXPRESSION__INNER));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getNotExpressionAccess().getInnerUnaryExprParserRuleCall_1_0(), semanticObject.getInner());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     innerExpression=ifelseExpr
	 */
	protected void sequence_Parenthesis(EObject context, Parenthesis semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.PARENTHESIS__INNER_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.PARENTHESIS__INNER_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getParenthesisAccess().getInnerExpressionIfelseExprParserRuleCall_1_0(), semanticObject.getInnerExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     function_ProbabilityFunctionLiteral=definition
	 */
	protected void sequence_ProbabilityFunctionLiteral(EObject context, ProbabilityFunctionLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.PROBABILITY_FUNCTION_LITERAL__FUNCTION_PROBABILITY_FUNCTION_LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.PROBABILITY_FUNCTION_LITERAL__FUNCTION_PROBABILITY_FUNCTION_LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getProbabilityFunctionLiteralAccess().getFunction_ProbabilityFunctionLiteralDefinitionParserRuleCall_0(), semanticObject.getFunction_ProbabilityFunctionLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (samples+=numeric_int_sample+ unit=Unit?) | 
	 *         (samples+=numeric_real_sample+ unit=Unit?) | 
	 *         (orderedDomain?=ORDERED_DEF? samples+=stringsample+) | 
	 *         (orderedDomain?=ORDERED_DEF? samples+=boolsample+)
	 *     )
	 */
	protected void sequence_ProbabilityMassFunction(EObject context, ProbabilityMassFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.STRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     referenceName=ID
	 */
	protected void sequence_VariableReference(EObject context, VariableReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.ABSTRACT_NAMED_REFERENCE__REFERENCE_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableReferenceAccess().getReferenceNameIDTerminalRuleCall_0(), semanticObject.getReferenceName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     id_Variable=AbstractNamedReference
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.VARIABLE__ID_VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.VARIABLE__ID_VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAccess().getId_VariableAbstractNamedReferenceParserRuleCall_0(), semanticObject.getId_Variable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (left=boolAndExpr_BooleanOperatorExpression_1_0 operation=andoperation right=boolOrExpr) | 
	 *         (left=boolOrExpr_BooleanOperatorExpression_1_0 operation=oroperations right=compareExpr)
	 *     )
	 */
	protected void sequence_boolAndExpr_boolOrExpr(EObject context, BooleanOperatorExpression semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=boolOrExpr_BooleanOperatorExpression_1_0 operation=oroperations right=compareExpr)
	 */
	protected void sequence_boolOrExpr(EObject context, BooleanOperatorExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.BOOLEAN_OPERATOR_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.BOOLEAN_OPERATOR_EXPRESSION__LEFT));
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.BOOLEAN_OPERATOR_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.BOOLEAN_OPERATOR_EXPRESSION__RIGHT));
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.BOOLEAN_OPERATOR_EXPRESSION__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.BOOLEAN_OPERATOR_EXPRESSION__OPERATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getBoolOrExprAccess().getBooleanOperatorExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBoolOrExprAccess().getOperationOroperationsEnumRuleCall_1_1_0(), semanticObject.getOperation());
		feeder.accept(grammarAccess.getBoolOrExprAccess().getRightCompareExprParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=BOOLEAN_KEYWORDS probability=DOUBLE)
	 */
	protected void sequence_boolsample(EObject context, BoolSample semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProbfunctionPackage.Literals.SAMPLE__PROBABILITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProbfunctionPackage.Literals.SAMPLE__PROBABILITY));
			if(transientValues.isValueTransient(semanticObject, ProbfunctionPackage.Literals.SAMPLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProbfunctionPackage.Literals.SAMPLE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBoolsampleAccess().getValueBOOLEAN_KEYWORDSTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getBoolsampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0(), semanticObject.getProbability());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=compareExpr_CompareExpression_1_0 operation=CompareOperations right=sumExpr)
	 */
	protected void sequence_compareExpr(EObject context, CompareExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.COMPARE_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.COMPARE_EXPRESSION__LEFT));
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.COMPARE_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.COMPARE_EXPRESSION__RIGHT));
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.COMPARE_EXPRESSION__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.COMPARE_EXPRESSION__OPERATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getCompareExprAccess().getCompareExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getCompareExprAccess().getOperationCompareOperationsEnumRuleCall_1_1_0(), semanticObject.getOperation());
		feeder.accept(grammarAccess.getCompareExprAccess().getRightSumExprParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (conditionExpression=ifelseExpr_IfElseExpression_1_0 ifExpression=boolAndExpr elseExpression=boolAndExpr)
	 */
	protected void sequence_ifelseExpr(EObject context, IfElseExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.IF_ELSE_EXPRESSION__IF_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.IF_ELSE_EXPRESSION__IF_EXPRESSION));
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.IF_ELSE_EXPRESSION__ELSE_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.IF_ELSE_EXPRESSION__ELSE_EXPRESSION));
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getIfelseExprAccess().getIfElseExpressionConditionExpressionAction_1_0(), semanticObject.getConditionExpression());
		feeder.accept(grammarAccess.getIfelseExprAccess().getIfExpressionBoolAndExprParserRuleCall_1_2_0(), semanticObject.getIfExpression());
		feeder.accept(grammarAccess.getIfelseExprAccess().getElseExpressionBoolAndExprParserRuleCall_1_4_0(), semanticObject.getElseExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=SIGNED_INT probability=DOUBLE)
	 */
	protected void sequence_numeric_int_sample(EObject context, IntSample semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProbfunctionPackage.Literals.SAMPLE__PROBABILITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProbfunctionPackage.Literals.SAMPLE__PROBABILITY));
			if(transientValues.isValueTransient(semanticObject, ProbfunctionPackage.Literals.SAMPLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProbfunctionPackage.Literals.SAMPLE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumeric_int_sampleAccess().getValueSIGNED_INTParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNumeric_int_sampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0(), semanticObject.getProbability());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=SIGNED_NUMBER probability=DOUBLE)
	 */
	protected void sequence_numeric_real_sample(EObject context, DoubleSample semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProbfunctionPackage.Literals.SAMPLE__PROBABILITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProbfunctionPackage.Literals.SAMPLE__PROBABILITY));
			if(transientValues.isValueTransient(semanticObject, ProbfunctionPackage.Literals.SAMPLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProbfunctionPackage.Literals.SAMPLE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumeric_real_sampleAccess().getValueSIGNED_NUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNumeric_real_sampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0(), semanticObject.getProbability());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (base=powExpr_PowerExpression_1_0 exponent=unaryExpr)
	 */
	protected void sequence_powExpr(EObject context, PowerExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.POWER_EXPRESSION__BASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.POWER_EXPRESSION__BASE));
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.POWER_EXPRESSION__EXPONENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.POWER_EXPRESSION__EXPONENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getPowExprAccess().getPowerExpressionBaseAction_1_0(), semanticObject.getBase());
		feeder.accept(grammarAccess.getPowExprAccess().getExponentUnaryExprParserRuleCall_1_2_0(), semanticObject.getExponent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=prodExpr_ProductExpression_1_0 operation=ProductOperations right=powExpr)
	 */
	protected void sequence_prodExpr(EObject context, ProductExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.PRODUCT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.PRODUCT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.PRODUCT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.PRODUCT_EXPRESSION__RIGHT));
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.PRODUCT_EXPRESSION__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.PRODUCT_EXPRESSION__OPERATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getProdExprAccess().getProductExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getProdExprAccess().getOperationProductOperationsEnumRuleCall_1_1_0(), semanticObject.getOperation());
		feeder.accept(grammarAccess.getProdExprAccess().getRightPowExprParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=SIGNED_NUMBER probability=DOUBLE)
	 */
	protected void sequence_real_pdf_sample(EObject context, ContinuousSample semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProbfunctionPackage.Literals.CONTINUOUS_SAMPLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProbfunctionPackage.Literals.CONTINUOUS_SAMPLE__VALUE));
			if(transientValues.isValueTransient(semanticObject, ProbfunctionPackage.Literals.CONTINUOUS_SAMPLE__PROBABILITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProbfunctionPackage.Literals.CONTINUOUS_SAMPLE__PROBABILITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReal_pdf_sampleAccess().getValueSIGNED_NUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getReal_pdf_sampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0(), semanticObject.getProbability());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=STRING probability=DOUBLE)
	 */
	protected void sequence_stringsample(EObject context, StringSample semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProbfunctionPackage.Literals.SAMPLE__PROBABILITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProbfunctionPackage.Literals.SAMPLE__PROBABILITY));
			if(transientValues.isValueTransient(semanticObject, ProbfunctionPackage.Literals.SAMPLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProbfunctionPackage.Literals.SAMPLE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringsampleAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getStringsampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0(), semanticObject.getProbability());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=sumExpr_TermExpression_1_0 operation=TermOperations right=prodExpr)
	 */
	protected void sequence_sumExpr(EObject context, TermExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.TERM_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.TERM_EXPRESSION__LEFT));
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.TERM_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.TERM_EXPRESSION__RIGHT));
			if(transientValues.isValueTransient((EObject)semanticObject, StoexPackage.Literals.TERM_EXPRESSION__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, StoexPackage.Literals.TERM_EXPRESSION__OPERATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getSumExprAccess().getTermExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSumExprAccess().getOperationTermOperationsEnumRuleCall_1_1_0(), semanticObject.getOperation());
		feeder.accept(grammarAccess.getSumExprAccess().getRightProdExprParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (dividend=unitDiv_UnitDivision_1_0 divisor=Unit)
	 */
	protected void sequence_unitDiv(EObject context, UnitDivision semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, UnitsPackage.Literals.UNIT_DIVISION__DIVIDEND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, UnitsPackage.Literals.UNIT_DIVISION__DIVIDEND));
			if(transientValues.isValueTransient((EObject)semanticObject, UnitsPackage.Literals.UNIT_DIVISION__DIVISOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, UnitsPackage.Literals.UNIT_DIVISION__DIVISOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getUnitDivAccess().getUnitDivisionDividendAction_1_0(), semanticObject.getDividend());
		feeder.accept(grammarAccess.getUnitDivAccess().getDivisorUnitParserRuleCall_1_2_0(), semanticObject.getDivisor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (units+=unitMulti_UnitMultiplication_1_0 units+=Unit)
	 */
	protected void sequence_unitMulti(EObject context, UnitMultiplication semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unit=unitPow_UnitPower_1_0 exponent=SIGNED_INT)
	 */
	protected void sequence_unitPow(EObject context, UnitPower semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, UnitsPackage.Literals.UNIT_POWER__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, UnitsPackage.Literals.UNIT_POWER__UNIT));
			if(transientValues.isValueTransient((EObject)semanticObject, UnitsPackage.Literals.UNIT_POWER__EXPONENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, UnitsPackage.Literals.UNIT_POWER__EXPONENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getUnitPowAccess().getUnitPowerUnitAction_1_0(), semanticObject.getUnit());
		feeder.accept(grammarAccess.getUnitPowAccess().getExponentSIGNED_INTParserRuleCall_1_2_0(), semanticObject.getExponent());
		feeder.finish();
	}
}
