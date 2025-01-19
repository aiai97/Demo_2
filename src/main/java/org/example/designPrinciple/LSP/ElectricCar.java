package org.example.designPrinciple.LSP;

public class ElectricCar extends Vehicle{
    @Override
    public void refuel() {
        recharge();
    }

    private void recharge() {
        System.out.println("require battery");
    }
}
