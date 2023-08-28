package com.example.dev.java8.bifunction;

public class Timesheet {

    private int eno;
    private int days;

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Timesheet(int eno, int days) {
        this.eno = eno;
        this.days = days;
    }
}
