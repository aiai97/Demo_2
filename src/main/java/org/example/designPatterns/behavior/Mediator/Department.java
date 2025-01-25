package org.example.designPatterns.behavior.Mediator;

public interface Department {
    void setMediator(Mediator mediator);
    void sendMessage(String message);
    void receiveMessage(String message);
}
