package com.ocp._13.FinalKeyword;

public class Test {

    public static void main(String[] args) {
        Super aSuper = new Sub();
        aSuper.doSomething();                 // super
    }
}

class Super{

    public static void doSomething(){
        System.out.println("Super");
    }

    final void say(){}

}

class Sub extends Super {
    // @Override                              // static methods can not be overriden
    public static void doSomething(){
        System.out.println("Sub");
    }

    // void say(){}                           // compilation error
}


/*
final can be used in 3 scenarios

Before a variable
A final variable's value once initialized can't be changed, i.e. it is a constant private final int Tenure = 20;

Before a method
A final method cannot be overridden in a subclass
              public final void calculateEMI(){...}

Before a class
A final class cannot be subclassed. (i.e. you cannot extend the class)
              public final class Loan{...}
 */