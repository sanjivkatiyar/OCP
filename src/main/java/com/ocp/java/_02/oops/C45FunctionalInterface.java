package com.ocp.java._02.oops;

public class C45FunctionalInterface {

    public void m(){
        C45FunctionalInterface tf1 = new C45FunctionalInterface();
        C45FunctionalInterface tf2 = new C45FunctionalInterface();
        System.out.println(tf1.toString());
        System.out.println(tf1.hashCode());
        System.out.println(tf1.equals(tf2));
    }
    public static void main(String[] args) {
        new C45FunctionalInterface().m();
    }
}

@FunctionalInterface
interface SampleFI{
    void m();                  // single abstract method (SAM)
}

@FunctionalInterface
interface SampleFI1{
    void m();                  // SAM
    default void m1(){}        // default not count
    static void m2(){}         // static not count
}

// @FunctionalInterface
interface SampleFI2{}          // no SAM

@FunctionalInterface
interface SampleFI3 extends SampleFI2{
    void m();                  // SAM
}

// @FunctionalInterface
interface SampleFI4{
    void m1();                 // no SAM
    void m2();
}

@FunctionalInterface
interface SampleFI5{
    void m();
    // the exception to the SAM rule
    public abstract String toString();    // does not count
    public boolean equals(Object o);      // does not count
    int hashCode();                       // does not count
}