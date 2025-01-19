package org.example.designPrinciple.LSP;

public abstract class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }

    // Abstract method for fuel/energy behavior
    public abstract void refuel();
}
