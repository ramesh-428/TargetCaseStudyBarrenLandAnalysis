/**
* This JUnit is for test cases made by author with smaller array size to work with. 
* Several combinations for one inputs  and other bad data scenarios are fully tested and  realized  
* @author Ramesh Garlapati
* @date  07/30/2021
* @version V1.0
*/
package com.grn.casestudy;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class OperationsFullTestSingleInput4 {
	static final int height = 13;
	static final int width = 5;

	@Test
	public void test1Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 4 3\"}";
		outputExpected.add(45);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test2Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 3 4 12\"}";
		outputExpected.add(15);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test3Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 5 4 8\"}";
		outputExpected.add(20);
		outputExpected.add(25);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test4Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 1 12\"}";
		outputExpected.add(39);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test5Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 0 2 12\"}";
		outputExpected.add(13);
		outputExpected.add(26);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test6Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"3 0 4 12\"}";
		outputExpected.add(39);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test7Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 4 12\"}";
		outputExpected.add(0);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test8Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 0 0\"}";
		outputExpected.add(65);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test9Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 4 2 8\"}";
		outputExpected.add(55);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test10Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 5 1 8\"}";
		outputExpected.add(57);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test11Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 0 2 3\"}";
		outputExpected.add(57);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test12Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"3 5 4 8\"}";
		outputExpected.add(57);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test13Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 9 2 12\"}";
		outputExpected.add(57);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test14Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 1 3\"}";
		outputExpected.add(57);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test15Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"3 0 4 3\"}";
		outputExpected.add(57);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test16Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"3 8 4 12\"}";
		outputExpected.add(55);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test17Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 8 1 12\"}";
		outputExpected.add(55);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test(expected = NumberFormatException.class)
	public void test18Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"U 8 1 12\"}";
		outputExpected.add(55);
		TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height);
	}

	@Test(expected = NumberFormatException.class)
	public void test19Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "sdfjsdklfjdlsjflsdjf\"U 8 1 12\"}";
		outputExpected.add(55);
		TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height);
	}

	@Test(expected = NumberFormatException.class)
	public void test20Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"8 9 0\"}";
		outputExpected.add(55);
		TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height);
	}

	@Test(expected = NumberFormatException.class)
	public void test21Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"9 8 0 9\"}";
		outputExpected.add(55);
		TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height);
	}

}