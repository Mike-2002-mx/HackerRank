package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Ejercicio sacado de
// https://www.hackerrank.com/challenges/java-stack/problem?isFullScreen=true
// Java Stack

// A string containing only parentheses is balanced if the following is true:
// 1. if it is an empty string 2. if A and B are correct, AB is correct,
// 3. if A is correct, (A) and {A} and [A] are also correct.
// Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
// Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
// Given a string, determine if it is balanced or not.

public class JavaStackVic {
    public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
        List<String> openS = new ArrayList<>(Arrays.asList("(", "{", "["));
        List<String> closeS = new ArrayList<>(Arrays.asList(")", "}", "]"));
        
		while (sc.hasNext()) {
			String input=sc.next();
            
            List<String> symbols = Arrays.asList(input.split(""));
            
            List<String> currents = new ArrayList<>();
            
            boolean result = true;
            
            for(String s : symbols) {
                if(openS.contains(s)) {
                    currents.add(s);
                }
                
                if(closeS.contains(s)) {
                    if(!currents.isEmpty()) {
                        if(s.equals(")") && currents.get(currents.size()-1).equals("(")
                        || s.equals("}") && currents.get(currents.size()-1).equals("{")
                        || s.equals("]") && currents.get(currents.size()-1).equals("[")) {
                            currents.remove(currents.size() - 1);
                        }
                        else {
                            result = false;
                            break;
                        }
                    }
                    else {
                        result = false;
                        break;
                    }
                }
            }
            if(!currents.isEmpty()) {
                result = false;
            }
            System.out.println(result);
		}
		
	}
}
