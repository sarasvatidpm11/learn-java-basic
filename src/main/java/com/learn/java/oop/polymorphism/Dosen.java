package com.learn.java.oop.polymorphism;

import com.learn.java.HelloWorld;

public class Dosen {

    long nip;
    long salary;
    String position = "Dosen";

    //penggunaan super keyword dalam tingkat constructor
    Dosen() {
        System.out.println("We are within the constructor of super class Dosen");
    }

    public void display (long nip) {
        System.out.println("Your NIP is : " + nip);
    }

    //Overloading method
    public void display (long nip, long salary) {
        System.out.println("Your NIP is : " + nip + ", Your salary is : " +salary);
    }

    public static void main(String[] args) {
        //dynamic binding/dynamic polymorphism
        HeadDepartment headSains = new HeadDepartment();
        Dosen dosen1 = headSains;
        Dosen dosen2 = new Dosen();

        dosen1.display(1345689027, 10000000);
        dosen2.display(1456890273, 7000000);

        headSains.printPosition();


    }
}
