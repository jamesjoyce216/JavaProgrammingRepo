package test;

public class test 
{
	public static int[] insertSort(int[] list) 
	{
		
		int npts = list.length;
		int[] tmp = new int[npts];
		tmp[0] = list[0];
		int tn = 1; // number of items in tmp[]
		
		for (int idx = 1; idx < npts; idx++) 
		{
			// A suitable test for variable ts is required. Find it.
			int ts = 0;
			while ((ts >= 0) && (list[idx] > tmp[ts])) 
			{
				++ts;
			}
			for (int jdx = tn - 1; jdx >= ts; --jdx) 
			{
				tmp[jdx + 1] = tmp[jdx]; // make a slot for the next item.
			}
			tmp[ts] = list[idx]; // insert the next item into the sorted list
			++tn; // this indicates the tmp list has one more item in it.
		}
		return tmp; // this is the sorted list.
	}
}