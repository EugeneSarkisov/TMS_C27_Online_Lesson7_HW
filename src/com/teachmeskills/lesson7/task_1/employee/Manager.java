package com.teachmeskills.lesson7.task_1.employee;

import java.util.Scanner;

/**
 * This class contain constructor for "Manager" objects.
 */

public class Manager implements IShowAppointment {

    int positionID;
    String name;
    String surname;
    int age;
    int hireYear;
    double salary;
    int staff;

    public Manager(int positionID, String name, String surname, int age, int hireYear, double salary, int staff) {
        this.positionID = positionID;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.hireYear = hireYear;
        this.salary = salary;
        this.staff = staff;
    }

    @Override
    public void showAppointment(int id) {
        if(id == positionID){
            System.out.println(name + " " + surname + " as manager.");
        } else {
            System.out.println("Incorrect ID");
        }
    }
}
