package org.example.animal;

import org.example.command.Command;

import java.util.ArrayList;

public class Dog extends Pet {
    private ArrayList<Command> commands;


    @Override
    public String getType() {
        return "Dog";
    }


    @Override
    public void addCommand(Command command) {
        if (commands == null)
            commands = new ArrayList();
        this.commands.add(command);
    }


    @Override
    public String toString() {
        return getType() + " - " +
                "id= " + getId() +
                ", name= " + getName() +
                ", dateOfBirth= " + getDateOfBirth() +
                ", commands= " + commands +
                "\n";
    }

}
