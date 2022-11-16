package com.ocp.java._04.arraysandcollections;

import java.util.function.Predicate;

public class C63Lambda {

    public static void main(String[] args) {
        InFa i = new InFa() {
            @Override
            public void m() {
                System.out.println("InFa:m()");
            }
        };
        i.m();                  // I::m()

        // Java 8 - Lambda expression
        InFa inFa = () -> {
            System.out.println("Lambda Version");
        };

        InFa inFa1 = () -> System.out.println("Lambda Version");

        inFa.m();
        inFa1.m();

        ex1();
    }

    public static void ex1(){
        Evaluate<Integer> lambda = i -> i<0;
        System.out.println(lambda.isNegative(+1));
        System.out.println(lambda.isNegative(-1));

        // Predicate<T> is functional interface available in API has one abstract
        // method boolean test(T t)
        Predicate<Integer> predicate = i -> i<0;
        // Predicate<Integer> predicate = i -> {return i<0;};   // same as above
        System.out.println(predicate.test(+1));
        System.out.println(predicate.test(-1));

        System.out.println(check(4, i-> i>0));
        System.out.println(check(4, i-> i<0));
        System.out.println(check("Sanjiv", i-> i.startsWith("San")));

        System.out.println(check(3, i->i%2==0));
        System.out.println(check(4, i->i%2==0));
    }

    private static <T> boolean check(T t, Predicate<T> lambda){
        return lambda.test(t);
    }
}

interface InFa{
    void m();      // a functional interface, only one method
}

interface Evaluate<T>{  // a functional interface, only one method
    boolean isNegative(T t); // similar to predicate
}