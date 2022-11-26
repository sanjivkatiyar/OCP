package com.ocp.java._00.basic.overloding;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        // play(4);                       // Cannot resolve method 'play(int)'
        play(4L);                       // calls the long version

    }
//    public void fly(int[] lengths) {     // fly(int[])' is already defined in 'com.ocp.java._00.basic.overloding.Test'
//        System.out.println("int[]");
//    }
    public void fly(int... lengths) {
        System.out.println("int…");
    }


    //public void walk(List<String> strings) {}        // 'walk(List<String>)' clashes with 'walk(List<Integer>)'; both methods have same erasure
    public void walk(List<Integer> integers) {} // DOES NOT COMPILE

    public static void play(Long l) {}
    public static void play(Long... l) {}


    public String String() {                         // String can be used as identifier
        System.out.println("Sample Method");
        String String = "";
        return "" ;
    }
}
