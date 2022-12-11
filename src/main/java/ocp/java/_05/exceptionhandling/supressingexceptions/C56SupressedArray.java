package ocp.java._05.exceptionhandling.supressingexceptions;

import java.io.IOException;

public class C56SupressedArray {
    public static void main(String[] args) {
        try (MyClosable1 c1 = new MyClosable1('A');
             MyClosable1 c2 = new MyClosable1('B')) {
            throw new IOException("IO Exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            for(Throwable t:e.getSuppressed()){
                System.out.println("Suppressed: " + t.getMessage());
            }
        } finally {
            System.out.println("Custom Finally");
        }



        try (MyClosable1 c1 = new MyClosable1('A');
             MyClosable1 c2 = new MyClosable1('B')) {
            // throw new IOException("IO Exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            /*for(Throwable t:e.getSuppressed()){
                System.out.println(t.getMessage());
            }*/
        } finally {
            System.out.println("Custom Finally");
        }


        try (MyClosable1 c1 = new MyClosable1('A');
             MyClosable1 c2 = new MyClosable1('B')) {
            throw new IOException("IO Exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            for(Throwable t:e.getSuppressed()){
                System.out.println("Suppressed: " +t.getMessage());
            }
            try {
                throw new IOException("Catch");
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
                for(Throwable t:e2.getSuppressed()){
                    System.out.println("Suppressed twice: " +t.getMessage());
                }
            }
        } finally {
            System.out.println("Custom Finally");
        }
    }
}


class MyClosable1 implements AutoCloseable{

    private final char letter;
    MyClosable1(char letter){
        this.letter=letter;
    }
    @Override
    public void close() throws Exception {
        throw new Exception("Closing: "+ letter);
    }
}