package Chapter2;

/**
 * Program to Convert Celsius to Fahrenheit
 * 
 * @author James Joyce
 */
import java.util.Scanner;

public class C2_1 
{   
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) 
    {
    	Scanner input = new Scanner(System.in);
        
        System.out.print ("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        
         // Convert Celsius to Fahrenheit
        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.println("Celsius " + celsius + " is " + fahrenheit + " in Fahrenheit");
        
    }
    
}