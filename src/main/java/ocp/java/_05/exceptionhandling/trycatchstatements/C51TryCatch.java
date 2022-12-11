package ocp.java._05.exceptionhandling.trycatchstatements;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C51TryCatch {
    public static void main(String[] args) {
        try{
            spillTea();
            System.out.println("Will never get here!");
        } catch (RuntimeException e){
            getAnotherCup();
        }
        enjoyRestOfVideo();
        trycatchExample1();
    }
    public static void spillTea(){
        System.out.println("Spilling tea.... ");
        throw new RuntimeException();
    }
    public static void getAnotherCup(){
        System.out.println("Getting another cup");
    }
    public static void enjoyRestOfVideo(){
        System.out.println("Enjoying rest of the video.... ");
    }
    public static void trycatchExample1(){
        /*try{

        }catch(EOFException e){
            // All the checked exception caught must be thrown from try block
            // or a subclass must be thrown
        }*/

        try {

        } catch(RuntimeException e){
            // this is okay because of unchecked exception
        }
    }
    public static void tryCatchExample2(){
        try{
            ex1();
        } catch (EOFException e){}
    }
    public static void ex1() throws EOFException{
        // This method does not actually throw any exception at all.
        // Regardless, the compiler ensures however that caller has to catch
        // or throw EOFException
    }
    public static void inheritanceTree(){
        try{
            throw new FileNotFoundException();
        } catch (FileNotFoundException e){}
        catch (IOException e){}
        catch (Exception e){}
        // OK

        try{
            throw new FileNotFoundException();
        } catch (IOException e){}
        // catch (FileNotFoundException e){} // not okay as Exception already been caught by parent
        catch (Exception e){}
        // OK
    }

    public static void multiCatch(){
        try{
            // throw new FileNotFoundException(); // this alone is not okay at it
            // will not reach EOFException and IOException
            // If catch block were for RuntimeException only, then empty try block is ok.
            throw new IOException(); // try block must throw IOException
        } catch(FileNotFoundException|EOFException e){
            // Identifier can appear only once, below will not compile.
            // } catch(FileNotFoundException e|EOFException e){
            // } catch(FileNotFoundException e1|EOFException e2){
            // Exceptions must be siblings (no subclass relationship).
            // below will fail to compile
            // } catch(FileNotFoundException e1|IOException e2){
        } catch(IOException e){}
    }

    public static void tryEx(){
        try{ // try-catch okay
             // Exception is okay do not need to throw
        }catch(Exception e){

        }


        // try{} // not okay, must be followed by catch or finally

        try{
        }
        // System.out.println(); // not okay, cant have any code between try and catch.
        catch(Exception e){
        }
    }
}
