/**
* This JUnit is for test cases provided in the case study. 
* One input is realized however other one is not yet completed. 
* @author Ramesh Garlapati
* @date  07/30/2021
* @version V1.0
*/
package com.grn.casestudy;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class OperationsFullTestJavaBEInput4 {
	static final int height = 600;
	static final int width = 400;

	@Test
	public void test1Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 292 399 307\"}";
		outputExpected.add(116800);
		outputExpected.add(116800);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void testNotImplemented() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"48 192 351 207\",\"48 392 351 407\",\"120 52 135 547\",\"260 52 275 547\"}";
		outputExpected.add(22816);
		outputExpected.add(192608);
		assertTrue("Not Implemented", TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

}
