package com.buch10.enums;

public enum Planets {
    JUPITER(30),
    SATURN(14),
    NEPTUN(10);

    private double value;

    Planets(double value) {
        this.value = value;
    }

    public void print() {
        System.out.println("Planeta " + this.name() + " este "
                + value + "% din Terra.");
    }
}
