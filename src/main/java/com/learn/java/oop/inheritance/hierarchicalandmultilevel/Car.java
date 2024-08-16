package com.learn.java.oop.inheritance.hierarchicalandmultilevel;

//hierarchical inheritance
public class Car extends Vehicle {

    @Override
    public void move() {
        System.out.println("Move in car class");
    }

    public void behaviorSpecificToCar() {
        System.out.println("Your car open the hood");
    }

}
