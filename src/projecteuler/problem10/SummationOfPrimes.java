package projecteuler.problem10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class SummationOfPrimes {

	public static void main(String[] args) {
		int n = 1000000;
		boolean[] primeNumbers = new boolean[n + 1];
		Arrays.fill(primeNumbers, true);
		primeNumbers[0] = false;
		primeNumbers[1] = false;
		int i = 2;
		// while (i*i <= n) {
		while (i <= Math.sqrt(n)) {
			if (primeNumbers[i]) {
				int j = i * i;
				int k = 1;
				if (primeNumbers[j]) {
					while (j <= n) {
						primeNumbers[j] = false;
						j = (i * i) + (k * i);
						k++;
					}
				}
			}
			i++;
		}
		HashMap<Integer, Long> allSums = new LinkedHashMap<Integer, Long>();

		long sum = 0;
		for (int m = 2; m < primeNumbers.length - 1; m++) {
			if (primeNumbers[m]) {
				sum += m;
				allSums.put(m, sum);
			} else {
				allSums.put(m, sum);
			}
		}
		allSums.put(n, sum);
		// System.out.println(sum);
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int num = in.nextInt();
			System.out.println(allSums.get(num));
		}
	}
}
