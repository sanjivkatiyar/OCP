package com.ocp.java._10.streamsandlambda.streams;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        System.out.println(oddNumbers.findFirst());
        //oddNumbers.forEach(System.out::println);


        Optional<String> str = Optional.ofNullable("Hello");
        String value1 = str.orElse(getval());
        String value2 = str.orElseGet(() -> getval()); // Line1

        //InputStream
        //BufferedInputStream stream = new BufferedInputStream(new BufferedInputStream(new FileInputStream(new File(""))));
        Console cc = System.console();
        //System.out
        File file = new File("");
        file.delete();

        int[] arr1 = { 1, 2, 4, 5};
        int[] arr2 = arr1.clone();
        System.out.println(arr1==arr2);
        System.out.println(arr1.equals(arr2));
        System.out.println(Arrays.equals(arr1, arr2));



    }



    public static String getval() {
        System.out.println("Tello");
        return "Tello";
    }

    public void removeWrongFile(Path path) throws IOException {
        if(Files.isDirectory(path))
            System.out.println(Files.deleteIfExists(path) ? "Success": "Try Again");
    }
}
