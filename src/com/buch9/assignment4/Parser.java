package com.buch9.assignment4;

import java.time.LocalDate;
import java.util.AbstractMap;
import java.util.Map;

public final class Parser {

    private static final String PERSON_PATTERN = "[a-zA-Z ]+ ([0-9]+\\/?)+";
    private static final String VEHICLE_PATTERN = "([a-zA-Z ]+(,)?)+";

    public static Map.Entry<Person, Vehicle> parseVehicle(String input) {
        Vehicle vehicle = null;
        Person person = null;

        if (input.matches(VEHICLE_PATTERN)) {
            // John Oliver buy bike TOHAN,CURSIERA(litere mari)
            // John Oliver buy car Dacia,Break
            String[] tokens = input.split("buy");
            String[] buyer = tokens[0].split(" ");//John Oliver
            String[] product = tokens[1].split(" ");// bike TOHAN,CURSIERA
            String[] vehicleType = product[2].split(",");

            for (BikeBrand brand : BikeBrand.values()) {
                if (brand.toString().contains(vehicleType[0])) {
                    for (BikeModel model : BikeModel.values()) {
                        if (model.toString().contains(vehicleType[1])) {
                            vehicle = new Bike(brand, model);
                            person = new Person(buyer[1], buyer[0]);
                            break;
                        }
                    }

                }
            }

            for (CarBrand brand : CarBrand.values()) {
                if (brand.toString().contains(vehicleType[0])) {
                    for (CarModel model : CarModel.values()) {
                        if (model.toString().contains(vehicleType[1])) {
                            vehicle = new Car(model, brand);
                            person = new Person(buyer[1], buyer[0]);
                            break;
                        }
                    }

                }
            }
        } else {
            System.out.println("Input not ok");
        }

        return new AbstractMap.SimpleImmutableEntry<Person, Vehicle>(person, vehicle);
    }

    public static Person parsePersonId(String input) {
        Person person = null;

        if (input.matches(PERSON_PATTERN)) {
            System.out.println("Input string " + input + " does match the pattern");
            String[] tokens = input.split(" ");
            String[] dateInfo = tokens[tokens.length - 1].split("/");
            person = new Person(tokens[1], tokens[0],
                    LocalDate.of(Integer.parseInt(dateInfo[2]),
                            Integer.parseInt(dateInfo[0]),
                            Integer.parseInt(dateInfo[1])));
        } else {
            System.out.println("Input string " + input + " does not match the pattern");
        }

        return person;
    }

}
