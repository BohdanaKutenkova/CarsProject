package com.company.professions;

import com.company.entities.Person;

public class Driver extends Person {
    public int driverExperience;

    public Driver (String n, int a, String s, long ph, int ex) {
        this.name = n;
        this.age = a;
        this.sex = s;
        this.phoneNumber = ph;
        this.driverExperience = ex;
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
