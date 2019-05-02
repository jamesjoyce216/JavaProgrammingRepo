/*
 * Name: James Joyce
 * Date: 11/5/18
 * Lab Section 1
 * Lecture Section 2 (10am-10:50am) 
 * Assignment: Tutorial 12
 * Description: Using class extend show the name, department, etc for each employee.
 */
public class EmployeeDriver {
	public static void main(String[] args) 
	{
		Employee sam = new Employee("Sam", "Security");
		Manager laura = new Manager("Laura", "Accounting", 70000.00);
		Worker john = new Worker("John", "Purchasing", 22.50, 40.00);
		
		System.out.println(sam.toString());
		System.out.println(laura.toString());
		System.out.println(john.toString());
	}
}
