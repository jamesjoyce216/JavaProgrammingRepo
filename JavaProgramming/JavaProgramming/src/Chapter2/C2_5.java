package Chapter2;

import java.util.Scanner;

/**
 * Financial application: calculate tips
 *
 * @author James Joyce
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityrate = input.nextDouble();

        double gratuity = (gratuityrate / 100) * subtotal;
        double total = (subtotal + gratuity);

        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
    }
}
