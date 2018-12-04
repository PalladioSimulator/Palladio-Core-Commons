package org.palladiosimulator.commons.stoex.tests.formatter

import org.eclipse.xtext.serializer.ISerializer
import org.junit.Test
import com.google.inject.Inject
import de.uka.ipd.sdq.stoex.Expression
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.resource.SaveOptions
import static org.junit.Assert.*
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.XtextRunner
import org.palladiosimulator.commons.stoex.tests.StoexInjectorProvider
import org.eclipse.xtext.testing.InjectWith

@RunWith(XtextRunner)
@InjectWith(StoexInjectorProvider)
class FormatterTest {

	@Inject extension ISerializer
	@Inject extension ParseHelper<Expression>

	@Test
	def simpleTest() {
		val addition = '''1 +    1'''
		assertEquals(addition.parse.serialize(SaveOptions.newBuilder.format.options), "1 + 1")
	}

}
