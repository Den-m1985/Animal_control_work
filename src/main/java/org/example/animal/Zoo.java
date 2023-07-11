package org.example.animal;

import org.example.command.CommandAnimal;
import org.example.command.PetCommands;

import java.time.LocalDate;
import java.util.ArrayList;

public class Zoo extends PetCommands {
    private static Zoo zoo;
    private ArrayList<Cat> arrayCats;
    private ArrayList<Horse> arrayHorse;


    private Zoo() {
        if (arrayCats == null)
            arrayCats = new ArrayList<>();

        if (arrayHorse == null)
            arrayHorse = new ArrayList<>();
    }

    public static Zoo zoo() {
        if (zoo == null)
            zoo = new Zoo();
        return zoo;
    }


    public void AddCatInZoo(String name, LocalDate birthDay) {
        Cat cat = new Cat();
        cat.setName(name);
        cat.setDateOfBirth(birthDay);
        arrayCats.add(cat);
    }


    public void AddHorseInZoo(String name, LocalDate birthDay) {
        Horse horse = new Horse();
        horse.setName(name);
        horse.setDateOfBirth(birthDay);
        arrayHorse.add(horse);
    }


    public void setCatCommand(int id, CommandAnimal command) {
        for (int i = 0; i < arrayCats.size(); i++) {
            int idCat = arrayCats.get(i).getId();
            if (idCat == id) {
                arrayCats.get(i).addCommand(command);
                break;
            }
        }
    }


    public void setHorseCommand(int id, CommandAnimal command) {
        for (int i = 0; i < arrayHorse.size(); i++) {
            int idHorse = arrayHorse.get(i).getId();
            if (idHorse == id) {
                arrayHorse.get(i).addCommand(command);
                break;
            }
        }
    }


    public void takeOfCat(int id) {
        for (int i = 0; i < arrayCats.size(); i++) {
            int idHorse = arrayCats.get(i).getId();
            if (idHorse == id) {
                arrayCats.remove(i);
                break;
            }
        }
    }


    public void takeOfHorse(int id) {
        for (int i = 0; i < arrayHorse.size(); i++) {
            int idHorse = arrayHorse.get(i).getId();
            if (idHorse == id) {
                arrayHorse.remove(i);
                break;
            }
        }
    }


    public void printCats() {
        for (Cat cat : arrayCats) {
            System.out.println(cat.toString());
        }
    }


    public void printHorses() {
        for (Horse horse : arrayHorse) {
            System.out.println(horse.toString());
        }
    }

//
//    public ArrayList<Cat> getArrayCats() {
//        return arrayCats;
//    }
//
//
//    public ArrayList<Horse> getArrayHorse() {
//        return arrayHorse;
//    }

}
