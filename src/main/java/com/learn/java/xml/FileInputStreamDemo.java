package com.learn.java.xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// FileInputStream is used to read raw data from a file in byte form.
// It is often used to read binary or text files byte-by-byte.
public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException {
        FileInputStreamDemo fileInputStreamDemo = new FileInputStreamDemo();
        fileInputStreamDemo.readFromFile("C:\\JavaIO\\foodInfo.txt");
    }

    private void readFromFile(String fileToRead) throws IOException {
        FileInputStream inputStream = new FileInputStream(fileToRead);
        int integerReadFromFile;
        // read() will read one byte from the file and return it as an integer value.
        // If there is no more data to read then this method will return -1.
        while ((integerReadFromFile = inputStream.read()) != -1) {
            // Casting (char) is used to display the character representation of the byte
            System.out.println("Character read from the file is " +(char)integerReadFromFile);
        }
    }
}
