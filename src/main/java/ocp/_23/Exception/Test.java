package ocp._23.Exception;

public class Test {

    public static void main(String[] args) {
        m();
        int[] intArray = {1, 2, 3, 4, 5};
        int intVar = 0;
        try {
            intVar = intArray[3];
            System.out.println("This is the value of intVar:=" + intVar);// 1
            String str = args[0];
            System.out.println("Length of the string is:=" + str.length());//2

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException ec) {
            System.out.println("An exception has occurred here:=" + ec.getMessage());// 3
        } finally {
            System.out.println("This is from with in the finally block");// 4
        }
        System.out.println("This will be a part of response");// 5
    }

    public static void divide(int x, int y) {
        try {
            if(true)                                                     // strange
                throw new Exception("The divisor should not be zero");
            int z = x/y;
            System.out.println(z);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void m() {
        try {
            badMethod();
            System.out.print("A");
        } catch (Exception ex) {
            System.out.print("C");
        } finally {
            System.out.print("B");
        }
        System.out.print("D");
    }
    public static void badMethod() {
        throw new Error();
    }
}

class MyOwnException extends Exception {
    public MyOwnException(String msg) {
        super(msg);
    }
}
class TestingString {
    static void testCode() throws MyOwnException {
        try {
            throw new MyOwnException("d");
        } catch (MyOwnException ex) {
            System.out.print("generic exception caught ");
        }
    }
    public static void main(String[] args) {
        try {
            testCode();
        } catch (MyOwnException ex) {
            System.out.print("custom exception handling");
        }
    }
}


/*
Any  Throwable object type can be thrown.
 */