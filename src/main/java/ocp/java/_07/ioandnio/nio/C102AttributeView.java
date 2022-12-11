package ocp.java._07.ioandnio.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class C102AttributeView {

    public static void main(String[] args) throws IOException {

        var path = Path.of("D:\\Learning\\Java-8-OCA\\src\\org\\javaadvanced\\Mill.properties");
        System.out.println(path);

        BasicFileAttributes view = Files.readAttributes(path, BasicFileAttributes.class);

        System.out.println("isDirectory: " + view.isDirectory());
        System.out.println("isRegularFile: " + view.isRegularFile());
        System.out.println("isSymbolicLink: " + view.isSymbolicLink());
        System.out.println("size: " + view.size());
        System.out.println("lastModifiedTime: " + view.lastModifiedTime());

        BasicFileAttributeView updView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        BasicFileAttributes attrs = updView.readAttributes();
        final long THIRTY_MINS_MSEC = 1000* 60 * 30;
        FileTime lastModifiedTime = FileTime.fromMillis(attrs.lastModifiedTime().toMillis() + THIRTY_MINS_MSEC);

        updView.setTimes(lastModifiedTime, null, null);
        view = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("lastModifiedTime: " + view.lastModifiedTime());


    }
}
