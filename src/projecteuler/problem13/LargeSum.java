package projecteuler.problem13;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeSum {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		scan.nextLine();
		// using BigInteger : Initializing at 0
		BigInteger finalSum = new BigInteger("0");

		for (int x = 0; x < length; x++) {
			String s = scan.nextLine();
			BigInteger val = new BigInteger(s);
			finalSum = finalSum.add(val);
		}
		System.out.println(finalSum.toString().substring(0, 10));
	}
}