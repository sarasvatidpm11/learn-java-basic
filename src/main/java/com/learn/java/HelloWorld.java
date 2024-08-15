package com.learn.java;

public class HelloWorld {
    Integer instanceVariable; //dideklarasikan di class, bergantung pada object, memiliki default value
    static Integer staticVariable = 30; //dideklarasikan di class, value tidak berubah dari inisiasi pertama kali, bergantung pada program

    //synchronized itu untuk thread, ketika banyak thread ingin mengakses fungsi ini maka salah satunya harus menunggu
    private synchronized void nonStaticTest() {
        Integer localVariable = 20; //dideklarasikan di method, constructor & block, tidak memiliki default value & harus di dideklarasikan sebelum pertama kali digunakan
        System.out.println("Non static method");
    }

    public static void staticTest() {
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        HelloWorld helloWorldObject1 = new HelloWorld();
        helloWorldObject1.instanceVariable = 40;
        HelloWorld helloWorldObject2 = new HelloWorld();
        helloWorldObject2.instanceVariable = 50;

        HelloWorld.staticVariable = 100; //untuk class level, 1 class 1 point

        System.out.println("Hello World!!");
        helloWorldObject1.nonStaticTest();
        staticTest();
    }
}
