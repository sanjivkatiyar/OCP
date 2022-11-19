package com.ocp.java.mock;

interface Flyer {
    String getName();
}

class Bird implements Flyer {
    public String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Eagle extends Bird {
    public Eagle(String name) {
        super(name);
    }
}

public class Test1 {

    public static void main(String[] args) throws Exception {
        Flyer f = new Eagle("American Bald Eagle");         //PRINT NAME HERE    }

        /*
         While accessing a method or variable, the compiler will only allow you to access a method or variable
         that is visible through the class of the reference.

         When you try to use f.name, the class of the reference f is Flyer and Flyer has no field named
         "name", thus, it will not compile. But when you cast f to Bird (or Eagle),
         the compiler sees that the class Bird (or Eagle, because Eagle inherits from Bird)
         does have a field named "name" so ((Eagle)f).name or ((Bird)f).name will work fine.

         f.getName() will work because Flyer does have a getName() method.
         */

        System.out.println(f.getName());
        System.out.println(((Eagle)f).name);
        System.out.println(((Bird)f).getName());
        //System.out.println(f.name);
        //System.out.println(Eagle.name);
    }
}