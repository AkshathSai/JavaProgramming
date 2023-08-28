package com.example.dev.java8.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExampleSalaryIncrement {

    public static void main(String[] args) {

        ArrayList<Employee> al = new ArrayList<Employee>();
        populate(al);

        System.out.println("Before Increment: ");
        System.out.println(al);

        //Check which employee is having salary less than 20000
        Predicate<Employee> p = e -> e.getSalary()<20000;

        //Increment Salary by 5447
        Function<Employee, Employee> f = e -> {
          e.salary = e.salary + 5477;
          return e;
        };

        ArrayList<Employee> al2 = new ArrayList<Employee>();
        for (Employee e: al) {
            if(p.test(e)) {
                f.apply(e);
                al2.add(e);
            }
        }

        System.out.println(al);
        System.out.println("Employees whose salary Incremented:");
        System.out.println(al2);

    }

    private static void populate(ArrayList<Employee> al) {
        al.add(new Employee("Akshath", 1000000));
        al.add(new Employee("Vinay", 50000));
        al.add(new Employee("Akhil", 40000));
        al.add(new Employee("Varshith", 18000));
    }

}
