import java.util.Scanner;

/** Name:				James Joyce
  *	Lab Section:		L1
  *	Lecture Section:
  *	Date:				2/4/19
  *	Assignment:			CS 1043 Lab 3
  *	Description:		
*/ 

public class payRates {
	public static void main(String[] args){
		//declare variables
		int dependents;
		double hours;
		double wageRate;
		double grossPay;
		double fedTax;
		
		//open scanner
		Scanner console = new Scanner(System.in);
		
		//ask for input for hours, wage rate, and dependants
		System.out.println("How many hours worked?");
		hours = console.nextDouble();
		
		System.out.println("What is the wage rate?");
		wageRate = console.nextDouble();
		
		System.out.println("How many dependants do you have?");
		dependents = console.nextInt();
		
		//calculate gross pay
		if(hours <= 0) {
			grossPay = 0;
		}
		else if(hours <= 40){
			grossPay = wageRate * hours;
		}
		else if(hours <= 60){
			grossPay = (wageRate * 40) + (wageRate * (hours - 40) * 1.5);
		}
		else{
			grossPay = (wageRate * 40) + (wageRate * 20 * 1.5) + (wageRate * (hours - 60) * 2);
		}
		
		//federal tax rates
		fedTax = (0.1 * grossPay) - (dependents * 25);
		
		if(fedTax <= 0){
			fedTax = 0;
		}
		
		//print formatted to 24 spaces out
		System.out.printf("The Hours worked is: %23.2f \n", hours);
		System.out.printf("The Hourly Wage is: %24.2f \n", wageRate);
		System.out.printf("The Number of Dependents is: %15d \n", dependents);
		System.out.printf("The Gross income is: %23.2f \n", grossPay);
		System.out.printf("The Federal Tax withheld is: %15.2f \n", fedTax);
		System.out.printf("The Take home pay is: %22.2f \n", grossPay-fedTax);
		
		console.close();
	}
}
