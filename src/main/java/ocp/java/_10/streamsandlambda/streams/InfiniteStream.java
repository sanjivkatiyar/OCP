package ocp.java._10.streamsandlambda.streams;

import java.util.stream.Stream;

public class InfiniteStream {
    public static void main(String[] args) {

        // infinite stream of random unordered numbers between 0..9 inclusive
        // Stream<T> generate(Supplier<T> s)
        // Supplier is a function interface
        // T get()
        Stream<Integer> infStream = Stream.generate(() -> {
           return (int) (Math.random()*10);
        });
        //infStream.forEach(System.out::println);

        // infinite stream of ordered numbers
        // 2,4,6,8,10.....
        // iterate(T seed, UnaryOperator<T> fn)
        // UnaryOperator is-a Function<T,T>
        // T apply(T t)
        Stream<Integer> integerStream = Stream
                .iterate(2, n-> n+2)
                .limit(10);   // limit() is a short-circuiting stateful intermediate operator (convert to finite stream)

        integerStream.forEach(System.out::println);  // forEach is terminal operator



    }
}
