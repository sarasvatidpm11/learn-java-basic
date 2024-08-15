package com.learn.java;

public class Calculator {

    public Integer multiply(Integer num1, Integer num2)
    {
        num1 = 10; //tidak akan berpengaruh
        return num1*num2;
    }

    //overloading method
    public Integer multiply(Integer num1, Integer num2, Integer num3)
    {
        return num1*num2*num3;
    }

    public static void main(String[] args) {
        Calculator calObject = new Calculator();
        Integer resultCal = calObject.multiply(5,7);
        System.out.println("The result is = " + resultCal);

        //Coba call by value
        int num1 = 5;
        int num2 = 6;
        System.out.println("Printing num1 before passing it by value = " + num1);
        Integer resultTestCallValue = calObject.multiply(num1, num2);
        System.out.println("Printing num1 after passing it by value to add method = " + num1);
        System.out.println("The result using call by value is = " + resultTestCallValue);

        //coba overloading
        Integer resultTestOverloading = calObject.multiply(2,3,4);
        System.out.println("The result using overloading method is = " + resultTestOverloading);
    }
}
