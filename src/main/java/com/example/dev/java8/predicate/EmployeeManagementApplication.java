package com.example.dev.java8.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeManagementApplication {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<Employee>();
        populate(list);

        Predicate<Employee> p1 = emp -> emp.designation.equals("Manager");
        System.out.println("Managers Information:");
        display(p1, list);

        Predicate<Employee> p2 = emp -> emp.location.equals("Bangalore");
        System.out.println("Employees living near Bangalore:");
        display(p2, list);

        Predicate<Employee> p3 = emp -> emp.salary < 20000;
        System.out.println("Employees receiving salary less than 20000");
        display(p3, list);

        System.out.println("All Managers from Bangalore to give Pink slip:");
        display(p1.and(p2), list);

        System.out.println("All Mangers or Salary less than 20000:");
        display(p1.or(p3), list);

        System.out.println("Employees who are not Managers:");
        display(p1.negate(), list);

        Predicate<Employee> isCEO = Predicate.isEqual(new Employee("Akshath","CEO",30000000,"Bangalore"));

        Employee e1 = new Employee("Akshath", "CEO", 30000000, "Bangalore");
        Employee e2 = new Employee("Akshath", "Full Stack Developer", 30000000, "Bangalore");
        Employee e3 = new Employee("Charishma", "CEO", 30000000, "Bangalore");

        System.out.println(isCEO.test(e1));//true
        System.out.println(isCEO.test(e2));//false
        System.out.println(isCEO.test(e2));//false

    }

    private static void display(Predicate<Employee> p1, ArrayList<Employee> list) {

        for (Employee e: list) {
            if(p1.test(e)) {
                System.out.println(e);
            }
        }
        System.out.println("**************************************");
    }

    private static void populate(ArrayList<Employee> list) {

        list.add(new Employee("Akshath", "CEO", 30000000,"Bangalore"));
        list.add(new Employee("Charishma", "Tech lead", 2800000,"Bangalore"));
        list.add(new Employee("Vinay", "Scrum Master", 2200000,"Bangalore"));
        list.add(new Employee("Susmitha", "Manager", 2100000,"Hyderabad"));
        list.add(new Employee("Kaushik", "Manager", 2100000,"Bangalore"));
        list.add(new Employee("Yathin", "Frontend Developer", 1500000,"Hyderabad"));
        list.add(new Employee("Varshith", "Junior Developer", 18000,"Bangalore"));
        list.add(new Employee("Prashanthi", "HR", 19000,"Bangalore"));
        list.add(new Employee("Bhagyasri", "Supply Chain", 18000,"Hyderabad"));

    }

}
