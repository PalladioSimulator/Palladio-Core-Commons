package org.palladiosimulator.commons.stoex.tests.formatter

import com.google.inject.Inject
import de.uka.ipd.sdq.stoex.Expression
import org.eclipse.xtext.resource.SaveOptions
import org.eclipse.xtext.serializer.ISerializer
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.palladiosimulator.commons.stoex.tests.StoexInjectorProvider

import static org.junit.jupiter.api.Assertions.*

@ExtendWith(InjectionExtension)
@InjectWith(StoexInjectorProvider)
class FormatterTest {

	@Inject extension ISerializer
	@Inject extension ParseHelper<Expression>

	@Test
	def testBooleanCompareExpression() {
		val boolExpr = '''1 AND    true'''
		assertEquals("1 AND true", boolExpr.parse.serialize(SaveOptions.newBuilder.format.options))
	}
	
	@Test
	def testAddition() {
		val addition = '''1   +  1  '''
		assertEquals("1 + 1", addition.parse.serialize(SaveOptions.newBuilder.format.options))
	}
	
	@Test
	def testNegativeExpression() {
		val negExpr = ''' -    3'''
		assertEquals("- 3", negExpr.parse.serialize(SaveOptions.newBuilder.format.options))
	}
	
	@Test
	def testNotExpression() {
		val notExpr = '''NOT   5 '''
		assertEquals("NOT 5", notExpr.parse.serialize(SaveOptions.newBuilder.format.options))
	}
	
	@Test
	def testIntPMF() {
		val intPMF = '''IntPMF  [ ( 1 ; 0.2 )  ( 2 ; 0.4 )  ( 3 ; 0.1)  ]'''
		assertEquals("IntPMF[(1;0.2)(2;0.4)(3;0.1)]", intPMF.parse.serialize(SaveOptions.newBuilder.format.options))
	}
	
	@Test
	def testDoublePMF() {
	    val doublePMF = '''DoublePMF  [ ( 1.1 ; 0.2 )   ( 2.2 ; 0.4 )   ( 3.3 ; 0.1)  ]'''
        assertEquals("DoublePMF[(1.1;0.2)(2.2;0.4)(3.3;0.1)]", doublePMF.parse.serialize(SaveOptions.newBuilder.format.options))
	}
	
    @Test
    def testEnumPMF() {
        val enumPMF = '''EnumPMF ( ordered ) [ ( "a" ; 0.2 )   ( "b" ; 0.4 )   ( "c" ; 0.1)  ]'''
        assertEquals("EnumPMF(ordered)[(\"a\";0.2)(\"b\";0.4)(\"c\";0.1)]", enumPMF.parse.serialize(SaveOptions.newBuilder.format.options))
    }
	
    @Test
    def testBoolPMF() {
        val enumPMF = '''BoolPMF ( ordered ) [ ( true ; 0.2 )   ( false ; 0.4 )   ( true ; 0.1)  ]'''
        assertEquals("BoolPMF(ordered)[(true;0.2)(false;0.4)(true;0.1)]", enumPMF.parse.serialize(SaveOptions.newBuilder.format.options))
    }
	
	@Test
	def testPower() {
		val power = '''2^    4 '''
		assertEquals("2 ^ 4", power.parse.serialize(SaveOptions.newBuilder.format.options))
	}
	
	@Test
	def testPower2() {
		val power = '''(2+2 )^    4 '''
		assertEquals("(2 + 2) ^ 4", power.parse.serialize(SaveOptions.newBuilder.format.options))
	}
	
	@Test
	def testMult() {
		val mult = '''1*1'''
		assertEquals("1 * 1", mult.parse.serialize(SaveOptions.newBuilder.format.options))
	}
	
	@Test
	def testAddMult() {
		val mult = '''1*1+3'''
		assertEquals("1 * 1 + 3", mult.parse.serialize(SaveOptions.newBuilder.format.options))
	}
	
	@Test
	def testComparison() {
		val cmp = '''5+5*6 > 7*7 AND 6*6 < 7'''
		assertEquals("5 + 5 * 6 > 7 * 7 AND 6 * 6 < 7", cmp.parse.serialize(SaveOptions.newBuilder.format.options))
	}
	
	@Test
	def testNotBool() {
		val bool = '''  NOT     true '''
		assertEquals("NOT true", bool.parse.serialize(SaveOptions.newBuilder.format.options))
	}
	
	@Test
	def testVariableCharacterisation() {
		val varChar = '''a . b.NUMBER_OF_ELEMENTS'''
		assertEquals("a.b.NUMBER_OF_ELEMENTS", varChar.parse.serialize(SaveOptions.newBuilder.format.options))
	}
	
	@Test
	def testMax() {
		val mult = '''Max (35374 *10 , 60 * 196 * 2375646 + 60 * 196 * 13697006 ) /loopSize.VALUE'''
		assertEquals("Max (35374 * 10 , 60 * 196 * 2375646 + 60 * 196 * 13697006) / loopSize.VALUE", mult.parse.serialize(SaveOptions.newBuilder.format.options))
	}

	@Test
	def testExpression() {
		val exp = '''2.67E+9*DoublePDF[(0.000445786;0.0)(0.000526678;0.10411217020161)]'''
		assertEquals("2.67E+9 * DoublePDF[(0.000445786;0.0)(0.000526678;0.10411217020161)]", exp.parse.serialize(SaveOptions.newBuilder.format.options))
	}
	
	@Test
	def testIfElse() {
	    val ifelse = '''true?1:2'''
	    assertEquals("true ? 1 : 2", ifelse.parse.serialize(SaveOptions.newBuilder.format.options));
	}

	@Test
	def testNamespaceReference() {
	    val reference = '''a . b . c'''
	    assertEquals("a.b.c", reference.parse.serialize(SaveOptions.newBuilder.format.options));
	}

}
