package com.ocp.java.mock.test2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q45 {
    public static boolean isValid(Path p) {
        return p.startsWith("temp") && p.endsWith("clients.dat");
    }

    public static void writeData() {
        var p1 = Paths.get("\\temp\\records");
        var p2 = p1.resolve("clients.dat");
        System.out.println(p2 + " " + isValid(p2));   // \temp\records\clients.dat false
    }

    public static void main(String[] args) {
        writeData();
    }

}
/*
p2 will be set to \temp\records\clients.dat. Since it starts with \temp and not with temp, the method isValid will
return false.
 */