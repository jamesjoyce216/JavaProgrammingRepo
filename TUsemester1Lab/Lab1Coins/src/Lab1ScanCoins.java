
/*	Name: James Joyce
 * 	Lab Section: 1
 * 	Lecture Section: 2
 * 	Date: 8/23/18
 * 	Assignment: Lab 1
 * 	Description: Calculate the total of coins you have.
 */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
//imports

public class Lab1ScanCoins {

	public static void main(String[] args) {

		final double PENNY_VALUE = 0.01;
		final double NICKEL_VALUE = 0.05;
		final double DIME_VALUE = 0.1;
		final double QUARTER_VALUE = 0.25;
		final double HALF_DOLLAR_VALUE = 0.5;
		final double DOLLAR_VALUE = 1.0;
		//declaring coin amounts
		
		Scanner console = new Scanner(System.in);
		//call scanner
		
		//Ask for amounts of coins
		System.out.printf("\nHow many pennies do you have?\n");
		int pennies = console.nextInt(); //Penny amount

		System.out.printf("How many nickels do you have?\n");
		int nickels = console.nextInt(); //Nickel amount

		System.out.printf("How many dimes do you have?\n");
		int dimes = console.nextInt(); //Dime amount

		System.out.printf("How many quarters do you have?\n");
		int quarters = console.nextInt(); //Quarter amount
		
		System.out.printf("How many half-dollars do you have?\n");
		int half_dollars = console.nextInt(); //Half-dollar amount
		
		System.out.printf("How many dollars do you have?\n");
		int dollars = console.nextInt(); //Dollar amount

		double total = (pennies * PENNY_VALUE 
							+ nickels * NICKEL_VALUE 
							+ dimes * DIME_VALUE
							+ quarters * QUARTER_VALUE
							+ half_dollars * HALF_DOLLAR_VALUE
							+ dollars * DOLLAR_VALUE);
								// total value of the coins

		NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
		
		String output = "Total value = " + formatter.format(total);
		System.out.printf(output);
		//print total
	} // end main
} // end class
