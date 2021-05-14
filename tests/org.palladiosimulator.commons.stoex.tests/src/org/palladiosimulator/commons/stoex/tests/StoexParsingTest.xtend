/*
 * generated by Xtext 2.12.0
 */
package org.palladiosimulator.commons.stoex.tests

import com.google.inject.Inject
import de.uka.ipd.sdq.stoex.Expression
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static org.junit.jupiter.api.Assertions.*

@ExtendWith(InjectionExtension)
@InjectWith(StoexInjectorProvider)
class StoexParsingTest {
    @Inject
    ParseHelper<Expression> parseHelper

    @Inject extension ValidationTestHelper

    @Test
    def void parseAddition() {
        val result = parseHelper.parse('''1+1+1''')
        assertNoIssues(result)
    }

    @Test
    def void parseBool() {
        val result = parseHelper.parse('''true''')
        assertNoIssues(result)
    }

    @Test
    def void parseSimpleComparison() {
        val result = parseHelper.parse('''5>4''')
        assertNoIssues(result)
    }

    @Test
    def void parseIntPMF() {
        val result = parseHelper.parse('''IntPMF[(1;0.2)(2;0.4)(3;0.1)]''')
        assertNoIssues(result)
    }

    @Test
    def void parseFloat() {
        val result = parseHelper.parse('''10.8E4''')
        assertNoIssues(result)
    }

    @Test
    def void parseComparison() {
        val result = parseHelper.parse('''5+5*6 > 7*7 AND 6*6 < 7''')
        assertNoIssues(result)
    }

    @Test
    def void parseNotBool() {
        val result = parseHelper.parse('''NOT true''')
        assertNoIssues(result)
    }

    @Test
    def void parseVariableCharacterisation() {
        val result = parseHelper.parse('''a.b.NUMBER_OF_ELEMENTS''')
        assertNoIssues(result)
    }

    @Test
    def void parseExpression() {
        val result = parseHelper.parse('''2.67E+9*DoublePDF[(0.000445786;0.0)(0.000526678;0.10411217020161)]''')
        assertNoIssues(result)
    }

    @Test
    def void parseDoublePDF() {
        val result = parseHelper.parse('''DoublePDF[(1.0;1.0)]''')
        assertNoIssues(result)
    }

    @Test
    def void parseMax() {
        val result = parseHelper.parse('''Max ( 35374 * 10 , 60 * 196 * 2375646 + 60 * 196 * 13697006 )/ 100''')
        assertNoIssues(result)
    }

    @Test
    def void parseTooMuchOperators() {
        val model = parseHelper.parse('''+6***6''')
        val issue = validate(model)
        assertTrue(!issue.isEmpty())
    }

    @Test
    def void parseDoublePlus() {
        val model = parseHelper.parse('''2++3''')
        val issue = validate(model)
        assertTrue(!issue.isEmpty())
    }

    @Test
    def void parseWrongIntPMF() {
        val model = parseHelper.parse('''IntPMF[(1.0;2)(1;0.3)]''')
        val issue = validate(model)
        assertTrue(!issue.isEmpty())
    }

    @Test
    def void parseRandomChars() {
        val result = parseHelper.parse('''a$JFfuRKrp23r32#''')
        assertNull(result)
    }
    
    @Test
    def void parseVariable() {
        val result = parseHelper.parse('''file.TYPE''')
        assertNoIssues(result)
    }
    
    @Test
    def void parseReferenceWithKeyword() {
        val result = parseHelper.parse('''ordered.TYPE''')
        assertNull(result)
    }
    
    @Test
    def void parseShortVariable() {
        val result = parseHelper.parse('''s.TYPE''')
        assertNoIssues(result)
    }
    
    @Test
    def void parseDoublePMFWithIntegerValue() {
        val result = parseHelper.parse('''DoublePMF[(16850000000;0.5)(16950000000;0.5)]''')
        assertNoIssues(result)
    }
    
    @Test
    def void parseDoublePMFWithIntegerProbability() {
        val result = parseHelper.parse('''DoublePMF[(1;0.5)(2;0.5)(3;0)]''')
        assertNoIssues(result)
    }

}
