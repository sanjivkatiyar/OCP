package com.ocp.java._03.controllingprogramflow.whileloops;

public class C17While {
    public static void main(String[] args) {
        int x = 0;
        while(x>0)
            System.out.println("x > 0"); // will not execute

        while(x<3){
            System.out.println(x); //0,1,2
            x++;
        }

        others();
    }

    public static void others()
    {
        int x = 1;
//        while(x);     // condition is not boolean
//        while(x=5){}  // condition is not boolean


        while(x==5){} //ok
        while(true){} //ok
    }
}
