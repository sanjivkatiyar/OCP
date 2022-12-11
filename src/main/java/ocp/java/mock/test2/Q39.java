package ocp.java.mock.test2;

import java.util.stream.IntStream;

public class Q39 {

    public static void main(String[] args) {
        Object v1 = IntStream.rangeClosed(10, 15).boxed().filter(x -> x > 12).parallel().findAny();
        Object v2 = IntStream.rangeClosed(10, 15).boxed().filter(x -> x > 12).sequential().findAny();
        System.out.println(v1 + ":" + v2);
        // <An Optional containing 13, 14, or 15>:<An Optional containing 13, 14, or 15>
    }
}
/*
Since the first stream is made parallel, it may be partitioned into multiple pieces and each piece may be processed
by a different thread. findAny may, therefore, return a value from any of those partitions. Hence, any number from 13
 to 15 may be printed.

The second stream is sequential and therefore, ideally, findAny should return the first element. However, findAny is
deliberately designed to be non-deterministic. Its API specifically says that it may return any element from the
stream. If you want to select the first element, you should use findFirst.

Further findAny returns Optional object. Therefore, the output will be Optional[13] instead of just 13 (or any other
number).
 */