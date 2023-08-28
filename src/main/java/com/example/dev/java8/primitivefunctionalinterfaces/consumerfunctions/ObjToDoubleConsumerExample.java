package com.example.dev.java8.primitivefunctionalinterfaces.consumerfunctions;

import java.util.ArrayList;
import java.util.function.ObjDoubleConsumer;

public class ObjToDoubleConsumerExample {

    public static void main(String[] args) {

        ArrayList<Employee> al = new ArrayList<Employee>();
        populate(al);

        ObjDoubleConsumer<Employee> c = (e, d) -> e.esalary = e.esalary + d;

        for (Employee e: al) {
            c.accept(e, 50000.0);
            System.out.println(e.ename);
            System.out.println(e.esalary);
        }

    }

    private static void populate(ArrayList<Employee> al) {
        al.add(new Employee("Akshath", 25000.0));
    }

}
