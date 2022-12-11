package ocp.java.mock.test2;

public class Q47 {
    private byte[] allocateNew(int additional, byte[] existing) {
        byte[] newarray = new byte[existing.length + additional];
        System.arraycopy(existing, 0, newarray, 0, existing.length);
        return newarray;
    }


}
/*
This code correctly implements Accessibility and Extensibility guidelines.
Since the method is used internally by the class, it should not be visible to other classes. Guideline 4-1 /
EXTEND-1: Limit the accessibility of classes, interfaces, methods, and fields

This code is prone to one category of denial of service attacks.
The expression existing.length+additional will overflow after reaching Integer.MAX_VALUE.  Thus, this code violates
Guideline Guideline 1-3 / DOS-3: "Resource limit checks should not suffer from integer overflow".
 */