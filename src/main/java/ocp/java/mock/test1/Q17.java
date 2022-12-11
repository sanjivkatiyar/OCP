package ocp.java.mock.test1;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

class Student{}


public class Q17 {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        ConcurrentMap<String, Object> cache = new ConcurrentHashMap<>();
        cache.put("111", student1);

        cache.forEach((s, o) -> System.out.println(s + o));

        cache.putIfAbsent("111", student2);                         // no change as key already present
        cache.forEach((s, o) -> System.out.println(s + o));

        cache.put("111", student2);                                 // replace

        cache.forEach((s, o) -> System.out.println(s + o));
    }
}
