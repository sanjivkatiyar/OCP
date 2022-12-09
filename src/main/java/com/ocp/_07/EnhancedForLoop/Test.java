package com.ocp._07.EnhancedForLoop;

public class Test {
    public static void main(String[] args){
        int[] arr={12,13,14,44};

        for(float i:arr){   // Line 1                 // implicit casting
            System.out.println(i);
        }


    }
}
