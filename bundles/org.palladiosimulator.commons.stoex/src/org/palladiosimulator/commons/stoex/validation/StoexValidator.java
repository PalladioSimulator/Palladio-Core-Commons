/*
 * generated by Xtext 2.22.0
 */
package org.palladiosimulator.commons.stoex.validation;

import java.util.Collection;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

import de.uka.ipd.sdq.errorhandling.IIssue;
import de.uka.ipd.sdq.stoex.Expression;
import de.uka.ipd.sdq.stoex.analyser.exceptions.ExpectedTypeMismatchIssue;
import de.uka.ipd.sdq.stoex.analyser.visitors.NonProbabilisticExpressionInferTypeVisitor;
import de.uka.ipd.sdq.stoex.analyser.visitors.TypeCheckVisitor;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class StoexValidator extends AbstractStoexValidator {
	
    @Check
    public void checkTypes(Expression exp) {
        var typeVisitor = new NonProbabilisticExpressionInferTypeVisitor();
        typeVisitor.doSwitch(exp);
        var typeChecker = new TypeCheckVisitor(typeVisitor);
        typeChecker.doSwitch(exp);
        TreeIterator<EObject> iterator = exp.eAllContents();
        for (; iterator.hasNext();) {
            EObject treeNode = iterator.next();
            typeChecker.doSwitch(treeNode);
        }
        Collection<IIssue> issueList = getIssues(typeChecker);

        for (IIssue ex : issueList) {
            /* TODO: I could not find the following class anymore. If not required anymore, remove. [Krach] */
            /* if (ex instanceof ErrorEntry) {
                error(ex.message, exp, StoexPackage.Literals.IF_ELSE_EXPRESSION__CONDITION_EXPRESSION)
            } else*/ 
            if (ex instanceof ExpectedTypeMismatchIssue) {
                warning(ex.getMessage(), exp, ((ExpectedTypeMismatchIssue)ex).getFeature());
            }
        }

    }

    public Collection<IIssue> getIssues(TypeCheckVisitor visitor) {
        return visitor.getIssues();
    }
	
}
