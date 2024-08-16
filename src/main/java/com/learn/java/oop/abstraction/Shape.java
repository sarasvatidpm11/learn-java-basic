package com.learn.java.oop.abstraction;

public abstract class Shape {

    abstract float area();

    public void displayArea(float area) {
        System.out.println("Printing area of a shape " + area);
    }
}
