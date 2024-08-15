package com.learn.java.string;

public class stringOperations {
    public static void main(String[] args) {
        String s1 = "Magang";
        String s2 = "Magaug";
        String s3 = " ";
        String s4 = "Makan";
        int i = 100;

        System.out.println(s1.compareTo(s2)); //comparing one string to another string (s1-s2)
        System.out.println(s1.length()); //length of string
        System.out.println(s1.substring(2)); //getting part of the string
        System.out.println(s3.isEmpty()); //check string is empty or not
        System.out.println(String.valueOf(i)); //converts different data types to string
        String replace = s1.replace('a', 'e'); //replacing character in string
        System.out.println(replace);
        System.out.println(replace.contains("a")); //searches character in the string
        System.out.println(s2.equals(s4)); //compares two strings on the basis of the content of the string
        System.out.println(s4.toUpperCase()); //changing style of the string
        System.out.println(s4.charAt(4)); //return the character in specific index on the string
        System.out.println(s4.endsWith("p")); //checks the last characters on the string 
    }
}
