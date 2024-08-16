package com.learn.java.oop.polymorphism;

public class HeadDepartment extends Dosen {

    String position;

    public void display (long nip, long salary) {
        System.out.println("Your NIP is : " + nip + ", Your salary is : " + salary);
        System.out.println("Welcome to Fakultas Teknik dan Kejuduan Undiksha!");
    }

    //super keyword berguna untuk mengambil instance variable (namun tidak di override,
    //method, and constructor from parent class
    public void printPosition() {
        position = "Head of Department";
        System.out.println(position);
        System.out.println(super.position);
    }
}
