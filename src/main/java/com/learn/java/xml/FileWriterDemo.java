package com.learn.java.xml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// FileWriter is lower level than PrintWriter and is often used to write characters directly.
public class FileWriterDemo {

    public static void main(String[] args) throws IOException {
        FileWriterDemo fileWriterDemo = new FileWriterDemo();
        File foodInfoFile = new File("C:\\JavaIO\\FoodInfo.txt");
        fileWriterDemo.writeToFile(foodInfoFile);
    }

    private void writeToFile(File fileToWriteTo) throws IOException {
        FileWriter foodInfoWriter = new FileWriter(fileToWriteTo);
        foodInfoWriter.write("Burger, Pizza, Salad");
        foodInfoWriter.flush(); // to ensure that data written to the buffer will be immediately moved to the file.
        foodInfoWriter.close(); // to release resources and prevent memory leaks
    }
}
