package org.example;

import java.util.Scanner;

// Ejercicio sacado de
// https://www.hackerrank.com/challenges/java-abstract-class/problem?isFullScreen=true
// Java Abstract Class

// You have to create another class that extends the abstract class. Then you can create
// an instance of the new class. Notice that setTitle method is abstract too and has no body.
// That means you must implement the body of that method in the child class.

public class JavaAbstractClassVic {
    public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
	}
}

abstract class Book{
	String title;
        @SuppressWarnings("unused")
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}

class MyBook extends Book {
    @Override
    void setTitle(String s) {
        this.title = s;
    }
}
