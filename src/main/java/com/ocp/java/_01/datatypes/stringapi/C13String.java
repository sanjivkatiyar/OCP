package com.ocp.java._01.datatypes.stringapi;

import javax.sound.midi.Soundbank;
import java.util.Locale;

// String in not primitive
// Java has only the following primitive data types:
//boolean, byte, short, char, int, long, float and double
// reverse is not a string method
// String is a final class and final classes cannot be extended
public class C13String {
    public static void main(String[] args) {
        refVersusObjects();
        stringEquality();
        stringChaining();
        StringCharAt();
        subString();
        others();
    }

    public static void refVersusObjects() {
        String s1 = "abc";
        String s2 = s1; // both refer to same object
        s1 = s1.concat("def");
        System.out.println(s1 + " " + s2);  // abcdef abc

        String s3 = "Java";
        s3.concat("11 certification");
        System.out.println(s3); // Java
    }

    public static void stringEquality(){
        String name1 = "Sean";
        String name2 = "Sean"; // (same reference) pointing to same object as earlier
        System.out.println(name1 == name2); //true, are the references the same?
        String name3 = new String("Sean"); // creates a new object and pointing to it
        System.out.println(name1 == name3); //false // object references are different
        System.out.println(name1.equals(name3)); // true object values are same
        System.out.println(name1 == new String("Sean").intern()); // true go and used sting pool version if there
    }

    public static void stringChaining(){
        String s = "qwe"
                .concat("try")
                .toUpperCase()
                .replace('E', 'O');
        System.out.println(s); // QWORTY
    }

    public static void StringCharAt(){
        String x = "phone";
        System.out.println(x.charAt(2)); // 'o' indexes are 0 based
    }

    public static void subString()
    {
        String x = "0123456789";
        System.out.println(x.substring((5))); // 56789 indexes are 0 based
        System.out.println("unhappy".substring(2));
        // System.out.println("Harbison".substring(-1)); // index out of bound
        System.out.println("emptiness".substring(9)); // empty string
        // System.out.println("emptiness".substring(10)); // index out of bound

        System.out.println(x.substring(5,8)); // 567 second index is not 0 base hence called position
    }

    public static void others(){
        String x = "Exitx";
        System.out.println(x.equalsIgnoreCase("EXITX")); // true
        System.out.println(x.length()); // 4
        System.out.println(x.replace('x', 'o')); // replace all occurrences

        String y = " hi ";
        System.out.println(y.trim());
    }
}
