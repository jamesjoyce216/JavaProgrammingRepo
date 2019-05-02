/** Name: 				James Joyce
 *	Lab Section: 		L1
 *	Lecture Section:
 *	Date: 				1/28/19
 *	Assignment: 		Part II: Computing Monthly Payment on a Loan - debugging
 *	Description: 		Fix (debug) this program to perform the calculation
*/

import java.text.NumberFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Debugging {
	public static void main(String[] args){
		
		String input = JOptionPane.showInputDialog("Enter initial loan amount: ");
		int P0 = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter duration in years: ");
		int y = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter APR (percentage): ");
		double r = Double.parseDouble(input)/(12*100);
		
		double n = y * 12.0;
		double power = Math.pow(1+r, n);
		double monthlyPayment = (P0 * r * power/(power -1));
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String output = "Total Value: " + formatter.format(monthlyPayment);
		System.out.println(output);
		JOptionPane.showMessageDialog(null, output );
		}
}
