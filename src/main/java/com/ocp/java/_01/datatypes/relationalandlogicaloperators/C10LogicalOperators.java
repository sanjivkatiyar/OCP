package com.ocp.java._01.datatypes.relationalandlogicaloperators;

public class C10LogicalOperators {
    public static void main(String[] args) {

        // logical AND && short circuit
        boolean b1 = false, b2 = true;
        boolean res = b1 && (b2 = false);
        System.out.println(b1 + " " + b2 + " "+ res);   // false true false

        // logical OR || short circuit
        boolean c1 = false, c2 = true;
        boolean res1 = c1 && (c2 = false);
        System.out.println(c1 + " " + c2 + " "+ res1);   // false true false

        // bitwise AND
        boolean d1 = false, d2 = true;
        boolean res2 = d1 & (d2=false);
        System.out.println(d1 + " " + d2 + " " + res2);  // false false false

        // bitwise OR
        boolean e1 = false, e2 = true;
        boolean res3 = e1 | (e2=false);
        System.out.println(e1 + " " + e2 + " " + res3);  // false false false

        // bitwise XOR
        // T^T = F
        // F^F = F
        // T^F = T
        // F^T = T
        boolean f1 = (5>1) ^ (10<20);
        boolean f2 = (5>10) ^ (10<20);
        System.out.println(f1 + " " + f2);    // false true

        System.out.println(3&5);

    }
}
