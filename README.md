# TMS_C27_Online_Lesson7_HW
Homework for the seven lesson

task1 
We created a classes "Bookkeeper, Manager, Worker" with some fields.
Next, we created one interface with method "showAppointment", then we implement this interface in all three classes. 
With the scanner, we input the "appointmentID" in console and get the name of appointment.
Test scenario: 
-call method "showAppointment" for objects bk (Bokkeeper), mn (Manager), wk (Worker);
-input the "appointmentID" in console (for mn - 1, for bk - 2, for wk - 3).

task2 
We created an abtract class "Figure" with the two common fileds for all future figures: "sideCount" and "Shape".
Next, we inherited three classes from "Figure" class - "Circle", "Rectangle", "Triangle". They have their own fileds.
With the three abstract methods, wich we override in inherited classes, we created a logic for calculating perimeter, 
calculating square and showing info about figures. 
Then in class "Runner" we created five "Figure" objects and put they in array. 
Test scenario: 
-call method "showInfo" for all objects with the foreach-loop;
-with foreach-loop sum all figures perimeter in one variable and sout it in console.
