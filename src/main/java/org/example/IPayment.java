package org.example;

// Interface

public interface IPayment {
    void pay();
}

class Visa implements IPayment{
    @Override
    public void pay() {
        IO.println("Thanks for using Visa...");
    }
}

class VodafoneCash implements IPayment{
    @Override
    public void pay() {
        IO.println("Thanks for using vodafoneCash...");
    }
}