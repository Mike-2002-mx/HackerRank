package org.example;

import java.lang.reflect.Constructor;
import java.util.Scanner;

//Ejercicio Java Singleton Pattern
// https://www.hackerrank.com/challenges/java-singleton/problem?isFullScreen=true

public class JavaSingletonPatternVic {
    public static void main(String args[])throws Exception{
	
        Scanner sc=new Scanner(System.in);
        Singleton s1 = Singleton.getSingleInstance(); //retrive the single instance
        Singleton s2=Singleton.getSingleInstance();
        assert(s1==s2);
        
        //verify that the constructor is private
        Class<? extends Singleton> c=s1.getClass();
        @SuppressWarnings("rawtypes")
        Constructor[] allConstructors = c.getDeclaredConstructors();
        assert allConstructors.length==1;
        for (Constructor<?> ctor : allConstructors)
        {
            if(ctor.getModifiers()!=2 || !ctor.toString().equals("private Singleton()")) //The constructor must be private
            {
                System.out.println("Wrong class!");
            }
        }
        String str=sc.nextLine();
        s1.str=str;
        s2.str=str;
        System.out.println("Hello I am a singleton! Let me say "+str+" to you");
    }
}

class Singleton{
    
    private static Singleton singleton;
    public String str;
    
    private Singleton() {
        
    }
    
    public static Singleton getSingleInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}