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
        Car car1 = new Car("BMW", "crossower", 5, engine, driver);
        System.out.println(car1);
        car1.start();
        System.out.println();

        Engine engine2 = new Engine("Bosch", 3.6);
        Car car2 = new SportCar("BMW", 3, 220, engine2, driver);
        System.out.println(car2);
        car2.stop();
        System.out.println();

        Engine engine3 = new Engine("Bosch", 3.6);
        Car car3 = new Lorry("BMW", 7, 6, engine3, driver);
        System.out.println(car3);
        car3.turnRight();
        System.out.println();

    }
}
