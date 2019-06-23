package com.buch9.assignment2;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ChefKnife chefKnife1 = new ChefKnife("Adi Hadean", 225d);
        ChefKnife chefKnife2 = new ChefKnife("Florin Dumitrescu", 175d);

        Warehouse warehouse = Warehouse.buildWarehouse();
        warehouse.addChefKnife(chefKnife1);
        warehouse.addChefKnife(chefKnife2);
        warehouse.addChefKnives(buildChefKnifeList());
        warehouse.listSumOfChefKnives();
        warehouse.removeChefKnife(chefKnife2);
        warehouse.listSumOfChefKnives();

        warehouse.addBurgerPressesInBulk(15);
    }

    private static List<ChefKnife> buildChefKnifeList() {
        ChefKnife chefKnife3 = new ChefKnife("Catalin Scarlatescu", 150d);
        ChefKnife chefKnife4 = new ChefKnife("Sorin Bontea", 250d);
        ChefKnife chefKnife5 = new ChefKnife("Irina Hristu", 200d);

        List<ChefKnife> chefKnives = new LinkedList<>();
        chefKnives.add(chefKnife3);
        chefKnives.add(chefKnife4);
        chefKnives.add(chefKnife5);

        return chefKnives;
    }

}
