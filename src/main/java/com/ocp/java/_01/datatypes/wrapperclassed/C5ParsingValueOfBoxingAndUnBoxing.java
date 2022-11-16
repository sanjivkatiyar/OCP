package com.ocp.java._01.datatypes.wrapperclassed;

public class C5ParsingValueOfBoxingAndUnBoxing {

    public static void main(String[] args) {

        // parseXXX (String)
        int i = Integer.parseInt("33"); // parseInt returns an int
        double d = Double.parseDouble("2.3");
        float f = Float.parseFloat("4.4");

        System.out.println("i: " + i);
        System.out.println("d: " + d);
        System.out.println("f: " + f);

        // valueOf() preferred to using constructors (memory)
        Integer iw = Integer.valueOf(2); // better than using a constructor
        Integer iw1 = new Integer(2); // deprecated
        Integer iw2 = Integer.valueOf("22"); // overloaded
        Integer iw3 = Integer.valueOf("F", 16); // "F" treated as hex (base 16)

        System.out.println("iw: " + iw);
        System.out.println("iw1: " + iw1);
        System.out.println("iw2: " + iw2);
        System.out.println("iw3: " + iw3);

        // boxing/unboxing
        Integer x = 3; // auto-boxing
        int i1 = Integer.valueOf(3); // auto-unboxing

        System.out.println("x: " + x);
        System.out.println("i1: " + i1);
    }

    long primitive() {
        boolean bo = true; //false

        byte b = (byte) 1;
        b = (short) 1;
        b = 1;//int (-128 to 127)
        b = (int) 1L;
        b = (int) 1.2345f;
        b = (int) 1.245;
        b = 'a'; //97

        short s = (byte) 1;
        s = (short) 1;
        s = 1; //int (-32,768 to 32,767)
        s = (int) 1L;
        s = (int) 1.2345f;
        s = (int) 1.245;
        s = 'a';

        s = b;
//        b = s;

        int i = (byte) 1;
        i = (short) 1;
        i = 1; //(-2,147,483,648 to 2,147,483,647)
        i = (int) 1L;
        i = (int) 1.2345f;
        i = (int) 1.245;
        i = 'a';

        i = b;
        i = s;
//        b = i;
//        s = i;

        long lo = (byte) 1;
        lo = (short) 1;
        lo = 1;
        lo = 2147483648L;
        lo = (long) 3.14f;
        lo = (long) 3.14;
        lo = 'a';

        float f = (byte) 1;
        f = (short) 1;
        f = 1;
        f = 2147483648L;//2.14748365E9
        f = 3.14f;
        f = (float) 3.14;
        f = 'a';

        double d = (byte) 1;
        d = (short) 1;
        d = 1;
        d = 2147483648L;//2.14748365E9
        d = 3.14f;
        d = 3.14; //double
        d = 'a';

        char c = 'a'; //97
        c = (byte) 1;
        c = (short) 1;
        c = 1; //int (0 to 65,535)
        c = (short) 1L;
        c = (short) 3.14f;
        c = (short) 3.14;
        return 1L;
    }

    public Long wrapper() {
        Boolean bo = false; //Autoboxing
        boolean boo = Boolean.valueOf(true); //unboxing

        //Before Java 5.0
        bo = Boolean.valueOf(true);
        bo = Boolean.valueOf("FALSE");

        boo = Boolean.parseBoolean("false");

        Byte b = (byte) 1;
        b = (short) 1;
        b = 1; //int
        b = (byte) 1L;
        b = (short) 1.2345f;
        b = (int) 1.245;
        b = 'a';

        Short s = (byte) 1;
        s = (short) 1;
        s = 1;
        s = (int) 1L;
        s = (int) 1.2345f;
        s = (int) 1.245;
        s = 'a';

        Integer i = 1;
        i = (int) 1L;
        i = (int) 1.2345f;
        i = (int) 1.245;
        i = (int) 'a';

        Long lo = (long) 1;
        lo = 1L;
        lo = (long) 3.14f;
        lo = (long) 3.14;
        lo = (long) 'a';

        Float f = (float) 1;
        f = 3.14f;
        f = (float) 2147483648L;//2.14748365E9
        f = (float) 3.14;
        f = (float)'a';

        Double d = (double)1;
        d = (double) 1L;
        d = (double)3.14f;
        d = 3.14;
        d = (double)'a';

        Character c = 'a';
        c = 1; //int (0 to 65,535)
        c = (int)1;
        c = (byte) 1L;
        c = (short) 3.14f;
        c = (char) 3.14;

        return 1L;
    }
}
