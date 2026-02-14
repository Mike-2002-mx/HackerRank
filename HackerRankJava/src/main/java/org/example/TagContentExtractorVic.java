package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Ejercicio Tag Content Extractor
// https://www.hackerrank.com/challenges/tag-content-extractor/problem?isFullScreen=true

public class TagContentExtractorVic {
    public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        
        String regex = "<(.+)>([^</>]+)</\\1>";
        
        Pattern pattern = Pattern.compile(regex);
        
		while(testCases>0){
			String line = in.nextLine();
			
            Matcher matcher = pattern.matcher(line);
            
            boolean isFound = false;
            
            while(matcher.find()) {
                System.out.println(matcher.group(2));
                isFound = true;
            }
            
            if(!isFound) {
                System.out.println("None");
            }
			testCases--;
		}
	}
}
