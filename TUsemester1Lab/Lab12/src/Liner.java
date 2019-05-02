/*
 * Name: James Joyce
 * Date: 11/1/18
 * Lab Section 1 //but I was in Lab Section 3 due to reasons
 * Lecture Section 2 (10am-10:50am) 
 * Description: A program that can determine if a square, 2-dimensional array is or is not a magiy square.
 */
public class Liner extends Ship
{
	private int passengers_;
	
	public Liner(int crew, String name, int pass) 
	{
		super(crew, name);
		passengers_ = pass;
	}

	public double getpassengers_() {
		return passengers_;
	}

	public void setpassengers_(int passengers_) {
		this.passengers_ = passengers_;
	}

	public String toString() 
	{
		String aStr = super.toString();
		aStr = aStr + String.format("Passengers = %s\n", passengers_);
		return aStr;
	}	
}
