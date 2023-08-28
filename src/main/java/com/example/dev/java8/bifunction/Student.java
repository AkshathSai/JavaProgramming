package com.example.dev.java8.bifunction;

public class Student {

    private String name;
    private int rollno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
}
