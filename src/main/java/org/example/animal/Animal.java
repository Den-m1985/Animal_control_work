package org.example.animal;


import org.example.command.Command;

import java.time.LocalDate;

public abstract class Animal {
    protected int idCounter = 1;
    protected int id;
    protected LocalDate dateOfBirth;
    protected String name;


    public Animal() {
        this.id = idCounter++;
    }


    public int getId() {
        return id;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    public void setDateOfBirth(int year, int month, int day) {
        this.dateOfBirth = LocalDate.of(year, month, day);
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public abstract void addCommand(Command command);


    public abstract String getType();

}




