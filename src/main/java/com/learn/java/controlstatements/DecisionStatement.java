package com.learn.java.controlstatements;

public class DecisionStatement {

    //if else
    public Integer Subtract(Integer num1, Integer num2)
    {
        if (num1 > num2) {
            return num1 - num2;
        }
        else {
            return num2 - num1;
        }
    }

    //switch case
    public static void Value() {
        int value = 80;
        switch (value) {
            case 90:
                System.out.println("Nilai Anda A");
                break;
            case 80:
                System.out.println("Nilai Anda B");
                break;
            case 70:
                System.out.println("Nilai Anda C");
                break;
            default:
                System.out.println("Anda belum mengikuti ujian: " + value);
        }
    }


    public static void main(String[] args) {
        DecisionStatement calAdd = new DecisionStatement();
        Integer result = calAdd.Subtract(2, 10);
        System.out.println("The result is = " + result);

        Value();
    }
}
