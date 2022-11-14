package com.ocp.java._10.streamsandlambda.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperationsFlatMap {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Sanjiv", "Katiyar");
        List<String> list2 = Arrays.asList("Jyoti", "Niranjan");
        Stream<List<String>> listStream = Stream.of(list1, list2);
        listStream.forEach(System.out::print);
        // [Sanjiv, Katiyar][Jyoti, Niranjan]

        listStream = Stream.of(list1, list2);

        // flatMap(Function(T,R))
        listStream.flatMap(list -> list.stream())
                .forEach(System.out::print);
        // SanjivKatiyarJyotiNiranjan
    }
}
