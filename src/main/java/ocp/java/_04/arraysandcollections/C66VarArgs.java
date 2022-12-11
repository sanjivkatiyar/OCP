package ocp.java._04.arraysandcollections;

public class C66VarArgs {
    public static void main(String[] args) {
        someMethod();
        /**
         * 0
         * [Ljava.lang.Object;@7699a589
         */
        someMethod(1);
        /**
         * 1
         * [Ljava.lang.Object;@58372a00
         */
    }
    public static void someMethod(Object... params)
    {
        System.out.println(params.length);
        System.out.println(params);
    }
}
