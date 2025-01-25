package org.example.designPatterns.behavior.Mediator;


import lombok.Data;

@Data
public class BrainNegotiator implements Mediator {
    private IdeaDepartment idea;
    private PatienceDepartment patience;


    @Override
    public void sendMessage(String message, Department department) {
        if(department instanceof IdeaDepartment && patience != null){
            patience.receiveMessage(message);
            System.out.println("you are being smarter");
        }else if(department instanceof PatienceDepartment && idea != null){
            idea.receiveMessage(message);
            System.out.println("you are being a better person");
        }
    }
}
