package com.ocp.java.mock.test1;

public class Q8 {
}

class SubClass extends SuperClass {
    int i, j, k;

    public SubClass(int m, int n) {
        // super(); will be inserter here
        i = m;
        j = m;
    } //1

    public SubClass(int m) {
        super(m);
    } //2
}

class SuperClass {

    public SuperClass() {
    }

    public SuperClass(int a) {
    }

}