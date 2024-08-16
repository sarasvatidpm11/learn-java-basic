package com.learn.java.oop.abstraction.interfaceconcept;

interface Shape extends TestInterface {

    abstract float area();
    static void testStaticMethod() {
        System.out.println("In testStaticMethod in Shape");
    }

    default public void displayArea(float area) {
        System.out.println("Printing area of a shape " + area);
    }

    private void privateMethod() {

    }
}
