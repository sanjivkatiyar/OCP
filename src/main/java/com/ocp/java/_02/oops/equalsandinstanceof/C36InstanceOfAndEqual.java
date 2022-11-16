package com.ocp.java._02.oops.equalsandinstanceof;

public class C36InstanceOfAndEqual {

    public static void main(String[] args) {
        Actor A1 = new Actor("Sanjiv", 40);
        Actor A2 = new Actor("Sanjiv", 40);
        System.out.println(A1==A2);
        System.out.println(A1.equals(A2));
    }

}

class Actor{
    private String name;
    private int age;

    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof Actor) {
            Actor a = (Actor)o;
            // Actor a = (Actor)(o); // same as above
            if (a.age == age && a.name.equals(name)) {
                return true;
            }
        }
        return false;
    }

}