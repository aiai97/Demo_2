package org.example.designPrinciple.LSP;

public class FuelCar extends Vehicle{
    @Override
    public void refuel() {
        System.out.println("require gasoline");
    }
}
