package com.ocp.java.mock.test1;

import java.util.function.Function;

public class Q10 {

    public static void main(String[] args) {

        Function<Integer,String> fun = (a)-> Integer.toHexString(a);
        Function<Integer,String> fun1 = a-> Integer.toHexString(a);
        Function<Integer,String> fun3 = (Integer a)-> Integer.toHexString(a);
        Function<Integer,String> fun4 = Integer::toHexString;
        //Function<Integer,String> fun5 = a -> Integer::toHexString; // not ok
    }
}
