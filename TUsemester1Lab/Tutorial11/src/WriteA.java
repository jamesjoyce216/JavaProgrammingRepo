
/*
 * Name: James Joyce
 * Lab Section: 1040-L1
 * Lecture Section: 1043-L2
 * Date: 10/29/18
 * Description: WriteA.java will write a text file to the project-folder.
 */
import java.io.*;
import java.util.Scanner;

public class WriteA {
	public static void main(String[] args)
	{
		final int NROWS = 8;
		final int NCOLS = 5;
		
		Scanner console = new Scanner(System.in);
		System.out.printf("Enter a file name for writing data: ");
		String outputfile = console.next();
		
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
					value = Math.pow(value, (1.0 - (ir + jc) / 10.0));
					out.printf("%12.4f", value); // Right justify
				}
				out.printf("\n");
			}
			out.close(); // close the file to empty the IO buffers.
		} 
		catch (IOException err) {
			System.out.printf(err.toString());
		}
		console.close();
	} // end main
} // end class WriteA