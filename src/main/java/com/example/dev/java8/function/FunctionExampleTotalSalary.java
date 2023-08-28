package com.example.dev.java8.function;

import java.util.ArrayList;
import java.util.function.Function;

public class FunctionExampleTotalSalary {

    public static void main(String[] args) {

        ArrayList<Employee> al = new ArrayList<Employee>();
        populate(al);

        Function<ArrayList<Employee>, Double> f = e -> {

            double total = 0;

            for (Employee emp: e) {
                total = total + emp.getSalary();
            }

            return total;

        };

        System.out.println("The total salary of all the employees this month: "+ f.apply(al));

    }

    private static void populate(ArrayList<Employee> al) {

        al.add(new Employee("Akshath", 1000000));
        al.add(new Employee("Vinay", 50000));
        al.add(new Employee("Akhil", 40000));

    }

}
