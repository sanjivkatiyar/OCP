package com.ocp._05.ConditionalStatements.switchStatements;

public class Test {

    public static void main(String[] args) {
        int choice = 0;
        choice = 2;   // Input taken from user
        switch(choice) {  // choice passed to switch statement
            // choice has to match the case value to execute the statements in that case option.
            default:        // If no case matches, default will be executed.
                System.out.println("Invalid choice");
            case 1:         // new record entry: newEntry()
                System.out.println("Entry deposition");
                break;

            case 2:         // displaying details of account: display()
                System.out.println("Display operation");
                break;        // break keyword is used to exit from the switch block.

            case 3:         // deposit operation: deposit()
                System.out.println("Deposit operation");
                break;
        }

        char c = 'a';
        switch(c) {

            case 'a':

        }

        float f = 'a';
        //        switch(f) {           // compilation error can not use float in switch
        //
        //            case 'a':
        //
        //        }


        int i = 1, j = -1;
        switch (i) {
//            case 0, 1:             // Enhanced 'switch' blocks are not supported at language level '11' (supported in 14)
//                j = 1;
            case 2:
                j = 2;
            default:
                j = 0;
        }
        System.out.println("j=" + j);

    }
}

/*
Java switch expression must be of byte, char, short, int, long(with its Wrapper type), enums and string.
 */