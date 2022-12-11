package ocp.java._02.oops.constructors;

public class Initialization {
}

class Car {
    public int x;

    public int getX() {
        System.out.println("getX");
        return x;
    }

    public Car() {
        System.out.println("Car - Constructor ");
    }
    {
        System.out.println("Car - Instance ");
        System.out.println("x: " + x);
    }
    static {
        System.out.println("Car - Static ");
    }
    // public int x; illegal forward reference
}
class Maruti extends Car {
    public Maruti(int id) {
        System.out.println("Maruti1 - Constructor ");
    }
    public Maruti() {
        System.out.println("Maruti2 - Constructor ");
    }
    {
        System.out.println("Maruti - Instance ");
    }
    static {
        System.out.println("Maruti - Static ");
    }
}
class Baleno extends Maruti {
    public Baleno() {
        super(2);
        System.out.println("Baleno - Constructor ");
    }
    {
        System.out.println("Baleno - Instance ");
    }
    static {
        System.out.println("Baleno - Static ");
    }

    public static void main(String[] args) {
        new Baleno();
    }

}