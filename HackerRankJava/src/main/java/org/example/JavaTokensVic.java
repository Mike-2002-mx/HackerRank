package org.example;

import java.util.Scanner;


// Ejercicio sacado de
// https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
// Java String Tokens

// Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string
// into tokens. We define a token to be one or more consecutive English alphabetic letters.
// Then, print the number of tokens, followed by each token on a new line.

public class JavaTokensVic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        int tLength = 0;
        
        String[] tokens = s.trim().split("[\\s!,?._'@]+");
        
        if (s.trim().length() != 0) {
            tLength = tokens.length;
        }
        
        System.out.println(tLength);
        
        for(String token : tokens) {
            System.out.println(token);
        }
    }
}
