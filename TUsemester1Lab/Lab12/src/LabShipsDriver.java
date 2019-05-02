/*
 * Name: James Joyce
 * Date: 11/8/18
 * Lab Section 1
 * Lecture Section 2 (10am-10:50am) 
 * Assignment: Lab 12
 * Description: Inheritance and Polymorphism with boats.
 */
import javax.swing.JOptionPane;

public class LabShipsDriver 
{
	public static void main(String[] args) 
	{
		String name = JOptionPane.showInputDialog("Please enter ship name: ");

		int crew = Integer.parseInt(JOptionPane.showInputDialog("Please enter the crew complement: "));
		String type = JOptionPane.showInputDialog(
						"Is the ship a Freighter or a Liner?\n" 
						+ "Enter 'F' for Freighter, or 'L' for Liner: ");
		
		if (type.equalsIgnoreCase("f")) // for a ship of type: Freighter.
		{
			double cap = Double.parseDouble(JOptionPane.showInputDialog("Please enter your freight capacity in tons:\n"));
			Freighter aship = new Freighter(crew, name, cap);
			System.out.println(aship.toString());

			System.out.printf("Please change the crew number: \n");
			System.out.printf("Please change the ship capacity: \n");
			/* display all the instance variables after the changes here */
			
			crew = Integer.parseInt(JOptionPane.showInputDialog("Please enter the crew complement: \n"));
			aship.setCrew_(crew);
			
			cap = Double.parseDouble(JOptionPane.showInputDialog("Please enter your freight capacity in tons:\n"));
			aship.setCapacity_(cap);
			
			System.out.println(aship.toString());
		} 
		else 
		{ // Repeat the above for a ship of type Liner in the else block.
			int pass = Integer.parseInt(JOptionPane.showInputDialog("Please enter your freight passenger amount:\n"));
			Liner aship = new Liner(crew, name, pass);
			System.out.println(aship.toString());
			
			System.out.printf("Please change the crew number: \n");
			System.out.printf("Please change the ship passengers: \n");
			/* display all the instance variables after the changes here */
			
			crew = Integer.parseInt(JOptionPane.showInputDialog("Please enter the crew complement: \n"));
			aship.setCrew_(crew);
			
			pass = Integer.parseInt(JOptionPane.showInputDialog("Please enter your freight passenger in tons:\n"));
			aship.setpassengers_(pass);
			
			System.out.println(aship.toString());
		}
	} // end main
} // end class