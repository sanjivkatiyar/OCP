package com.ocp.java._13.lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {

        // BinaryOperator<T> extents BiFunction<T, T, T> is a functional interface i.e. one abstract method
        // T apply<T t1, T t2>
        BinaryOperator<String> binaryOperator = String::concat;
        BinaryOperator<String> binaryOperator1 = (str1, str2) -> str1.concat(str2);
        BinaryOperator<String> binaryOperator3 = (str1, str2) -> {return str1.concat(str2);};
        System.out.println(binaryOperator.apply("Sanjiv", "Katiyar"));

    }
}
