package Chapter2;

import java.util.Scanner;

/**
 * Program to find the price of food, the sales tax, the tip, and the total
 * amount.
 *
 * @author James Joyce
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of the meal, the price of the drink, and the price of the dessert: ");
        double meal = input.nextDouble();
        double drink = input.nextDouble();
        double dessert = input.nextDouble();

        double food = (meal + drink + dessert);
        double tax = (food * 0.1);
        double tip = (food + tax) * 0.15;

        double total = (food + tax + tip);

        System.out.println("The price of food: $" + food);
        System.out.println("The sales tax: $" + tax);
        System.out.println("The tip: $" + tip);
        System.out.println("The total amount: $" + total);

    }
}
