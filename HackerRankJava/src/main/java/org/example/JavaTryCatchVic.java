package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

// Ejercicio Java Exception Handling (Try-catch)
// https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem?isFullScreen=true

public class JavaTryCatchVic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            System.out.println(x/y);
        } catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
