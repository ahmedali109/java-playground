package org.example;

// Polymorphism with Overriding

public class Shape {
    void draw(){
        IO.println("Drawing Shape...");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        super.draw();
        IO.println("Drawing Rectangle...");
    }
}

class Trinagle extends Shape {
    @Override
    void draw() {
        super.draw();
        IO.println("Drawing Trinagle...");
    }
}


// Polymorphism with Overloading

class Calculator{
    int add(int n1 , int n2){
        return n1 + n2;
    }
    int add(int n1 , int n2 , int n3){
        return n1 + n2 + n3;
    }
}
