//James Joyce

import java.util.Scanner;

public class TaxDriver 
{
	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter marriage status as single or married: ");
		String mStat = console.next();
		// M or m for married, s or S for single (use equalsIgnoreCase)
		
		System.out.print("Enter income: ");
		double income = console.nextDouble();
		if( income < 0 ) income = 0;
		
		double tax = computeTax(mStat, income);
		System.out.println("Tax is: " + tax);
	}

	public static double computeTax(String status, double income) 
	{
		double tax;
		if ( status.equalsIgnoreCase("single") ) 
		{
			if(income <= 21450.)
			{
				tax = 0.15 * income;
			}
			else if(income <= 51900.)
			{
				tax = 3217.5 + .28 *(income - 21450);
			}
			else
			{
				tax = 11743.5 + .31 * (income - 51900);
			}
		}
		else
		{
			if(income <= 35800.)
			{
				tax = 0.15 * income;
			}
			else if(income <= 86500.)
			{
				tax = 5370. + .28 * (income - 35800.);
			}
			else
			{
				tax = 19566. + .31 * (income - 86500.);
			}
		}
		return tax;
	}
}