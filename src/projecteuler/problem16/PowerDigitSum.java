package projecteuler.problem16;

import java.math.BigInteger;
import java.util.Scanner;

public class PowerDigitSum {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			/*
			 * long pow = 2L; for (int j =1; j < n ; j++){ pow = pow*2; }
			 */
			System.out.println(powerDigitSum(n));

		}
	}

	private static int powerDigitSum(int n) {
		String powString = BigInteger.valueOf(2).pow(n) + "";
		int result = 0;
		for (int i = 0; i < powString.length(); i++) {
			result += powString.charAt(i) - '0';
		}
		// return sumOfDigits(Integer.valueOf(powString));
		return result;
	}

	private static int sumOfDigits(int n) {
		return n == 0 ? 0 : (n % 10 + sumOfDigits(n / 10));
	}
}