package ocp.java._01.datatypes.stringbuilderapi;

public class C14StringBuilderAndStringBuffer {
    public static void main(String[] args) {
        String x = "abc";
        x.concat("def");
        System.out.println(x); // abc

        // fix above issue
        x = x.concat("def");
        System.out.println(x); // abcdef but abc is lost

        // StringBuilder does the same thing without wasting memory
        StringBuilder sb = new StringBuilder("abc");
        sb.append("def");
        System.out.println(sb); // abcdef

        StringBuilder sb2 = new StringBuilder("abc");
        // only one object is used in next line
        sb2.append("def").reverse().insert(3, "---");
        System.out.println(sb2); // fed---cba

        StringBuilder sb3 = new StringBuilder("pi = ");
        sb3.append(3.142f);
        System.out.println(sb3); // pi = 3.142 no f

        StringBuilder sb4 = new StringBuilder("0123456789");
        System.out.println(sb4.delete(4,6)); // 01236789 removes 6-4 (2) chars beginning at index 4

        System.out.println(sb4.toString());

        // capacity and length
        StringBuilder sb5 = new StringBuilder();
        System.out.println(sb5.length());  // 0
        System.out.println(sb5.capacity()); // 16

        sb5.append("1234"); // length 4
        sb5.insert(1,'x');
        System.out.println(sb5);
        System.out.println(sb5.length());  // 5
        System.out.println(sb5.capacity()); // 16

        sb5.append("1234567890123456");
        System.out.println(sb5);
        System.out.println(sb5.length());  // 21
        System.out.println(sb5.capacity()); // 34 (16*2 + 1)

        sb5.insert(19, 'y'); // ok as 19<21
        System.out.println(sb5);
        System.out.println(sb5.length());  // 22

        sb5.insert(22, "z"); // ok as 22<=22
        System.out.println(sb5.length());  // 23

        sb.insert(24, "P"); // StringIndexOutOfBoundException
    }
}
