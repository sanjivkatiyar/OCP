package ocp.java._06.concurrency;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class C78ConcurrentSkipListMap {

    public static void main(String[] args) {
        Map<String, Integer> map = new ConcurrentSkipListMap<>();    // concurrent + tree map
        map.put("Sanjiv", 40);
        map.put("Ishi", 7);
        map.put("Shreyas", 7);
        map.put("Jypti", 40);

        map.forEach((k,v)-> System.out.println("name: " + k + " Age: " + v));
    }
}
