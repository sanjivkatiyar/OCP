package com.ocp.java._13.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class UnboundMethodReference {

    public static void main(String[] args) {
        // Function<T, R>
        //      R apply(T)
        //          String apply(String)
        Function<String, String> upperL = s-> s.toLowerCase();
        Function<String, String> upperMR = String::toLowerCase;

        // The function is unbound, so you need to specify which instance to call it on
        System.out.println(upperL.apply("Sanjiv"));
        System.out.println(upperMR.apply("Sanjiv"));

        // BiFunction<T, U, R>
        // R apply(T t, U u)
        BiFunction<String, String, String> biFunction = (str1, str2) -> str1.concat(str2);
        BiFunction<String, String, String> biFunction1 = String::concat;

        // 1st parameter is used for executionf the instance method
        // "Sanjiv".concat("Katiyar")
        System.out.println(biFunction.apply("Sanjiv", "Katiyar"));
        System.out.println(biFunction1.apply("Sanjiv", "Katiyar"));
    }
}
