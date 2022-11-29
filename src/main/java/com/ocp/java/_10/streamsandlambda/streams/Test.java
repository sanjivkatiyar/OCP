package com.ocp.java._10.streamsandlambda.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        System.out.println(oddNumbers.findFirst());
        //oddNumbers.forEach(System.out::println);


        Optional<String> str = Optional.ofNullable("Hello");
        String value1 = str.orElse(getval());
        String value2 = str.orElseGet(() -> getval()); // Line1

    }



    public static String getval() {
        System.out.println("Tello");
        return "Tello";
    }
}
