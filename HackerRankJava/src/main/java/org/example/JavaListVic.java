package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Ejercicio sacado de
// https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true
// Java List

// For this problem, we have 2 types of queries you can perform on a List:
// Insert y at index x:
// Insert x y
// Delete the element at index x:
// Delete x

public class JavaListVic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            
            list.add(num);
        }
        
        int q = sc.nextInt();
        
        for(int i = 0; i < q; i++) {
            sc.nextLine();
            
            String querie = sc.nextLine();
            
            if(querie.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                
                list.add(index, value);
            }
            if (querie.equals("Delete")) {
                int index = sc.nextInt();
                
                list.remove(index);
            }
        }
        
        for(int i : list) {
            System.out.print(i + " ");
        }
    }
}
