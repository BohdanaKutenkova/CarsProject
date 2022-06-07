package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    private static final String CAR_CLASS = "sport car";
    public int maximumSpeed;

    public SportCar(String carBrand, int weight, int maximumSpeed, Engine engine, Driver driver) {
        super(carBrand, CAR_CLASS, weight, engine, driver);
        this.maximumSpeed = maximumSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nAdditional car information: maximum speed: " + maximumSpeed);
    }
}
