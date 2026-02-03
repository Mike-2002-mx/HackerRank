package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Ejercicio sacado de
// https://www.hackerrank.com/challenges/java-hashset/problem?isFullScreen=true
// Java Hashset

public class JavaHashsetVic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        Set<String> pairs = new HashSet<>();
        
        for (int i = 0; i < t; i++) {
            String left = sc.next();
            String right = sc.next();
            
            String a = left.compareTo(right) <= 0 ? left : right;
            String b = left.compareTo(right) <= 0 ? right : left;
            
            pairs.add(a + "|" + b);
            System.out.println(pairs.size());
        }
    }
}
