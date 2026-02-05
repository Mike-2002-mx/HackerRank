package org.example;

import java.util.Scanner;

// Ejercicio sacado de
// https://www.hackerrank.com/challenges/java-interface/problem?isFullScreen=true
// Java Interfaces

// You are given an interface AdvancedArithmetic which contains a method signature
// int divisor_sum(int n). You need to write a class called MyCalculator which
// implements the interface. divisorSum function just takes an integer as input
// and return the sum of all its divisors. For example divisors of 6 are 1, 2, 3
// and 6, so divisor_sum should return 12. The value of n will be at most 1000.

public class JavaInterfaceVic {
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    @SuppressWarnings("rawtypes")
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (Class theInterface : theInterfaces) {
            String interfaceName = theInterface.getName();
            System.out.println(interfaceName);
        }
    }
}

interface AdvancedArithmetic{
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n) {
        int sum = n;
        for(int i = 1; i < n/2 + 1; i++) {
            if(n % i == 0) {
                sum+=i;
            }
        }
        return sum;
    }
}