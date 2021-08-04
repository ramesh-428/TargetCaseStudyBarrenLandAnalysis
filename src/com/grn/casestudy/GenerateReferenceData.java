/**
* Class to provide total sum of non barren land using two dimensional 1X1 arrays. 
* This is used as a reference to validate if the individual entries computed through algorithm matches with the sum of reference data 
* @author Ramesh Garlapati
* @date  07/30/2021
* @version V1.0
*/
package com.grn.casestudy;

import java.util.ArrayList;

public class GenerateReferenceData {
	private Land[][] mainAreaSplit;

	public GenerateReferenceData(int width, int height) {
		int loopIdxR;
		int loopIdxC;
		mainAreaSplit = new Land[height][width];
		for (loopIdxR = 0; loopIdxR < height; ++loopIdxR)
			for (loopIdxC = 0; loopIdxC < width; ++loopIdxC)
				this.mainAreaSplit[loopIdxR][loopIdxC] = new Land(loopIdxC, loopIdxR, loopIdxC + 1, loopIdxR + 1);
	}

	public int getReferenceDataOuput(ArrayList<RectangleCust> inputRectangles) {
		for (RectangleCust r : inputRectangles)
			setBarrenArea(r);
		return getFertileLand();

	}

	private void setBarrenArea(RectangleCust barren) {
		PointCust A;
		PointCust C;
		int loopIdxR;
		int loopIdxC;
		A = barren.getPointA();
		C = barren.getPointC();
		for (loopIdxR = A.getY(); loopIdxR <= C.getY(); ++loopIdxR)
			for (loopIdxC = A.getX(); loopIdxC <= C.getX(); ++loopIdxC)
				mainAreaSplit[loopIdxR][loopIdxC].setIsBarren(true);
	}

	private int getFertileLand() {
		int loopIdX;
		int loopIdY;
		int ctr_fertile_sqrs = 0;
		for (loopIdX = 0; loopIdX < mainAreaSplit.length; ++loopIdX) {
			for (loopIdY = 0; loopIdY < mainAreaSplit[(mainAreaSplit.length) - 1].length; ++loopIdY) {
				if (!mainAreaSplit[loopIdX][loopIdY].getIsBarren()) {
					++ctr_fertile_sqrs;
				}
			}

		}
		return ctr_fertile_sqrs;
	}

}
