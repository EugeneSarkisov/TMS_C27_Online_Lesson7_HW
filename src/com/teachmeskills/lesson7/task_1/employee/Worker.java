package com.teachmeskills.lesson7.task_1.employee;

/**
 * This class contain constructor for "Worker" objects.
 */

public class Worker implements IShowAppointment{
    int positionID;
    String name;
    String surname;
    int age;
    int hireYear;
    double salary;
    String workArea;

    public Worker(int positionID, String name, String surname, int age, int hireYear, double salary, String workArea) {
        this.positionID = positionID;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.hireYear = hireYear;
        this.salary = salary;
        this.workArea = workArea;
    }

    @Override
    public void showAppointment(int id) {
        if(id == positionID){
            System.out.println(name + " " + surname + " as worker.");
        } else {
            System.out.println("Incorrect ID");
        }
    }
}
