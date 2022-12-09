package com.ocp._17.AbstractClass;

public class Test {
}

abstract class Animal{
    Animal(){}
    public abstract void bark();
    abstract void dance();
}

class Dog extends Animal{
    @Override
    public void bark() {

    }

    @Override
    void dance() {

    }
}
/*

Abstract Class:

An abstract class cannot be instantiated using the new keyword.
Abstract class can have constructors
The subclass of an abstract class can be only instantiated if it provides the implementation for all the abstract methods.
If a class has at least one abstract method, then the class must be declared as abstract.
class can be declared abstract without any abstract methods
If the subclass does not implement all the abstract methods, then the subclass must also be declared as abstract.
An abstract class can also have concrete methods i.e. methods with implementation.
An abstract class reference can be assigned an object of its subclass, thereby achieving run-time polymorphism.
abstract cannot be user with private, final or static
 */