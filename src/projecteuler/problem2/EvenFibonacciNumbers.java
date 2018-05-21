package projecteuler.problem2;

import java.util.Scanner;

public class EvenFibonacciNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();
			long sum = 0;
			long n1 = 1;
			long n2 = 2;
			while (n1 <= n) {
				if (n1 % 2 == 0)
					sum += n1;
				long n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
			}

			System.out.println(Long.toString(sum));
		}
	}
}
