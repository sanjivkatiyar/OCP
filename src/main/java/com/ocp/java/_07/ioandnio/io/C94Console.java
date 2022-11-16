package com.ocp.java._07.ioandnio.io;

import java.io.Console;
import java.util.Arrays;

public class C94Console {
    public static void main(String[] args) {
        Console console = System.console();
        if(console == null){
            System.err.println("Console not available");
        } else {
            String name = console.readLine("Pls enter your %s:", "name");
            console.format("Hello there %s%n", name);
            console.printf("Welcome.");
            console.writer().println();

            char pwd[] = console.readPassword("Enter password (between %d and %d characters):", 4, 10);
            char[] pwdAgain = console.readPassword("Verify password: ");
            boolean pwdMatch = Arrays.equals(pwd, pwdAgain);
            if(pwdMatch)
                console.printf("password match!");
            else
                console.printf("password do not match!");
        }
    }
}
