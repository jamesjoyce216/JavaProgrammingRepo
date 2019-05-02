
/*
 * Name: James Joyce
 * Date: 11/12/18
 * Lab Section 1
 * Lecture Section 2 (10am-10:50am) 
 * Assignment: Tutorial 13
 * Description:  Towers of Hanoi: This program will display the moves required to complete the Towers of Hanoi.
 */

import java.util.Scanner;

public class TowersDriver 
{
	public static void main(String args[]) 
	{
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the number of disks in the game: ");
		int ndisks = console.nextInt();

		int count = towers(ndisks, "Post-A", "Post-B", "Post-C");
		System.out.println("Total moves: " + count);
	}

	public static int towers(int ndisks, String pA, String pB, String pC) 
	{
		if (ndisks == 1) // base case is one disk
		{
			System.out.printf("move disk from %s to %s\n", pA, pC);
			return 1;
		} 
		else
		{
			return towers( ndisks-1, pA, pC, pB) +
					towers( 1, pA, pB, pC) +
					towers( ndisks-1, pB, pA, pC);
		}
	}
}
