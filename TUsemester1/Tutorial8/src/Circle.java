/*
 * Name: James Joyce
 * Lab Section 1040-L1
 * Lecture Section 1043-02
 * Date: 10/8/18
 * Assignment: Tutorial 8 - SphereDriver
 * Description: Demonstrate how the toString() works with String.format().
 */

public class Circle {
	private double radius;

	public Circle() {
		radius = 1.0;
	} // unit circle

	public Circle(double rad) {
		radius = rad;
	}

	public Circle(Circle input) {
		radius = input.getRadius();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double rad) {
		radius = rad;
	}

	public String toString() // add diameter, area, and circumference.
	{
		String str = String.format("%22s %-8.3f\n", " Circle radius =", radius);
		str += String.format	  ("%22s %-8.3f\n", " Circle Diameter = ", 2*radius);
		str += String.format	  ("%22s %-8.3f\n", " Circle Area = ", Math.PI*radius*radius);
		str += String.format 	  ("%22s %-8.3f\n", "Circle Circumference = ", 2*Math.PI*radius);

		return str;
	} // end toString

} // end Circle class