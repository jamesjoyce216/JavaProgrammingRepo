/*
 * Name: James Joyce
 * Date: 10/18/18
 * Lab Section 1
 * Lecture Section 2 (10am-10:50am) 
 * Description: Arrays
 * //I prefer doing the header this way, if this is a problem let me know please. :)
 */

public class ArrayOps 
{
	private int[] data;

	public ArrayOps(int[] input) 
	{
		data = new int[input.length];
		for (int ix = 0; ix <= input.length - 1; ix++) 
		{
			data[ix] = input[ix];
		}
	}

	public void reverse() 
	{
		for (int ix = 0; ix < data.length / 2; ix++) 
		{
			int temp = data[ix];
			data[ix] = data[data.length - 1 - ix];
			data[data.length - 1 - ix] = temp;
		}
	}

	public int findMin() 
	{
		int temp = 0;
		for (int ix = 1; ix <= data.length - 1; ix++) 
		{
			if (data[ix] < data[temp]) 
			{
				temp = ix;
			}
		}
		return temp;
	}

	public String toString() 
	{
		String str = "";
		for (int i = 0; i <= data.length - 1; i++) 
		{
			str += String.format("%d ", data[i]);
		}

		return str;
	}
}
