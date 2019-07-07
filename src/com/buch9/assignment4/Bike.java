package com.buch9.assignment4;

public class Bike implements Vehicle {

    private BikeBrand bikeBrand;
    private BikeModel bikeModel;

    public Bike(BikeBrand bikeBrand, BikeModel bikeModel) {
        this.bikeBrand = bikeBrand;
        this.bikeModel = bikeModel;
    }

    @Override
    public Enum getModel() {
        return bikeModel;
    }

    @Override
    public Enum getBrand() {
        return bikeBrand;
    }

    @Override
    public String toString() {
        return bikeBrand + " " + bikeModel;
    }
}
