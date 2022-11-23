package com.ocp.java.mock.test2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    //constructor and getters and setters not shown
    public void addMarks(int m) {
        this.marks += m;
    }

    public void debug() {
        System.out.println(name + ":" + marks);
    }
}

public class Q29 {
    public static void main(String[] args) {
        List<Student> slist = Arrays.asList(new Student("S1", 40), new Student("S2", 35), new Student("S3", 30));
        Consumer<Student> increaseMarks = s -> s.addMarks(10);
        slist.forEach(increaseMarks);
        slist.stream().forEach(Student::debug);

    }
}

/*
This is a straightforward code that shows two ways of iterating through a list and performing an operation on each
element.  1. Java 8 has added a default method default void forEach(Consumer<? super T> action) in java.lang.Iterable
 interface (which is extended by java.util.List interface). It performs the given action for each element of the
 Iterable until all elements have been processed or the action throws an exception. Unless otherwise specified by the
  implementing class, actions are performed in the order of iteration (if an iteration order is specified).
  Exceptions thrown by the action are relayed to the caller.  2. java.util.Stream interface also contains the same
  void forEach(Consumer<? super T> action) method that applies the given action to each element of the stream. This
  is a terminal operation, which means: 1. it will cause all other intermediate operations (such as peek) chained
  before it to be executed and 2. you cannot chain any more operations after calling this method.
 */
