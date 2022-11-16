package com.ocp.java._02.oops.interfaceintroduction;

// The keyword implements is used when a class inherits method prototypes from an interface.
// The keyword extends is used when an interface inherits from another interface,
// or a class inherits from another class.
// Any class, whether abstract or concrete, can implement any interface.
public class C41Interface implements Moveable{
    // void move(); // must be public can not assign weaker privilege

    @Override
    public void move(){
        System.out.println("Dog:move()");
    }

    public static void main(String[] args) {
        // s = "walk"; // can not change the final variable
        System.out.println(s);   // move
        // move(); // can not refer to instance member from a static context
        new C41Interface().move();
    }
}

interface I{
    // All of following methods are legal and identical
    // void m();
    // public void m();
    // abstract void m();
    // public abstract void m();
    abstract public void m();
}

interface I1{
    // final void m();  // illegal combination final and abstract
}

interface I2{
    // all of below constants are legal and identical
    // int x=1;
    // public int x=1;
    // static int x=1;
    // public static int x=1;
    // public final int x=1;
    // static final int x=1;
    // public static final int x=1;
    final static public int x=1;
}

interface Moveable{
    String s = "move";                // constant - public static
    void move();                      // public abstract
}


interface Moveable1{
    void moveIt();
}

interface Spherical{
    void doSphericalThings();
}

// interface can extend from one or more interfaces
// class can implement one or more interfaces
interface Bounceable extends Moveable1, Spherical{
    void bounce();
}

// concrete class Volleyball must implement all abstract methods in Bounceable
class VolleyBall implements Bounceable{

    @Override
    public void moveIt() {

    }

    @Override
    public void doSphericalThings() {

    }

    @Override
    public void bounce() {

    }
}

// BeachBall is okay as it's abstract, can implement all, some or none abstract method of Bounceable
abstract class BeachBall implements Bounceable{

}