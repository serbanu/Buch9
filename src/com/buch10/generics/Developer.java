package com.buch10.generics;

public class Developer extends Person implements Comparable<Developer> {
    private int salary;

    public Developer(double height, int salary) {
        super(height);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Developer o) {
        System.out.println("Comparing developers...");
        int equality = 0;
        if (this.salary > o.getSalary()) {
            equality = 1;
        } else if (this.salary < o.getSalary()) {
            equality = -1;
        } else {
            equality = super.compareTo(o);
        }

        return equality;
    }
}
