/**
* This JUnit is for test cases provided in the case study. 
* Two inputs are currently being worked upon. 
* @author Ramesh Garlapati
* @date  07/30/2021
* @version V1.0
*/
package com.grn.casestudy;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class OperationsFullTestTwoInput4 {

	static final int height = 13;
	static final int width = 5;

	@Test
	public void test1Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 4 3\",\"0 0 1 12\"}";
		outputExpected.add(27);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test2Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 4 3\",\"1 0 2 12\"}";
		outputExpected.add(9);
		outputExpected.add(18);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test3Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 4 3\",\"3 0 4 12\"}";
		outputExpected.add(27);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test4Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 4 3\",\"0 0 4 12\"}";
		outputExpected.add(0);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test5Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 4 3\",\"0 0 0 0\"}";
		outputExpected.add(45);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test6Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 4 3\",\"1 5 2 9\"}";
		outputExpected.add(35);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test7Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 4 3\",\"0 5 1 8\"}";
		outputExpected.add(37);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test8Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 4 3\",\"1 0 2 7\"}";
		outputExpected.add(37);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test9Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 4 3\",\"3 5 4 8\"}";
		outputExpected.add(37);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test10Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 4 3\",\"1 9 2 12\"}";
		outputExpected.add(37);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test11Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 4 3\",\"0 6 4 8\"}";
		outputExpected.add(10);
		outputExpected.add(20);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test12Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 4 3\",\"0 10 4 12\"}";
		outputExpected.add(30);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test13Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 4 3\",\"0 0 4 6\"}";
		outputExpected.add(30);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test14Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 4 3\",\"0 0 1 5\"}";
		outputExpected.add(41);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test15Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 4 3\",\"1 0 2 5\"}";
		outputExpected.add(41);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test16Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 4 3\",\"3 9 4 12\"}";
		outputExpected.add(37);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test17Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 4 3\",\"0 9 1 12\"}";
		outputExpected.add(37);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test18Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 1 12\",\"0 6 4 9\"}";
		outputExpected.add(9);
		outputExpected.add(18);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test19Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 6 4 9\",\"1 0 2 12\"}";
		outputExpected.add(3);
		outputExpected.add(6);
		outputExpected.add(6);
		outputExpected.add(12);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test20Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 6 4 9\",\"3 0 4 12\"}";
		outputExpected.add(9);
		outputExpected.add(18);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test21Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 6 4 9\",\"1 3 2 9\"}";
		outputExpected.add(15);
		outputExpected.add(24);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test22Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 1 4\",\"0 9 4 12\"}";
		outputExpected.add(35);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test23Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 0 2 5\",\"0 9 4 12\"}";
		outputExpected.add(33);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test24Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 7 4 12\",\"3 5 4 12\"}";
		outputExpected.add(31);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test25Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 5 4 7\",\"0 10 4 12\"}";
		outputExpected.add(10);
		outputExpected.add(25);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test26Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 1 8\",\"0 5 4 8\"}";
		outputExpected.add(15);
		outputExpected.add(20);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test27Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 2 2 5\",\"2 8 3 11\"}";
		outputExpected.add(49);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test28Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 2 2 5\",\"2 9 3 12\"}";
		outputExpected.add(49);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test29Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 4 7\",\"2 0 2 12\"}";
		outputExpected.add(10);
		outputExpected.add(10);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test30Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 5 4 8\",\"1 0 2 5\"}";
		outputExpected.add(5);
		outputExpected.add(10);
		outputExpected.add(20);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test31Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 5 1 9\",\"0 6 4 9\"}";
		outputExpected.add(15);
		outputExpected.add(28);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test32Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 4 4 6\",\"0 5 4 8\"}";
		outputExpected.add(20);
		outputExpected.add(20);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test33Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 1 12\",\"3 0 3 12\"}";
		outputExpected.add(13);
		outputExpected.add(13);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test34Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 0 1 12\",\"3 0 3 12\"}";
		outputExpected.add(13);
		outputExpected.add(13);
		outputExpected.add(13);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test35Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 1 3\",\"3 0 3 12\"}";
		outputExpected.add(13);
		outputExpected.add(31);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test36Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 1 3\",\"2 4 4 12\"}";
		outputExpected.add(30);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test37Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 10 1 12\",\"2 0 4 9\"}";
		outputExpected.add(29);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test38Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"2 0 2 3\"}";
		outputExpected.add(4);
		outputExpected.add(47);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test39Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"2 0 2 1\"}";
		outputExpected.add(4);
		outputExpected.add(47);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test40Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"3 0 3 1\"}";
		outputExpected.add(51);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test41Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 0 1 1\",\"0 2 2 5\"}";
		outputExpected.add(2);
		outputExpected.add(49);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test42Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"2 2 4 5\",\"2 0 2 3\"}";
		outputExpected.add(4);
		outputExpected.add(47);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test43Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"2 0 2 3\",\"2 2 4 5\"}";
		outputExpected.add(4);
		outputExpected.add(47);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test44Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"2 2 4 5\",\"2 0 2 1\"}";
		outputExpected.add(4);
		outputExpected.add(47);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test45Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"2 2 4 3\",\"0 2 2 5\"}";
		outputExpected.add(10);
		outputExpected.add(39);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test46Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"3 2 4 3\"}";
		outputExpected.add(10);
		outputExpected.add(39);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test47Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"3 6 4 7\"}";
		outputExpected.add(49);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test48Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"3 3 4 4\",\"0 2 2 5\"}";
		outputExpected.add(12);
		outputExpected.add(37);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test49Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"3 1 4 2\",\"0 3 2 5\"}";
		outputExpected.add(52);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test50Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 6 2 12\",\"0 2 2 5\"}";
		outputExpected.add(7);
		outputExpected.add(32);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test51Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"2 4 2 12\"}";
		outputExpected.add(14);
		outputExpected.add(32);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test52Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"3 5 3 12\"}";
		outputExpected.add(21);
		outputExpected.add(24);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test53Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"3 1 3 12\",\"0 2 2 5\"}";
		outputExpected.add(20);
		outputExpected.add(21);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test54Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"2 1 2 12\"}";
		outputExpected.add(14);
		outputExpected.add(31);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test55Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"3 6 3 12\"}";
		outputExpected.add(46);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test56Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"3 0 3 8\"}";
		outputExpected.add(6);
		outputExpected.add(38);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test57Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"3 0 3 1\"}";
		outputExpected.add(51);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test58Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"1 6 4 7\"}";
		outputExpected.add(18);
		outputExpected.add(27);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test59Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"3 6 4 7\"}";
		outputExpected.add(49);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test60Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"2 6 4 7\"}";
		outputExpected.add(18);
		outputExpected.add(29);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test61Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"2 1 4 1\"}";
		outputExpected.add(7);
		outputExpected.add(43);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test62Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 0 2 5\",\"3 1 4 9\"}";
		outputExpected.add(2);
		outputExpected.add(33);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test63Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 0 2 5\",\"3 6 4 9\"}";
		outputExpected.add(45);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test64Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 0 2 5\",\"2 6 4 9\"}";
		outputExpected.add(12);
		outputExpected.add(29);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test65Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"2 6 3 12\"}";
		outputExpected.add(14);
		outputExpected.add(25);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test66Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 1 5\",\"3 0 3 1\"}";
		outputExpected.add(55);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test67Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"1 0 1 3\"}";
		outputExpected.add(2);
		outputExpected.add(49);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test68Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"3 0 3 2\"}";
		outputExpected.add(6);
		outputExpected.add(44);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test69Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"3 1 4 1\"}";
		outputExpected.add(51);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test70Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"3 3 4 8\"}";
		outputExpected.add(12);
		outputExpected.add(29);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test71Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"1 6 4 8\"}";
		outputExpected.add(18);
		outputExpected.add(23);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test72Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"1 1 4 1\"}";
		outputExpected.add(6);
		outputExpected.add(43);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test73Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"2 4 4 7\"}";
		outputExpected.add(14);
		outputExpected.add(29);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test74Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"3 2 4 2\"}";
		outputExpected.add(10);
		outputExpected.add(41);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test75Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"1 6 1 12\"}";
		outputExpected.add(7);
		outputExpected.add(39);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test76Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 1 5\",\"3 6 3 12\"}";
		outputExpected.add(50);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test77Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 2 2 5\",\"1 4 2 12\"}";
		outputExpected.add(7);
		outputExpected.add(32);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test78Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 0 2 5\",\"1 4 4 7\"}";
		outputExpected.add(8);
		outputExpected.add(33);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test79Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 0 2 5\",\"4 4 4 7\"}";
		outputExpected.add(49);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test80Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"2 0 2 5\",\"1 6 4 7\"}";
		outputExpected.add(12);
		outputExpected.add(39);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test81Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 0 2 5\",\"2 6 3 12\"}";
		outputExpected.add(19);
		outputExpected.add(20);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test82Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 0 2 5\",\"2 6 2 12\"}";
		outputExpected.add(20);
		outputExpected.add(26);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test83Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"2 0 3 5\",\"1 6 2 12\"}";
		outputExpected.add(19);
		outputExpected.add(20);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test84Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 6 1 12\",\"2 0 3 5\"}";
		outputExpected.add(46);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test85Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"3 6 3 12\",\"1 0 2 5\"}";
		outputExpected.add(46);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test86Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 0 1 5\",\"3 6 3 12\"}";
		outputExpected.add(52);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test87Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 3 1 12\",\"2 0 2 5\"}";
		outputExpected.add(16);
		outputExpected.add(33);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test88Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"2 0 2 5\",\"3 4 3 12\"}";
		outputExpected.add(17);
		outputExpected.add(33);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test89Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 4 2 12\",\"3 4 4 8\"}";
		outputExpected.add(8);
		outputExpected.add(29);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test90Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"3 4 4 8\",\"3 9 3 12\"}";
		outputExpected.add(4);
		outputExpected.add(47);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test91Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"3 4 4 8\",\"2 2 2 12\"}";
		outputExpected.add(8);
		outputExpected.add(36);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test92Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"2 4 4 8\",\"3 9 3 12\"}";
		outputExpected.add(4);
		outputExpected.add(42);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test93Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"2 4 4 8\",\"1 9 1 12\"}";
		outputExpected.add(46);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test94Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 7 2 12\",\"2 4 4 8\"}";
		outputExpected.add(8);
		outputExpected.add(32);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}

	@Test
	public void test95Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 8 1 12\",\"3 4 4 8\"}";
		outputExpected.add(50);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}
	@Test
	public void test96Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 8 1 12\",\"3 4 4 8\"}";
		outputExpected.add(50);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}
	@Test
	public void test97Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"1 8 1 12\",\"3 4 4 8\"}";
		outputExpected.add(50);
		assertTrue(TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}
	@Test
	public void test98Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 5 2 12\",\"1 0 4 6\"}";
		outputExpected.add(5);
		outputExpected.add(12);
		assertTrue("Not Programmed", TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}
	
	@Test
	public void test99Input() {
		String inputEntry;
		ArrayList<Integer> outputExpected = new ArrayList<>();
		inputEntry = "{\"0 0 2 6\",\"1 5 4 12\"}";
		outputExpected.add(6);
		outputExpected.add(10);
		assertTrue("Not Programmed", TestGetStubCode.evaluateTestCases(inputEntry, outputExpected, width, height));
	}	
}
