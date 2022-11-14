package com.ocp.java._10.streamsandlambda.streams;

import java.util.stream.Stream;

public class IntermediateOperationsDistinct {

    public static void main(String[] args) {

        // Stream<T> distinct()
        // distinct() is a stateful intermediate operation
        Stream.of("eagle", "eagle", "EAGLE")
                .peek(s -> System.out.print(" 1." + s))
                .distinct()
                .forEach(s -> System.out.print(" 2." + s));
        //  1.eagle 2.eagle 1.eagle 1.EAGLE 2.EAGLE
    }
}
