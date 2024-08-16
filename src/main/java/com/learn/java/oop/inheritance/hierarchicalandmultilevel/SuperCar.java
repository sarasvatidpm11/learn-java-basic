package com.learn.java.oop.inheritance.hierarchicalandmultilevel;

//multilevel inheritance
public class SuperCar extends Car {

    public void turbo() {
        System.out.println("Your car is now moving very fast");
    }

    public void changeWheels() {
        numberOfWheels = 4;
        behaviorSpecificToCar();
    }
}
