package com.ocp.java._06.concurrency;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class C81SynchronizedCollection {
    public static void main(String[] args) {
        Map<String, String> capitalCities = new HashMap<>();
        //Map<String, String> capitalCities = new ConcurrentHashMap<>();
        capitalCities.put("New Delhi", "India");
        capitalCities.put("Washington DC", "USA");

        Map<String, String> syncCapitalCities = Collections.synchronizedMap(capitalCities);
        syncCapitalCities.forEach((k,v)->{
            System.out.println(k +" is the capital of " + v);
            // syncCapitalCities.remove(k);  // Will throw concurrent modification exception
        });
    }
}
