package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    public final String CAR_CLASS = "sport car";
    public int maximumSpeed;


    public SportCar(String carBrand, int weight, Engine engine, int maximumSpeed, Driver driver) {
        this.carBrand = carBrand;
        this.weight = weight;
        this.engine = engine;
        this.driver = driver;
        this.maximumSpeed = maximumSpeed;
    }
}
