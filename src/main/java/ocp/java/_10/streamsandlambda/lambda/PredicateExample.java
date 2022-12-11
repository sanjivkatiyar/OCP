package ocp.java._10.streamsandlambda.lambda;

import java.util.function.Predicate;

// My own custom functional interface
interface Evaluate<T>{
    boolean isNegative(T t);                 // similar to predicate
}
public class PredicateExample {
    public static void main(String[] args) {

        Evaluate<Integer> lambda = i ->  i<0;
        Evaluate<Integer> lambdaFull = (i) -> {return i<0;};

        System.out.println("Evaluate: " + lambda.isNegative(10));                // false
        System.out.println("Evaluate: " + lambda.isNegative(-10));               // true

        // Predicate<T> is a functional interface i.e. one abstract method:
        // boolean test(T t)
        Predicate<Integer> predicate = i -> i<0;
        System.out.println("Predicate: " + predicate.test(10));                  // false
        System.out.println("Predicate: " + predicate.test(-10));                 // true

        System.out.println(check(4, i-> i % 2 == 0));                            // true
        System.out.println(check(5, i-> i % 2 == 0));                            // false

        System.out.println(check("SanjivKatiyar", s -> s.startsWith("Sa")));     // true
        System.out.println(check("SanjivKatiyar", s -> s.startsWith("Ka")));     // false


    }

    public static <T> boolean check(T t, Predicate<T> predicate){
        return predicate.test(t);
    }
}
