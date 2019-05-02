import java.util.Scanner;

public class Program3 {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        
        //Declare x variable as double (1.)
        System.out.print ("Enter x variable ");
        double x = input.nextDouble();
        
        //Declare y variable as double (1.)
        System.out.print ("Enter x variable ");
        double y = input.nextDouble();
        
        //Greater than/less than statements (5-9)
        if (x < y)
            System.out.println ("The first number is less than the second. ");
        if (x > y)
            System.out.println ("The first number is greater than the second. ");
        if (x == y)
            System.out.println ("The first number is equal to the second. ");
        if (x <= y)
            System.out.println ("The first number is less than or equal to the second. ");
        if (x != y)
            System.out.println ("The first number is not equal to the second. ");
        
        //Step 10.
        if (y == 0)
            System.out.println ("Cannot divide by zero ");
        else if (x / y < 1)
            System.out.println ("Proper fraction ");
        else
            System.out.println ("Improper Fraction ");
        
        //Step 11.
        if (x >= 90)
            System.out.println ("A ");
        else if (x >= 80)
            System.out.println ("B ");
        else if (x >= 70)
            System.out.println ("C ");
        else if (x >= 60)
            System.out.println ("D ");
        else
            System.out.println ("F ");
        
        //Step 12.
        if (y >= 1 && y <= 100)
            System.out.println ("In Range ");
        else
            System.out.println ("Out of Range ");
    }
}
