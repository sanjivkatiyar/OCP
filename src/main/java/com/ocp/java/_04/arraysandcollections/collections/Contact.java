package com.ocp.java._04.arraysandcollections.collections;

public class Contact {
    private int age;
    private String name;

    public Contact(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.age;
        hash = 89 * hash + this.name.length();
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Contact) {
            Contact otherContact = (Contact) o;
            return this.name.equals(otherContact.name) && this.age == otherContact.age;
        }
        return false;
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }
}
