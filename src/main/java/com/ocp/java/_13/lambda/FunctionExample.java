package com.ocp.java._13.lambda;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        // Function<T, R> is a functional interface i.e. one abstract method
        // R apply(T t)
        Function<String, Integer> function = str -> str.length();
        Function<String, Integer> function1 = String::length;

        System.out.println(function.apply("SanjivKatiyar"));
    }
}
