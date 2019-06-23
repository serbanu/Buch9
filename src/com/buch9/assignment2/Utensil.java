package com.buch9.assignment2;

public class Utensil {
    protected String name;
    protected double price;

    public Utensil(String name) {
        this.name = name;
        this.price = 100d;
    }

    public Utensil(String name, double price) {
        this.name = name;
        this.price = price;
    }

    protected String getName() {
        return name;
    }

    protected double getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.getName().equals(((ChefKnife) obj).getName()) && this.getPrice() == ((ChefKnife) obj).getPrice();
    }
}
