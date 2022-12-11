package com.ocp._23.Exception;

public class Test {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        int intVar = 0;
        try {
            intVar = intArray[3];
            System.out.println("This is the value of intVar:=" + intVar);// 1
            String str = args[0];
            System.out.println("Length of the string is:=" + str.length());//2

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException ec) {
            System.out.println("An exception has occurred here:=" + ec.getMessage());// 3
        } finally {
            System.out.println("This is from with in the finally block");// 4
        }
        System.out.println("This will be a part of response");// 5
    }
}
