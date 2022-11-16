package com.ocp.java._06.concurrency;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class C77ConcurrentSkipListSet {
    public static void main(String[] args) {
        Set<String> countries = new ConcurrentSkipListSet<>();   // concurrent + treeset
        countries.add("India");
        countries.add("USA");
        countries.add("Canada");
        countries.forEach(System.out::println);

    }
}
