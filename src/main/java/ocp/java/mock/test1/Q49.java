package ocp.java.mock.test1;


interface AmazingInterface {
    String value = "amazing";

    void amazingMethod(String arg);
}

abstract class AmazingClass implements AmazingInterface {
    static String value = "awesome";

    abstract void amazingMethod(String arg1, String arg2);
}

public class Q49 extends AmazingClass implements AmazingInterface {
    public void amazingMethod(String arg1) {
    }

    public void amazingMethod(String arg1, String arg2) {
    }

    public void main(String[] args) {
        AmazingInterface ai = new Q49();
        //INSERT CODE HERE

        // ai.amazingMethod(AmazingInterface.value, AmazingClass.value);

        // ai is a reference of type AmazingInterface.
        // AmazingInterface does not have an amazingMethod with two parameters.
        // Therefore, this will not compile.


        ai.amazingMethod(AmazingInterface.value);

        // ((AmazingClass)ai).amazingMethod("x1", value);    // java: reference to value is ambiguous

        // ai.amazingMethod(value);                          // java: reference to value is ambiguous

        ai.amazingMethod("x1");

    }
}