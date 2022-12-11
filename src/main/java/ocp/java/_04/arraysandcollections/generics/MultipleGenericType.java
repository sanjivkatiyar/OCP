package ocp.java._04.arraysandcollections.generics;

public class MultipleGenericType {
    public static void main(String[] args) {
        new Register(new Dog(), "Shep", 3);
        new Register(new Cat(), 75, "SK");
    }
}

class Register<T,U,V>{
    private T t;
    private U u;
    private V v;
    Register(T t, U u, V v){
        this.t = t;
        this.u = u;
        this.v = v;
    }
    public T getT(){
        return t;
    }
    public U getU(){
        return u;
    }
    public V getV(){
        return v;
    }
}
