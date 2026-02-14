package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.System.in; // Solution to System.in -> in
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;


// Ejercicio Prime Checker
// https://www.hackerrank.com/challenges/prime-checker/problem?isFullScreen=true

// You are given a class Solution and its main method in the editor. Your task
// is to create a class Prime. The class Prime should contain a single method
// checkPrime. The locked code in the editor will call the checkPrime method
// with one or more integer arguments. You should write the checkPrime method
// in such a way that the code prints only the prime numbers. Please read the
// code given in the editor carefully. Also please do not use method overloading!

public class PrimeCheckerVic {
    public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
        for (Method method : methods) {
            if (set.contains(method.getName())) {
                overload=true;
                break;
            }
            set.add(method.getName());
        }
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class Prime {
    void checkPrime(int... nums) {
        String result = "";
        for(int n : nums) {
            BigInteger bg = new BigInteger(""+n);
            if(bg.isProbablePrime(10)){
                result += n + " ";
            }
        }
        System.out.println(result);
    }
}
