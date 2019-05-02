
/*
 * Name: James Joyce
 * Date: 10/25/18
 * Lab Section 1 //but I was in Lab Section 3 due to reasons
 * Lecture Section 2 (10am-10:50am) 
 * Description: A program that can determine if a square, 2-dimensional array is or is not a magiy square.
 */

public class MagicSqrDriver {

	public static void main(String[] args) {
		int [][][] matrices = {
				/* matrices[0] */ { { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 } },
				/* matrices[1] */ { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } },
				/* matrices[2] */ { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 11 }},
				/* matrices[3] */ { { 1 }, { 6, 7 }, { 9, 8, 4 } },
				/* matrices[4] */ { {16, 3, 2, 13}, {5, 10, 11, 8}, { 9, 6, 7, 12}, {4, 15, 14, 1} } };

	for ( int [][] matrix : matrices )
	 {
		 MagicSquare table = new MagicSquare( matrix );
		 boolean result =  table.isAMagicSquare();
		 table.toString();
		 if (result) 
			 System.out.println("Is a Magic Square");
		 else 
			 System.out.println("Not a Magic Square");
	 }
	}
}
