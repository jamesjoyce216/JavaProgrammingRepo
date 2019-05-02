import java.util.Scanner;

public class a5number46 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Enter String
        System.out.print("Enter your string: ");
        String s = input.nextLine();
        
        //Reverse String
        System.out.println("\nYour String reversed is: "
                +(new StringBuffer(s).reverse().toString()));
        
    }
}
