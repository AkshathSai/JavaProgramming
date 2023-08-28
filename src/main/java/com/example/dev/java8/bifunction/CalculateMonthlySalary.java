package com.example.dev.java8.bifunction;

import java.util.function.BiFunction;

public class CalculateMonthlySalary {

    public static void main(String[] args) {

        BiFunction<Employee, Timesheet, Double> biFunction = (e, t) -> e.getDailyWage() * t.getDays();

        Employee e = new Employee(101, "Akshath", 8000);
        Timesheet t = new Timesheet(101, 28);

        System.out.println("Employee Monthly Salary :" + biFunction.apply(e, t));
    }

}
