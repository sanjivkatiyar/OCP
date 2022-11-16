package com.ocp.java._02.oops.interfacedefaultmethod;

public class C42DefaultMethod {
    public static void main(String[] args) {
        // Moveable2 moveable2 = new Moveable2(); can not new interface type

        Moveable2 cheetah = new Cheetah();
        cheetah.move();                    // moving very fast

        Moveable2 elephant = new Elephant();
        elephant.move();                   // moving
    }
}

interface TestDefault{
    int m0();                              // regular public abstract method
    default int m1(){return 4;}            // default public method
    // private default int m2(){return 4;} // default can not be private
    public default int m2(){return 4;}     // okay, public by default
    // default static void m3(){}          // default and static are not allowed together
    // public default void m4();           // missing method body i.e. {}
    // default abstract void m5();         // contradicting default expect body, abstract not
}

interface Moveable2{
    default void move(){
        System.out.println("Moving");
    }
}

class Cheetah implements Moveable2{
    public void move(){
        System.out.println("Moving very fast!");
    }
}

class Elephant implements Moveable2{}