package com.ocp.java._04.arraysandcollections;

public class C61ArraysObjectCount {
    public static void main(String[] args) {
        X[] array = new X[6];
        array[1] = new X();
        array[2] = new X();
        array[3] = new X();
        array[3] = null;
        //here, how may objects are created and how many are ready for garbage collection
    }
}
class X{
    private Integer[] s = {1,2,3,4};
}
