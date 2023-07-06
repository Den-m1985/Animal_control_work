package org.example.animal;

public class Cat extends Pet {


    protected int bodyLength;
    protected static final String TYPE = "Cat";

    public Cat(int bodyLength) {
        super();
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
    public String toString() {
        return "Cat - " +
                "bodyLength=" + bodyLength +
                ", year=" + id +
                "\n";
    }
}

