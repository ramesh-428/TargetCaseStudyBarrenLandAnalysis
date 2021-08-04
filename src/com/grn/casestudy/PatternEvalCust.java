/**
* Pattern Evaluation Class is one which provides information how the two given input rectangles are oriented. 
* Computation algorithm uses these properties for computations. 
* @author Ramesh Garlapati
* @date  07/30/2021
* @version V1.0
*/

package com.grn.casestudy;

public class PatternEvalCust {
	private RectangleCust outer;
	private RectangleCust inner;

	public PatternEvalCust() {

	}

	public PatternEvalCust(RectangleCust outer, RectangleCust inner) {
		this.outer = outer;
		this.inner = inner;
	}

	public RectangleCust getOuter() {
		return outer;
	}

	public void setOuter(RectangleCust outer) {
		this.outer = outer;
	}

	public RectangleCust getInner() {
		return inner;
	}

	public void setInner(RectangleCust inner) {
		this.inner = inner;
	}

	public boolean isLeftVerticalStripe() {
		if (outer.isIntersectable(inner) && inner.getPointA().equals(outer.getPointA())
				&& inner.getPointD().equals(outer.getPointD()))
			return true;
		else
			return false;
	}

	public boolean isRightVerticalStripe() {
		if (outer.isIntersectable(inner) && inner.getPointB().equals(outer.getPointB())
				&& inner.getPointC().equals(outer.getPointC()))
			return true;
		else
			return false;
	}

	public boolean isMiddleVerticalStripe() {
		if (outer.isIntersectable(inner) && outer.notEquals(inner)
				&& inner.getPointC().getY() == outer.getPointC().getY()
				&& inner.getPointA().getY() == outer.getPointA().getY())
			return true;
		else
			return false;
	}

	public boolean isTopHorizontalStripe() {
		if (outer.isIntersectable(inner) && inner.getPointC().equals(outer.getPointC())
				&& inner.getPointD().equals(outer.getPointD()))
			return true;
		else
			return false;
	}

	public boolean isBottomHorizontalStripe() {
		if (outer.isIntersectable(inner) && inner.getPointB().equals(outer.getPointB())
				&& inner.getPointA().equals(outer.getPointA()))
			return true;
		else
			return false;
	}

	public boolean isMiddleHorizontalStripe() {
		if (outer.isIntersectable(inner) && outer.notEquals(inner)
				&& inner.getPointC().getX() == outer.getPointC().getX()
				&& inner.getPointA().getX() == outer.getPointA().getX())
			return true;
		else
			return false;
	}

	public boolean isTopLeftBlock() {
		if (outer.isIntersectable(inner) && inner.getPointD().equals(outer.getPointD())
				&& !inner.getPointA().equals(outer.getPointA()) && !inner.getPointC().equals(outer.getPointC()))
			return true;
		else
			return false;
	}

	public boolean isTopRightBlock() {
		if (outer.isIntersectable(inner) && inner.getPointC().equals(outer.getPointC())
				&& !inner.getPointB().equals(outer.getPointB()) && !inner.getPointD().equals(outer.getPointD()))
			return true;
		else
			return false;
	}

	public boolean isMiddleBlock() {
		if (outer.isIntersectable(inner) && !isTopLeftBlock() && !isTopRightBlock() && !isBottomLeftBlock()
				&& !isBottomRightBlock() && !isLeftEdgeBlock() && !isMiddleEdgeBlock() && !isRightEdgeBlock()
				&& !isTopMiddleBlock())
			return true;
		else
			return false;
	}

	public boolean isBottomLeftBlock() {
		if (outer.isIntersectable(inner) && inner.getPointA().equals(outer.getPointA())
				&& !inner.getPointB().equals(outer.getPointB()) && !inner.getPointD().equals(outer.getPointD()))
			return true;
		else
			return false;
	}

	public boolean isBottomRightBlock() {
		if (outer.isIntersectable(inner) && inner.getPointB().equals(outer.getPointB())
				&& !inner.getPointA().equals(outer.getPointA()) && !inner.getPointC().equals(outer.getPointC()))
			return true;
		else
			return false;
	}

	public boolean isLeftEdgeBlock() {
		if (outer.isIntersectable(inner) && outer.notEquals(inner)
				&& inner.getPointA().getX() == outer.getPointA().getX())
			return true;
		else
			return false;
	}

	public boolean isMiddleEdgeBlock() {
		if (outer.isIntersectable(inner) && outer.notEquals(inner)
				&& inner.getPointA().getY() == outer.getPointA().getY())
			return true;
		else
			return false;
	}

	public boolean isRightEdgeBlock() {
		if (outer.isIntersectable(inner) && outer.notEquals(inner)
				&& inner.getPointC().getX() == outer.getPointC().getX())
			return true;
		else
			return false;
	}

	public boolean isTopMiddleBlock() {
		if (outer.isIntersectable(inner) && outer.notEquals(inner)
				&& inner.getPointC().getY() == outer.getPointC().getY())
			return true;
		else
			return false;
	}

	public boolean isEmpty() {
		if (((outer.getPointC().getX() - inner.getPointC().getX()) == outer.getPointC().getX())
				&& ((outer.getPointC().getY() - inner.getPointC().getY()) == outer.getPointC().getY()))
			return true;
		else
			return false;
	}

	public boolean isExactMatch() {
		if (outer.equals(inner))
			return true;
		else
			return false;
	}
}
