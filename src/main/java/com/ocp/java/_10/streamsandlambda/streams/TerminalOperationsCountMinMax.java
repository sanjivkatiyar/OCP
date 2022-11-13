package com.ocp.java._10.streamsandlambda.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperationsCountMinMax {

    public static void main(String[] args) {
        long count = Stream.of("dog", "cat").count();
        System.out.println(count);

        // Optional<T> min (Comparator)
        // Optional<T> max (Comparator)
        // Optional is introduced in Java 8 to replace 'null'.
        // If the stream is empty the Optional will be empty
        // and we won't have to deal with null
        Optional<String> min = Stream.of("deer", "horse", "pig").min((s1,s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println);

        Optional<Integer> max = Stream.of(4,6,2,12,9)
                .max((i1,i2) -> i1-i2);
        max.ifPresent(System.out::println);
    }
}
