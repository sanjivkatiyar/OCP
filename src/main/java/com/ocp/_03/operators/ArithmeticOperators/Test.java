package com.ocp._03.operators.ArithmeticOperators;

public class Test {
    static int x = 9;
    static int y = 2;
    public static void main(String[] args) {

        System.out.println(x%y);       // 1
        System.out.println(x/y);       // 4

        double d = x/y;
        System.out.println(d);         // 4.0
    }
}
