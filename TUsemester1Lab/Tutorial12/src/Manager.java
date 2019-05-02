/*
 * Name: James Joyce
 * Date: 11/5/18
 * Lab Section 1
 * Lecture Section 2 (10am-10:50am) 
 * Assignment: Tutorial 12
 * Description: Using class extend show the name, department, etc for each employee.
 */
public class Manager extends Employee 
{
	
	private double salary;
	
	public Manager(String nm, String dpt, double sal) 
	{
		super(nm, dpt);
		salary = sal;
	}

	public String toString() 
	{
		String aStr = super.toString();
		aStr = aStr + String.format("Salary = %10.2f\n", salary);
		return aStr;
	}

}
