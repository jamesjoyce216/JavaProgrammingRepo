import java.util.Scanner;
import javax.swing.JOptionPane;

public class bowtie {
	
	public static void main(String [] args){
		
		Scanner console = new Scanner(System.in);
		
		String prompt = "Please enter an odd-number of output-lines \n (enter zero to exit the program):";
		System.out.println(prompt);
		String input = JOptionPane.showInputDialog(prompt);
		int rows = Integer.parseInt(input);
		
		if ( ((rows % 2) == 0) ||  rows == 0 || rows < 0)
		{
			String error = "Input was equal to 0, was an even number, or was a negative number. \n\nExiting program...";
			System.out.print(error);
			JOptionPane.showMessageDialog(null, error);
			System.exit(0);
		}
		
		for (int ir = 1; ir <= rows; ir++) // Outer loop
		{
			for (int ic = 1; ic <= ir; ic++) // Inner loop
			{
				System.out.print('*');
			}
			System.out.println();
		}
        /*
		for( int i = 0; i < rows / 2; i++)
		{
			for(int j = rows - i; j < rows; j++)
			{
				String space = " ";
				System.out.print(space);
			}
			for(int j = 0; j < rows - 2 * i; j++)
			{
				String star = "*";
				System.out.print(star);
			}
			System.out.println();
		}
		
		for(int i = 0; i < (rows + 1) / 2; i++)
		{
			for(int j = 1; j <= rows / 2 - i; j++)
			{
				String space = " ";
				System.out.print(space);
				
			}
			for(int j = 0; j <= i * 2; j++)
			{
				String star = "*";
				System.out.print(star);
			}
			System.out.println();
		}*/
		
	}
}
