package com.learn.java.xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutputDemo {

    public static void main(String[] args) throws FileNotFoundException {
        File employeeInfoFile = new File("C:\\JavaIO\\EmployeeInfo.txt");
        InputOutputDemo demo = new InputOutputDemo();
        demo.writeToFile(employeeInfoFile);
        File animalInfo = new File("C:\\JavaIO\\AnimalInfo.txt");
        demo.readFile(animalInfo);
    }

    public void writeToFile(File fileToWrite) {
        PrintWriter employeeInfoWrite = null;
        try {
            employeeInfoWrite = new PrintWriter(fileToWrite);
            employeeInfoWrite.println("Saraswati");
            employeeInfoWrite.println("21");
        } catch (FileNotFoundException e) {
            System.out.println("Given file was not found on the local disk" + fileToWrite.getName());
            throw new RuntimeException(e);
        } finally {
            employeeInfoWrite.close(); // to release resources and prevent memory leaks
        }
    }

    public void readFile (File fileToRead) throws FileNotFoundException {
        Scanner input = new Scanner((fileToRead));
        while (input.hasNext()) {
            System.out.println("Line read from the input file: " + input.nextLine());
                    }
    }
}
