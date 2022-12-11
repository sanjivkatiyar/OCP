package ocp.java._06.concurrency;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class C79CopyOnWriteArrayList {
    public static void main(String[] args) {
        List<String> names = new CopyOnWriteArrayList<>();
        names.add("Ann");
        names.add("Brian");
        names.add("Carol");

        // no infinite loop, a snapshot iterator
        names.forEach(name->{
            System.out.println(name);
            names.add(name);
        });

        System.out.println(names);


        Set<String> uniqueNames = new CopyOnWriteArraySet<>();
        uniqueNames.add("Ann");
        uniqueNames.add("Brian");
        uniqueNames.add("Carol");

        // no infinite loop, a snapshot iterator
        uniqueNames.forEach(name->{
            System.out.println(name);
            uniqueNames.add(name);
        });

        System.out.println(uniqueNames);
    }
}
