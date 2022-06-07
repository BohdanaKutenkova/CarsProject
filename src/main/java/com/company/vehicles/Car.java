package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    public String carBrand;
    public String carClass;
    public int weight;
    public Driver driver;
    public Engine engine;

    public Car(String carBrand, String carClass, int weight, Engine engine, Driver driver) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
        this.driver = driver;
    }

    public void start() {
        System.out.println("Let's go!");
    }


    public void stop() {
        System.out.println("Stop!");
    }


    public void turnRight() {
        System.out.println("Turn right!");
    }


    public void turnLeft() {
        System.out.println("Turn left!");
    }


    @Override
    public String toString() {
        return String.format("Car brand: " + carBrand
                + ", car class: " + carClass
                + ", weight: " + weight
                + " tons. %n" + engine + " %n" + driver);
    }
}
