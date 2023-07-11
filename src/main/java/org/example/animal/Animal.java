package org.example.animal;


import org.example.command.CommandAnimal;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Animal {
    protected static int idCounter = 1;
    protected int id;
    protected LocalDate dateOfBirth;
    protected String name;
    public static ArrayList<String> arrayType;


    public Animal() {
        this.id = idCounter++;
        if (arrayType == null) {
            arrayType = new ArrayList<>();
        }
        if (!arrayType.contains(getType()))
            arrayType.add(getType());
    }


    public int getId() {
        return id;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    public void setDateOfBirth(LocalDate birthDay) {
        this.dateOfBirth = birthDay;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public abstract void addCommand(CommandAnimal commandAnimal);


    public abstract void addAnimal(String name, LocalDate birthDay);


    public abstract String getType();

}
