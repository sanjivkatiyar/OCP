package com.ocp.java._01.datatypes.stringequality.stringapi;

public class C8StringConcatenation {
    public static void main(String[] args) {
        int a = 3, b = 2;
        int res = a+b;
        System.out.println(res);
        String s = "abc";
        String s1 = a + s;
        String s2 = s + a;
        System.out.println(s1 + " " + s2);
        System.out.println("Output is " + a + b);   // Output is 32
        System.out.println("Output is " + (a + b)); // Output is 5
    }
}
