package ocp.java._07.ioandnio.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class C97FileCopyDeleteMove {
    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty(("user.dir")));

        Path source = Paths.get("nio2/source.txt");
        Path target = Paths.get("nio2/target.txt");
        Path target2 = Paths.get("nio2/target2.txt");

        Files.createDirectories(Paths.get("nio2"));

        if(Files.exists(source)){
            // Shallow copy   - directories will not be copied
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            Files.move(target, target2, StandardCopyOption.REPLACE_EXISTING);
        } else{
            Files.createFile(source);
            Files.copy(source, target);
            Files.move(target, target2);
            Files.delete(target2);
        }
    }
}
