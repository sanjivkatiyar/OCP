package ocp.java.mock.test2;

public class Q21 {
    public static void main(String[][] args) {
        System.out.println(args[0][1]);
    }

    public static void main(String[] args) {
        var fwa = new Q21();
        String[][] newargs = {args};
        fwa.main(newargs);
    }
}

/*
There is no problem with the code. The main method is just overloaded.
When it is run, the main method with String[] will be called.
This method then calls the main with String[][] with an argument { {"a", "b", "c"} }
Thus, args[0][1] refers to "b", which is what is printed.
 */