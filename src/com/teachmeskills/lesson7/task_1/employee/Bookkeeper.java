package com.teachmeskills.lesson7.task_1.employee;

/**
 * This class contain constructor for "Bookkeeper" objects.
 */

public class Bookkeeper implements IShowAppointment{

    int positionID;
    String name;
    String surname;
    int age;
    int hireYear;
    double salary;
    String education;

    public Bookkeeper(int positionID, String name, String surname, int age, int hireYear, double salary, String education) {
        this.positionID = positionID;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.hireYear = hireYear;
        this.salary = salary;
        this.education = education;
    }

    @Override
    public void showAppointment(int id) {
        if(id == positionID){
            System.out.println(name + " " + surname + " as bookkeeper.");
        } else {
            System.out.println("Incorrect ID");
        }
    }
}
