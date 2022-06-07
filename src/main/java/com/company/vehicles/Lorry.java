package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    public int loadBearingCapacity;

    public Lorry(String carBrand, String carClass, int weight, int loadBearingCapacity, Engine engine,  Driver driver) {
        super(carBrand, carClass, weight, engine, driver);
        this.loadBearingCapacity = loadBearingCapacity;
    }
}
