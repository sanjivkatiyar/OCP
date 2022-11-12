package com.ocp.java._10.streamsandlambda.lambda;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

        // BiFunction<T, U, R> is a functional interface i.e. one abstract method
        // R apply(T, U)
        BiFunction<String, String, Integer > biFunction = (str1, str2) -> str1.length()+str2.length();
        System.out.println(biFunction.apply("Sanjiv", "Katiyar"));

        BiFunction<String, String, String > biFunction1 = (str1, str2) -> str1.concat(str2);
        BiFunction<String, String, String > biFunction2 = String::concat;
        System.out.println(biFunction.apply("Sanjiv", "Katiyar"));
    }
}
