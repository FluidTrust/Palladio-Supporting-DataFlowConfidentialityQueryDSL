package de.sebinside.dcp.dsl.resultmapping

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
		val query = "constraint_NoType0Flow(ConstraintName, QueryType, OP, S, ST, Location, P)."
		loadInputAndPrintResultMapping(caseName, query)
	}

	@Test
	def void geolocationCase() {
		// This geolocation case already integrates palladio. The case without palladio integration is left out for brevity
		val caseName = "geolocation"
		val query = "constraint_NoUnencryptedPersonalDataFlow(ConstraintName, QueryType, OP, S, ST)."
		loadInputAndPrintResultMapping(caseName, query)
	}

	private def loadInputAndPrintResultMapping(String caseName, String query) {
		val model = loadDSLModel(caseName)
		val solution = createSolution(caseName, query)
		val result = new ResultMapper(model, solution).createResult
		println(result)
	}

}
