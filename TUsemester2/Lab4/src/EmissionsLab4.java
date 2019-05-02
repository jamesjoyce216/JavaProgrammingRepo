import javax.swing.JOptionPane;

/**
  * Name: James Joyce
  * Date: 02/8/2018 (Started on the 8th, Finished 2/11/19)
  * Lab Section: L1
  * Lecture Section: 
  * Assignment: Lab 4.5: Emissions Limits
  * Description: The program determines if a vehicle makes the emission limits for a list of common pollutants. 
*/

public class EmissionsLab4
{
	final static int FIRST_MILEAGE_LIMIT = 50000;
	final static int SECOND_MILEAGE_LIMIT = 100000;

	public static void main(String[] args) 
	{
		String choices = 	"1. Carbon monoxide \n"
						  + "2. Hydrocarbons \n"
						  + "3. Nitrogen oxides \n"
						  + "4. Non-methane hydrocarbons \n";
		
		//string for if input is incorrect
		String error = "What did you...? You actually broke it. \n"
				+ "I don't know how you even managed this. This was so easy! \n"
				+ "All you had to do was follow the instructions, but NO! \n"
				+ "Ok, Let's try this again. \n"
				+ "Maybe you should FOLLOW THE INSTRUCTIONS!!! \n";

		double firstGramLimit = 0.0;
		double secondGramLimit = 0.0;
		double emittedGrams = 0.0;
		int pollutantNumber;
		int odometer;
		String inputPN;
		
		inputPN = choices + "\nEnter pollutant number \n";
		System.out.println(inputPN);
		pollutantNumber = Integer.parseInt(JOptionPane.showInputDialog(inputPN));
		
		//while loop to check for error
		while(pollutantNumber < 1 || pollutantNumber > 4){
			System.out.println(error);
			JOptionPane.showMessageDialog(null, error);
			inputPN = choices + "\nEnter pollutant number \n";
			System.out.println(inputPN);
			pollutantNumber = Integer.parseInt(JOptionPane.showInputDialog(inputPN));
			}

		inputPN = "\nPollutant number: \n" + pollutantNumber
				+ "\n\nEnter grams of pollutant emitted per mile: \n";
		System.out.println(inputPN);
		emittedGrams = Double.parseDouble(JOptionPane.showInputDialog(inputPN));

		inputPN = "\nPollutant number: \n" + pollutantNumber
				+ "\n\nGrams of pollutant emitted per mile: \n" + emittedGrams
				+ "\n\nEnter odometer reading: \n";
		System.out.println(inputPN);
		odometer = Integer.parseInt(JOptionPane.showInputDialog(inputPN));

		//switch case for assigning the gram limits
		switch (pollutantNumber) 
		{
		case 1:
			firstGramLimit = 3.4;
			secondGramLimit = 4.2;
			break;
		case 2:
			firstGramLimit = 0.31;
			secondGramLimit = 0.39;
			break;
		case 3:
			firstGramLimit = 0.4;
			secondGramLimit = 0.5;
			break;
		case 4:
			firstGramLimit = 0.25;
			secondGramLimit = 0.31;
			break;
		}

		boolean result = false;
		
		//nested if to check mileage to determine if the gram limit should be used
		if (odometer < 0) 
		{
			result = true;
		} 
		else if (odometer <= FIRST_MILEAGE_LIMIT) 
		{
			if (emittedGrams > firstGramLimit) 
			{
				result = true;
			} 
			else 
			{
				result = false;
			}
		} 
		else if (odometer <= SECOND_MILEAGE_LIMIT) 
		{
			if (emittedGrams > secondGramLimit) 
			{
				result = true;
			} 
			else 
			{
				result = false;
			}
		} 
		else 
		{
			result = false;
		}
		
		//Display whether result exceeds or is within the given level
		if (result) 
		{
			System.out.println("Emissions exceed the permitted level.");
			JOptionPane.showMessageDialog(null, "Emissions exceed the permitted level.");
		} 
		else 
		{
			System.out.println("Emissions are within the permitted level.");
			JOptionPane.showMessageDialog(null, "Emissions are within the permitted level.");
		}
	}
}