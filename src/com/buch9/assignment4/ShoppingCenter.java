package com.buch9.assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCenter {

    private Map<Person, List<Vehicle>> map;

    public ShoppingCenter() {
        map = new HashMap<>();
    }

    public void registerPerson(Person person) {
        if (person == null) {
            System.out.println("Invalid person credentials.");
        } else {
            map.put(person, new ArrayList<>());
            System.out.println(person.getSurname() + " "
                    + person.getName() + " has been registered.");
        }
    }

    public void buyVehicle(Person person, Vehicle vehicle) {
        //Iteram prin `map` pentru a gasi persoana
        for (Map.Entry<Person, List<Vehicle>> entry : map.entrySet()) {
            //Daca am gasit-o...
            if (person.equals(entry.getKey())) {
                //Extragem lista...
                List<Vehicle> list = entry.getValue();
                //Updatam lista...
                list.add(vehicle);
                //Updatam `map`
                entry.setValue(list);
                System.out.println(person.getSurname() + " " + person.getName()
                        + " a cumparat " + vehicle.getBrand()
                        + " " + vehicle.getModel());
            }
        }
    }

    //Print map info
    public void printMapInfo() {
        //Iteram prin Map
        for (Map.Entry<Person, List<Vehicle>> entry : map.entrySet()) {
            //Pentru fiecare persoana printam numele...
            Person person = entry.getKey();
            List<Vehicle> vehicles = entry.getValue();
            //Printam cate vehicule are...
            System.out.println(person.getName() + person.getSurname()+ " are " + vehicles.size() + " vehicule:");
            for (Vehicle v : vehicles) {
                //Printam fiecare vehicul
                System.out.println(v);
            }
        }
    }
}
