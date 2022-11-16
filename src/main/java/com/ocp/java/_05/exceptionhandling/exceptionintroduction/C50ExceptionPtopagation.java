package com.ocp.java._05.exceptionhandling.exceptionintroduction;

// You can only throw a java.lang.Throwable object
// (i.e. an instance of Throwable or any of its direct or indirect subclasses)
// using a throws clause. Remember that java.lang.Exception and java.lang.
// Error are the only two directly subclasses of Throwable.
// All other exception classes inherit directly or indirectly from one of these two.
public class C50ExceptionPtopagation {
    public static void main(String[] args) {
        a();
    }
    public static void a(){
        b();
    }
    public static void b(){
        c();
    }
    public static void c(){
        int x = 7/0;                          // can not divide by 0
    }                                         // Arithmetic exception thrown which is a RuntimeException
}
