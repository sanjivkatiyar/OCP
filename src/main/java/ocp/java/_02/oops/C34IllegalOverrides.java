package ocp.java._02.oops;

public class C34IllegalOverrides {
}

class Animal1{
    public void eat (){}
    public Animal1 drink (){ return new Animal1();}
}

class Cow extends Animal1{
    // private void eat(){} // access modifier can not be more restricted (Weaker)
    // public void eat() throws IOException{} // can not throw new or broader exception
    public void eat(String s){}  // an overload, not override
    // public String eat(){} return type should be void
    public void eat(){} // override
    // public Animal1 drink(){return new Animal1();} // override
    public Cow drink(){return new Cow();} // ok
}
