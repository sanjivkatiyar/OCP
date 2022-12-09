package com.ocp._14.StaticModifier;

public class Test {
}

/*

The static keyword in Java is a non-access modifier.
 The static modifier makes a member (variables or methods) of a class independent of the objects of the class
  and is used when we are defining properties that are common to all objects in the class.

Static variables are global variables that all the objects of a particular class share
The static keyword is used in:
Variables
Methods
Block of code
import statement (will be explained in later sections)

A method or a variable which is static can be called directly by using its class name rather than creating
 an object reference of that class
A static block gets executed only once, irrespective of how many instances created for that class
Note: The main method in JVM does not have an instance to call. So it calls by the class name.
static variables are variables prefixed with the static keyword
static variables are global variables, which are shared by all instances of the class
static variables are accessed using the class name, it can also be accessed using objects

 */