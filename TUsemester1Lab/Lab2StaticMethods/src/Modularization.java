/* 	Name:			James Joyce
	Lab Section:	1040-L1
	Lecture Section:1043-02
	Date:			8/30/18
	Assignment:		Part I: Modularization
	Description:	
*/

import java.util.Scanner;

public class Modularization {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Input the side-length of a square: ");
		double sideLength = console.nextDouble();
		
		double squareArea = squareArea(sideLength, sideLength);
		System.out.println("Area is " + squareArea);
	}
	
	public static double rectangleArea( double base, double height ){
		return ( base * height );
	}
	
	public static double squareArea( double base, double height ){
		return rectangleArea(base, height);
		}
}
