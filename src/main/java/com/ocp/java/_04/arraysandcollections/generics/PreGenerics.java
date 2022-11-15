package com.ocp.java._04.arraysandcollections.generics;

import java.util.ArrayList;
import java.util.List;

class Dog{}
public class PreGenerics {

    public static void main(String[] args) {

        // A raw collection can hold any type of object (except a primitive)
        List myList = new ArrayList<>();        // can't enforce a type
        myList.add("Fred");                     // will hold strings
        myList.add(43);                         // and Integers (autoboxing)
        myList.add(new Dog());                  // and Dogs

        // As everything is treated as an Object, when you are getting something out of the collection,
        // all you have were objects - therefore a cast was required to get your String back
        String s = (String)myList.get(0);        // cast is required else compilation error

        // and as we could not guarantee that what was coming out was really a String
        // (as we were allowed to put anything in), this cast could fail at runtime
        String s1 = (String)myList.get(1);       // ClassCastException at runtime

        // Generics takes care of both ends (putting in and getting out)
        // by enforcing the type of your collections.
        // Note: generic syntax means putting the type in the angle brackets
        List<String> myList2 = new ArrayList<String>();
        myList2.add("Fred");                      // will hold strings
        // myList2.add(new Dog());                   // compiler error

        // Because what is going IN is guaranteed, what is coming out is also guaranteed
        // => no need for the case
        String s2 = myList2.get(0);               // cast no longer required

    }
}
