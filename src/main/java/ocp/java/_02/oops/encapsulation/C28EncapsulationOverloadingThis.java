package ocp.java._02.oops.encapsulation;
// learning outcome:
// 1. Scope
// 2. Classes, fields, methods
// - instance, static, overloaded constructors (methods)
// - encapsulation
// - 'this' reference
// 3. Object creation, garbage collection.
public class C28EncapsulationOverloadingThis {

    private int age;            // instance variable
    private String name;        // instance variable
    private static int count;   // class variable

    // A constructor is method which has:
    // 1. the same name as the class
    // 2. no return type
    public C28EncapsulationOverloadingThis (){
        C28EncapsulationOverloadingThis.count++;
    }

    public C28EncapsulationOverloadingThis(String name, int age){ // overloaded constructor
        this.name = name; // parameters hide the instance variable so use this
        this.age = age;
        C28EncapsulationOverloadingThis.count++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        C28EncapsulationOverloadingThis sean = new C28EncapsulationOverloadingThis("Sean Kennedy", 43);
        C28EncapsulationOverloadingThis marry = new C28EncapsulationOverloadingThis();
        marry.setAge(25);
        marry.setName("Marry");
        System.out.println(C28EncapsulationOverloadingThis.count); //2

    }
}
