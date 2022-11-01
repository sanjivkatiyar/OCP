package com.in28minutes.java.oops.interfaces.sub;

public class Parrot extends Bird{

    // method from Flyable interface
    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    // Method from Bird Abstract class
    @Override
    public void speak() {

    }
}
