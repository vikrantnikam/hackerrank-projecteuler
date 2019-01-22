package projecteuler.problem8;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LargestProductInSeries {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            String num = in.next();
            int len = num.length() - k;
            List<Integer> list = new ArrayList<Integer>();
            for(int i=0; i<len; i++) {
                String sub = num.substring(i,i+k);
                list.add(productOfAllDigits(Integer.parseInt(sub)));
            }
            System.out.println(Collections.max(list));
        }
    }
    public static int productOfAllDigits(int n) {
        return n ==0 ? 1 : (n%10 * productOfAllDigits(n/10));
    }
     
}