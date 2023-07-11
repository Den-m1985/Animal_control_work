package org.example.animal;

import org.example.command.CommandAnimal;

import java.time.LocalDate;
import java.util.ArrayList;

public class Horse extends Pack_animal {
    private ArrayList<CommandAnimal> commandAnimals;


    public Horse() {
    }


    @Override
    public void addCommand(CommandAnimal commandAnimal) {
        if (commandAnimals == null)
            commandAnimals = new ArrayList<>();
        this.commandAnimals.add(commandAnimal);
    }


    @Override
    public void addAnimal(String name, LocalDate birthDay) {
        setName(name);
        setDateOfBirth(birthDay);
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
                ", commands= " + commandAnimals +
                "\n";
    }

}
