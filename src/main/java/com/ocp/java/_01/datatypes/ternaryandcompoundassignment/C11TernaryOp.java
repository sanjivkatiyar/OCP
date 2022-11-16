package com.ocp.java._01.datatypes.ternaryandcompoundassignment;

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

    }
}
