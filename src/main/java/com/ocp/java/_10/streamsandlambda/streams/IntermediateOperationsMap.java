package com.ocp.java._10.streamsandlambda.streams;

import java.util.stream.Stream;

public class IntermediateOperationsMap {

    public static void main(String[] args) {

        // map() is for transforming data
        // <R> Stream<R> map(function<T,R> mapper)
        //      R apply(T t)
        Stream.of("book", "pen", "ruler")
                .map(String::length)
                .forEach(System.out::print);           // 435
    }
}
