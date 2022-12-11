package ocp.java._07.ioandnio.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class C100NormalizePath {

    public static void main(String[] args) {
        Path p1 = Path.of("./x/y/../sean.txt");
        System.out.println(p1.normalize());   // x\sean.txt

        Path p2 = Path.of("/x/y/../z");
        System.out.println(p2.normalize());
        ; // \x\z

        Path p3 = Path.of(".\\a");      // a
        System.out.println(p3.normalize());

        Path p4 = Path.of("./a");       // a
        System.out.println(p4.normalize());

        Path p5 = Path.of("../y/z");       // no directory beofre .. -> can't be simplified
        System.out.println(p5.normalize());  //..\y\z

        Path p6 = Paths.get("/x.y");
        System.out.println(p6.normalize()); // \x.y

        Path p7 = Path.of("/a/b/../../x.y");
        System.out.println(p7.normalize());     // \x.y

        System.out.println(p6.equals(p7));       // false
        System.out.println(p6.normalize().equals(p7.normalize()));   // true
    }
}
