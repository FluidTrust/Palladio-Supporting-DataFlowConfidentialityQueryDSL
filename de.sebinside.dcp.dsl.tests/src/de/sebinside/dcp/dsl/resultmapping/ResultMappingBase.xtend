package de.sebinside.dcp.dsl.resultmapping

import de.sebinside.dcp.dsl.tests.DSLInjectorProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.^extension.ExtendWith
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.prolog4j.IProverFactory
import org.prolog4j.Prover
import org.prolog4j.tuprolog.TuPrologProverFactory
import javax.inject.Inject
import org.eclipse.xtext.testing.util.ParseHelper
import de.sebinside.dcp.dsl.dSL.Model
import java.nio.file.Files
import java.nio.file.Paths
import org.prolog4j.Solution

@ExtendWith(InjectionExtension)
@InjectWith(DSLInjectorProvider)
class ResultMappingBase {

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

	protected def Solution<Object> createSolution(String caseName, String query) {
		val theory = loadCombinedPrologTheory(caseName);
		prover.loadTheory(theory);
		prover.query(query).solve();
	}

	private def String loadCombinedPrologTheory(String caseName) {
		val model = readResultMappingFile('''«caseName»/model.pl''')
		val constraint = readResultMappingFile('''«caseName»/constraint.pl''')
		model + "\n" + constraint
	}

	protected def Model loadDSLModel(String caseName) {
		val dsl = readResultMappingFile('''«caseName»/dsl/input.DCPDSL''')
		parseHelper.parse(dsl)
	}

	private def readResultMappingFile(String relativePath) {
		new String(Files.readAllBytes(Paths.get('''resultmapping/«relativePath»''')));
	}

}
