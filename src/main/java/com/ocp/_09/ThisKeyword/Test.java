package com.ocp._09.ThisKeyword;

public class Test {

    private String str;

    Test(String str){
        this.str= str;                        // access instance variable
    }

    Test(){
        this("Sanjiv");                   // call current class constructor
    }

    public static void main(String[] args) {

    }
}
