package de.uka.ipd.sdq.stoex.analyser.visitors;

import de.uka.ipd.sdq.stoex.Variable;

/**
 * Extension point for the to determine the type of a variable based on its
 * characterization type. The method of this extension contains the variable
 * characterization dependencies to the pcm core. In order to move the StoEx
 * Analyser to pcm commons, it was made extensible via extension points and the
 * functionality of the variable characterizations was provided as this
 * extension.
 * 
 * @author Yves Schneider
 */
public interface ITypeInference {

	/**
	 * Infers the type of a variable depending on its characterization type. Infers
	 * VALUE, DATATYPE, STRUCUTURE to ANY_PMF, while NUMBER_OF_ELEMENTS and BYTESIZE
	 * to INT_PMF.
	 *
	 * @param var The variable to infers the type
	 * @return The type of a variable
	 */
	TypeEnum getType(final Variable var);
}
