package com.ocp.java._10.streamsandlambda.streams;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreams {

    public static void main(String[] args) {

        int[] ia = {1,2,3};
        double[] da = {1.1, 2.2, 3.3};
        long[] la = {1L, 2L, 3L};

        IntStream intStream1 = Arrays.stream(ia);
        DoubleStream doubleStream1 = Arrays.stream(da);
        LongStream longStream1 = Arrays.stream(la);

        System.out.println(intStream1.count() + "," + doubleStream1.count() + "," + longStream1.count());
        // 3,3,3

        IntStream intStream2 = IntStream.of(1, 2, 3);
        DoubleStream doubleStream2 = DoubleStream.of(da);
        LongStream longStream2 = LongStream.of(la);
        System.out.println(intStream2.count() + "," + doubleStream2.count() + "," + longStream2.count());
        //3,3,3

        // primitive stream map
        IntStream intS = Stream.of(1,2,3).mapToInt(n->n);
        System.out.println(intS.sum());

        // primitive stream reduction
        System.out.println(Stream.of(1,2,3).reduce(0, Integer::sum));

        // primitive stream methods
        IntStream intStream = IntStream.of(10,20,30);
        intStream.max().ifPresent(System.out::println);

        intStream = IntStream.of(10,20,30);
        System.out.println(intStream.min().orElseThrow());

        intStream = IntStream.of(10,20,30);
        System.out.println(intStream.average().orElseGet(Math::random));

        intStream = IntStream.of(10,20,30);
        System.out.println(intStream.average().orElse(Double.NaN));



    }
}
