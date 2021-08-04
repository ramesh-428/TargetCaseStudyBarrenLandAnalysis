/**
* Main Class to interact with command line input
* @author Ramesh Garlapati
* @date  07/30/2021
* @version V1.0
*/
package com.grn.casestudy;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		OperationsFull op = new OperationsFull();
		ArrayList<RectangleCust> inputRectangles = new ArrayList<>();
		int height = 600;
		int width = 400;
	//	GenerateReferenceData refData = new GenerateReferenceData(width, height);
		RectangleCust mainRectangle = new RectangleCust(0, 0, width - 1, height - 1);
		try {
			inputRectangles = InputIntake.getUserInput(width, height);
	//		int referenceCount = refData.getReferenceDataOuput(inputRectangles);
			ArrayList<Integer> output = new ArrayList<Integer>();
			output = op.getSortListAscending(op.computeRectangles(mainRectangle, inputRectangles));
			System.out.println("::Output::");
			for (int out : output) {
				System.out.print(out + " ");
			}
			System.out.println();
	//		System.out.println("Fertile Land::" + referenceCount);
		} catch (Exception e) {
			System.out.println("Error in Main:" + e);
		}

	}

}
