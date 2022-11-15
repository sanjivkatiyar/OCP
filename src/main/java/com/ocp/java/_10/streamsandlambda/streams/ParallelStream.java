package com.ocp.java._10.streamsandlambda.streams;

import java.util.stream.Stream;

public class ParallelStream {

    public static void main(String[] args) {

        int sum = Stream.of(10,20,30,40,50,60)
                .parallel()                                        //Parallel processing
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        System.out.println(Stream.iterate(1, n-> n+1)
                .limit(10000).reduce(0, (a,b) -> a+b));

        System.out.println(Stream.iterate(1, n-> n+1)
                .parallel()
                .limit(10000).reduce(0, (a,b) -> a+b));
    }
}
