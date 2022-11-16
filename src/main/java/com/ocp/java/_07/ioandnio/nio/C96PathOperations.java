package com.ocp.java._07.ioandnio.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class C96PathOperations {

    public static void main(String[] args) {
        pathInfo(Paths.get("D:/Learning/Java-8-OCA/src/org/javaadvanced/Mill.properties"));
    }

    public static void pathInfo(Path path){
        System.out.println("toString: " + path);
        System.out.println("getNameCount: " + path.getNameCount());
        for(int i=0; i<path.getNameCount(); i++){
            System.out.println("getName(" + i + "): " + path.getName(i));
        }
        System.out.println("getFileName: " + path.getFileName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getRoot: " + path.getRoot());

        // System.out.println("getFileName: " + Path.of("/").getName(0));  // IllegalArguementException
        System.out.println("subpath(0,3): " + path.subpath(0,3));
        System.out.println("subpath(1,3): " + path.subpath(1,4));
        // System.out.println("subpath(0,3): " + path.subpath(0,7));       // IllegalArguementException

        System.out.println("isAbsolute: " + path.isAbsolute());

    }
}
