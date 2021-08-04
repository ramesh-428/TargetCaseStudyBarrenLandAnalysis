/**
* Point Class is one for storing X and Y co-ordinates
* @author Ramesh Garlapati
* @date  07/30/2021
* @version V1.0
*/
package com.grn.casestudy;

/*This is a custom class to store X and Y variables and has 9 helper functions*/
/* There is java Point class in java.awt package but it returns double type instead of int and also needed 
 * Helper functions to find characteristics of a cell for evaluations on finding fertile land areas
 *  */
public class PointCust {
	private int X; // X coordinate
	private int Y;// Y coordinate
//Default constructor to initialize to 0 value

	public PointCust() {
		this.X = 0;
		this.Y = 0;
	}

//Parameterized constructor to initialize to 0 value
	public PointCust(int X, int Y) {
		this.X = X;
		this.Y = Y;
	}

	public PointCust(PointCust point) {
		this.X = point.getX();
		this.Y = point.getY();
	}

	/* Setters and Getters */
	public int getX() {
		return X;
	}

	public void setX(int X) {
		this.X = X;
	}

	public int getY() {
		return Y;
	}

	public void setY(int Y) {
		this.Y = Y;
	}

	public boolean equals(PointCust p) {
		if (X == p.getX() && Y == p.getY())
			return true;
		else
			return false;
	}

	public PointCust getLeft() {
		PointCust left = new PointCust(getX() - 1, getY());
		return left;
	}

	public PointCust getRight() {
		PointCust right = new PointCust(getX() + 1, getY());
		return right;
	}

	public PointCust getUp() {
		PointCust up = new PointCust(getX(), getY() + 1);
		return up;
	}

	public PointCust getDown() {
		PointCust down = new PointCust(getX(), getY() - 1);
		return down;
	}
	
	public boolean isOrigin() {
		if (getX()==0 && getY()==0 )
		return true;
		else
		return false;
	}

	public int getArea(PointCust inner) {
		int height;
		int wid;
		int area=0;
		if (!isOrigin()) {
		wid = getX() - inner.getX() + 1;
		height = getY() - inner.getY() + 1;
		area = wid * height;
		}
		return area;
	}

}
