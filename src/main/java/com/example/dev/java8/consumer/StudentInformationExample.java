package com.example.dev.java8.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInformationExample {

    public static void main(String[] args) {

        ArrayList<Student> al = new ArrayList<Student>();
        populate(al);

        //Conditional check to enforce marks of student are greater than 60
        Predicate<Student> p = s -> s.marks>=60;

        //Function to return Grade based on marks
        Function<Student, String> f = s -> {
            int marks = s.marks;

            if(marks>=80) {
                return "A[Distinction]";
            } else if (marks>=60) {
                return "B[First Class]";
            } else if (marks>=50) {
                return "C[Second Class]";
            } else if (marks>=35) {
                return "D[Third Class]";
            } else {
                return "E[Failed]";
            }
        };

        //Accept the student information and print in console
        Consumer<Student> c = s -> {
            System.out.println("Name: " + s.name);
            System.out.println("Marks: " + s.marks);
            System.out.println("Grade: " + f.apply(s));
        };

        for (Student s: al) {
            if (p.test(s)) {
                c.accept(s);
            }
        }

    }

    private static void populate(ArrayList<Student> al) {
        al.add(new Student("Akshath", 95));
        al.add(new Student("Bunny", 32));
        al.add(new Student("Charishma", 80));
        al.add(new Student("Susmitha", 75));
        al.add(new Student("Vinay", 63));
        al.add(new Student("Varshith", 47));
        al.add(new Student("Yathin", 91));
    }

}
