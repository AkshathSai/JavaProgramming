package com.example.dev.java8.biconsumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class EmployeeSalaryIncrement {

    public static void main(String[] args) {

        ArrayList<Employee> l = new ArrayList<Employee>();
        BiFunction<String, Double, Employee> biFunction = (e, s) -> new Employee(e, s);

        l.add(biFunction.apply("Akshath", 50000.00));
        l.add(biFunction.apply("Varsha", 25000.00));

        BiConsumer<Employee, Double> biConsumer = (e, increment) -> e.employeeSalary = e.employeeSalary+increment;
        for (Employee e: l) {
            biConsumer.accept(e, 500.00);
        }

        BiConsumer<String, Double> biConsumer2 = (e, s) -> System.out.println(e + " " + s);
        for (Employee e: l) {
            biConsumer2.accept(e.ename, e.employeeSalary);
        }

    }

}
