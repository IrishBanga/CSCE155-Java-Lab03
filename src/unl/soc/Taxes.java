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
		double rate=0.0;
		double fixed=0.0;
		double rem=0.0;
		childCredit=numChildren*2000;
		// TODO: compute the tax, child credit, and total tax here
		if(agi >=0 && agi<=19000){
			rem=agi-0;
			rate=.10;
		}else if(agi<=81050){
			fixed=1990;
			rem=agi-19900;
			rate=.12;
		}else if(agi<=172750){
			fixed=9328;
			rem=agi-81050;
			rate=.22;
		}else if(agi<=329850){
			fixed=29502;
			rem=agi-172750;
			rate=.24;
		}else if(agi<=418850){
			fixed=67206;
			rem=agi-329850;
			rate=.32;
		}else if(agi<=628300){
			fixed=95686;
			rem=agi-418850;
			rate=.35;
		}else{
			fixed=168933.50;
			rem=agi-628300;
			rate=.37;
		}
		tax=fixed + (rem)*rate;
		totalTax=(tax>=childCredit)?(tax-childCredit):0;
		System.out.printf("AGI:          $%10.2f\n", agi);
		System.out.printf("Tax:          $%10.2f\n", tax);
		System.out.printf("Child Credit: $%10.2f\n", childCredit);
		System.out.printf("Total Tax:    $%10.2f\n", totalTax);

	}

}
