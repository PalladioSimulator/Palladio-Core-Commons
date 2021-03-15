package org.palladiosimulator.commons.stoex.tests.validation;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.palladiosimulator.commons.stoex.services.StoexContext;
import org.palladiosimulator.commons.stoex.services.StoexContextProvider;
import org.palladiosimulator.commons.stoex.tests.StoexInjectorProvider;
import org.palladiosimulator.commons.stoex.tests.services.StoexContextProviderAdapterMock;

import com.google.inject.Inject;

import de.uka.ipd.sdq.stoex.Expression;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.stoex.analyser.visitors.TypeEnum;

@RunWith(XtextRunner.class)
@InjectWith(StoexInjectorProvider.class)
public class StoexValidationTest {

    @Inject
    private ParseHelper<Expression> parseHelper;

    @Inject
    private ValidationTestHelper validationTestHelper;

    @Test
    public void testMatchingTypes() throws Exception {
        Expression expr = parseHelper.parse("true");
        setExpectedType(expr, TypeEnum.BOOL);
        validationTestHelper.assertNoIssues(expr);
    }

    @Test
    public void testNotMatchingTypes() throws Exception {
        Expression expr = parseHelper.parse("true");
        setExpectedType(expr, TypeEnum.INT);
        validationTestHelper.assertWarning(expr, StoexPackage.Literals.BOOL_LITERAL, null,
                "Expected Type and Actual Type mismatch.", "Inferred Type: BOOL, Expected Type: INT");
    }

    @Test
    public void testValidNestedType() throws Exception {
        Expression expr = parseHelper.parse("NOT(true)");
        validationTestHelper.assertNoIssues(expr);
    }

    @Test
    public void testInvalidNestedType() throws Exception {
        Expression expr = parseHelper.parse("NOT(1)");
        validationTestHelper.assertWarning(expr, StoexPackage.Literals.NOT_EXPRESSION, null,
                "Expected Type and Actual Type mismatch.", "Inferred Type: INT, Expected Type: BOOL");
    }

    protected void setExpectedType(Expression expr, TypeEnum expectedType) {
        StoexContextProviderAdapterMock adapter = mock(StoexContextProviderAdapterMock.class);
        when(adapter.isAdapterForType(StoexContextProvider.class)).thenReturn(true);
        StoexContext context = mock(StoexContext.class);
        when(adapter.getContext(any(Resource.class))).thenReturn(context);
        when(context.getExpectedType()).thenReturn(Optional.ofNullable(expectedType));
        expr.eResource()
            .eAdapters()
            .add(adapter);
    }

}
