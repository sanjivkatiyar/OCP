package com.ocp.java._07.ioandnio.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class C99RelativizePath {

    public static void main(String[] args) {

        relativePaths();
        absolutePaths();
        mixPaths();

    }

    public static void relativePaths() {

        // two relative paths - both assumed to be in same directory
        Path p1 = Paths.get("cattle.txt");
        Path p2 = Path.of("farm/horses.txt");

        System.out.println(p1.relativize(p2));     // ..\farm\horses.txt
        System.out.println(p2.relativize(p1));     // ..\..\cattle.txt

    }

    public static void absolutePaths() {

        // absolute paths
        Path p1 = Paths.get("c:\\cattle.txt");
        Path p2 = Path.of("C:/home/farm/horxes.txt");

        System.out.println(p1.relativize(p2));     // ..\home\farm\horxes.txt
        System.out.println(p2.relativize(p1));     // ..\..\..\cattle.txt
    }

    public static void mixPaths() {
        Path p1 = Paths.get("cattle.txt");
        Path p2 = Paths.get("C:\\cattle.txt");

        System.out.println(p1.relativize(p2));   // IllegalArguementExceptio
        System.out.println(p2.relativize(p1));   // IllegalArguementExceptio
    }
}
