/* 	Name:			James Joyce
	Lab Section:	1040-L1
	Lecture Section:1043-02
	Date:			10/11/18
	Assignment:		LAB 8 Generate a Table
	Description:	l output a table of monthly payments from an initial loan amount over a range of 15 to 30 years in 5 year increments for several different interest rates.
*/
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.text.Format;

public class LoanPayment 
{
	public static void main(String []args)
	{
		String input = null;
		input = JOptionPane.showInputDialog("How much was your initial loan?");
		double intloan = Double.parseDouble(input);
		input = JOptionPane.showInputDialog("What is the annual-interest rate?");
		double APR = Double.parseDouble(input);
		input = JOptionPane.showInputDialog("What is your loan duration (in years)?");
		double LoanYears = Double.parseDouble(input);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String output = "Your monthly payment is " + formatter.format(MonthlyPayment (intloan, APR, LoanYears * 12));
		JOptionPane.showMessageDialog(null, output);
		
		System.out.printf( "", "Rate");
	}

	public static double MonthlyPayment(double P, double APR, double n)
		{
		double r = APR/(12.0 * 100.0);
		
		return P * r * Math.pow( 1 + r, n) / (Math.pow( 1 + r, n) - 1);	
		}
}