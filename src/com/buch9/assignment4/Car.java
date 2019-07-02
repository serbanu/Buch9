package com.buch9.assignment4;

public class Car implements Vehicle {

    private CarModel carModel;
    private CarBrand carBrand;

    public Car(CarModel carModel, CarBrand carBrand) {
        this.carModel = carModel;
        this.carBrand = carBrand;
    }

    @Override
    public Enum getModel() {
        return carModel;
    }

    @Override
    public Enum getBrand() {
        return carBrand;
    }
}
