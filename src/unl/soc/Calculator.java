package unl.soc;

import java.util.Scanner;

/**
 * A simple menu driven program and computes a mathematical 
 * operation on two operands provided from interactive input.
 */
public class Calculator {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		double a, b, result;
		int choice;

		System.out.print("Enter operand a> ");
		a = s.nextDouble();

		System.out.print("Enter operand b> ");
		b = s.nextDouble();

		System.out.println("Enter the operation: ");
		System.out.println("(1) Addition");
		System.out.println("(2) Subtraction");
		System.out.println("(3) Multiplication");
		System.out.println("(4) Division");
		System.out.println("(5) Minimum");
		System.out.println("(6) log_a(b)");
		choice = s.nextInt();

		if (choice == 1) {
			System.out.printf("%f", a + b);
		} else if (choice == 2) {
			result = a - b;
			System.out.printf("%f", result);
		} else if (choice == 3) {
			// TODO: handle this case (multiplication)
		} else if (choice == 4) {
			// TODO: handle this case (division)
		} else if (choice == 5) {
			// TODO: handle this case (minimum)
		} else if (choice == 6) {
			// TODO: handle this case (log_a(b))
		} else {
			System.out.println("Please input a valid operator next time");
		}
	}

}
