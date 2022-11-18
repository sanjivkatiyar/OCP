package com.ocp.java._01.datatypes.premitives;

public class C4WideningAndNarrowing {
    public static void main(String[] args) {

        char c = 'a';               // chars in single quotes (Unicode 97)
        int il = c;                 // automatic widening, char into int
        float f = 23;               // int in to float
        double d = 2.3f;            // float into double
        float f1 = 1L;              // long promoted to float

        int i2 = (int)3.3;          // double cast to int
        byte b1 = (byte)120;        // cast actually not needed here
        byte b2 = 120;              // compiler "knows" int literal is in range
        // float f1 = 3.45;         // double to float cast needed
        float f2 = (float)3.45;
        System.out.println("c: " + c);      // c: a
        System.out.println("il: " + il);    // il: 97
        System.out.println("f: " + f);      // f: 23.0
        System.out.println("d: " + d);      // d: 2.299999952316284
        System.out.println("f1: " + f1);    // f1: 1.0
        System.out.println("i2: " + i2);    // i2: 3
        System.out.println("b1: " + b1);    // b1: 120
        System.out.println("b2: " + b2);    // b2: 120
        System.out.println("f2: " + f2);    // f2: 3.45

        char c1 = (short)98;         // 'b' chars can be assigned to short and vice-a-versa provided they are
                                    // they are within the range
        short s1 = 'a';              // 97 is in the range of short

        char c2 = 'a';               // chars in single quotes (unicode 97)
        // short s2 = c;            // does not work with variables unless c is a compile-time constant
        final char c3 = 'a';        // c3 is "final" i.e. a compile-time constant.
        short S3 = c3;              // Compiler can plug in the value now as it will never change

        System.out.println("c1: " + c1); // c1: b
        System.out.println("s1: " + s1); // s1: 97
        System.out.println("c2: " + c2); // c2: a
        System.out.println("c3: " + c3); // c3: a
        System.out.println("S3: " + S3); // S3: 97

    }
}
