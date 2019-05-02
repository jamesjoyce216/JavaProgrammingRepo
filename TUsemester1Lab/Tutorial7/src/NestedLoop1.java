/*
* Name:		James Joyce
* Lecture Section:	2
* Date: 10/1/18
* Description: Nested Loops
* The purpose of this exercise is to become familiar with nested for-loops.	
*/

import java.util.Scanner;

public class NestedLoop1 {
	public static void main(String[] args) {
		System.out.println("Enter number of output lines: ");
		Scanner console = new Scanner(System.in);
		int nR = console.nextInt();
		System.out.println("Enter the length of each lines: ");
		int nC = console.nextInt();
		// nested loop goes here:
		for (int ir = 1; ir <= nR; ir++) // Outer loop
		{
			for (int ic = 1; ic <= nC; ic++) // Inner loop
			{
				System.out.print('*');
			}
			System.out.println();
		}
		console.close();
	} // end main
} // end class