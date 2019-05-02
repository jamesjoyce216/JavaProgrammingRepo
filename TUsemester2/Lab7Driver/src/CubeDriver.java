/** Name:				James Joyce
 *	Lab Section:		L1
 *	Lecture Section:
 *	Date:				2/25/19
 *	Assignment:			CS 1043 Lab 7
 *	Description:		Use a driver class for showing the color, volume, area, etc. of a cube.
*/ 

public class CubeDriver {
	public static void main( String[] args ) {
	Cube cube1 = new Cube( );
	Cube cube2 = new Cube( 30.0, 10.0, 40.0, "Orange" );
	Cube cube3 = new Cube( 10.0, 40.0, 20.0, "Blue" );
	
	cube2.setColor("Black");
	cube1.setWidth(37.0);

	System.out.println("The Surface Area of the " + cube1.getColor() + " cube is " + cube1.getArea() + " Units^2");
	System.out.println("The Surface Area of the " + cube2.getColor() + " cube is " + cube2.getArea() + " Units^2");
	System.out.println("The Surface Area of the " + cube3.getColor() + " cube is " + cube3.getArea() + " Units^2");
	
	System.out.println("\nThe Volume of the " + cube1.getColor() + " cube is " + cube1.getVolume() + " Units^3");
	System.out.println("The Volume of the " + cube2.getColor() + " cube is " + cube2.getVolume() + " Units^3");
	System.out.println("The Volume of the " + cube3.getColor() + " cube is " + cube3.getVolume() + " Units^3");
	
	System.out.print("\nThe total storage volume of all the cubes is " 
	+ (cube1.getVolume() + cube2.getVolume() + cube3.getVolume()) + " Units^3\n" );
	
	cube1.setColor("Yellow");
	cube1.setDepth(15.0);
	
	System.out.print(cube1);
	System.out.print(cube2);
	System.out.print(cube3);
	}
}
