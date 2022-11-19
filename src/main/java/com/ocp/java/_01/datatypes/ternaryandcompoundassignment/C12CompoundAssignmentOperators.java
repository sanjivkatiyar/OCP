package com.ocp.java._01.datatypes.ternaryandcompoundassignment;

public class C12CompoundAssignmentOperators {
    public static void main(String[] args) {
        byte b1=3;
        int il = 4;
        // b1 = b1 + il;  // byte = int ERROR!
        b1+=il; // no error => b1 = (byte) (b1 + il);
        System.out.println(b1);   // 7

        int x=2;
        x *= 2+5; // x = x * (2+5)
        System.out.println(x);   //14

        int k =1;
        k += (k=4)*(k+2);
        // k = k + (RHS)
        // k = 1 + (RHS)
        // k = 1 + (4* (4+2))
        System.out.println(k);    // 25
    }
}
