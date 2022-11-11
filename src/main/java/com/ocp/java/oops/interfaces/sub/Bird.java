package com.ocp.java.oops.interfaces.sub;

import com.ocp.java.oops.interfaces.Flyable;

public abstract class Bird implements Flyable {

    public Bird(){
        super();
        System.out.println("Bird constructor");
    }
//	public void fly() {
//		System.out.println("Bird is flying");
//	}

    //public abstract void fly();

    static void someDefaultMethod(){
        System.out.println("Some static method");
    }

    public void someMethod(){
        System.out.println("Some concrete method");
    }

    public abstract void speak();

}
