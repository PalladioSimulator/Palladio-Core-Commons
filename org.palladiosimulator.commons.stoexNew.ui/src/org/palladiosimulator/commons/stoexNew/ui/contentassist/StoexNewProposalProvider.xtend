/*
 * generated by Xtext 2.12.0
 */
package org.palladiosimulator.commons.stoexNew.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import com.google.inject.Inject
import org.eclipse.xtext.ui.IImageHelper
import org.eclipse.xtext.Assignment

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class StoexNewProposalProvider extends AbstractStoexNewProposalProvider {
	val String[][] probfunctions = #[
		#["IntPMF[(42;p)(2;q)(3;r)]", "IntPMF - integer random variable"],
		#["EnumPMF[(\"a\";p)(\"b\";q)(\"c\";r)]", "EnumPMF - enum random variable"],
		#["DoublePMF[(4.2;p)(2.0;q)(13.37;r)]", "DoublePMF - double random variable"],
		#["BoolPMF[(true;p)(false;q)]", "BoolPMF - boolean random variable"],
		#["DoublePDF[(4.2;p)(2.0;q)(13.37;r)]", "DoublePDF - double random variable (BoxedPDF)"]
	];

	@Inject
	IImageHelper imagesHelper;

	def collectExpression(ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		for (String[] pf : probfunctions) {
			acceptor.accept(
				createCompletionProposal(pf.get(0), pf.get(1), imagesHelper.getImage("random.gif"), context));
		}
	}

	override complete_expression(EObject model, RuleCall ruleCall, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		super.complete_expression(model, ruleCall, context, acceptor);
		collectExpression(context, acceptor);
	}

	override completeIfelseExpr_IfExpression(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		super.completeIfelseExpr_IfExpression(model, assignment, context, acceptor);
		collectExpression(context, acceptor);
	}

	override completeIfelseExpr_ElseExpression(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		super.completeIfelseExpr_ElseExpression(model, assignment, context, acceptor);
		collectExpression(context, acceptor);
	}

	override completeBoolAndExpr_Right(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		super.completeBoolAndExpr_Right(model, assignment, context, acceptor);
		collectExpression(context, acceptor);
	}

	override completeBoolOrExpr_Right(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		super.completeBoolOrExpr_Right(model, assignment, context, acceptor);
		collectExpression(context, acceptor);
	}

	override completeCompareExpr_Right(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		super.completeCompareExpr_Right(model, assignment, context, acceptor);
		collectExpression(context, acceptor);
	}

	override completeSumExpr_Right(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		super.completeSumExpr_Right(model, assignment, context, acceptor);
		collectExpression(context, acceptor);
	}

	override completeProdExpr_Right(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		super.completeProdExpr_Right(model, assignment, context, acceptor);
		collectExpression(context, acceptor);
	}

	override completeNotExpression_Inner(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		super.completeNotExpression_Inner(model, assignment, context, acceptor);
		collectExpression(context, acceptor);
	}

	override completeNegativeExpression_Inner(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		super.completeNegativeExpression_Inner(model, assignment, context, acceptor);
		collectExpression(context, acceptor);
	}

	override completeParenthesis_InnerExpression(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		super.completeParenthesis_InnerExpression(model, assignment, context, acceptor);
		collectExpression(context, acceptor);
	}

	override completeFunctionLiteral_Parameters_FunctionLiteral(EObject model, Assignment assignment,
		ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeFunctionLiteral_Parameters_FunctionLiteral(model, assignment, context, acceptor);
		collectExpression(context, acceptor);
	}

}
