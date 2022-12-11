package ocp.java._10.streamsandlambda.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {
        Consumer<List<Integer>> methodRef = Collections::sort;
        Consumer<List<Integer>> lambda = x -> Collections.sort(x);
        Consumer<List<Integer>> consumer = new Consumer<List<Integer>>() {
            @Override
            public void accept(List<Integer> integers) {
                Collections.sort(integers);
            }
        };

        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(4);
        intList.add(9);
        intList.add(8);
        intList.add(59);
        consumer.accept(intList);
        intList.forEach(System.out::println);

    }
}
