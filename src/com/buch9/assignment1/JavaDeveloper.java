package com.buch9.assignment1;

public class JavaDeveloper extends Developer {

    public JavaDeveloper() {
        System.out.println("I'm yet a new Java Developer!");
    }

    protected void code(String codingLanguage) {
        System.out.println("I'm happy coding in " + codingLanguage + "!");
    }
}
