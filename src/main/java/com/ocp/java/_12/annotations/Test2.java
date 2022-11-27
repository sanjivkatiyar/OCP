package com.ocp.java._12.annotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
}

class NeverDoThis {
    // @SafeVarargs
    final int thisIsUnsafe(List<Integer>... list) {    // Possible heap pollution from parameterized vararg type
        Object[] obj = list;
        obj[0] = Arrays.asList("nope!");
        return list[0].get(0); // ClassCastException at runtime
    }

    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        new NeverDoThis().thisIsUnsafe(list);        // Unchecked generics array creation for varargs parameter
    }

    //@SafeVarargs
    public static void work(int value) {} // DOES NOT COMPILE
    //@SafeVarargs
    protected void applyLeave(String... type) {} // DOES NOT COMPILE
    //@SafeVarargs void applyWfh(boolean... taskCompleted) {} // DOES NOT COMPILE
}
