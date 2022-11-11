package com.ocp.java._13.lambda;

import java.util.Locale;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {

        // UnaryOperator<T> extends Function<T, T> is a functional interface i.e. one abstract method
        // T apply(T t)
        UnaryOperator<String> unaryOperator = String::toUpperCase;;
        UnaryOperator<String> unaryOperator1 = str -> str.toUpperCase() ;
        UnaryOperator<String> unaryOperator2 = (str) -> str.toUpperCase() ;

        System.out.println(unaryOperator.apply("SanjivKatiyar"));
    }
}
