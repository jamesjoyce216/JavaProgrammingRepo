//James Joyce
package Chapter4;

import java.util.Scanner;

/**
 * Program that will compare 2 bids for a construction project
 *
 * @author James Joyce
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Get info
        //Get name of first bidder
        System.out.print("Enter First Bidder's Name: ");
        String name1 = input.next();
        //Get hours worked
        System.out.print("Enter hours worked: ");
        int hrs1 = input.nextInt();
        //Get first bidder's charge per hour
        System.out.print("Enter how much per hour: ");
        double chrg1 = input.nextDouble();
        //Get name of second bidder
        System.out.print("Enter Second Bidder's Name: ");
        String name2 = input.next();
        //Get hours worked
        System.out.print("Enter hours worked: ");
        int hrs2 = input.nextInt();
        //Get second bidder's charge per hour
        System.out.print("Enter how much per hour: ");
        double chrg2 = input.nextDouble();

        double cost1 = hrs1 * chrg1;
        double cost2 = hrs2 * chrg2;

        if (cost1 < cost2) {
            System.out.printf("Winner is: %s\n", name1);
            System.out.printf("Total cost: $%.2f\n", cost1);
        } else if (cost2 < cost1) {
            System.out.printf("Winner is: %s\n", name2);
            System.out.printf("Total cost: $%.2f\n", cost2);
        } else if ((cost1 == cost2) && (hrs2 > hrs1)) {
            System.out.printf("Winner is: %s\n", name1);
            System.out.printf("Total cost: $%.2f\n", cost1);
            System.out.printf("Hours: %.2f\n", hrs1);
        } else if ((cost1 == cost2) && (hrs1 > hrs2)) {
            System.out.printf("Winner is: %s\n", name2);
            System.out.printf("Total cost: $%.2f\n", cost2);
            System.out.printf("Hours: %.2f\n", hrs2);
        } else if ((cost1 == cost2) && (hrs2 == hrs1)) {
            System.out.printf("%s and %s have identical bids\n", name1, name2);
            System.out.printf("First Bidder's hours: %.2f/n Second Bidder's hours: %.2f/n", hrs1, hrs2);
            System.out.printf("First Bidder's cost-per-hour: $%.2f\n Second Bidder's cost-per-hour: $%.2f\n", chrg1, chrg2);
            System.out.printf("First Bidder's Total cost: %.2f/n Second Bidder's Total cost: %.2f/n");
        }

    }
}
