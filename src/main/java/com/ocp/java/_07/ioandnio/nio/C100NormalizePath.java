package com.ocp.java._07.ioandnio.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class C100NormalizePath {

    public static void main(String[] args) {
        Path p1 = Path.of("./x/y/../sean.txt");
        System.out.println(p1.normalize());

        Path p2 = Path.of("/x/y/../z");
        System.out.println(p2.normalize());;

        Path p3 = Path.of(".\\a");
        System.out.println(p3.normalize());

        Path p4 = Path.of("./a");
        System.out.println(p4.normalize());

        Path p5 = Path.of("../y/z");       // no directory beofre .. -> can't be simplified
        System.out.println(p5.normalize());

        Path p6 = Paths.get("/x.y");
        System.out.println(p6.normalize());

        Path p7 = Path.of("/a/b/../../x.y");
        System.out.println(p7.normalize());

        System.out.println(p6.equals(p7));
        System.out.println(p6.normalize().equals(p7.normalize()));
    }
}
