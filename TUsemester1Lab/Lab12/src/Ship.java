/*
 * Name: James Joyce
 * Date: 11/1/18
 * Lab Section 1 //but I was in Lab Section 3 due to reasons
 * Lecture Section 2 (10am-10:50am) 
 * Description: A program that can determine if a square, 2-dimensional array is or is not a magiy square.
 */
public class Ship 
{
	private int crew_;
	private String name_;
	
	public Ship(int crew, String name) {
		name_ = name;
		crew_ = crew;
	}
	
	public void setName_(String newName) {
		this.name_ = newName;
	}
	
	public void setCrew_(int newCrew) {
		this.crew_ = newCrew;
	}
	
	public String getName_() {
		return name_;
	}
	
	public int getCrew_() {
		return crew_;
	}

	public String toString() {
		String aStr = String.format("Crew = %s\nName = %s\n", crew_, name_);
		return aStr;
	}
}
