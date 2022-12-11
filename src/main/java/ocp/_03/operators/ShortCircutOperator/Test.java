package ocp._03.operators.ShortCircutOperator;

public class Test {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        int i = 10;

        // if (a & & b){           // shouldn't be any space
        // + +i;                   // shouldn't be any space


        int m = 1;
        int n = ++m + m++ + --m;
        System.out.println(n);
    }

}
