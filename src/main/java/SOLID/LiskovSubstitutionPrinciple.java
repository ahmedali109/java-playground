package SOLID;

// Jst For Demo
public class LiskovSubstitutionPrinciple {
    Penguin penguin;
    Sparrow sparrow;

    public LiskovSubstitutionPrinciple(){
        penguin = new Penguin();
        sparrow = new Sparrow();

        sparrow.fly();
    }
}

// LSP

class Bird{ }

interface Flyable{
    void fly();
}

class Sparrow extends Bird implements Flyable{
    public void fly(){
        IO.println("Hey i am Sparrow. and i can fly");
    }
}

class Penguin extends Bird{ }