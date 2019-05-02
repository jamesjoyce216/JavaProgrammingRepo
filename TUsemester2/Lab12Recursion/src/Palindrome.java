
import javax.swing.JOptionPane;

public class Palindrome {

	public static void main(String[] args) {
		String msg = "Enter a palindrome to test: ";
		System.out.println(msg);
		String input = JOptionPane.showInputDialog(msg);
		//String onlyAlphaNumericInput = input.replaceAll("[^a-zA-Z0-9]", ""); 
		//String finalInput = onlyAlphaNumericInput.toLowerCase();
		
		if (Palindrome.isaPalindrome(input)) {
			msg = String.format("The input string, %s, is a palindrome: %s \n", input, reverseStr(input));
		} 
		else // the input string is NOT a palindrome.
		{
			msg = String.format("The input string, %s, is not a palindrome.\n", input);
		}
		System.out.printf(msg, input);
		JOptionPane.showMessageDialog(null, msg);
	}

	public static boolean isaPalindrome(String str) {
		String newStr = new String();
		boolean bool = false;
		for (int ix = 0; ix < str.length(); ix++) {
			char achar = str.charAt(ix);
			if (achar >= 'A' && achar <= 'Z')
				newStr += (char) ((achar) + 32);
			else if (achar >= 'a' && achar <= 'z')
				newStr += achar;
			else if (achar >= 48 && achar <= 57)
				newStr += achar;
		}
		for (int ix = 0; ix < newStr.length(); ix++) {
			if (newStr.charAt(ix) == newStr.charAt(newStr.length() - 1 - ix))
				bool = true;
			else
				bool = false;
		}
		return bool;
	}

	public static String reverseStr(String str) {
		int strL = str.length();
		String out = "";
		out += str.charAt(strL - 1);
		if (strL > 1)
			return out + reverseStr(str.substring(0, strL - 1));
		else
			return out;
	}
}