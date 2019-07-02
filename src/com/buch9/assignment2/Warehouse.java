package com.buch9.assignment2;

import java.util.LinkedList;
import java.util.List;

//Depozit de ustensile de bucatarie
public class Warehouse {

    private static Warehouse self = null;
    
    private List<ChefKnife> chefKnives;
    private List<FishTongs> fishTongs;
    private List<Mortar> mortars;
    private List<BurgerPress> burgerPresses;

    private Warehouse() {
        chefKnives = new LinkedList<>();
        fishTongs = new LinkedList<>();
        mortars = new LinkedList<>();
        burgerPresses = new LinkedList<>();
    }
    
    public static Warehouse buildWarehouse() {
        if (self == null) {
            self = new Warehouse();
        }

        return self;
    }

    public void addChefKnives(List<ChefKnife> chefKnives) {
        this.chefKnives.addAll(chefKnives);
        chefKnives.forEach(chefKnife -> {
            this.chefKnives.add(chefKnife);
            printItem(chefKnife);
        });
    }

    public void addChefKnife(ChefKnife chefKnife) {
        chefKnives.add(chefKnife);
        printItem(chefKnife);
    }

    public void listSumOfChefKnives() {
        double sum = chefKnives.stream()
                .map(ChefKnife::getPrice)
                .reduce(0d, Double::sum);
        double sum2 = 0d;
        for (int i = 0; i <  chefKnives.size(); i++) {
            sum2 = sum2 + chefKnives.get(i).getPrice();
        }
        System.out.println(String.format("The sum of the chef knives in the warehouse is: %s", sum));
    }

    public void removeChefKnife(ChefKnife chefKnife) {
        chefKnives.remove(chefKnife);
    }

    public void addFishTongs(FishTongs fishTongss) {
        fishTongs.add(fishTongss);
        printItem(fishTongss);
    }

    public void addMortars(Mortar mortar) {
        mortars.add(mortar);
        printItem(mortar);
    }

    public void addBurgerPress(BurgerPress burgerPress) {
        burgerPresses.add(burgerPress);
        printItem(burgerPress);
    }

    public void addBurgerPressesInBulk(int noOfBurgerPresses) {
        BurgerPress burgerPress;
        for (int i = 0; i < noOfBurgerPresses; ++i) {
            burgerPress = new BurgerPress("DefaultBurgerPress" + i);
            addBurgerPress(burgerPress);
        }
    }

    private <T extends Utensil> void printItem(T item) {
        System.out.println(String.format("Added %s 's %s to warehouse at the price of: %s",
                item.getName(), item.getClass().getSimpleName(), item.getPrice()));
    }

}
