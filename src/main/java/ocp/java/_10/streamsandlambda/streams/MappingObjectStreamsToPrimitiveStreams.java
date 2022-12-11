package ocp.java._10.streamsandlambda.streams;

import java.util.Locale;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class MappingObjectStreamsToPrimitiveStreams {

    public static void main(String[] args) {

        // Stream<T> to Stream<T>
        Stream<String> names = Stream.of("Sanjiv", "Shreyas", "Ishi", "Jyoti");
        names.map(String::toUpperCase).forEach(System.out::println);

        // Stream<T> to DoubleStream
        names = Stream.of("Sanjiv", "Shreyas", "Ishi", "Jyoti");
        names.mapToDouble(s -> s.length()).forEach(System.out::println);

        // Stream<T> to IntStream
        names = Stream.of("Sanj3iv", "Shreyas", "Ishi", "Jyoti");
        names.mapToInt(s -> s.length()).forEach(System.out::println);

        // Stream<T> to LongStream
        names = Stream.of("Sanjiv", "Shreyas", "Ishi", "Jyoti");
        names.mapToLong(s -> s.length()).forEach(System.out::println);


    }
}
