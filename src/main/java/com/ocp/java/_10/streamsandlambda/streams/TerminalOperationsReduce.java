package com.ocp.java._10.streamsandlambda.streams;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class TerminalOperationsReduce {

    public static void main(String[] args) {
        // the reduce() method combines a stream into a single object.
        // It is a reduction, which means it processes all elements.
        // The most common way of doing a reduction is to start with
        // an initial value and keep merging it with the next value.

        // T reduce(T identity, BinaryOperator<T> accumulator)
        // BinaryOperator<T> functional method
        // T apply(T, T)
        // The "identity" is the initial value of the reduction and also
        // what is returned if the stream is empty. This means that there
        // will always be a result and thus Optional is not the return type
        // (on this version of reduce()).
        // The "accumulator" combines the current result with the
        // current value in the stream.
        String name = Stream.of("s", "e", "a", "n")
                .reduce("", (s, c) -> s + c);
        System.out.println(name);

        Integer product = Stream.of(2, 3, 4)
                .reduce(1, (a, b) -> a * b);
        System.out.println(product);


        // Optional<T> reduce(BinaryOperator<T> accumulator)
        // When you leave out the identity, an Optional is returned
        // because there may not be any data (All the elements could have been filtered out earlier)
        // There are 3 possible results
        //      a) empty stream => empty optional returned
        //      b) one element in stream => that element is returned
        //      c) multiple elements in stream => accumulator is applied

        BinaryOperator<Integer> op = (a, b) -> a + b;
        //BinaryOperator<Integer> op = Integer::sum;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(6);
        Stream<Integer> multipleElements = Stream.of(3, 4, 5);
        empty.reduce(op).ifPresent(System.out::println);
        oneElement.reduce(op).ifPresent(System.out::println);
        multipleElements.reduce(op).ifPresent(System.out::println);

        // why not just require the identity and remove this method?
        // Sometimes it is nice to know if the stream is empty as opposed
        // to the case where there is a value returned from the accumulator
        // that happens to match the identity (however unlikely)

        Integer val = Stream.of(1,1,1)
                .reduce(1, (a,b) -> a);
        System.out.println(val);

        // <U> U reduce (U identity, BiFunction accumulator, BinaryOperator combiner)
        // We use this version when we are dealing with different types, allowing us to create intermediate
        // reductions and then combine them at the end. This is useful when working with parallel streams -
        // the streams can be decomposed and reassembled by separate threads. For example, if we wanted to
        // count the length of four 1000-character strings, the first 2 values and the last 2 values could
        // be calculated independently. The intermediate result (2000) would be combined into a final value
        // (4000). Example: we want to count the number of characters in each String
        Stream<String> stream = Stream.of("car", "bus", "train", "aeroplane");
        int length = stream.reduce(0,
                (n,str) -> n + str.length(),
                (n1, n2) -> n1 + n2);
        System.out.println(length);
    }

}
