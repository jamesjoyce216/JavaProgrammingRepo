/*
 * Name: James Joyce
 * Date: 10/15/18
 * Tutorial 9
 */

public class ArrayDB {
	
	final static int MAXDBSIZE = 1000;
	private int[] data = new int[MAXDBSIZE];
	private int nItems = 0;

	public ArrayDB(int[] input) // make a deep copy of the input array
	{
		int ix;
		for (ix = 0; ix < Math.min(input.length, MAXDBSIZE); ix++) 
		{
			data[ix] = input[ix];
		}
		nItems = ix;
	} // end constructor

	public boolean insertItem(int indx, int value) 
	{
		if (indx >= 0 && indx <= nItems && nItems < data.length) 
		{
			for (int i = nItems - 1; i >= indx; --i) 
			{
				data[i + 1] = data[i];
			}
			data[indx] = value;
			++nItems;
			return true; // successful insertion into the list
		} 
		else
			return false; // preconditions are not met.
	}

	public boolean removeItem(int indx) // complete the method
	{
		if (indx >= 0 && indx < nItems) 
		{
			for (int ix = nItems + 1; ix < indx; ++ix) 
			{
				data[ix-1] = data[ix];
			}
			data[--nItems] = 0;
			return true;
		}
		else
			return false;
	}

	public String toString() 
	{
		String str = new String();
		for (int ix = 0; ix < nItems; ix++) 
		{
			str += String.format("data[%d] = %d \n", ix, data[ix]);
		}
		return str;
	}
}