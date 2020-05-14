package de.sebinside.dcp.dsl.resultmapping

import de.sebinside.dcp.dsl.resultmapping.generate.ResultMapping
import org.junit.jupiter.api.Test

class ResultMappingCases extends ResultMappingBase {

	@Test
	def void shopSimpleCase() {
		val caseName = "shop-simple"
		val query = "constraint_NoType0Flow(ConstraintName, QueryType, OP, S, ST, P)."
		loadInputAndPrintResultMapping(caseName, query)
	}

	@Test
	def void shopClassCase() {
		val caseName = "shop-class"
		val query = "constraint_NoType0Flow(ConstraintName, QueryType, OP, S, ST, ClassVar_isNotSafe_location, P)."
		loadInputAndPrintResultMapping(caseName, query)
	}

	@Test
	def void geolocationSimpleCase() {
		val caseName = "geolocation-simple"
		val query = "constraint_NoUnencryptedPersonalDataFlow(ConstraintName, QueryType, OP, S, P)."
		loadInputAndPrintResultMapping(caseName, query)
	}
	
	@Test
	def void geolocationPalladioCase() {
		val caseName = "geolocation-palladio"
		val query = "constraint_NoUnencryptedPersonalDataFlow(ConstraintName, QueryType, OP, S, ST)."
		loadInputAndPrintResultMapping(caseName, query)
	}
	
	@Test
	def void accessControlSimpleCase() {
		val caseName = "accesscontrol-simple"
		val query = "constraint_AuthorizedAccess(ConstraintName, QueryType, OP, S, VarSet_authRoles, VarSet_accessRoles, P)."
		loadInputAndPrintResultMapping(caseName, query)
	}
	
	@Test
	def void accessControlPalladioCase() {
		val caseName = "accesscontrol-palladio"
		val query = "constraint_AuthorizedAccess(ConstraintName, QueryType, OP, S, ST, VarSet_authRoles, VarSet_accessRoles)."
		loadInputAndPrintResultMapping(caseName, query)
	}

	private def loadInputAndPrintResultMapping(String caseName, String query) {
		val model = loadDSLModel(caseName)
		val solution = createSolution(caseName, query)
		val result = new ResultMapping(model, solution)
		val serializedResult = serializer.serialize(caseName, result)
		saveResult(caseName, serializer.fileExtension ,serializedResult)
	}

}
