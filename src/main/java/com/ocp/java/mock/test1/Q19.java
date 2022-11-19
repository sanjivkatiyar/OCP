package com.ocp.java.mock.test1;

import java.util.ArrayList;

public class Q19 {

    public static void main(String[] args) {


        for (var x : System.getProperties().entrySet()) {
            var m = x.getKey();
        }

        for (var x : System.getProperties().keySet()) {
            // System.out.println(x.length());              // no method length() in set
            System.out.println(x);
        }

        // var obj = null;

        // A var declaration must have an initializer that the compiler can use to
        // infer the type without any ambiguity.

        // var k = System.out::println;

        // System.out::println is a valid a method reference,
        // however, the compiler cannot determine the type of the object that will be pointed to by k
        // using this method reference. That is why, var k will not compile.
        // The error message will say, "method reference needs an explicit target-type".

        // var _ = new ArrayList<>();

        // Since Java 9, _ has been made a keyword. Therefore,
        // it cannot be used as a variable name anymore.
        // If you change the variable name to something like _al, this statement will be valid.
    }
}
