package com.learn.java.handlingexception;

public class HandlingException {

    public static void main(String[] args) throws Exception  { //if we want to throws it for my collar to handle it (can have multiple exception)
        int denominator = 0;
        int[] integerArray = {1, 2, 3};
        try {
            if(denominator == 0) {
                throw new CustomException("Denominator is Zero");
            }
            System.out.println(29 / denominator);
            try {
                System.out.println(integerArray[3]);
            } catch (NullPointerException e) {
                System.out.println("Null pointer exception handler");
            }
            System.out.println("this code will not execute if exception occurs in inner try block");
        } catch (ArithmeticException exception) {
            System.out.println("Printing any kind of arithmetic exception occurred = " +exception.getMessage());
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("ArrayIndexOutOfBoundsException handler");
        //} catch (Exception e) {
            //System.out.println("Generic exception handler"); //if we want to handler
        } finally {
            System.out.println("Finally block under execution");
        }
    }
}
