package ocp.java._12.annotations;


// 1. @Override Person
//      a) commented out - Object::toString() called
//      b) comment removed - working
//      c) rename method to "tostring()" - with @Override, we get an error
// 2. @Override Moveable
//      a) working
//      b) make the method package private in the class - error
// 3. @FunctionalInterface - Moveable
//      a) working
//      b) if "run()" is uncommented, now we get an error
//      c) if "equals()" is uncommented, no error

@FunctionalInterface
interface Moveable{
    public void move();
    //public void run();
    //boolean equals(Object o);       // Object methods are not counted
}

//class Person extend Object implements Movable{
class Person implements Moveable{

    private String name;

    Person(String name){
        this.name = name;
    }

    /*@Override
    public String toString(){
        return name;
    }*/

    @Override
    //public boolean equals(Person p){         // compilation error must be Object
    public boolean equals(Object p){
        return true;
    }

    @Override
    public void move() {              // Note: Must be public, override cannot assign weaker privilege
        System.out.println("Moving");
    }
}


public class CommonBuiltInAnnotations {
    public static void main(String[] args) {
        Person sk = new Person("Sanjiv Katiyar");
        System.out.println(sk);       // sk.toString() is called in background
        sk.move();
    }
}
