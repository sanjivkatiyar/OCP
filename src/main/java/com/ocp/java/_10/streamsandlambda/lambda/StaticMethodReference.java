package com.ocp.java._10.streamsandlambda.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class StaticMethodReference {

    public static void main(String[] args) {

        // Static method references are considered UNBOUND also.
        // An example static method is Collection.sort(List)
        // Consumer<T>
        //      void accept<T t>
        //          void accept<List<String>>
        // Consumer takes one parameter => sort(List) is used, as opposed to sort<List, Comparator>
        Consumer<List<Integer>> sortL = list -> Collections.sort(list);
        Consumer<List<Integer>> sortMR = Collections::sort;

        List<Integer> listOfNumbers = Arrays.asList(2,1,4,5,0);
        sortL.accept(listOfNumbers);
        System.out.println(listOfNumbers);
        listOfNumbers = Arrays.asList(2,1,4,5,0);
        sortMR.accept(listOfNumbers);
        System.out.println(listOfNumbers);
    }
}
