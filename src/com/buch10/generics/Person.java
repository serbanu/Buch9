package com.buch10.generics;

public class Person {

    private double height;

    public Person(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Aceasta persoana are o inaltime de: " + height;
    }

    protected int compareTo(Person o) {
        System.out.println("Comparing persons...");
        int equality = 0;
        if (this.getHeight() > o.getHeight()) {
            equality = 1;
        } else if (this.getHeight() < o.getHeight()) {
            equality = -1;
        }

        return equality;
    }
}
