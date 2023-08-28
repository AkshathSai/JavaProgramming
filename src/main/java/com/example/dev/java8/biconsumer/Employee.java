package com.example.dev.java8.biconsumer;

public class Employee {

    String ename;
    double employeeSalary;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public Employee(String ename, double employeeSalary) {
        this.ename = ename;
        this.employeeSalary = employeeSalary;
    }
}
