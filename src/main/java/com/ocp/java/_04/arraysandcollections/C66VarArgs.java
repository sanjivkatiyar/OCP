package com.ocp.java._04.arraysandcollections;

public class C66VarArgs {
    public static void main(String[] args) {
        someMethod();
        someMethod(1);
    }
    public static void someMethod(Object... params)
    {
        System.out.println(params.length);
        System.out.println(params);
    }
}
