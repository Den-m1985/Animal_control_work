package org.example;

import org.example.animal.RandomAnimal;
import org.example.menu.TerminalReader;

public class Main {
    public static void main(String[] args) {

        RandomAnimal randomAnimal = new RandomAnimal();
        randomAnimal.randomAnimal();

        TerminalReader terminalReader = TerminalReader.terminalReader();
        terminalReader.endLess();

    }

}
