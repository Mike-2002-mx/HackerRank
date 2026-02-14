package org.example;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

// Ejercicio Java SHA-256
// https://www.hackerrank.com/challenges/sha-256/problem?isFullScreen=true


public class JavaSha256Vic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        String s = sc.nextLine();
        
        System.out.println(getSha256(s));
        
    }
    
    public static String getSha256(String s) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(s.getBytes(StandardCharsets.UTF_8));
            
            StringBuilder hexString = new StringBuilder();
            
            for(byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                
                if(hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
