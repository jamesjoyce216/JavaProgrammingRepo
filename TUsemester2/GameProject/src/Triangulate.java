
/**
 * @author James Joyce
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Triangulate {

	public static void main(String[] args) {
		// settings
		int N = 10;
		boolean win = false;

		// init code

		Scanner console = new Scanner(System.in);

		boolean[][] matrix = new boolean[N][N];

		Random RNGesus = new Random();
		int target_x = RNGesus.nextInt(N - 1);
		int target_y = RNGesus.nextInt(N - 1);

		// set matrix to false
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				matrix[i][j] = false;
		// pick a random one to make true
		//matrix[target_y][target_x] = true;

		// setup as matrix to show the user the distances they have guessed...
		int[][] distanceArray = new int[N][N];

		// prompt the user for the first time
		System.out.println("Welcome to Triangulate! \n" 
						+ "Try to find the hidden item.\n"	
						+ "Please input your guess for where it is.\n" 
						+ "Input guess below: \n");

		// loop over the number of attempts
		for (int i = 0; i < 5; i++) {
			System.out.println("\nEnter x,y pair for guess below. ");
			System.out.print("Enter x value: ");
			int x = console.nextInt();
			System.out.print("Enter y value: ");
			int y = console.nextInt();

			x = x -1;
			y = y -1;
			if (matrix[y][x])
				System.out.println("\n\nYou've already used this location. Try again you nincompoop.\n");
			else{
				// check if numbers are out of bounds if so decrement i and skip if statement below
				if (x >= (N-1) || y >= (N-1)){
					i = i-1;
					System.out.println("\n\nIncorrect Number. Try again you nincompoop.\n");
				}
				else if (x == target_x && y == target_y) {
					i = 5;// causes the for loop to exit early
					win = true;// lets the code know we won
				} else {
					matrix[y][x]=true;
					int guess = distance(target_x, target_y, y, x);
					// add result to grid
					distanceArray[y][x] = guess;
					// display the grid
					System.out.println("|  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  |  10 |");
					displayGrid(distanceArray);
				}
			}
		}

		// print if the user won or lost
		if (win == true)
			System.out.println("You won!!!");
		else
			System.out.println("You lose...");

	}

	public static int distance(int target_x, int target_y, int y, int x) {
		return (int) Math.floor(Math.sqrt(Math.pow(target_x - x, 2) + Math.pow(target_y - y, 2)));
	}

	public static void displayGrid(int[][] grid) {
		int clms = 10;
		int length = 5;
		int rowLength = clms * length + clms + 1;
		final char[] array = new char[rowLength];
		Arrays.fill(array, '-');
		String rowPanel = new String(array);
		for (int i = 0; i < grid.length; i++) {
			System.out.println(rowPanel);
			for (int j = 0; j < grid[i].length; j++) {
				System.out.printf("|%" + length + "d", grid[i][j]);
				if (j == (grid[i].length - 1))
					System.out.println("|");
			}
		}
	}
}
