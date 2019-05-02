
/*
 * Name: James Joyce
 * Purpose: Convert Miles to Km and Km to Miles
 * Date: 8/27/18
 */

import java.util.Scanner;

public class Conversions 
{
	final static double MILES2KM = 1.609;
	// set global conversion number
	
	public static void main(String[] args) 
	{
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter a distance in miles: ");
		//ask for distance in miles
		
		double miles = console.nextDouble();
		double km = Miles2KM(miles);
		//multiply conversion number by miles
		
		System.out.println(km);
		//print new number in km
		
		console.close();
	}
	
	public static double Miles2KM(double inMiles)  
	{
		return inMiles*MILES2KM;
	}
}
