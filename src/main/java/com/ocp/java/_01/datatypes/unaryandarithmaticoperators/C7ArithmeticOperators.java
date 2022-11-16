package com.ocp.java._01.datatypes.unaryandarithmaticoperators;

public class C7ArithmeticOperators {
    public static void main(String[] args) {
        int x = 10, y =3;
        int div = x/y;    // integer division truncates
        int mod = x%y;    // keep reminder only
        System.out.println(div + " " + mod);
        System.out.println(0%3);

        // precedence

        int res = 3 + 2 * 4;
        System.out.println(res);
        res = (3+2) * 4;
        System.out.println(res);
        res = 6 + 4 - 2;
        System.out.println(res);
        res = 10 / 4 * 6;            // 12 as 10/4 = 2 (keep integer)
        System.out.println(res);

        byte b1 = 2, b2 =3;  // compiler know that int literals are in range => ok
        // byte b3 = 128;    // 128 is not in range (-128..+127)
        // byte b4 = b1 + b2; // must cast into byte
        byte b5 = (byte) (b1 + b2); //casting required
        System.out.println(b5);

        // modular operator can be applied on float as well.
        System.out.println(4.3%4);

    }
}
