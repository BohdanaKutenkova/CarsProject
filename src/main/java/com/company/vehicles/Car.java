package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    public String carBrand;
    public String carClass;
    public int weight;

    public Car (String br, String cl, int w) {
        this.carBrand = br;
        this.carClass = cl;
        this.weight = w;
    }

    Driver d1 = new Driver("Bohdana Kozak", 25, "female", 911, 8);
    Engine e1 = new Engine("Bosch", 1.6);

    public void start() {
        System.out.println("Let's go");
    } ;

    public void stop() {
        System.out.println("Stop");
    };

    public void turnRight() {
        System.out.println("Turn right");
    };

    public void turnLeft() {
        System.out.println("Turn left");
    };

    @Override
    public String toString() {
        return String.format("Car brand - " + carBrand
                + ", car class - " + carClass
                + ", weight - " + weight
                + " tons. %n" + e1 + " %n" + d1);
    }
}
