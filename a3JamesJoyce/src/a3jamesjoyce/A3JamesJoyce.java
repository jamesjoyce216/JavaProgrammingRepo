import java.util.Scanner;

public class A3JamesJoyce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Enter weight and price of 1
        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        
        //Enter weight and price of 2
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        
        //Find cost of each
        double cost1 = (weight1 / price1);
        double cost2 = (weight2 / price2);
        
        //Compare costs
        if (cost1 > cost2)
            System.out.print ("Package 1 has better price. ");
        else if (cost1 < cost2)
            System.out.print ("Package 2 has better price. ");
        else if (cost1 == cost2)
            System.out.print ("Package 1 and Package 2 have the same price. ");
        
    }
}
