package ocp.java.mock.test2;

public class Q24 {
    public static void main(String args[]) {
        int i = 1;
        int[] iArr = {1};
        incr(i);
        incr(iArr);
        System.out.println("i = " + i + "  iArr[0] = " + iArr[0]);
    }

    public static void incr(int n) {
        n++;
    }

    public static void incr(int[] n) {
        n[0]++;
    }
}

/*
Arrays are proper objects (i.e. iArr instanceof Object returns true) and Object references are passed by value (so
effectively, it seems as though objects are being passed by reference). So the value of reference of iArr is passed
to the method incr(int[] i); This method changes the actual value of the int element at 0.
 */