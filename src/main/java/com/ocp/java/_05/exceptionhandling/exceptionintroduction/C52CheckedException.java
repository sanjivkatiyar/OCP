package com.ocp.java._05.exceptionhandling.exceptionintroduction;

import java.io.IOException;

public class C52CheckedException {
    public static void main(String[] args) {
        a();
    }
    public static void a(){
        throw new RuntimeException(); // okay, unchecked or runtime exception
        // throw new IOException(); // not okay, checked exception, must be caught or thrown
    }
}
