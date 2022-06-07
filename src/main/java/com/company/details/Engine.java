package com.company.details;

public class Engine {
    public String manufacturer;
    public double power;

    public Engine (String m, double p) {
        this.manufacturer = m;
        this.power = p;
    }

    @Override
    public String toString() {
    return String.format("Engine: manufacturer - " + manufacturer + ", power - " + power + ".");
    }
    }

