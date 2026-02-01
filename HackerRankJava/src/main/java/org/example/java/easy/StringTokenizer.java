/*
Ejercicio sacado de
https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
java-string-tokens
*/

package org.example.java.easy;

import java.io.*;
import java.util.*;

public class StringTokenizer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        String[] tokens = tokenizar(s);
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
    }

    public static String[] tokenizar(String s) {
        String tokens[] = new String[0];
        if (s == null) {
            return tokens;
        }

        s = s.trim();
        if (s.isEmpty()) {
            return tokens;
        }

        return s.split("[ !,?._'@]+");
    }
}
