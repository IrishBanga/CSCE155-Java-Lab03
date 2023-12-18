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

		do {
			System.out.println("Enter the operation: ");
			System.out.println("(1) Addition");
			System.out.println("(2) Subtraction");
			System.out.println("(3) Multiplication");
			System.out.println("(4) Division");
			System.out.println("(5) Minimum");
			System.out.println("(6) log_a(b)");
			System.out.println("(7) QUIT PROGRAM");

			choice = s.nextInt();
			if (choice == 1) {
				System.out.printf("%f\n", a + b);
			} else if (choice == 2) {
				result = a - b;
				System.out.printf("%f\n", result);
			} else if (choice == 3) {
				result = a * b;
				System.out.printf("%f\n", result);
			} else if (choice == 4) {
				if (b != 0) {
					result = a / b;
					System.out.printf("%f\n", result);
				} else {
					System.out.printf("ERROR: Division by zero\n");
				}
			} else if (choice == 5) {
				System.out.printf("%f is the minimum value\n", Math.min(a, b));
			} else if (choice == 6) {
				if (a > 0 && b > 0) {
					result = Math.log(a) / Math.log(b);
					System.out.printf("%f\n", result);
				} else {
					System.out.printf("ERROR: Both the numbers must be positive!\n");
				}
			}  else if (choice == 7) {
					System.out.printf("Quitting the program!\n");
			} else {
				System.out.println("Please input a valid operator next time\n");
			}
		} while (choice != 7);
	}

}
