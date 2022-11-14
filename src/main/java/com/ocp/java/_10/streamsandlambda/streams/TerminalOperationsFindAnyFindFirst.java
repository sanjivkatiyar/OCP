package com.ocp.java._10.streamsandlambda.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperationsFindAnyFindFirst {

    public static void main(String[] args) {
        // Optional<T> findAny()
        // Optional<T> findFirst()
        // These are terminal operations but not reductions as they sometimes returns
        // without processing all the elements in the stream.
        // Reductions reduce the entire stream into on value.
        Optional<String> any = Stream.of("John", "Paul")
                .findAny();
        any.ifPresent(System.out::println);                     // John (usually)

        Optional<String> first = Stream.of("John", "Paul")
                .findAny();
        first.ifPresent(System.out::println);                   // John

    }
}
