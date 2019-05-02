
import java.util.Scanner;

public class p6JamesJoyce {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //set var for Euros, Pounds, and Yen
        
        //Euro conv rate
        System.out.print("How many Euros will a dollar will buy: ");
        double euro = input.nextDouble();
        
        //Pound conv rate
        System.out.print("How many Pound Sterling will a dollar will buy: ");
        double lbSterling = input.nextDouble();

        //Yen conv rate
        System.out.print("How many Yen will a dollar will buy: ");
        double yen = input.nextDouble();

        //set string for yes/no
        String anyMore = "";
        
        //set loop for converting
        while (!anyMore.equalsIgnoreCase("no")) {
         
            //Dollars for use
            System.out.print("Enter dollar amount: $");
            double $ = input.nextDouble();
            
            //ask which to convert
            System.out.print("Enter \"E\" to convert to Euros, \"P\" to convert to Pounds, or \"Y\" to convert to Yen: ");
            String convTO = input.next().toUpperCase();
            
            //switch displaying conversion
            switch (convTO){
                
                //set case for Euros
                case "E":
                    double euroExchanged = conversion($, euro);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Euros.\n", $, euroExchanged);
                    break;
                    
                //set case for Pounds Sterling
                case "P":
                    double poundExchanged = conversion($, lbSterling);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Pounds Sterling.\n", $, poundExchanged);
                    break;
                    
                //set case for Yen
                case "Y":
                    double yenExchanged = conversion($, yen);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Yen.\n", $, yenExchanged);
                    break;
                    
            }
            
            //set do while loop for yes/no
            do{
                
            //ask if there are more conv
            System.out.println("Are there any more conversions?");
            anyMore = input.next().toLowerCase();
            
            }  while (!anyMore.equalsIgnoreCase("Yes") && !anyMore.equalsIgnoreCase("No"));
        }

    }
    
    //set method for converting
    public static double conversion(double dollars, double currency) {
        
       //if more than $100
       if (dollars > 100){
           double exchangeFee = 0.05 * dollars;
           return (dollars - exchangeFee) * currency;
       }
       
       //if less than $100
       else {
           double exchangeFee = 0.1 * dollars;
           return (dollars - exchangeFee) * currency;
       }
     
    }

}