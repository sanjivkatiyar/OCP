package ocp.java.mock.test2;

interface T1 {
}

interface T2 {
    int VALUE = 10;

    void m1();
}

interface T3 extends T1, T2 {
    public void m1();

    public void m1(int x);
}

public class Q18 implements T3, T2{
    public static void main(String[] args) {

    }

    @Override
    public void m1() {

    }

    @Override
    public void m1(int x) {

    }
}

/*
Having ambiguous fields or methods does not cause any problem by itself
(except in the case of default methods) but referring to such fields or methods in an ambiguous way
will cause a compiled time error. Having m1() in T3 is also fine because even though m1()
is declared in T2 as well as T3 , the definition to both resolves unambiguously to only one m1().
Explicit cast is not required for calling the method m1() : ( ( T2) t).m1();
 */