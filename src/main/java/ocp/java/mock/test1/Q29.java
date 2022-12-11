package ocp.java.mock.test1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q29 {

    public static void main(String[] args) {

        int[][] iaa = {{1, 2}, {3, 4}, {5, 6}};
        long count = Stream.of(iaa).flatMapToInt(IntStream::of).map(i -> i + 1).filter(i -> i % 2 != 0).peek(System.out::print).count();
        System.out.println(count);
    }
}
/*
The call to Stream.of creates a stream containing three int array elements.
flatMapToInt converts each array into individual stream elements and so the stream now contains 1, 2, 3, 4, 5, 6.
Next, the call to map converts the elements to 2, 3, 4, 5, 6, 7.
The filter method removes those elements from the stream that do not satisfy the given predicate.
Here, it removes the even elements. So, the stream now contains 3, 5, 7.
Observe the invocation of the peek method in the stream pipeline.
The peek method does not remove any element from the stream.
It simply performs the given operation (System.out.print, in this case) for each of the elements (which prints 3, 5, and 7).
The resulting stream contains the same elements as the original stream on which peek is invoked.
Finally, count returns 3, which is printed by the last println statement. Thus, the output is 3573
 */
