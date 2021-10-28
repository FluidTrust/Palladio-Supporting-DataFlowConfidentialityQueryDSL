package de.sebinside.dcp.dsl.tests

import com.google.inject.Inject
import com.google.inject.Provider
import de.sebinside.dcp.dsl.generator.DSLGenerator
import java.util.Optional
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.generator.GeneratorContext
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.resource.FileExtensionProvider
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.util.StringInputStream
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.palladiosimulator.dataflow.confidentiality.transformation.prolog.DFD2PrologTransformationTrace
import org.palladiosimulator.dataflow.confidentiality.transformation.workflow.tests.util.StandaloneUtil
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Entity
import org.palladiosimulator.dataflow.diagram.characterized.DataFlowDiagramCharacterized.Behaving
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataType
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.Pin
import tools.mdsd.library.standalone.initialization.StandaloneInitializerBuilder

import static org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled

@ExtendWith(InjectionExtension)
@InjectWith(DSLInjectorProvider)
class DSLGeneratorTest {

	@Inject
	Provider<XtextResourceSet> resourceSetProvider

	@Inject
	FileExtensionProvider fileExtensionProvider

	DSLGenerator subject

	@BeforeAll
	static def void init() {
		StandaloneInitializerBuilder.builder.registerProjectURI(StandaloneUtil,
			"org.palladiosimulator.dataflow.confidentiality.transformation.workflow.tests").build.init
	}

	@BeforeEach
	def void setup() {
		subject = new DSLGenerator()
		subject.DFD2PrologTrace = new DFD2PrologTransformationTrace() {

			override getDfd() {
				throw new UnsupportedOperationException("TODO: auto-generated method stub")
			}

			override getDfdId(String factId) {
				throw new UnsupportedOperationException("TODO: auto-generated method stub")
			}

			override getDfdPinId(String factId) {
				throw new UnsupportedOperationException("TODO: auto-generated method stub")
			}

			override getFactId(Entity entity) {
				return Optional.of('''«entity.name» («entity.id»)''')
			}

			override getFactId(
				org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.Entity entity) {
				return Optional.of('''«entity.name» («entity.id»)''')
			}

			override getFactId(DataType entity) {
				return Optional.of('''«entity.name» («entity.id»)''')
			}

			override getFactId(Behaving entity, Pin pin) {
				throw new UnsupportedOperationException("TODO: auto-generated method stub")
			}

			override getPrologProgram() {
				throw new UnsupportedOperationException("TODO: auto-generated method stub")
			}

			override <T extends EObject> resolveDfdElement(String dfdId, Class<T> type) {
				throw new UnsupportedOperationException("TODO: auto-generated method stub")
			}

		}
	}

	@Test
	def void testInformationFlowLinearOrderedLattice() {		
		runTest('''
			type SecurityLevel : SecurityLevel
			type Clearance : Clearance
			constraint Test {
				data.attribute.SecurityLevel.$CLASS NEVER FLOWS node.property.Clearance.$CLEAR
				WHERE index(CLASS) > index(CLEAR)
			}
		''',
		"evaluation/travelplanner/DDC_TravelPlanner_InformationFlow.xmi",
		'''
			constraint_Test(ConstraintName, QueryType, N, PIN, S, Var_CLEAR, Var_CLASS) :-
				ConstraintName = 'Test',
				constraint_Test_InputPin(QueryType, N, PIN, S, Var_CLEAR, Var_CLASS).
			constraint_Test_InputPin(QueryType, N, PIN, S, Var_CLEAR, Var_CLASS) :-
				QueryType = 'InputPin',
				inputPin(N, PIN),
				flowTree(N, PIN, S),
				nodeCharacteristic(N, 'Clearance (_JvuuQ9vqEeqNdo_V4bA-xw)', Var_CLEAR),
				characteristic(N, PIN, 'SecurityLevel (_k9jB49vTEeqNdo_V4bA-xw)', Var_CLASS, S),
				(
					characteristicTypeValue('SecurityLevel (_k9jB49vTEeqNdo_V4bA-xw)', Var_CLASS, Temp_CLASS_INDEX),
					characteristicTypeValue('Clearance (_JvuuQ9vqEeqNdo_V4bA-xw)', Var_CLEAR, Temp_CLEAR_INDEX),
					Temp_CLASS_INDEX > Temp_CLEAR_INDEX
				).
		'''
		)
	}
	
	@Test
	def void testMACNeedToKnow() {
		runTest('''
			type Compartment : Compartment
			type NeedToKnow : "Need to Know"
			constraint ActorTest {
				data.attribute.Compartment.$COMP{} NEVER FLOWS node.type.Actor & node.property.NeedToKnow.$NTK{}
				WHERE !isEmpty(subtract(COMP, NTK))
			}
			constraint ActorProcessTest {
				data.attribute.Compartment.$COMP{} NEVER FLOWS node.type.ActorProcess & node.property.NeedToKnow.$NTK{}
				WHERE !isEmpty(subtract(COMP, NTK))
			}
		''',
		"evaluation/mac_needtoknow/mac_dd.xmi",
		'''
			constraint_ActorTest(ConstraintName, QueryType, N, PIN, S, VarSet_NTK, VarSet_COMP) :-
				ConstraintName = 'ActorTest',
				constraint_ActorTest_InputPin(QueryType, N, PIN, S, VarSet_NTK, VarSet_COMP).
			constraint_ActorTest_InputPin(QueryType, N, PIN, S, VarSet_NTK, VarSet_COMP) :-
				QueryType = 'InputPin',
				inputPin(N, PIN),
				flowTree(N, PIN, S),
				(
					actor(N),
					setof(R, nodeCharacteristic(N, 'Need to Know (_hedQgzANEeyxUoEkMpyhIg)', R), VarSet_NTK)
				),
				setof(V, characteristic(N, PIN, 'Compartment (_IgunozANEeyxUoEkMpyhIg)', V, S), VarSet_COMP),
				(
					subtract(VarSet_COMP, VarSet_NTK, Temp_0),
					\+ length(Temp_0, 0)
				).
			constraint_ActorProcessTest(ConstraintName, QueryType, N, PIN, S, VarSet_NTK, VarSet_COMP) :-
				ConstraintName = 'ActorProcessTest',
				constraint_ActorProcessTest_InputPin(QueryType, N, PIN, S, VarSet_NTK, VarSet_COMP).
			constraint_ActorProcessTest_InputPin(QueryType, N, PIN, S, VarSet_NTK, VarSet_COMP) :-
				QueryType = 'InputPin',
				inputPin(N, PIN),
				flowTree(N, PIN, S),
				(
					actorprocess(N, _),
					setof(R, nodeCharacteristic(N, 'Need to Know (_hedQgzANEeyxUoEkMpyhIg)', R), VarSet_NTK)
				),
				setof(V, characteristic(N, PIN, 'Compartment (_IgunozANEeyxUoEkMpyhIg)', V, S), VarSet_COMP),
				(
					subtract(VarSet_COMP, VarSet_NTK, Temp_0),
					\+ length(Temp_0, 0)
				).
		'''
		)
	}
	
	@Test
	def void testRBAC() {		
		runTest('''
			type AccessPermissions : AccessPermissions
			type Roles : Roles
			constraint Test {
				data.attribute.AccessPermissions.$PR{} NEVER FLOWS node.property.Roles.$AR{}
				WHERE isEmpty(intersection(PR, AR))
			}
		''',
		"evaluation/travelplanner/DDC_TravelPlanner_AccessControl.xmi",
		'''
			constraint_Test(ConstraintName, QueryType, N, PIN, S, VarSet_AR, VarSet_PR) :-
				ConstraintName = 'Test',
				constraint_Test_InputPin(QueryType, N, PIN, S, VarSet_AR, VarSet_PR).
			constraint_Test_InputPin(QueryType, N, PIN, S, VarSet_AR, VarSet_PR) :-
				QueryType = 'InputPin',
				inputPin(N, PIN),
				flowTree(N, PIN, S),
				setof(R, nodeCharacteristic(N, 'Roles (_JvuuQ9vqEeqNdo_V4bA-xw)', R), VarSet_AR),
				setof(V, characteristic(N, PIN, 'AccessPermissions (_k9jB49vTEeqNdo_V4bA-xw)', V, S), VarSet_PR),
				(
					intersection(VarSet_PR, VarSet_AR, Temp_0),
					length(Temp_0, 0)
				).
		'''
		)
	}
	
	@Test
	@Disabled
	def void testABAC() {
		runTest('''
			type CustomerLocation : CustomerLocation
			type EmployeeLocation : EmployeeLocation
			type CustomerStatus : CustomerStatus
			type EmployeeRole : EmployeeRole
			
			class Clerk {
				EmployeeRole.Clerk
			}
			
			class Regular {
				CustomerStatus.Regular
			}
			
			class Celebrity {
				CustomerStatus.Celebrity
			}
			
			constraint NoClerkAndCelebrity {
				data.class.Celebrity NEVER FLOWS node.class.Clerk
			}
		''',
		"evaluation/abac/abac_dd.xmi",
		'''
			foo
		'''
		)
	}
	
	protected def runTest(String query, String dictionaryPath, String expected) {
		val actual = runGenerator(dictionaryPath, query)
		assertEquals(expected, actual)
	}

	protected def runGenerator(String dictionaryPath, CharSequence input) {
		val baseURI = URI.createPlatformPluginURI(
			"/org.palladiosimulator.dataflow.confidentiality.transformation.workflow.tests/models/", false);
		val relativeDictionaryURI = URI.createURI(dictionaryPath);
		val dictionaryURI = relativeDictionaryURI.resolve(baseURI)

		val rs = resourceSetProvider.get
		val modelURI = dictionaryURI.trimSegments(1).appendSegment("query." +
			fileExtensionProvider.primaryFileExtension)
		val modelResource = rs.createResource(modelURI)
		var fullInput = '''
			import "«dictionaryURI.lastSegment»"
			«input»
		'''
		try (var is = new StringInputStream(fullInput)) {
			modelResource.load(is, #{})
		}
		EcoreUtil.resolveAll(rs)
		val model = modelResource.contents.iterator.next

		val fsa = new InMemoryFileSystemAccess()
		val context = new GeneratorContext
		subject.doGenerate(model.eResource, fsa, context)

		fsa.allFiles.values.iterator.next.toString
	}

}
