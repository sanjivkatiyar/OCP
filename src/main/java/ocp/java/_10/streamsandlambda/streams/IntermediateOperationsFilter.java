package ocp.java._10.streamsandlambda.streams;

import java.util.stream.Stream;

public class IntermediateOperationsFilter {

    public static void main(String[] args) {

        // Stream<T> filter(Predicate)
        // The filter() method returns a Stream with the elements that match the given predicate
        Stream.of("galway", "mayo", "roscommon")
                .filter(countryName -> countryName.length()>5)
                .forEach(System.out::print);                   // galwayroscommon
    }
}
