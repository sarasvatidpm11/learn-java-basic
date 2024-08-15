package com.learn.java.string;

public class stringMemoryAllocation {

    public static void main(String[] args) {
        String s1 = "Magang";

        System.out.println("Original String = " + s1);
        s1 = s1.concat(" Dimata");
        System.out.println("After concatenation String = " + s1);
    }
}
