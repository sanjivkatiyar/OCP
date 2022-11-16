package com.ocp.java._07.ioandnio.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class C103ProcessFile {

    public static void main(String[] args) {

        List<Bunny> bunnies = loadBunnies("Bunny.txt");
        bunnies.forEach(System.out::println);

    }

    public static List<Bunny> loadBunnies(String fileName){

        List<Bunny> bunnies = new ArrayList<>();

        try(Stream<String> stream = Files.lines(Path.of(fileName))){
            stream.forEach(line -> {
                String[] bunniesArray = line.split("/");
                bunnies.add(new Bunny(bunniesArray[0], bunniesArray[1]));
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bunnies;
    }
}
