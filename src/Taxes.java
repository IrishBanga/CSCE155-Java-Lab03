/** 
 * CSCE 155 Lab Conditionals - Java Version
 * 
 * Taxes.java
 * A program that computes taxes based on adjusted gross income and 
 * the presence of children.
 */

import java.util.Scanner;

public class Taxes {
	
	public static void main( String[] args ){
		
		// Scanner class for obtaining input
		Scanner scan = new Scanner( System.in );
		
		double agi;
		String input;
		char c = 'N';	// No children default
		double tax = 0.0;
		double childCredit = 0.0;
		double totalTax = 0.0;
		
		System.out.print( "Please enter your adjusted gross income (AGI): ");
		agi = scan.nextDouble();
		
		System.out.println();
		
		System.out.print( "Do you have any children (Y) or (N)?" );
		input = scan.next();
		c = input.charAt(0);
		
		
		// Add code to compute the tax, child credit, and total tax
		
		
		System.out.printf( "AGI: %25.2f\n", agi );
		System.out.printf( "Tax: %25.2f\n", tax);
		System.out.printf( "Child Credit: %16.2f\n", childCredit );
		System.out.printf( "Total Tax: %19.2f\n", totalTax );

	}

}
