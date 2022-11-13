package com.ocp.java._10.streamsandlambda.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStreamFromArray {
    public static void main(String[] args) {

        Double[] numbers = {1.1, 2.2, 3.3};
        // Arrays.stream() creates a stream from the array 'numbers'
        // The Array is considered the source of the stream and while the
        // data is flowing through the stream, we have an opportunity to operate on the data.

        Stream<Double> stream = Arrays.stream(numbers);

        // lets perform an operation the data
        // note that count() is a "terminal operation" - this means that
        // you cannot perform any more operations on the stream.

        long n = stream.count();
        System.out.println("Number of elements: " + n);
    }
}
