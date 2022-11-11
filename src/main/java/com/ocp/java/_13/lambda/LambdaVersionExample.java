package com.ocp.java._13.lambda;

interface I{
    void m();                                 // A functional interface, i.e. it has only one method.
}

public class LambdaVersionExample {

    public static void main(String[] args) {
        I i = new I() {
            @Override
            public void m() {
                System.out.println("I::m()");
            }
        };
        i.m();                                // I::m()

        I lambdaI = () ->{
            System.out.println("Lambda Version");
        };
        lambdaI.m();

        I lambdaI2 = () -> System.out.println("Lambda Version - in-case single statement");
        lambdaI2.m();

    }
}
