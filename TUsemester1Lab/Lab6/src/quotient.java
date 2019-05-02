/*	
 * 	Name: James Joyce
 * 	Lab Section: 1
 * 	Lecture Section: 2
 * 	Date: 9/27/18
 * 	Assignment: Lab 6
 * 	Description: Factor a user supplied integer value 
 */
import java.util.Scanner;

public class quotient {
	public static void main(String[] args) {
		System.out.print("Enter the dividend, a number to factor: ");
		Scanner console = new Scanner(System.in);
		int dividend = console.nextInt();
		System.out.println();
		
		do{
			System.out.print("Enter a divisor: "); // prompt for a divisor
			int divisor = console.nextInt();
			
			if ( dividend % divisor == 0)
			{
				System.out.println( divisor + " is a factor of " + dividend);
				dividend /= divisor; // reduce the dividend
				System.out.println(dividend + " is the new dividend.\n\n");
			}
			else
			{
				System.out.println(divisor + " is not a factor, try again for " + dividend + "\n\n");
			}
		}while ( dividend != 1 );
		
		System.out.println("Exiting program.");
		System.exit(0);
	}
}
