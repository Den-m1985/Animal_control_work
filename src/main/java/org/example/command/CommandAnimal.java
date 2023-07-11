package org.example.command;

public enum CommandAnimal {

    GO("GO"),
    STOP("STOP"),
    RUN_AWAY("RUN_AWAY"),
    COME_UP("COME_UP"),
    LIE("LIE"),
    JUMP("JUMP"),
    TRUP("TRUP"),
    STAND_UP("STAND_UP");

    private final String string;

    CommandAnimal(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
