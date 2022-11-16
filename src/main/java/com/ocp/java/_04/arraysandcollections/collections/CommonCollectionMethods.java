package com.ocp.java._04.arraysandcollections.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CommonCollectionMethods {
    public static void main(String[] args) {
        // List allows duplicate
        Collection<String> col = new ArrayList<>();

        col.add("Lucy");
        col.add("April");
        col.add("Lucy");
        System.out.println(col);                                     // [Lucy, April, Lucy]
        System.out.println(col.remove("Lucy"));                   // true
        System.out.println(col);                                     // [April, Lucy]
        System.out.println(col.isEmpty());                           // false
        System.out.println(col.size());                              // 2
        System.out.println(col.contains("John"));                    // false
        System.out.println(col.contains("Lucy"));                    // true
        //boolean removeIf(Predicate<? super E> filter)
        System.out.println(col.removeIf(s->s.startsWith("A")));      // true
        col.forEach(name -> System.out.println(name));               // Lucy
        col.clear();
        col.forEach(System.out::println);

        // asList() returns unmodifiable collection
        // add() will throw an unsupported exception
        Collection<String> col1 = Arrays.asList("Lucy", "April", "Lucy");

        col1.add("Tracy");                      // UnsupportedOperationException runtime
    }
}
