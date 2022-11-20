package com.ocp.java.mock.test1;

import java.util.TreeSet;

enum Title {
    MR("Mr."), MS1("Ms."), MS2("Ms.");
    private String title;

    private Title(String s) {
        title = s;
    }
}

public class Q50 {
    public static void main(String[] args) {
        var ts = new TreeSet<Title>();
        ts.add(Title.MS2);
        ts.add(Title.MR);
        ts.add(Title.MS1);
        for (Title t : ts) {
            System.out.println(t);
        }
    }
}

// MR, MS1, MS2,

/*
A TreeSet keeps its its elements in sorted order.
Therefore, when you iterate through a TreeSet,
you will get elements sorted either by the Comparator specified while creating the TreeSet or by their natural order
(which uses the Comparable interface implemented by the class of the elements).
Every enum implements Comparable and the natural order of enums is the order in which they are defined.
In the given code, the order in which the three enum values are defined is MR, MS1, and MS2.
Therefore, this is their natural order.
 */