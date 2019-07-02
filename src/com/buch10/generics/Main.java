package com.buch10.generics;

public class Main {
    public static void main(String[] args) {
        Generic<String> strings = new Generic<>(2);
        Generic<Integer> ints = new Generic<>(3);
        Generic<Double> doubles = new Generic<>(2);
        Generic<Person> persons = new Generic<>(2);

        persons.add(new Person(100));
        persons.add(new Person(200));
        persons.print();


        String s1 = "abc";
        String s2 = "def";
        strings.add(s1);
        strings.add(s2);
        strings.print();
    }
}
