/*
* Name:		James Joyce
* Section:	2
*/
import java.util.Scanner;

public class SumScores 
{
	public static void main(String[] args) 
	{
		double minVal = Double.MAX_VALUE;
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter a number or stop to exit: ");
		String input = console.next();
		
		while( ! input.equalsIgnoreCase( "stop" ) )
		{
			double value = Double.parseDouble(input);
			if (value <= minVal)
			{
				minVal = value;
			}
			System.out.print("Enter a number or stop to exit: ");
			input = console.next();
		}
		
		System.out.println("The minimum score is: " + minVal);
	} // end main
} // end class