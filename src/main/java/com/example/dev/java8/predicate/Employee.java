package com.example.dev.java8.predicate;

public class Employee {

    String name;
    String designation;
    double salary;
    String location;

    public Employee(String name, String designation, double salary, String location) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.location = location;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f %s", name, designation, salary, location);
    }

    @Override
    public boolean equals(Object obj) {

        Employee e = (Employee)obj;

        if(name.equals(e.name) && designation.equals(e.designation) && salary==e.salary && location.equals(e.location)) {
            return true;
        } else {
            return false;
        }

    }

}
