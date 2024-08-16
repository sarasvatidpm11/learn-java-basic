package com.learn.java.oop.abstraction;

public class ShapeUtility {

    public static void main(String[] args) {
        Shape circle = new Circle();
        float areaOfCircle = circle.area();
        circle.displayArea(areaOfCircle);
    }
}
