package com.ocp.java._10.streamsandlambda.streams;

import java.util.stream.Stream;

public class TerminalOperationsReduce {

    public static void main(String[] args) {
    // the reduce() method combines a stream into a single object.
    // It is a reduction, which means it processes all elements.
    // The most common way of doing a reduction is to start with
    // an initial value and keep merging it with the next value.

    // T reduce(T identity, BinaryOperator<T> accumulator)
    // BinaryOperator<T> functional method
    // T apply(T, T)
    // The "identity" is the initial value of the reduction and also
    // what is returned if the stream is empty. This means that there
    // will always be a result and thus Optional is not the return type
    // (on this version of reduce()).
    // The "accumulator" combines the current result with the
    // current value in the stream.
    String name = Stream.of("s", "e", "a", "n")
            .reduce("", (s,c) -> s+c);
        System.out.println(name);

    Integer product = Stream.of(2,3,4)
            .reduce(1, (a,b)-> a*b);
        System.out.println(product);
    }
}
