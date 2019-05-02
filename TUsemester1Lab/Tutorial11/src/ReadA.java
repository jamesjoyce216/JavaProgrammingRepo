
/*
 * Name: James Joyce
 * Lab Section: 1040-L1
 * Lecture Section: 1043-L2
 * Date: 10/29/18
 * Description: ReadA.java will read the text file .
 */
import java.util.Scanner;
import java.io.*;

public class ReadA 
{
	public static void main(String[] args) throws IOException 
	{
		boolean repeat;
		
		Scanner console = new Scanner(System.in);
		
		do {
			repeat = false;
			System.out.printf("Enter file name to read: ");
			String inputFile = console.next();
			
			try {
				File fileRef = new File(inputFile); // file reference.
				Scanner tokens = new Scanner(fileRef);
				
				int Nrows = tokens.nextInt();// 1st line has one token.
				int Ncols = tokens.nextInt();// 2nd line has one token.
				
				for (int ir = 0; ir < Nrows; ++ir) 
				{
					for (int jc = 0; jc < Ncols; ++jc) 
					{
						double value = tokens.nextDouble();
						System.out.printf("%10.4f", value);
					}
					System.out.printf("\n");
				}
				tokens.close();
			} catch ( IOException err ) {
				System.out.println( err.toString() );
				repeat = true;
			}
		} while ( repeat );
		console.close();
	} // end main class
} // end ReadA class