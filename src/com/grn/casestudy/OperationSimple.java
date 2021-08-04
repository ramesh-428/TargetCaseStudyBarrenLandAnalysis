/**
* Operations Class with less intense algorithms. Contains Sort algorithm for output display for various inputs. 
*
* @author Ramesh Garlapati
* @date  07/30/2021
* @version V1.0
*/
package com.grn.casestudy;

import java.util.ArrayList;

public abstract class OperationSimple implements AnalysisInterface {

	/* Sort Array */
	public ArrayList<Integer> getSortListAscending(ArrayList<Integer> inputArray) {
		int idRow;
		int idNext;
		Integer temp_variable;
		int ref_idx;
		for (idRow = 0; idRow < inputArray.size() - 1; ++idRow) {
			temp_variable = inputArray.get(idRow);
			ref_idx = idRow;
			for (idNext = idRow + 1; idNext < inputArray.size(); ++idNext) {
				if (temp_variable > inputArray.get(idNext)) {
					temp_variable = inputArray.get(idNext);
					ref_idx = idNext;
				}
			}
			// Swap out sorted contents
			inputArray.set(ref_idx, inputArray.get(idRow));
			inputArray.set(idRow, temp_variable);
		}
		return inputArray;
	}

	public abstract ArrayList<Integer> computeRectangles(RectangleCust output, ArrayList<RectangleCust> input);
}
