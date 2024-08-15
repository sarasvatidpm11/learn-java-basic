package com.learn.java;

public class AccessModifierTest {
    public static void main(String[] args) {
        HelloWorld helloWorldObject = new HelloWorld();
        //helloWorldObject.nonStaticTest(); //pasti error karena fungsi nonStaticTest menggunakan modifier private
    }
}
