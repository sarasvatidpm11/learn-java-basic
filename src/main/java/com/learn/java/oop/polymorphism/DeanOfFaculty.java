package com.learn.java.oop.polymorphism;

import com.learn.java.oop.inheritance.single.Employee;

import javax.management.DescriptorKey;

public class DeanOfFaculty extends Dosen {

    DeanOfFaculty() {

    }

    @Override
    public void display (long nip, long salary) {
        System.out.println("Your NIP is : " + nip + ", Your salary is : " +salary);
        System.out.println("Welcome to Fakultas Teknik dan Kejuduan Undiksha!");
    }

    public static void main(String[] args) {
        DeanOfFaculty dean = new DeanOfFaculty();
        Dosen deanFTK = dean;
        Dosen dosen1 = new Dosen();

        dean.display(1234567890, 10000000);
        dosen1.display(0, 0);
    }
}
