/**
 * Name: James Joyce
 * Lab Section: L1 
 * Date: 3/11/19 
 * Assignment: CS 1043 Lab 8
 * Description: Contains the main method for testing your program
 **/

public class ArrayTests {
	public static void main(String[] args) {
		int[] input = { 1, 9, -2, 8, -4, 7, -5, 3, 6, 0 };

		ArrayOps testObj = new ArrayOps(input);

		System.out.println(testObj.toString());
		String output = "index for the smallest value is: " + testObj.findMin() + "\n";
		System.out.println(output);

		testObj.reverse();
		System.out.println(testObj.toString());
		output = "index for the smallest value is: " + testObj.findMin() + "\n";
		System.out.println(output);
	}
}
