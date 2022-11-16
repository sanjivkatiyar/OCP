package com.ocp.java._02.oops.interfacepreventingmultipleinheritance;

public class C44MultipleInterfaceImplementation implements If1,If2 {
    @Override
    public int m() {             // without override it will give compilation error
                                 // due to diamond death problem
        return If2.super.m();
        // return If2.m();       // will look for static method // not ok
    }

    public static void main(String[] args) {
        C44MultipleInterfaceImplementation mii = new C44MultipleInterfaceImplementation();
        System.out.println(mii.m());
    }
}

interface If1{
    default int m(){return 1;}
}

interface If2{
    default int m(){return 2;}
}
