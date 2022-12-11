package ocp.java.mock.test1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Q26 {

    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger();
        Stream<String> stream = Stream.of("old", "king", "cole", "was", "a", "merry", "old", "soul").parallel();
        stream.filter(e ->

                {
                    ai.incrementAndGet();
                    return e.contains("o");
                }).

                allMatch(x -> x.indexOf("o") > 0);
        System.out.println("AI = " + ai);
    }
}
/*
1. In the given code, stream refers to a parallel stream.
This implies that the JVM is free to break up the original stream into multiple smaller streams,
perform the operations on these pieces in parallel, and finally combine the results.
2. Here, the stream consists of 8 elements.
It is, therefore, possible for a JVM running on an eight core machine to split this stream into 8 streams
(with one element each) and invoke the filter operation on each of them.
If this happens, ai will be incremented 8 times.
3. It is also possible that the JVM decides not to split the stream at all.
In this case, it will invoke the filter predicate on the first element
(which will return true) and then invoke the allMatch predicate
(which will return false because "old".indexOf("o") is 0).
Since allMatch is a short circuiting terminal operation,
it knows that there is no point in checking other elements because the result will be false anyway.
Hence, in this scenario, ai will be incremented only once.
4. The number of pieces that the original stream will be split into could be anything
between 1 and 8 and by applying the same logic as above, we can say that ai will be incremented any number of times between 1 and 8.
 */