package ocp.java._02.oops.callbyvalue;

import ocp.java._02.oops.Adult;

public class C27CallByValue {
    public static void main(String[] args) {
        int age = 20;
        Adult john = new Adult("John", age);
        change(john, age);
        System.out.println(john.getName()+" " + john.getAge()+" "+age);  // Michael 20 20
    }

    public static void change(Adult adult, int age){
        age = 90;
        adult.setName("Michael");
    }
}
