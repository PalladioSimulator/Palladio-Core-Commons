package org.palladiosimulator.commons.stoex.api.impl.generic;

import javax.inject.Provider;

/**
 * Base interface to get an Xtext tool like parsers or serialisers.
 * 
 * @param <T>
 *            The type of the tool to get.
 */
public interface GenericXtextToolProvider<T> extends Provider<T> {

}
