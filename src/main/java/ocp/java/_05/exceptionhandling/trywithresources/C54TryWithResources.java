package ocp.java._05.exceptionhandling.trywithresources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C54TryWithResources {
    public static void main(String[] args) throws IOException {
        ex1();
    }
    public static void ex1() throws IOException {
        // no catch or finally block required. finally, is implicit
        // However, method must declare that it throws exception
        // out closes first then in
        try(FileInputStream in = new FileInputStream("in.txt");
            FileOutputStream out = new FileOutputStream("out.txt")){
        }
        // scope is local i.e. ok to use in again
        // var is okay
        try(FileInputStream in = new FileInputStream("in.txt");
            FileOutputStream out = new FileOutputStream("out.txt")){
        }
    }
}
