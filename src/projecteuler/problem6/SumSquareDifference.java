package projecteuler.problem6;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumSquareDifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();
			long a = 0;
			for (long i = 1; i <= n; i++) {
				a = a + (i * i);
			}
			long b = n * (n + 1) / 2;
			b = b * b;
			System.out.println(b - a);
		}
	}
}