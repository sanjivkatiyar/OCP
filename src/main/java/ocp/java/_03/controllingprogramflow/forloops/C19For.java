package ocp.java._03.controllingprogramflow.forloops;

import java.net.ServerSocket;

public class C19For {
    public static void main(String[] args) {

        // initialization -> condition check -> execution -> increment/decrement -> condition check -> execution -> increment/decrement

        for(int i=1; i<=3; i++); //ok

        for(int i=1; i<0; i++); // for loop ends here
        {
            System.out.println("Sanjiv"); //always execute, not part of for loop
        }

        for(int i=3; i>=1; --i) {
            System.out.println(i);
        }

        for(int i=0; i<=3; i++) {
            System.out.println(i);
        }

        for(int i=0, j=0; i<1 && j<1; ++i,j++ )
        {
            System.out.println(i + " " + j);
        }

        for(int i=0; i<5; i--) {} // infinite loop

        int i =0;
        // for(int i=0; i<5; i++) {} // i already declared in this scope

        // for(int j=0, int k=0; j<2 && k<1; j++,k++) {} // not ok
        // for(int j=0, byte k=0; j<2 && k<1; j++,k++) {} // not ok
        for(int j=0, k=0; j<2 && k<1; j++,k++) {} //  ok

        for(int l=0; l<5; l++){}
        //System.out.println(l);  // l out of scope

        int counter = 0;
        // for(counter;counter>1;counter++){} // not ok, initialization is required
        for(counter=3;counter>1;counter--){} //ok

        System.out.println(counter); // counter 1

        for(;;){    // infinite loop
            System.out.println("Sanjiv");
            break;  // adding break to end the loop
        }

        /*for(;false;){    // not ok as next statement is not reachable
            System.out.println("Sanjiv");
            break;  // adding break to end the loop
        }*/

        for(;true;){    // infinite loop
            System.out.println("Sanjiv");
            break;  // adding break to end the loop
        }
    }
}
