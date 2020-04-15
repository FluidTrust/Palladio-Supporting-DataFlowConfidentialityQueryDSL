package de.sebinside.dcp.dsl.resultmapping

import de.sebinside.dcp.dsl.tests.DSLInjectorProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.prolog4j.IProverFactory
import org.prolog4j.Prover
import org.prolog4j.tuprolog.TuPrologProverFactory
import javax.inject.Inject
import org.eclipse.xtext.testing.util.ParseHelper
import de.sebinside.dcp.dsl.dSL.Model

@ExtendWith(InjectionExtension)
@InjectWith(DSLInjectorProvider)
class ResultMapping {
	
	@Inject
	ParseHelper<Model> parseHelper
	
	static IProverFactory proverFactory;
	protected Prover prover;
	
	@BeforeAll
	static def void init() {
		proverFactory = new TuPrologProverFactory()
		
	}

	@BeforeEach
	def void setup() {
		prover = proverFactory.createProver();
	}
	
	@Test
	def void fullTest() {
		prover.loadTheory("dog(fido). dog(frodo).")
		var queryString = "dog(X)."
		var query = prover.query(queryString)
		var solution = query.solve()
		solution.forEach[s|
			println(s)
		]
	}
	
	@Test
	def void parseTest() {
		parseHelper.parse("")
	}
	
}