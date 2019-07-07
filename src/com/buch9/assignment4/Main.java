package com.buch9.assignment4;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ShoppingCenter center = new ShoppingCenter();

        center.registerPerson(Parser.parsePersonId("John Oliver born 3/24/1984"));
        Map.Entry<Person, Vehicle> e = Parser.parseVehicle("John Oliver buy bike TOHAN,CURSIERA");
        center.buyVehicle(e.getKey(), e.getValue());

        while (true) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNext()) {
                String line = sc.nextLine();
                if (line.toLowerCase().contains("exit")) {
                    System.out.println("Goin' out...");
                    break;
                } else if (line.toLowerCase().contains("buy")) {
                    // John Oliver buy bike TOHAN,CURSIERA
                    // John Oliver buy car DACIA,BREAK
                    Map.Entry<Person, Vehicle> entry = Parser.parseVehicle(line);
                    if (entry.getKey() == null || entry.getValue() == null) {
                        System.out.println("Something went wrong with parsing the person or the vehicle");
                        continue;
                    }
                    center.buyVehicle(entry.getKey(), entry.getValue());
                } else if (line.toLowerCase().contains("print")) {
                    // Printam cate vehicule are fiecare persoana inregistrata in Shopping Center
                    center.printMapInfo();
                } else {
                    // Default, inregistram persoana de forma <Prenume Nume born data_nasterii>
                    Person person = Parser.parsePersonId(line);
                    center.registerPerson(person);
                }
            }
        }
    }

}
