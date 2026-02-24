package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Ejercicio Java Lambda Expressions
// https://www.hackerrank.com/challenges/java-lambda-expressions/problem?isFullScreen=true

public class LambdaExpressionsVic {

    @SuppressWarnings("static-access")
    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            switch (ch) {
                case 1 -> {
                    op = ob.isOdd();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "ODD" : "EVEN";
                }
                case 2 -> {
                    op = ob.isPrime();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PRIME" : "COMPOSITE";
                }
                case 3 -> {
                    op = ob.isPalindrome();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
                }
                default -> {
                }
            }
            System.out.println(ans);
        }
    }
}

interface PerformOperation {

    boolean check(int a);
}

class MyMath {

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    static PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return n -> {
            if(n == 0 || n == 1) return false;
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return n -> {
            String nText = String.valueOf(n);
            String inverseText = "";

            for (int i = nText.length() - 1; i >= 0; i--) {
                inverseText += nText.charAt(i);
            }
            return nText.equals(inverseText);

        };
    }

}
