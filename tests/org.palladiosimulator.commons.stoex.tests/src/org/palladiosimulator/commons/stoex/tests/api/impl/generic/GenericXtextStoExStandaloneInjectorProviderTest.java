package org.palladiosimulator.commons.stoex.tests.api.impl.generic;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.eclipse.xtext.ISetup;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.commons.stoex.api.impl.generic.GenericXtextStoExStandaloneInjectorProvider;

import com.google.inject.Injector;

public class GenericXtextStoExStandaloneInjectorProviderTest {

    private GenericXtextStoExStandaloneInjectorProvider subject;
    private Injector injectorMock;

    @BeforeEach
    public void setup() {
        ISetup setupMock = mock(ISetup.class);
        injectorMock = mock(Injector.class);
        when(setupMock.createInjectorAndDoEMFRegistration()).thenReturn(injectorMock);
        subject = new GenericXtextStoExStandaloneInjectorProvider() {    
            private int cnt = -1;
            @Override
            protected ISetup getStoexSetup() {
                cnt++;
                if (cnt < 1) {
                    return setupMock;                    
                }
                ISetup newMock = mock(ISetup.class);
                when(newMock.createInjectorAndDoEMFRegistration()).thenThrow(new IllegalStateException());
                return newMock;
            }
        };
    }
    
    @Test
    public void testSingleton() {
        assertSame(injectorMock, subject.get());
        // provider should act like a singleton, so the instance should always be the same
        assertSame(injectorMock, subject.get());
    }
    
}
