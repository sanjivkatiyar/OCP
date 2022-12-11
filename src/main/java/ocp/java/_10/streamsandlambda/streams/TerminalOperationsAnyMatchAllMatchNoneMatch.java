package ocp.java._10.streamsandlambda.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TerminalOperationsAnyMatchAllMatchNoneMatch {

    public static void main(String[] args) {
        // boolean anyMatch(Predicate)
        // boolean allMatch(Predicate)
        // boolean noneMatch(Predicate)
        List<String> names = Arrays.asList("Alan", "Brian", "Colin");
        Predicate<String> pred = name -> name.startsWith("A");
        System.out.println(names.stream().anyMatch(pred));   // true
        System.out.println(names.stream().allMatch(pred));   // false
        System.out.println(names.stream().noneMatch(pred));  // false
    }
}
