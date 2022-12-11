package ocp.java.mock.test2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class Q31 {

    public static void main(String[] args) {


        try {
            Stream<Path> s = null;
            //INSERT CODE HERE

            s = Files.find(Paths.get("c:\\temp\\pathtest"), Integer.MAX_VALUE,
                    (p, a) -> p.endsWith("test.txt") && a.isRegularFile());

            //public static Stream<Path> find(Path start, int maxDepth,BiPredicate
            // <Path, BasicFileAttributes> matcher, FileVisitOption... options) throws IOException
            //Return a Stream that is lazily populated with Path by searching for files in a file tree rooted at a
            // given starting file.
            s.forEach(System.out::println);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
