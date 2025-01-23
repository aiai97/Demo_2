package org.example.designPatterns.behavior.CP;

// Invoker - RemoteControl
class RemoteControl {
    private Command command;

    void setCommand(Command command) {
        this.command = command;
    }

    void pressButton() {
        command.execute();
    }
}