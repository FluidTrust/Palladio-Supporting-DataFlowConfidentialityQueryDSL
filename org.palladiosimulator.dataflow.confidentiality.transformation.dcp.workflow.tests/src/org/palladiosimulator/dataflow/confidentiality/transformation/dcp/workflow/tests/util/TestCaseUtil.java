package org.palladiosimulator.dataflow.confidentiality.transformation.dcp.workflow.tests.util;

public class TestCaseUtil {

	public static enum InformationFlowTumaTestCases {
		DROID_BENCH("DroidBench"),
		FRIEND_MAP("FriendMap"),
		HOSPITAL("Hospital"),
		JPMAIL("JPMail"),
		WEBRCT("WebRTC");

		private String value;

		InformationFlowTumaTestCases(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}
	}
}
