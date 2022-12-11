package ocp.java._05.exceptionhandling.exceptionintroduction;

// Observe that all the exceptions given in the options other than
// Exception and NoClassDefFoundError are RuntimeExceptions.
// These are usually thrown implicitly. A programmer should not throw these exceptions explicitly.
// java.lang.Exception and its subclasses (except RuntimeException) should be used by the programmer
// to reflect known exceptional situations, while RuntimeExceptions are used to reflect
// unforseen or unrecoverable exceptional situations.
// Note: There is no hard and fast rule that says RuntimeExceptions
// (such as the ones mentioned in this questions)  must not be thrown explicitly.
// It is ok to throw these exceptions explicitly in certain situations.
// For example, framework/library classes such as Struts, Spring, and Hibernate, and standard JDK classes
// throw these exceptions explicitly. But for the purpose of the exam, it is a good way to determine
// if a given application should be thrown explicitly by the programmer or not.
public class C49RuntimeException {
    static String s;                        // initiated to null by default
    public static void main(String[] args) {
        // nullPointerException();
        // arrayIntexOutOfBoundException();
        // numberFormatException();
        System.out.println(illegalArguementException(3));
        System.out.println(illegalArguementException(-2));
    }

    private static void nullPointerException(){
        int x = s.length();
    }

    private static void arrayIntexOutOfBoundException(){
        int []a = {1,2,3};
        int x = a[-6];
    }

    private static void numberFormatException(){
        int x = Integer.parseInt("2");      // ok
        int y = Integer.parseInt("two");    // Exception
    }

    private static double illegalArguementException(int num){
        if(num<0) {
            throw new IllegalArgumentException();
        }
        return Math.pow(num,2);
    }
}
