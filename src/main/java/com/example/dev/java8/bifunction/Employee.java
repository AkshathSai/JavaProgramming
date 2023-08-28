package com.example.dev.java8.bifunction;

public class Employee {

    private int eno;
    private String ename;
    private double dailyWage;

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(double dailyWage) {
        this.dailyWage = dailyWage;
    }

    public Employee(int eno, String ename, double dailyWage) {
        this.eno = eno;
        this.ename = ename;
        this.dailyWage = dailyWage;
    }
}
