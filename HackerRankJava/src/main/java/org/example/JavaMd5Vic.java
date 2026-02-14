package org.example;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

// Ejercicio Java MD5
// https://www.hackerrank.com/challenges/java-md5/problem?isFullScreen=true

public class JavaMd5Vic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        System.out.println(getMD5(s));
    }

    public static String getMD5(String s) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            byte[] digest = md.digest(s.getBytes(StandardCharsets.UTF_8));
            
            BigInteger bg = new BigInteger(1, digest);
            
            String hashText = bg.toString(16);
            
            while (hashText.length() < 32) {
                hashText = "0" + hashText;
            }
            
            return hashText;
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
