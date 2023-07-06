package org.example.animal;


import java.time.LocalDate;

public abstract class Animal {
    //private static int idCounter = 0;
    //protected int id;
    //protected int number;
    //protected LocalDate dateOfBirth;
    //protected String name;
    // commands: PetCommands


    public Animal() {
        //this.id = idCounter++;
    }


    //    public LocalDate getDateOfBirth(){
//        return dateOfBirth;
//    }
    public abstract LocalDate getDateOfBirth();


    //    public void setDateOfBirth(int year, int month, int day) {
//        this.dateOfBirth = LocalDate.of(year, month, day);
//    }
    public abstract void setDateOfBirth(int year, int month, int day);


    //    public String getName() {
//        return name;
//    }
    public abstract String getName();

    //    public void setName(String name) {
//        this.name = name;
//    }
    public abstract void setName(String name);


/*
+ animal(int, datetime)
+ addCommand(enum): void
 */

    //    public int getId() {
//        return id;
//    }
    public abstract int getId();


    public abstract String getType();
}




