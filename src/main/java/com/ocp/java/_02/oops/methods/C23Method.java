package com.ocp.java._02.oops.methods;

public class C23Method {
    public static void main(String[] args) {

        int sum = performCalc(3,4);
        System.out.println(sum);

        sum = performCalc(5,7);
        System.out.println(sum);

        double sumD = performCalc(5.0,7.0); //overloaded
        System.out.println(sumD);
    }

    public static int performCalc(int x, int y){
        int sum = x+y;
        return sum;
    }

    public static double performCalc(double x, double y){
        double sum = x+y;
        return sum;
    }

    // every method must have a return type or void.
    // return; does not return anything but it's okay to use with void

}
