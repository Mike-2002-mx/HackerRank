package org.example;

import java.math.BigInteger;
import java.util.Scanner;

// Ejercicio sacado de
// https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true
// Java BigInteger

// In this problem, you have to add and multiply huge numbers! These numbers are so
// big that you can't contain them in any ordinary data types like a long integer.
// Use the power of Java's BigInteger class and solve this problem.

public class BigIntegerVic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger num1 = new BigInteger(sc.nextLine());
        BigInteger num2 = new BigInteger(sc.nextLine());
        
        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));
    }
}
