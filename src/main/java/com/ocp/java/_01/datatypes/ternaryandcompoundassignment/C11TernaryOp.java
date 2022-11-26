package com.ocp.java._01.datatypes.ternaryandcompoundassignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

// ? and : are used; parenthesis are optional
// x = (boolean expression) ? value to assign if true : value to assign if false
public class C11TernaryOp {
    public static void main(String[] args) {
        int numPets=3;
        String status = (numPets<4) ? "Pet limit not exceeded" : "Too many pets";
        System.out.println(status);

        // nested ternary operator
        int sizeOfYard = 7;
        numPets = 6;
        status = (numPets<4)? "Pet count OK" : (sizeOfYard>8) ? "Too many Pets" : "" +
                "Pets limit on edge";
        System.out.println(status);

        int x = 1;
        int y = 1;
        int z = x < 2 ? x++ : y++;
        System.out.println(x + " : " + y+ " : " +z);



    }
}
