package com.ocp.java._05.exceptionhandling.trywithresources;

public class C55CustomCloseable {
    public static void main(String[] args) {
        try (MyClosable c1 = new MyClosable('A');
             MyClosable c2 = new MyClosable('B')) {
            int x = 5/0;
        } catch (Exception e) {
            System.out.println("Exception: Divide by zero");
        } finally {
            System.out.println("Custom Finally");
        }
    }
}

class MyClosable implements AutoCloseable{

    private final char letter;
    MyClosable(char letter){
        this.letter=letter;
    }
    @Override
    public void close() throws Exception {
        System.out.println(letter);
    }
}