package com.ocp.java._10.streamsandlambda.lambda;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {

        // BiPredicate<T, U> is a functional interface i.e. one abstract method
        // boolean test(T t, U u);
        BiPredicate<String, Integer> checkLength = (str, len) -> str.length() == len;
        System.out.println(checkLength.test("Sanjiv", 6));
    }
}
