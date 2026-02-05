package org.example;

import java.util.BitSet;
import java.util.Scanner;

// Ejercicio Java BitSet
// https://www.hackerrank.com/challenges/java-bitset/problem?isFullScreen=true

public class JavaBitSetVic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        BitSet bitSet1 = new BitSet(n);
        BitSet bitSet2 = new BitSet(n);
        
        for(int i = 0; i < m; i++) {
            
            String operation = sc.next();
            int bs =sc.nextInt();
            int value = sc.nextInt();
            
            switch (operation) {
                case "AND" -> {
                    if(bs == 1) bitSet1.and(bitSet2);
                    if(bs == 2) bitSet2.and(bitSet1);
                }
                case "OR" -> {
                    if(bs == 1) bitSet1.or(bitSet2);
                    if(bs == 2) bitSet2.or(bitSet1);
                }
                case "XOR" -> {
                    if(bs == 1) bitSet1.xor(bitSet2);
                    if(bs == 2) bitSet2.xor(bitSet1);
                }
                case "FLIP" -> {
                    if(bs == 1) bitSet1.flip(value);
                    if(bs == 2) bitSet2.flip(value);
                }
                case "SET" -> {
                    if(bs == 1) bitSet1.set(value);
                    if(bs == 2) bitSet2.set(value);
                }
                default -> {
                }
            }
            
            System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
        }
        
    }
}
