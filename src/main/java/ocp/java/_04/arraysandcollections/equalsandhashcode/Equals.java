package ocp.java._04.arraysandcollections.equalsandhashcode;

public class Equals {
    public static void main(String[] args) {
        Foo f1 = new Foo(1);
        Foo f2 = new Foo(1);
        System.out.println(f1.equals(f2));                    // true
        System.out.println(f1.equals("SK"));                  // false (no class cast Exception)
    }
}

class Foo{
    private int fooValue;
    Foo(int fooValue){
        this.fooValue = fooValue;
    }

    public int getFooValue() {
        return fooValue;
    }

    @Override
    public boolean equals(Object o) {
        // && short-circuit if 'o' is not of type and therefore the downcast
        // will never generate a ClassCastException
        return o instanceof Foo && this.fooValue == ((Foo) o).getFooValue();
    }
}