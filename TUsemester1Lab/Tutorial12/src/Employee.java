/*
 * Name: James Joyce
 * Date: 11/5/18
 * Lab Section 1
 * Lecture Section 2 (10am-10:50am) 
 * Assignment: Tutorial 12
 * Description: Using class extend show the name, department, etc for each employee.
 */
public class Employee {

	private String name;
	private String department;

	public Employee(String nm, String dpt) {
		name = nm;
		department = dpt;
	}

	public String toString() {
		String aStr = String.format("Name = %s\nDepartment = %s\n", name, department);
		return aStr;
	}

}

