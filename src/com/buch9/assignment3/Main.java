package com.buch9.assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        List<Person> people = new LinkedList<>();
        Scanner scanner = new Scanner(new File("D:\\Projects\\Buch9\\src\\com\\buch9\\assignment3\\people.txt"));
        if (scanner.hasNext()) {
            scanner.nextLine();
        }

        while(scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] tokens = line.split(" ");
            if (tokens.length != 4) {
                System.err.println("Bad input format. Aborting...");
                return;
            }
            Person person = new Person(tokens[0], tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]));
            people.add(person);
        }

        presentPeople(people);
    }

    private static void presentPeople(List<Person> people) {
        people.forEach(person -> {
            System.out.println(String.format("It is my pleasure to present you our special guest: %s %s, aged %d. Can be contacted at: %d",
                    person.getName(), person.getSurname(), person.getAge(), person.getPhoneNo()));
        });
    }
}
