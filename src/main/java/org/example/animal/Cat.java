package org.example.animal;

import org.example.command.CommandAnimal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cat extends Pet {
    private List<CommandAnimal> commandAnimals;


    public Cat() {
    }


    @Override
    public String getType() {
        return "Cat";
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
    public String toString() {
        return getType() + " - " +
                "id= " + getId() +
                ", name= " + getName() +
                ", dateOfBirth= " + getDateOfBirth() +
                ", commands= " + commandAnimals +
                "\n";
    }

}
