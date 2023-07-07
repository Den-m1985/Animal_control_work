package org.example.animal;

import org.example.command.Command;

import java.util.ArrayList;

public class Horse extends Pack_animal {
    private ArrayList<Command> commands;



    @Override
    public void addCommand(Command command) {
        if (commands == null)
            commands = new ArrayList();
        this.commands.add(command);
    }

    @Override
    public String getType() {
        return "Horse";
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
