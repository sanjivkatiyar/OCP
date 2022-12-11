package ocp.java._01.datatypes.unaryandarithmaticoperators;

public class C6UnaryOperators {
    public static void main(String[] args) {

        // Prefix and Postfix
        int x=3, y=4;
        x++;    // x is 4
        --y;    // y is 3

        System.out.println(x + " " + y);               // 4 3
        System.out.println(x++ + " " + --y);           // 4 2
        System.out.println(x + " " + y);               // 5 2

        // one operand
        int x1 = +6; // positive is the default
        int y1 = -x1;

        System.out.println( x1+ " " + y1);              // 6 -6

        // cast operators
        int z = (int)3.5;
        int zq = (int)3.6;
        System.out.println(z);                         // 3
        System.out.println(zq);                         // 3

        // inversion operator
        boolean b = true;
        System.out.println(!b);                        // false
    }
}
