package com.learn.java.xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// FileOutputStream is used to write raw data (bytes) to a file.
// This class is generally used to write binary files,
// but can also be used to write text files by converting the string to a byte array first.
public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        FileOutputStreamDemo fileOutputStreamDemo = new FileOutputStreamDemo();
        fileOutputStreamDemo.writeToFile(new File("C:\\JavaIO\\Diary.txt"));
    }

    private void writeToFile(File file) throws FileNotFoundException, IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        // write() is used to write data to a file.
        // In this case, the string is converted into a byte array, and this byte array is written to the file.
        fileOutputStream.write("Hello, today I am very happy because I can hangout with my bf".getBytes());
        fileOutputStream.close(); // close() is used to avoid data may not be saved correctly and files may be locked or corrupted
    }
}
