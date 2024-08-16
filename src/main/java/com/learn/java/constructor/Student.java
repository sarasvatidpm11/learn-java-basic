package com.learn.java.constructor;

public class Student {

    String names;
    int ages;
    String addreses;

    //constructor without parameter (default constructor)
    public Student () {
        names = "Student";
        ages = 0;
    }

    //constructor with parameter (parameterized constructor)
    public Student (String name, int age) {
        names = name;
        ages = age;
    }

    //constructor overloading
    //this keyword used as reference variable to the current object, usually used when the instance/local
    //variable name is the same as the parameter, can be passing as parameter
    public Student (String name, int age, String address) {
        this.names = name;
        this.ages = age;
        this.addreses = address;
    }

    //constructor chaining -> pass parameter through a different constructor
    public Student (String name) {
        this(name,0);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Name: " + student1.names + ", Age: " + student1.ages);

        Student student2 = new Student("Saraswati", 21);
        System.out.println("Name: " + student2.names + ", Age: " + student2.ages);

        Student student3 = new Student("Dharma", 21);
        System.out.println("Name: " + student3.names + ", Age: " + student3.ages + ", Address: " + student3.addreses);
    }
}
