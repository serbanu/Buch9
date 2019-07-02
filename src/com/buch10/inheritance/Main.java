package com.buch10.inheritance;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        Animal cat1 = new Cat();
        Animal cat2 = new Cat();
        Animal dog1 = new Dog();
        Animal dog2 = new Dog();
        Animal dog3 = new Dog();

        animals[0] = cat1;
        animals[1] = cat2;

        animals[2] = dog1;
        animals[3] = dog2;
        animals[4] = dog3;

        for(Animal animal : animals) {
            System.out.println("This animal likes to " + animal.yieldVoice());
        }
    }

}
