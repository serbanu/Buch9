package com.buch9.assignment3;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int phoneNo;

    public Person(String name, String surname, int age, int phoneNo) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

}
