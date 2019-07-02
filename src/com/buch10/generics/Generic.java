package com.buch10.generics;

public class Generic<T> {
    private Object[] array;
    private int counter = 0;
    private int capacity = 0;

    public Generic(int n) {
        this.array = new Object[n];
        this.capacity = n;

    }

    public void add(T obj) {
        if (counter < capacity) {
            this.array[counter++] = obj;
        }
    }

    public void print() {
        for (Object obj : array) {
            System.out.println(obj);
        }
    }
}
