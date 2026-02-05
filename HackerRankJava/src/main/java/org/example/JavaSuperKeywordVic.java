package org.example;

//Ejercicio Java Method Overriding 2 (Super Keyword)
// http://hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem?isFullScreen=true

public class JavaSuperKeywordVic {
    public static void main(String []args){
		@SuppressWarnings("unused")
        MotorCycle M=new MotorCycle();
	}
}

class BiCycle{
	String define_me(){
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle{
        @Override
	String define_me(){
		return "a cycle with an engine.";
	}
	
        @SuppressWarnings("OverridableMethodCallInConstructor")
	MotorCycle(){
		System.out.println("Hello I am a motorcycle, I am "+ define_me());

		String temp = super.define_me(); //Fix this line

		System.out.println("My ancestor is a cycle who is "+ temp );
	}
}