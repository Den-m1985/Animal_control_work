package org.example.animal;

import java.time.LocalDate;

public class Pet extends Animal{
    private static int idCounter = 0;
    protected int id;
    protected int number;
    protected LocalDate dateOfBirth;
    protected String name;
    // commands: PetCommands


    public Pet() {
        this.id = idCounter++;
    }

    @Override
    public LocalDate getDateOfBirth() {
        return null;
    }

    @Override
    public void setDateOfBirth(int year, int month, int day) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public int getId() {
        return id;
    }


    @Override
    public String getType() {
        return null;
    }
}
