package com.ocp.java._10.streamsandlambda.lambda;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        var map = new HashMap<String, String>();

        // BiConsumer is a functional interface i.e. one abstract method
        // void accept(T t, U u)
        // Note: The return value of put(k,v) just ignored (and not returned from lambda)
        BiConsumer<String, String> biConsumer = (key, value) -> map.put(key, value);
        //BiConsumer<String, String> biConsumer = map::put;     // Replace lambda with method reference
        biConsumer.accept("India", "New Delhi");
        biConsumer.accept("USA", "Washington DC");

        System.out.println(map);

        BiConsumer<String, String> printMapElement = (key, value) -> System.out.println("Country: "+ key + " Capital: " + value);
        map.forEach((k,v)->printMapElement.accept(k,v));       // lambda can be replaced by method reference
        map.forEach(printMapElement::accept);                  // method reference can be replaced by qualifier
        map.forEach(printMapElement);
    }
}
