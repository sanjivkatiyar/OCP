package com.ocp.java._03.controllingprogramflow.ifstatements;

public class C15IfStatement {
    public static void main(String[] args) {
        ifStatements1();
        ifStatements2();
        ifStatements3();
        ifStatements4();
        danglingElse(false);
    }

    public static void ifStatements1(){

        int x = 5;
        int y = 6;

        if(x>3)     // true
            x ++;   // 6
        if(x>5) {   // true
            x--;    // 5
            y++;    // 7
        }
        if(x<3){     // false
            y--;
        }
        System.out.println(x + " " + y); // 5 7
    }

    public static void ifStatements2(){
        int x = 5;
        int y = 6;

        if(x ==4) {
            x++;
            y ++;
        } else {
            x --; // 4
            y --; // 5
        }
        System.out.println(x + " " + y); // 4 5
    }

    public static void ifStatements3(){
        int x = 5;
        int y = 6;
        boolean b = false;

        if(b = true){    //true assignment!
            x ++;
            y++;
        } else if(y>0) { // not evaluated
            x--;
            y--;
        } else{          // not evaluated
            x=9;
            y=9;
        }
        System.out.println(x + " " + y); // 6 7
    }

    public static void ifStatements4(){
        int x = 0;
        int y = 0;
        // if(x=3) {} // compilation error, not a boolean expression
        if(x==3)
        if(x==10)
        x++;
        y++;          // executed
        System.out.println(x + " " + y); // 0 1
    }

    public static void danglingElse(boolean b){
        if(b)
        if(b)
        System.out.println("Here1");
        else
        System.out.println("Here2");
        else
        System.out.println("Here3");
    }
}
