import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameBase {

	private String playGame;
	int rows = 10;
	int cols = 10;
	// int min = 0;
	int upperRange = 9;
	int cellLength = 5;
	int cellHeight = 3;
	int numGuesses = 0;
	int guesses;

	public static int generateRandomInt(int upperRange) {// used to generate the
															// random
															// coordinates on
															// the board
		Random random = new Random();
		return random.nextInt(upperRange);
	}

	public void makeBaseBoard(int width, int height) {// generates the first
														// array and initializes
														// the values to -1

		int[][] array = new int[10][10];

		int cols = 10;
		int k = 0;
		int rowLength = (cols * 4) + 1;
		final char[] baseArray = new char[rowLength];
		Arrays.fill(baseArray, '-');
		String rowDivider = new String(baseArray);
		System.out.print("    0   1   2   3   4   5   6   7   8   9 ");
		for (int i = 0; i < 10; i++) {

			System.out.println("");
			System.out.println("  " + rowDivider);
			for (int j = 0; j < 10; j++) {
				array[i][j] = -1;
				if (j == 0) {
					System.out.print(k + " ");
					k++;
				}
				if (array[i][j] == -1) {
					System.out.print("|" + " 0 ");
				} else {
					System.out.print("|" + array[i][j]);
				}
				if (j == 9) {
					System.out.print("|");
				}

			}
		}
		System.out.println("\n  " + rowDivider);

	}

	public void gameBoardSesh(int xCoOrdinate, int yCoOrdinate,
			int distanceAnswer) {/*
									 * this will be used from the initialized array to display where the guess is on
									 * the board
									 */
		int[][] array = new int[10][10];// i still cant figure out how to make
										// the board show multiple answers at
										// the same time.
		int distance = distanceAnswer;
		int rowLength = (cols * 4) + 1;
		int k = 0;
		final char[] baseArray = new char[rowLength];
		Arrays.fill(baseArray, '-');
		String rowDivider = new String(baseArray);
		System.out.print("    0   1   2   3   4   5   6   7   8   9 ");
		array[xCoOrdinate][yCoOrdinate] = distance;

		for (int i = 0; i < 10; i++) {

			System.out.println("");
			System.out.println("  " + rowDivider);

			for (int j = 0; j < 10; j++) {
				if (j == 0) {
					System.out.print(k + " ");
					k++;
				}
				if (array[i][j] == -1) {
					System.out.print("|" + " 0 ");
				} else {
					System.out.print("| " + array[i][j] + " ");
				}
				if (j == 9) {
					System.out.print("|");
				}

			}
		}
		System.out.println("\n  " + rowDivider);
	}

	/*
	 * public void makeBaseBoard(int width, int height) {//creates an array
	 * initialized with 0
	 * 
	 * int[][] gameboard = new int[rows][cols];
	 * 
	 * int rowLength = cols * cellLength + 11; final char[] baseArray = new
	 * char[rowLength]; Arrays.fill(baseArray, '-'); String rowDivider = new
	 * String(baseArray); for (int i = 0; i < gameboard.length; i++) {
	 * System.out.println(rowDivider); for (int j = 0; j < gameboard[i].length; j++)
	 * { System.out.printf("|%" + cellLength + "d", gameboard[i][j]); if (j ==
	 * (gameboard[i].length - 1)) System.out.println("|"); } }
	 * System.out.println(rowDivider); int[][] hiddengameboard = new
	 * int[rows][cols];
	 * 
	 * }
	 */

	public void guessingArray(int boardXCo, int boardYCo) {// checks to see if
															// the guess is
															// correct
		int xCoOrdinate = 0;
		int yCoOrdinate = 0;
		if (xCoOrdinate == boardXCo && yCoOrdinate == boardYCo) {
			System.out.print("You did it!");

		}
	}

	public int distanceOnGrid(int boardXCo, int boardYCo, int xCoOrdinate,
			int yCoOrdinate) {/*
								 * calculates the distance from the guessed point to the board chosen point
								 */
		double distanceAnswer = 0;
		int variable1 = boardXCo - xCoOrdinate;
		int variable2 = boardYCo - yCoOrdinate;
		distanceAnswer = Math.sqrt((variable1 * variable1) + (variable2 * variable2));
		distanceAnswer = Math.abs(distanceAnswer);
		Math.round(distanceAnswer);
		return (int) distanceAnswer;
	}

	/*
	 * public void makeCell(int width, int height) {//creates cell
	 * 
	 * for (int i = 0; i < height; i++) { for (int j = 0; j < width; j++) { if (i ==
	 * 0 || i == height - 1) { System.out.print("-"); } else { if (j == 0 || j ==
	 * width - 1) { System.out.print("|"); } else { System.out.print(" " ); } } }
	 * System.out.print("\n"); }
	 * 
	 * }
	 */

}
