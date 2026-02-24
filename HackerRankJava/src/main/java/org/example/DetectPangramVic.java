package org.example;
import java.util.HashMap;


public class DetectPangramVic {
    public static void main(String[] args) {
        System.out.println(check("Hola"));
    }

    public static boolean check(String sentence){
        HashMap<String, Integer> letters = new HashMap<>();
        
        String[] lettersArray = sentence.toUpperCase().replaceAll("[^a-zA-Z]+", "").split("");
        
        for(String l : lettersArray) {
        letters.put(l, letters.getOrDefault(l, 0) + 1);
        }
        
        return letters.size() == 26;
    }
}
