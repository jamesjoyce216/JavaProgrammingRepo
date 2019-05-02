import javax.swing.JOptionPane;
/*
 * Name: James Joyce
 * Date: 10/18/18
 * Lab Section 1
 * Lecture Section 2 (10am-10:50am) 
 * Description: Arrays
 * //I prefer doing the header this way, if this is a problem let me know please. :)
 */

public class Array {
	public static void main( String [] args )
	{
		int[] input = { 1, 9, -2, 8, -4, 7, -5, 3, 6, 0 };

		ArrayOps testObj = new ArrayOps(input);

		
		System.out.println(testObj.toString());
		String output = "index for the smallest value is: " + testObj.findMin() + "\n";
		System.out.println(output);
		JOptionPane.showMessageDialog(null, output);

		
		testObj.reverse();
		System.out.println(testObj.toString());
		output = "index for the smallest value is: " + testObj.findMin() + "\n";
		System.out.println(output);
		JOptionPane.showMessageDialog(null, output);
	}
}
