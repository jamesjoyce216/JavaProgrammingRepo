
/* 	Name:			James Joyce
	Lab Section:	L1
	Lecture Section:
	Date:			1/14/19
	Assignment:		Lab 1
	Description:	Fix errors and finish the program.
*/

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Lab1ScanCoins {
	public static void main(String[] args) {
		
		//set final values for coins
		final double PENNY_VALUE = 0.01;
		final double NICKEL_VALUE = 0.05;
		final double DIME_VALUE = 0.1;
		final double QUARTER_VALUE = 0.25;
		final double HALF_DOLLAR_VALUE = 0.5;
		final double DOLLAR_VALUE = 1;

		Scanner console = new Scanner(System.in);

		//Pennies
		System.out.printf("\nHow many pennies do you have?\n");
		int pennies = console.nextInt();

		//Nickels
		System.out.printf("\nHow many nickels do you have?\n");
		int nickels = console.nextInt();

		//Dimes
		System.out.printf("\nHow many dimes do you have?\n");
		int dimes = console.nextInt();

		//Quarters
		System.out.printf("\nHow many quarters do you have?\n");
		int quarters = console.nextInt();

		//Half-Dollars
		System.out.printf("\nHow many half-dollars do you have?\n");
		int half_dollars = console.nextInt();

		//Dollars
		System.out.printf("\nHow many dollars do you have?\n");
		int dollars = console.nextInt();

		// total value of the coins
		double total = pennies * PENNY_VALUE + nickels * NICKEL_VALUE + dimes * DIME_VALUE + quarters * QUARTER_VALUE
				+ half_dollars * HALF_DOLLAR_VALUE + dollars * DOLLAR_VALUE;

		NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
		String output = "\nTotal value = " + formatter.format(total);
		System.out.printf(output);
		console.close();
	} // end main
} // end class