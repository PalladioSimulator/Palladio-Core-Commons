/*
 * generated by Xtext
 */
package org.palladiosimulator.commons.stoex.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractStoExValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://sdq.ipd.uka.de/StochasticExpressions/2.2"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://sdq.ipd.uka.de/Units/2.1"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://sdq.ipd.uka.de/ProbFunction/2.1"));
		return result;
	}
}
