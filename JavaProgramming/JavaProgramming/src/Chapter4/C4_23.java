//James Joyce
package Chapter4;

import java.util.Scanner;

/**
 * Financial application: payroll
 *
 * @author James Joyce
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Enter Info

        //Enter name
        System.out.print("Enter Employee's Name: ");
        String name = input.next();
        //Enter hrs worked
        System.out.print("Enter number of Hours worked in a week: ");
        double hrsWorked = input.nextDouble();
        //Enter pay rate
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        //Enter Fed Tax rate
        System.out.print("Enter federal tax withholding rate: ");
        double fed_taxRate = input.nextDouble();
        //Enter state tax rate
        System.out.print("Enter state tax withholding rate: ");
        double state_taxRate = input.nextDouble();

        //Space
        System.out.println();

        //Find gross pay
        double grossPay = payRate * hrsWorked;
        //Find tax rates
        double fedwithhold = grossPay * fed_taxRate;
        double statewithhold = grossPay * state_taxRate;
        //Find total deduction
        double total = fedwithhold + statewithhold;
        //Find net price
        double net = grossPay - total;

        //Show output for all
        System.out.printf("Employee Name: %s\n", name);
        System.out.printf("Hours Worked: %.2f\n", hrsWorked);
        System.out.printf("Pay Rate: $%.2f\n", payRate);
        System.out.printf("Gross Pay: $%.2f\n\n", grossPay);
        System.out.printf("Deductions: \n");
        System.out.printf("\tFederal Withholding (%.2f%%): $%.2f\n", (fed_taxRate * 100), fedwithhold);
        System.out.printf("\tState Withholding (%.2f%%): $%.2f\n", (state_taxRate * 100), statewithhold);
        System.out.printf("\tTotal Deduction: $%.2f\n\n", total);
        System.out.printf("Net Pay: $%.2f ", net);

    }
}
