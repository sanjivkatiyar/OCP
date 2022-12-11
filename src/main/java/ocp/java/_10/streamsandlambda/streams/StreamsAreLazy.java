package ocp.java._10.streamsandlambda.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsAreLazy {

    public static void main(String[] args) {



        /*
        This can help in reducing the actual number of operations - instead of mapping
        "Alex", "David", "April", and "Edwards" abd then anyMatch() on only 2 operations,
        we process the elements vertically resulting in  only 2 operations.
        map: Alex
        anyMatch: ALEX
         */
        Stream.of("Alex", "David", "April", "Edwards")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {                          // ends when first true is returned (Alex)
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });

        /*
        April
        filter1 : April
        Ben
        filter1 : Ben
        filter2 : Ben
        Charlie
        filter1 : Charlie
        filter2 : Charlie
        Charlie
        Note: limit(1) means David, Benildus or Christian are not processed at all i.e. none of them appear in the output via peak.
         */
        List<String> names = Arrays.asList("April", "Ben", "Charlie", "David", "Benildus", "Christian");
        names.stream()
                .peek(System.out::println)
                .filter(s -> {
                    System.out.println("filter1 : " + s);
                    return s.startsWith("B") || s.startsWith("C");
                })
                .filter(s -> {
                    System.out.println("filter2 : " + s);
                    return s.length() > 3;
                })
                .limit(1)                                       // intermediate operation Stream<T> limit(long)
                .forEach(System.out::println);                  // terminal operation
    }
}
