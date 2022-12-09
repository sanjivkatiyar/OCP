package com.ocp._04.TypeCasting.WideningImplicit;

public class Test {

    public static void main(String[] args) {
        int i = 300;
        long l = i;       //no explicit type casting
        float f = l;      //no explicit type casting
        System.out.println("int value :"+i);
        System.out.println("long value :"+l);
        System.out.println("float value :"+f);
    }
}
