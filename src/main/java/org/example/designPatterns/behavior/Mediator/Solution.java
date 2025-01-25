package org.example.designPatterns.behavior.Mediator;

public class Solution {
    public static void main(String[] args) {
        BrainNegotiator brain = new BrainNegotiator();
        IdeaDepartment idea = new IdeaDepartment();
        PatienceDepartment patience = new PatienceDepartment();
        brain.setIdea(idea);
        brain.setPatience(patience);

        idea.setMediator(brain);
        patience.setMediator(brain);
        idea.sendMessage("I came up with a new solution to invoke my interests in cs");
    }
}
