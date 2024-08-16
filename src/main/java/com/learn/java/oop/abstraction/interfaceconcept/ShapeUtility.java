package com.learn.java.oop.abstraction.interfaceconcept;

public class ShapeUtility {

    public static void main(String[] args) {
        Shape.testStaticMethod();
        Shape circle = new Circle();
        float areaOfCircle = circle.area();
        System.out.println("Area of a circle is " + areaOfCircle);
        Shape square = new Square();
        System.out.println("Area of a square is " + square.area());
    }
}
