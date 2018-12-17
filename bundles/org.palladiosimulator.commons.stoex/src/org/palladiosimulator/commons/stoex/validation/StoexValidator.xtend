/*
 * generated by Xtext 2.12.0
 */
package org.palladiosimulator.commons.stoex.validation

import de.uka.ipd.sdq.errorhandling.IIssue
import de.uka.ipd.sdq.stoex.Expression
import de.uka.ipd.sdq.stoex.StoexPackage
import de.uka.ipd.sdq.stoex.analyser.exceptions.ExpectedTypeMismatchIssue
import de.uka.ipd.sdq.stoex.analyser.visitors.NonProbabilisticExpressionInferTypeVisitor
import de.uka.ipd.sdq.stoex.analyser.visitors.TypeCheckVisitor
import java.util.Collection
import org.eclipse.emf.common.util.TreeIterator
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check
import org.palladiosimulator.pcm.stochasticexpressions.parser.ErrorEntry

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class StoexValidator extends AbstractStoexValidator {
	
	@Check
	def checkTypes(Expression exp) {
		val typeVisitor = new NonProbabilisticExpressionInferTypeVisitor;
		typeVisitor.doSwitch(exp)
		val typeChecker = new TypeCheckVisitor(typeVisitor);
		typeChecker.doSwitch(exp);
		val TreeIterator<EObject> iterator = exp.eAllContents();
		for (; iterator.hasNext();) {
			val EObject treeNode = iterator.next();
			typeChecker.doSwitch(treeNode);
		}
		val Collection<IIssue> issueList = getIssues(typeChecker)

		for (IIssue ex : issueList) {
			if (ex instanceof ErrorEntry) {
				error(ex.message, exp, StoexPackage.Literals.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION)
			} else if (ex instanceof ExpectedTypeMismatchIssue) {
				warning(ex.message, exp, (ex as ExpectedTypeMismatchIssue).feature)
			}
		}

	}

	def Collection<IIssue> getIssues(TypeCheckVisitor visitor) {
		visitor.issues
	}
	
}
