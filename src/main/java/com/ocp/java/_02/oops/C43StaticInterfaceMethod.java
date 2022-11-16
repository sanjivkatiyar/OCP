package com.ocp.java._02.oops;

public class C43StaticInterfaceMethod {
    public static void main(String[] args) {
        System.out.println(StaticIface.m1());
        new testSIF().go();
        // new testSIF().m1();  // static methods are not inherited but default are
    }
}

interface StaticIface{
    static int m1(){return 4;} // public by default
    public static void m2(){}
    // static void m3(); // missing body

}

class testSIF implements StaticIface{
    public void go(){
        // System.out.println(m1());  // need interface_name.m1()
        System.out.println(StaticIface.m1());
    }
}
