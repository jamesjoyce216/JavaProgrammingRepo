/*
 * Name: James Joyce
 * Lab Section: 1040-L1
 * Lecture Section: 1043-L2
 * Date: 10/22/18
 * Description: Contains the name and age of a single employee.
 */
public class Employee {
	private String name;
	private double age;
	private long zipCode;
	
	public Employee(String nm, double ag, long zip)
	{
		super();
		this.name = nm;
		this.age = ag;
		this.zipCode = zip;
	}
	
	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	public String getName() 
	{
		return name;
	}
	public void setName(String nm) 
	{
		this.name = nm;
	}
	public double getAge() 
	{
		return age;
	}
	public void setAge(double ag) 
	{
		this.age = ag;
	}

	@Override
	public String toString() {
		return "Employee name=" + name + ", age=" + age + ", Zip=" + zipCode + "";
	}
	
	
	
	// add a constructor, getters, setters, and toString.
} // end of the Employee object class (Employee template class)
