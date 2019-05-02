
/** Name: 				James Joyce
 *	Lab Section: 		L1
 *	Lecture Section:
 *	Date: 				1/28/19
 *	Assignment: 		Part I: Converting Temperatures
 *	Description: 		Calculating the conversion between Celsius and Fahrenheit
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TempDriver {
	public static void main(String[] args) {
		// set conversion formulas
		final double Cel2Fahr = (9.0 / 5.0);
		final double Fahr2Cel = (5.0 / 9.0);

		Scanner console = new Scanner(System.in);
		System.out.println("What is the temperature in Celsius?");
		double inputCelsius = console.nextDouble();
		double tempFahrenheit = (Cel2Fahr * inputCelsius) + 32;

		String outputF = "\nIt is " + tempFahrenheit + " degrees Fahrenheit.";
		System.out.println(outputF);
		
		double tempCelsius = (tempFahrenheit - 32) * Fahr2Cel;
		
		String outputC = "\nIt is " + tempCelsius + " degrees Celsius.";
		System.out.println(outputC);
		
		JOptionPane.showMessageDialog(null, outputF );
		JOptionPane.showMessageDialog(null, outputC );
	}
}
