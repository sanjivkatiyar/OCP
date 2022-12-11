package ocp.java._05.exceptionhandling;

public class Test {

    public static void doNotCodeThis(int num) {
        doNotCodeThis(1);
    }
    public static void main(String... args) {
        doNotCodeThis(1);

    }
}

class B{
    public static void main(String[] other) {

        Object object = Integer.valueOf(42);
        String str = (String) object;
        object = null;
        System.out.println(object.equals(null));
    }
}
