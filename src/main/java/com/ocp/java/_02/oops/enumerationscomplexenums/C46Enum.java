package com.ocp.java._02.oops.enumerationscomplexenums;

public class C46Enum {
    public static void main(String[] args) {
        // Direction d = new Direction();             // enum type can not be instanciated
        // Direction d = Direction.EAST_WEST;         // type shafty

        Direction d = Direction.EAST;
        System.out.println(d);
        System.out.println(d==Direction.EAST);        // true as they are immutable
        System.out.println(d.equals(Direction.EAST)); // true
        Direction d2 = Direction.EAST;
        System.out.println(d2==d);                    // true

        /*switch(d){
            case EAST -> System.out.println("EAST");
            case WEST-> System.out.println();
            // case 0 -> System.out.println();        // required type Direction provided int
            // case Direction.NORTH -> System.out.println();  // must be an unqualified name of enum constant
        }*/
        // if(Direction.WEST == 3)                    // Direction vs int
        Direction d1 = Direction.valueOf("EAST");
        System.out.println(d1);                       // EAST
        //System.out.println(Direction.valueOf("SANJIV"));                       // Illegal Argument exception

        for(Direction direction:Direction.values()){
            System.out.println(direction.ordinal()+", "+direction.name());
        }
    }
}

// enum Direction extends Object{  // compilation error as it implicitly extends Enum
enum Direction {
    NORTH, SOUTH, EAST, WEST
}