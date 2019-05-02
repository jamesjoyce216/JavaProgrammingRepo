import java.util.Scanner;

public class NestedLoop5 {
	public static void main(String[] args) {
		System.out.println("Enter number of output lines: ");
		Scanner console = new Scanner(System.in);
		int nR = console.nextInt();
		int nS = 0;
		// nested loop goes here:
		for (int ir = nR; ir >= 0; ir--) // Outer loop
		{
			for (int is = nS; is > 0; is--)
			{
				System.out.print(" ");
			}
			for (int ic = ir; ic > 0; ic--) // Inner loop
			{
				System.out.print('*');
			}
			System.out.println();
			nS++;
		}
		console.close();
	} // end main
} // end class