package com.buch9.assignment1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Buch9!");
        JavaDeveloper jd = new JavaDeveloper();
        jd.code();
        jd.code("Java");

        Developer developer = new Developer(Developer.CodingLanguage.Python);
        System.out.println(developer.knowsC());

    }
}
