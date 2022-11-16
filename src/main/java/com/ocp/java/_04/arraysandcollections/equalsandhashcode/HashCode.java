package com.ocp.java._04.arraysandcollections.equalsandhashcode;

public class HashCode {
    public static void main(String[] args) {
        Foo1 f1 = new Foo1(1);
        Foo1 f2 = new Foo1(1);
        Foo1 f3 = new Foo1(3);

        System.out.println(f1.hashCode());
        System.out.println(f2.hashCode());
        System.out.println(f3.hashCode());

        System.out.println(f1.equals(f2));
        System.out.println(f1.equals(f2));
    }
}

class Foo1{
    private int fooValue;
    Foo1(int fooValue){
        this.fooValue = fooValue;
    }

    public int getFooValue() {
        return fooValue;
    }

    @Override
    public boolean equals(Object o){
        return o instanceof Foo && this.fooValue == ((Foo)o).getFooValue();
    }

    @Override
    public int hashCode(){
        return 7*this.fooValue;
    }
}