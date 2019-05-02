/* 	Name:			James Joyce
	Lab Section:	1040-L1
	Lecture Section:1043-02
	Date:			8/30/18
	Assignment:		Part I: Converting Temperatures
	Description:	Converting input temp to Fahr, then back to Cel
*/

import java.util.Scanner;

public class TempDriver {
	
	final double CEL_FAHR = 9.0/5.0;
	final double FAHR_CEL = 5.0/9.0;
	
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Input degrees in Celsius: ");
		double c = console.nextDouble();
		
		double f = cel2Fahr(c) * c + 32;
		
		System.out.println("Your input degrees is " + f + " in Fahrenheit.");
		System.out.println("Your input degrees is " + c + " in Celsius.");
	}
	
	public static double cel2Fahr(double c){
		return c;
	}
	
	public static double fahr2Cel(double f){
		return f;
	}
}
