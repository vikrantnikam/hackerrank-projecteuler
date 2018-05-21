package projecteuler.problem1;

import java.util.Scanner;

public class MultiplesOf3And5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			System.out.println(getMultipleOfN(n, 5) + getMultipleOfN(n, 3) - getMultipleOfN(n, (5 * 3)));

		}
		in.close();
	}

	private static long getMultipleOfN(int n, long val) {
		long dividend = (n - 1) / val;
		long sumofMultipleOfVal = val * dividend * (dividend + 1) / 2;
		return sumofMultipleOfVal;
	}
}
