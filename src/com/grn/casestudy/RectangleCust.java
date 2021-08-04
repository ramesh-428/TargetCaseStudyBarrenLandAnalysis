/**
* Rectangle Class is one for storing 4 Points 
* This class also contains several other methods that provide information about the property with respect to other. 
* @author Ramesh Garlapati
* @date  07/30/2021
* @version V1.0
*/
package com.grn.casestudy;

import java.util.ArrayList;

/*This is a custom Rectangle Class that contains Point Class to store four coordinates */
public class RectangleCust {
	private PointCust pointA; // Store 4 co-ordinates of rectangle in Point array
	private PointCust pointB;
	private PointCust pointC;
	private PointCust pointD;

	public RectangleCust() {
		pointA = new PointCust();
		pointB = new PointCust();
		pointC = new PointCust();
		pointD = new PointCust();
	}

	public RectangleCust(int input1, int input2, int input3, int input4) {
		pointA = new PointCust(input1, input2);
		pointB = new PointCust(input3, input2); // second point X is input 3 and Y is input 2
		pointC = new PointCust(input3, input4);
		pointD = new PointCust(input1, input4); // fourth point X is input 1 and Y is input 4
	}

	public RectangleCust(PointCust p1, PointCust p2, PointCust p3, PointCust p4) {
		pointA = p1;
		pointB = p2; // second point X is input 3 and Y is input 2
		pointC = p3;
		pointD = p4; // fourth point X is input 1 and Y is input 4
	}

	public RectangleCust(RectangleCust r) {
		pointA = r.getPointA();
		pointB = r.getPointB();
		pointC = r.getPointC();
		pointD = r.getPointD(); // fourth point X is input 1 and Y is input 4
	}

	public PointCust getPointA() {
		return pointA;
	}

	public void setPointA(PointCust pointA) {
		this.pointA = pointA;
	}

	public PointCust getPointB() {
		return pointB;
	}

	public void setPointB(PointCust pointB) {
		this.pointB = pointB;
	}

	public PointCust getPointC() {
		return pointC;
	}

	public void setPointC(PointCust pointC) {
		this.pointC = pointC;
	}

	public PointCust getPointD() {
		return pointD;
	}

	public void setPointD(PointCust pointD) {
		this.pointD = pointD;
	}

	public boolean equals(RectangleCust r) {
		if (r.getPointA().equals(pointA) && r.getPointB().equals(pointB) && r.getPointC().equals(pointC)
				&& r.getPointD().equals(pointD))
			return true;
		else
			return false;
	}

	public boolean notEquals(RectangleCust r) {
		if (!r.getPointA().equals(pointA) && !r.getPointB().equals(pointB) && !r.getPointC().equals(pointC)
				&& !r.getPointD().equals(pointD))
			return true;
		else
			return false;
	}

	public int getArea() {
		int area = 0;
		if (!isEmpty())
			area = ((getPointC().getX() - getPointA().getX() + 1) * (getPointC().getY() - getPointA().getY() + 1));
		return area;
	}

	public String getRectangleAsString() {
		return "{\"" + pointA.getX() + " " + pointA.getY() + " " + pointC.getX() + " " + pointC.getY() + "}\"";
	}

	/*
	 * Intersection Formula is max function for Point A co-ordinates and min
	 * function for Point C co-ordinates
	 **/
	public boolean isIntersectable(RectangleCust r) {
		int X1;
		int Y1;
		int X2;
		int Y2;
		if (getPointA().getX() <= r.getPointA().getX())
			X1 = r.getPointA().getX();
		else
			X1 = getPointA().getX();
		if (getPointA().getY() <= r.getPointA().getY())
			Y1 = r.getPointA().getY();
		else
			Y1 = getPointA().getY();
		if (getPointC().getX() <= r.getPointC().getX())
			X2 = getPointC().getX();
		else
			X2 = r.getPointC().getX();
		if (getPointC().getY() <= r.getPointC().getY())
			Y2 = getPointC().getY();
		else
			Y2 = r.getPointC().getY();
		if (X1 > X2 || Y1 > Y2)
			return false;
		else
			return true;
	}

	public RectangleCust getIntersectedRectangle(RectangleCust r) {
		int X1;
		int Y1;
		int X2;
		int Y2;
		RectangleCust rNew = new RectangleCust();
		if (getPointA().getX() <= r.getPointA().getX())
			X1 = r.getPointA().getX();
		else
			X1 = getPointA().getX();
		if (getPointA().getY() <= r.getPointA().getY())
			Y1 = r.getPointA().getY();
		else
			Y1 = getPointA().getY();
		if (getPointC().getX() <= r.getPointC().getX())
			X2 = getPointC().getX();
		else
			X2 = r.getPointC().getX();
		if (getPointC().getY() <= r.getPointC().getY())
			Y2 = getPointC().getY();
		else
			Y2 = r.getPointC().getY();
		if (!(X1 > X2 || Y1 > Y2)) {
			rNew = new RectangleCust(X1, Y1, X2, Y2);
		}
		return rNew;
	}

	public String getIntersectProperty(RectangleCust reference) {
		PatternEvalCust pec = new PatternEvalCust(new RectangleCust(getPointA(), getPointB(), getPointC(), getPointD()),
				reference);
		String patternText;
		if (pec.isLeftVerticalStripe())
			patternText = "LVS";
		else if (pec.isRightVerticalStripe())
			patternText = "RVS";
		else if (pec.isMiddleVerticalStripe())
			patternText = "MVS";
		else if (pec.isTopHorizontalStripe())
			patternText = "THS";
		else if (pec.isBottomHorizontalStripe())
			patternText = "BHS";
		else if (pec.isMiddleHorizontalStripe())
			patternText = "MHS";
		else if (pec.isTopLeftBlock())
			patternText = "TLB";
		else if (pec.isTopRightBlock())
			patternText = "TRB";
		else if (pec.isMiddleBlock())
			patternText = "MB";
		else if (pec.isBottomLeftBlock())
			patternText = "BLB";
		else if (pec.isBottomRightBlock())
			patternText = "BRB";
		else if (pec.isLeftEdgeBlock())
			patternText = "LEB";
		else if (pec.isMiddleEdgeBlock())
			patternText = "MEB";
		else if (pec.isRightEdgeBlock())
			patternText = "REB";
		else if (pec.isTopMiddleBlock())
			patternText = "TMB";
		else if (pec.isEmpty())
			patternText = "EMPTY";
		else if (pec.isEmpty())
			patternText = "EXACT";
		else
			patternText = "UNKNOWN";
		return patternText;
	}

////Intersectable and touching part of Outer Rectangles. If so, splits input rectangle into multiples. 
	public ArrayList<RectangleCust> getIntersectedRectangles(RectangleCust reference) {
		ArrayList<RectangleCust> r = new ArrayList<RectangleCust>();
		RectangleCust rIntersect = new RectangleCust();
		String property;
		if (isIntersectable(reference)) {
			rIntersect = getIntersectedRectangle(reference);
		}
		if (!rIntersect.isEmpty()) {
			property = getIntersectProperty(rIntersect);
			switch (property) {
			case "EXACT":
				r.add(new RectangleCust(0, 0, 0, 0));
				break;
			case "EMPTY":
				r.add(getRectangle());
				break;
			case "BHS":
				r.add(new RectangleCust(rIntersect.getPointD().getUp(), rIntersect.getPointC().getUp(), getPointC(),
						getPointD()));
				break;
			case "THS":
				r.add(new RectangleCust(getPointA(), getPointB(), rIntersect.getPointB().getDown(),
						rIntersect.getPointA().getDown()));
				break;
			case "MHS":
				r.add(new RectangleCust(reference.getPointD().getUp(), reference.getPointC().getUp(), getPointC(),
						getPointD()));
				r.add(new RectangleCust(getPointA(), getPointB(), reference.getPointB().getDown(),
						reference.getPointA().getDown()));
				break;
			case "LVS":
				r.add(new RectangleCust(reference.getPointB().getRight(), getPointB(), getPointC(),
						reference.getPointC().getRight()));
				break;
			case "RVS":
				r.add(new RectangleCust(getPointA(), reference.getPointA().getLeft(), reference.getPointD().getLeft(),
						getPointD()));
				break;
			case "MVS":
				r.add(new RectangleCust(getPointA(), reference.getPointA().getLeft(), reference.getPointD().getLeft(),
						getPointD()));
				r.add(new RectangleCust(reference.getPointB().getRight(), getPointB(), getPointC(),
						reference.getPointC().getRight()));
				break;
			default:
				break;
			}
		}
		return r;
	}

	public ArrayList<RectangleCust> getResizedInputs(ArrayList<RectangleCust> intersect) {
		ArrayList<RectangleCust> rResize = new ArrayList<RectangleCust>();
		for (RectangleCust r : intersect) {
			if (isIntersectable(r)) {
				rResize.add(getIntersectedRectangle(r));
			}
		}
		return rResize;
	}

	public boolean isEmpty() {
		if (pointA.getX() == 0 && pointA.getY() == 0 && pointC.getX() == 0 && pointC.getY() == 0)
			return true;
		else
			return false;
	}

	public RectangleCust getRectangle() {
		return new RectangleCust(getPointA(), getPointB(), getPointC(), getPointD());
	}

	public ArrayList<Integer> getEdgeIntersectedArea(RectangleCust edge1, RectangleCust edge2) {
		//TODO for TLC and BRC and BLC and TRC's
		ArrayList<Integer> outputAreas = new ArrayList<>();
		String edge1Property = getIntersectProperty(edge1);
		String edge2Property = getIntersectProperty(edge2);
		String tempS;
		boolean swapFlag = false;
		int area = 0;
		RectangleCust r1 = new RectangleCust();
		RectangleCust r2 = new RectangleCust();
		RectangleCust temp = new RectangleCust();
		RectangleCust rIntersect = new RectangleCust();
		if (edge1Property == "LEB" && (edge2Property == "MEB" || edge2Property == "REB" || edge2Property == "TMB"))
			swapFlag = false;
		else if (edge1Property == "MEB" && (edge2Property == "REB" || edge2Property == "TMB"))
			swapFlag = false;
		else if (edge1Property == "REB" && (edge2Property == "TMB"))
			swapFlag = false;
		else if (edge1Property != "LEB" && edge2Property == "LEB")
			swapFlag = true;
		else if (edge1Property != "MEB" && edge2Property == "MEB")
			swapFlag = true;
		else if (edge1Property != "REB" && edge2Property == "REB")
			swapFlag = true;
		if (swapFlag) {
			temp = edge1;
			edge1 = edge2;
			edge2 = temp;
			tempS = edge1Property;
			edge1Property = edge2Property;
			edge2Property = tempS;
		}
		switch (edge1Property) {
		case "LEB":
			switch (edge2Property) {
			case "MEB":
				if (edge1.isIntersectable(edge2)
						|| (edge1.getPointA().getDown().getY() == edge2.getPointC().getY()
								&& edge1.getPointC().getX() >= edge2.getPointA().getX()
										)
						|| (edge1.getPointC().getRight().getX() == edge2.getPointA().getX()
								&& (edge2.getPointC().getY() >= edge1.getPointA().getY()))) {
					r1 = new RectangleCust(getPointA().getX(), getPointA().getY(), edge2.getPointA().getLeft().getX(),
							edge1.getPointA().getDown().getY());
					rIntersect = edge1.getIntersectedRectangle(edge2);
					area = r1.getArea();
					outputAreas.add(area);
					outputAreas.add(getArea() - (area + edge1.getArea() + edge2.getArea() - rIntersect.getArea()));
				}
				break;
			case "REB":
				if (edge1.isIntersectable(edge2)
						|| (edge1.getPointC().getRight().getX() == edge2.getPointA().getX()
								&& (edge2.getPointA().getY() >= edge1.getPointA().getY()
										&& edge2.getPointA().getY() <= edge1.getPointC().getY()))
						|| (edge1.getPointC().getUp().getY() == edge2.getPointA().getY()
								&& (edge1.getPointC().getX() >= edge2.getPointA().getX()))) {
					r1 = new RectangleCust(getPointA().getX(), getPointA().getY(), edge1.getPointB().getX(),
							edge1.getPointB().getDown().getY());
					r2 = new RectangleCust(edge1.getPointB().getRight().getX(), getPointA().getY(), getPointC().getX(),
							edge2.getPointA().getDown().getY());
					rIntersect = edge1.getIntersectedRectangle(edge2);
					area = r1.getArea();
					area += r2.getArea();
					outputAreas.add(area);
					outputAreas.add(getArea() - (area + edge1.getArea() + edge2.getArea() - rIntersect.getArea()));
				} else if (edge1.getPointA().getDown().getY() == edge2.getPointC().getY()
						&& edge1.getPointC().getX() >= edge2.getPointA().getX()) {
					r1 = new RectangleCust(getPointA().getX(), getPointA().getY(), edge2.getPointD().getLeft().getX(),
							edge2.getPointD().getLeft().getY());
					r2 = new RectangleCust(edge2.getPointA().getDown().getX(), getPointA().getY(), getPointC().getX(),
							edge2.getPointB().getDown().getY());
					area = r1.getArea();
					area += r2.getArea();
					outputAreas.add(area);
					outputAreas.add(getArea() - (area + edge1.getArea() + edge2.getArea()));
				}
				break;
			case "TMB":
				if (edge1.isIntersectable(edge2)
						|| (edge1.getPointC().getUp().getY() == edge2.getPointA().getY()
								&& (edge2.getPointA().getX() >= edge1.getPointA().getX()
										&& edge2.getPointA().getX() <= edge1.getPointC().getX()))
						|| (edge1.getPointC().getRight().getX() == edge2.getPointA().getX()
								&& (edge2.getPointA().getY() <= edge1.getPointC().getY()))) {
					r1 = new RectangleCust(edge1.getPointD().getUp().getX(), edge1.getPointD().getUp().getY(),
							edge2.getPointD().getLeft().getX(), edge2.getPointD().getLeft().getY());
					rIntersect = edge1.getIntersectedRectangle(edge2);
					area = r1.getArea();
					outputAreas.add(area);
					outputAreas.add(getArea() - (area + edge1.getArea() + edge2.getArea() - rIntersect.getArea()));
				}
				break;
			default:
				break;
			}
			break;
		case "MEB":
			switch (edge2Property) {
			case "REB":
				if (edge1.isIntersectable(edge2)
						|| (edge1.getPointC().getUp().getY() == edge2.getPointA().getY()
								&& edge2.getPointA().getX() <= edge1.getPointC().getX())
						|| (edge1.getPointC().getRight().getX() == edge2.getPointA().getX()
								&& edge2.getPointA().getY() <= edge1.getPointC().getY())) {
					r1 = new RectangleCust(edge1.getPointC().getRight().getX(), getPointA().getY(), getPointC().getX(),
							edge2.getPointA().getDown().getY());
					rIntersect = edge1.getIntersectedRectangle(edge2);
					area = r1.getArea();
					outputAreas.add(area);
					outputAreas.add(getArea() - (area + edge1.getArea() + edge2.getArea() - rIntersect.getArea()));
				}
				break;
			case "TMB":
				if (edge1.isIntersectable(edge2) || (edge1.getPointC().getUp().getY() == edge2.getPointA().getY()
						&& (edge1.getPointC().getX() >= edge2.getPointA().getX()
								&& edge2.getPointC().getX() >= edge1.getPointA().getX()))) {
					r1 = new RectangleCust(getPointA().getX(), getPointA().getY(), edge1.getPointD().getLeft().getX(),
							edge1.getPointD().getLeft().getY());
					r2 = new RectangleCust(getPointA().getX(), edge2.getPointA().getLeft().getY(),
							edge2.getPointD().getLeft().getX(), edge2.getPointD().getLeft().getY());
					rIntersect = edge1.getIntersectedRectangle(edge2);
					area = r1.getArea();
					area += r2.getArea();
					outputAreas.add(area);
					outputAreas.add(getArea() - (area + edge1.getArea() + edge2.getArea() - rIntersect.getArea()));
				} else if (edge1.getPointA().getLeft().getX() == edge2.getPointC().getX()
						&& edge1.getPointC().getY() >= edge2.getPointA().getY()) {
					r1 = new RectangleCust(getPointA().getX(), getPointA().getY(), edge2.getPointC().getX(),
							edge2.getPointA().getDown().getY());
					r2 = new RectangleCust(getPointA().getX(), edge2.getPointA().getY(),
							edge2.getPointA().getLeft().getX(), getPointC().getY());
					area = r1.getArea();
					area += r2.getArea();
					outputAreas.add(area);
					outputAreas.add(getArea() - (area + edge1.getArea() + edge2.getArea()));
				}

				else if (edge1.getPointC().getRight().getX() == edge2.getPointA().getX()
						&& edge1.getPointC().getY() >= edge2.getPointA().getY()) {
					r1 = new RectangleCust(edge1.getPointC().getRight().getX(), getPointA().getY(), getPointC().getX(),
							edge2.getPointA().getDown().getY());
					r2 = new RectangleCust(edge2.getPointC().getRight().getX(), edge2.getPointA().getY(),
							getPointC().getX(), getPointC().getY());
					area = r1.getArea();
					area += r2.getArea();
					outputAreas.add(area);
					outputAreas.add(getArea() - (area + edge1.getArea() + edge2.getArea()));
				}

				break;
			default:
				break;
			}
			break;
		case "REB":
			switch (edge2Property) {
			case "TMB":
				if (edge1.isIntersectable(edge2)
						|| (edge1.getPointA().getLeft().getX() == edge2.pointC.getX()
								&& edge2.getPointA().getY() <= edge1.getPointC().getY())
						|| (edge2.getPointA().getDown().getY() == edge1.pointC.getY()
								&& edge2.getPointC().getX() >= edge1.getPointA().getX()
								&& edge2.getPointA().getX() <= edge1.getPointC().getX())) {
					r1 = new RectangleCust(edge2.getPointC().getRight().getX(), edge1.getPointC().getUp().getY(),
							getPointC().getX(), getPointC().getY());
					rIntersect = edge1.getIntersectedRectangle(edge2);
					area = r1.getArea();
					outputAreas.add(area);
					outputAreas.add(getArea() - (area + edge1.getArea() + edge2.getArea() - rIntersect.getArea()));
				}
				break;
			default:
				break;
			}
			break;
		default:
			break;
		}
		return outputAreas;
	}

}
