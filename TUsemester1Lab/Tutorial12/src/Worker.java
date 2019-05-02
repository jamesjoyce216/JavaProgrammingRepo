/*
 * Name: James Joyce
 * Date: 11/5/18
 * Lab Section 1
 * Lecture Section 2 (10am-10:50am) 
 * Assignment: Tutorial 12
 * Description: Using class extend show the name, department, etc for each employee.
 */
public class Worker extends Employee 
{
	private String name;
	private String department;
	private double wage;
	private double hrsWorked;

	public Worker(String nm, String dpt, double wg, double hrs) 
	{
		super(nm, dpt);
		wage = wg;
		hrsWorked = hrs;
	}

	public String toString() 
	{
		String aStr = super.toString();
		aStr = aStr + String.format("Wage = %18.2f\n", wage);
		aStr = aStr + String.format("Hours Worked = %10.2f\n", hrsWorked);
		return aStr;
	}	
}
