package com.buch9.assignment4;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ShoppingCenter center = new ShoppingCenter();

        center.registerPerson(Parser.parsePersonId("John Oliver born 3/24/1984"));


        while (true) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNext()) {
                String line = sc.nextLine();
                if (line.toLowerCase().contains("exit")) {
                    System.out.println("Goin' out...");
                    break;
                } else if (line.toLowerCase().contains("buy")) {
                    // John Oliver buy bike Tohan,Cursiera
                    // John Oliver buy car Dacia,Break
                    Map.Entry<Person, Vehicle> entry = Parser.parseVehicle(line);
                    if (entry.getKey() == null || entry.getValue() == null) {
                        System.out.println("Something went wrong with parsing the person or the vehicle");
                        continue;
                    }
                    center.buyVehicle(entry.getKey(), entry.getValue());
                } else {
                    Person person = Parser.parsePersonId(line);
                    center.registerPerson(person);
                    Bike bike = new Bike(BikeBrand.TOHAN, BikeModel.CURSIERA);
                    center.buyVehicle(person, bike);
                }
            }
        }
    }

}
