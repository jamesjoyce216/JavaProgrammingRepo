/*
 * Name: James Joyce
 * Date: 11/1/18
 * Lab Section 1 //but I was in Lab Section 3 due to reasons
 * Lecture Section 2 (10am-10:50am) 
 * Description: A program that can determine if a square, 2-dimensional array is or is not a magiy square.
 */

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class LabIO 
{	
	private double[][] data; // rows = data.length;
							 // cols = data[i].length;
	
	public static void main(String[] args) throws IOException 
	{
		LabIO fileTest = new LabIO();
		fileTest.readData();
		System.out.println(fileTest.toString());
		fileTest.writeData();
	}

	public void readData() throws IOException 
	{
		Scanner console = new Scanner(System.in);
		String outMsg = "Enter the input data filename: ";
		System.out.println(outMsg);
		String inFile = JOptionPane.showInputDialog(outMsg);
		
		File file = new File(inFile); // connect to the file
		Scanner tokens = new Scanner(file); // buffer the data
		// D:\Java Homework\TUsemester1Lab\Lab11\src\data.txt
		
		int nrows = tokens.nextInt(); // get the number of rows.
		int ncols = tokens.nextInt(); // get the number of cols.
		
		// 2. allocate space for the 2-d data array instance field:
		data = new double[nrows][ncols];
		
		// 3. write a nested loop to read the data into the data array.
		for (int ix = 0; ix < data.length; ix++)
		{
			for (int iy = 0; iy < data[ix].length; iy++)
			{
				data[ix][iy] = tokens.nextDouble();
			}
		}
		tokens.close(); // 4. close the file:
		
	} // end readData()
	
	public String toString()
	{
		String output = "";
		for(int ix = 0; ix < data.length; ix++)
		{
			for(int iy = 0; iy < data[ix].length; iy++)
			{
				output += String.format("%12.6f", data[ix][iy]);
			}
			output += "\n";
		}
		return output;
	}
	
	public void writeData() throws IOException 
	{
		final int NROWS = 6;
		final int NCOLS = 4;
		
		Scanner console = new Scanner(System.in);
		String outputfile = JOptionPane.showInputDialog("Enter a file name for writing data: ");
		
		try {
			FileWriter writeIt = new FileWriter(outputfile);
			PrintWriter out = new PrintWriter(writeIt);
			
			out.printf("%d\n", NROWS);
			out.printf("%d\n", NCOLS);
			for (int ir = 0; ir < NROWS; ++ir) 
			{
				double value = 100.0;
				for (int jc = 0; jc < NCOLS; ++jc) 
				{
					value = data[ir][jc];
					out.printf("%12.4f", value); // Right justify
				}
				out.printf("\n");
			}
			out.printf("\nJames Joyce\n");
			out.close(); // close the file to empty the IO buffers.
		} 
		catch (IOException err) {
			System.out.printf(err.toString());
		}
		console.close();
	} // end of writeData
} // end class