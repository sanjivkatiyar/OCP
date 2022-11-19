package com.ocp.java.mock.test1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q12 {
    public static void main(String[] args) {
        Stream<Integer> strm1 = Stream.of(2, 3, 5, 7, 11, 13, 17, 19); //1
//        Stream<Integer> strm2 = strm1.filter(i -> {
//            return i > 5 && i < 15;
//        });  //2                   // 71113

        // Stream<Integer> strm2 = strm1.filter(i>5).filter(i<15); // invalid lambda expression

//        Stream<Integer> strm2 = strm1.collect(Collectors.partitioningBy(i -> {
//            return i > 5 && i < 15;
//        })).get("true").stream();  // throw null pointer

//        Stream<Integer> strm2 = strm1.collect(Collectors.partitioningBy(i -> {
//            return i > 5 && i < 15;
//        })).get(true).stream();     // 71113

        // Stream<Integer> strm2 = strm1.parallel().filter(i->i>5).filter(i->i<15)/*.sequential()*/; // 13117

        Stream<Integer> strm2 = strm1.parallel().filter(i->i>5).filter(i->i<15).sequential();  // 71113


        //Stream<Integer> strm2 = strm1.map(i-> i>5?i<15?i:null:null);    // nullnullnull71113nullnull.
        strm2.forEach(System.out::print); //3
    }
}

/*
Stream pipelines may execute either sequentially or in parallel.
This execution mode is a property of the stream.
Streams are created with an initial choice of sequential or parallel execution.
(For example, Collection.stream() creates a sequential stream,
and Collection.parallelStream() creates a parallel one.)
This choice of execution mode may be modified by the BaseStream.sequential() or BaseStream.parallel() methods.
 */