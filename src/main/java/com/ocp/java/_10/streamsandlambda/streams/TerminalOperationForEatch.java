package com.ocp.java._10.streamsandlambda.streams;

import java.util.stream.Stream;

public class TerminalOperationForEatch {

    public static void main(String[] args) {
        // void forEach(Consumer)
        // As there is no return value, forEach() is not a reduction.
        // As the return type is 'void', if you want something to happen
        // it has to happen inside the Consumer (side-effect).
        Stream<String> names = Stream.of("Cathy", "Pauline", "Zoe");
        names.forEach(System.out::println);

        // Notes: forEach is also a method in the collection interface.
        // streams cannot be the source of a for-each loop
        // because streams do not implement the iterable interface
        Stream<Integer> s = Stream.of(1);
        // for(Integer i : s){}                // not applicable to stream
    }
}
