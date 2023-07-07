package org.example;

import org.example.animal.Cat;
import org.example.animal.Dog;
import org.example.animal.Horse;
import org.example.command.Command;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList <Cat> cats = new ArrayList();

        Cat cat1 = new Cat();
        cat1.setName("Barsic");
        cat1.setDateOfBirth(2020, 01, 01);
        cat1.addCommand(Command.JUMP);
        cat1.addCommand(Command.GO);
        //System.out.println(cat1);
        cats.add(cat1);

        Cat cat2 = new Cat();
        cat2.setName("DFghfbhfgbn");
        cat2.setDateOfBirth(2023, 01, 01);
        cat2.addCommand(Command.COME_UP);
        cat2.addCommand(Command.RUN_AWAY);
        //System.out.println(cat2);
        cats.add(cat2);

        for (Cat cat:cats) {
            System.out.println(cat);
        }

        Dog dog1 = new Dog();
        dog1.setName("Ddfkvbsdbnss");
        dog1.setDateOfBirth(2023, 01, 01);
        dog1.addCommand(Command.COME_UP);
        dog1.addCommand(Command.RUN_AWAY);
        System.out.println(dog1);

        Horse horse1 = new Horse();
        horse1.setName("Horse_6345643");
        horse1.setDateOfBirth(2023, 01, 01);
        horse1.addCommand(Command.COME_UP);
        horse1.addCommand(Command.RUN_AWAY);
        System.out.println(horse1);


    }
}