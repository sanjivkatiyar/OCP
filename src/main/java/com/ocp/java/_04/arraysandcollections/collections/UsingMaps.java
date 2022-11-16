package com.ocp.java._04.arraysandcollections.collections;

import java.util.Map;
import java.util.TreeMap;

public class UsingMaps {
    public static void main(String[] args) {
        treeMap();
    }
    // sorted by key or custom comparator
    public static void treeMap(){
        Map<String, Integer> map = new TreeMap<>();
        map.put("John", 18);
        map.put("Mary", 21);
        map.put("Chris", 33);

        System.out.println(map.containsKey("John"));  // true
        System.out.println(map.containsValue(18));    // true
        System.out.println(map.isEmpty());            // false
        System.out.println(map.get("John"));          // 18
        System.out.println(map);                      // {Chris=33, John=18, Mary=21}
        map.forEach((name, age) -> {
            System.out.println(name);
            System.out.println(age);
        });
        System.out.println(map.size());               // 3
        map.clear();
        System.out.println(map);                      // {}

        map.put("John", 18);
        map.put("Mary", 21);
        map.put("Chris", 33);

        map.entrySet().forEach(System.out::println);
        /*
        Chris=33
        John=18
        Mary=21
         */
        map.keySet().forEach(System.out::println);
        /*
        Chris
        John
        Mary
         */
        map.values().forEach(System.out::println);
        /*
        33
        18
        21
         */

        map.put("Mike", null);
        System.out.println(map);                       // {Chris=33, John=18, Mary=21, Mike=null}
        map.putIfAbsent("Chris", 99);
        System.out.println(map);                       // {Chris=33, John=18, Mary=21, Mike=null}
        map.putIfAbsent("Mike", 55);
        System.out.println(map);                       // {Chris=33, John=18, Mary=21, Mike=55}
        map.putIfAbsent("Luke", 31);
        System.out.println(map);                       // {Chris=33, John=18, Mary=21, Mike=55}
        System.out.println(map.replace("Chris", 81));  // 33
        System.out.println(map);                       // {Chris=81, John=18, Luke=31, Mary=21, Mike=55}
        map.replaceAll((name, age)->name.length());
        System.out.println(map);                       // {Chris=5, John=4, Luke=4, Mary=4, Mike=4}
        map.remove("Mike");
        System.out.println(map);                       // {Chris=5, John=4, Luke=4, Mary=4}

    }
}