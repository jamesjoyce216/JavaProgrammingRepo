/*	Name: James Joyce
 * 	Lab Section: 1
 * 	Lecture Section: 2
 * 	Date: 9/6/18
 * 	Assignment: Lab 3
 * 	Description: 
 */
public class Box
{
	// These are the declarations for the private instance fields:
	 private double height;
	 private double width;
	 private double depth;
	 private String color;
	 
	 double volume = height * width * depth;
	 double surfaceArea = (2 * (height * depth) + (height * width) + (width * depth));
	 
	 //Begin Gets and Sets
	 public double getHeight(){
		 return height;
	 }
	 
	 public void setHeight(double ht){
		 height = ht;
	 }
	 
	 public double getWidth(){
		 return width;
	 }
	 
	 public void setWidth(double wd){
		 width = wd;
	 }
	 
	 public double getDepth(){
		 return depth;
	 }
	 
	 public void setDepth(double dp){
		 depth = dp;
	 }
	 
	 public String getColor(){
		 return color;
	 }
	 
	 public void setColor(String cl){
		 color = cl;
	 }
	 //End gets and sets
	 
	 public Box( ) // This is the no-argument constructor.
	 {
		 height = 12.0;
		 width = 12.0; 
		 depth = 12.0;
		 color = "White";
	 } // end of the no-argument constructor

	 public Box(double ht, double wd, double dp, String cl){
		 height = ht;
		 width = wd;
		 depth = dp;
		 color = cl;
	 }
	 
	 public Box(Box bx)
	 {
		 height = bx.getHeight();
		 width = bx.getWidth();
		 depth = bx.getDepth();
		 color = bx.getColor();
	 } // end the constructor with the formal input parameters

	 
	 public String toString()
	 {
		 String str = "The box color is " + this.getColor() + "\n" +
			 		"The Volume is";
		 return str;
	 }
	}// end Box class declaration 