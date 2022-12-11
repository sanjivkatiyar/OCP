package ocp.java._05.exceptionhandling.finallystatements;

//finally is always executed (even if you throw an exception in try or catch) but this is the exception to the rule.
//When you call System.exit(...); The JVM exits so there is no way to execute the finally block.
public class C53FinallyBlock {
    public static void main(String[] args) {
        ex1(+8);
        ex1(-4);
        ex2();
        System.out.println(ex3());
    }
    public static void ex1(int x){
        try{
            System.out.println("Protected code 1");
            if (x<2){
                throw new RuntimeException();
            }
            System.out.println("Protected code 2");
        }catch (Exception e){
            System.out.println("Catch");
        }finally {
            System.out.println("Finally");
        }
        System.out.println("Continuing on...");
    }

    public static void ex2(){
        try{                 // try-finally is okay
        } finally {
        }
    }

    public static String ex3(){
        String s = "";
        try{
            s="ok";
            // throw new RuntimeException();
        } catch(Exception e){
            s="Catch";
            return s;
        } finally {
            s="finally";
            return s;
        }
    }
}
