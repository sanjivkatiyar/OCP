package com.ocp.java._10.streamsandlambda.lambda;

import java.time.LocalTime;
import java.util.function.Supplier;

public class SupplierExample {

    // Supplier<T> is a functional interface i.e. one abstract method
    // T get()
    public static void main(String[] args) {
        Supplier<StringBuilder> builder = () -> new StringBuilder();
        System.out.println(builder.get().append("Sanjiv"));
        Supplier<LocalTime> time = () -> LocalTime.now();
        System.out.println(time.get());
        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());
    }
}
