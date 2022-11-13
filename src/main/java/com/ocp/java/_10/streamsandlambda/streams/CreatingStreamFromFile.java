package com.ocp.java._10.streamsandlambda.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Cat{

    private String name, colour;

    public Cat(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}


public class CreatingStreamFromFile {

    public static List<Cat> loadCats(String fileName){
        List<Cat> cats = new ArrayList<>();
        try(Stream<String> stream = Files.lines(Paths.get(fileName))){
            stream.forEach(line -> {
                String[] catsArrays = line.split("/");
                cats.add(new Cat(catsArrays[0], catsArrays[1]));
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cats;
    }

    public static void main(String[] args) {
        List<Cat> cats = loadCats("Cats.txt");
        cats.forEach(System.out::println);
    }
}
