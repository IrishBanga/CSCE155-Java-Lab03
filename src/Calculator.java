/* *
 * CSCE 155 Lab Conditionals - Java Version
 * 
 * Calculator.java
 * A simple menu driven program and computes a mathematical operation
 * on two operands provided from input.
 */

import java.util.Scanner;

public class Calculator {
	
	public static void main( String[] args ){
		
		Scanner operand = new Scanner( System.in );
		double a, b;
		int choice;
		
		System.out.print( "Enter operand a> " );
		a = operand.nextDouble();
		
		System.out.println();
		
		System.out.print( "Enter operand b> " );
		b = operand.nextDouble();
		
		System.out.println( "Enter the operation: " );
		System.out.println( "(1) Addition" );
		System.out.println( "(2) Subtraction" );
		System.out.println( "(3) Multiplication" );
		System.out.println( "(4) Division" );
		System.out.println( "(5) Minimum" );
		System.out.println( "(6) Power" );
		System.out.println( "(7) log_a(b)" );
		choice = operand.nextInt();
		
		// TODO: Process and display the results here
		
		
	}

}
