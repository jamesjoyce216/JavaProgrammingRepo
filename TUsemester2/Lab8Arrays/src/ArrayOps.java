/**
 * Name: James Joyce 
 * Lab Section: L1 
 * Date: 3/11/19 
 * Assignment: CS 1043 Lab 8
 * Description: Template for testing array operations
 **/

public class ArrayOps {
	int[] data;

	public ArrayOps(int[] input) {
		data = new int[input.length];
		for (int ix = 0; ix <= input.length - 1; ix++) {
			data[ix] = input[ix];
		}
	}

	public String toString() {
		String str = "";
		for (int i = 0; i <= data.length - 1; i++) {
			str += String.format("%d ", data[i]);
		}

		return str;
	}

	public void reverse() {
		for (int ix = 0; ix < data.length / 2; ix++) {
			int temp = data[ix];
			data[ix] = data[data.length - 1 - ix];
			data[data.length - 1 - ix] = temp;
		}
	}

	public int findMin() {
		int temp = 0;
		for (int ix = 1; ix <= data.length - 1; ix++) {
			if (data[ix] < data[temp]) {
				temp = ix;
			}
		}
		return temp;
	}
}
