package org.palladiosimulator.commons.stoex.tests.api.impl;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.eclipse.xtext.parser.IParser;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.commons.stoex.api.impl.PlainXtextStoExInjectorProvider;

import com.google.inject.Injector;

public class PlainXtextStoExInjectorProviderTest {

    @Test
    public void testGetInjector() {
        Injector injector = PlainXtextStoExInjectorProvider.getInstance().get();
        assertNotNull(injector);
        assertNotNull(injector.getInstance(IParser.class));
    }
    
}
