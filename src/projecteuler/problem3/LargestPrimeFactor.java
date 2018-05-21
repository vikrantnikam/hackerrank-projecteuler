package projecteuler.problem3;

import java.util.Scanner;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();
			long i = 2;
			long high = 2;
			while (i * i <= n) {
				while (n > i && n % i == 0) {
					n = n / i;
					high = i;
				}
				i++;
			}
			if (n != 2) {
				System.out.println(n);
			} else {
				System.out.println(high);
			}
		}
		in.close();
	}
}
