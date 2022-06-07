package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    private static final String CAR_CLASS = "lorry";
    public int loadBearingCapacity;

    public Lorry(String carBrand, int weight, int loadBearingCapacity, Engine engine, Driver driver) {
        super(carBrand, CAR_CLASS, weight, engine, driver);
        this.loadBearingCapacity = loadBearingCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nAdditional car information: load bearing capacity: " + loadBearingCapacity + " tons.");
    }
}