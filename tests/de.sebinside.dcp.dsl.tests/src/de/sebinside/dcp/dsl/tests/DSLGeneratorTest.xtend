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
				throw new UnsupportedOperationException("This method must never be used in the test.")
			}

			override getDfdId(String factId) {
				throw new UnsupportedOperationException("This method must never be used in the test.")
			}

			override getDfdPinId(String factId) {
				throw new UnsupportedOperationException("This method must never be used in the test.")
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
				throw new UnsupportedOperationException("This method must never be used in the test.")
			}

			override getPrologProgram() {
				throw new UnsupportedOperationException("This method must never be used in the test.")
			}

			override <T extends EObject> resolveDfdElement(String dfdId, Class<T> type) {
				throw new UnsupportedOperationException("This method must never be used in the test.")
			}

		}
	}

	@Test
	def void testInformationFlowLowHigh() {		
		runTest('''
			type Clearance : ConfidentialityRequirements
			type Classification : ConfidentialityRequirements
			constraint Test {
				data.property.Classification.High NEVER FLOWS node.property.Clearance.Low
			}
		''',
		"evaluation/hospital/DDC_Hospital.xmi",
		'''
			constraint_Test(ConstraintName, QueryType, N, PIN, S) :-
				ConstraintName = 'Test',
				constraint_Test_InputPin(QueryType, N, PIN, S).
			constraint_Test_InputPin(QueryType, N, PIN, S) :-
				QueryType = 'InputPin',
				inputPin(N, PIN),
				flowTree(N, PIN, S),
				nodeCharacteristic(N, 'ConfidentialityRequirements (_LNbeM1IoEeqxoa0IdF5JoA)', 'Low (_QlOpUFIoEeqxoa0IdF5JoA)'),
				characteristic(N, PIN, 'ConfidentialityRequirements (_LNbeM1IoEeqxoa0IdF5JoA)', 'High (_PtJx0FIoEeqxoa0IdF5JoA)', S).
		'''
		)
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
	def void testDACStatic() {
		runTest('''
			type Identity : Identity
			type ReadAccess : "Read Access"
			type WriteAccess : "Write Access"
			constraint ReadViolation {
				data.any NEVER FLOWS node.type.Actor & node.property.Identity.$IDENT
				FROM node.type.Store & node.property.ReadAccess.$RA{}
				WHERE !elementOf(IDENT, RA)
			}
			constraint WriteViolation {
				data.any NEVER FLOWS node.type.Store & node.property.WriteAccess.$WA{}
				FROM node.type.Actor & node.property.Identity.$IDENT
				WHERE !elementOf(IDENT, WA)
			}
		''',
		"evaluation/dac/dac_dd.xmi",
		'''
			constraint_ReadViolation(ConstraintName, QueryType, N, PIN, S, N_FROM, Var_IDENT, VarSet_RA) :-
				ConstraintName = 'ReadViolation',
				constraint_ReadViolation_InputPin(QueryType, N, PIN, S, N_FROM, Var_IDENT, VarSet_RA).
			constraint_ReadViolation_InputPin(QueryType, N, PIN, S, N_FROM, Var_IDENT, VarSet_RA) :-
				QueryType = 'InputPin',
				inputPin(N, PIN),
				flowTree(N, PIN, S),
				(
					actor(N),
					nodeCharacteristic(N, 'Identity (_o7_1k9VeEeqRbpVUMz5XAQ)', Var_IDENT)
				),
				(
					store(N_FROM),
					setof(R, nodeCharacteristic(N_FROM, 'Read Access (_rd9cA9VeEeqRbpVUMz5XAQ)', R), VarSet_RA),
					traversedNode(S, N_FROM)
				),
				\+ memberchk(Var_IDENT, VarSet_RA).
			constraint_WriteViolation(ConstraintName, QueryType, N, PIN, S, N_FROM, VarSet_WA, Var_IDENT) :-
				ConstraintName = 'WriteViolation',
				constraint_WriteViolation_InputPin(QueryType, N, PIN, S, N_FROM, VarSet_WA, Var_IDENT).
			constraint_WriteViolation_InputPin(QueryType, N, PIN, S, N_FROM, VarSet_WA, Var_IDENT) :-
				QueryType = 'InputPin',
				inputPin(N, PIN),
				flowTree(N, PIN, S),
				(
					store(N),
					setof(R, nodeCharacteristic(N, 'Write Access (_swJco9VeEeqRbpVUMz5XAQ)', R), VarSet_WA)
				),
				(
					actor(N_FROM),
					nodeCharacteristic(N_FROM, 'Identity (_o7_1k9VeEeqRbpVUMz5XAQ)', Var_IDENT),
					traversedNode(S, N_FROM)
				),
				\+ memberchk(Var_IDENT, VarSet_WA).
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
	def void testABAC() {
		runTest('''
			type CustomerLocation : CustomerLocation
			type EmployeeLocation : EmployeeLocation
			type CustomerStatus : CustomerStatus
			type EmployeeRole : EmployeeRole

			const ER_CLERK{} = EmployeeRole.[Clerk]
			const ER_MANAGER{} = EmployeeRole.[Manager]
			const CS_CELEBRITY{} = CustomerStatus.[Celebrity]
			const CS_REGULAR{} = CustomerStatus.[Regular]
			
			constraint Test {
				data.attribute.CustomerLocation.$CL{} &
				data.attribute.CustomerStatus.$CS{}
					NEVER FLOWS
				node.property.EmployeeLocation.$EL{} &
				node.property.EmployeeRole.$ER{}
					WHERE
				!(
					(
						subset(ER, ER_MANAGER) & subset(ER_MANAGER, ER)
					) |	(
						subset(ER, ER_CLERK) & subset(ER_CLERK, ER) &
						subset(CS, CS_REGULAR) & subset(CS_REGULAR, CS) &
						subset(EL, CL) & subset(CL, EL)
					)
				)
			}
		''',
		"evaluation/abac/abac_dd.xmi",
		'''
			constraint_Test(ConstraintName, QueryType, N, PIN, S, VarSet_EL, VarSet_ER, VarSet_CL, VarSet_CS) :-
				ConstraintName = 'Test',
				constraint_Test_InputPin(QueryType, N, PIN, S, VarSet_EL, VarSet_ER, VarSet_CL, VarSet_CS).
			constraint_Test_InputPin(QueryType, N, PIN, S, VarSet_EL, VarSet_ER, VarSet_CL, VarSet_CS) :-
				QueryType = 'InputPin',
				VarSet_ER_CLERK = ['Clerk (_c_En8OJAEeqO9NqdRSqKUA)'],
				VarSet_ER_MANAGER = ['Manager (_dvk30OJAEeqO9NqdRSqKUA)'],
				VarSet_CS_CELEBRITY = ['Celebrity (_hCxt8OJAEeqO9NqdRSqKUA)'],
				VarSet_CS_REGULAR = ['Regular (_gYqZ8OJAEeqO9NqdRSqKUA)'],
				inputPin(N, PIN),
				flowTree(N, PIN, S),
				(
					setof(R, nodeCharacteristic(N, 'EmployeeLocation (_j_v1Y-JAEeqO9NqdRSqKUA)', R), VarSet_EL),
					setof(R, nodeCharacteristic(N, 'EmployeeRole (_nNduk-JAEeqO9NqdRSqKUA)', R), VarSet_ER)
				),
				(
					setof(V, characteristic(N, PIN, 'CustomerLocation (_h6k4o-JAEeqO9NqdRSqKUA)', V, S), VarSet_CL),
					setof(V, characteristic(N, PIN, 'CustomerStatus (_lmMOw-JAEeqO9NqdRSqKUA)', V, S), VarSet_CS)
				),
				\+ (
					subset(VarSet_ER, VarSet_ER_MANAGER),
					subset(VarSet_ER_MANAGER, VarSet_ER);
					subset(VarSet_ER, VarSet_ER_CLERK),
					subset(VarSet_ER_CLERK, VarSet_ER),
					subset(VarSet_CS, VarSet_CS_REGULAR),
					subset(VarSet_CS_REGULAR, VarSet_CS),
					subset(VarSet_EL, VarSet_CL),
					subset(VarSet_CL, VarSet_EL)
				).
		'''
		)
	}
	
	@Test
	def void testComplementOperator() {		
		runTest('''
			type AccessPermissions : AccessPermissions
			type Roles : Roles
			constraint Test {
				data.any NEVER FLOWS node.property.Roles.$AR{}
				WHERE isEmpty(complement[Roles,AccessPermissions](AR))
			}
		''',
		"evaluation/travelplanner/DDC_TravelPlanner_AccessControl.xmi",
		'''
			constraint_Test(ConstraintName, QueryType, N, PIN, S, VarSet_AR) :-
				ConstraintName = 'Test',
				constraint_Test_InputPin(QueryType, N, PIN, S, VarSet_AR).
			constraint_Test_InputPin(QueryType, N, PIN, S, VarSet_AR) :-
				QueryType = 'InputPin',
				inputPin(N, PIN),
				flowTree(N, PIN, S),
				setof(R, nodeCharacteristic(N, 'Roles (_JvuuQ9vqEeqNdo_V4bA-xw)', R), VarSet_AR),
				(
					complement(['Roles (_JvuuQ9vqEeqNdo_V4bA-xw)', 'AccessPermissions (_k9jB49vTEeqNdo_V4bA-xw)'], VarSet_AR, Temp_0),
					length(Temp_0, 0)
				).
		'''
		)
	}
	
	@Test
	def void testGlobalSetConstants() {
		runTest('''
			type AccessPermissions : AccessPermissions
			type Roles : Roles
			const ALL_LITERALS{} = Roles.*
			const EMPTY_LITERALS{} = []
			const SOME_LITERALS{} = Roles.[User, Airline]
			constraint Test {
				data.any NEVER FLOWS node.property.Roles.User
			}
		''',
		"evaluation/travelplanner/DDC_TravelPlanner_AccessControl.xmi",
		'''
			constraint_Test(ConstraintName, QueryType, N, PIN, S) :-
				ConstraintName = 'Test',
				constraint_Test_InputPin(QueryType, N, PIN, S).
			constraint_Test_InputPin(QueryType, N, PIN, S) :-
				QueryType = 'InputPin',
				VarSet_ALL_LITERALS = ['Agency (_qiLIENvTEeqNdo_V4bA-xw)', 'Airline (_sJIe0NvTEeqNdo_V4bA-xw)' , 'User (_tkFZ4NvTEeqNdo_V4bA-xw)'],
				VarSet_EMPTY_LITERALS = [],
				VarSet_SOME_LITERALS = ['User (_tkFZ4NvTEeqNdo_V4bA-xw)', 'Airline (_sJIe0NvTEeqNdo_V4bA-xw)'],
				inputPin(N, PIN),
				flowTree(N, PIN, S),
				nodeCharacteristic(N, 'Roles (_JvuuQ9vqEeqNdo_V4bA-xw)', 'User (_tkFZ4NvTEeqNdo_V4bA-xw)').
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
