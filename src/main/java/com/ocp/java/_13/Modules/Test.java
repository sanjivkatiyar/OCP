package com.ocp.java._13.Modules;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {

    public static void main(String[] args) {
        String String = "";
        String = String.toUpperCase();
        StringBuilder greet = new StringBuilder();
        greet.append("sss");
        test(greet);
        System.out.println(greet

        );
        //greet =new StringBuilder();

        AtomicInteger ai = new AtomicInteger();
        System.out.println(ai);
        inc(ai);
        System.out.println(ai);

        int i = 0;

        add(i);
        System.out.println(i);
    }

    private static void add(int i) {
        i = i +1;
    }

    public static void inc(AtomicInteger ai){
        ai.incrementAndGet();

    }

    public static void test(StringBuilder sb){
        sb = new StringBuilder();
        sb.append("uu");

    }
}
