package unl.soc;

/**
 * This program determines if various years are leap years or not.
 *
 */
public class LeapYear {

	public static void main(String args[]) {

		boolean reportPass = false;
		if (args.length > 0 && args[0].equals("-reportPass")) {
			reportPass = true;
		}

		int year;
		int numPassed = 0;
		int numFailed = 0;

		// Hard-coded ad-hoc test cases
		// Do not change these, add your own test cases
		// below. All test cases should pass.

		year = 2000;
		System.out.printf("Test Case 1: year = %d: ", year);
		if (!isLeapYear(year)) {
			System.out.printf("FAILED!\n");
			numFailed = numFailed + 1;
		} else {
			System.out.printf("PASSED!\n");
			numPassed = numPassed + 1;
		}

		year = 2001;
		System.out.printf("Test Case 2: year = %d: ", year);
		if (isLeapYear(year)) {
			System.out.printf("FAILED!\n");
			numFailed = numFailed + 1;
		} else {
			System.out.printf("PASSED!\n");
			numPassed = numPassed + 1;
		}

		year = 2100;
		System.out.printf("Test Case 3: year = %d: ", year);
		if (isLeapYear(year)) {
			System.out.printf("FAILED!\n");
			numFailed = numFailed + 1;
		} else {
			System.out.printf("PASSED!\n");
			numPassed = numPassed + 1;
		}

		// TODO: write at least 3 more of your own
		// test cases here, they should all pass!

		System.out.printf("\n\n");
		System.out.printf("Summary:\n");
		System.out.printf("Number of test cases passed: %d\n", numPassed);
		System.out.printf("Number of test cases failed: %d\n", numFailed);
		System.out.printf("Percentage Passed: %.2f%%\n", (double) numPassed / (numPassed + numFailed) * 100.0);

		if (reportPass) {
			System.exit(numPassed);
		} else {
			System.exit(numFailed);
		}
	}

	/**
	 * Returns <code>true</code> if the given <code>year</code> is a leap year,
	 * <code>false</code> if it is not a leap year.
	 */
	public static boolean isLeapYear(int year) {
		// TODO: Write your logic here
		// The year is stored in the variable year
		// Your function should return true if it represents a leap year
		// and false if it does not.
	}

}
