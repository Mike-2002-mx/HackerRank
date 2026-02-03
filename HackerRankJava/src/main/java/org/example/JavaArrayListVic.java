package org.example;

import java.util.ArrayList;
import java.util.Scanner;


// Ejercicio sacado de
// https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true
// Java ArrayList

public class JavaArrayListVic {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
            ArrayList<Integer> nums = new ArrayList<>();
            
            int d = sc.nextInt();
            
            for(int j = 0; j < d; j++) {
                int num = sc.nextInt();
                nums.add(num);
            }
            list.add(nums);
        }
        
        int q = sc.nextInt();
        
        for(int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            try {
                int number = list.get(x - 1).get(y - 1);
                System.out.println(number);
            } catch(Exception e) {
                System.out.println("ERROR!");
            }
        }
        
    }
}
