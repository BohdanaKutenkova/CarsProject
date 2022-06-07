package com.company.details;

public class Engine {
    public String manufacturer;
    public double power;

    public Engine(String manufacturer, double power) {
        this.manufacturer = manufacturer;
        this.power = power;


    }

    @Override
    public String toString() {
        return String.format("Engine: manufacturer - " + manufacturer + ", power - " + power + ".");
    }
}

