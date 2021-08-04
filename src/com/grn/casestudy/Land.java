/**
* Class to assist with reference Data generation 
* barren flag is to mark barren area. 
* isSearchable is placed but not used in the current search analysis. 
* Kept here to see if search can be incorporated with this approach
* @author Ramesh Garlapati
* @date  07/30/2021
* @version V1.0
*/
package com.grn.casestudy;

public class Land extends RectangleCust {
	private boolean isBarren;
	private boolean isSearchable;

	public Land() {
		super();
		this.isBarren = false;
		this.isSearchable = true;
	}

	public Land(int input1, int input2, int input3, int input4) {
		super(input1, input2, input3, input4); // Call super class constructor to set 4 coordinates
		this.isBarren = false; // Default is false
		this.isSearchable = true;
	}

	public Land(int input1, int input2, int input3, int input4, boolean isBarren, boolean isSearchable) {
		super(input1, input2, input3, input4); // Call super class constructor to set 4 coordinates
		this.isBarren = isBarren;
		this.isSearchable = isSearchable;
	}

	/* Getter and Setters for isBarren and setIsBarren Start */
	public boolean getIsBarren() {
		return isBarren;
	}

	public void setIsBarren(boolean isBarren) {
		this.isBarren = isBarren;
	}

	public boolean getIsSearchable() {
		return isSearchable;
	}

	public void setIsSearchable(boolean isSearchable) {
		this.isSearchable = isSearchable;
	}
	/* Getter and Setters for isBarren and setIsBarren Start */
}
