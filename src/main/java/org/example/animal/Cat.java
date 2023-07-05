package org.example.animal;

public class Cat extends Animal {


    protected int bodyLength;
    protected static final int MAX_WEIGHT = 200;
    protected static final String TYPE = "Snake";

    public Cat(int year, int weight, int countLimbs, int bodyLength) {
        super(year, weight, countLimbs);
        this.bodyLength = bodyLength;
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }


    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String toString() {
        return "Cat - " +
                "bodyLength=" + bodyLength +
                ", year=" + id +
                ", weight=" + weight +
                "\n";
    }
}

