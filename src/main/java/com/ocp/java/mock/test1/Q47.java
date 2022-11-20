package com.ocp.java.mock.test1;

public class Q47 {

    public static void main(String args[]) {
        int time = 100;
        java.sql.Timestamp ts = new java.sql.Timestamp(time);
        java.util.Date d = new java.util.Date();
        ts = new java.sql.Timestamp(d.getTime());
        System.out.println(ts);

    }
}
//jdeps -summary TestClass.class
//TestClass.class -> java.base
//TestClass.class -> java.sql

// You need to remember that there is no such module as java.util.
// The java.util package belongs to the java.base module while java.sql package belongs to the java.sql module.
// Both the modules are a part of the standard Java SE platform.
// (You can check out the constituents of JSE here: https://docs.oracle.com/en/java/javase/11/docs/api/index.html ).
// Thus, when you try to find out the dependencies of the given code,
// you will only see two modules - java.base (because all Java classes have a dependency on the java.base module)
// and java.sql (because of the usage of java.sql.Timestamp class.)