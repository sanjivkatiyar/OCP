package com.ocp.java._10.streamsandlambda.lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

//import static java.util.Arrays; // Line 1
import static java.util.Arrays.asList; // Line 2
import java.util.Arrays; // Line 3
//static import java.util.Arrays.*; // Line 4
class BadStaticImports {
    public static void main(String[] args) {
        Arrays.asList("one"); // Line 5
        asList("one"); //Line 6
    }
}

public class LambdaTest {

    public static void main(String[] args) {
        Supplier<Consumer<?>> sc = () -> a->{};

    }
}
