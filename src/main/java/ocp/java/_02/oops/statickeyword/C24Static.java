package ocp.java._02.oops.statickeyword;

//An instance member belongs to a single instance, not the class as a whole.
// An instance member is a member variable or a member method that belongs to a specific object instance.
// All non-static members are instance members.
public class C24Static {
    public static void main(String[] args) {
        Person p1 = new Person("John");
        Person p2 = new Person("Mary");
        System.out.println(p1.getCount());
        System.out.println(p2.getCount());

        Person1 p3 = new Person1("John");
        Person1 p4 = new Person1("Mary");
        System.out.println(Person1.getCount());
    }
}

class Person{                 //if we add public will throw error and ask to write the clas in Person.java
    private String theName; // initialized to null
    private int count; // initialized to 0
    //Constructor can have access modifier but not specifier or return type
    // specifier alone with throw compilation error and adding return type will convert it to a method
    Person(String aName) {
        theName = aName;
        count++;
    }

    public String getTheName() {
        return theName;
    }

    public void setTheName(String theName) {
        this.theName = theName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}


class Person1{                 //if we add public will throw error and ask to write the clas in Person.java
    private String theName; // initialized to null
    private static int count; // initialized to 0

    //Constructor can have access modifier but not specifier or return type
    // specifier alone with throw compilation error and adding return type will convert it to a method
    Person1(String aName) {
        theName = aName;
        Person1.count++;
    }

    public String getTheName() {
        return theName;
    }

    public void setTheName(String theName) {
        this.theName = theName;
    }

    public static int getCount() {
        return Person1.count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}