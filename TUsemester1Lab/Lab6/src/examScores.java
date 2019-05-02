/*	
 * 	Name: James Joyce
 * 	Lab Section: 1
 * 	Lecture Section: 2
 * 	Date: 9/27/18
 * 	Assignment: Lab 6
 * 	Description:  Read a series of test scores from a recent test (integers in the range
 *  0 to 100) until a sentinel value is read. 
 */

import javax.swing.JOptionPane;

// Import the class that holds the min and max integer values.
public class examScores 
{
	public static void main(String args[]) 
	{
		// Declare and initialize your variables:
		int count = 0;
		int total = 0;
		double mean;
		int imin = Integer.MAX_VALUE;
		int imax = Integer.MIN_VALUE;
		String prompt = "Enter a number or enter stop or exit to end the program.";

		System.out.println(prompt);
		String inputVal = JOptionPane.showInputDialog(prompt);
		
		do
		{			
			int value = Integer.parseInt(inputVal);
			System.out.println(value);
			
			if (value <= 100) 
			{
				count++;
				total += value;
				
				if(value < imin)
					imin = value;
				
				if (imax < value)
					imax = value;
			}
			else
			{
				String error = "Number must between 0 and 100";
				System.out.println(error);
				JOptionPane.showMessageDialog(null, error);
			}

			System.out.println(prompt);
			inputVal = JOptionPane.showInputDialog(prompt);
			
		}while ((! inputVal.equalsIgnoreCase("Stop") && (! inputVal.equalsIgnoreCase("Exit"))));

		mean = total/count;
		
		String outputMSG = "The count is " + count + "\n"
							+ "The total sum is " + total + "\n"
							+ "The average is " + mean + "\n"
							+ "The Minimum Test score is " + imin + "\n"
							+ "The Maximum Test score is " + imax + "\n";
		System.out.println(outputMSG);
		JOptionPane.showMessageDialog(null, outputMSG);
	}
}
