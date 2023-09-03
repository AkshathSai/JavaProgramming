package com.example.dev.inheritance;

public class Employee extends Person {

    private String title;
    private String salary;

    public Employee(String name, String title) {
        super(name);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Title - [%s] Salary - [%s] ", title, salary);
    }
}
