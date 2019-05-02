/*
 * Name: James Joyce
 * Date: 11/26/18
 * Lab Section 1
 * Lecture Section 2 (10am-10:50am) 
 * Assignment: Tutorial 14
 * Description: Merge Sort: using the merge sort algorithm, have the algorithm sort a series of numbers given.
 */

public class MergeSort 
{
	public static void main(String[] args) 
	{
		int[] data = { 19, 29, 5, 73, 43, 97, 23, 59 };
		
		mergeSort(data, 0, data.length - 1);
		
		for (int xval : data) 
			System.out.printf("%8d", xval);

		System.out.println();
	}

	public static void mergeSort(int values[], int start, int end) 
	{
		if (start < end) // not the base case
		{
			int mid = (start + end) / 2; // reduction
			
			mergeSort(values, start, mid); // recursion
			mergeSort(values, mid + 1, end); // recursion
			
			merge(values, start, mid, end); // merge the two sorted halves.
			
		} // base case: otherwise there is nothing to sort!
		
	} // end recursive mergeSort

	public static void merge(int values[], int start, int mid, int end) 
	{
		int n = end - start + 1;
		
		int[] tmp = new int[n]; // create a temporary storage array.
		
		int i1 = start; // index for first half.
		int i2 = mid + 1; // index for second half.
		
		int j = 0; // index for the tmp array;
		
		while (i1 <= mid && i2 <= end) // move data and pointers
		{
			if (values[i1] < values[i2]) 
			{
				tmp[j] = values[i1];
				++i1; // advance the left side pointer.
			} 
			else 
			{
				tmp[j] = values[i2];
				++i2; // advance the right side pointer.
			}
			++j; // advance the tmp array pointer
		} // end while
		
		// only one of the two remaining while loops will execute.
		
		while (i1 <= mid) // merge remaining left-side values.
		{
			tmp[j] = values[i1];
			++i1;
			++j;
		} // end while
		
		while (i2 <= end) // merge remaining right-side values.
		{
			tmp[j] = values[i2];
			++i2;
			++j;
		} // end while
		
		// Copy sorted tmp data back to the original input array.
		for (j = 0; j < n; j++) 
			values[start + j] = tmp[j];
	} // end merge method
}
