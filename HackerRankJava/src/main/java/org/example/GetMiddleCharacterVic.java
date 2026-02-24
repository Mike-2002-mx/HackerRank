package org.example;

public class GetMiddleCharacterVic {
    
    public static void main(String[] args) {
		System.out.println(getMiddle("Hello"));
    }
    
    public static String getMiddle(String word) {
        if(word.length() % 2 == 0) {
        return ""+word.charAt((int)(word.length() / 2) - 1) + word.charAt((int)(word.length() / 2));
        }
        return ""+word.charAt((int)(word.length() / 2));
    }
}
