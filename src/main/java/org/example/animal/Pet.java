package org.example.animal;

public class Pet extends Animal{

    public Pet(int year, int weight, int countLimbs) {
        super(year, weight, countLimbs);
    }

    @Override
    public int getMaxWeight() {
        return 0;
    }

    @Override
    public String getType() {
        return null;
    }
}
