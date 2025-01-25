package org.example.designPatterns.behavior.Mediator;

public class IdeaDepartment implements Department{
    private Mediator mediator;
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message,this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Ideas department find new ideas about coding today:"+message);
    }
}
