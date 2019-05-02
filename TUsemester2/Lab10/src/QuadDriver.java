
/**
 * Name: James Joyce 
 * Lab Section: L1 
 * Date: 3/25/19 
 * Assignment: CS 1043 Lab 10
 * Description: implementing the given hierarchy as classes in Java
 **/

public class QuadDriver {
	public static void main(String[] args){
		Quadrilateral quad1 = new Quadrilateral(1, 2, 3, 4, 135, 45, 135, 45);
		Quadrilateral quad2 = new Parallelogram(2, 4);
		Quadrilateral quad3 = new Rectangle(3, 6);
		Quadrilateral quad4 = new Square(5);
		System.out.println(quad1.toString());
		System.out.println(quad2.toString());
		System.out.println(quad3.toString());
		System.out.println(quad4.toString());
	}
}
