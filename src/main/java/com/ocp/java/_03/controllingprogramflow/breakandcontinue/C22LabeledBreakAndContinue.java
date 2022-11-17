package com.ocp.java._03.controllingprogramflow.breakandcontinue;

public class C22LabeledBreakAndContinue {
    public static void main(String[] args) {
        //labeledContinue();
        labeledBreak();
    }

    public static void labeledContinue(){
        OUTERLOOP:
        // System.out.println("Placed between label and loop"); // not ok undefined OUTERLOOP
        for(int i = 1; i<=3; i++){
            for(int j =1; j<=5; j++){
                if(j==3){
                    continue OUTERLOOP;
                }
                System.out.println(i+", "+j);
            }
        }
    }

    public static void labeledBreak(){
        OUTERLOOP:
        // System.out.println("Placed between label and loop"); // not ok undefined OUTERLOOP
        for(int i = 1; i<=3; i++){
            for(int j =1; j<=5; j++){
                if(j==3){
                    break OUTERLOOP;
                }
                System.out.println(i+", "+j);
            }
        }
        for(int i = 1; i<=3; i++){
            // break OUTERLOOP; // not ok label must be within the loop
        }
    }



    void crazyLoop(){
        var c = 0;
        JACK: while (c < 8){
            JILL: System.out.println(c);
            if (c > 3) break JACK; else c++;   // ok can not break to JILL
        }
    }
}
