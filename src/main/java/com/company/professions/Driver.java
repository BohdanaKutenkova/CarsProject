package com.company.professions;

import com.company.entities.Person;

public class Driver extends Person {
    public int driverExperience;

    public Driver(String name, int age, String sex, long phoneNumber, int driverExperience) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.driverExperience = driverExperience;
    }

    @Override
    public String toString() {
        return String.format("Driver name - " + name +
                ", age - " + age + ", sex - " + sex +
                ", phone number - " + phoneNumber +
                ", driver experience - " + driverExperience +
                " years.");
    }
}
