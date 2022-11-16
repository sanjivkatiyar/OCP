package com.ocp.java._02.oops.scope;

public class C2Scope {
    static int count;
    int x;

    public static void main(String[] args) { // args is local to main
        int a=1; // local to main

        a=2;
        { // start of block of code
            a=3;
            int b=0;
            b++;
            {
                b++;
                a++;
            }
        } // end of block of code
        // b++;
    }

    public static void m1() {
        // a=4;
    }

    public void m2() {
        // a=4;
    }
}
