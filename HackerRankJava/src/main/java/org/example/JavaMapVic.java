package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Ejercicio sacado de
// https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true
// Java Map

// You are given a phone book that consists of people's names and their phone
// number. After that you will be given some person's name as query. For each
// query, print the phone number of that person. For each case, print "Not found"
// if the person has no entry in the phone book.

public class JavaMapVic {
    public static void main(String []argh) {
        Map<String, Integer> phoneNumber = new HashMap<>();
        
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            
            phoneNumber.put(name, phone);
            
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            
            if(phoneNumber.get(s) != null) {
                System.out.println(s + "=" + phoneNumber.get(s));
            }
            else {
                System.out.println("Not found");
            }
            
		}
	}
}
