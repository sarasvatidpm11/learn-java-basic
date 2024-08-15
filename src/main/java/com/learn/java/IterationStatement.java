package com.learn.java;

public class IterationStatement {

    public static void main(String[] args) {
        //for loop
        for(int i = 0; i <= 10; i++) {
            System.out.println("Numbers = " + i);
        }

        System.out.println("\n");

        //while loop
        int j = 10;
        while(j > 5){
            System.out.println("My numbers = " + j);
            j--;
        }

        System.out.println("\n");

        //do while loop
        int k = 5;
        do {
            System.out.println("Nums = " + k);
            k--;
        } while (k > 1 && k < 5);
    }

}
