package com.ocp.java._04.arraysandcollections;

public class C60TwoDArray {
    public static void main(String[] []args) {
        System.out.println(args[0][1]);
    }

    public static void main(String[] args) {
        C60TwoDArray fwa = new C60TwoDArray();
        String[][] newargs = {{"a","b","c"}};
        fwa.main(newargs);
    }
}
