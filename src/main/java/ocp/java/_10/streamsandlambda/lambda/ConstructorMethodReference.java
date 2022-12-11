package ocp.java._10.streamsandlambda.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorMethodReference {

    public static void main(String[] args) {
        // Supplier<T>
        //      T get()
        Supplier<StringBuilder> sbL = () -> new StringBuilder();        // lambda
        Supplier<StringBuilder> sbMR = StringBuilder::new;              // method reference
        System.out.println(sbL.get().append("Sanjiv"));
        System.out.println(sbMR.get().append("Sanjiv"));


        // Function<T,R>
        //      R apply(T)
        //          List<String> apply(Integer)
        // Arraylist(int initialCapicity)
        Function<Integer, List<String>> alL = x -> new ArrayList<>(x);
        Function<Integer, List<String>> alMR = ArrayList::new;

        List<String> ls1 = alL.apply(10);                            // size 10
        ls1.add("21");
        System.out.println(ls1);                                        // [21]
        List<String> ls2 = alMR.apply(5);                            // size 5
        ls2.add("88");
        System.out.println(ls2);                                        // [88]


    }
}
