
/*
Author: JChildress
Title: ParseRecords.java
Description: How to use delimiters with the useDelimiter("patterns") method.
*/
import java.util.Scanner;

public class ParseRecords {
	public static void main(String[] args) {
		// This dataBase is a collection of address records:
		String[] dataBase = 
			{ 
				"Smith, John: 123 Elm St., Ithica, New York; 14851",
				"Kurtze, David: 1755 Grape Vine Ave., Fresno, CA; 94422",
				"Bewley, Renee: 413 W. Creston St., Santa Maria, CA; 93454" 
			};
		
		// The collection is an array as indicated by [] in the declaration.
		
		Scanner fields = null;
		Scanner console = new Scanner(System.in);
		
		for (String record : dataBase) // Enhanced for-loop, aka for-each loop
		{
			// Modify the delimiter patterns:
			fields = new Scanner(record).useDelimiter(": *|, *|; *");
			
			while (fields.hasNext()) // parse out the tokens.
			{
				String token = fields.next();
				System.out.printf(token + "\n");
			}
			
			if (fields != null) fields.close();
			
		} // end for-each loop until all the records are parsed.
		
		System.out.println("\nExiting program");
		if (console != null) console.close();
	} // end main
} // end class ParseRecords
