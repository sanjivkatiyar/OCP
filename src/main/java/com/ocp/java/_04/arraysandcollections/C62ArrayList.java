package com.ocp.java._04.arraysandcollections;

import java.util.ArrayList;

public class C62ArrayList {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        Person2[] propleArray = {new Person2("Sanjiv"), new Person2("Shikha")};

        ArrayList<Person2> peopleAL = new ArrayList<>();
        Person2 jyoti = new Person2("Jyoti");
        peopleAL.add(jyoti);
        peopleAL.add(new Person2("Ishi"));
        peopleAL.add(new Person2("Shreyas"));
        peopleAL.add(new Person2("Sanjiv"));
        peopleAL.add(new Person2("Shikha"));
        peopleAL.add(4,new Person2("Tom"));
        System.out.println(peopleAL);

        // peopleAL.add(7,new Person2("Jerry")); // not okay, will throw index out of bound exception

        Person2 p = peopleAL.get(1);
        System.out.println(p.getName());
        System.out.println(peopleAL.contains(jyoti));
        System.out.println(peopleAL.contains(new Person2("Sanjiv")));
        peopleAL.add(4,new Person2("Tom"));     // Tom added twice
        System.out.println(peopleAL);
        peopleAL.remove("Tom");                     // No change
        System.out.println(peopleAL);
        peopleAL.remove(new Person2("Tom"));     // first occurrence removed.
        System.out.println(peopleAL);

        ArrayList<Integer> numberAL = new ArrayList<>();
        numberAL.add(Integer.valueOf(1000));
        numberAL.add(1000);                            // same as above
        System.out.println(numberAL);
        System.out.println(numberAL.contains(1000));
    }
}

class Person2{
    private String name;
    Person2(String name){
        this.name = name;
    }
    public String getName(){return name;}
    @Override
    public String toString(){return name;}
    @Override
    public boolean equals(Object o){
        if(o instanceof Person2){
            if(name.equals(((Person2) o).name)){
                return true;
            }
        }
        return false;
    }
}