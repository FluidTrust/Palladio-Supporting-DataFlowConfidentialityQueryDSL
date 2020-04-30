package de.sebinside.dcp.dsl.resultmapping

import de.sebinside.dcp.dsl.dSL.Model
import de.sebinside.dcp.dsl.resultmapping.serialize.ResultMappingSerializer
import de.sebinside.dcp.dsl.resultmapping.serialize.SerializerFactory
import de.sebinside.dcp.dsl.tests.DSLInjectorProvider
import java.io.File
import java.io.FileInputStream
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption
import javax.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.^extension.ExtendWith
import org.prolog4j.IProverFactory
import org.prolog4j.Prover
import org.prolog4j.Solution
import org.prolog4j.tuprolog.TuPrologProverFactory

@ExtendWith(InjectionExtension)
@InjectWith(DSLInjectorProvider)
class ResultMappingBase {

	@Inject
	ParseHelper<Model> parseHelper

	static IProverFactory proverFactory;
	protected Prover prover;
	protected ResultMappingSerializer serializer;

	@BeforeAll
	static def void init() {
		proverFactory = new TuPrologProverFactory()
	}

	@BeforeEach
	def void setup() {
		prover = proverFactory.createProver();
		serializer = SerializerFactory.createPlainTextSerializer
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

	protected def saveResult(String caseName, String result) {
		val resultFilePath = createResultMappingPath('''_results/«caseName».txt''')
		Files.writeString(Paths.get(resultFilePath), result, StandardOpenOption.TRUNCATE_EXISTING)
	}

	protected def Model loadDSLModel(String caseName) {
		val dslPath = '''«caseName»/dsl/input.DCPDSL'''

		val resourceSet = new ResourceSetImpl
		val inputStream = new FileInputStream(new File(createResultMappingPath(dslPath)))

		parseHelper.parse(inputStream, createPlatformURI(createResultMappingPath(dslPath)), null, resourceSet)
	}

	private def readResultMappingFile(String relativePath) {
		new String(Files.readAllBytes(Paths.get(createResultMappingPath(relativePath))));
	}

	private static def String createResultMappingPath(String relativePath) {
		'''resultmapping/«relativePath»'''
	}

	private static def createPlatformURI(String relativePath) {
		URI.createPlatformPluginURI("/de.sebinside.dcp.dsl.tests/" + relativePath, false)
	}

}
