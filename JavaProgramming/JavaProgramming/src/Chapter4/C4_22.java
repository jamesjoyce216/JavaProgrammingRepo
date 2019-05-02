//James Joyce
package Chapter4;

import java.util.Scanner;

/**
 * Check substring
 *
 * @author James Joyce
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Enter s1 variable
        System.out.print("Enter s1: ");
        String s1 = input.next();
        //Enter s2 variable
        System.out.print("Enter s2: ");
        String s2 = input.next();
        //Test if s2 is within s1
        if (s1.contains(s2)) {
            System.out.print(s2 + " is a substring of " + s1 + " ");
        } else {
            System.out.print(s2 + " is not a substring of " + s1 + " ");
        }

    }
}
