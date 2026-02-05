package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Ejercicio Covariant Return Types
// https://www.hackerrank.com/challenges/java-covariance/problem?isFullScreen=true

public class CovariantReturnTypesVic {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal" -> region = new WestBengal();
            case "AndhraPradesh" -> region = new AndhraPradesh();
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}

//Complete the classes below
class Flower{
    String whatsYourName() {
        return "I have many names and types.";
    }
}

class Jasmine extends Flower{
    @Override
    String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower{
    @Override
    String whatsYourName() {
        return "Lily";
    }
}

class Region {
    Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region{
    @Override
    Jasmine yourNationalFlower() {
        Jasmine flower = new Jasmine();
        return flower;
    }
}

class AndhraPradesh extends Region{
    @Override
    Lily yourNationalFlower() {
        Lily flower = new Lily();
        return flower;
    }
}