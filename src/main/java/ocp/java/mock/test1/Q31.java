package ocp.java.mock.test1;

public class Q31 {

    public static void main(String[] args) {
        boolean b1 = false;
        int i1 = 2;
        int i2 = 3;
        if (b1 = i1 == i2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

/*
The expression b1 = i1 == i2 will be evaluated as b1 = (i1 == i2) because == has higher precedence than =.
Further, all an if statement needs is a boolean. Now i1 == i2 returns false which is a boolean and
since b1 = false is an expression and every expression has a return value
(which is actually the Left Hand Side of the expression), it returns false which is again a boolean.
Therefore, in this case, the else condition will be executed.
 */