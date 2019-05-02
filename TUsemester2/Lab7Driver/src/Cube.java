/** Name:				James Joyce
 *	Lab Section:		L1
 *	Lecture Section:
 *	Date:				2/25/19
 *	Assignment:			CS 1043 Lab 7
 *	Description:		Use a driver class for showing the color, volume, area, etc. of a cube.
*/ 

public class Cube {
	// These are the declarations for the private instance fields:
	private double height;
	private double width;
	private double depth;
	private String color;

	// Begin Gets and Sets
	public String getColor() {
		return color;
	}

	public void setColor(String c) {
		color = c;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double w) {
		width = w;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double h) {
		height = h;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double d) {
		depth = d;
	}
	
	public double getArea() {
		return (2 * (height * depth) + (2 * (height * width)) + (2 * (width * depth)));
	}
	
	public double getVolume() {
		return height * width * depth;
	}
	// End gets and sets

	public Cube() // This is the no-argument constructor.
	{
		height = 14.0;
		width = 14.0;
		depth = 14.0;
		color = "Red";
	}// end of the no-argument constructor
	
	public Cube(double w, double h, double d, String c) {
		height = h;
		width = w;
		depth = d;
		color = c;
	}// end the constructor with the formal input parameters
	
	public String toString() { //toString
		String str = "\nThe Color is " + this.getColor()
					+ "\nThe Width is " + this.getWidth()
					+ "\nThe Height is " + this.getHeight()
					+ "\nThe Depth is " + this.getDepth() + "\n";
		return str;
	}// end toString
}// end Box class declaration
