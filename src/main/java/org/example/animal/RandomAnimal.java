package org.example.animal;

import java.time.LocalDate;
import java.util.Random;

public class RandomAnimal {
    private static Random random = new Random();


    public void randomAnimal() {
        Zoo zoo = Zoo.zoo();
        for (int i = 0; i < 5; i++) {
            String name = "Cat" + i;
            LocalDate birthDayCat = Date();
            zoo.AddCatInZoo(name, birthDayCat);
        }
        for (int i = 0; i < 5; i++) {
            String name = "Horses" + i;
            LocalDate birthDayYorse = Date();
            zoo.AddHorseInZoo(name, birthDayYorse);
        }
    }


    static LocalDate Date() {
        int year = random.nextInt(2000, 2023);  // год
        int month = random.nextInt(1, 12);   // месяц
        int day = random.nextInt(1, 28);  // день

        return LocalDate.of(year, month, day);
    }

}
