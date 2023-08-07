package unl.soc;

import java.util.Scanner;

/**
 * This program computes income taxes based on adjusted gross income and a child
 * tax credit.
 *
 */
public class Taxes {

	public static void main(String[] args) {

		// Scanner class for obtaining input
		Scanner s = new Scanner(System.in);

		double agi = 0.0;
		char c = 'N';
		double tax = 0.0;
		double childCredit = 0.0;
		double totalTax = 0.0;
		int numChildren = 0;

		System.out.print("Please enter your adjusted gross income (AGI): ");
		agi = s.nextDouble();

		System.out.print("Do you have any children (Y) or (N)?");
		String input = s.next();
		c = input.charAt(0);

		if (c == 'y' || c == 'Y') {
			System.out.printf("How many children do you have? ");
			numChildren = s.nextInt();
		}

		// TODO: compute the tax, child credit, and total tax here

		System.out.printf("AGI:          $%10.2f\n", agi);
		System.out.printf("Tax:          $%10.2f\n", tax);
		System.out.printf("Child Credit: $%10.2f\n", childCredit);
		System.out.printf("Total Tax:    $%10.2f\n", totalTax);

	}

}
