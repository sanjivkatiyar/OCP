package com.ocp.java._10.streamsandlambda.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingStreamFromCollection {
    public static void main(String[] args) {

        List<String> animals = Arrays.asList("cat", "dog", "sheep");
        // using stream which is a default method in collection interface
        Stream<String> animalsStream = animals.stream();
        System.out.println("Number of elements: " + animalsStream.count());

        // stream() is default method in collection interface and therefore is inherited by all classed
        // that implements collection. Map is not one of those i.e. map is not a collection.
        // To bridge between the two, we use the map method entrySet() to return a Set view of the
        // Map (Set IS-A collection)

        Map<String, Integer> namesToAges =  new HashMap<>();
        namesToAges.put("Mike", 22);
        namesToAges.put("Mary", 24);
        namesToAges.put("Alice", 31);
        System.out.println(namesToAges.entrySet());
        System.out.println("Number of entries: " +
                namesToAges
                        .entrySet() // get a set(i.e. collection) view of the map
                        .stream()   // stream() os a default method in collection
                        .count());  // terminal operation

    }
}
