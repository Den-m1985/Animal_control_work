package org.example.command;


import java.util.ArrayList;

public class PetCommands {
    private static PetCommands petCommands;

    private static ArrayList<CommandAnimal> commandAnimals;


    public static PetCommands petCommands() {
        if (petCommands == null)
            petCommands = new PetCommands();

        commandAnimals = new ArrayList<>();
        for (CommandAnimal command : CommandAnimal.values()) {
            commandAnimals.add(command);
        }
        return petCommands;
    }


    public void printCommand() {
        int i = 1;
        for (CommandAnimal command : CommandAnimal.values()) {
            System.out.println(i + " " + command);
            i++;
        }
        System.out.println();
    }


    public CommandAnimal getCommand(int comandId) {
        int size = commandAnimals.size();
        if (size > comandId - 1) {
            return commandAnimals.get(comandId - 1);
        } else
            System.out.println("Нет такой команды");
        return null;
    }

}
