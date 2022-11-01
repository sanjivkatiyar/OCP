package com.in28minutes.java.oops.interfaces.sub;

import com.in28minutes.java.oops.interfaces.Flyable;

public abstract class Bird implements Flyable {
//	public void fly() {
//		System.out.println("Bird is flying");
//	}

    static void someDefaultMethod(){
        System.out.println("Some static method");
    }

    public void someMethod(){
        System.out.println("Some concrete method");
    }

    public abstract void speak();
}
