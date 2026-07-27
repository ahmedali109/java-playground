package org.example;

// Define a class

public class Car {
    private int year;
    private int speed;
    private String model;

    Car(){
        this.year = 2026;
        this.speed = 220;
        this.model = "BMW";
    }

    Car(int y , int s , String m){
        this.year = y;
        this.speed = s;
        this.model = m;
    }

    void start(){
        IO.println("Car Started Successfully....");
    }

    void stop(){
        IO.println("Car Stopped... see you soon!");
    }
}
