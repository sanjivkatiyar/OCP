package com.ocp.java._07.ioandnio.io;

import java.io.*;

public class C93ReadWrite {

    public static void main(String[] args) {
        //copyTextFile(true);
        //copyTextFile(false);
        copyBinaryFile(true);
        copyBinaryFile(false);
    }

    public static void copyTextFile(boolean buffering){
        File src = new File("D:\\Learning\\Java-8-OCA\\src\\org\\javaadvanced\\C93ReadWrite.java");
        File dest = new File("D:\\Learning\\Java-8-OCA\\src\\org\\javaadvanced\\C93ReadWrite_copy.java");

        try(var rdr = new BufferedReader(new FileReader(src));
            var wtr = new BufferedWriter(new FileWriter(dest))) {

            if(buffering){
                String str;
                while ((str = rdr.readLine())!=null){
                    wtr.write(str);
                    wtr.newLine();                    // readLine() strips out the end of line character
                }
            } else{
                int b;
                while ((b=rdr.read())!=-1){
                    wtr.write(b);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyBinaryFile(boolean buffering){
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        File src = new File("./out/production/Java-8-OCA/org/javaadvanced/C93ReadWrite.class");
        File dest = new File("./out/production/Java-8-OCA/org/javaadvanced/C93ReadWrite_copy.class");

        try(var in = new BufferedInputStream(new FileInputStream(src));
            var out = new BufferedOutputStream(new FileOutputStream(dest))) {

            if(buffering){
                var buffer = new byte[1024];
                int numByteRead = 0;
                while ((numByteRead = in.read()) > 0){
                    out.write(buffer, 0, numByteRead);
                    out.flush();
                }
            } else{
                int b;
                while ((b=in.read())!=-1){
                    out.write(b);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
