package ocp.java.mock.test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.NoSuchFileException;

public class Q25 {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new FileReader("c:\\works\\a.java"))) {
            String line = null;
            while ((line = bfr.readLine()) != null) {
                System.out.println(line);
            }
        //} catch (NoSuchFileException | IOException | AccessDeniedException e) {
            // NoSuchFileException and AccessDeniedException are subclasses of IOException.
            // You cannot include classes that are related by inheritance in the same multi-catch block.
        } catch ( IOException e) {
            e.printStackTrace();
        }
    }
}
