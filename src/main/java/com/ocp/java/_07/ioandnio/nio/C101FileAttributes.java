package com.ocp.java._07.ioandnio.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C101FileAttributes {

    public static void main(String[] args) {

        checkAttributes(Path.of("D:\\Learning\\Java-8-OCA\\src\\org\\javaadvanced\\Mill.properties"));
        checkAttributes(Path.of("D:\\Learning\\Java-8-OCA\\src\\org\\javaadvanced"));


    }

    public static void checkAttributes(Path path){
        System.out.println(path);
        System.out.println("isDirectory: " + Files.isDirectory(path));
        System.out.println("isRegularFile: " + Files.isRegularFile(path));
        System.out.println("isSymbolicLink: " + Files.isSymbolicLink(path));
        System.out.println("isReadable: " + Files.isReadable(path));
        System.out.println("isWritable: " + Files.isWritable(path));
        System.out.println("isExecutable: " + Files.isExecutable(path));
        try{
            System.out.println("isHidden: " + Files.isHidden(path));
            System.out.println("size: " + Files.size(path));
            System.out.println("getLastModifiedTime: " + Files.getLastModifiedTime(path).toMillis());
            long millisFromEpoch = Files.getLastModifiedTime(path).toMillis();
            ZonedDateTime zdt = FileTime.fromMillis(millisFromEpoch).toInstant().atZone(ZoneId.of("Europe/Dublin"));
            System.out.println(zdt);

        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
