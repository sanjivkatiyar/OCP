package com.ocp._06.Arrays;

class Bank{}

public class Test {





    public static void main(String[] args) {

        int[] value = new int[3];                // Declaration and instantiation combined in a single step. This array can take 3 int values.
        value[0] = 100;                          // Initialization of array elements. Array indexing starts from 0.
        value[1] = 200;
        int[] primeNos = {11, 13, 17, 19};       // Values are assigned by using curly braces.
        int[] value1;                            // Declaration and instantiation in multiple steps.
        value1 = new int[3];
        Bank[] bank = {new Bank(), new Bank()};  // Reference type array.


        int []arr[] = new int[2][];
        int arr1[][] = new int[2][];
        int [][]arr2 = new int[2][];

        arr2[0] = new int[3];
        arr2[1] = new int[5];
        arr2[2] = new int[5];     // ArrayIndexOutOfBoundsException
    }
}
