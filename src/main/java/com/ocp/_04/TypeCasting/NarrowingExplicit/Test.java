package com.ocp._04.TypeCasting.NarrowingExplicit;

import java.sql.SQLException;

public class Test {

    public static void main(String[] args) {
        double d = 234.04;
        long l = (long) d;   // explicit type casting
        int i = (int) l;     // explicit type casting
        char c = (char)d;
        short s = (short)d;
        byte b = (byte)d;
        System.out.println("double value :" + d);    // 234.04
        System.out.println("long value :" + l);      // 234
        System.out.println("int value :" + i);       // 234
        System.out.println("char value :" + c);      //
        System.out.println("short value :" + s);     // 234
        System.out.println("byte value :" + b);      // -22
    }

    int methodA(byte x, double y) //line2
    {
        return (short)(x / y * 2);
        // return (short)x / y * 2;                  // compilation error double


    }
}

// byte -> short -> int -> long -> float -> double