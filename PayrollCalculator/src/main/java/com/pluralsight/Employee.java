package com.pluralsight;

public class Employee {

    // storing the employee's info
    // private = only accessible within this class
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    // generated constructor, creating an "Employee" object
    public Employee(int employeeId, String name, double hoursWorked, double payRate) {

        // setting the employeeId
        this.employeeId = employeeId;
        // setting the name
        this.name = name;
        // setting the hoursWorked
        this.hoursWorked = hoursWorked;
        // setting the payRate
        this.payRate = payRate;
    }

    // getting gross pay
    public double getGrossPay() {
        // generating getters and setters
        // getters reads the value of private variable
        // setters allows you to change value of private variable
        return this.getHoursWorked() * this.getPayRate();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
