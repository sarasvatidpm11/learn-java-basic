package com.learn.java.oop.inheritance.hierarchicalandmultilevel;

public class VehicleManagement {

    public static void main(String[] args) {
        Car hyundai = new Car();
        Car inova = new Car();
        hyundai.numberOfWheels = 4;
        hyundai.color = "white";

        Motorcycle scoopy = new Motorcycle();
        Motorcycle vario = new Motorcycle();
        scoopy.numberOfWheels = 2;
        scoopy.color = "brown";

        hyundai.move();
        scoopy.move();
    }
}
