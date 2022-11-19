package com.ocp.java.mock.test1;

import java.util.*;

public class Q14 {


    // List<String> box = new ArrayList<>();                    // need a collection that wraps List<String>
    // Map<List<String>> box = new TreeMap();                   // map requires 2 arguments
    // Map<String, List<String>> box = new HashMap<>();                        // okay
    // HashMap<?, List<String>> box = new HashMap<String, List<String>>();  // okay
    // HashMap<?, List<String>> box = new HashMap<?, List<String>>();       // not okay
    HashMap<?, List<?>> box = new HashMap<String, List<?>>();

    // You must provide a type name while instantiating a typed class and so,
    // you cannot have a '?' on the right-hand side in place where actual type is required.
    // i.e. if you want a HashMap that can take any object as key,
    // you must do new HashMap<Object, List<String>>().
    // However, HashMap<?, List<?>> box = new HashMap<Integer, List<?>>();is valid
    // even though there is a ? on the RHS. This is because,
    // you are only instantiating the HashMap here (not the List).

    public void dumpStuff() {
        for (List<?> l : box.values()) {
            System.out.println(l);
        }
    }

}
