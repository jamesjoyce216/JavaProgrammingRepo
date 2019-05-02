
/*	Name: James Joyce
 * 	Lab Section: 1
 * 	Lecture Section: 2
 * 	Date: 8/23/18
 * 	Assignment: Lab 1
 * 	Description: Calculate the total of coins you have.
 */

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane; //calls import for dialog box
//imports

public class Lab1PaneCoins {

	public static void main(String[] args) {

		final double PENNY_VALUE = 0.01;
		final double NICKEL_VALUE = 0.05;
		final double DIME_VALUE = 0.1;
		final double QUARTER_VALUE = 0.25;
		final double HALF_DOLLAR_VALUE = 0.5;
		final double DOLLAR_VALUE = 1.0;
		//declaring coin amounts
		String input = null;
		//declare String null

		//Ask for amounts of coins
		input = JOptionPane.showInputDialog("How many pennies do you have?");
		int pennies = Integer.parseInt(input); //Penny amount

		input = JOptionPane.showInputDialog("How many nickels do you have?");
		int nickels = Integer.parseInt(input); //Nickel amount

		input = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimes = Integer.parseInt(input); //Dime amount

		input = JOptionPane.showInputDialog("How many quarters do you have?");
		int quarters = Integer.parseInt(input); //Quarter amount

		input = JOptionPane.showInputDialog("How many half-dollars do you have?");
		int half_dollars = Integer.parseInt(input); //Half-dollar amount

		input = JOptionPane.showInputDialog("How many dollars do you have?");
		int dollars = Integer.parseInt(input); //Dollar amount

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
		JOptionPane.showMessageDialog(null,  output );
		//print total in dialog box
	} // end main
} // end class
