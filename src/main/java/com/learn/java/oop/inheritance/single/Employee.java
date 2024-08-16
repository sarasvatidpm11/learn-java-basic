package com.learn.java.oop.inheritance.single;

public class Employee extends Manager {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.salary = 10000;
        System.out.println("Salary of employee is = " + employee.salary);

        Manager manager = new Manager();
        manager.salary = 10000;
        System.out.println("Salary of manager is = " + manager.salary);
    }
}
