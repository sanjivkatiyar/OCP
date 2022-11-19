package com.ocp.java.mock.test1;

public class Q11 {

    public static void main(String args[ ] ){
        Q11 obj = new Q11(5);
    }
    int m;
    static int i1 = 5;
    static int i2 ;
    int  j = 100;
    int x;
    public Q11(int m){
        System.out.println(i1 + "  " + i2 + "   " + x + "  " + j + "  " + m);
        // 6 40 0 30
    }
    { j = 30; i2 = 40; }  // Instance Initializer
    static { i1++; }      // Static Initializer
}
