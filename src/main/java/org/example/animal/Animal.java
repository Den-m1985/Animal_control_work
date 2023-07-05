package org.example.animal;


public abstract class Animal {
    protected int id;
    protected int number;
    //protected dateOfBirth datetime;
    protected String name;
    // commands: PetCommands
    protected int weight;
    protected int countLimbs;


    public Animal(int id, int weight, int countLimbs) {
        this.id = id;
        this.weight = weight;
        this.countLimbs = countLimbs;
    }


    public abstract int getMaxWeight();


    public void feed(int foodWeight) {
        if ((this.weight + foodWeight) <= getMaxWeight()) {
            this.weight = +foodWeight;
        } else System.out.println("Max weight is exceeded");
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCountLimbs() {
        return countLimbs;
    }

    public void setCountLimbs(int countLimbs) {
        this.countLimbs = countLimbs;
    }

    public abstract String getType();

}




