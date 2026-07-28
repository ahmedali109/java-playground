package SOLID;

// Jst For Demo
public class InterfaceSegregationPrinciple {
    Human human;
    Robot robot;
    public InterfaceSegregationPrinciple(){
        human = new Human();
        robot = new Robot();
        IO.println("HUMAN!!!");
        IO.println("------------------------");
        human.work();
        human.eat();
        human.sleep();
        IO.println("------------------------");
        IO.println("ROBOT!!!");
        IO.println("------------------------");
        robot.work();
    }
}

// ISP
interface Workable{
    void work();
}
interface Eatable{
    void eat();
}
interface Sleepable{
    void sleep();
}

class Human implements Workable,Eatable,Sleepable{

    @Override
    public void eat() {
        IO.println("i can eat");
    }

    @Override
    public void sleep() {
        IO.println("i can sleep");
    }

    @Override
    public void work() {
        IO.println("i can work");
    }
}

class Robot implements Workable {

    @Override
    public void work() {
        IO.println("i can work");
    }
}