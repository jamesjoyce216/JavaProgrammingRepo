import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;


public class Lab1PaneCoins {

	public static void main(String[] args) {
		// set final values for coins
		final double PENNY_VALUE = 0.01;
		final double NICKEL_VALUE = 0.05;
		final double DIME_VALUE = 0.1;
		final double QUARTER_VALUE = 0.25;
		final double HALF_DOLLAR_VALUE = 0.5;
		final double DOLLAR_VALUE = 1;
		String input = null;

		// Pennies
		input = JOptionPane.showInputDialog("\nHow many pennies do you have?\n");
		int pennies =  Integer.parseInt( input );

		// Nickels
		input = JOptionPane.showInputDialog("\nHow many nickels do you have?\n");
		int nickels =  Integer.parseInt( input );

		// Dimes
		input = JOptionPane.showInputDialog("\nHow many dimes do you have?\n");
		int dimes =  Integer.parseInt( input );

		// Quarters
		input = JOptionPane.showInputDialog("\nHow many quarters do you have?\n");
		int quarters =  Integer.parseInt( input );

		// Half-Dollars
		input = JOptionPane.showInputDialog("\nHow many half-dollars do you have?\n");
		int half_dollars =  Integer.parseInt( input );

		// Dollars
		input = JOptionPane.showInputDialog("\nHow many dollars do you have?\n");
		int dollars =  Integer.parseInt( input );

		// total value of the coins
		double total = pennies * PENNY_VALUE + nickels * NICKEL_VALUE + dimes * DIME_VALUE + quarters * QUARTER_VALUE
				+ half_dollars * HALF_DOLLAR_VALUE + dollars * DOLLAR_VALUE;

		NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
		String output = "\nTotal value = " + formatter.format(total);
		System.out.printf(output);
		JOptionPane.showMessageDialog(null, output );
	} // end main
} // end class