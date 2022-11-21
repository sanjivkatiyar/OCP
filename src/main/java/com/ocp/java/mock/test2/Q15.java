package com.ocp.java.mock.test2;

public class Q15 {

    //module com.amazing.movies{
    // 1    exports com.amazing.movies;
    // 2    exports com.amazing.movies to com.amazing.rentals;
    // 3    requires transitive com.amazing.customer;//4 }

    // You cannot have duplicate statements in a module info.
    // Lines marked //2 and //3 are exporting the same module in different ways and are therefore in conflict.
    // One of them must be removed.
}
