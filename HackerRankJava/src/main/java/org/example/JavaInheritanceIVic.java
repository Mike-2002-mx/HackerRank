package org.example;

// Ejercico sacado de
// https://www.hackerrank.com/challenges/java-inheritance-1/problem?isFullScreen=true
// Java Inheritance I

public class JavaInheritanceIVic {
    public static void main(String args[]){
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
        
    }
}

class Animal{
	void walk(){
		System.out.println("I am walking");
	}
}

class Bird extends Animal{
	void fly(){
		System.out.println("I am flying");
	}

    void sing() {
        System.out.println("I am singing");
    }
}
