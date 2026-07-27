package org.example;

// Abstraction

public abstract class Employee {
   abstract void calculateSalary();
}

class Developer extends Employee {
    void calculateSalary() {
        IO.println("1000");
    }
}

class Manager extends Employee {
    void calculateSalary() {
       IO.println("2000");
    }
}