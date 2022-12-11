package ocp.java._02.oops.objectlifcycle;
//You cannot apply any modifier except final to a local variable.
// i.e. you cannot make them transient, volatile, static, public,
// and private. But you can apply access modifiers (public private and protected)
// and final, transient, volatile, static to instance variables.
// You cannot apply native and synchronized to any kind of variable.
public class C48ObjectLifeCycle {
    public static void main(String[] args) {
        Goat goat1 = new Goat();
        Goat goat2 = new Goat();
        goat2.tagAnimal(goat1);
    }
}

class Tag{}
class Goat{
    Tag tag;
    String country;
    void tagAnimal(Goat goat){
        tag = new Tag();
        goat.setCountry("France");
    }
    void setCountry(String country){
        this.country=country;
    }
}
