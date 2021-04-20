package de.sebinside.dcp.dsl.resultmapping.generate

import de.sebinside.dcp.dsl.dSL.CharacteristicClass
import de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector
import de.sebinside.dcp.dsl.dSL.Constraint
import de.sebinside.dcp.dsl.dSL.Model
import de.sebinside.dcp.dsl.generator.GlobalConstants
import de.sebinside.dcp.dsl.generator.crossplatform.Converter
import de.sebinside.dcp.dsl.generator.crossplatform.ConverterFactory
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.prolog4j.Solution
import org.prolog4j.SolutionIterator

import static de.sebinside.dcp.dsl.resultmapping.ResultMappingUtils.*
import de.sebinside.dcp.dsl.dSL.CharacteristicVariableType

class ResultMapping {

	Model model = null
	Solution<Object> solution = null

	@Accessors(PUBLIC_GETTER, PRIVATE_SETTER) List<EvaluatedConstraint> evaluatedConstraints = null
	@Accessors(PUBLIC_GETTER, PRIVATE_SETTER) List<CharacteristicClass> characteristicClasses = null

	new(Model model, Solution<Object> solution) {
		this.model = model
		this.solution = solution

		generateMapping()
	}

	def Converter getTargetModelCompliantConverter() {
		switch (model.targetModelType.type) {
			case OPERATION_MODEL:
				ConverterFactory.createOperationModelConverter
//			case DATA_CENTRIC_PALLADIO:
//				ConverterFactory.createPalladioConverter(model.targetModelType.usageModel,
//					model.targetModelType.allocationModel, model.targetModelType.typeContainer)
			default:
				throw new RuntimeException("Unsupported target model type.")
		}
	}

	private def generateMapping() {
		this.evaluatedConstraints = new ArrayList<EvaluatedConstraint>
		this.characteristicClasses = new ArrayList<CharacteristicClass>

		// Start by iterating over model elements to retrieve constraint details, later needed for the mapping
		for (clazz : model.elements.filter(CharacteristicClass)) {
			this.characteristicClasses.add(clazz)
		}
		for (constraint : model.elements.filter(Constraint)) {
			this.evaluatedConstraints.add(new EvaluatedConstraint(constraint))
		}

		// Start processing the analysis result
		for (var iterator = solution.iterator(); iterator.hasNext();) {
			handleSolution(iterator)
			iterator.next
		}
	}

	private def handleSolution(SolutionIterator<Object> iterator) {
		val evaluatedConstraint = retrieveConstraint(iterator)

		// Retrieve standard query parameters
		val violationQueryType = getSolutionVariable(iterator, GlobalConstants.Parameters.QUERY_TYPE.toString)
		val violationCallStack = getSolutionArray(iterator, GlobalConstants.Parameters.CALL_STACK.toString)
		val violationOperation = getSolutionVariable(iterator, GlobalConstants.Parameters.OPERATION.toString)
		val violationParameter = getSolutionVariable(iterator, GlobalConstants.Parameters.PARAMETER.toString)
		val violationCallState = getSolutionVariable(iterator, GlobalConstants.Parameters.CALL_STATE.toString)

		if (violationQueryType.empty || violationCallStack.empty || violationOperation.empty) {
			throw new RuntimeException("QueryType, CallStack and Operation parameters are required in the solution.")
		}

		// Retrieve (optional) extra class variable unifications
		var classVariableMap = new HashMap<CharacteristicTypeSelector, String>
		for (clazz : evaluatedConstraint.allClasses) {
			for (member : clazz.members) {
				val value = getSolutionVariable(
					iterator, '''�GlobalConstants.Prefixes.CLASS_VARIABLE��clazz.name�_�member.ref.name�''')

				if (value.present) {
					classVariableMap.put(member, value.get)
				}
			}
		}

		// Retrieve (optional) extra free variables
		var variablesMap = new HashMap<CharacteristicVariableType, List<String>>
		for (variable : evaluatedConstraint.allCharacteristicVariables) {
			val value = getSolutionVariable(
				iterator, '''�GlobalConstants.Prefixes.CHARACTERISTIC_VARIABLE��variable.name�''')

			if (value.present) {
				variablesMap.put(variable, #[value.get])
			}
		}
		for (variable : evaluatedConstraint.allCharacteristicSetVariables) {
			val value = getSolutionArray(
				iterator, '''�GlobalConstants.Prefixes.CHARACTERISTIC_SET_VARIABLE��variable.name�''')

			if (value.present) {
				variablesMap.put(variable, value.get)
			}
		}

		evaluatedConstraint.addViolation(
			new Violation(violationQueryType.get, violationCallStack.get, 
				violationOperation.get, violationParameter,
				violationCallState, classVariableMap, variablesMap))
	}

	private def EvaluatedConstraint retrieveConstraint(SolutionIterator<Object> iterator) {
		val constraintName = getSolutionVariable(iterator, GlobalConstants.Parameters.CONSTRAINT_NAME.toString)

		if (constraintName.isEmpty) {
			throw new RuntimeException("A solution does not contain the non-optional constraint name parameter.")
		}

		val constraintCandidates = this.evaluatedConstraints.filter [ constraint |
			constraint.constraintName.equals(constraintName.get)
		]

		if (constraintCandidates.length != 1) {
			throw new RuntimeException(
				"Constraint input and solution result mismatch: Constraint not found or multiple constraints found.")
		}

		constraintCandidates.head
	}

}
