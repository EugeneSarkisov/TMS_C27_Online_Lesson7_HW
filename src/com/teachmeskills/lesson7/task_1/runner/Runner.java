package com.teachmeskills.lesson7.task_1.runner;

import com.teachmeskills.lesson7.task_1.employee.Bookkeeper;
import com.teachmeskills.lesson7.task_1.employee.Manager;
import com.teachmeskills.lesson7.task_1.employee.Worker;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Manager mn = new Manager(1, "Andrew", "Gardner", 45, 2010, 1000.0, 8);
        Bookkeeper bk = new Bookkeeper(2, "Nikolas", "Frost", 34,
                2009, 600.0, "BSU");
        Worker wk = new Worker(3, "Oleg", "Radkovsky", 54,
                2005, 800.0, "Restricted Area");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position ID: ");
        mn.showAppointment(scanner.nextInt());
        System.out.print("Enter the position ID: ");
        bk.showAppointment(scanner.nextInt());
        System.out.print("Enter the position ID: ");
        wk.showAppointment(scanner.nextInt());
        scanner.close();
    }
}
