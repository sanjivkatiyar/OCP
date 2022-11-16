package com.ocp.java._04.arraysandcollections.equalsandhashcode;

import java.util.HashMap;
import java.util.Map;

public class EqualsAndHashCode {
    private static Map<Contact1, String> map = new HashMap<>();

    public static void main(String[] args) {
        Contact1 john = new Contact1(33, "John");
        Contact1 mary = new Contact1(23, "Mary");
        System.out.println(john.hashCode());
        System.out.println(mary.hashCode());
        map.put(john, "Irish");
        map.put(mary, "American");
        System.out.println(map.get(john));

        Contact1 peter = new Contact1(55, "Peter");
        System.out.println(peter.hashCode());
        map.put(peter, "Engineer");

        otherScope();

        System.out.println(map);
        System.out.println(map.get(mary));

    }

    public static void otherScope() {
        Contact1 otherMary = new Contact1(23, "Mary");
        System.out.println(otherMary.hashCode());
        System.out.println(map.get(otherMary));
        map.put(otherMary, "Accountant");                         // will replace the exiting as map do not have duplicate key
    }
}

class Contact1 {
    private final int age;
    private final String name;

    Contact1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        System.out.println("in hashCode");
        return this.age + this.name.length();
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("in equals");
        return o instanceof Contact1 && ((Contact1) o).getAge() == this.age && ((Contact1) o).getName().equals(this.name);
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}
