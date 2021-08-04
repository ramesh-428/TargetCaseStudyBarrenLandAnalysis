/**
* Class with No properties and Only has static method
* Static method assist to take input of rectangles either through terminal or JUnit environment with overloaded method. 
* Displays various format errors like bad data or logical error when input rectangle is not valid
* @author Ramesh Garlapati
* @date  07/30/2021
* @version V1.0
*/
package com.grn.casestudy;

import java.util.ArrayList;
import java.util.Scanner;

public class InputIntake {

	/* This is to take input from Command Line environment */
	public static ArrayList<RectangleCust> getUserInput(int width, int height) {
		boolean isBeginEndCharsValid;
		String numberFormatMessage;
		ArrayList<RectangleCust> inputRectangles = new ArrayList<>();
		Scanner scanInput = new Scanner(System.in);
		try {
			/* Take Input */
			System.out.println("::Enter set of rectangles::");
			System.out.println(
					"::Format Requirement::four integers separated by single spaces, with no additional spaces in the string");
			System.out.println("::Example one Input::{\"0 292 399 307\"}");
			System.out.println(
					"::Example four Inputs::{\"48 192 351 207\",\"48 392 351 407\",\"120 52 135 547\",\"260 52 275 547\"}");
			String inputString = scanInput.nextLine(); // Read user String
			isBeginEndCharsValid = InputIntake.isBeginAndEndBracesPresent(inputString);
			if (isBeginEndCharsValid) {
				numberFormatMessage = InputIntake.isNumberFormat(inputString, width, height);
				if (numberFormatMessage.startsWith("ERROR"))
					throw new NumberFormatException(numberFormatMessage);
				else {
					inputRectangles = convertInputToRectangles(inputString);
					return inputRectangles;
				}
			} else
				throw new NumberFormatException("ERROR:FORMAT:Begin OR EndCharacters Not specified properly {\"\"}");
		} catch (Exception e) {
			throw new NumberFormatException("ERROR IN INPUT::" + e.getMessage());
		} finally {
			scanInput.close();
		}
	}

	/* This is for taking input from JUnit environment */
	public static ArrayList<RectangleCust> getUserInput(int width, int height, String input) {
		boolean isBeginEndCharsValid;
		String numberFormatMessage;
		ArrayList<RectangleCust> inputRectangles = new ArrayList<>();
		String inputString = input;
		try {
			isBeginEndCharsValid = InputIntake.isBeginAndEndBracesPresent(inputString);
			if (isBeginEndCharsValid) {
				numberFormatMessage = InputIntake.isNumberFormat(inputString, width, height);
				if (numberFormatMessage.startsWith("ERROR"))
					throw new NumberFormatException(numberFormatMessage);
				else {
					inputRectangles = convertInputToRectangles(inputString);
					return inputRectangles;
				}
			} else
				throw new NumberFormatException("ERROR:FORMAT:Begin OR EndCharacters Not specified properly {\"\"}");
		} catch (Exception e) {
			throw new NumberFormatException("ERROR IN INPUT::" + e.getMessage());
		}
	}

	private static boolean isBeginAndEndBracesPresent(String strInput) {
		char[] cArray = strInput.toCharArray();
		/** Check for Brace and double quote strings **/
		if (cArray[0] == 123 && cArray[1] == 34 && cArray[cArray.length - 2] == 34
				&& cArray[cArray.length - 1] == 125) {
			return true;
		} else {
			return false;
		}
	}

	private static String isNumberFormat(String strInput, int w, int h) {
		String[] strSplit = strInput.substring(2, strInput.length() - 2).split("\",\""); // Split into number string
		int idx = 0;
		try {
			for (idx = 0; idx < strSplit.length; ++idx) {
				String[] numberSplit = strSplit[idx].split(" ");
				if ((numberSplit.length) % 4 != 0 || numberSplit.length == 0)
					return "ERROR:FORMAT::Input Numbers are not groups of 4 or contains spaces:Actual Count::"
							+ (numberSplit.length);
				else if ((Integer.parseInt(numberSplit[2]) < Integer.parseInt(numberSplit[0])
						|| Integer.parseInt(numberSplit[3]) < Integer.parseInt(numberSplit[1]))
						|| (Integer.parseInt(numberSplit[3]) >= h || Integer.parseInt(numberSplit[2]) >= w))
					throw new NumberFormatException(
							"ERROR:LOGICAL::Second X and Y co-ordinates are not logically correct:: {\""
									+ Integer.parseInt(numberSplit[0]) + " " + Integer.parseInt(numberSplit[1]) + " "
									+ Integer.parseInt(numberSplit[2]) + " " + Integer.parseInt(numberSplit[3])
									+ "\"}");
			}
			return "SUCCESS";
		} catch (NumberFormatException userError) {
			return ("ERROR:FORMAT::Bad Data Found::" + userError.getMessage());
		}
	}

	private static ArrayList<RectangleCust> convertInputToRectangles(String strInput) {
		String[] strSplit = strInput.substring(2, strInput.length() - 2).split("\",\""); // Split into number string
		ArrayList<RectangleCust> rectCustArray = new ArrayList<>();
		int idx = 0;
		for (idx = 0; idx < strSplit.length; ++idx) {
			String[] numberSplit = strSplit[idx].split(" ");
			if (!((Integer.parseInt(numberSplit[0]) == 0) && (Integer.parseInt(numberSplit[1]) == 0)
					&& (Integer.parseInt(numberSplit[2]) == 0) && (Integer.parseInt(numberSplit[3]) == 0))) {
				rectCustArray.add(new Land(Integer.parseInt(numberSplit[0]), Integer.parseInt(numberSplit[1]),
						Integer.parseInt(numberSplit[2]), Integer.parseInt(numberSplit[3])));
			}
		}
		return rectCustArray;
	}

}