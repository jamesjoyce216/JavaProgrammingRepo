/*
 * Name: James Joyce
 * Date: 11/1/18
 * Lab Section 1 //but I was in Lab Section 3 due to reasons
 * Lecture Section 2 (10am-10:50am) 
 * Description: A program that can determine if a square, 2-dimensional array is or is not a magiy square.
 */
public class Freighter extends Ship
{
	private double capacity_;
	
	public Freighter(int crew, String name, double cap) 
	{
		super(crew, name);
		capacity_ = cap;
	}
	
	public double getCapacity_() {
		return capacity_;
	}

	public void setCapacity_(double capacity_) {
		this.capacity_ = capacity_;
	}

	public String toString() 
	{
		String aStr = super.toString();
		aStr = aStr + String.format("Capacity = %s\n", capacity_);
		return aStr;
	}
}
