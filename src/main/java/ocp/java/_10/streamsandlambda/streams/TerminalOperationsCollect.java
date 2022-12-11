package ocp.java._10.streamsandlambda.streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationsCollect {

    public static void main(String[] args) {

        // StringBuilder collect(Supplier<StringBuilder> supplier,
        //               BiConsumer<StringBuilder, String> accumulator
        //               BiConsumer<StringBuilder, StringBuilder> combiner)
        // This version is used when you want complete control over how collection should work.
        // The accumulator adds an element to the collection e.g. the next String to the
        // StringBuilder. The combiner takes two collections and merges them.
        // It is useful in parallel processing

        StringBuilder word = Stream.of("ad", "jud", "i", "cate")
                .collect(() -> new StringBuilder(),
                        (sb, str) -> sb.append(str),
                        (sb1, sb2) -> sb1.append(sb2));

        StringBuilder word1 = Stream.of("ad", "jud", "i", "cate")
                .collect(StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append);

        System.out.println(word);               // adjudicate
        System.out.println(word1);              // adjudicate


        // Using API defined collectors

        String s = Stream.of("Sanjiv", "Katiyar", "Kumar")
                .collect(Collectors.joining("~"));
        String s1 = String.join("~", "Sanjiv", "Katiyar", "Kumar");
        System.out.println(s);                     // Sanjiv~Katiyar~Kumar
        System.out.println(s1);                    // Sanjiv~Katiyar~Kumar

        Double avg = Stream.of("Sanjiv", "Kumar", "Katiyar")
                .collect(Collectors.averagingInt(String::length));
        System.out.println(avg);                   // 6.0

        // Want a map of name => number of characters in the name
        Map<String, Integer> map = Stream.of("Sanjiv", "Kumar", "Katiyar")
                .collect(Collectors.toMap(
                        string -> string,
                        String::length
                ));
        System.out.println(map);

        // We want a map: number of character => name
        // However if 2 or more names have same length and length is our key
        // and we can't have duplicate key, this leads to an exception.
        // To get around this, we can supply merge function, whereby we append
        // the colliding key values togather.
        Map<Integer, String> map1 =
                Stream.of("Sanjiv", "Kumar", "Katiyar", "Shreyas")
                        .collect(Collectors.toMap(
                                strg -> strg.length(),
                                strg -> strg,
                                (strg1, strg2) -> strg1 + ", " + strg2)
                        );
        System.out.println(map1);

        // What if we want a sorted map
        Map<Integer, String> map2 =
                Stream.of("Sanjiv", "Kumar", "Katiyar", "Shreyas")
                        .collect(Collectors.toMap(
                                String::length,
                                strg -> strg,
                                (strg1, strg2) -> strg1 + ", " + strg2,
                                TreeMap::new));                        // 4th argument caters this
        System.out.println(map2);                  // {5=Kumar, 6=Sanjiv, 7=Katiyar, Shreyas}

        // Instead of combining, let's group them
        Map<Integer, List<String>> map3 =
                Stream.of("Sanjiv", "Kumar", "Kumar", "Katiyar", "Shreyas")
                        .collect(Collectors.groupingBy(String::length));                        // 4th argument caters this
        System.out.println(map3);                 // {5=[Kumar, Kumar], 6=[Sanjiv], 7=[Katiyar, Shreyas]}

        // What if we want to remove duplicate "Kumar"
        Map<Integer, Set<String>> map4 =
                Stream.of("Sanjiv", "Kumar", "Kumar", "Katiyar", "Shreyas")
                        .collect(Collectors.groupingBy(String::length,
                                Collectors.toSet()));      // return set instead of list
        System.out.println(map4);                 // {5=[Kumar], 6=[Sanjiv], 7=[Shreyas, Katiyar]}

        // What if we want sorted list
        Map<Integer, List<String>> map5 =
                Stream.of("Sanjiv", "Kumar", "Kumar", "Katiyar", "Shreyas")
                        .collect(Collectors.groupingBy(String::length,
                                TreeMap::new,
                                Collectors.toList()));      // return set instead of list
        System.out.println(map5);                 // {5=[Kumar], 6=[Sanjiv], 7=[Shreyas, Katiyar]}

        // Special case of grouping where there are only two possible groups true and false

        Stream<String> names = Stream.of("Sanjiv", "Kumar", "Kumar", "Katiyar", "Shreyas");
        Map<Boolean, List<String>> partitionMap =
                names.collect(Collectors.partitioningBy(stt -> stt.startsWith("S")));
        System.out.println(partitionMap);                // {false=[Kumar, Kumar, Katiyar], true=[Sanjiv, Shreyas]}

        // We can change the value from list to set
        names = Stream.of("Sanjiv", "Kumar", "Kumar", "Katiyar", "Shreyas");
        Map<Boolean, Set<String>> partitionMap1 =
                names.collect(Collectors.partitioningBy(stt -> stt.startsWith("Z"),
                        Collectors.toSet()));
        System.out.println(partitionMap1);              // {false=[Shreyas, Katiyar, Kumar, Sanjiv], true=[]}
    }

}
