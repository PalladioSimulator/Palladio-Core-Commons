package org.palladiosimulator.commons.stoex.tests.formatter

import com.google.inject.Inject
import de.uka.ipd.sdq.stoex.Expression
import org.eclipse.xtext.resource.SaveOptions
import org.eclipse.xtext.serializer.ISerializer
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.palladiosimulator.commons.stoex.tests.StoexInjectorProvider

import static org.junit.Assert.*

@RunWith(XtextRunner)
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
		val intPMF = '''IntPMF  [(1;0.2)  (2;0.4)  (3;0.1)  ]'''
		assertEquals("IntPMF[(1;0.2)(2;0.4)(3;0.1)]", intPMF.parse.serialize(SaveOptions.newBuilder.format.options))
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

}
