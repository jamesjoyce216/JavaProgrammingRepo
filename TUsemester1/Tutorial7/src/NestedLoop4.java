import java.util.Scanner;

public class NestedLoop4 {
	public static void main(String[] args) {
		System.out.println("Enter number of output lines: ");
		Scanner console = new Scanner(System.in);
		int nR = console.nextInt();
		// nested loop goes here:
		for (int ir = nR; ir >= 0; ir--) // Outer loop
		{
			for (int ic = ir; ic > 0; ic--) // Inner loop
			{
				System.out.print('*');
			}
			System.out.println();
		}
		console.close();
	} // end main
} // end class