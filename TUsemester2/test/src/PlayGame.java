import java.util.Arrays;
import java.util.Scanner;

public class PlayGame {
	public static void main(String[] args) {
		final int width = 5;
		final int height = 3;
		int boardXCo = 0;
		int boardYCo = 0;
		int numGuesses = 0;
		final int upperRange = 9;
		int remainingGuesses = 3;
		int distanceNum = 0;
		System.out.print("Would you like to play a game?\n" + "      Y/N");
		Scanner userInput = new Scanner(System.in);
		String playGame = userInput.next();
		if (playGame.equalsIgnoreCase("Y")) {
			System.out.print("Great! Lets get started then!\n");
			GameBase newGame = new GameBase();
			newGame.makeBaseBoard(width, height);
			boardXCo = GameBase.generateRandomInt(upperRange);
			boardYCo = GameBase.generateRandomInt(upperRange);
			
			//System.out.println(boardXCo +" "+ boardYCo);
			
			System.out.print("\nPlease enter a x coordinate\n");
			int xCoOrdinate = userInput.nextInt();
			System.out.print("Please enter a y coordinate\n");
			int yCoOrdinate = userInput.nextInt();

			while (numGuesses != 3) {
				
				if (xCoOrdinate == boardXCo && yCoOrdinate == boardYCo) {

					System.out.println("You did it!");
					break;
				} else {

					distanceNum = newGame.distanceOnGrid(boardXCo, boardYCo, xCoOrdinate, yCoOrdinate);
					System.out.print("Sorry try again.\n");
					System.out.println(" ");
					System.out.println("Remaing guesses: " + remainingGuesses);
					System.out.println("The distance to the coordinate is:" + distanceNum);
					
					numGuesses += 1;
					remainingGuesses = 3 - numGuesses;
					newGame.gameBoardSesh(xCoOrdinate, yCoOrdinate, distanceNum);
					System.out.print("Please enter a x coordinate\n");
					xCoOrdinate = userInput.nextInt();
					System.out.print("Please enter a y coordinate\n");
					yCoOrdinate = userInput.nextInt();
				}
				System.out.println("The coordinate was: " + boardXCo + "," + boardYCo);
			}
			System.out.print("Good game!");
			
		} else if (playGame.equalsIgnoreCase("N")) {
			System.out.print("Goodbye friend");
			System.exit(0);
		} else {
			System.out.print("You appear to have entered an invalid character, how very naughty of you.");
			System.exit(0);
		}
		userInput.close();

	}

}
