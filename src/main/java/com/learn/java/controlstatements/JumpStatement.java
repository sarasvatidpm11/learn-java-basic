package com.learn.java.controlstatements;

public class JumpStatement {

    public static void main(String[] args) {

        //using break statement
        for(int i = 0; i <= 10; i++) {
            if(i==5){
                break;
            }
            System.out.println("Numbers = " + i);
        }

        System.out.println("\n");

        for(int j = 0; j <= 10; j++) {
            if(j==5){
                continue;
            }
            System.out.println("Numbers = " + j);
        }

    }
}
