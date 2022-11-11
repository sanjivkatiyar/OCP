package com.ocp.java.oops.interfaces.sub;

public class Parrot extends Bird{

    public Parrot(){
        super();
    }

    // method from Flyable interface
    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    // Method from Bird Abstract class
    @Override
    public void speak() {

    }

    public static void main(String[] args) {

        Parrot parrot = new Parrot();
    }
}
