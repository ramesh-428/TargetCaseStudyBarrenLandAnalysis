package com.grn.casestudy;

import java.util.ArrayList;

public class TestGetStubCode {
	public static boolean evaluateTestCases(String inputEntry, ArrayList<Integer> outputExpected, int width,
			int height) {
		OperationsFull op = new OperationsFull();
		ArrayList<RectangleCust> inputRectangles = new ArrayList<>();
		boolean isTestPass = true;
		int idx;
		inputRectangles = InputIntake.getUserInput(width, height, inputEntry);
		ArrayList<Integer> output = new ArrayList<Integer>();
		output = op.getSortListAscending(
				op.computeRectangles(new RectangleCust(0, 0, width - 1, height - 1), inputRectangles));
		System.out.println("::Output::");
		for (int out : output) {
			System.out.print(out + " ");
		}
		System.out.println();
		if (outputExpected.size() != output.size())
			isTestPass = false;
		else
			for (idx = 0; idx < outputExpected.size(); ++idx) {
				if (outputExpected.get(idx).intValue() != output.get(idx).intValue()) {
					isTestPass = false;
					break;
				}
			}
		return isTestPass;
	}

}
