package org.palladiosimulator.commons.stoex.tests.api.impl.generic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.commons.stoex.api.impl.generic.GenericXtextToolProviderImpl;

import com.google.inject.Injector;

import tools.mdsd.junit5utils.annotations.PluginTestOnly;
import tools.mdsd.junit5utils.annotations.StandaloneTestOnly;

public class GenericXtextToolProviderImplTest {

    private static String EP_ID = "org.palladiosimulator.commons.stoex.tests.xtexttool_dummy";
    private static String EP_ATTR = "class";
    private Injector injectorMock;
    private GenericXtextToolProviderImpl<XtextToolDummy> subject;

    @BeforeEach
    public void setup() {
        injectorMock = mock(Injector.class);
        subject = new GenericXtextToolProviderImpl<XtextToolDummy>(() -> injectorMock, XtextToolDummy.class, EP_ID,
                EP_ATTR) {
        };
    }

    @Test
    @StandaloneTestOnly
    public void testStandalone() {
        XtextToolDummy expectedTool = new XtextToolDummyImpl();
        when(injectorMock.getInstance(XtextToolDummy.class)).thenReturn(expectedTool);

        assertEquals(expectedTool, subject.get());
    }

    @Test
    @PluginTestOnly
    @SuppressWarnings("unchecked")
    public void testRuntime() {
        XtextToolDummy actual = subject.get();

        assertTrue(actual instanceof XtextToolDummy);
        verify(injectorMock, never()).getInstance(any(Class.class));
    }

}
