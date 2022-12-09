package com.ocp._15.VarArgs;

public class Test {

    public static void main(String[] args) {
        doSomething(1);         // in single variable
        doSomething();             // in varargs    // can take 0 arguments


    }

    public static void doSomething(int... x){
        System.out.println("in varargs");
    }
    public static void doSomething(int x){
        System.out.println("In single variable");
    }
//    public static void doSomething(){
//        System.out.println("In No Variable");
//    }
    public static void doSomething(int y, int... x){}
    // public static void doSomething(int y..., int... x){}   // two varargs are not allowed
    // public static void doSomething(int y..., int x){}   // varargs must be last parameter


}

/*

The three periods after the parameter's data type shows that it can be passed as an array or sequence of arguments.
Java internally uses an array to process the variable arguments.
varargs is better than overloading as it can take zero or any number of arguments.
Only one varargs argument is allowed in a method.
In case of more than one argument then varargs should be the last argument of the method.

 */