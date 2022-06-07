package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class AutoRide {
    public static void main(String[] args) {
        Driver driver = new Driver("Bohdana Kozak", 25, "female", 911, 8);
        Engine engine = new Engine("Bosch", 1.6);
        Car car1 = new Car("BMW", "crossower", 3, engine, driver);

        System.out.println(car1);

        car1.start();
        System.out.println();

        Driver driver1 = new Driver("Bohdana Kozak", 25, "female", 911, 8);
        Engine engine2 = new Engine("Bosch", 1.6);
        SportCar car2 = new SportCar("BMW", 3, engine, 220, driver);

        System.out.println(car2);

        car2.start();
        System.out.println();
    }
}
