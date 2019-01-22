package projecteuler.problem9;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SpecialPythogoreanTriplet {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer numberOfTestCases = in.nextInt();
		Map<Long, Long> PythogorousTripletMap = new HashMap<Long, Long>();
		for (int i = 0; i < numberOfTestCases; i++) {
			Long n = in.nextLong();
			if (PythogorousTripletMap.containsKey(n)) {
				System.out.println(PythogorousTripletMap.get(n));
			} else {
				long maxProduct = -1;
				boolean tripletPresent = false;
				for (int a = 3; a <= Math.ceil(n / 3); a++) {
					if ((n*n - 2 * n*a) % (2*n - 2*a) == 0) {
						int b = (int) ((n*n - 2*n*a) / (2*n - 2*a));
						tripletPresent = true;
						int c = (int) (n - (a + b));
						long product = a * b * c;
						if (product > maxProduct)
							maxProduct = product;
					}
				}
				if (tripletPresent) {
					PythogorousTripletMap.put(n, maxProduct);
					System.out.println(maxProduct);
				} else {
					PythogorousTripletMap.put(n, -1L);
					System.out.println(-1);
				}
			}
		}
		in.close();
	}
}