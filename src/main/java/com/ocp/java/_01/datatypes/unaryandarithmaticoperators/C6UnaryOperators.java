package com.ocp.java._01.datatypes.unaryandarithmaticoperators;

import java.sql.SQLOutput;

public class C6UnaryOperators {
    public static void main(String[] args) {

        // Prefix and Postfix
        int x=3, y=4;
        x++;    // x is 4
        --y;    // y is 3

        System.out.println(x + " " + y);
        System.out.println(x++ + " " + --y);
        System.out.println(x + " " + y);

        // one operand
        int x1 = +6; // positive is the default
        int y1 = -x1;

        System.out.println( x+ " " + y);

        // cast operators
        int z = (int)3.5;
        System.out.println(z);

        // inversion operator
        boolean b = true;
        System.out.println(!b);
    }
}
