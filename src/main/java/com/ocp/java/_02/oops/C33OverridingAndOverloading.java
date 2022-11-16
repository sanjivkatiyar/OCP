package com.ocp.java._02.oops;

// from Java 1.5, an overriding method is allowed to change the return type
// to any subclass of the original return type, also known as covariant return type.
// This does not apply to primitives, in which case, the return type of the overriding method
// must match exactly to the return type of the overridden method.
// overriding method can oly throw subset of exception
// overriding method can return subset of object
public class C33OverridingAndOverloading {
    public static void main(String[] args) {
        Animal aa = new Animal();
        aa.eat();                // Animal::eat()
        aa.eat("something");  // Animal::eat(String)
        // aa.buck();  // "buck()" not in animal class

        Animal ah = new Horse();
        ah.eat();      // Horse::eat()
        ah.eat("something");   // Animal::eat(String)
        // ah.buck();  // "buck()" not in animal class

        new Horse().buck();
    }
}

class Animal{
    public void eat(){
        System.out.println("Animal::eat()");
    }
    public void eat(String s){
        System.out.println("Animal::eat(String)");
    }
}
class Horse extends Animal{
    public void eat(){
        System.out.println("Horse::eat()");
    }
    public void buck(){
        System.out.println("Horse::buck()");
    }
}