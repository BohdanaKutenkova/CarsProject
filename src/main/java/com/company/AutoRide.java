package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;

public class AutoRide {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", "crossower", 3);
        System.out.println(c1);

        c1.start();
        System.out.println();
    }
}
