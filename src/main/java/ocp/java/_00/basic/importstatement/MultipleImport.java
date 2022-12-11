package ocp.java._00.basic.importstatement;

//import java.lang.System;   // Line 1
//import java.lang.*;        // Line 2
import java.util.Random;   // Line 3
//import java.util.*;        // Line 4

public class MultipleImport {
    public static void main(String[] args) {
        int n = new Random().nextInt();
        System.out.println(n);
    }
}