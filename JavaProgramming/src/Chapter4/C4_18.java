//James Joyce

package Chapter4;

/**
 * 
 * 
 * @author James Joyce
 */

import java.util.Scanner;

public class C4_18 
{
        
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String a = input.nextLine().toUpperCase();
        
        
        //Set major and year
        
        char b = a.charAt(0);
        char c = a.charAt(1);
        
            if (c == ('1') || c == ('2') || c == ('3') || c == ('4'))
            {
            switch(b)
            {
                case 'M': System.out.println("Major: Mathematics");
                    break;
                case 'C': System.out.println("Major: Computer Science");
                    break;
                case 'I': System.out.println("Major: Information Technology");
                    break;
                default: System.out.println("Invalid Input");
            }
            }
            
            if (b == ('M') || b == ('C') || b == ('I') ){
                    
            
            switch(c)
            {
                case '1': System.out.println("Year: Freshman");
                    break;
                case '2': System.out.println("Year: Sophomore");
                    break;
                case '3': System.out.println("Year: Junior");
                    break;
                case '4': System.out.println("Year: Senior");
                    break;
                default: System.out.println("Invalid Input");
            }
            }
    }
}
