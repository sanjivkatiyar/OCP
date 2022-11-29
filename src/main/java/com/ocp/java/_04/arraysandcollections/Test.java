package com.ocp.java._04.arraysandcollections;

import java.util.*;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");    // [a]

        list.add(0, "b");    // [b, a]
        list.set(1, "c");    // [b, c]
        System.out.println(list.get(0));    // b

        list.remove("b");    // [c]
        list.remove(0); // []
        //list.set(0, "?"); // IndexOutOfBoundsException

        //Map<Integer,Integer> map = Map.of(1,2,3);
        Map<Integer, Integer> map1 = Map.of(1, 2, 3, 4);

        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Three");
        map.put(2, "Two");
        System.out.println(map.putIfAbsent(2, "TWO"));    // Two
        System.out.println(map.putIfAbsent(4, "Four"));    // null
        System.out.println(map);    // {2=Two, 3=Three, 4=Four}

        map.replace(2, "TWO");    // Two
        System.out.println(map);    // {2=TWO, 3=Three, 4=Four}
        map.replaceAll((k, v) -> v.toUpperCase());
        System.out.println(map);    // {2=TWO, 3=THREE, 4=FOUR}

        System.out.println(map.containsKey(2));    // true
        System.out.println(map.containsValue("Two"));    // false

        System.out.println(map.size());    // 3

        System.out.println(map.remove(4));    // FOUR
        System.out.println(map.size());    // 2
        map.forEach((k, v) -> System.out.println("(" + k + ", " + v + ") "));    // (2, TWO) (3, THREE)

        System.out.println(map.get(6));    // null
        System.out.println(map.getOrDefault(3, "Five"));    // THREE

        Set<Integer> keys = map.keySet();    // [2, 3]
        Collection<String> value = map.values();    // [TWO, THREE]
        Set<Map.Entry<Integer, String>> pairs = map.entrySet();    // [2=TWO, 3=THREE]

    }

    public static void addLanguage(List<?> list) {
        // list.add("Java");        // required type ?
    }

    public static void addLanguage1(List<? extends Object> list) {
        //list.add("Java");        // required type ? extends Object
    }

    public static void addLanguage3(List<Object>  list) {
        list.add("Java");
    }

    public static void addLanguage4(List<? super String> list) {
        list.add("Java");
    }

    public static void addLanguage5(List<? super Object> list) {
        list.add("Java");


    }
}
