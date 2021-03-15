package org.palladiosimulator.commons.stoex.tests.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.palladiosimulator.commons.stoex.StoexStandaloneSetup;
import org.palladiosimulator.commons.stoex.services.StoexContext;
import org.palladiosimulator.commons.stoex.services.StoexContextProvider;
import org.palladiosimulator.commons.stoex.services.StoexContextProviderImpl;

import tools.mdsd.library.standalone.initialization.StandaloneInitializationException;
import tools.mdsd.library.standalone.initialization.StandaloneInitializerBuilder;

public class StoexContextProviderImplTest {

    protected StoexContextProviderImpl subject;
    protected ResourceSetImpl rs;
    protected Resource r;
    protected StoexContextProviderAdapterMock adapter;
    protected StoexContext context;

    @BeforeClass
    public static void init() throws StandaloneInitializationException {
        StandaloneInitializerBuilder.builder()
            .addCustomTask(StoexStandaloneSetup::doSetup)
            .build()
            .init();
    }

    @Before
    public void setup() {
        rs = new ResourceSetImpl();
        r = rs.createResource(URI.createURI("virtual:/test/model.stoex"));
        subject = new StoexContextProviderImpl();
        adapter = mock(StoexContextProviderAdapterMock.class);
        context = mock(StoexContext.class);
        when(adapter.isAdapterForType(StoexContextProvider.class)).thenReturn(true);
        when(adapter.getContext(r)).thenReturn(context);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullResource() {
        subject.getContext(null);
    }

    @Test
    public void testNoAdapter() {
        StoexContext context = subject.getContext(r);
        assertTrue(context.getContainer()
            .isEmpty());
        assertTrue(context.getExpectedType()
            .isEmpty());
    }

    @Test
    public void testValidAdapter() {
        r.eAdapters()
            .add(adapter);
        StoexContext actualContext = subject.getContext(r);
        assertEquals(context, actualContext);
    }

    @Test
    public void testValidAdapterWithDifferentResource() {
        r.eAdapters()
            .add(adapter);
        Resource r2 = rs.createResource(URI.createURI("dummy.stoex"));
        StoexContext actualContext = subject.getContext(r2);
        assertNotEquals(context, actualContext);
    }
}
