package frustum;

/*
 * Name: James Joyce
 * Purpose: Find volume.
 * Date: 8/27/18
 */

import java.util.Scanner;

public class FrustumDriver {
	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);

		System.out.print("Enter right-cylinder height: ");
		String input = console.next();
		double height = Double.parseDouble(input);

		System.out.print("Enter right-cylinder radius: ");
		double majRad = console.nextDouble();

		System.out.println("Volume = " + rcFrustum(height, majRad, 0.0));
		console.close();
	}

	public static double rcFrustum(double ht, double majR, double minR) 
	{
		return Math.PI * ht * (majR * majR + majR * minR + minR * minR) / 3;
	}
}