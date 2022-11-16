package com.ocp.java._07.ioandnio.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C104SearchDirectory {

    public static void main(String[] args) {

        Path startPath = Paths.get("D:\\Learning\\Java-8-OCA");

        try (var steamPaths = Files.find(startPath, 10, (path, attr) -> attr.isRegularFile() && path.toString().endsWith(".java"))){
            steamPaths.forEach(System.out::println);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
