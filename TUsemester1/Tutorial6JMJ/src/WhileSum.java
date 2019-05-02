/*
* Name:		James Joyce
* Section:	2
*/
public class WhileSum {
	public static void main(String[] args) 
	{		
		int sentinel = 10;
		int idx = 2;
		int total = 0; // this is an accumulator
		
		// Write a while-loop to sum the even number from
		// idx = 2 to sentinel = 10.
		
		while( idx <= sentinel)
		{
			total += idx; //total = total + idx
			idx += 2; //idx = idx + 2
			
		}
		System.out.println("Total = " + total);
		System.out.println("idx = " + idx);
	}
}