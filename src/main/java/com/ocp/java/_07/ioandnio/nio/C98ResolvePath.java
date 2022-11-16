package com.ocp.java._07.ioandnio.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class C98ResolvePath {

    public static void main(String[] args) {

        Path absolute = Paths.get("D:\\Learning\\Java-8-OCA\\src\\org\\javaadvanced");
        Path relative = Path.of("nio2");
        Path file = Path.of("Mill.properties");

        System.out.println("absolute.resolve(relative): " + absolute.resolve(relative));
        System.out.println("absolute.resolve(file): " + absolute.resolve(file));
        System.out.println("relative.resolve(file): " + relative.resolve(file));

        // trying to resolve absolute path within anything just return the absolute path
        System.out.println("relative.resolve(absolute): " + relative.resolve(absolute));
        System.out.println("file.resolve(absolute): " + file.resolve(absolute));
        System.out.println("absolute.resolve(absolute): " + absolute.resolve(absolute));

        // interesting ...
        Path p1 = Path.of("dir");
        Path p2 = Path.of("sk.txt");

        System.out.println(p1.resolve(p2));
        System.out.println(p2.resolve(p1));

    }
}
