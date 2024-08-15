package com.learn.java.string;


//StringBuffer similar to StringBuilder, the aim is to mutable string
//Differences: StringBuffer thread safe, suitable for multi threads, StringBuffer is synchronized class,
// performance is slower than StringBuilder
public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Undiksha");
        StringBuffer s2 = s1.append(" Buleleng");
        StringBuffer s3 = s2.append(" Bali");

        //nilainya akan sama dengan karena merujuk pada object sama dan bersifat mutable
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1);

        //insert new string at given position
        s1.insert(0, "Aku dari ");
        System.out.println(s1);


        StringBuffer s4 = new StringBuffer("Java Basic");

        //replaces string from the specified begin index to the end index as passed to method
        s4.replace(5, 10, "basic");
        System.out.println(s4);

        //deletes stringsfrom the specified begin index to the end index as passed to method
        s4.delete(4, 10);
        System.out.println(s4);

        //reverses character of the string
        System.out.println(s4.reverse());

        //capacity of the StringBuffer (string data types = 16 bit + length string)
        System.out.println(s4.capacity());
    }
}
