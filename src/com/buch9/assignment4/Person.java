package com.buch9.assignment4;

import java.time.LocalDate;

public class Person {

    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, LocalDate dateOfBirth) {
        this(name, surname);
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            return this.getName().equals(person.getName())
                    && this.getSurname().equals(person.getSurname());
        }

        return false;
    }
}
