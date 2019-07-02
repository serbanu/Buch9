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
        warehouse.removeChefKnife(chefKnife1);
        warehouse.addChefKnife(new ChefKnife("", 0d));
        warehouse.removeChefKnife(new ChefKnife("", 0d));
        warehouse.addChefKnives(buildChefKnifeList());
        warehouse.listSumOfChefKnives();
        warehouse.removeChefKnife(chefKnife2);
        warehouse.listSumOfChefKnives();

        warehouse.addBurgerPressesInBulk(15);
        System.out.println(chefKnife1);
        System.out.println(chefKnife2);
        System.out.println(chefKnife1.hashCode());
        System.out.println(chefKnife2.hashCode());
        System.out.println(chefKnife1.equals(chefKnife2));
        System.out.println(new ChefKnife("", 0d).equals(new ChefKnife("", 0d)));
        System.out.println(getI());
    }

    private static int getI() {
        int i = 3;
        return ++i + i++ ;
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
