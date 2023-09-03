package com.example.dev.inheritance;

public class Student extends Person {

    private String course;

    public Student(String name, String course) {
        super(name);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" course - [%s] ", course);
    }

}
