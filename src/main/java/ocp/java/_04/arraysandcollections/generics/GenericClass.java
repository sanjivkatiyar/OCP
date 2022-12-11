package ocp.java._04.arraysandcollections.generics;

class MyGeneric<T> {
    T t;

    MyGeneric(T t) {
        this.t = t;
    }

    T getT() {
        return t;
    }
}

public class GenericClass {

    public static void main(String[] args) {
        MyGeneric<String> g = new MyGeneric<>("SK");
        System.out.println(g.getT());

        MyGeneric<Integer> g2 = new MyGeneric<>(3);
        System.out.println(g2.getT());
    }
}

