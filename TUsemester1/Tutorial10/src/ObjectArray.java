/*
 * Name: James Joyce
 * Lab Section: 1040-L1
 * Lecture Section: 1043-L2
 * Date: 10/22/18
 * Description: Build a database using an array of objects.
 */
import javax.swing.JOptionPane;
import java.util.Scanner;

public class ObjectArray {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		String prompt = "Enter name and age, as in: 'name, age, zip' ";

		final int MAX_NAMES = 500;
		Employee[] employeeDB = new Employee[MAX_NAMES]; // instantiate the database.
		String record = new String("");
		Scanner fields = null;
		boolean next = true;
		
		int nWorkers = 0;
		while (nWorkers < MAX_NAMES && next) 
		{
			System.out.print(prompt); // show in the console panel.
			record = JOptionPane.showInputDialog(prompt);
			System.out.println(record); // show in the console panel.

			if (record.length() > 0) // test for an empty string
			{
				fields = new Scanner(record);

				String name = (fields.useDelimiter(", *")).next();
				if (!fields.hasNext()) 
				{
					System.err.print("Missing token."); // print to stderr.
					System.exit(-1); // exit the program with an error code.
				}
				double age = fields.nextDouble();
				long zip = fields.nextLong();

				employeeDB[nWorkers] = new Employee( name, age, zip );
				nWorkers++;
			} else {
				System.out.println("");
				next = false; // exit the loop
			} // end if statement
		} // end while loop

		// Display the database:
		// Write an enhanced for-loop aka the for-each loop to replace this:
		for ( Employee worker :	employeeDB)
		{
			if ( worker == null ) 
				break;
			
			System.out.println( worker.toString() );
		}
		fields.close();
		console.close();
	} // end main body

} // end class body