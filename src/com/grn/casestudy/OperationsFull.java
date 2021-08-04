/**
* Operations Class with computations algorithm for various inputs. 
* This program is fully operational for one input.
* For two inputs several use cases are implemented. However below are not programmed fully. 
* Top Left Corner intersection with Bottom Right Corner. Displays as one value without checking for intersections
* Top Right Corner intersection with Bottom Left Corner. Displays as one value without checking for intersections
* For more than 2 inputs program displays a message to the console. 
* @author Ramesh Garlapati
* @date  07/30/2021
* @version V1.0
*/
package com.grn.casestudy;

import java.util.ArrayList;

public class OperationsFull extends OperationSimple {

	public ArrayList<Integer> computeRectangles(RectangleCust output, ArrayList<RectangleCust> input) {
		int numberOfInputs = input.size();
		ArrayList<Integer> outputList = new ArrayList<>();
		switch (numberOfInputs) {
		case 0:
			outputList.add(output.getArea());
			break;
		case 1:
			outputList = computeSingleInput(output, input.get(0));
			break;
		case 2:
			outputList = computeTwoInputs(output, input);
			break;
		default:
			System.out.println("Program cannot Handle more than two inputs::");
		}
		return outputList;
	}

	private ArrayList<Integer> computeSingleInput(RectangleCust outer, RectangleCust inner) {
		int area;
		int area2;
		ArrayList<Integer> outputAreas = new ArrayList<>();
		PatternEvalCust pec = new PatternEvalCust();
		pec.setInner(inner);
		pec.setOuter(outer);
		if (pec.isExactMatch()) {
			outputAreas.add(0);
			return outputAreas;
		} else if (pec.isEmpty()) {
			area = outer.getArea();
			outputAreas.add(area);
		} else if (pec.isBottomHorizontalStripe()) {
			area = outer.getPointC().getArea(inner.getPointD().getUp());
			outputAreas.add(area);
		} else if (pec.isTopHorizontalStripe()) {
			area = inner.getPointB().getDown().getArea(outer.getPointA());
			outputAreas.add(area);
		} else if (pec.isMiddleHorizontalStripe()) {
			area = outer.getPointC().getArea(inner.getPointD().getUp());
			area2 = inner.getPointB().getDown().getArea(outer.getPointA());
			outputAreas.add(area);
			outputAreas.add(area2);
		} else if (pec.isLeftVerticalStripe()) {
			area = outer.getPointC().getArea(inner.getPointB().getRight());
			outputAreas.add(area);
		} else if (pec.isRightVerticalStripe()) {
			area = inner.getPointD().getLeft().getArea(outer.getPointA());
			outputAreas.add(area);
		} else if (pec.isMiddleVerticalStripe()) {
			area = inner.getPointD().getLeft().getArea(outer.getPointA());
			area2 = outer.getPointC().getArea(inner.getPointB().getRight());
			outputAreas.add(area);
			outputAreas.add(area2);
		} else if (pec.isTopLeftBlock() || pec.isTopRightBlock() || pec.isMiddleBlock() || pec.isBottomLeftBlock()
				|| pec.isBottomRightBlock() || pec.isLeftEdgeBlock() || pec.isMiddleEdgeBlock()
				|| pec.isRightEdgeBlock() || pec.isTopMiddleBlock()) {
			area = (outer.getArea() - inner.getArea());
			outputAreas.add(area);
		}
		return outputAreas;
	}

	private ArrayList<Integer> computeTwoInputs(RectangleCust outer, ArrayList<RectangleCust> inner) {
		ArrayList<Integer> outputAreas = new ArrayList<>();
		ArrayList<RectangleCust> intersect = new ArrayList<>();
		ArrayList<RectangleCust> newInput = new ArrayList<>();
		ArrayList<RectangleCust> reSizedInputs = new ArrayList<>();
		intersect.addAll(outer.getIntersectedRectangles(inner.get(0)));
		int loopCtr = 0;
		if (intersect.size() != 0) {
			inner.remove(0);
			reSizedInputs = inner.get(0).getResizedInputs(intersect);
			if (reSizedInputs.size() != 0) {
				inner.remove(0);
				newInput.addAll(reSizedInputs);
			}

		} else {
			intersect.addAll(outer.getIntersectedRectangles(inner.get(1)));
			if (intersect.size() != 0) {
				inner.remove(1);
				reSizedInputs = inner.get(0).getResizedInputs(intersect);
				if (reSizedInputs.size() != 0) {
					inner.remove(0);
					newInput.addAll(reSizedInputs);
				}

			} else {
				loopCtr = outputAreas.size();
				outputAreas.addAll(outer.getEdgeIntersectedArea(inner.get(0),inner.get(1)));
				if (loopCtr==outputAreas.size())
				outputAreas.add(outer.getArea() - (inner.get(0).getArea() + inner.get(1).getArea()));
			}

		}

		for (RectangleCust outer2 : intersect) {
			loopCtr = outputAreas.size();
			for (RectangleCust inner2 : newInput) {
				outputAreas.addAll(computeSingleInput(outer2, inner2));
			}
			if (loopCtr == outputAreas.size()) {
				outputAreas.add(outer2.getArea());
			}
		}
		return outputAreas;
	}

}