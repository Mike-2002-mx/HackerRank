package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// Ejercicio Java Primarity Test
// https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true

// Given a large integer, n, use the Java BigInteger class' isProbablePrime
// method to determine and print whether it's prime or not prime.

public class JavaPrimalityTestVic {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        BigInteger number = new BigInteger(n);
        
        int certainty = 10;
        
        boolean isPrime = number.isProbablePrime(certainty);
        
        if(isPrime) {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}
