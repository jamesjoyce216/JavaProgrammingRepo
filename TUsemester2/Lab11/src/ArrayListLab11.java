
/**
 * Name: James Joyce 
 * Lab Section: L1 
 * Date: 4/8/19 
 * Assignment: CS 1043 Lab 11
 * Description: Use a wrapper class, the ArrayList class read a list of random numbers contained in a text file.
 **/

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListLab11 {
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<Integer>();

		String fileName = "";
		if (args.length == 0) {
			System.out.println("$> java Lab11ArrayList [arg1]");
			System.exit(0);
		} else {
			fileName = args[0];
		}
		try {
			File file = new File(fileName); // open file
			Scanner object = new Scanner(file);

			int add = object.nextInt();
			data.add(add);
			while (object.hasNext()) {
				while (object.hasNextInt()) {
					add = object.nextInt();
					data.add(add);
				}
			}
		} catch (IOException err) {
			System.err.printf("File error: %s\n", "err");
			System.exit(2);
		} // end IOException handler

		for (int a : data) {
			System.out.print(a + " ");
		}
	} // end main
} // end ArrayListLab11 class