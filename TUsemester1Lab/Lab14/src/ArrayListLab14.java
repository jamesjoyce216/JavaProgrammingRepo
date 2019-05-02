
/*
 Author:James Joyce
 Date: 11/29/18
 Program Name: ArrayListLab14
 Course: Intro to Programming and Problem Solving 10-10:50 AM
 Lab Section: 11AM Lab, but had to attend 3:30PM Lab
 Assignment Lab Number: Lab 14
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class ArrayListLab14 
{
	public static void main(String[] args) 
	{
		
		//
		// 1. Instantiate an ArrayList to hold the wrapper class used for
		// integers.
		
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		// 2. Check the length of the args array. If the array is of length
		// zero, exit with a Usage message. Otherwise, assign a String variable to
		// args[0]. This is your file name passed from the command line.
		
		if (args.length == 0)
			{
				System.out.println("$> java ArrayListLab14 [arg1]");
				System.exit(1);
			}
			String filename = args[0];
		
		try 
		{ 		
				// 2. Open the data file.
			
				// 3. Instantiate an object with the Scanner class. This will be
				// used to extract the values from the input file.
		
				// 4. Read the first data value
		
				// 5. "add" (insert) the first data value into the ArrayList.
		
				// 6. Write a nested loop to read data and insert the remaining
				// data values into the ArrayList in ascending order. Because the
				// number of values in the file is unknown; and, the correct
				// location for the current value is not known, you MUST use nested while-loops.
			
			File file = new File(filename); // connect to the file
			Scanner tokens = new Scanner(file); // buffer the data
			// D:\Java Homework\TUsemester1Lab\Lab14\src\data.txt
			
			int a = tokens.nextInt();
			
			data.add(a);
			
			while(tokens.hasNextInt())
			{
				int idx = 0;
				int tokesVar = tokens.nextInt();
				while (idx <= data.size && data.get(idx) <= data)
				{
					if ()
					{
						
					}
					else
					{
						
					}
				}
			}
		} 
		
		catch (IOException err) 
		{
			System.err.printf("File error: %s\n", "err");
			System.exit(2);
		} // end IOException handler
			
		// 8. Display the ArrayList contents using an enhanced-for loop.
		
		
	} // end main
} // end ArrayListLab14 class