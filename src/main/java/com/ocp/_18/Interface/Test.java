package com.ocp._18.Interface;

public class Test {
}

interface j{}
interface i extends j{}
class c{}

// class t implements i extends c{         // compilation error
class t  extends c implements i{

}
/*

Some characteristics of interface:

An interface defines a contract for a class.
Objects can't be created for interface and an interface cannot have private or protected members.
In an interface, all methods are implicitly public and abstract
and variables are implicitly public, static, and final.
The class which implements the interface has to provide definitions for all abstract methods.
 If at least one abstract method of the interface has not been overridden by the class that implemented the interface, make it abstract.
Inheritance is possible in an interface, and it supports multiple inheritance.
an interface can extends another interface
a class can implements multiple interfaces
 */