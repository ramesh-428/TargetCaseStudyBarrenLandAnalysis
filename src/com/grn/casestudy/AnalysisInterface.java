/**
* Interface Class to provide at a high level what this utility offers
* Computation and Sort Algorithms can be achieved in several variations  
* @author Ramesh Garlapati
* @date  07/30/2021
* @version V1.0
*/
package com.grn.casestudy;

import java.util.ArrayList;

public interface AnalysisInterface {
	public ArrayList<Integer> computeRectangles(RectangleCust output, ArrayList<RectangleCust> input);

	public ArrayList<Integer> getSortListAscending(ArrayList<Integer> inputArray);
}
