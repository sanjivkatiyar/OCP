package ocp._24.Assert;

public class Test {

    public static void main(String[] args) {


        divide(1,0);
    }

    public static void divide(int m, int n) {
        assert n!=0 : "The ānā value should not be zero";
    }

    public static void main1(String[] args){

        int age = 18;
        // assert age > 18 : checkAge();              // void type is not allowed
        System.out.println("Age is Valid!");

    }

    private static void checkAge() {
        System.out.println("Age is Not valid!");
    }


}
/*

assert expression1 : expression2;
Where expression1 should return a Boolean value and expression2 must return a value(must not be void).

Note: By default, the assertion is disabled in Java. This means the assert keyword can be used as a normal identifier name.

To enable assertions in eclipse follow the below steps.

To execute the code, Right click on the code -> Run -> Run Configuration -> Select Arguments tab.
In the VM arguments box of the Arguments tab type -ea or -enableassertions.
Then click run.



 */