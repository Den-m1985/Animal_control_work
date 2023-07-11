package org.example.menu;

import org.example.animal.Zoo;
import org.example.command.PetCommands;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Execute {
    private static Scanner scanner = new Scanner(System.in);


    public void execute(Integer command) {

        Zoo zoo = Zoo.zoo();
        PetCommands petCommands = PetCommands.petCommands();

        switch (command) {
            case 1:
                System.out.println(PrintMenu.NAME);
                String nameCat = scanner.nextLine();
                LocalDate birthDayCat = Date();
                zoo.AddCatInZoo(nameCat, birthDayCat);
                break;
            case 2:
                zoo.printCats();
                System.out.println(PrintMenu.DELEETEANIMAL);
                int idDeleteCat = Digit();
                zoo.takeOfCat(idDeleteCat);
                break;
            case 3:
                System.out.println(PrintMenu.NAME);
                String nameHorse = scanner.nextLine();
                LocalDate birthDayYorse = Date();
                zoo.AddHorseInZoo(nameHorse, birthDayYorse);
                break;
            case 4:
                zoo.printHorses();
                System.out.println(PrintMenu.DELEETEANIMAL);
                int idDeleteHorses = Digit();
                zoo.takeOfHorse(idDeleteHorses);
                break;
            case 5:
                zoo.printCats();
                break;
            case 6:
                zoo.printHorses();
                break;
            case 7:
                petCommands.printCommand();
                break;
            case 8:
                zoo.printCats();
                System.out.println(PrintMenu.IDANIMAL);
                int idCat = Digit();
                petCommands.printCommand();
                System.out.println(PrintMenu.COMMAND);
                int idCommandCat = Digit();
                zoo.setCatCommand(idCat, petCommands.getCommand(idCommandCat));
                break;
            case 9:
                zoo.printHorses();
                System.out.println(PrintMenu.IDANIMAL);
                int idHorse = Digit();
                petCommands.printCommand();
                System.out.println(PrintMenu.COMMAND);
                int idCommandHorse = Digit();
                zoo.setHorseCommand(idHorse, petCommands.getCommand(idCommandHorse));
                break;
            default:
                System.out.println("Некорректный выбор");
        }

    }


    static int Digit() {
        int digit;
        try {
            digit = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введено некорректное значение. Пожалуйста, введите целое число.");
            scanner.next(); // Очистка ввода
            digit = Digit(); // Рекурсивный вызов для повторного ввода
        }
        return digit;
    }


    static LocalDate Date() {
        System.out.println(PrintMenu.YEAR);
        int year = Digit();
        System.out.println(PrintMenu.MONTH);
        int month = Digit();
        System.out.println(PrintMenu.DAY);
        int day = Digit();
        try {
            LocalDate.of(year, month, day);
            return LocalDate.of(year, month, day);
        } catch (Exception e) {
            System.out.println("Введено некорректное значение. Пожалуйста, введите заново.");
            Date(); // Рекурсивный вызов для повторного ввода
        }
        return null;
    }

}
