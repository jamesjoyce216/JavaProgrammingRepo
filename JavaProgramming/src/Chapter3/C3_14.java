//James Joyce

package Chapter3;

/**
 * 
 * 
 * @author James Joyce
 */

import java.util.Scanner;

public class C3_14 
{
        
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) 
    {
        
        //Generate heads or tails
        int flip = (int)(Math.random() * 2);
        
        //Prompt for guess, 0 being heads, 1 being tails
        Scanner input = new Scanner(System.in);
        System.out.print ("Guess heads or Tails(0 or 1): ");
        int guess = input.nextInt();

        System.out.println ("Flip Results: " + flip );
        
        //Check guess
        if (guess == flip)
            System.out.println ("You Win!   Hurray!" );
        
        else 
            System.out.println ("You Failed!");
        }

}
