package com.ocp.java._10.streamsandlambda.streams;

import java.util.stream.Stream;

class Dog{}

public class CreatingStreamFromVarargs {

    public static void main(String[] args) {


        // static <T> stream<T> of(T... values)
        Stream<Integer> streamI = Stream.of(1,2,3);
        System.out.println(streamI.count());

        Stream<String> streamS = Stream.of("a", "b", "c", "d");
        System.out.println(streamS.count());

        Stream<Dog> streamD = Stream.of(new Dog());
        System.out.println(streamD.count());
    }
}
