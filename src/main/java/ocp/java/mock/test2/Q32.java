package ocp.java.mock.test2;

public class Q32 {

    public static void main(String[] args) {
        var hasParams = (args == null ? false : true);
        if (hasParams) {
            System.out.println("has params");
        }
        {
            System.out.println("no params");
        }
    }
}

/*
Remember that the args array is never null. If the program is run without any arguments, args points to a String
array of length 0. Therefore, hasParams will be true and it will print "has params".  Since there is no else, the
subsequent code block will also be executed and it will print "no params". Note that it is not syntactically wrong to
 have section of code wrapped in { }.
 */